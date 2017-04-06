package de.cooperateproject.modeling.textual.usecase.issues

import de.cooperateproject.modeling.textual.usecase.usecase.NamedElement
import de.cooperateproject.modeling.textual.usecase.usecase.UMLReferencingElement
import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage
import org.eclipse.uml2.uml.Element

class UsecaseUMLReferencingElementMissingElementFactory extends UsecaseAutomatedIssueResolutionFactoryBase<UMLReferencingElement<Element>> {
	
	private static val ISSUE_CODE = "referencedUMLElementMissing"
	
	new() {
		super(ISSUE_CODE, new UsecaseUMLReferencingElementMissingElementChecker(), UMLReferencingElement as Class<?> as Class<UMLReferencingElement<Element>>)
	}
	
	override protected hasIssueInternal(UMLReferencingElement<Element> element) {
		// TODO add exception here after implementing #55
        return element.referencedElement === null;
	}
	
	override protected createInternal(UMLReferencingElement<Element> element) {
		new UsecaseUMLReferencingElementMissingElementResolution(element, resolvableChecker)
	}
	
	override protected getResolutionNameInternal(UMLReferencingElement<Element> element) {
		"Create UML element";
	}
	
	override protected getIssueDescriptionInternal(UMLReferencingElement<Element> element) {
		"The UML element does not exist yet.";
	}
	
    override getIssueFeatureInternal(UMLReferencingElement<Element> eObject) {
        eObject.relevantFeature
    }
    
    protected def dispatch relevantFeature(NamedElement element) {
    	UsecasePackage.Literals.NAMED_ELEMENT__NAME
    }
    
    protected def dispatch relevantFeature(Element element) {
    	UsecasePackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT
    }
	
}