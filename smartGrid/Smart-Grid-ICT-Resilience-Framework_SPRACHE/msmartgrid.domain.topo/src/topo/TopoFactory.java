/**
 */
package topo;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see topo.TopoPackage
 * @generated
 */
public interface TopoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TopoFactory eINSTANCE = topo.impl.TopoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Smart Grid Topology</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Smart Grid Topology</em>'.
	 * @generated
	 */
	SmartGridTopology createSmartGridTopology();

	/**
	 * Returns a new object of class '<em>Smart Meter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Smart Meter</em>'.
	 * @generated
	 */
	SmartMeter createSmartMeter();

	/**
	 * Returns a new object of class '<em>Network Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Node</em>'.
	 * @generated
	 */
	NetworkNode createNetworkNode();

	/**
	 * Returns a new object of class '<em>Control Center</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Center</em>'.
	 * @generated
	 */
	ControlCenter createControlCenter();

	/**
	 * Returns a new object of class '<em>Generic Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Controller</em>'.
	 * @generated
	 */
	GenericController createGenericController();

	/**
	 * Returns a new object of class '<em>Inter Com</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inter Com</em>'.
	 * @generated
	 */
	InterCom createInterCom();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TopoPackage getTopoPackage();

} //TopoFactory
