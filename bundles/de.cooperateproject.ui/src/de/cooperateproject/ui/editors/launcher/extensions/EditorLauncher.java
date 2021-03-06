package de.cooperateproject.ui.editors.launcher.extensions;

import java.io.Closeable;
import java.io.IOException;
import java.util.Optional;

import org.apache.commons.lang3.Validate;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.cdo.explorer.checkouts.CDOCheckout;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.net4j.util.io.IOUtil;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.cdo.util.connection.CDOConnectionManager;
import de.cooperateproject.ui.editors.launcher.DisposedListener;
import de.cooperateproject.ui.editors.launcher.extensions.TransformationManager.TransformationException;
import de.cooperateproject.ui.launchermodel.Launcher.ConcreteSyntaxModel;
import de.cooperateproject.ui.launchermodel.Launcher.Diagram;
import de.cooperateproject.ui.launchermodel.helper.ConcreteSyntaxTypeNotAvailableException;
import de.cooperateproject.ui.launchermodel.helper.LauncherModelHelper;

/**
 * Base class for editor launchers that use CDO resources as inputs.
 * 
 * This class handles
 * <ul>
 * <li>the creation of CDO sessions and views</li>
 * <li>parsing of the selected launcher file</li>
 * <li>triggering of transformations on save events</li>
 * </ul>
 */
public abstract class EditorLauncher implements IEditorLauncher {

    private static final Logger LOGGER = LoggerFactory.getLogger(EditorLauncher.class);
    private final CDOCheckout cdoCheckout;
    private final CDOView cdoView;
    private final ConcreteSyntaxModel concreteSyntaxModel;
    private final IFile launcherFile;
    private final TransformationManager transformationManager;
    private Optional<IPartListener2> disposeListener = Optional.empty();

    /**
     * Instantiates the editor launcher.
     * 
     * @param launcherFile
     *            The selected launcher file that contains the information about the diagram to open.
     * @param editorType
     *            The type of the selected editor.
     * @param readOnlyView
     *            True if the editor shall be opened read-only, false otherwise.
     * @throws IOException
     *             In case of an error while reading and interpreting the launcher file.
     * @throws ConcreteSyntaxTypeNotAvailableException
     *             Thrown, if the requested editor type is not available in the launcher file.
     */
    public EditorLauncher(IFile launcherFile, EditorType editorType, boolean readOnlyView)
            throws IOException, ConcreteSyntaxTypeNotAvailableException {
        cdoCheckout = CDOConnectionManager.getInstance().createCDOCheckout(launcherFile.getProject(), true);
        cdoCheckout.open();
        cdoView = cdoCheckout.openView(readOnlyView);
        this.launcherFile = launcherFile;
        Diagram launcherModel = loadDiagram(cdoView, launcherFile);
        concreteSyntaxModel = launcherModel.getConcreteSyntaxModel(editorType.getSupportedSyntaxModel());
        transformationManager = new TransformationManager(cdoCheckout);
    }

    @Override
    public IEditorPart openEditor() throws PartInitException {
        IEditorPart newEditorPart = doOpenEditor();
        registerListener(newEditorPart);
        return newEditorPart;
    }

    protected abstract IEditorPart doOpenEditor() throws PartInitException;

    protected CDOView getCDOView() {
        return cdoView;
    }

    protected CDOCheckout getCDOCheckout() {
        return cdoCheckout;
    }

    protected ConcreteSyntaxModel getConcreteSyntaxModel() {
        return concreteSyntaxModel;
    }

    protected IFile getLauncherFile() {
        return launcherFile;
    }

    protected void registerListener(IEditorPart editorPart) {
        Validate.notNull(editorPart);

        disposeListener = createDisposeListener(editorPart);
        disposeListener.ifPresent(editorPart.getSite().getPage()::addPartListener);
    }

    protected Optional<IPartListener2> createDisposeListener(IEditorPart editorPart) {
        return Optional.of(new DisposedListener(editorPart, this::editorClosed));
    }

    protected void editorClosed(IWorkbenchPage p) {
        Validate.notNull(p);

        disposeListener.ifPresent(p::removePartListener);
        disposeListener = Optional.empty();

        cdoCheckout.close();
        CDOConnectionManager.getInstance().deleteCDOCheckout(cdoCheckout);
    }

    protected void handleEditorSave(IEditorPart editorPart) {
        Validate.notNull(editorPart);

        try {
            transformationManager.handleEditorSave(editorPart.getEditorInput());
        } catch (TransformationException e) {
            // TODO inform user
            LOGGER.error("Failed to handle editor save event.", e);
        }
    }

    private static Diagram loadDiagram(CDOView cdoView, IFile launcherFile) throws IOException {
        Validate.notNull(cdoView);
        return LauncherModelHelper.loadDiagram(cdoView.getResourceSet(), launcherFile);
    }

    protected static LauncherModelWrapper loadLauncherModelReadOnly(IFile launcherFile) throws IOException {
        return new LauncherModelWrapper(launcherFile);
    }

    protected static class LauncherModelWrapper implements Closeable {

        private final CDOView cdoView;
        private final Diagram launcherDiagram;

        public LauncherModelWrapper(IFile launcherFile) throws IOException {
            cdoView = openCDOView(launcherFile.getProject());
            try {
                launcherDiagram = loadDiagram(cdoView, launcherFile);
            } catch (Exception e) {
                closeCDOView(cdoView);
                throw e;
            }
        }

        public Diagram getDiagram() {
            return launcherDiagram;
        }

        @Override
        public void close() throws IOException {
            closeCDOView(cdoView);
        }

        private static CDOView openCDOView(IProject project) {
            CDOSession session = CDOConnectionManager.getInstance().acquireSession(project);
            try {
                return session.openView();
            } catch (Exception e) {
                CDOConnectionManager.getInstance().releaseSession(session);
                throw e;
            }
        }

        private static void closeCDOView(CDOView cdoView) {
            Optional<CDOSession> cdoSession = Optional.ofNullable(cdoView).map(CDOView::getSession);
            IOUtil.closeSilent(cdoView);
            cdoSession.ifPresent(CDOConnectionManager.getInstance()::releaseSession);
        }

    }

}
