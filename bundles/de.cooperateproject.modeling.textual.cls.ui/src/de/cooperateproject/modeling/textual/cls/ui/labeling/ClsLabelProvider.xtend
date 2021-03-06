/*
 * generated by Xtext
 */
package de.cooperateproject.modeling.textual.cls.ui.labeling

import com.google.inject.Inject
import de.cooperateproject.modeling.textual.cls.cls.Association
import de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd
import de.cooperateproject.modeling.textual.cls.cls.Attribute
import de.cooperateproject.modeling.textual.cls.cls.Class
import de.cooperateproject.modeling.textual.cls.cls.ClassDiagram
import de.cooperateproject.modeling.textual.cls.cls.Generalization
import de.cooperateproject.modeling.textual.cls.cls.Implementation
import de.cooperateproject.modeling.textual.cls.cls.Interface
import de.cooperateproject.modeling.textual.cls.cls.Method
import de.cooperateproject.modeling.textual.cls.cls.Package
import de.cooperateproject.modeling.textual.cls.cls.Parameter
import de.cooperateproject.modeling.textual.cls.cls.Property
import de.cooperateproject.modeling.textual.cls.cls.XtextAssociation
import de.cooperateproject.modeling.textual.cls.cls.XtextAssociationMemberEndReferencedType
import java.util.Collection
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import de.cooperateproject.ui.outline.UMLImage
import de.cooperateproject.ui.outline.CooperateOutlineLabelProvider

/**
 * Provides labels for Cls Objects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
class ClsLabelProvider extends CooperateOutlineLabelProvider {

    @Inject
    new(AdapterFactoryLabelProvider delegate) {
        super(delegate)
    }

    def image(ClassDiagram ele) {
        return UMLImage.MODEL.image
    }

    def text(Class ele) {
        return ele.name
    }

    def text(Method ele) {
        var text = text(ele as Property)
        if (text.contains(":")) {
            text = text.replaceAll(":", "():")
        } else {
            text += "()"
        }
        return text
    }

    def text(Property ele) {
        val typeRef = ele.type
        var type = ""
        if (typeRef !== null) {
            type = ": " + typeRef.doGetText
        }
        ele.name + type
    }

    def image(Class ele) {
        UMLImage.CLASS.image
    }

    def image(Interface ele) {
        UMLImage.INTERFACE.image
    }

    def image(Attribute ele) {
        UMLImage.PROPERTY.image.decorate(ele.visibility)
    }

    def image(Parameter ele) {
        UMLImage.PARAMETER.image.decorate(ele.visibility)
    }

    def image(Method ele) {
        UMLImage.OPERATION.image.decorate(ele.visibility)
    }

    def text(Association ele) {
        if (ele.memberEnds.size == 2) {
            val left = ele.memberEnds.get(0).text
            val right = ele.memberEnds.get(1).text
            return left + " " + ele.name + " " + right
        }
        return ele.name
    }

    def image(Association ele) {
        var img = UMLImage.ASSOCIATION.image
        if (ele.memberEnds.size == 2) {
            val aggregationKind = ele.memberEnds.get(0).aggregationKind
            img = switch aggregationKind {
                case COMPOSITION: UMLImage.ASSOCIATION_COMPOSITE.image
                case AGGREGATION: UMLImage.ASSOCIATION_SHARED.image
                default: img
            }
        }
        return img
    }

    def text(AssociationMemberEnd ele) {
        return ele.name ?: ele.type.name
    }

    def image(AssociationMemberEnd ele) {
        UMLImage.PROPERTY.image
    }

    def text(Generalization ele) {
        val leftChild = ele.left;
        val rightChild = ele.right;
        leftChild.doGetText + " is a " + rightChild.doGetText
    }

    def image(Generalization ele) {
        return UMLImage.GENERALIZATION.image
    }

    def text(Implementation ele) {
        val leftChild = ele.left;
        val rightChild = ele.right;
        leftChild.doGetText + " implements " + rightChild.doGetText
    }

    def image(Implementation ele) {
        return UMLImage.INTERFACE_REALIZATION.image
    }

    def image(Package pkg) {
        return UMLImage.PACKAGE.image
    }

    def text(XtextAssociationMemberEndReferencedType typeReference) {
        val association = typeReference.eContainer as XtextAssociation
        val index = association.memberEndTypes.indexOf(typeReference)
        val name = association.memberEndNames.tryGet(index)
        val typeName = association.memberEndTypes.tryGet(index)?.type?.getText
        val cardinality = association.memberEndCardinalities.tryGet(index)
        var txt = String.format("%s : %s", name ?: "unnamed", typeName)
        if (cardinality !== null) {
            txt += String.format(" [%s]", cardinality.getText)
        }
        return txt
    }

    def image(XtextAssociationMemberEndReferencedType typeReference) {
        return UMLImage.PROPERTY
    }

    private static def <T> T tryGet(Collection<T> collection, int i) {
        if (collection.size > i) {
            return collection.get(i)
        }
        return null
    }

}
