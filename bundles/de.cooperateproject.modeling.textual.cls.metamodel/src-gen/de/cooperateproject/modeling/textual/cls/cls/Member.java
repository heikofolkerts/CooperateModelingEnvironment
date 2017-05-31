/**
 */
package de.cooperateproject.modeling.textual.cls.cls;

import org.eclipse.uml2.uml.Feature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.Member#getOwner <em>Owner</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.Member#isStatic <em>Static</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getMember()
 * @model abstract="true"
 * @generated
 */
public interface Member<T extends Feature> extends Property<T> {
    /**
     * Returns the value of the '<em><b>Owner</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.cooperateproject.modeling.textual.cls.cls.Classifier#getMembers <em>Members</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owner</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owner</em>' container reference.
     * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getMember_Owner()
     * @see de.cooperateproject.modeling.textual.cls.cls.Classifier#getMembers
     * @model opposite="members" required="true" transient="false" changeable="false"
     * @generated
     */
    Classifier<?> getOwner();

    /**
     * Returns the value of the '<em><b>Static</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Static</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Static</em>' attribute.
     * @see #setStatic(boolean)
     * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getMember_Static()
     * @model unique="false"
     * @generated
     */
    boolean isStatic();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.Member#isStatic <em>Static</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Static</em>' attribute.
     * @see #isStatic()
     * @generated
     */
    void setStatic(boolean value);

} // Member
