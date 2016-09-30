/**
 */
package de.cooperateproject.modeling.textual.cls.cls;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getElement()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface Element extends CDOObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.ecore.EObject%> focus = this;\r\nwhile (focus != null && !(focus instanceof <%de.cooperateproject.modeling.textual.cls.cls.Package%>)) {\r\n\tfocus = focus.eContainer();\r\n}\r\nreturn (<%de.cooperateproject.modeling.textual.cls.cls.Package%>)focus;'"
	 * @generated
	 */
	de.cooperateproject.modeling.textual.cls.cls.Package getNearestPackage();

} // Element
