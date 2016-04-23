/**
 * generated by Xtext 2.9.0
 */
package de.cooperateproject.modeling.language.usecase.usecase.impl;

import de.cooperateproject.modeling.language.usecase.usecase.Extension;
import de.cooperateproject.modeling.language.usecase.usecase.ExtensionPoint;
import de.cooperateproject.modeling.language.usecase.usecase.Include;
import de.cooperateproject.modeling.language.usecase.usecase.UseCase;
import de.cooperateproject.modeling.language.usecase.usecase.UsecasePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.language.usecase.usecase.impl.UseCaseImpl#getBaseUseCases <em>Base Use Cases</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.language.usecase.usecase.impl.UseCaseImpl#getExtensionPoints <em>Extension Points</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.language.usecase.usecase.impl.UseCaseImpl#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.language.usecase.usecase.impl.UseCaseImpl#getIncludes <em>Includes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UseCaseImpl extends CommentableImpl implements UseCase
{
  /**
   * The cached value of the '{@link #getBaseUseCases() <em>Base Use Cases</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseUseCases()
   * @generated
   * @ordered
   */
  protected EList<UseCase> baseUseCases;

  /**
   * The cached value of the '{@link #getExtensionPoints() <em>Extension Points</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtensionPoints()
   * @generated
   * @ordered
   */
  protected EList<ExtensionPoint> extensionPoints;

  /**
   * The cached value of the '{@link #getExtensions() <em>Extensions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtensions()
   * @generated
   * @ordered
   */
  protected EList<Extension> extensions;

  /**
   * The cached value of the '{@link #getIncludes() <em>Includes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludes()
   * @generated
   * @ordered
   */
  protected EList<Include> includes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UseCaseImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return UsecasePackage.Literals.USE_CASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UseCase> getBaseUseCases()
  {
    if (baseUseCases == null)
    {
      baseUseCases = new EObjectResolvingEList<UseCase>(UseCase.class, this, UsecasePackage.USE_CASE__BASE_USE_CASES);
    }
    return baseUseCases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExtensionPoint> getExtensionPoints()
  {
    if (extensionPoints == null)
    {
      extensionPoints = new EObjectContainmentEList<ExtensionPoint>(ExtensionPoint.class, this, UsecasePackage.USE_CASE__EXTENSION_POINTS);
    }
    return extensionPoints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Extension> getExtensions()
  {
    if (extensions == null)
    {
      extensions = new EObjectContainmentEList<Extension>(Extension.class, this, UsecasePackage.USE_CASE__EXTENSIONS);
    }
    return extensions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Include> getIncludes()
  {
    if (includes == null)
    {
      includes = new EObjectContainmentEList<Include>(Include.class, this, UsecasePackage.USE_CASE__INCLUDES);
    }
    return includes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case UsecasePackage.USE_CASE__EXTENSION_POINTS:
        return ((InternalEList<?>)getExtensionPoints()).basicRemove(otherEnd, msgs);
      case UsecasePackage.USE_CASE__EXTENSIONS:
        return ((InternalEList<?>)getExtensions()).basicRemove(otherEnd, msgs);
      case UsecasePackage.USE_CASE__INCLUDES:
        return ((InternalEList<?>)getIncludes()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case UsecasePackage.USE_CASE__BASE_USE_CASES:
        return getBaseUseCases();
      case UsecasePackage.USE_CASE__EXTENSION_POINTS:
        return getExtensionPoints();
      case UsecasePackage.USE_CASE__EXTENSIONS:
        return getExtensions();
      case UsecasePackage.USE_CASE__INCLUDES:
        return getIncludes();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case UsecasePackage.USE_CASE__BASE_USE_CASES:
        getBaseUseCases().clear();
        getBaseUseCases().addAll((Collection<? extends UseCase>)newValue);
        return;
      case UsecasePackage.USE_CASE__EXTENSION_POINTS:
        getExtensionPoints().clear();
        getExtensionPoints().addAll((Collection<? extends ExtensionPoint>)newValue);
        return;
      case UsecasePackage.USE_CASE__EXTENSIONS:
        getExtensions().clear();
        getExtensions().addAll((Collection<? extends Extension>)newValue);
        return;
      case UsecasePackage.USE_CASE__INCLUDES:
        getIncludes().clear();
        getIncludes().addAll((Collection<? extends Include>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case UsecasePackage.USE_CASE__BASE_USE_CASES:
        getBaseUseCases().clear();
        return;
      case UsecasePackage.USE_CASE__EXTENSION_POINTS:
        getExtensionPoints().clear();
        return;
      case UsecasePackage.USE_CASE__EXTENSIONS:
        getExtensions().clear();
        return;
      case UsecasePackage.USE_CASE__INCLUDES:
        getIncludes().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case UsecasePackage.USE_CASE__BASE_USE_CASES:
        return baseUseCases != null && !baseUseCases.isEmpty();
      case UsecasePackage.USE_CASE__EXTENSION_POINTS:
        return extensionPoints != null && !extensionPoints.isEmpty();
      case UsecasePackage.USE_CASE__EXTENSIONS:
        return extensions != null && !extensions.isEmpty();
      case UsecasePackage.USE_CASE__INCLUDES:
        return includes != null && !includes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //UseCaseImpl
