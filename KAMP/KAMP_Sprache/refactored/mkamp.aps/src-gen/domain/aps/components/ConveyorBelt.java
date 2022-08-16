/**
 */
package domain.aps.components;

import domain.aps.mechanicalcomponents.RubberBand;

import domain.as.ComponentRepository.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conveyor Belt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.aps.components.ConveyorBelt#getRubberBand <em>Rubber Band</em>}</li>
 * </ul>
 *
 * @see domain.aps.components.ComponentsPackage#getConveyorBelt()
 * @model
 * @generated
 */
public interface ConveyorBelt extends Component {
	/**
	 * Returns the value of the '<em><b>Rubber Band</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rubber Band</em>' containment reference.
	 * @see #setRubberBand(RubberBand)
	 * @see domain.aps.components.ComponentsPackage#getConveyorBelt_RubberBand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RubberBand getRubberBand();

	/**
	 * Sets the value of the '{@link domain.aps.components.ConveyorBelt#getRubberBand <em>Rubber Band</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rubber Band</em>' containment reference.
	 * @see #getRubberBand()
	 * @generated
	 */
	void setRubberBand(RubberBand value);

} // ConveyorBelt
