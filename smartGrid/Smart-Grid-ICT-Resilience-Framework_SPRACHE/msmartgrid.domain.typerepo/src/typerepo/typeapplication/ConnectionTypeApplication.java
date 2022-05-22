/**
 */
package typerepo.typeapplication;

import graph.PhysicalConnection;

import org.eclipse.emf.ecore.EObject;

import typerepo.ConnectionType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Type Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typerepo.typeapplication.ConnectionTypeApplication#getConnectiontype <em>Connectiontype</em>}</li>
 *   <li>{@link typerepo.typeapplication.ConnectionTypeApplication#getSmartmeter <em>Smartmeter</em>}</li>
 * </ul>
 *
 * @see typerepo.typeapplication.TypeapplicationPackage#getConnectionTypeApplication()
 * @model
 * @generated
 */
public interface ConnectionTypeApplication extends EObject {
	/**
	 * Returns the value of the '<em><b>Connectiontype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectiontype</em>' reference.
	 * @see #setConnectiontype(ConnectionType)
	 * @see typerepo.typeapplication.TypeapplicationPackage#getConnectionTypeApplication_Connectiontype()
	 * @model required="true"
	 * @generated
	 */
	ConnectionType getConnectiontype();

	/**
	 * Sets the value of the '{@link typerepo.typeapplication.ConnectionTypeApplication#getConnectiontype <em>Connectiontype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectiontype</em>' reference.
	 * @see #getConnectiontype()
	 * @generated
	 */
	void setConnectiontype(ConnectionType value);

	/**
	 * Returns the value of the '<em><b>Smartmeter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smartmeter</em>' reference.
	 * @see #setSmartmeter(PhysicalConnection)
	 * @see typerepo.typeapplication.TypeapplicationPackage#getConnectionTypeApplication_Smartmeter()
	 * @model required="true"
	 * @generated
	 */
	PhysicalConnection getSmartmeter();

	/**
	 * Sets the value of the '{@link typerepo.typeapplication.ConnectionTypeApplication#getSmartmeter <em>Smartmeter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Smartmeter</em>' reference.
	 * @see #getSmartmeter()
	 * @generated
	 */
	void setSmartmeter(PhysicalConnection value);

} // ConnectionTypeApplication
