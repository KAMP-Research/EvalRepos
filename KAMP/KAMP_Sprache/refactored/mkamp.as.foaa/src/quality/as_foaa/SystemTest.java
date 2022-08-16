/**
 */
package quality.as_foaa;

import domain.as.Plant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link quality.as_foaa.SystemTest#getParent <em>Parent</em>}</li>
 *   <li>{@link quality.as_foaa.SystemTest#getSystemUnderTest <em>System Under Test</em>}</li>
 * </ul>
 *
 * @see quality.as_foaa.As_foaaPackage#getSystemTest()
 * @model
 * @generated
 */
public interface SystemTest extends TestCase {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link quality.as_foaa.TestSpecification#getSystemTests <em>System Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TestSpecification)
	 * @see quality.as_foaa.As_foaaPackage#getSystemTest_Parent()
	 * @see quality.as_foaa.TestSpecification#getSystemTests
	 * @model opposite="systemTests" required="true" transient="false"
	 * @generated
	 */
	TestSpecification getParent();

	/**
	 * Sets the value of the '{@link quality.as_foaa.SystemTest#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TestSpecification value);

	/**
	 * Returns the value of the '<em><b>System Under Test</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Under Test</em>' reference.
	 * @see #setSystemUnderTest(Plant)
	 * @see quality.as_foaa.As_foaaPackage#getSystemTest_SystemUnderTest()
	 * @model
	 * @generated
	 */
	Plant getSystemUnderTest();

	/**
	 * Sets the value of the '{@link quality.as_foaa.SystemTest#getSystemUnderTest <em>System Under Test</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Under Test</em>' reference.
	 * @see #getSystemUnderTest()
	 * @generated
	 */
	void setSystemUnderTest(Plant value);

} // SystemTest
