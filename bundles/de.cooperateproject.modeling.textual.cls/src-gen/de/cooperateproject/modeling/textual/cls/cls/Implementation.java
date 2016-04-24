/**
 * generated by Xtext 2.9.0
 */
package de.cooperateproject.modeling.textual.cls.cls;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.Implementation#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getImplementation()
 * @model
 * @generated
 */
public interface Implementation extends Connector
{
  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(AssociationEnd)
   * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getImplementation_Right()
   * @model containment="true"
   * @generated
   */
  AssociationEnd getRight();

  /**
   * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.Implementation#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(AssociationEnd value);

} // Implementation
