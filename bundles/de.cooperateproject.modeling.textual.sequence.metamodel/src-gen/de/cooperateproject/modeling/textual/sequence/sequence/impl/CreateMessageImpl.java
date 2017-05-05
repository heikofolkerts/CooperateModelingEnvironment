/**
 * generated by Xtext 2.11.0
 */
package de.cooperateproject.modeling.textual.sequence.sequence.impl;

import de.cooperateproject.modeling.textual.sequence.sequence.Actor;
import de.cooperateproject.modeling.textual.sequence.sequence.CreateMessage;
import de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequence.impl.CreateMessageImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequence.impl.CreateMessageImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateMessageImpl extends MessageImpl implements CreateMessage {
    /**
     * The cached value of the '{@link #getLeft() <em>Left</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLeft()
     * @generated
     * @ordered
     */
    protected Actor left;

    /**
     * The cached value of the '{@link #getRight() <em>Right</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRight()
     * @generated
     * @ordered
     */
    protected Actor right;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CreateMessageImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SequencePackage.Literals.CREATE_MESSAGE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Actor getLeft() {
        if (left != null && ((EObject)left).eIsProxy()) {
            InternalEObject oldLeft = (InternalEObject)left;
            left = (Actor)eResolveProxy(oldLeft);
            if (left != oldLeft) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SequencePackage.CREATE_MESSAGE__LEFT, oldLeft, left));
            }
        }
        return left;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Actor basicGetLeft() {
        return left;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLeft(Actor newLeft) {
        Actor oldLeft = left;
        left = newLeft;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SequencePackage.CREATE_MESSAGE__LEFT, oldLeft, left));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Actor getRight() {
        if (right != null && ((EObject)right).eIsProxy()) {
            InternalEObject oldRight = (InternalEObject)right;
            right = (Actor)eResolveProxy(oldRight);
            if (right != oldRight) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SequencePackage.CREATE_MESSAGE__RIGHT, oldRight, right));
            }
        }
        return right;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Actor basicGetRight() {
        return right;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRight(Actor newRight) {
        Actor oldRight = right;
        right = newRight;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SequencePackage.CREATE_MESSAGE__RIGHT, oldRight, right));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SequencePackage.CREATE_MESSAGE__LEFT:
                if (resolve) return getLeft();
                return basicGetLeft();
            case SequencePackage.CREATE_MESSAGE__RIGHT:
                if (resolve) return getRight();
                return basicGetRight();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case SequencePackage.CREATE_MESSAGE__LEFT:
                setLeft((Actor)newValue);
                return;
            case SequencePackage.CREATE_MESSAGE__RIGHT:
                setRight((Actor)newValue);
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
    public void eUnset(int featureID) {
        switch (featureID) {
            case SequencePackage.CREATE_MESSAGE__LEFT:
                setLeft((Actor)null);
                return;
            case SequencePackage.CREATE_MESSAGE__RIGHT:
                setRight((Actor)null);
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
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case SequencePackage.CREATE_MESSAGE__LEFT:
                return left != null;
            case SequencePackage.CREATE_MESSAGE__RIGHT:
                return right != null;
        }
        return super.eIsSet(featureID);
    }

} //CreateMessageImpl
