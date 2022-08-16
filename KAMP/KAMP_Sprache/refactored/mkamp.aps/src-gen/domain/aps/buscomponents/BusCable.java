/**
 */
package domain.aps.buscomponents;

import domain.aps.components.Cable;

import domain.aps.interfaces.SignalInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus Cable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.aps.buscomponents.BusCable#getSignalPlug1 <em>Signal Plug1</em>}</li>
 *   <li>{@link domain.aps.buscomponents.BusCable#getSignalPlug2 <em>Signal Plug2</em>}</li>
 * </ul>
 *
 * @see domain.aps.buscomponents.BuscomponentsPackage#getBusCable()
 * @model
 * @generated
 */
public interface BusCable extends Cable {
	/**
	 * Returns the value of the '<em><b>Signal Plug1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Plug1</em>' containment reference.
	 * @see #setSignalPlug1(SignalInterface)
	 * @see domain.aps.buscomponents.BuscomponentsPackage#getBusCable_SignalPlug1()
	 * @model containment="true"
	 * @generated
	 */
	SignalInterface getSignalPlug1();

	/**
	 * Sets the value of the '{@link domain.aps.buscomponents.BusCable#getSignalPlug1 <em>Signal Plug1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Plug1</em>' containment reference.
	 * @see #getSignalPlug1()
	 * @generated
	 */
	void setSignalPlug1(SignalInterface value);

	/**
	 * Returns the value of the '<em><b>Signal Plug2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Plug2</em>' containment reference.
	 * @see #setSignalPlug2(SignalInterface)
	 * @see domain.aps.buscomponents.BuscomponentsPackage#getBusCable_SignalPlug2()
	 * @model containment="true"
	 * @generated
	 */
	SignalInterface getSignalPlug2();

	/**
	 * Sets the value of the '{@link domain.aps.buscomponents.BusCable#getSignalPlug2 <em>Signal Plug2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Plug2</em>' containment reference.
	 * @see #getSignalPlug2()
	 * @generated
	 */
	void setSignalPlug2(SignalInterface value);

} // BusCable
