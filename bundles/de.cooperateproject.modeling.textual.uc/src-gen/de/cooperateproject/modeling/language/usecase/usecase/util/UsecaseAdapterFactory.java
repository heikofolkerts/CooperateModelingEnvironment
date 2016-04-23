/**
 * generated by Xtext 2.9.0
 */
package de.cooperateproject.modeling.language.usecase.usecase.util;

import de.cooperateproject.modeling.language.usecase.usecase.Actor;
import de.cooperateproject.modeling.language.usecase.usecase.Association;
import de.cooperateproject.modeling.language.usecase.usecase.Commentable;
import de.cooperateproject.modeling.language.usecase.usecase.Constraint;
import de.cooperateproject.modeling.language.usecase.usecase.Diagram;
import de.cooperateproject.modeling.language.usecase.usecase.Extension;
import de.cooperateproject.modeling.language.usecase.usecase.ExtensionPoint;
import de.cooperateproject.modeling.language.usecase.usecase.Include;
import de.cooperateproject.modeling.language.usecase.usecase.Multiplicity;
import de.cooperateproject.modeling.language.usecase.usecase.Test;
import de.cooperateproject.modeling.language.usecase.usecase.Test2;
import de.cooperateproject.modeling.language.usecase.usecase.UMLModelReference;
import de.cooperateproject.modeling.language.usecase.usecase.UseCase;
import de.cooperateproject.modeling.language.usecase.usecase.UsecasePackage;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.cooperateproject.modeling.language.usecase.usecase.UsecasePackage
 * @generated
 */
public class UsecaseAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static UsecasePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UsecaseAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = UsecasePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UsecaseSwitch<Adapter> modelSwitch =
    new UsecaseSwitch<Adapter>()
    {
      @Override
      public Adapter caseDiagram(Diagram object)
      {
        return createDiagramAdapter();
      }
      @Override
      public Adapter caseUMLModelReference(UMLModelReference object)
      {
        return createUMLModelReferenceAdapter();
      }
      @Override
      public Adapter caseTest(Test object)
      {
        return createTestAdapter();
      }
      @Override
      public Adapter caseTest2(Test2 object)
      {
        return createTest2Adapter();
      }
      @Override
      public Adapter caseCommentable(Commentable object)
      {
        return createCommentableAdapter();
      }
      @Override
      public Adapter caseActor(Actor object)
      {
        return createActorAdapter();
      }
      @Override
      public Adapter caseSystem(de.cooperateproject.modeling.language.usecase.usecase.System object)
      {
        return createSystemAdapter();
      }
      @Override
      public Adapter caseUseCase(UseCase object)
      {
        return createUseCaseAdapter();
      }
      @Override
      public Adapter caseExtensionPoint(ExtensionPoint object)
      {
        return createExtensionPointAdapter();
      }
      @Override
      public Adapter caseExtension(Extension object)
      {
        return createExtensionAdapter();
      }
      @Override
      public Adapter caseInclude(Include object)
      {
        return createIncludeAdapter();
      }
      @Override
      public Adapter caseConstraint(Constraint object)
      {
        return createConstraintAdapter();
      }
      @Override
      public Adapter caseAssociation(Association object)
      {
        return createAssociationAdapter();
      }
      @Override
      public Adapter caseMultiplicity(Multiplicity object)
      {
        return createMultiplicityAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.language.usecase.usecase.Diagram <em>Diagram</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cooperateproject.modeling.language.usecase.usecase.Diagram
   * @generated
   */
  public Adapter createDiagramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.language.usecase.usecase.UMLModelReference <em>UML Model Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cooperateproject.modeling.language.usecase.usecase.UMLModelReference
   * @generated
   */
  public Adapter createUMLModelReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.language.usecase.usecase.Test <em>Test</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cooperateproject.modeling.language.usecase.usecase.Test
   * @generated
   */
  public Adapter createTestAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.language.usecase.usecase.Test2 <em>Test2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cooperateproject.modeling.language.usecase.usecase.Test2
   * @generated
   */
  public Adapter createTest2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.language.usecase.usecase.Commentable <em>Commentable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cooperateproject.modeling.language.usecase.usecase.Commentable
   * @generated
   */
  public Adapter createCommentableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.language.usecase.usecase.Actor <em>Actor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cooperateproject.modeling.language.usecase.usecase.Actor
   * @generated
   */
  public Adapter createActorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.language.usecase.usecase.System <em>System</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cooperateproject.modeling.language.usecase.usecase.System
   * @generated
   */
  public Adapter createSystemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.language.usecase.usecase.UseCase <em>Use Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cooperateproject.modeling.language.usecase.usecase.UseCase
   * @generated
   */
  public Adapter createUseCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.language.usecase.usecase.ExtensionPoint <em>Extension Point</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cooperateproject.modeling.language.usecase.usecase.ExtensionPoint
   * @generated
   */
  public Adapter createExtensionPointAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.language.usecase.usecase.Extension <em>Extension</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cooperateproject.modeling.language.usecase.usecase.Extension
   * @generated
   */
  public Adapter createExtensionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.language.usecase.usecase.Include <em>Include</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cooperateproject.modeling.language.usecase.usecase.Include
   * @generated
   */
  public Adapter createIncludeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.language.usecase.usecase.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cooperateproject.modeling.language.usecase.usecase.Constraint
   * @generated
   */
  public Adapter createConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.language.usecase.usecase.Association <em>Association</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cooperateproject.modeling.language.usecase.usecase.Association
   * @generated
   */
  public Adapter createAssociationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.language.usecase.usecase.Multiplicity <em>Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cooperateproject.modeling.language.usecase.usecase.Multiplicity
   * @generated
   */
  public Adapter createMultiplicityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //UsecaseAdapterFactory
