/*
 * generated by Xtext 2.11.0
 */
package de.cooperateproject.modeling.textual.component.ui;

import com.google.inject.Injector;
import de.cooperateproject.modeling.textual.component.ui.internal.ComponentActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ComponentExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return ComponentActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return ComponentActivator.getInstance().getInjector(ComponentActivator.DE_COOPERATEPROJECT_MODELING_TEXTUAL_COMPONENT_COMPONENT);
	}
	
}
