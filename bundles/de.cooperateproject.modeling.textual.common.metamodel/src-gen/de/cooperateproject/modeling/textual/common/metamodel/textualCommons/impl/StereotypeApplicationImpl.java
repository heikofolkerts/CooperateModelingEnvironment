/**
 */
package de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.StereotypeApplication;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TaggedValue;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stereotype Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.StereotypeApplicationImpl#getReferencedElement <em>Referenced Element</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.StereotypeApplicationImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.StereotypeApplicationImpl#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StereotypeApplicationImpl extends CDOObjectImpl implements StereotypeApplication {
    /**
     * The default value of the '{@link #getStereotype() <em>Stereotype</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStereotype()
     * @generated
     * @ordered
     */
    protected static final String STEREOTYPE_EDEFAULT = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StereotypeApplicationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TextualCommonsPackage.Literals.STEREOTYPE_APPLICATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EObject getReferencedElement() {
        return (EObject)eDynamicGet(TextualCommonsPackage.STEREOTYPE_APPLICATION__REFERENCED_ELEMENT, TextualCommonsPackage.Literals.STEREOTYPE_APPLICATION__REFERENCED_ELEMENT, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EObject basicGetReferencedElement() {
        return (EObject)eDynamicGet(TextualCommonsPackage.STEREOTYPE_APPLICATION__REFERENCED_ELEMENT, TextualCommonsPackage.Literals.STEREOTYPE_APPLICATION__REFERENCED_ELEMENT, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReferencedElement(EObject newReferencedElement) {
        eDynamicSet(TextualCommonsPackage.STEREOTYPE_APPLICATION__REFERENCED_ELEMENT, TextualCommonsPackage.Literals.STEREOTYPE_APPLICATION__REFERENCED_ELEMENT, newReferencedElement);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getStereotype() {
        return (String)eDynamicGet(TextualCommonsPackage.STEREOTYPE_APPLICATION__STEREOTYPE, TextualCommonsPackage.Literals.STEREOTYPE_APPLICATION__STEREOTYPE, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStereotype(String newStereotype) {
        eDynamicSet(TextualCommonsPackage.STEREOTYPE_APPLICATION__STEREOTYPE, TextualCommonsPackage.Literals.STEREOTYPE_APPLICATION__STEREOTYPE, newStereotype);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetStereotype() {
        eDynamicUnset(TextualCommonsPackage.STEREOTYPE_APPLICATION__STEREOTYPE, TextualCommonsPackage.Literals.STEREOTYPE_APPLICATION__STEREOTYPE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetStereotype() {
        return eDynamicIsSet(TextualCommonsPackage.STEREOTYPE_APPLICATION__STEREOTYPE, TextualCommonsPackage.Literals.STEREOTYPE_APPLICATION__STEREOTYPE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<TaggedValue> getValues() {
        return (EList<TaggedValue>)eDynamicGet(TextualCommonsPackage.STEREOTYPE_APPLICATION__VALUES, TextualCommonsPackage.Literals.STEREOTYPE_APPLICATION__VALUES, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TextualCommonsPackage.STEREOTYPE_APPLICATION__VALUES:
                return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TextualCommonsPackage.STEREOTYPE_APPLICATION__REFERENCED_ELEMENT:
                if (resolve) return getReferencedElement();
                return basicGetReferencedElement();
            case TextualCommonsPackage.STEREOTYPE_APPLICATION__STEREOTYPE:
                return getStereotype();
            case TextualCommonsPackage.STEREOTYPE_APPLICATION__VALUES:
                return getValues();
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
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case TextualCommonsPackage.STEREOTYPE_APPLICATION__REFERENCED_ELEMENT:
                setReferencedElement((EObject)newValue);
                return;
            case TextualCommonsPackage.STEREOTYPE_APPLICATION__STEREOTYPE:
                setStereotype((String)newValue);
                return;
            case TextualCommonsPackage.STEREOTYPE_APPLICATION__VALUES:
                getValues().clear();
                getValues().addAll((Collection<? extends TaggedValue>)newValue);
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
            case TextualCommonsPackage.STEREOTYPE_APPLICATION__REFERENCED_ELEMENT:
                setReferencedElement((EObject)null);
                return;
            case TextualCommonsPackage.STEREOTYPE_APPLICATION__STEREOTYPE:
                unsetStereotype();
                return;
            case TextualCommonsPackage.STEREOTYPE_APPLICATION__VALUES:
                getValues().clear();
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
            case TextualCommonsPackage.STEREOTYPE_APPLICATION__REFERENCED_ELEMENT:
                return basicGetReferencedElement() != null;
            case TextualCommonsPackage.STEREOTYPE_APPLICATION__STEREOTYPE:
                return isSetStereotype();
            case TextualCommonsPackage.STEREOTYPE_APPLICATION__VALUES:
                return !getValues().isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //StereotypeApplicationImpl
