/**
 * generated by Xtext 2.11.0
 */
package de.cooperateproject.modeling.textual.sequence.sequence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Critical</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequence.Critical#getFragments <em>Fragments</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage#getCritical()
 * @model
 * @generated
 */
public interface Critical extends CombinedFragment
{
  /**
   * Returns the value of the '<em><b>Fragments</b></em>' containment reference list.
   * The list contents are of type {@link de.cooperateproject.modeling.textual.sequence.sequence.InteractionFragment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fragments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fragments</em>' containment reference list.
   * @see de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage#getCritical_Fragments()
   * @model containment="true"
   * @generated
   */
  EList<InteractionFragment> getFragments();

} // Critical
