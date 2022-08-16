/**
 */
package domain.aps.components;

import domain.aps.interfaces.PneumaticSupply;
import domain.aps.interfaces.SignalInterface;

import domain.as.ComponentRepository.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cylinder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.aps.components.Cylinder#getPneumaticsupply <em>Pneumaticsupply</em>}</li>
 *   <li>{@link domain.aps.components.Cylinder#getSignalInterface <em>Signal Interface</em>}</li>
 * </ul>
 *
 * @see domain.aps.components.ComponentsPackage#getCylinder()
 * @model abstract="true"
 * @generated
 */
public interface Cylinder extends Component {
	/**
	 * Returns the value of the '<em><b>Pneumaticsupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pneumaticsupply</em>' reference.
	 * @see #setPneumaticsupply(PneumaticSupply)
	 * @see domain.aps.components.ComponentsPackage#getCylinder_Pneumaticsupply()
	 * @model required="true"
	 * @generated
	 */
	PneumaticSupply getPneumaticsupply();

	/**
	 * Sets the value of the '{@link domain.aps.components.Cylinder#getPneumaticsupply <em>Pneumaticsupply</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pneumaticsupply</em>' reference.
	 * @see #getPneumaticsupply()
	 * @generated
	 */
	void setPneumaticsupply(PneumaticSupply value);

	/**
	 * Returns the value of the '<em><b>Signal Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Interface</em>' reference.
	 * @see #setSignalInterface(SignalInterface)
	 * @see domain.aps.components.ComponentsPackage#getCylinder_SignalInterface()
	 * @model required="true"
	 * @generated
	 */
	SignalInterface getSignalInterface();

	/**
	 * Sets the value of the '{@link domain.aps.components.Cylinder#getSignalInterface <em>Signal Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Interface</em>' reference.
	 * @see #getSignalInterface()
	 * @generated
	 */
	void setSignalInterface(SignalInterface value);

} // Cylinder
