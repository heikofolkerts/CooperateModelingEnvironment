/**
 */
package de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageImport;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.PackageBaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.PackageBaseImpl#getOwningPackage <em>Owning Package</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.PackageBaseImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.PackageBaseImpl#getPackageImports <em>Package Imports</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PackageBaseImpl<PackageType extends PackageBase<?>> extends UMLReferencingElementImpl<org.eclipse.uml2.uml.Package> implements PackageBase<PackageType> {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextualCommonsPackage.Literals.PACKAGE_BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setReferencedElement(org.eclipse.uml2.uml.Package newReferencedElement) {
		super.setReferencedElement(newReferencedElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(TextualCommonsPackage.PACKAGE_BASE__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(TextualCommonsPackage.PACKAGE_BASE__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public PackageType getOwningPackage() {
		return (PackageType)eDynamicGet(TextualCommonsPackage.PACKAGE_BASE__OWNING_PACKAGE, TextualCommonsPackage.Literals.PACKAGE_BASE__OWNING_PACKAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningPackage(PackageType newOwningPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningPackage, TextualCommonsPackage.PACKAGE_BASE__OWNING_PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningPackage(PackageType newOwningPackage) {
		eDynamicSet(TextualCommonsPackage.PACKAGE_BASE__OWNING_PACKAGE, TextualCommonsPackage.Literals.PACKAGE_BASE__OWNING_PACKAGE, newOwningPackage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PackageType> getPackages() {
		return (EList<PackageType>)eDynamicGet(TextualCommonsPackage.PACKAGE_BASE__PACKAGES, TextualCommonsPackage.Literals.PACKAGE_BASE__PACKAGES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PackageImport> getPackageImports() {
		return (EList<PackageImport>)eDynamicGet(TextualCommonsPackage.PACKAGE_BASE__PACKAGE_IMPORTS, TextualCommonsPackage.Literals.PACKAGE_BASE__PACKAGE_IMPORTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextualCommonsPackage.PACKAGE_BASE__OWNING_PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningPackage((PackageType)otherEnd, msgs);
			case TextualCommonsPackage.PACKAGE_BASE__PACKAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackages()).basicAdd(otherEnd, msgs);
			case TextualCommonsPackage.PACKAGE_BASE__PACKAGE_IMPORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackageImports()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextualCommonsPackage.PACKAGE_BASE__OWNING_PACKAGE:
				return basicSetOwningPackage(null, msgs);
			case TextualCommonsPackage.PACKAGE_BASE__PACKAGES:
				return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
			case TextualCommonsPackage.PACKAGE_BASE__PACKAGE_IMPORTS:
				return ((InternalEList<?>)getPackageImports()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case TextualCommonsPackage.PACKAGE_BASE__OWNING_PACKAGE:
				return eInternalContainer().eInverseRemove(this, TextualCommonsPackage.PACKAGE_BASE__PACKAGES, PackageBase.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TextualCommonsPackage.PACKAGE_BASE__NAME:
				return getName();
			case TextualCommonsPackage.PACKAGE_BASE__OWNING_PACKAGE:
				return getOwningPackage();
			case TextualCommonsPackage.PACKAGE_BASE__PACKAGES:
				return getPackages();
			case TextualCommonsPackage.PACKAGE_BASE__PACKAGE_IMPORTS:
				return getPackageImports();
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
			case TextualCommonsPackage.PACKAGE_BASE__NAME:
				setName((String)newValue);
				return;
			case TextualCommonsPackage.PACKAGE_BASE__OWNING_PACKAGE:
				setOwningPackage((PackageType)newValue);
				return;
			case TextualCommonsPackage.PACKAGE_BASE__PACKAGES:
				getPackages().clear();
				getPackages().addAll((Collection<? extends PackageType>)newValue);
				return;
			case TextualCommonsPackage.PACKAGE_BASE__PACKAGE_IMPORTS:
				getPackageImports().clear();
				getPackageImports().addAll((Collection<? extends PackageImport>)newValue);
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
			case TextualCommonsPackage.PACKAGE_BASE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TextualCommonsPackage.PACKAGE_BASE__OWNING_PACKAGE:
				setOwningPackage((PackageType)null);
				return;
			case TextualCommonsPackage.PACKAGE_BASE__PACKAGES:
				getPackages().clear();
				return;
			case TextualCommonsPackage.PACKAGE_BASE__PACKAGE_IMPORTS:
				getPackageImports().clear();
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
			case TextualCommonsPackage.PACKAGE_BASE__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case TextualCommonsPackage.PACKAGE_BASE__OWNING_PACKAGE:
				return getOwningPackage() != null;
			case TextualCommonsPackage.PACKAGE_BASE__PACKAGES:
				return !getPackages().isEmpty();
			case TextualCommonsPackage.PACKAGE_BASE__PACKAGE_IMPORTS:
				return !getPackageImports().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case TextualCommonsPackage.PACKAGE_BASE__NAME: return TextualCommonsPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case TextualCommonsPackage.NAMED_ELEMENT__NAME: return TextualCommonsPackage.PACKAGE_BASE__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //PackageBaseImpl