/**
 */
package domain.ppu.ppustructures;

import domain.aps.components.ConveyorBelt;

import domain.as.StructureRepository.Structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conveyor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.ppu.ppustructures.Conveyor#getBelts <em>Belts</em>}</li>
 * </ul>
 *
 * @see domain.ppu.ppustructures.PpustructuresPackage#getConveyor()
 * @model
 * @generated
 */
public interface Conveyor extends Structure {
	/**
	 * Returns the value of the '<em><b>Belts</b></em>' containment reference list.
	 * The list contents are of type {@link domain.aps.components.ConveyorBelt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belts</em>' containment reference list.
	 * @see domain.ppu.ppustructures.PpustructuresPackage#getConveyor_Belts()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConveyorBelt> getBelts();

} // Conveyor
