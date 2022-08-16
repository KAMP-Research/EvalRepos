/**
 */
package resources.tests;

import junit.textui.TestRunner;

import resources.HDDProcessingResourceSpecification;
import resources.ResourcesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>HDD Processing Resource Specification</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HDDProcessingResourceSpecificationTest extends ProcessingResourceSpecificationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HDDProcessingResourceSpecificationTest.class);
	}

	/**
	 * Constructs a new HDD Processing Resource Specification test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HDDProcessingResourceSpecificationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this HDD Processing Resource Specification test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected HDDProcessingResourceSpecification getFixture() {
		return (HDDProcessingResourceSpecification)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ResourcesFactory.eINSTANCE.createHDDProcessingResourceSpecification());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //HDDProcessingResourceSpecificationTest
