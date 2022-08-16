/**
 */
package domain.aps.components;

import domain.aps.interfaces.PhysicalConnection;
import domain.aps.interfaces.SignalInterface;

import domain.as.ComponentRepository.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.aps.components.Sensor#getPhysicalconnection <em>Physicalconnection</em>}</li>
 *   <li>{@link domain.aps.components.Sensor#getSignalinterface <em>Signalinterface</em>}</li>
 *   <li>{@link domain.aps.components.Sensor#getPowersupply <em>Powersupply</em>}</li>
 * </ul>
 *
 * @see domain.aps.components.ComponentsPackage#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends Component {
	/**
	 * Returns the value of the '<em><b>Physicalconnection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physicalconnection</em>' reference.
	 * @see #setPhysicalconnection(PhysicalConnection)
	 * @see domain.aps.components.ComponentsPackage#getSensor_Physicalconnection()
	 * @model required="true"
	 * @generated
	 */
	PhysicalConnection getPhysicalconnection();

	/**
	 * Sets the value of the '{@link domain.aps.components.Sensor#getPhysicalconnection <em>Physicalconnection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physicalconnection</em>' reference.
	 * @see #getPhysicalconnection()
	 * @generated
	 */
	void setPhysicalconnection(PhysicalConnection value);

	/**
	 * Returns the value of the '<em><b>Signalinterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signalinterface</em>' reference.
	 * @see #setSignalinterface(SignalInterface)
	 * @see domain.aps.components.ComponentsPackage#getSensor_Signalinterface()
	 * @model required="true"
	 * @generated
	 */
	SignalInterface getSignalinterface();

	/**
	 * Sets the value of the '{@link domain.aps.components.Sensor#getSignalinterface <em>Signalinterface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signalinterface</em>' reference.
	 * @see #getSignalinterface()
	 * @generated
	 */
	void setSignalinterface(SignalInterface value);

	/**
	 * Returns the value of the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Powersupply</em>' reference.
	 * @see #setPowersupply(PowerSupply)
	 * @see domain.aps.components.ComponentsPackage#getSensor_Powersupply()
	 * @model required="true"
	 * @generated
	 */
	PowerSupply getPowersupply();

	/**
	 * Sets the value of the '{@link domain.aps.components.Sensor#getPowersupply <em>Powersupply</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Powersupply</em>' reference.
	 * @see #getPowersupply()
	 * @generated
	 */
	void setPowersupply(PowerSupply value);

} // Sensor
