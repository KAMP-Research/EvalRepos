/**
 */
package domain.aps.components;

import domain.as.ComponentRepository.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Panel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.aps.components.Panel#getComponentRepository <em>Component Repository</em>}</li>
 * </ul>
 *
 * @see domain.aps.components.ComponentsPackage#getPanel()
 * @model abstract="true"
 * @generated
 */
public interface Panel extends Component {
	/**
	 * Returns the value of the '<em><b>Component Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Repository</em>' reference.
	 * @see #setComponentRepository(Component)
	 * @see domain.aps.components.ComponentsPackage#getPanel_ComponentRepository()
	 * @model required="true"
	 * @generated
	 */
	Component getComponentRepository();

	/**
	 * Sets the value of the '{@link domain.aps.components.Panel#getComponentRepository <em>Component Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Repository</em>' reference.
	 * @see #getComponentRepository()
	 * @generated
	 */
	void setComponentRepository(Component value);

} // Panel
