/*
 * generated by Xtext
 */
package de.cooperateproject.modeling.textual.activity;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class ActivityUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return de.cooperateproject.modeling.textual.activity.ui.internal.ActivityActivator.getInstance().getInjector("de.cooperateproject.modeling.textual.activity.Activity");
	}

}
