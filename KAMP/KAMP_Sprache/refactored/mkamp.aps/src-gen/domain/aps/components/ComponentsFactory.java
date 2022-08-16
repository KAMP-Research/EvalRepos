/**
 */
package domain.aps.components;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see domain.aps.components.ComponentsPackage
 * @generated
 */
public interface ComponentsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentsFactory eINSTANCE = domain.aps.components.impl.ComponentsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Power Supply</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Power Supply</em>'.
	 * @generated
	 */
	PowerSupply createPowerSupply();

	/**
	 * Returns a new object of class '<em>Conveyor Belt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conveyor Belt</em>'.
	 * @generated
	 */
	ConveyorBelt createConveyorBelt();

	/**
	 * Returns a new object of class '<em>Fixture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fixture</em>'.
	 * @generated
	 */
	Fixture createFixture();

	/**
	 * Returns a new object of class '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor</em>'.
	 * @generated
	 */
	Sensor createSensor();

	/**
	 * Returns a new object of class '<em>Dispenser</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dispenser</em>'.
	 * @generated
	 */
	Dispenser createDispenser();

	/**
	 * Returns a new object of class '<em>Tank</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tank</em>'.
	 * @generated
	 */
	Tank createTank();

	/**
	 * Returns a new object of class '<em>Pusher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pusher</em>'.
	 * @generated
	 */
	Pusher createPusher();

	/**
	 * Returns a new object of class '<em>Corner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Corner</em>'.
	 * @generated
	 */
	Corner createCorner();

	/**
	 * Returns a new object of class '<em>Rack</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rack</em>'.
	 * @generated
	 */
	Rack createRack();

	/**
	 * Returns a new object of class '<em>Compressor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compressor</em>'.
	 * @generated
	 */
	Compressor createCompressor();

	/**
	 * Returns a new object of class '<em>Regular Ramp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regular Ramp</em>'.
	 * @generated
	 */
	RegularRamp createRegularRamp();

	/**
	 * Returns a new object of class '<em>Turning Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turning Table</em>'.
	 * @generated
	 */
	TurningTable createTurningTable();

	/**
	 * Returns a new object of class '<em>Cylinder Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cylinder Part</em>'.
	 * @generated
	 */
	CylinderPart createCylinderPart();

	/**
	 * Returns a new object of class '<em>Simple Motor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Motor</em>'.
	 * @generated
	 */
	SimpleMotor createSimpleMotor();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComponentsPackage getComponentsPackage();

} //ComponentsFactory
