/**
 */
package domain.ppu.ppumodules;

import domain.aps.buscomponents.BusSlave;

import domain.ppu.ppucomponents.InductiveSensor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inductive Sensor Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.ppu.ppumodules.InductiveSensorModule#getInductiveSensor <em>Inductive Sensor</em>}</li>
 *   <li>{@link domain.ppu.ppumodules.InductiveSensorModule#getBusSlave <em>Bus Slave</em>}</li>
 * </ul>
 *
 * @see domain.ppu.ppumodules.PpumodulesPackage#getInductiveSensorModule()
 * @model
 * @generated
 */
public interface InductiveSensorModule extends domain.as.ModuleRepository.Module {
	/**
	 * Returns the value of the '<em><b>Inductive Sensor</b></em>' containment reference list.
	 * The list contents are of type {@link domain.ppu.ppucomponents.InductiveSensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inductive Sensor</em>' containment reference list.
	 * @see domain.ppu.ppumodules.PpumodulesPackage#getInductiveSensorModule_InductiveSensor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<InductiveSensor> getInductiveSensor();

	/**
	 * Returns the value of the '<em><b>Bus Slave</b></em>' containment reference list.
	 * The list contents are of type {@link domain.aps.buscomponents.BusSlave}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Slave</em>' containment reference list.
	 * @see domain.ppu.ppumodules.PpumodulesPackage#getInductiveSensorModule_BusSlave()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BusSlave> getBusSlave();

} // InductiveSensorModule
