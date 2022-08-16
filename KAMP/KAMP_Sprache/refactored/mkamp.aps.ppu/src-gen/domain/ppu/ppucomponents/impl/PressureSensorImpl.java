/**
 */
package domain.ppu.ppucomponents.impl;

import domain.aps.components.impl.SensorImpl;

import domain.ppu.ppucomponents.PpucomponentsPackage;
import domain.ppu.ppucomponents.PressureSensor;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pressure Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PressureSensorImpl extends SensorImpl implements PressureSensor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PressureSensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PpucomponentsPackage.Literals.PRESSURE_SENSOR;
	}

} //PressureSensorImpl
