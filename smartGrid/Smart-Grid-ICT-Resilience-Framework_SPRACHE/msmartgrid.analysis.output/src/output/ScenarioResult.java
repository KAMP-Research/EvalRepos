/**
 */
package output;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import topo.SmartGridTopology;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link output.ScenarioResult#getStates <em>States</em>}</li>
 *   <li>{@link output.ScenarioResult#getClusters <em>Clusters</em>}</li>
 *   <li>{@link output.ScenarioResult#getScenario <em>Scenario</em>}</li>
 * </ul>
 *
 * @see output.OutputPackage#getScenarioResult()
 * @model
 * @generated
 */
public interface ScenarioResult extends EObject {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link output.EntityState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see output.OutputPackage#getScenarioResult_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<EntityState> getStates();

	/**
	 * Returns the value of the '<em><b>Clusters</b></em>' containment reference list.
	 * The list contents are of type {@link output.Cluster}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clusters</em>' containment reference list.
	 * @see output.OutputPackage#getScenarioResult_Clusters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Cluster> getClusters();

	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' reference.
	 * @see #setScenario(SmartGridTopology)
	 * @see output.OutputPackage#getScenarioResult_Scenario()
	 * @model
	 * @generated
	 */
	SmartGridTopology getScenario();

	/**
	 * Sets the value of the '{@link output.ScenarioResult#getScenario <em>Scenario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario</em>' reference.
	 * @see #getScenario()
	 * @generated
	 */
	void setScenario(SmartGridTopology value);

} // ScenarioResult
