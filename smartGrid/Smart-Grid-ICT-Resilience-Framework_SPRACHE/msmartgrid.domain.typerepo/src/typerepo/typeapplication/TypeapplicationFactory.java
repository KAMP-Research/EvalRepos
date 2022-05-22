/**
 */
package typerepo.typeapplication;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see typerepo.typeapplication.TypeapplicationPackage
 * @generated
 */
public interface TypeapplicationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypeapplicationFactory eINSTANCE = typerepo.typeapplication.impl.TypeapplicationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Type Applications</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Applications</em>'.
	 * @generated
	 */
	TypeApplications createTypeApplications();

	/**
	 * Returns a new object of class '<em>Connection Type Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Type Application</em>'.
	 * @generated
	 */
	ConnectionTypeApplication createConnectionTypeApplication();

	/**
	 * Returns a new object of class '<em>Smart Meter Type Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Smart Meter Type Application</em>'.
	 * @generated
	 */
	SmartMeterTypeApplication createSmartMeterTypeApplication();

	/**
	 * Returns a new object of class '<em>Network Node Type Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Node Type Application</em>'.
	 * @generated
	 */
	NetworkNodeTypeApplication createNetworkNodeTypeApplication();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TypeapplicationPackage getTypeapplicationPackage();

} //TypeapplicationFactory
