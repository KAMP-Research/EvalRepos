/**
 */
package domain.ppu.ppuinterfaces.impl;

import domain.aps.interfaces.impl.SuspensionImpl;

import domain.ppu.ppuinterfaces.PpuinterfacesPackage;
import domain.ppu.ppuinterfaces.SuspensionArm;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Suspension Arm</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class SuspensionArmImpl extends SuspensionImpl implements SuspensionArm {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuspensionArmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PpuinterfacesPackage.Literals.SUSPENSION_ARM;
	}

} //SuspensionArmImpl
