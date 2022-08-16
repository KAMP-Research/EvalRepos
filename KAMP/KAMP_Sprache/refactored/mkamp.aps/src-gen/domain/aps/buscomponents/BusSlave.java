/**
 */
package domain.aps.buscomponents;

import domain.aps.interfaces.SignalInterface;

import domain.as.ComponentRepository.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus Slave</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.aps.buscomponents.BusSlave#getSignalinterface_master <em>Signalinterface master</em>}</li>
 *   <li>{@link domain.aps.buscomponents.BusSlave#getSignalinterface_slave <em>Signalinterface slave</em>}</li>
 * </ul>
 *
 * @see domain.aps.buscomponents.BuscomponentsPackage#getBusSlave()
 * @model
 * @generated
 */
public interface BusSlave extends Component {
	/**
	 * Returns the value of the '<em><b>Signalinterface master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signalinterface master</em>' reference.
	 * @see #setSignalinterface_master(SignalInterface)
	 * @see domain.aps.buscomponents.BuscomponentsPackage#getBusSlave_Signalinterface_master()
	 * @model required="true"
	 * @generated
	 */
	SignalInterface getSignalinterface_master();

	/**
	 * Sets the value of the '{@link domain.aps.buscomponents.BusSlave#getSignalinterface_master <em>Signalinterface master</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signalinterface master</em>' reference.
	 * @see #getSignalinterface_master()
	 * @generated
	 */
	void setSignalinterface_master(SignalInterface value);

	/**
	 * Returns the value of the '<em><b>Signalinterface slave</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signalinterface slave</em>' reference.
	 * @see #setSignalinterface_slave(SignalInterface)
	 * @see domain.aps.buscomponents.BuscomponentsPackage#getBusSlave_Signalinterface_slave()
	 * @model required="true"
	 * @generated
	 */
	SignalInterface getSignalinterface_slave();

	/**
	 * Sets the value of the '{@link domain.aps.buscomponents.BusSlave#getSignalinterface_slave <em>Signalinterface slave</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signalinterface slave</em>' reference.
	 * @see #getSignalinterface_slave()
	 * @generated
	 */
	void setSignalinterface_slave(SignalInterface value);

} // BusSlave
