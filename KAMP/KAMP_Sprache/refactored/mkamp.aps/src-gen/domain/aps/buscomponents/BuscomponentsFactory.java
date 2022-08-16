/**
 */
package domain.aps.buscomponents;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see domain.aps.buscomponents.BuscomponentsPackage
 * @generated
 */
public interface BuscomponentsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BuscomponentsFactory eINSTANCE = domain.aps.buscomponents.impl.BuscomponentsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Bus Master</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bus Master</em>'.
	 * @generated
	 */
	BusMaster createBusMaster();

	/**
	 * Returns a new object of class '<em>Bus Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bus Box</em>'.
	 * @generated
	 */
	BusBox createBusBox();

	/**
	 * Returns a new object of class '<em>Bus Slave</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bus Slave</em>'.
	 * @generated
	 */
	BusSlave createBusSlave();

	/**
	 * Returns a new object of class '<em>Bus Cable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bus Cable</em>'.
	 * @generated
	 */
	BusCable createBusCable();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BuscomponentsPackage getBuscomponentsPackage();

} //BuscomponentsFactory
