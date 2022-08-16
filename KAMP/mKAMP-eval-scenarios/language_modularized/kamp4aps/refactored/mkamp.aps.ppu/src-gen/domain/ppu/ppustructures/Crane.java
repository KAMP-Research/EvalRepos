/**
 */
package domain.ppu.ppustructures;

import domain.aps.components.TurningTable;

import domain.as.StructureRepository.Structure;

import domain.ppu.ppumechanicalcomponents.Arm;

import domain.ppu.ppumodules.VacuumGripperModule;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.ppu.ppustructures.Crane#getArm <em>Arm</em>}</li>
 *   <li>{@link domain.ppu.ppustructures.Crane#getMountedOn <em>Mounted On</em>}</li>
 *   <li>{@link domain.ppu.ppustructures.Crane#getVacuumgripper <em>Vacuumgripper</em>}</li>
 * </ul>
 *
 * @see domain.ppu.ppustructures.PpustructuresPackage#getCrane()
 * @model
 * @generated
 */
public interface Crane extends Structure {
	/**
	 * Returns the value of the '<em><b>Arm</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link domain.ppu.ppumechanicalcomponents.Arm#getMountedTo <em>Mounted To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arm</em>' reference.
	 * @see #setArm(Arm)
	 * @see domain.ppu.ppustructures.PpustructuresPackage#getCrane_Arm()
	 * @see domain.ppu.ppumechanicalcomponents.Arm#getMountedTo
	 * @model opposite="mountedTo" required="true"
	 * @generated
	 */
	Arm getArm();

	/**
	 * Sets the value of the '{@link domain.ppu.ppustructures.Crane#getArm <em>Arm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arm</em>' reference.
	 * @see #getArm()
	 * @generated
	 */
	void setArm(Arm value);

	/**
	 * Returns the value of the '<em><b>Mounted On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mounted On</em>' reference.
	 * @see #setMountedOn(TurningTable)
	 * @see domain.ppu.ppustructures.PpustructuresPackage#getCrane_MountedOn()
	 * @model required="true"
	 * @generated
	 */
	TurningTable getMountedOn();

	/**
	 * Sets the value of the '{@link domain.ppu.ppustructures.Crane#getMountedOn <em>Mounted On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mounted On</em>' reference.
	 * @see #getMountedOn()
	 * @generated
	 */
	void setMountedOn(TurningTable value);

	/**
	 * Returns the value of the '<em><b>Vacuumgripper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vacuumgripper</em>' reference.
	 * @see #setVacuumgripper(VacuumGripperModule)
	 * @see domain.ppu.ppustructures.PpustructuresPackage#getCrane_Vacuumgripper()
	 * @model required="true"
	 * @generated
	 */
	VacuumGripperModule getVacuumgripper();

	/**
	 * Sets the value of the '{@link domain.ppu.ppustructures.Crane#getVacuumgripper <em>Vacuumgripper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vacuumgripper</em>' reference.
	 * @see #getVacuumgripper()
	 * @generated
	 */
	void setVacuumgripper(VacuumGripperModule value);

} // Crane
