/**
 */
package domain.ppu.ppuinterfaces.impl;

import domain.aps.interfaces.impl.ScrewingImpl;

import domain.ppu.ppuinterfaces.PpuinterfacesPackage;
import domain.ppu.ppuinterfaces.ScrewingMotor;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Screwing Motor</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ScrewingMotorImpl extends ScrewingImpl implements ScrewingMotor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScrewingMotorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PpuinterfacesPackage.Literals.SCREWING_MOTOR;
	}

} //ScrewingMotorImpl
