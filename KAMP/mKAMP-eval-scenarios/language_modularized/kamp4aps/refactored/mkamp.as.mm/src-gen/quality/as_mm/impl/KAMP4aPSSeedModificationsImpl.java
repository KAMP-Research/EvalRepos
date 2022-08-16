/**
 */
package quality.as_mm.impl;

import domain.as.ComponentRepository.Component;

import domain.as.InterfaceRepository.Interface;

import domain.as.StructureRepository.Structure;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import paradigm.modificationmarks.impl.AbstractSeedModificationsImpl;

import quality.as_mm.As_mmPackage;
import quality.as_mm.KAMP4aPSSeedModifications;
import quality.as_mm.ModifyComponent;
import quality.as_mm.ModifyInterface;
import quality.as_mm.ModifyModule;
import quality.as_mm.ModifyStructure;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KAMP 4a PS Seed Modifications</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link quality.as_mm.impl.KAMP4aPSSeedModificationsImpl#getStructureModifications <em>Structure Modifications</em>}</li>
 *   <li>{@link quality.as_mm.impl.KAMP4aPSSeedModificationsImpl#getModuleModifications <em>Module Modifications</em>}</li>
 *   <li>{@link quality.as_mm.impl.KAMP4aPSSeedModificationsImpl#getComponentModifications <em>Component Modifications</em>}</li>
 *   <li>{@link quality.as_mm.impl.KAMP4aPSSeedModificationsImpl#getInterfaceModifications <em>Interface Modifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KAMP4aPSSeedModificationsImpl extends AbstractSeedModificationsImpl implements KAMP4aPSSeedModifications {
	/**
	 * The cached value of the '{@link #getStructureModifications() <em>Structure Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifyStructure<Structure>> structureModifications;

	/**
	 * The cached value of the '{@link #getModuleModifications() <em>Module Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifyModule<domain.as.ModuleRepository.Module>> moduleModifications;

	/**
	 * The cached value of the '{@link #getComponentModifications() <em>Component Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifyComponent<Component>> componentModifications;

	/**
	 * The cached value of the '{@link #getInterfaceModifications() <em>Interface Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifyInterface<Interface>> interfaceModifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KAMP4aPSSeedModificationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return As_mmPackage.Literals.KAMP_4A_PS_SEED_MODIFICATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifyStructure<Structure>> getStructureModifications() {
		if (structureModifications == null) {
			structureModifications = new EObjectContainmentEList<ModifyStructure<Structure>>(ModifyStructure.class, this, As_mmPackage.KAMP_4A_PS_SEED_MODIFICATIONS__STRUCTURE_MODIFICATIONS);
		}
		return structureModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifyModule<domain.as.ModuleRepository.Module>> getModuleModifications() {
		if (moduleModifications == null) {
			moduleModifications = new EObjectContainmentEList<ModifyModule<domain.as.ModuleRepository.Module>>(ModifyModule.class, this, As_mmPackage.KAMP_4A_PS_SEED_MODIFICATIONS__MODULE_MODIFICATIONS);
		}
		return moduleModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifyComponent<Component>> getComponentModifications() {
		if (componentModifications == null) {
			componentModifications = new EObjectContainmentEList<ModifyComponent<Component>>(ModifyComponent.class, this, As_mmPackage.KAMP_4A_PS_SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS);
		}
		return componentModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifyInterface<Interface>> getInterfaceModifications() {
		if (interfaceModifications == null) {
			interfaceModifications = new EObjectContainmentEList<ModifyInterface<Interface>>(ModifyInterface.class, this, As_mmPackage.KAMP_4A_PS_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS);
		}
		return interfaceModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case As_mmPackage.KAMP_4A_PS_SEED_MODIFICATIONS__STRUCTURE_MODIFICATIONS:
				return ((InternalEList<?>)getStructureModifications()).basicRemove(otherEnd, msgs);
			case As_mmPackage.KAMP_4A_PS_SEED_MODIFICATIONS__MODULE_MODIFICATIONS:
				return ((InternalEList<?>)getModuleModifications()).basicRemove(otherEnd, msgs);
			case As_mmPackage.KAMP_4A_PS_SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS:
				return ((InternalEList<?>)getComponentModifications()).basicRemove(otherEnd, msgs);
			case As_mmPackage.KAMP_4A_PS_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS:
				return ((InternalEList<?>)getInterfaceModifications()).basicRemove(otherEnd, msgs);
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
			case As_mmPackage.KAMP_4A_PS_SEED_MODIFICATIONS__STRUCTURE_MODIFICATIONS:
				return getStructureModifications();
			case As_mmPackage.KAMP_4A_PS_SEED_MODIFICATIONS__MODULE_MODIFICATIONS:
				return getModuleModifications();
			case As_mmPackage.KAMP_4A_PS_SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS:
				return getComponentModifications();
			case As_mmPackage.KAMP_4A_PS_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS:
				return getInterfaceModifications();
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
			case As_mmPackage.KAMP_4A_PS_SEED_MODIFICATIONS__STRUCTURE_MODIFICATIONS:
				getStructureModifications().clear();
				getStructureModifications().addAll((Collection<? extends ModifyStructure<Structure>>)newValue);
				return;
			case As_mmPackage.KAMP_4A_PS_SEED_MODIFICATIONS__MODULE_MODIFICATIONS:
				getModuleModifications().clear();
				getModuleModifications().addAll((Collection<? extends ModifyModule<domain.as.ModuleRepository.Module>>)newValue);
				return;
			case As_mmPackage.KAMP_4A_PS_SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS:
				getComponentModifications().clear();
				getComponentModifications().addAll((Collection<? extends ModifyComponent<Component>>)newValue);
				return;
			case As_mmPackage.KAMP_4A_PS_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS:
				getInterfaceModifications().clear();
				getInterfaceModifications().addAll((Collection<? extends ModifyInterface<Interface>>)newValue);
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
			case As_mmPackage.KAMP_4A_PS_SEED_MODIFICATIONS__STRUCTURE_MODIFICATIONS:
				getStructureModifications().clear();
				return;
			case As_mmPackage.KAMP_4A_PS_SEED_MODIFICATIONS__MODULE_MODIFICATIONS:
				getModuleModifications().clear();
				return;
			case As_mmPackage.KAMP_4A_PS_SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS:
				getComponentModifications().clear();
				return;
			case As_mmPackage.KAMP_4A_PS_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS:
				getInterfaceModifications().clear();
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
			case As_mmPackage.KAMP_4A_PS_SEED_MODIFICATIONS__STRUCTURE_MODIFICATIONS:
				return structureModifications != null && !structureModifications.isEmpty();
			case As_mmPackage.KAMP_4A_PS_SEED_MODIFICATIONS__MODULE_MODIFICATIONS:
				return moduleModifications != null && !moduleModifications.isEmpty();
			case As_mmPackage.KAMP_4A_PS_SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS:
				return componentModifications != null && !componentModifications.isEmpty();
			case As_mmPackage.KAMP_4A_PS_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS:
				return interfaceModifications != null && !interfaceModifications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //KAMP4aPSSeedModificationsImpl
