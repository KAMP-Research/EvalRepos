/**
 */
package reliability;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failure Occurrence Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     Abstract superclass that connects a failure type definition to an occurrence probability. Used to describe the failure
 *     potential of certain points of failure within the control and data flow (i.e. Actions within
 *     ResourceDemandingBehaviours).
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link reliability.FailureOccurrenceDescription#getFailureProbability <em>Failure Probability</em>}</li>
 * </ul>
 *
 * @see reliability.ReliabilityPackage#getFailureOccurrenceDescription()
 * @model abstract="true"
 * @generated
 */
public interface FailureOccurrenceDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Failure Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure Probability</em>' attribute.
	 * @see #setFailureProbability(double)
	 * @see reliability.ReliabilityPackage#getFailureOccurrenceDescription_FailureProbability()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getFailureProbability();

	/**
	 * Sets the value of the '{@link reliability.FailureOccurrenceDescription#getFailureProbability <em>Failure Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Probability</em>' attribute.
	 * @see #getFailureProbability()
	 * @generated
	 */
	void setFailureProbability(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.failureProbability.oclAsType(Real) &lt;= 1.0) and (self.failureProbability.oclAsType(Real) &gt;= 0.0)'"
	 * @generated
	 */
	boolean EnsureValidFailureProbabilityRange(DiagnosticChain diagnostics, Map<Object, Object> context);

} // FailureOccurrenceDescription
