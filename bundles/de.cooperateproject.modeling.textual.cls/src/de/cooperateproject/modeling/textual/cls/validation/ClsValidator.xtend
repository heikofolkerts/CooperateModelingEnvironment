/*
 * generated by Xtext
 */
package de.cooperateproject.modeling.textual.cls.validation

import de.cooperateproject.modeling.textual.cls.cls.Attribute
import de.cooperateproject.modeling.textual.cls.cls.Class
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage
import de.cooperateproject.modeling.textual.cls.cls.DataTypeReference
import de.cooperateproject.modeling.textual.cls.cls.Interface
import de.cooperateproject.modeling.textual.cls.cls.Method
import de.cooperateproject.modeling.textual.cls.cls.Property
import de.cooperateproject.modeling.textual.cls.cls.TypeReference
import de.cooperateproject.modeling.textual.cls.cls.UMLTypeReference
import org.eclipse.uml2.uml.NamedElement
import org.eclipse.uml2.uml.Type
import org.eclipse.uml2.uml.TypedElement
import org.eclipse.xtext.validation.Check
import org.eclipse.uml2.uml.Operation

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class ClsValidator extends AbstractClsValidator {

	public static val NO_CLASS_REFERENCE = 'no_class_reference'
	public static val NO_INTERFACE_REFERENCE = 'no_interface_reference'
	public static val NO_PROPERTY_REFERENCE = 'no_property_reference'
	public static val WRONG_PROPERTY_TYPE = 'wrong_property_type'
	public static val NO_OPERATION_REFERENCE = 'no_operation_reference'

	@Check
	def checkIfClassExists(Class classifier) {
		if (classifier.referencedElement.model == null) {
			error("No Referenced UML-Class Element", ClsPackage.eINSTANCE.UMLReferencingElement_ReferencedElement,
				NO_CLASS_REFERENCE)
		}
	}

	@Check
	def checkIfInterfaceExists(Interface classifier) {
		if (classifier.referencedElement.model == null) {
			error("No Referenced UML-Interface Element", ClsPackage.eINSTANCE.UMLReferencingElement_ReferencedElement,
				NO_INTERFACE_REFERENCE)
		}
	}

	@Check
	def checkIfPropertyExists(Attribute attribute) {
		if (attribute.referencedElement.model == null) {
			error("No Referenced UML-Property", ClsPackage.eINSTANCE.UMLReferencingElement_ReferencedElement,
				NO_PROPERTY_REFERENCE)
		} 
	}
	
	@Check
	def checkCorrectPropertyType(Property<? extends NamedElement> property) {
		if (!property.hasCorrectType) {
			error("Wrong Type", ClsPackage.eINSTANCE.property_Type, WRONG_PROPERTY_TYPE)
		}
	}
	
	private static def hasCorrectType(Property<? extends NamedElement> property) {
		val umlReferencedElement = property.referencedElement
		var Type umlType = null
		if (umlReferencedElement instanceof TypedElement) {
			umlType = umlReferencedElement.type
		} else if (umlReferencedElement instanceof Operation) {
			umlType = umlReferencedElement.type
		}
		return property.type.matches(umlType)
	}
	
	private static def matches(TypeReference clsType, Type umlType) {
			if (clsType instanceof DataTypeReference) {
				var type = clsType.type
				var refType = TypeConverter.getPrimitive(umlType)
				return type.equals(refType)
			} else if (clsType instanceof UMLTypeReference) {
				var type = clsType.type
				return type.name.equals(umlType.name)
			} else if (clsType == null) {
				return umlType == null
			}
			return true
	}

	@Check
	def checkIfOperationExists(Method method) {
		if (method.referencedElement.model == null) {
			error("No Referenced UML-Operation", ClsPackage.eINSTANCE.UMLReferencingElement_ReferencedElement,
				NO_OPERATION_REFERENCE)
		}
	}
}
