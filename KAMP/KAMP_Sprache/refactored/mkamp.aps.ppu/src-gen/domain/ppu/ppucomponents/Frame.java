/**
 */
package domain.ppu.ppucomponents;

import domain.aps.components.ConveyorBelt;
import domain.aps.components.MechanicalAssembly;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frame</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.ppu.ppucomponents.Frame#getConveyorbelt <em>Conveyorbelt</em>}</li>
 * </ul>
 *
 * @see domain.ppu.ppucomponents.PpucomponentsPackage#getFrame()
 * @model
 * @generated
 */
public interface Frame extends MechanicalAssembly {
	/**
	 * Returns the value of the '<em><b>Conveyorbelt</b></em>' containment reference list.
	 * The list contents are of type {@link domain.aps.components.ConveyorBelt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conveyorbelt</em>' containment reference list.
	 * @see domain.ppu.ppucomponents.PpucomponentsPackage#getFrame_Conveyorbelt()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConveyorBelt> getConveyorbelt();

} // Frame
