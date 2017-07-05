/*
 * generated by Xtext 2.12.0
 */
package de.cooperateproject.modeling.textual.sequence.ui.internal;

import com.google.inject.Inject;
import com.google.inject.Injector;
import de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage;
import de.cooperateproject.modeling.textual.xtext.runtime.ui.injectingfactory.IInjectorProvider;
import org.eclipse.emf.ecore.EPackage;

/**
 * Language-specific injector provider.
 */
public class SequenceInjectorProvider implements IInjectorProvider {

    @Inject
    private Injector injector;

    @Override
    public EPackage getEPackage() {
        return SequencePackage.eINSTANCE;
    }

    @Override
    public Injector getInjector() {
        return injector;
    }

}
