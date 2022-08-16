/**
 */
package domain.aps.buscomponents;

import domain.aps.components.PowerSupply;

import domain.aps.interfaces.SignalInterface;

import domain.as.ComponentRepository.Component;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.aps.buscomponents.BusBox#getSignalinterfaces <em>Signalinterfaces</em>}</li>
 *   <li>{@link domain.aps.buscomponents.BusBox#getSignalinterface_master <em>Signalinterface master</em>}</li>
 *   <li>{@link domain.aps.buscomponents.BusBox#getSignalinterface_box <em>Signalinterface box</em>}</li>
 *   <li>{@link domain.aps.buscomponents.BusBox#getPowersupply <em>Powersupply</em>}</li>
 * </ul>
 *
 * @see domain.aps.buscomponents.BuscomponentsPackage#getBusBox()
 * @model
 * @generated
 */
public interface BusBox extends Component {
	/**
	 * Returns the value of the '<em><b>Signalinterfaces</b></em>' reference list.
	 * The list contents are of type {@link domain.aps.interfaces.SignalInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signalinterfaces</em>' reference list.
	 * @see domain.aps.buscomponents.BuscomponentsPackage#getBusBox_Signalinterfaces()
	 * @model
	 * @generated
	 */
	EList<SignalInterface> getSignalinterfaces();

	/**
	 * Returns the value of the '<em><b>Signalinterface master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signalinterface master</em>' reference.
	 * @see #setSignalinterface_master(SignalInterface)
	 * @see domain.aps.buscomponents.BuscomponentsPackage#getBusBox_Signalinterface_master()
	 * @model required="true"
	 * @generated
	 */
	SignalInterface getSignalinterface_master();

	/**
	 * Sets the value of the '{@link domain.aps.buscomponents.BusBox#getSignalinterface_master <em>Signalinterface master</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signalinterface master</em>' reference.
	 * @see #getSignalinterface_master()
	 * @generated
	 */
	void setSignalinterface_master(SignalInterface value);

	/**
	 * Returns the value of the '<em><b>Signalinterface box</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signalinterface box</em>' reference.
	 * @see #setSignalinterface_box(SignalInterface)
	 * @see domain.aps.buscomponents.BuscomponentsPackage#getBusBox_Signalinterface_box()
	 * @model required="true"
	 * @generated
	 */
	SignalInterface getSignalinterface_box();

	/**
	 * Sets the value of the '{@link domain.aps.buscomponents.BusBox#getSignalinterface_box <em>Signalinterface box</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signalinterface box</em>' reference.
	 * @see #getSignalinterface_box()
	 * @generated
	 */
	void setSignalinterface_box(SignalInterface value);

	/**
	 * Returns the value of the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Powersupply</em>' reference.
	 * @see #setPowersupply(PowerSupply)
	 * @see domain.aps.buscomponents.BuscomponentsPackage#getBusBox_Powersupply()
	 * @model required="true"
	 * @generated
	 */
	PowerSupply getPowersupply();

	/**
	 * Sets the value of the '{@link domain.aps.buscomponents.BusBox#getPowersupply <em>Powersupply</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Powersupply</em>' reference.
	 * @see #getPowersupply()
	 * @generated
	 */
	void setPowersupply(PowerSupply value);

} // BusBox
