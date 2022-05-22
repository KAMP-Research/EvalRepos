/**
 */
package typerepo;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see typerepo.TyperepoPackage
 * @generated
 */
public interface TyperepoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TyperepoFactory eINSTANCE = typerepo.impl.TyperepoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repository</em>'.
	 * @generated
	 */
	Repository createRepository();

	/**
	 * Returns a new object of class '<em>Smart Meter Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Smart Meter Type</em>'.
	 * @generated
	 */
	SmartMeterType createSmartMeterType();

	/**
	 * Returns a new object of class '<em>Connection Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Type</em>'.
	 * @generated
	 */
	ConnectionType createConnectionType();

	/**
	 * Returns a new object of class '<em>Network Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Node Type</em>'.
	 * @generated
	 */
	NetworkNodeType createNetworkNodeType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TyperepoPackage getTyperepoPackage();

} //TyperepoFactory
