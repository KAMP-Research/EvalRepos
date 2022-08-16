/**
 */
package domain.aps.buscomponents;

import domain.aps.interfaces.SignalInterface;

import domain.as.ComponentRepository.Component;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus Master</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.aps.buscomponents.BusMaster#getSignalinterfaces <em>Signalinterfaces</em>}</li>
 *   <li>{@link domain.aps.buscomponents.BusMaster#getSignalinterface_controller <em>Signalinterface controller</em>}</li>
 * </ul>
 *
 * @see domain.aps.buscomponents.BuscomponentsPackage#getBusMaster()
 * @model
 * @generated
 */
public interface BusMaster extends Component {
	/**
	 * Returns the value of the '<em><b>Signalinterfaces</b></em>' reference list.
	 * The list contents are of type {@link domain.aps.interfaces.SignalInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signalinterfaces</em>' reference list.
	 * @see domain.aps.buscomponents.BuscomponentsPackage#getBusMaster_Signalinterfaces()
	 * @model
	 * @generated
	 */
	EList<SignalInterface> getSignalinterfaces();

	/**
	 * Returns the value of the '<em><b>Signalinterface controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signalinterface controller</em>' reference.
	 * @see #setSignalinterface_controller(SignalInterface)
	 * @see domain.aps.buscomponents.BuscomponentsPackage#getBusMaster_Signalinterface_controller()
	 * @model required="true"
	 * @generated
	 */
	SignalInterface getSignalinterface_controller();

	/**
	 * Sets the value of the '{@link domain.aps.buscomponents.BusMaster#getSignalinterface_controller <em>Signalinterface controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signalinterface controller</em>' reference.
	 * @see #getSignalinterface_controller()
	 * @generated
	 */
	void setSignalinterface_controller(SignalInterface value);

} // BusMaster
