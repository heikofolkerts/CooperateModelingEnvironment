package de.cooperateproject.modeling.textual.cls.derivedstate.initializer;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.INITIALIZATION;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;

import de.cooperateproject.modeling.textual.cls.cls.Implementation;
import de.cooperateproject.modeling.textual.cls.cls.TypedConnector;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;

/**
 * Initializes the state of {@link Implementation} elements.
 */
@Applicability(applicabilities = INITIALIZATION)
public class ImplementationInitializer extends AtomicDerivedStateProcessorBase<Implementation>
        implements TypedConnectorInitializerMixin {

    /**
     * Instantiates the initializer.
     */
    public ImplementationInitializer() {
        super(Implementation.class);
    }

    @Override
    protected void applyTyped(Implementation object) {
        if (object.getReferencedElement() != null) {
            InterfaceRealization umlGeneralization = object.getReferencedElement();
            BehavioredClassifier specific = umlGeneralization.getImplementingClassifier();
            Interface general = umlGeneralization.getContract();
            initTypedConnector(object, specific, general);
        }
    }

    @Override
    public Collection<Class<? extends EObject>> getReplacements() {
        return Arrays.asList(TypedConnector.class);
    }

}
