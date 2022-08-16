/**
 */
package quality.aps_mm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see quality.aps_mm.Aps_mmPackage
 * @generated
 */
public interface Aps_mmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Aps_mmFactory eINSTANCE = quality.aps_mm.impl.Aps_mmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Modify Bus Master</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Bus Master</em>'.
	 * @generated
	 */
	ModifyBusMaster createModifyBusMaster();

	/**
	 * Returns a new object of class '<em>Modify Physical Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Physical Connection</em>'.
	 * @generated
	 */
	ModifyPhysicalConnection createModifyPhysicalConnection();

	/**
	 * Returns a new object of class '<em>Modify Signalinterface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Signalinterface</em>'.
	 * @generated
	 */
	ModifySignalinterface createModifySignalinterface();

	/**
	 * Returns a new object of class '<em>Modify Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Sensor</em>'.
	 * @generated
	 */
	ModifySensor createModifySensor();

	/**
	 * Returns a new object of class '<em>Modify Bus Slave</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Bus Slave</em>'.
	 * @generated
	 */
	ModifyBusSlave createModifyBusSlave();

	/**
	 * Returns a new object of class '<em>Modify Ramp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Ramp</em>'.
	 * @generated
	 */
	ModifyRamp createModifyRamp();

	/**
	 * Returns a new object of class '<em>Modify Bus Cable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Bus Cable</em>'.
	 * @generated
	 */
	ModifyBusCable createModifyBusCable();

	/**
	 * Returns a new object of class '<em>Modify Bus Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Bus Box</em>'.
	 * @generated
	 */
	ModifyBusBox createModifyBusBox();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Aps_mmPackage getAps_mmPackage();

} //Aps_mmFactory
