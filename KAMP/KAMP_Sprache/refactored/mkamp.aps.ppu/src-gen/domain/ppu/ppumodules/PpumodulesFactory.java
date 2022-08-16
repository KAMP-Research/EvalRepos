/**
 */
package domain.ppu.ppumodules;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see domain.ppu.ppumodules.PpumodulesPackage
 * @generated
 */
public interface PpumodulesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PpumodulesFactory eINSTANCE = domain.ppu.ppumodules.impl.PpumodulesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Potentiometer Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Potentiometer Module</em>'.
	 * @generated
	 */
	PotentiometerModule createPotentiometerModule();

	/**
	 * Returns a new object of class '<em>Inductive Sensor Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inductive Sensor Module</em>'.
	 * @generated
	 */
	InductiveSensorModule createInductiveSensorModule();

	/**
	 * Returns a new object of class '<em>Pressure Sensor Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pressure Sensor Module</em>'.
	 * @generated
	 */
	PressureSensorModule createPressureSensorModule();

	/**
	 * Returns a new object of class '<em>Pusher Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pusher Module</em>'.
	 * @generated
	 */
	PusherModule createPusherModule();

	/**
	 * Returns a new object of class '<em>Ramp Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ramp Module</em>'.
	 * @generated
	 */
	RampModule createRampModule();

	/**
	 * Returns a new object of class '<em>Microswitch Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Microswitch Module</em>'.
	 * @generated
	 */
	MicroswitchModule createMicroswitchModule();

	/**
	 * Returns a new object of class '<em>Motor Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Motor Module</em>'.
	 * @generated
	 */
	MotorModule createMotorModule();

	/**
	 * Returns a new object of class '<em>Monostable Cylinder Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Monostable Cylinder Module</em>'.
	 * @generated
	 */
	MonostableCylinderModule createMonostableCylinderModule();

	/**
	 * Returns a new object of class '<em>Vacuum Gripper Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vacuum Gripper Module</em>'.
	 * @generated
	 */
	VacuumGripperModule createVacuumGripperModule();

	/**
	 * Returns a new object of class '<em>Presence Sensor Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Presence Sensor Module</em>'.
	 * @generated
	 */
	PresenceSensorModule createPresenceSensorModule();

	/**
	 * Returns a new object of class '<em>Optical Sensor Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Optical Sensor Module</em>'.
	 * @generated
	 */
	OpticalSensorModule createOpticalSensorModule();

	/**
	 * Returns a new object of class '<em>Conveyor Belt Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conveyor Belt Module</em>'.
	 * @generated
	 */
	ConveyorBeltModule createConveyorBeltModule();

	/**
	 * Returns a new object of class '<em>Sensor Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor Module</em>'.
	 * @generated
	 */
	SensorModule createSensorModule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PpumodulesPackage getPpumodulesPackage();

} //PpumodulesFactory
