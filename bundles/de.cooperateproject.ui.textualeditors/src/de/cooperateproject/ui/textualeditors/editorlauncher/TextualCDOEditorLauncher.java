package de.cooperateproject.ui.textualeditors.editorlauncher;

import java.io.IOException;
import java.util.Optional;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.cdo.eresource.CDOResourceLeaf;
import org.eclipse.emf.cdo.internal.ui.CDOLobEditorInput;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.net4j.util.io.IOUtil;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

import de.cooperateproject.ui.editors.launcher.extensions.ConcreteSyntaxTypeNotAvailableException;
import de.cooperateproject.ui.editors.launcher.extensions.EditorLauncher;
import de.cooperateproject.ui.editors.launcher.extensions.EditorType;

public class TextualCDOEditorLauncher extends EditorLauncher {

	private CDOTransaction cdoTransaction;

	public TextualCDOEditorLauncher(IFile launcherFile, EditorType editorType)
			throws IOException, ConcreteSyntaxTypeNotAvailableException {
		super(launcherFile, editorType);
	}

	@Override
	protected IEditorPart doOpenEditor() throws PartInitException {
		CDOResourceLeaf cdoResource = (CDOResourceLeaf) getConcreteSyntaxModel().getRootElement().eResource();
		cdoTransaction = cdoResource.cdoView().getSession().openTransaction();
		cdoResource = (CDOResourceLeaf) cdoTransaction.getObject(cdoResource.cdoID());

		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		IEditorInput editorInput = new CDOLobEditorInput(cdoResource);
		Optional<TextualCDOEditorIDs> editorId = getEditorId();
		if (!editorId.isPresent()) {
			throw new PartInitException("Could not find appropriate editor.");
		}
		return IDE.openEditor(page, editorInput, editorId.get().getId());
	}

	@Override
	protected void editorClosed(IWorkbenchPage p) {
		IOUtil.closeSilent(cdoTransaction);
		super.editorClosed(p);
	}

	private Optional<TextualCDOEditorIDs> getEditorId() {
		return TextualCDOEditorIDs.findByExtension(getConcreteSyntaxModel().getExtension());
	}

}
