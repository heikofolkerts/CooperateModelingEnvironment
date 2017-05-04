/**
 * generated by Xtext 2.11.0
 */
package de.cooperateproject.modeling.textual.sequence.sequence.impl;

import de.cooperateproject.modeling.textual.sequence.sequence.Actor;
import de.cooperateproject.modeling.textual.sequence.sequence.ActorType;
import de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Classifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequence.impl.ActorImpl#isDeferred <em>Deferred</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequence.impl.ActorImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequence.impl.ActorImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequence.impl.ActorImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequence.impl.ActorImpl#getActorType <em>Actor Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActorImpl extends MinimalEObjectImpl.Container implements Actor
{
  /**
   * The default value of the '{@link #isDeferred() <em>Deferred</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDeferred()
   * @generated
   * @ordered
   */
  protected static final boolean DEFERRED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDeferred() <em>Deferred</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDeferred()
   * @generated
   * @ordered
   */
  protected boolean deferred = DEFERRED_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Classifier type;

  /**
   * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlias()
   * @generated
   * @ordered
   */
  protected static final String ALIAS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlias()
   * @generated
   * @ordered
   */
  protected String alias = ALIAS_EDEFAULT;

  /**
   * The default value of the '{@link #getActorType() <em>Actor Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActorType()
   * @generated
   * @ordered
   */
  protected static final ActorType ACTOR_TYPE_EDEFAULT = ActorType.HUMAN;

  /**
   * The cached value of the '{@link #getActorType() <em>Actor Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActorType()
   * @generated
   * @ordered
   */
  protected ActorType actorType = ACTOR_TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActorImpl()
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
    return SequencePackage.Literals.ACTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDeferred()
  {
    return deferred;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeferred(boolean newDeferred)
  {
    boolean oldDeferred = deferred;
    deferred = newDeferred;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SequencePackage.ACTOR__DEFERRED, oldDeferred, deferred));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SequencePackage.ACTOR__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Classifier getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (Classifier)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SequencePackage.ACTOR__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Classifier basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Classifier newType)
  {
    Classifier oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SequencePackage.ACTOR__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAlias()
  {
    return alias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlias(String newAlias)
  {
    String oldAlias = alias;
    alias = newAlias;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SequencePackage.ACTOR__ALIAS, oldAlias, alias));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActorType getActorType()
  {
    return actorType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActorType(ActorType newActorType)
  {
    ActorType oldActorType = actorType;
    actorType = newActorType == null ? ACTOR_TYPE_EDEFAULT : newActorType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SequencePackage.ACTOR__ACTOR_TYPE, oldActorType, actorType));
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
      case SequencePackage.ACTOR__DEFERRED:
        return isDeferred();
      case SequencePackage.ACTOR__NAME:
        return getName();
      case SequencePackage.ACTOR__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case SequencePackage.ACTOR__ALIAS:
        return getAlias();
      case SequencePackage.ACTOR__ACTOR_TYPE:
        return getActorType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SequencePackage.ACTOR__DEFERRED:
        setDeferred((Boolean)newValue);
        return;
      case SequencePackage.ACTOR__NAME:
        setName((String)newValue);
        return;
      case SequencePackage.ACTOR__TYPE:
        setType((Classifier)newValue);
        return;
      case SequencePackage.ACTOR__ALIAS:
        setAlias((String)newValue);
        return;
      case SequencePackage.ACTOR__ACTOR_TYPE:
        setActorType((ActorType)newValue);
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
      case SequencePackage.ACTOR__DEFERRED:
        setDeferred(DEFERRED_EDEFAULT);
        return;
      case SequencePackage.ACTOR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SequencePackage.ACTOR__TYPE:
        setType((Classifier)null);
        return;
      case SequencePackage.ACTOR__ALIAS:
        setAlias(ALIAS_EDEFAULT);
        return;
      case SequencePackage.ACTOR__ACTOR_TYPE:
        setActorType(ACTOR_TYPE_EDEFAULT);
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
      case SequencePackage.ACTOR__DEFERRED:
        return deferred != DEFERRED_EDEFAULT;
      case SequencePackage.ACTOR__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SequencePackage.ACTOR__TYPE:
        return type != null;
      case SequencePackage.ACTOR__ALIAS:
        return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
      case SequencePackage.ACTOR__ACTOR_TYPE:
        return actorType != ACTOR_TYPE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (deferred: ");
    result.append(deferred);
    result.append(", name: ");
    result.append(name);
    result.append(", alias: ");
    result.append(alias);
    result.append(", actorType: ");
    result.append(actorType);
    result.append(')');
    return result.toString();
  }

} //ActorImpl
