/**
 */
package domain.ppu.ppumodules;

import domain.aps.buscomponents.BusBox;
import domain.aps.buscomponents.BusCable;
import domain.aps.buscomponents.BusSlave;

import domain.aps.components.SimpleMotor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Motor Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.ppu.ppumodules.MotorModule#getSimpleMotor <em>Simple Motor</em>}</li>
 *   <li>{@link domain.ppu.ppumodules.MotorModule#getBusSlave <em>Bus Slave</em>}</li>
 *   <li>{@link domain.ppu.ppumodules.MotorModule#getBusBox <em>Bus Box</em>}</li>
 *   <li>{@link domain.ppu.ppumodules.MotorModule#getBusCable <em>Bus Cable</em>}</li>
 * </ul>
 *
 * @see domain.ppu.ppumodules.PpumodulesPackage#getMotorModule()
 * @model
 * @generated
 */
public interface MotorModule extends domain.as.ModuleRepository.Module {
	/**
	 * Returns the value of the '<em><b>Simple Motor</b></em>' containment reference list.
	 * The list contents are of type {@link domain.aps.components.SimpleMotor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Motor</em>' containment reference list.
	 * @see domain.ppu.ppumodules.PpumodulesPackage#getMotorModule_SimpleMotor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SimpleMotor> getSimpleMotor();

	/**
	 * Returns the value of the '<em><b>Bus Slave</b></em>' containment reference list.
	 * The list contents are of type {@link domain.aps.buscomponents.BusSlave}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Slave</em>' containment reference list.
	 * @see domain.ppu.ppumodules.PpumodulesPackage#getMotorModule_BusSlave()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BusSlave> getBusSlave();

	/**
	 * Returns the value of the '<em><b>Bus Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Box</em>' containment reference.
	 * @see #setBusBox(BusBox)
	 * @see domain.ppu.ppumodules.PpumodulesPackage#getMotorModule_BusBox()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BusBox getBusBox();

	/**
	 * Sets the value of the '{@link domain.ppu.ppumodules.MotorModule#getBusBox <em>Bus Box</em>}' containment reference.
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
	 * @see domain.ppu.ppumodules.PpumodulesPackage#getMotorModule_BusCable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BusCable> getBusCable();

} // MotorModule
