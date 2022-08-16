/**
 */
package domain.aps.components;

import domain.aps.buscomponents.BusBox;
import domain.aps.buscomponents.BusCable;
import domain.aps.buscomponents.BusSlave;

import domain.aps.electroniccomponents.Potentiometer;

import domain.aps.mechanicalcomponents.Table;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Turning Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.aps.components.TurningTable#getRack_for_turningtable <em>Rack for turningtable</em>}</li>
 *   <li>{@link domain.aps.components.TurningTable#getTable_to_stand_on <em>Table to stand on</em>}</li>
 *   <li>{@link domain.aps.components.TurningTable#getMotor_to_drive <em>Motor to drive</em>}</li>
 *   <li>{@link domain.aps.components.TurningTable#getBusSlave <em>Bus Slave</em>}</li>
 *   <li>{@link domain.aps.components.TurningTable#getBusBox <em>Bus Box</em>}</li>
 *   <li>{@link domain.aps.components.TurningTable#getBusCable <em>Bus Cable</em>}</li>
 *   <li>{@link domain.aps.components.TurningTable#getPotentiometer <em>Potentiometer</em>}</li>
 * </ul>
 *
 * @see domain.aps.components.ComponentsPackage#getTurningTable()
 * @model
 * @generated
 */
public interface TurningTable extends domain.as.ModuleRepository.Module {
	/**
	 * Returns the value of the '<em><b>Rack for turningtable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rack for turningtable</em>' containment reference.
	 * @see #setRack_for_turningtable(Rack)
	 * @see domain.aps.components.ComponentsPackage#getTurningTable_Rack_for_turningtable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Rack getRack_for_turningtable();

	/**
	 * Sets the value of the '{@link domain.aps.components.TurningTable#getRack_for_turningtable <em>Rack for turningtable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rack for turningtable</em>' containment reference.
	 * @see #getRack_for_turningtable()
	 * @generated
	 */
	void setRack_for_turningtable(Rack value);

	/**
	 * Returns the value of the '<em><b>Table to stand on</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table to stand on</em>' containment reference.
	 * @see #setTable_to_stand_on(Table)
	 * @see domain.aps.components.ComponentsPackage#getTurningTable_Table_to_stand_on()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Table getTable_to_stand_on();

	/**
	 * Sets the value of the '{@link domain.aps.components.TurningTable#getTable_to_stand_on <em>Table to stand on</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table to stand on</em>' containment reference.
	 * @see #getTable_to_stand_on()
	 * @generated
	 */
	void setTable_to_stand_on(Table value);

	/**
	 * Returns the value of the '<em><b>Motor to drive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motor to drive</em>' containment reference.
	 * @see #setMotor_to_drive(SimpleMotor)
	 * @see domain.aps.components.ComponentsPackage#getTurningTable_Motor_to_drive()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SimpleMotor getMotor_to_drive();

	/**
	 * Sets the value of the '{@link domain.aps.components.TurningTable#getMotor_to_drive <em>Motor to drive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Motor to drive</em>' containment reference.
	 * @see #getMotor_to_drive()
	 * @generated
	 */
	void setMotor_to_drive(SimpleMotor value);

	/**
	 * Returns the value of the '<em><b>Bus Slave</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Slave</em>' containment reference.
	 * @see #setBusSlave(BusSlave)
	 * @see domain.aps.components.ComponentsPackage#getTurningTable_BusSlave()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BusSlave getBusSlave();

	/**
	 * Sets the value of the '{@link domain.aps.components.TurningTable#getBusSlave <em>Bus Slave</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Slave</em>' containment reference.
	 * @see #getBusSlave()
	 * @generated
	 */
	void setBusSlave(BusSlave value);

	/**
	 * Returns the value of the '<em><b>Bus Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Box</em>' containment reference.
	 * @see #setBusBox(BusBox)
	 * @see domain.aps.components.ComponentsPackage#getTurningTable_BusBox()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BusBox getBusBox();

	/**
	 * Sets the value of the '{@link domain.aps.components.TurningTable#getBusBox <em>Bus Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Box</em>' containment reference.
	 * @see #getBusBox()
	 * @generated
	 */
	void setBusBox(BusBox value);

	/**
	 * Returns the value of the '<em><b>Bus Cable</b></em>' containment reference list.
	 * The list contents are of type {@link domain.aps.buscomponents.BusCable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Cable</em>' containment reference list.
	 * @see domain.aps.components.ComponentsPackage#getTurningTable_BusCable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BusCable> getBusCable();

	/**
	 * Returns the value of the '<em><b>Potentiometer</b></em>' containment reference list.
	 * The list contents are of type {@link domain.aps.electroniccomponents.Potentiometer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Potentiometer</em>' containment reference list.
	 * @see domain.aps.components.ComponentsPackage#getTurningTable_Potentiometer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Potentiometer> getPotentiometer();

} // TurningTable
