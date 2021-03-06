package de.cooperateproject.ui.diff.action;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.resource.ImageDescriptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Action that allows user to decide if he wants the diff view to update if the textual diagram changes.
 * @author czogalik
 *
 */
public class LiveToggleAction extends Action implements IToggleAction {
    
    private static final String ENABLE_TOOLTIP = "Enable Live Transformation";
    private static final String DISABLE_TOOLTIP = "Disable Live Transformation";

    private static final String IMAGE_URI = "platform:/plugin/org.eclipse.ui/icons/full/elcl16/synced.png";
    
    private boolean toggleAutoUpdate = true;
    
    private static final Logger LOGGER = LoggerFactory.getLogger(LiveToggleAction.class);
    
    /**
     * Action that allows user to decide if he wants the diff view to update if the textual diagram changes.
     */
    public LiveToggleAction() {
        super("", IAction.AS_CHECK_BOX);
        setImageDescriptor(getImage(IMAGE_URI));
        setToolTipText(DISABLE_TOOLTIP);
        setChecked(true);
    }

    @Override
    public void run() {
        toggleAutoUpdate = !toggleAutoUpdate;
        if (toggleAutoUpdate) {
            setToolTipText(DISABLE_TOOLTIP);
        } else {
            setToolTipText(ENABLE_TOOLTIP);
        }
    }
    
    private static ImageDescriptor getImage(String path) {
        URL url = null;
        try {
            url = new URL(path);
        } catch (MalformedURLException e) {
            LOGGER.error(e.getMessage());
        }
        return ImageDescriptor.createFromURL(url);
    }

    @Override
    public boolean isLiveActivated() {
        return toggleAutoUpdate;
    }
}
