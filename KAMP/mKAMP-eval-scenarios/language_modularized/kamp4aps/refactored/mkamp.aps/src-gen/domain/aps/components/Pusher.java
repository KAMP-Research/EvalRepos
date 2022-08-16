/**
 */
package domain.aps.components;

import domain.aps.buscomponents.BusBox;
import domain.aps.buscomponents.BusCable;

import domain.aps.interfaces.PhysicalConnection;

import domain.as.ComponentRepository.Component;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pusher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.aps.components.Pusher#getComponentsRepository <em>Components Repository</em>}</li>
 *   <li>{@link domain.aps.components.Pusher#getFixtureCylinder <em>Fixture Cylinder</em>}</li>
 *   <li>{@link domain.aps.components.Pusher#getBusBox <em>Bus Box</em>}</li>
 *   <li>{@link domain.aps.components.Pusher#getBusCable <em>Bus Cable</em>}</li>
 * </ul>
 *
 * @see domain.aps.components.ComponentsPackage#getPusher()
 * @model
 * @generated
 */
public interface Pusher extends Component {
	/**
	 * Returns the value of the '<em><b>Components Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components Repository</em>' reference.
	 * @see #setComponentsRepository(Component)
	 * @see domain.aps.components.ComponentsPackage#getPusher_ComponentsRepository()
	 * @model required="true"
	 * @generated
	 */
	Component getComponentsRepository();

	/**
	 * Sets the value of the '{@link domain.aps.components.Pusher#getComponentsRepository <em>Components Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Components Repository</em>' reference.
	 * @see #getComponentsRepository()
	 * @generated
	 */
	void setComponentsRepository(Component value);

	/**
	 * Returns the value of the '<em><b>Fixture Cylinder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixture Cylinder</em>' containment reference.
	 * @see #setFixtureCylinder(PhysicalConnection)
	 * @see domain.aps.components.ComponentsPackage#getPusher_FixtureCylinder()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PhysicalConnection getFixtureCylinder();

	/**
	 * Sets the value of the '{@link domain.aps.components.Pusher#getFixtureCylinder <em>Fixture Cylinder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixture Cylinder</em>' containment reference.
	 * @see #getFixtureCylinder()
	 * @generated
	 */
	void setFixtureCylinder(PhysicalConnection value);

	/**
	 * Returns the value of the '<em><b>Bus Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Box</em>' containment reference.
	 * @see #setBusBox(BusBox)
	 * @see domain.aps.components.ComponentsPackage#getPusher_BusBox()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BusBox getBusBox();

	/**
	 * Sets the value of the '{@link domain.aps.components.Pusher#getBusBox <em>Bus Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Box</em>' containment reference.
	 * @see #getBusBox()
	 * @generated
	 */
	void setBusBox(BusBox value);

	/**
	 * Returns the value of the '<em><b>Bus Cable</b></em>' containment reference list.
	 * The list contents are of type {@link domain.aps.buscomponents.BusCable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Cable</em>' containment reference list.
	 * @see domain.aps.components.ComponentsPackage#getPusher_BusCable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BusCable> getBusCable();

} // Pusher
