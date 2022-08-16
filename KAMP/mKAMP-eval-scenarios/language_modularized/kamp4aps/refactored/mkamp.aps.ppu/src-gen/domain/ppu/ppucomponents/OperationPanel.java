/**
 */
package domain.ppu.ppucomponents;

import domain.aps.components.Panel;

import domain.aps.electroniccomponents.Button;
import domain.aps.electroniccomponents.LED;

import domain.aps.interfaces.Screwing;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Panel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.ppu.ppucomponents.OperationPanel#getScrewing_rack <em>Screwing rack</em>}</li>
 *   <li>{@link domain.ppu.ppucomponents.OperationPanel#getLeds <em>Leds</em>}</li>
 *   <li>{@link domain.ppu.ppucomponents.OperationPanel#getButtons <em>Buttons</em>}</li>
 * </ul>
 *
 * @see domain.ppu.ppucomponents.PpucomponentsPackage#getOperationPanel()
 * @model
 * @generated
 */
public interface OperationPanel extends Panel {
	/**
	 * Returns the value of the '<em><b>Screwing rack</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screwing rack</em>' reference.
	 * @see #setScrewing_rack(Screwing)
	 * @see domain.ppu.ppucomponents.PpucomponentsPackage#getOperationPanel_Screwing_rack()
	 * @model required="true"
	 * @generated
	 */
	Screwing getScrewing_rack();

	/**
	 * Sets the value of the '{@link domain.ppu.ppucomponents.OperationPanel#getScrewing_rack <em>Screwing rack</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screwing rack</em>' reference.
	 * @see #getScrewing_rack()
	 * @generated
	 */
	void setScrewing_rack(Screwing value);

	/**
	 * Returns the value of the '<em><b>Leds</b></em>' reference list.
	 * The list contents are of type {@link domain.aps.electroniccomponents.LED}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leds</em>' reference list.
	 * @see domain.ppu.ppucomponents.PpucomponentsPackage#getOperationPanel_Leds()
	 * @model
	 * @generated
	 */
	EList<LED> getLeds();

	/**
	 * Returns the value of the '<em><b>Buttons</b></em>' reference list.
	 * The list contents are of type {@link domain.aps.electroniccomponents.Button}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buttons</em>' reference list.
	 * @see domain.ppu.ppucomponents.PpucomponentsPackage#getOperationPanel_Buttons()
	 * @model
	 * @generated
	 */
	EList<Button> getButtons();

} // OperationPanel
