/**
 */
package quality.aps_ppu_mm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import quality.aps_ppu_mm.Aps_ppu_mmPackage;
import quality.aps_ppu_mm.ModifyMicroSwitchModule;

import quality.as_mm.impl.ModifyModuleImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modify Micro Switch Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link quality.aps_ppu_mm.impl.ModifyMicroSwitchModuleImpl#isIsReplaced <em>Is Replaced</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModifyMicroSwitchModuleImpl extends ModifyModuleImpl<domain.as.ModuleRepository.Module> implements ModifyMicroSwitchModule {
	/**
	 * The default value of the '{@link #isIsReplaced() <em>Is Replaced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReplaced()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REPLACED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsReplaced() <em>Is Replaced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReplaced()
	 * @generated
	 * @ordered
	 */
	protected boolean isReplaced = IS_REPLACED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifyMicroSwitchModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aps_ppu_mmPackage.Literals.MODIFY_MICRO_SWITCH_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsReplaced() {
		return isReplaced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReplaced(boolean newIsReplaced) {
		boolean oldIsReplaced = isReplaced;
		isReplaced = newIsReplaced;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aps_ppu_mmPackage.MODIFY_MICRO_SWITCH_MODULE__IS_REPLACED, oldIsReplaced, isReplaced));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aps_ppu_mmPackage.MODIFY_MICRO_SWITCH_MODULE__IS_REPLACED:
				return isIsReplaced();
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
			case Aps_ppu_mmPackage.MODIFY_MICRO_SWITCH_MODULE__IS_REPLACED:
				setIsReplaced((Boolean)newValue);
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
			case Aps_ppu_mmPackage.MODIFY_MICRO_SWITCH_MODULE__IS_REPLACED:
				setIsReplaced(IS_REPLACED_EDEFAULT);
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
			case Aps_ppu_mmPackage.MODIFY_MICRO_SWITCH_MODULE__IS_REPLACED:
				return isReplaced != IS_REPLACED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isReplaced: ");
		result.append(isReplaced);
		result.append(')');
		return result.toString();
	}

} //ModifyMicroSwitchModuleImpl
