/**
 */
package input;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import topo.SmartGridTopology;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link input.ScenarioState#getEntityStates <em>Entity States</em>}</li>
 *   <li>{@link input.ScenarioState#getPowerStates <em>Power States</em>}</li>
 *   <li>{@link input.ScenarioState#getScenario <em>Scenario</em>}</li>
 * </ul>
 *
 * @see input.InputPackage#getScenarioState()
 * @model
 * @generated
 */
public interface ScenarioState extends EObject {
	/**
	 * Returns the value of the '<em><b>Entity States</b></em>' containment reference list.
	 * The list contents are of type {@link input.EntityState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity States</em>' containment reference list.
	 * @see input.InputPackage#getScenarioState_EntityStates()
	 * @model containment="true"
	 * @generated
	 */
	EList<EntityState> getEntityStates();

	/**
	 * Returns the value of the '<em><b>Power States</b></em>' containment reference list.
	 * The list contents are of type {@link input.PowerState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power States</em>' containment reference list.
	 * @see input.InputPackage#getScenarioState_PowerStates()
	 * @model containment="true"
	 * @generated
	 */
	EList<PowerState> getPowerStates();

	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' reference.
	 * @see #setScenario(SmartGridTopology)
	 * @see input.InputPackage#getScenarioState_Scenario()
	 * @model
	 * @generated
	 */
	SmartGridTopology getScenario();

	/**
	 * Sets the value of the '{@link input.ScenarioState#getScenario <em>Scenario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario</em>' reference.
	 * @see #getScenario()
	 * @generated
	 */
	void setScenario(SmartGridTopology value);
	
	public default String getId() {
		return "";
	}

} // ScenarioState
