/**
 */
package domain.ppu.ppuinterfaces.impl;

import domain.aps.interfaces.impl.SuspensionImpl;

import domain.ppu.ppuinterfaces.PpuinterfacesPackage;
import domain.ppu.ppuinterfaces.SuspensionRack;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Suspension Rack</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class SuspensionRackImpl extends SuspensionImpl implements SuspensionRack {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuspensionRackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PpuinterfacesPackage.Literals.SUSPENSION_RACK;
	}

} //SuspensionRackImpl
