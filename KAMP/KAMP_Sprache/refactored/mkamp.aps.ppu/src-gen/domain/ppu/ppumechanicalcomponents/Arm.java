/**
 */
package domain.ppu.ppumechanicalcomponents;

import domain.aps.components.MechanicalAssembly;

import domain.ppu.ppustructures.Crane;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.ppu.ppumechanicalcomponents.Arm#getMountedTo <em>Mounted To</em>}</li>
 * </ul>
 *
 * @see domain.ppu.ppumechanicalcomponents.PpumechanicalcomponentsPackage#getArm()
 * @model
 * @generated
 */
public interface Arm extends MechanicalAssembly {
	/**
	 * Returns the value of the '<em><b>Mounted To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link domain.ppu.ppustructures.Crane#getArm <em>Arm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mounted To</em>' reference.
	 * @see #setMountedTo(Crane)
	 * @see domain.ppu.ppumechanicalcomponents.PpumechanicalcomponentsPackage#getArm_MountedTo()
	 * @see domain.ppu.ppustructures.Crane#getArm
	 * @model opposite="arm" required="true"
	 * @generated
	 */
	Crane getMountedTo();

	/**
	 * Sets the value of the '{@link domain.ppu.ppumechanicalcomponents.Arm#getMountedTo <em>Mounted To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mounted To</em>' reference.
	 * @see #getMountedTo()
	 * @generated
	 */
	void setMountedTo(Crane value);

} // Arm
