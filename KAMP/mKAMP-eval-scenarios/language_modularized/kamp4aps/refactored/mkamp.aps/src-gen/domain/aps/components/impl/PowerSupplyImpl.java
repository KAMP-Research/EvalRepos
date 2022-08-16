/**
 */
package domain.aps.components.impl;

import domain.aps.components.ComponentsPackage;
import domain.aps.components.PowerSupply;

import domain.as.ComponentRepository.impl.ComponentImpl;

import domain.as.InterfaceRepository.Interface;
import domain.as.InterfaceRepository.InterfaceRepositoryPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import paradigm.basic.Entity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Power Supply</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link domain.aps.components.impl.PowerSupplyImpl#getParentElement <em>Parent Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PowerSupplyImpl extends ComponentImpl implements PowerSupply {
	/**
	 * The cached value of the '{@link #getParentElement() <em>Parent Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> parentElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerSupplyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentsPackage.Literals.POWER_SUPPLY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getParentElement() {
		if (parentElement == null) {
			parentElement = new EObjectResolvingEList<Entity>(Entity.class, this, ComponentsPackage.POWER_SUPPLY__PARENT_ELEMENT);
		}
		return parentElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentsPackage.POWER_SUPPLY__PARENT_ELEMENT:
				return getParentElement();
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
			case ComponentsPackage.POWER_SUPPLY__PARENT_ELEMENT:
				getParentElement().clear();
				getParentElement().addAll((Collection<? extends Entity>)newValue);
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
			case ComponentsPackage.POWER_SUPPLY__PARENT_ELEMENT:
				getParentElement().clear();
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
			case ComponentsPackage.POWER_SUPPLY__PARENT_ELEMENT:
				return parentElement != null && !parentElement.isEmpty();
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
		if (baseClass == Interface.class) {
			switch (derivedFeatureID) {
				case ComponentsPackage.POWER_SUPPLY__PARENT_ELEMENT: return InterfaceRepositoryPackage.INTERFACE__PARENT_ELEMENT;
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
		if (baseClass == Interface.class) {
			switch (baseFeatureID) {
				case InterfaceRepositoryPackage.INTERFACE__PARENT_ELEMENT: return ComponentsPackage.POWER_SUPPLY__PARENT_ELEMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //PowerSupplyImpl
