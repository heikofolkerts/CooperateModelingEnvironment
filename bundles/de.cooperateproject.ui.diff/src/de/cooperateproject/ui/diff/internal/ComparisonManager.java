package de.cooperateproject.ui.diff.internal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.CDOObjectReference;
import org.eclipse.emf.cdo.common.branch.CDOBranch;
import org.eclipse.emf.cdo.common.commit.CDOCommitHistory;
import org.eclipse.emf.cdo.common.commit.CDOCommitInfo;
import org.eclipse.emf.cdo.common.commit.CDOCommitInfoManager;
import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.emf.cdo.common.revision.CDOIDAndVersion;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.util.CDOURIUtil;
import org.eclipse.emf.cdo.util.CDOUtil;
import org.eclipse.emf.cdo.util.InvalidURIException;
import org.eclipse.emf.cdo.util.ObjectNotFoundException;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.net4j.util.io.IOUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import de.cooperateproject.cdo.util.connection.CDOConnectionManager;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.IDerivedStateProcessor;
import de.cooperateproject.ui.editors.launcher.extensions.EditorType;
import de.cooperateproject.ui.launchermodel.Launcher.ConcreteSyntaxModel;
import de.cooperateproject.ui.launchermodel.Launcher.Diagram;
import de.cooperateproject.ui.launchermodel.helper.LauncherModelHelper;

/**
 * Provides functions for receiving information about commits from a resource.
 * 
 * @author Jasmin, czogalik
 *
 */
public class ComparisonManager {

    /**
     * The .cooperate diagram file, on which we are working.
     */
    private final IFile currentFile;

    /**
     * Timeout in milliseconds for the waiting time while loading the CDOCommitHistory.
     */
    private static final long LOADING_TIMEOUT = 8000;
    private static final Logger LOGGER = LoggerFactory.getLogger(ComparisonManager.class);

    /**
     * Constructor, sets the file on which the CommitManager should work.
     * 
     * @param file
     *            the file to be set
     */
    public ComparisonManager(IFile file) {
        currentFile = file;
    }

    /**
     * Returns all commits found in CDO Repository from the current file.
     * 
     * @return a set containing all commits
     */
    public Set<CDOCommitInfo> getAllCommitInfos() {
        if (currentFile != null) {
            return findAllCommits();
        }
        return new HashSet<>();
    }

    /**
     * Returns all commits from today until the given date as found in CDO Repository from the
     * current file.
     * 
     * @param dateMillis
     *            the given date in milliseconds
     * @return a set containing all commits in the time span
     */
    public Set<CDOCommitInfo> getAllCommitInfos(long dateMillis) {
        Set<CDOCommitInfo> commitInfosTemp = getAllCommitInfos();
        commitInfosTemp.removeIf(info -> info.getTimeStamp() < dateMillis);

        return commitInfosTemp;
    }

    /**
     * Computes the comparison of the commit and returns it.
     *
     * @return The computed comparison
     */
    public Comparison getComparison(CDOView previousView, CDOView currentView) {
        initStateOfObjects(previousView, currentView);
        return compareStrict(getResource(currentView), getResource(previousView));
    }

    /**
     * Gets the resource of the textual diagram in the commit's current version.
     * 
     * @param commit
     *            the commit info of the commit
     * @param currentView
     *            the current view on the diagram
     * @return the corresponding resource
     */
    public CDOResource getResource(CDOView currentView) {
        ConcreteSyntaxModel concreteSyntaxModel = getConcreteSyntaxModel(currentView);
        if (concreteSyntaxModel == null) {
            return null;
        }
        EObject rootElement = concreteSyntaxModel.getRootElement();
        URI rootURI = EcoreUtil.getURI(rootElement);
        String resourcePath = CDOURIUtil.extractResourcePath(rootURI);
        try {
            return currentView.getResource(resourcePath);
        } catch (InvalidURIException e) {
            LOGGER.trace(e.getMessage(), e);
            return null;
        }
    }

    private void initStateOfObjects(CDOView previousView, CDOView currentView) {
        initStateOfObject(previousView, getResourceCDOId(previousView));
        initStateOfObject(currentView, getResourceCDOId(currentView));
    }

    private static void initStateOfObject(CDOView view, CDOID cdoid) {
        CDOObject cdoObject = getCDOObjectById(view, cdoid);
        if (cdoObject == null) {
            return;
        }
        String nsURI = cdoObject.eClass().getEPackage().getNsURI();

        Optional<IDerivedStateProcessor> extension = DerivedStateCalculatorRegistry.INSTANCE.getExtension(nsURI);
        if (extension.isPresent()) {
            IDerivedStateProcessor prevDerivedStateProcessor = extension.get();
            prevDerivedStateProcessor.initState(cdoObject, true);
        }
    }

    private static CDOObject getCDOObjectById(CDOView view, CDOID cdoid) {
        try {
            return view.getObject(cdoid);
        } catch (Exception e) {
            LOGGER.warn(e.getMessage(), e);
            return null;
        }
    }

    private static Comparison compareStrict(Resource resource, Resource resource2) {
        IComparisonScope scope = new DefaultComparisonScope(resource, resource2, null);
        return EMFCompare.builder().setDiffEngine(new DefaultDiffEngineExtension()).build().compare(scope);
    }

    private CDOID getResourceCDOId(CDOView view) {
        ConcreteSyntaxModel textModel = getConcreteSyntaxModel(view);
        if (textModel == null) {
            return null;
        }
        return getResourceCDOId(textModel);
    }

    private CDOID getResourceCDOId(CDOSession session) {
        CDOView view = null;
        try {
            view = session.openView();
            return getResourceCDOId(view);
        } finally {
            IOUtil.closeSilent(view);
        }
    }

    /**
     * Finds all commits on the selected .cooperate-file and stores all cdoIds of the changed
     * objects in the Map cdoIds.
     * 
     * @return all commits on the selected .cooperate-file.
     */
    private Set<CDOCommitInfo> findAllCommits() {
        IProject project = currentFile.getProject();
        CDOSession session = CDOConnectionManager.getInstance().acquireSession(project);

        Set<CDOCommitInfo> commitInfos = new HashSet<>();

        commitInfos.addAll(getCommitsFromMainBranch(session, getFirstCommitTimeStamp(session)));

        CDOConnectionManager.getInstance().releaseSession(session);
        return commitInfos;
    }

    private long getFirstCommitTimeStamp(CDOSession session) {
        CDOView view = null;
        try {
            view = session.openView();
            CDOID resourceCDOId = getResourceCDOId(view);
            return view.getRevision(resourceCDOId).getTimeStamp();
        } finally {
            IOUtil.closeSilent(view);
        }
    }

    private static CDOID getResourceCDOId(ConcreteSyntaxModel textModel) {
        CDOObject textRoot = CDOUtil.getCDOObject(textModel.getRootElement());
        CDOResource cdoResource = textRoot.cdoResource();
        if (cdoResource == null) {
            return null;
        }
        return cdoResource.cdoID();
    }

    private List<CDOCommitInfo> getCommitsFromMainBranch(CDOSession session, long timeStamp) {
        CDOCommitInfoManager commitManager = session.getCommitInfoManager();
        CDOBranch mainBranch = session.getBranchManager().getMainBranch();
        CDOCommitHistory mainHistory = commitManager.getHistory(mainBranch);

        mainHistory.waitWhileLoading(LOADING_TIMEOUT);

        return getCommitsByTime(session, mainBranch, mainHistory, timeStamp);
    }

    private List<CDOCommitInfo> getCommitsByTime(CDOSession session, CDOBranch mainBranch, CDOCommitHistory mainHistory,
            long timeStamp) {
        List<CDOCommitInfo> commitInfos = new ArrayList<>();

        for (int i = 0; i < mainHistory.size() - 1; i++) {
            CDOCommitInfo commitInfo = mainHistory.getElement(i);

            if (isTimeStampValid(commitInfo, timeStamp)) {
                break;
            }

            CDOCommitInfo previousCommitInfo = mainHistory.getElement(i + 1);
            CDOView previousState = null;
            CDOView currentState = null;
            try {
                previousState = session.openView(mainBranch, previousCommitInfo.getTimeStamp());
                currentState = session.openView(mainBranch, commitInfo.getTimeStamp());

                if (doChangedObjectsExists(getResourceCDOId(session), previousState, currentState, commitInfo)) {
                    commitInfos.add(commitInfo);
                }
            } finally {
                IOUtil.closeSilent(previousState);
                IOUtil.closeSilent(currentState);
            }
        }
        filterCreateDiagramCommit(commitInfos);
        return commitInfos;
    }

    private static void filterCreateDiagramCommit(List<CDOCommitInfo> commitInfos) {
        if (!commitInfos.isEmpty()) {
            commitInfos.remove(commitInfos.size() - 1);
        }
    }

    private ConcreteSyntaxModel getConcreteSyntaxModel(CDOView view) {
        try {
            Diagram launcherModel = LauncherModelHelper.loadDiagram(view.getResourceSet(), currentFile);
            return launcherModel.getConcreteSyntaxModel(EditorType.TEXTUAL.getSupportedSyntaxModel());
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
        return null;
    }

    private static boolean isTimeStampValid(CDOCommitInfo commitInfo, long firstCommitTimeStamp) {
        boolean isFirstCommitTimeStampGreater = commitInfo.getTimeStamp() < firstCommitTimeStamp;
        boolean isPreviousTimeStampInvalid = commitInfo.getPreviousTimeStamp() == CDOCommitInfo.INVALID_DATE;

        return isFirstCommitTimeStampGreater || isPreviousTimeStampInvalid;
    }

    private static boolean doChangedObjectsExists(CDOID resourceCDOId, CDOView previousState, CDOView currentState,
            CDOCommitInfo commitInfo) {
        Set<CDOID> changeCDOIds = getChangedObjectsId(commitInfo);

        addXRefOfChangedObjects(previousState, changeCDOIds);

        return !changedTextualObjects(resourceCDOId, previousState, currentState, changeCDOIds).isEmpty();
    }

    private static void addXRefOfChangedObjects(CDOView previousState, Set<CDOID> changeCDOIds) {
        List<CDOObjectReference> queryXRefs = getCDOObjectReferenceFromChangedObjects(previousState, changeCDOIds);

        Set<CDOID> queryXRefsIds = queryXRefs.stream().map(CDOObjectReference::getSourceID).collect(Collectors.toSet());
        changeCDOIds.addAll(queryXRefsIds);
    }

    private static Set<CDOID> changedTextualObjects(CDOID resourceCDOId, CDOView previousState, CDOView currentState,
            Set<CDOID> changeCDOIds) {
        return changeCDOIds.stream().filter(object -> parentMatches(object, resourceCDOId, previousState, currentState))
                .collect(Collectors.toSet());
    }

    private static List<CDOObjectReference> getCDOObjectReferenceFromChangedObjects(CDOView previousState,
            Set<CDOID> changeCDOIds) {
        List<CDOObjectReference> queryXRefs = new ArrayList<>();
        for (CDOID id : changeCDOIds) {
            if (id == null) {
                continue;
            }
            try {
                queryXRefs.addAll(previousState.queryXRefs(previousState.getObject(id)));
            } catch (ObjectNotFoundException e) {
                LOGGER.trace(e.getMessage(), e);
            }
        }
        return queryXRefs;
    }

    private static Set<CDOID> getChangedObjectsId(CDOCommitInfo commitInfo) {
        List<CDOIDAndVersion> changedObjects = Lists.newArrayList(Iterables.concat(commitInfo.getNewObjects(),
                commitInfo.getDetachedObjects(), commitInfo.getChangedObjects()));

        return changedObjects.stream().map(CDOIDAndVersion::getID).collect(Collectors.toSet());
    }

    /**
     * Checks if the Object with objectId really belongs to the textual model.
     * 
     * @param objectId
     *            the CDOID of the object to be examined
     * @param parentId
     *            the CDOID of the textual model/resource
     * @param previousView
     *            the previous view of the commit
     * @param currentView
     *            the current view of the commit
     * @return true if it belongs to the textual model, false if not
     */
    private static boolean parentMatches(CDOID objectID, CDOID parentID, CDOView previousView, CDOView currentView) {
        boolean ret = checkParentMatching(objectID, parentID, previousView);
        if (!ret) {
            return checkParentMatching(objectID, parentID, currentView);
        }
        return ret;
    }

    /**
     * Checks if the Object with objectId really belongs to the textual model.
     * 
     * @param objectId
     *            the CDOID of the object to be examined
     * @param parentId
     *            the CDOID of the textual model/resource
     * @param view
     *            the view in which the object is examined
     * @return true if it belongs to the textual model, false if not
     */
    private static boolean checkParentMatching(CDOID objectID, CDOID parentID, CDOView view) {
        try {
            CDOObject object = view.getObject(objectID);
            return object.cdoResource().cdoID().equals(parentID);
        } catch (ObjectNotFoundException e) {
            LOGGER.trace(e.getMessage(), e);
        }
        return false;
    }

}
