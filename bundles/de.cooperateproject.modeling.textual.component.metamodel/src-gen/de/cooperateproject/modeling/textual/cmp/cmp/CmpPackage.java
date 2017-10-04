/**
 */
package de.cooperateproject.modeling.textual.cmp.cmp;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.cooperateproject.modeling.textual.cmp.cmp.CmpFactory
 * @model kind="package"
 * @generated
 */
public interface CmpPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "cmp";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.cooperateproject.de/modeling/textual/component/Component";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "cmp";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    CmpPackage eINSTANCE = de.cooperateproject.modeling.textual.cmp.cmp.impl.CmpPackageImpl.init();

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.ComponentDiagramImpl <em>Component Diagram</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.ComponentDiagramImpl
     * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.CmpPackageImpl#getComponentDiagram()
     * @generated
     */
    int COMPONENT_DIAGRAM = 0;

    /**
     * The feature id for the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT_DIAGRAM__TITLE = 0;

    /**
     * The feature id for the '<em><b>Rootpackage</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT_DIAGRAM__ROOTPACKAGE = 1;

    /**
     * The number of structural features of the '<em>Component Diagram</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT_DIAGRAM_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Component Diagram</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT_DIAGRAM_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.RootPackageImpl <em>Root Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.RootPackageImpl
     * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.CmpPackageImpl#getRootPackage()
     * @generated
     */
    int ROOT_PACKAGE = 1;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROOT_PACKAGE__REFERENCED_ELEMENT = TextualCommonsPackage.PACKAGE_BASE__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROOT_PACKAGE__NAME = TextualCommonsPackage.PACKAGE_BASE__NAME;

    /**
     * The feature id for the '<em><b>Owning Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROOT_PACKAGE__OWNING_PACKAGE = TextualCommonsPackage.PACKAGE_BASE__OWNING_PACKAGE;

    /**
     * The feature id for the '<em><b>Packages</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROOT_PACKAGE__PACKAGES = TextualCommonsPackage.PACKAGE_BASE__PACKAGES;

    /**
     * The feature id for the '<em><b>Package Imports</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROOT_PACKAGE__PACKAGE_IMPORTS = TextualCommonsPackage.PACKAGE_BASE__PACKAGE_IMPORTS;

    /**
     * The feature id for the '<em><b>Relations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROOT_PACKAGE__RELATIONS = TextualCommonsPackage.PACKAGE_BASE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROOT_PACKAGE__CLASSIFIERS = TextualCommonsPackage.PACKAGE_BASE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Root Package</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROOT_PACKAGE_FEATURE_COUNT = TextualCommonsPackage.PACKAGE_BASE_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROOT_PACKAGE___GET_NEAREST_PACKAGE = TextualCommonsPackage.PACKAGE_BASE___GET_NEAREST_PACKAGE;

    /**
     * The number of operations of the '<em>Root Package</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROOT_PACKAGE_OPERATION_COUNT = TextualCommonsPackage.PACKAGE_BASE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.ClassifierRelationImpl <em>Classifier Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.ClassifierRelationImpl
     * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.CmpPackageImpl#getClassifierRelation()
     * @generated
     */
    int CLASSIFIER_RELATION = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_RELATION__NAME = TextualCommonsPackage.ALIASED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_RELATION__ALIAS = TextualCommonsPackage.ALIASED_ELEMENT__ALIAS;

    /**
     * The feature id for the '<em><b>Left Classifier</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_RELATION__LEFT_CLASSIFIER = TextualCommonsPackage.ALIASED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Right Classifier</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_RELATION__RIGHT_CLASSIFIER = TextualCommonsPackage.ALIASED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Classifier Relation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_RELATION_FEATURE_COUNT = TextualCommonsPackage.ALIASED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_RELATION___GET_NEAREST_PACKAGE = TextualCommonsPackage.ALIASED_ELEMENT___GET_NEAREST_PACKAGE;

    /**
     * The number of operations of the '<em>Classifier Relation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_RELATION_OPERATION_COUNT = TextualCommonsPackage.ALIASED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.PortRelationImpl <em>Port Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.PortRelationImpl
     * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.CmpPackageImpl#getPortRelation()
     * @generated
     */
    int PORT_RELATION = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT_RELATION__NAME = TextualCommonsPackage.ALIASED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT_RELATION__ALIAS = TextualCommonsPackage.ALIASED_ELEMENT__ALIAS;

    /**
     * The feature id for the '<em><b>Outer Port</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT_RELATION__OUTER_PORT = TextualCommonsPackage.ALIASED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Inner Port</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT_RELATION__INNER_PORT = TextualCommonsPackage.ALIASED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Port Relation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT_RELATION_FEATURE_COUNT = TextualCommonsPackage.ALIASED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT_RELATION___GET_NEAREST_PACKAGE = TextualCommonsPackage.ALIASED_ELEMENT___GET_NEAREST_PACKAGE;

    /**
     * The number of operations of the '<em>Port Relation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT_RELATION_OPERATION_COUNT = TextualCommonsPackage.ALIASED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.ConnectorImpl <em>Connector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.ConnectorImpl
     * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.CmpPackageImpl#getConnector()
     * @generated
     */
    int CONNECTOR = 4;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR__REFERENCED_ELEMENT = TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR__NAME = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR__ALIAS = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Outer Port</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR__OUTER_PORT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Inner Port</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR__INNER_PORT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Connector</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_FEATURE_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR___GET_NEAREST_PACKAGE = TextualCommonsPackage.UML_REFERENCING_ELEMENT___GET_NEAREST_PACKAGE;

    /**
     * The number of operations of the '<em>Connector</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_OPERATION_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.GeneralizationImpl <em>Generalization</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.GeneralizationImpl
     * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.CmpPackageImpl#getGeneralization()
     * @generated
     */
    int GENERALIZATION = 5;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERALIZATION__REFERENCED_ELEMENT = TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERALIZATION__NAME = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERALIZATION__ALIAS = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Left Classifier</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERALIZATION__LEFT_CLASSIFIER = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Right Classifier</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERALIZATION__RIGHT_CLASSIFIER = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Generalization</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERALIZATION_FEATURE_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERALIZATION___GET_NEAREST_PACKAGE = TextualCommonsPackage.UML_REFERENCING_ELEMENT___GET_NEAREST_PACKAGE;

    /**
     * The number of operations of the '<em>Generalization</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERALIZATION_OPERATION_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.AbstractionImpl <em>Abstraction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.AbstractionImpl
     * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.CmpPackageImpl#getAbstraction()
     * @generated
     */
    int ABSTRACTION = 6;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACTION__REFERENCED_ELEMENT = TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACTION__NAME = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACTION__ALIAS = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Left Classifier</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACTION__LEFT_CLASSIFIER = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Right Classifier</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACTION__RIGHT_CLASSIFIER = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Abstraction</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACTION_FEATURE_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACTION___GET_NEAREST_PACKAGE = TextualCommonsPackage.UML_REFERENCING_ELEMENT___GET_NEAREST_PACKAGE;

    /**
     * The number of operations of the '<em>Abstraction</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACTION_OPERATION_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.ManifestationImpl <em>Manifestation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.ManifestationImpl
     * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.CmpPackageImpl#getManifestation()
     * @generated
     */
    int MANIFESTATION = 7;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANIFESTATION__REFERENCED_ELEMENT = TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANIFESTATION__NAME = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANIFESTATION__ALIAS = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Left Classifier</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANIFESTATION__LEFT_CLASSIFIER = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Right Classifier</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANIFESTATION__RIGHT_CLASSIFIER = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Manifestation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANIFESTATION_FEATURE_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANIFESTATION___GET_NEAREST_PACKAGE = TextualCommonsPackage.UML_REFERENCING_ELEMENT___GET_NEAREST_PACKAGE;

    /**
     * The number of operations of the '<em>Manifestation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANIFESTATION_OPERATION_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.SubstitutionImpl <em>Substitution</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.SubstitutionImpl
     * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.CmpPackageImpl#getSubstitution()
     * @generated
     */
    int SUBSTITUTION = 8;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTITUTION__REFERENCED_ELEMENT = TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTITUTION__NAME = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTITUTION__ALIAS = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Left Classifier</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTITUTION__LEFT_CLASSIFIER = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Right Classifier</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTITUTION__RIGHT_CLASSIFIER = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Substitution</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTITUTION_FEATURE_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTITUTION___GET_NEAREST_PACKAGE = TextualCommonsPackage.UML_REFERENCING_ELEMENT___GET_NEAREST_PACKAGE;

    /**
     * The number of operations of the '<em>Substitution</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTITUTION_OPERATION_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.DependencyImpl <em>Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.DependencyImpl
     * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.CmpPackageImpl#getDependency()
     * @generated
     */
    int DEPENDENCY = 9;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDENCY__REFERENCED_ELEMENT = TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDENCY__NAME = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDENCY__ALIAS = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Left Classifier</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDENCY__LEFT_CLASSIFIER = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Right Classifier</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDENCY__RIGHT_CLASSIFIER = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Dependency</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDENCY_FEATURE_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDENCY___GET_NEAREST_PACKAGE = TextualCommonsPackage.UML_REFERENCING_ELEMENT___GET_NEAREST_PACKAGE;

    /**
     * The number of operations of the '<em>Dependency</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDENCY_OPERATION_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.ClassifierImpl <em>Classifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.ClassifierImpl
     * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.CmpPackageImpl#getClassifier()
     * @generated
     */
    int CLASSIFIER = 10;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER__REFERENCED_ELEMENT = TextualCommonsPackage.COMMENTABLE__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER__COMMENTS = TextualCommonsPackage.COMMENTABLE__COMMENTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER__NAME = TextualCommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER__ALIAS = TextualCommonsPackage.COMMENTABLE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Classifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_FEATURE_COUNT = TextualCommonsPackage.COMMENTABLE_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER___GET_NEAREST_PACKAGE = TextualCommonsPackage.COMMENTABLE___GET_NEAREST_PACKAGE;

    /**
     * The number of operations of the '<em>Classifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_OPERATION_COUNT = TextualCommonsPackage.COMMENTABLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.PropertyImpl
     * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.CmpPackageImpl#getProperty()
     * @generated
     */
    int PROPERTY = 11;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__REFERENCED_ELEMENT = TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__NAME = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__VISIBILITY = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Static</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__STATIC = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__TYPE = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_FEATURE_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY___GET_NEAREST_PACKAGE = TextualCommonsPackage.UML_REFERENCING_ELEMENT___GET_NEAREST_PACKAGE;

    /**
     * The number of operations of the '<em>Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_OPERATION_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.ComponentImpl
     * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.CmpPackageImpl#getComponent()
     * @generated
     */
    int COMPONENT = 12;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__REFERENCED_ELEMENT = CLASSIFIER__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__COMMENTS = CLASSIFIER__COMMENTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__NAME = CLASSIFIER__NAME;

    /**
     * The feature id for the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__ALIAS = CLASSIFIER__ALIAS;

    /**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__COMPONENT = CLASSIFIER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Port Relation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__PORT_RELATION = CLASSIFIER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Interface Relation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__INTERFACE_RELATION = CLASSIFIER_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Nested Interface</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__NESTED_INTERFACE = CLASSIFIER_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Port</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__PORT = CLASSIFIER_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Owning Component</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__OWNING_COMPONENT = CLASSIFIER_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Component</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 6;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT___GET_NEAREST_PACKAGE = CLASSIFIER___GET_NEAREST_PACKAGE;

    /**
     * The number of operations of the '<em>Component</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.InterfaceImpl <em>Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.InterfaceImpl
     * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.CmpPackageImpl#getInterface()
     * @generated
     */
    int INTERFACE = 13;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE__REFERENCED_ELEMENT = CLASSIFIER__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE__COMMENTS = CLASSIFIER__COMMENTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE__NAME = CLASSIFIER__NAME;

    /**
     * The feature id for the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE__ALIAS = CLASSIFIER__ALIAS;

    /**
     * The feature id for the '<em><b>Members</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE__MEMBERS = CLASSIFIER_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Interface</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___GET_NEAREST_PACKAGE = CLASSIFIER___GET_NEAREST_PACKAGE;

    /**
     * The number of operations of the '<em>Interface</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.MemberImpl <em>Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.MemberImpl
     * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.CmpPackageImpl#getMember()
     * @generated
     */
    int MEMBER = 17;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER__REFERENCED_ELEMENT = PROPERTY__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER__NAME = PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER__VISIBILITY = PROPERTY__VISIBILITY;

    /**
     * The feature id for the '<em><b>Static</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER__STATIC = PROPERTY__STATIC;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER__TYPE = PROPERTY__TYPE;

    /**
     * The number of structural features of the '<em>Member</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER___GET_NEAREST_PACKAGE = PROPERTY___GET_NEAREST_PACKAGE;

    /**
     * The number of operations of the '<em>Member</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.MethodImpl <em>Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.MethodImpl
     * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.CmpPackageImpl#getMethod()
     * @generated
     */
    int METHOD = 14;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD__REFERENCED_ELEMENT = MEMBER__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD__NAME = MEMBER__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD__VISIBILITY = MEMBER__VISIBILITY;

    /**
     * The feature id for the '<em><b>Static</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD__STATIC = MEMBER__STATIC;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD__TYPE = MEMBER__TYPE;

    /**
     * The feature id for the '<em><b>Abstract</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD__ABSTRACT = MEMBER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD__PARAMETERS = MEMBER_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Method</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD___GET_NEAREST_PACKAGE = MEMBER___GET_NEAREST_PACKAGE;

    /**
     * The number of operations of the '<em>Method</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_OPERATION_COUNT = MEMBER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.ParameterImpl
     * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.CmpPackageImpl#getParameter()
     * @generated
     */
    int PARAMETER = 15;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__REFERENCED_ELEMENT = PROPERTY__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__NAME = PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__VISIBILITY = PROPERTY__VISIBILITY;

    /**
     * The feature id for the '<em><b>Static</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__STATIC = PROPERTY__STATIC;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__TYPE = PROPERTY__TYPE;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__OWNER = PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER___GET_NEAREST_PACKAGE = PROPERTY___GET_NEAREST_PACKAGE;

    /**
     * The number of operations of the '<em>Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.AttributeImpl
     * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.CmpPackageImpl#getAttribute()
     * @generated
     */
    int ATTRIBUTE = 16;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__REFERENCED_ELEMENT = MEMBER__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__NAME = MEMBER__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__VISIBILITY = MEMBER__VISIBILITY;

    /**
     * The feature id for the '<em><b>Static</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__STATIC = MEMBER__STATIC;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__TYPE = MEMBER__TYPE;

    /**
     * The number of structural features of the '<em>Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE___GET_NEAREST_PACKAGE = MEMBER___GET_NEAREST_PACKAGE;

    /**
     * The number of operations of the '<em>Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_OPERATION_COUNT = MEMBER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.InterfaceRelationImpl <em>Interface Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.InterfaceRelationImpl
     * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.CmpPackageImpl#getInterfaceRelation()
     * @generated
     */
    int INTERFACE_RELATION = 18;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_RELATION__NAME = TextualCommonsPackage.ALIASED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_RELATION__ALIAS = TextualCommonsPackage.ALIASED_ELEMENT__ALIAS;

    /**
     * The feature id for the '<em><b>Interface</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_RELATION__INTERFACE = TextualCommonsPackage.ALIASED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Interface Relation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_RELATION_FEATURE_COUNT = TextualCommonsPackage.ALIASED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_RELATION___GET_NEAREST_PACKAGE = TextualCommonsPackage.ALIASED_ELEMENT___GET_NEAREST_PACKAGE;

    /**
     * The number of operations of the '<em>Interface Relation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_RELATION_OPERATION_COUNT = TextualCommonsPackage.ALIASED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.ProvideImpl <em>Provide</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.ProvideImpl
     * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.CmpPackageImpl#getProvide()
     * @generated
     */
    int PROVIDE = 19;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDE__NAME = INTERFACE_RELATION__NAME;

    /**
     * The feature id for the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDE__ALIAS = INTERFACE_RELATION__ALIAS;

    /**
     * The feature id for the '<em><b>Interface</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDE__INTERFACE = INTERFACE_RELATION__INTERFACE;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDE__REFERENCED_ELEMENT = INTERFACE_RELATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Provide</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDE_FEATURE_COUNT = INTERFACE_RELATION_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDE___GET_NEAREST_PACKAGE = INTERFACE_RELATION___GET_NEAREST_PACKAGE;

    /**
     * The number of operations of the '<em>Provide</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDE_OPERATION_COUNT = INTERFACE_RELATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.RequireImpl <em>Require</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.RequireImpl
     * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.CmpPackageImpl#getRequire()
     * @generated
     */
    int REQUIRE = 20;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUIRE__NAME = INTERFACE_RELATION__NAME;

    /**
     * The feature id for the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUIRE__ALIAS = INTERFACE_RELATION__ALIAS;

    /**
     * The feature id for the '<em><b>Interface</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUIRE__INTERFACE = INTERFACE_RELATION__INTERFACE;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUIRE__REFERENCED_ELEMENT = INTERFACE_RELATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Require</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUIRE_FEATURE_COUNT = INTERFACE_RELATION_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUIRE___GET_NEAREST_PACKAGE = INTERFACE_RELATION___GET_NEAREST_PACKAGE;

    /**
     * The number of operations of the '<em>Require</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUIRE_OPERATION_COUNT = INTERFACE_RELATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.PortImpl <em>Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.PortImpl
     * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.CmpPackageImpl#getPort()
     * @generated
     */
    int PORT = 21;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT__NAME = TextualCommonsPackage.NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT__VISIBILITY = TextualCommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT__REFERENCED_ELEMENT = TextualCommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Realized Classifier</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT__REALIZED_CLASSIFIER = TextualCommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Port</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT_FEATURE_COUNT = TextualCommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT___GET_NEAREST_PACKAGE = TextualCommonsPackage.NAMED_ELEMENT___GET_NEAREST_PACKAGE;

    /**
     * The number of operations of the '<em>Port</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT_OPERATION_COUNT = TextualCommonsPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cmp.cmp.ComponentDiagram <em>Component Diagram</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Component Diagram</em>'.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.ComponentDiagram
     * @generated
     */
    EClass getComponentDiagram();

    /**
     * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.cmp.cmp.ComponentDiagram#getTitle <em>Title</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Title</em>'.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.ComponentDiagram#getTitle()
     * @see #getComponentDiagram()
     * @generated
     */
    EAttribute getComponentDiagram_Title();

    /**
     * Returns the meta object for the containment reference '{@link de.cooperateproject.modeling.textual.cmp.cmp.ComponentDiagram#getRootpackage <em>Rootpackage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Rootpackage</em>'.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.ComponentDiagram#getRootpackage()
     * @see #getComponentDiagram()
     * @generated
     */
    EReference getComponentDiagram_Rootpackage();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cmp.cmp.RootPackage <em>Root Package</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Root Package</em>'.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.RootPackage
     * @generated
     */
    EClass getRootPackage();

    /**
     * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.cmp.cmp.RootPackage#getRelations <em>Relations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Relations</em>'.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.RootPackage#getRelations()
     * @see #getRootPackage()
     * @generated
     */
    EReference getRootPackage_Relations();

    /**
     * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.cmp.cmp.RootPackage#getClassifiers <em>Classifiers</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Classifiers</em>'.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.RootPackage#getClassifiers()
     * @see #getRootPackage()
     * @generated
     */
    EReference getRootPackage_Classifiers();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cmp.cmp.ClassifierRelation <em>Classifier Relation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Classifier Relation</em>'.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.ClassifierRelation
     * @generated
     */
    EClass getClassifierRelation();

    /**
     * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.cmp.cmp.ClassifierRelation#getLeftClassifier <em>Left Classifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Left Classifier</em>'.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.ClassifierRelation#getLeftClassifier()
     * @see #getClassifierRelation()
     * @generated
     */
    EReference getClassifierRelation_LeftClassifier();

    /**
     * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.cmp.cmp.ClassifierRelation#getRightClassifier <em>Right Classifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Right Classifier</em>'.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.ClassifierRelation#getRightClassifier()
     * @see #getClassifierRelation()
     * @generated
     */
    EReference getClassifierRelation_RightClassifier();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cmp.cmp.PortRelation <em>Port Relation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Port Relation</em>'.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.PortRelation
     * @generated
     */
    EClass getPortRelation();

    /**
     * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.cmp.cmp.PortRelation#getOuterPort <em>Outer Port</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Outer Port</em>'.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.PortRelation#getOuterPort()
     * @see #getPortRelation()
     * @generated
     */
    EReference getPortRelation_OuterPort();

    /**
     * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.cmp.cmp.PortRelation#getInnerPort <em>Inner Port</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Inner Port</em>'.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.PortRelation#getInnerPort()
     * @see #getPortRelation()
     * @generated
     */
    EReference getPortRelation_InnerPort();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cmp.cmp.Connector <em>Connector</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Connector</em>'.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Connector
     * @generated
     */
    EClass getConnector();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cmp.cmp.Generalization <em>Generalization</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Generalization</em>'.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Generalization
     * @generated
     */
    EClass getGeneralization();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cmp.cmp.Abstraction <em>Abstraction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstraction</em>'.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Abstraction
     * @generated
     */
    EClass getAbstraction();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cmp.cmp.Manifestation <em>Manifestation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Manifestation</em>'.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Manifestation
     * @generated
     */
    EClass getManifestation();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cmp.cmp.Substitution <em>Substitution</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Substitution</em>'.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Substitution
     * @generated
     */
    EClass getSubstitution();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cmp.cmp.Dependency <em>Dependency</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dependency</em>'.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Dependency
     * @generated
     */
    EClass getDependency();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cmp.cmp.Classifier <em>Classifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Classifier</em>'.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Classifier
     * @generated
     */
    EClass getClassifier();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cmp.cmp.Property <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Property</em>'.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Property
     * @generated
     */
    EClass getProperty();

    /**
     * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.cmp.cmp.Property#isStatic <em>Static</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Static</em>'.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Property#isStatic()
     * @see #getProperty()
     * @generated
     */
    EAttribute getProperty_Static();

    /**
     * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.cmp.cmp.Property#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Property#getType()
     * @see #getProperty()
     * @generated
     */
    EReference getProperty_Type();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cmp.cmp.Component <em>Component</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Component</em>'.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Component
     * @generated
     */
    EClass getComponent();

    /**
     * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.cmp.cmp.Component#getComponent <em>Component</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Component</em>'.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Component#getComponent()
     * @see #getComponent()
     * @generated
     */
    EReference getComponent_Component();

    /**
     * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.cmp.cmp.Component#getPortRelation <em>Port Relation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Port Relation</em>'.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Component#getPortRelation()
     * @see #getComponent()
     * @generated
     */
    EReference getComponent_PortRelation();

    /**
     * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.cmp.cmp.Component#getInterfaceRelation <em>Interface Relation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Interface Relation</em>'.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Component#getInterfaceRelation()
     * @see #getComponent()
     * @generated
     */
    EReference getComponent_InterfaceRelation();

    /**
     * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.cmp.cmp.Component#getNestedInterface <em>Nested Interface</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Nested Interface</em>'.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Component#getNestedInterface()
     * @see #getComponent()
     * @generated
     */
    EReference getComponent_NestedInterface();

    /**
     * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.cmp.cmp.Component#getPort <em>Port</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Port</em>'.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Component#getPort()
     * @see #getComponent()
     * @generated
     */
    EReference getComponent_Port();

    /**
     * Returns the meta object for the container reference '{@link de.cooperateproject.modeling.textual.cmp.cmp.Component#getOwningComponent <em>Owning Component</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Owning Component</em>'.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Component#getOwningComponent()
     * @see #getComponent()
     * @generated
     */
    EReference getComponent_OwningComponent();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cmp.cmp.Interface <em>Interface</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interface</em>'.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Interface
     * @generated
     */
    EClass getInterface();

    /**
     * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.cmp.cmp.Interface#getMembers <em>Members</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Members</em>'.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Interface#getMembers()
     * @see #getInterface()
     * @generated
     */
    EReference getInterface_Members();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cmp.cmp.Method <em>Method</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Method</em>'.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Method
     * @generated
     */
    EClass getMethod();

    /**
     * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.cmp.cmp.Method#isAbstract <em>Abstract</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Abstract</em>'.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Method#isAbstract()
     * @see #getMethod()
     * @generated
     */
    EAttribute getMethod_Abstract();

    /**
     * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.cmp.cmp.Method#getParameters <em>Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Parameters</em>'.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Method#getParameters()
     * @see #getMethod()
     * @generated
     */
    EReference getMethod_Parameters();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cmp.cmp.Parameter <em>Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Parameter</em>'.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Parameter
     * @generated
     */
    EClass getParameter();

    /**
     * Returns the meta object for the container reference '{@link de.cooperateproject.modeling.textual.cmp.cmp.Parameter#getOwner <em>Owner</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Owner</em>'.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Parameter#getOwner()
     * @see #getParameter()
     * @generated
     */
    EReference getParameter_Owner();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cmp.cmp.Attribute <em>Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attribute</em>'.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Attribute
     * @generated
     */
    EClass getAttribute();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cmp.cmp.Member <em>Member</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Member</em>'.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Member
     * @generated
     */
    EClass getMember();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cmp.cmp.InterfaceRelation <em>Interface Relation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interface Relation</em>'.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.InterfaceRelation
     * @generated
     */
    EClass getInterfaceRelation();

    /**
     * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.cmp.cmp.InterfaceRelation#getInterface <em>Interface</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Interface</em>'.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.InterfaceRelation#getInterface()
     * @see #getInterfaceRelation()
     * @generated
     */
    EReference getInterfaceRelation_Interface();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cmp.cmp.Provide <em>Provide</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Provide</em>'.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Provide
     * @generated
     */
    EClass getProvide();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cmp.cmp.Require <em>Require</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Require</em>'.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Require
     * @generated
     */
    EClass getRequire();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cmp.cmp.Port <em>Port</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Port</em>'.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Port
     * @generated
     */
    EClass getPort();

    /**
     * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.cmp.cmp.Port#getRealizedClassifier <em>Realized Classifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Realized Classifier</em>'.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Port#getRealizedClassifier()
     * @see #getPort()
     * @generated
     */
    EReference getPort_RealizedClassifier();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    CmpFactory getCmpFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.ComponentDiagramImpl <em>Component Diagram</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.ComponentDiagramImpl
         * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.CmpPackageImpl#getComponentDiagram()
         * @generated
         */
        EClass COMPONENT_DIAGRAM = eINSTANCE.getComponentDiagram();

        /**
         * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COMPONENT_DIAGRAM__TITLE = eINSTANCE.getComponentDiagram_Title();

        /**
         * The meta object literal for the '<em><b>Rootpackage</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPONENT_DIAGRAM__ROOTPACKAGE = eINSTANCE.getComponentDiagram_Rootpackage();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.RootPackageImpl <em>Root Package</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.RootPackageImpl
         * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.CmpPackageImpl#getRootPackage()
         * @generated
         */
        EClass ROOT_PACKAGE = eINSTANCE.getRootPackage();

        /**
         * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROOT_PACKAGE__RELATIONS = eINSTANCE.getRootPackage_Relations();

        /**
         * The meta object literal for the '<em><b>Classifiers</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROOT_PACKAGE__CLASSIFIERS = eINSTANCE.getRootPackage_Classifiers();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.ClassifierRelationImpl <em>Classifier Relation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.ClassifierRelationImpl
         * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.CmpPackageImpl#getClassifierRelation()
         * @generated
         */
        EClass CLASSIFIER_RELATION = eINSTANCE.getClassifierRelation();

        /**
         * The meta object literal for the '<em><b>Left Classifier</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CLASSIFIER_RELATION__LEFT_CLASSIFIER = eINSTANCE.getClassifierRelation_LeftClassifier();

        /**
         * The meta object literal for the '<em><b>Right Classifier</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CLASSIFIER_RELATION__RIGHT_CLASSIFIER = eINSTANCE.getClassifierRelation_RightClassifier();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.PortRelationImpl <em>Port Relation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.PortRelationImpl
         * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.CmpPackageImpl#getPortRelation()
         * @generated
         */
        EClass PORT_RELATION = eINSTANCE.getPortRelation();

        /**
         * The meta object literal for the '<em><b>Outer Port</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PORT_RELATION__OUTER_PORT = eINSTANCE.getPortRelation_OuterPort();

        /**
         * The meta object literal for the '<em><b>Inner Port</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PORT_RELATION__INNER_PORT = eINSTANCE.getPortRelation_InnerPort();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.ConnectorImpl <em>Connector</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.ConnectorImpl
         * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.CmpPackageImpl#getConnector()
         * @generated
         */
        EClass CONNECTOR = eINSTANCE.getConnector();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.GeneralizationImpl <em>Generalization</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.GeneralizationImpl
         * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.CmpPackageImpl#getGeneralization()
         * @generated
         */
        EClass GENERALIZATION = eINSTANCE.getGeneralization();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.AbstractionImpl <em>Abstraction</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.AbstractionImpl
         * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.CmpPackageImpl#getAbstraction()
         * @generated
         */
        EClass ABSTRACTION = eINSTANCE.getAbstraction();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.ManifestationImpl <em>Manifestation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.ManifestationImpl
         * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.CmpPackageImpl#getManifestation()
         * @generated
         */
        EClass MANIFESTATION = eINSTANCE.getManifestation();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.SubstitutionImpl <em>Substitution</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.SubstitutionImpl
         * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.CmpPackageImpl#getSubstitution()
         * @generated
         */
        EClass SUBSTITUTION = eINSTANCE.getSubstitution();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.DependencyImpl <em>Dependency</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.DependencyImpl
         * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.CmpPackageImpl#getDependency()
         * @generated
         */
        EClass DEPENDENCY = eINSTANCE.getDependency();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.ClassifierImpl <em>Classifier</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.ClassifierImpl
         * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.CmpPackageImpl#getClassifier()
         * @generated
         */
        EClass CLASSIFIER = eINSTANCE.getClassifier();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.PropertyImpl <em>Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.PropertyImpl
         * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.CmpPackageImpl#getProperty()
         * @generated
         */
        EClass PROPERTY = eINSTANCE.getProperty();

        /**
         * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTY__STATIC = eINSTANCE.getProperty_Static();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROPERTY__TYPE = eINSTANCE.getProperty_Type();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.ComponentImpl <em>Component</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.ComponentImpl
         * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.CmpPackageImpl#getComponent()
         * @generated
         */
        EClass COMPONENT = eINSTANCE.getComponent();

        /**
         * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPONENT__COMPONENT = eINSTANCE.getComponent_Component();

        /**
         * The meta object literal for the '<em><b>Port Relation</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPONENT__PORT_RELATION = eINSTANCE.getComponent_PortRelation();

        /**
         * The meta object literal for the '<em><b>Interface Relation</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPONENT__INTERFACE_RELATION = eINSTANCE.getComponent_InterfaceRelation();

        /**
         * The meta object literal for the '<em><b>Nested Interface</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPONENT__NESTED_INTERFACE = eINSTANCE.getComponent_NestedInterface();

        /**
         * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPONENT__PORT = eINSTANCE.getComponent_Port();

        /**
         * The meta object literal for the '<em><b>Owning Component</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPONENT__OWNING_COMPONENT = eINSTANCE.getComponent_OwningComponent();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.InterfaceImpl <em>Interface</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.InterfaceImpl
         * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.CmpPackageImpl#getInterface()
         * @generated
         */
        EClass INTERFACE = eINSTANCE.getInterface();

        /**
         * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERFACE__MEMBERS = eINSTANCE.getInterface_Members();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.MethodImpl <em>Method</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.MethodImpl
         * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.CmpPackageImpl#getMethod()
         * @generated
         */
        EClass METHOD = eINSTANCE.getMethod();

        /**
         * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute METHOD__ABSTRACT = eINSTANCE.getMethod_Abstract();

        /**
         * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference METHOD__PARAMETERS = eINSTANCE.getMethod_Parameters();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.ParameterImpl <em>Parameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.ParameterImpl
         * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.CmpPackageImpl#getParameter()
         * @generated
         */
        EClass PARAMETER = eINSTANCE.getParameter();

        /**
         * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PARAMETER__OWNER = eINSTANCE.getParameter_Owner();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.AttributeImpl <em>Attribute</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.AttributeImpl
         * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.CmpPackageImpl#getAttribute()
         * @generated
         */
        EClass ATTRIBUTE = eINSTANCE.getAttribute();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.MemberImpl <em>Member</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.MemberImpl
         * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.CmpPackageImpl#getMember()
         * @generated
         */
        EClass MEMBER = eINSTANCE.getMember();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.InterfaceRelationImpl <em>Interface Relation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.InterfaceRelationImpl
         * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.CmpPackageImpl#getInterfaceRelation()
         * @generated
         */
        EClass INTERFACE_RELATION = eINSTANCE.getInterfaceRelation();

        /**
         * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERFACE_RELATION__INTERFACE = eINSTANCE.getInterfaceRelation_Interface();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.ProvideImpl <em>Provide</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.ProvideImpl
         * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.CmpPackageImpl#getProvide()
         * @generated
         */
        EClass PROVIDE = eINSTANCE.getProvide();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.RequireImpl <em>Require</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.RequireImpl
         * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.CmpPackageImpl#getRequire()
         * @generated
         */
        EClass REQUIRE = eINSTANCE.getRequire();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.PortImpl <em>Port</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.PortImpl
         * @see de.cooperateproject.modeling.textual.cmp.cmp.impl.CmpPackageImpl#getPort()
         * @generated
         */
        EClass PORT = eINSTANCE.getPort();

        /**
         * The meta object literal for the '<em><b>Realized Classifier</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PORT__REALIZED_CLASSIFIER = eINSTANCE.getPort_RealizedClassifier();

    }

} //CmpPackage