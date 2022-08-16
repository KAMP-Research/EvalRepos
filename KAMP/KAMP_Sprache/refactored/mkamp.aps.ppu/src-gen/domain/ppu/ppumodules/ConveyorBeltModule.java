/**
 */
package domain.ppu.ppumodules;

import domain.aps.mechanicalcomponents.RubberBand;

import domain.ppu.ppucomponents.Frame;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conveyor Belt Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.ppu.ppumodules.ConveyorBeltModule#getRubberBand <em>Rubber Band</em>}</li>
 *   <li>{@link domain.ppu.ppumodules.ConveyorBeltModule#getFrame <em>Frame</em>}</li>
 * </ul>
 *
 * @see domain.ppu.ppumodules.PpumodulesPackage#getConveyorBeltModule()
 * @model
 * @generated
 */
public interface ConveyorBeltModule extends domain.as.ModuleRepository.Module {
	/**
	 * Returns the value of the '<em><b>Rubber Band</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rubber Band</em>' containment reference.
	 * @see #setRubberBand(RubberBand)
	 * @see domain.ppu.ppumodules.PpumodulesPackage#getConveyorBeltModule_RubberBand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RubberBand getRubberBand();

	/**
	 * Sets the value of the '{@link domain.ppu.ppumodules.ConveyorBeltModule#getRubberBand <em>Rubber Band</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rubber Band</em>' containment reference.
	 * @see #getRubberBand()
	 * @generated
	 */
	void setRubberBand(RubberBand value);

	/**
	 * Returns the value of the '<em><b>Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame</em>' containment reference.
	 * @see #setFrame(Frame)
	 * @see domain.ppu.ppumodules.PpumodulesPackage#getConveyorBeltModule_Frame()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Frame getFrame();

	/**
	 * Sets the value of the '{@link domain.ppu.ppumodules.ConveyorBeltModule#getFrame <em>Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame</em>' containment reference.
	 * @see #getFrame()
	 * @generated
	 */
	void setFrame(Frame value);

} // ConveyorBeltModule
