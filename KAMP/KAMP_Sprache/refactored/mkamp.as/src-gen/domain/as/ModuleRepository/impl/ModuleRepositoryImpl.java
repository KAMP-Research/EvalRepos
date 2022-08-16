/**
 */
package domain.as.ModuleRepository.impl;

import domain.as.ModuleRepository.ModuleRepository;
import domain.as.ModuleRepository.ModuleRepositoryPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import paradigm.basic.impl.EntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link domain.as.ModuleRepository.impl.ModuleRepositoryImpl#getAllModulesInPlant <em>All Modules In Plant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleRepositoryImpl extends EntityImpl implements ModuleRepository {
	/**
	 * The cached value of the '{@link #getAllModulesInPlant() <em>All Modules In Plant</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllModulesInPlant()
	 * @generated
	 * @ordered
	 */
	protected EList<domain.as.ModuleRepository.Module> allModulesInPlant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModuleRepositoryPackage.Literals.MODULE_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<domain.as.ModuleRepository.Module> getAllModulesInPlant() {
		if (allModulesInPlant == null) {
			allModulesInPlant = new EObjectResolvingEList<domain.as.ModuleRepository.Module>(domain.as.ModuleRepository.Module.class, this, ModuleRepositoryPackage.MODULE_REPOSITORY__ALL_MODULES_IN_PLANT);
		}
		return allModulesInPlant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModuleRepositoryPackage.MODULE_REPOSITORY__ALL_MODULES_IN_PLANT:
				return getAllModulesInPlant();
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
			case ModuleRepositoryPackage.MODULE_REPOSITORY__ALL_MODULES_IN_PLANT:
				getAllModulesInPlant().clear();
				getAllModulesInPlant().addAll((Collection<? extends domain.as.ModuleRepository.Module>)newValue);
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
			case ModuleRepositoryPackage.MODULE_REPOSITORY__ALL_MODULES_IN_PLANT:
				getAllModulesInPlant().clear();
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
			case ModuleRepositoryPackage.MODULE_REPOSITORY__ALL_MODULES_IN_PLANT:
				return allModulesInPlant != null && !allModulesInPlant.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModuleRepositoryImpl
