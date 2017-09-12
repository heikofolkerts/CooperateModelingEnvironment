package de.cooperateproject.modeling.transformation.usecase;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class UsecaseActivator extends Plugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "de.cooperateproject.modeling.transformation.usecase";

	// The shared instance
	private static UsecaseActivator plugin;
	
	/**
	 * The constructor
	 */
	public UsecaseActivator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.Plugins#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static UsecaseActivator getDefault() {
		return plugin;
	}

}