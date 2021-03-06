package de.cooperateproject.ui.focus.internal.utils;

import java.util.Arrays;
import java.util.Optional;

import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.ui.focus.internal.views.FocusView;
import de.cooperateproject.ui.startup.IStartupAction;

public class ViewInitializerStartupAction implements IStartupAction {

    private static final Logger LOGGER = LoggerFactory.getLogger(ViewInitializerStartupAction.class);

    @Override
    public void run() {
        Optional<IWorkbenchWindow> workbenchWindow = getWorkbenchWindow();
        Optional<IWorkbenchPage> workbenchPage = getPage(workbenchWindow);
        workbenchPage.ifPresent(ViewInitializerStartupAction::initView);
    }

    private static Optional<IWorkbenchPage> getPage(Optional<IWorkbenchWindow> workbenchWindow) {
        return Optional.ofNullable(workbenchWindow.map(IWorkbenchWindow::getActivePage)
                .orElseGet(() -> workbenchWindow.map(IWorkbenchWindow::getPages).map(Arrays::asList)
                        .flatMap(pages -> pages.stream().findFirst()).orElse(null)));
    }

    private static Optional<IWorkbenchWindow> getWorkbenchWindow() {
        return Optional
                .ofNullable(Optional.ofNullable(PlatformUI.getWorkbench()).map(IWorkbench::getActiveWorkbenchWindow)
                        .orElse(Optional.ofNullable(PlatformUI.getWorkbench()).map(IWorkbench::getWorkbenchWindows)
                                .flatMap(w -> Arrays.asList(w).stream().findFirst()).orElse(null)));
    }

    private static void initView(IWorkbenchPage activePage) {
        Display.getDefault().asyncExec(() -> {
            try {
                activePage.showView(FocusView.ID, null, IWorkbenchPage.VIEW_CREATE);
            } catch (PartInitException e) {
                LOGGER.warn("Failed to create {}", FocusView.ID, e);
            }
        });
    }

}
