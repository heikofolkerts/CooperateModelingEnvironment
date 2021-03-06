/**
 */
package de.cooperateproject.modeling.textual.cls.cls;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage
 * @generated
 */
public interface ClsFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ClsFactory eINSTANCE = de.cooperateproject.modeling.textual.cls.cls.impl.ClsFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Class Diagram</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Class Diagram</em>'.
     * @generated
     */
    ClassDiagram createClassDiagram();

    /**
     * Returns a new object of class '<em>Package</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Package</em>'.
     * @generated
     */
    Package createPackage();

    /**
     * Returns a new object of class '<em>Class</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Class</em>'.
     * @generated
     */
    Class createClass();

    /**
     * Returns a new object of class '<em>Interface</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interface</em>'.
     * @generated
     */
    Interface createInterface();

    /**
     * Returns a new object of class '<em>Attribute</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Attribute</em>'.
     * @generated
     */
    Attribute createAttribute();

    /**
     * Returns a new object of class '<em>Method</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Method</em>'.
     * @generated
     */
    Method createMethod();

    /**
     * Returns a new object of class '<em>Parameter</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Parameter</em>'.
     * @generated
     */
    Parameter createParameter();

    /**
     * Returns a new object of class '<em>Generalization</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Generalization</em>'.
     * @generated
     */
    Generalization createGeneralization();

    /**
     * Returns a new object of class '<em>Implementation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Implementation</em>'.
     * @generated
     */
    Implementation createImplementation();

    /**
     * Returns a new object of class '<em>Association Member End</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Association Member End</em>'.
     * @generated
     */
    AssociationMemberEnd createAssociationMemberEnd();

    /**
     * Returns a new object of class '<em>Xtext Association</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Xtext Association</em>'.
     * @generated
     */
    XtextAssociation createXtextAssociation();

    /**
     * Returns a new object of class '<em>Xtext Association Member End Referenced Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Xtext Association Member End Referenced Type</em>'.
     * @generated
     */
    XtextAssociationMemberEndReferencedType createXtextAssociationMemberEndReferencedType();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ClsPackage getClsPackage();

} //ClsFactory
