/**
 */
package de.cooperateproject.modeling.textual.usecase.usecase.impl;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;

import de.cooperateproject.modeling.textual.usecase.usecase.Actor;
import de.cooperateproject.modeling.textual.usecase.usecase.ActorType;
import de.cooperateproject.modeling.textual.usecase.usecase.Association;
import de.cooperateproject.modeling.textual.usecase.usecase.BehavioredClassifier;
import de.cooperateproject.modeling.textual.usecase.usecase.Extend;
import de.cooperateproject.modeling.textual.usecase.usecase.ExtensionPoint;
import de.cooperateproject.modeling.textual.usecase.usecase.Generalization;
import de.cooperateproject.modeling.textual.usecase.usecase.Include;
import de.cooperateproject.modeling.textual.usecase.usecase.Relationship;
import de.cooperateproject.modeling.textual.usecase.usecase.RootPackage;
import de.cooperateproject.modeling.textual.usecase.usecase.UseCase;
import de.cooperateproject.modeling.textual.usecase.usecase.UseCaseDiagram;
import de.cooperateproject.modeling.textual.usecase.usecase.UsecaseFactory;
import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UsecasePackageImpl extends EPackageImpl implements UsecasePackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass useCaseDiagramEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass behavioredClassifierEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rootPackageEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass actorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass systemEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass useCaseEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass extensionPointEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass relationshipEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass associationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass generalizationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass includeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass extendEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum actorTypeEEnum = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#eNS_URI
     * @see #init()
     * @generated
     */
    private UsecasePackageImpl() {
        super(eNS_URI, UsecaseFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link UsecasePackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static UsecasePackage init() {
        if (isInited) return (UsecasePackage)EPackage.Registry.INSTANCE.getEPackage(UsecasePackage.eNS_URI);

        // Obtain or create and register package
        UsecasePackageImpl theUsecasePackage = (UsecasePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UsecasePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UsecasePackageImpl());

        isInited = true;

        // Initialize simple dependencies
        EcorePackage.eINSTANCE.eClass();
        TextualCommonsPackage.eINSTANCE.eClass();
        TypesPackage.eINSTANCE.eClass();
        UMLPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theUsecasePackage.createPackageContents();

        // Initialize created meta-data
        theUsecasePackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theUsecasePackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(UsecasePackage.eNS_URI, theUsecasePackage);
        return theUsecasePackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getUseCaseDiagram() {
        return useCaseDiagramEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getUseCaseDiagram_RootPackage() {
        return (EReference)useCaseDiagramEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUseCaseDiagram_Title() {
        return (EAttribute)useCaseDiagramEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBehavioredClassifier() {
        return behavioredClassifierEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRootPackage() {
        return rootPackageEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRootPackage_Actors() {
        return (EReference)rootPackageEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRootPackage_Systems() {
        return (EReference)rootPackageEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRootPackage_Relationships() {
        return (EReference)rootPackageEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRootPackage_Diagram() {
        return (EReference)rootPackageEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getActor() {
        return actorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getActor_Abstract() {
        return (EAttribute)actorEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getActor_Type() {
        return (EAttribute)actorEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSystem() {
        return systemEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSystem_Usecases() {
        return (EReference)systemEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSystem_Package() {
        return (EReference)systemEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getUseCase() {
        return useCaseEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUseCase_Abstract() {
        return (EAttribute)useCaseEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getUseCase_ExtensionPoints() {
        return (EReference)useCaseEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getUseCase_System() {
        return (EReference)useCaseEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExtensionPoint() {
        return extensionPointEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExtensionPoint_UseCase() {
        return (EReference)extensionPointEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRelationship() {
        return relationshipEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAssociation() {
        return associationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAssociation_Actor() {
        return (EReference)associationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAssociation_Usecase() {
        return (EReference)associationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAssociation_ActorCardinality() {
        return (EReference)associationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAssociation_UseCaseCardinality() {
        return (EReference)associationEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGeneralization() {
        return generalizationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getGeneralization_Specific() {
        return (EReference)generalizationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getGeneralization_General() {
        return (EReference)generalizationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInclude() {
        return includeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInclude_Addition() {
        return (EReference)includeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInclude_IncludingCase() {
        return (EReference)includeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExtend() {
        return extendEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExtend_Extension() {
        return (EReference)extendEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExtend_ExtendedCase() {
        return (EReference)extendEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExtend_ExtensionLocation() {
        return (EReference)extendEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExtend_Condition() {
        return (EAttribute)extendEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getActorType() {
        return actorTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UsecaseFactory getUsecaseFactory() {
        return (UsecaseFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        useCaseDiagramEClass = createEClass(USE_CASE_DIAGRAM);
        createEReference(useCaseDiagramEClass, USE_CASE_DIAGRAM__ROOT_PACKAGE);
        createEAttribute(useCaseDiagramEClass, USE_CASE_DIAGRAM__TITLE);

        behavioredClassifierEClass = createEClass(BEHAVIORED_CLASSIFIER);

        rootPackageEClass = createEClass(ROOT_PACKAGE);
        createEReference(rootPackageEClass, ROOT_PACKAGE__ACTORS);
        createEReference(rootPackageEClass, ROOT_PACKAGE__SYSTEMS);
        createEReference(rootPackageEClass, ROOT_PACKAGE__RELATIONSHIPS);
        createEReference(rootPackageEClass, ROOT_PACKAGE__DIAGRAM);

        actorEClass = createEClass(ACTOR);
        createEAttribute(actorEClass, ACTOR__ABSTRACT);
        createEAttribute(actorEClass, ACTOR__TYPE);

        systemEClass = createEClass(SYSTEM);
        createEReference(systemEClass, SYSTEM__USECASES);
        createEReference(systemEClass, SYSTEM__PACKAGE);

        useCaseEClass = createEClass(USE_CASE);
        createEAttribute(useCaseEClass, USE_CASE__ABSTRACT);
        createEReference(useCaseEClass, USE_CASE__EXTENSION_POINTS);
        createEReference(useCaseEClass, USE_CASE__SYSTEM);

        extensionPointEClass = createEClass(EXTENSION_POINT);
        createEReference(extensionPointEClass, EXTENSION_POINT__USE_CASE);

        relationshipEClass = createEClass(RELATIONSHIP);

        associationEClass = createEClass(ASSOCIATION);
        createEReference(associationEClass, ASSOCIATION__ACTOR);
        createEReference(associationEClass, ASSOCIATION__USECASE);
        createEReference(associationEClass, ASSOCIATION__ACTOR_CARDINALITY);
        createEReference(associationEClass, ASSOCIATION__USE_CASE_CARDINALITY);

        generalizationEClass = createEClass(GENERALIZATION);
        createEReference(generalizationEClass, GENERALIZATION__SPECIFIC);
        createEReference(generalizationEClass, GENERALIZATION__GENERAL);

        includeEClass = createEClass(INCLUDE);
        createEReference(includeEClass, INCLUDE__ADDITION);
        createEReference(includeEClass, INCLUDE__INCLUDING_CASE);

        extendEClass = createEClass(EXTEND);
        createEReference(extendEClass, EXTEND__EXTENSION);
        createEReference(extendEClass, EXTEND__EXTENDED_CASE);
        createEReference(extendEClass, EXTEND__EXTENSION_LOCATION);
        createEAttribute(extendEClass, EXTEND__CONDITION);

        // Create enums
        actorTypeEEnum = createEEnum(ACTOR_TYPE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
        TextualCommonsPackage theTextualCommonsPackage = (TextualCommonsPackage)EPackage.Registry.INSTANCE.getEPackage(TextualCommonsPackage.eNS_URI);

        // Create type parameters
        ETypeParameter behavioredClassifierEClass_T = addETypeParameter(behavioredClassifierEClass, "T");

        // Set bounds for type parameters
        EGenericType g1 = createEGenericType(theUMLPackage.getBehavioredClassifier());
        behavioredClassifierEClass_T.getEBounds().add(g1);

        // Add supertypes to classes
        g1 = createEGenericType(theTextualCommonsPackage.getUMLReferencingElement());
        EGenericType g2 = createEGenericType(behavioredClassifierEClass_T);
        g1.getETypeArguments().add(g2);
        behavioredClassifierEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getCommentable());
        g2 = createEGenericType(behavioredClassifierEClass_T);
        g1.getETypeArguments().add(g2);
        behavioredClassifierEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getUMLReferencingElement());
        g2 = createEGenericType(theUMLPackage.getPackage());
        g1.getETypeArguments().add(g2);
        rootPackageEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getNamedElement());
        rootPackageEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getBehavioredClassifier());
        g2 = createEGenericType(theUMLPackage.getActor());
        g1.getETypeArguments().add(g2);
        actorEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getAliasedElement());
        actorEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getVisibilityHavingElement());
        actorEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getUMLReferencingElement());
        g2 = createEGenericType(theUMLPackage.getClassifier());
        g1.getETypeArguments().add(g2);
        systemEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getNamedElement());
        systemEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getCommentable());
        g2 = createEGenericType(theUMLPackage.getClassifier());
        g1.getETypeArguments().add(g2);
        systemEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getBehavioredClassifier());
        g2 = createEGenericType(theUMLPackage.getUseCase());
        g1.getETypeArguments().add(g2);
        useCaseEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getAliasedElement());
        useCaseEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getVisibilityHavingElement());
        useCaseEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getUMLReferencingElement());
        g2 = createEGenericType(theUMLPackage.getExtensionPoint());
        g1.getETypeArguments().add(g2);
        extensionPointEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getAliasedElement());
        extensionPointEClass.getEGenericSuperTypes().add(g1);
        relationshipEClass.getESuperTypes().add(theTextualCommonsPackage.getElement());
        g1 = createEGenericType(theTextualCommonsPackage.getUMLReferencingElement());
        g2 = createEGenericType(theUMLPackage.getAssociation());
        g1.getETypeArguments().add(g2);
        associationEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getRelationship());
        associationEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getRelationship());
        generalizationEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getUMLReferencingElement());
        g2 = createEGenericType(theUMLPackage.getGeneralization());
        g1.getETypeArguments().add(g2);
        generalizationEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getRelationship());
        includeEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getUMLReferencingElement());
        g2 = createEGenericType(theUMLPackage.getInclude());
        g1.getETypeArguments().add(g2);
        includeEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getRelationship());
        extendEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getUMLReferencingElement());
        g2 = createEGenericType(theUMLPackage.getExtend());
        g1.getETypeArguments().add(g2);
        extendEClass.getEGenericSuperTypes().add(g1);

        // Initialize classes, features, and operations; add parameters
        initEClass(useCaseDiagramEClass, UseCaseDiagram.class, "UseCaseDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getUseCaseDiagram_RootPackage(), this.getRootPackage(), this.getRootPackage_Diagram(), "rootPackage", null, 0, 1, UseCaseDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getUseCaseDiagram_Title(), ecorePackage.getEString(), "title", null, 1, 1, UseCaseDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(behavioredClassifierEClass, BehavioredClassifier.class, "BehavioredClassifier", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(rootPackageEClass, RootPackage.class, "RootPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRootPackage_Actors(), this.getActor(), null, "actors", null, 0, -1, RootPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRootPackage_Systems(), this.getSystem(), this.getSystem_Package(), "systems", null, 0, -1, RootPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRootPackage_Relationships(), this.getRelationship(), null, "relationships", null, 0, -1, RootPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRootPackage_Diagram(), this.getUseCaseDiagram(), this.getUseCaseDiagram_RootPackage(), "diagram", null, 1, 1, RootPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getActor_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, Actor.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getActor_Type(), this.getActorType(), "type", null, 1, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(systemEClass, de.cooperateproject.modeling.textual.usecase.usecase.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSystem_Usecases(), this.getUseCase(), this.getUseCase_System(), "usecases", null, 0, -1, de.cooperateproject.modeling.textual.usecase.usecase.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSystem_Package(), this.getRootPackage(), this.getRootPackage_Systems(), "package", null, 1, 1, de.cooperateproject.modeling.textual.usecase.usecase.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(useCaseEClass, UseCase.class, "UseCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getUseCase_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, UseCase.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getUseCase_ExtensionPoints(), this.getExtensionPoint(), this.getExtensionPoint_UseCase(), "extensionPoints", null, 0, -1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getUseCase_System(), this.getSystem(), this.getSystem_Usecases(), "system", null, 1, 1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(extensionPointEClass, ExtensionPoint.class, "ExtensionPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getExtensionPoint_UseCase(), this.getUseCase(), this.getUseCase_ExtensionPoints(), "useCase", null, 1, 1, ExtensionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(relationshipEClass, Relationship.class, "Relationship", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAssociation_Actor(), this.getActor(), null, "actor", null, 0, 1, Association.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAssociation_Usecase(), this.getUseCase(), null, "usecase", null, 0, 1, Association.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAssociation_ActorCardinality(), theTextualCommonsPackage.getCardinality(), null, "actorCardinality", null, 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAssociation_UseCaseCardinality(), theTextualCommonsPackage.getCardinality(), null, "useCaseCardinality", null, 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(generalizationEClass, Generalization.class, "Generalization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        g1 = createEGenericType(this.getBehavioredClassifier());
        g2 = createEGenericType(theUMLPackage.getBehavioredClassifier());
        g1.getETypeArguments().add(g2);
        initEReference(getGeneralization_Specific(), g1, null, "specific", null, 1, 1, Generalization.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        g1 = createEGenericType(this.getBehavioredClassifier());
        g2 = createEGenericType(theUMLPackage.getBehavioredClassifier());
        g1.getETypeArguments().add(g2);
        initEReference(getGeneralization_General(), g1, null, "general", null, 1, 1, Generalization.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(includeEClass, Include.class, "Include", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getInclude_Addition(), this.getUseCase(), null, "addition", null, 1, 1, Include.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getInclude_IncludingCase(), this.getUseCase(), null, "includingCase", null, 1, 1, Include.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(extendEClass, Extend.class, "Extend", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getExtend_Extension(), this.getUseCase(), null, "extension", null, 1, 1, Extend.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getExtend_ExtendedCase(), this.getUseCase(), null, "extendedCase", null, 1, 1, Extend.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getExtend_ExtensionLocation(), this.getExtensionPoint(), null, "extensionLocation", null, 1, 1, Extend.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExtend_Condition(), ecorePackage.getEString(), "condition", null, 0, 1, Extend.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(actorTypeEEnum, ActorType.class, "ActorType");
        addEEnumLiteral(actorTypeEEnum, ActorType.UNDEFINED);
        addEEnumLiteral(actorTypeEEnum, ActorType.HUMAN);
        addEEnumLiteral(actorTypeEEnum, ActorType.MACHINE);

        // Create resource
        createResource(eNS_URI);
    }

} //UsecasePackageImpl
