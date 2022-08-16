/**
 */
package quality.as_foaa;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link quality.as_foaa.TestCase#getTestName <em>Test Name</em>}</li>
 * </ul>
 *
 * @see quality.as_foaa.As_foaaPackage#getTestCase()
 * @model abstract="true"
 * @generated
 */
public interface TestCase extends EObject {
	/**
	 * Returns the value of the '<em><b>Test Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Name</em>' attribute.
	 * @see #setTestName(String)
	 * @see quality.as_foaa.As_foaaPackage#getTestCase_TestName()
	 * @model
	 * @generated
	 */
	String getTestName();

	/**
	 * Sets the value of the '{@link quality.as_foaa.TestCase#getTestName <em>Test Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Name</em>' attribute.
	 * @see #getTestName()
	 * @generated
	 */
	void setTestName(String value);

} // TestCase
