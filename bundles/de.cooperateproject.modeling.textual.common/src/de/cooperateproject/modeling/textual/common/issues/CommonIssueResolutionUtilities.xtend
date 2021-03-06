package de.cooperateproject.modeling.textual.common.issues

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Visibility
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.uml2.uml.NamedElement
import org.eclipse.uml2.uml.UMLPackage
import org.eclipse.uml2.uml.VisibilityKind

class CommonIssueResolutionUtilities {
	
	public static def hasReferencedElement(UMLReferencingElement<?> element) {
		return element !== null && element.referencedElement !== null
	}
	
	public static def hasReferencedElementOfType(UMLReferencingElement<?> element, Class<?> type) {
		element.hasReferencedElement && type.isInstance(element.referencedElement)
	}
	
	static def hasValidParent(EObject element, EClass parentType) {
        var parent = element.eContainer
        return (parent !== null && parentType.isInstance(parent))
    }
	
	public static def setVisibility(NamedElement element, Visibility visibility) {
		val convertedVisibility = visibility.convert
		if (convertedVisibility === null) {
			element.eUnset(UMLPackage.eINSTANCE.namedElement_Visibility)
		} else {
			element.visibility = convertedVisibility	
		}
	}
	
	public static def convert(Visibility visibility) {
		switch (visibility) {
			case PACKAGE: VisibilityKind.PACKAGE_LITERAL
			case PRIVATE: VisibilityKind.PRIVATE_LITERAL
			case PROTECTED: VisibilityKind.PROTECTED_LITERAL
			case PUBLIC: VisibilityKind.PUBLIC_LITERAL
			case UNDEFINED: null
		}
	}
	
	public static def convert(Cardinality cardinality) {
		var leftLower = cardinality.lowerBound
		var leftUpper = cardinality.upperBound
		if (cardinality.upperBound == 0) {
			leftUpper = leftLower
		}
		if (leftLower == -1 && leftUpper == -1) {
			leftLower = 0
		}
		return Pair.of(leftLower, leftUpper)
	}
}
