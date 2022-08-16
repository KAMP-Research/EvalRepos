/**
 */
package domain.aps.electroniccomponents;

import domain.aps.interfaces.PhysicalConnection;
import domain.aps.interfaces.SignalInterface;

import domain.as.ComponentRepository.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Electronic Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.aps.electroniccomponents.ElectronicPart#getPin <em>Pin</em>}</li>
 *   <li>{@link domain.aps.electroniccomponents.ElectronicPart#getPhysicalconnection <em>Physicalconnection</em>}</li>
 * </ul>
 *
 * @see domain.aps.electroniccomponents.ElectroniccomponentsPackage#getElectronicPart()
 * @model abstract="true"
 * @generated
 */
public interface ElectronicPart extends Component {
	/**
	 * Returns the value of the '<em><b>Pin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin</em>' containment reference.
	 * @see #setPin(SignalInterface)
	 * @see domain.aps.electroniccomponents.ElectroniccomponentsPackage#getElectronicPart_Pin()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SignalInterface getPin();

	/**
	 * Sets the value of the '{@link domain.aps.electroniccomponents.ElectronicPart#getPin <em>Pin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin</em>' containment reference.
	 * @see #getPin()
	 * @generated
	 */
	void setPin(SignalInterface value);

	/**
	 * Returns the value of the '<em><b>Physicalconnection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physicalconnection</em>' containment reference.
	 * @see #setPhysicalconnection(PhysicalConnection)
	 * @see domain.aps.electroniccomponents.ElectroniccomponentsPackage#getElectronicPart_Physicalconnection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PhysicalConnection getPhysicalconnection();

	/**
	 * Sets the value of the '{@link domain.aps.electroniccomponents.ElectronicPart#getPhysicalconnection <em>Physicalconnection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physicalconnection</em>' containment reference.
	 * @see #getPhysicalconnection()
	 * @generated
	 */
	void setPhysicalconnection(PhysicalConnection value);

} // ElectronicPart
