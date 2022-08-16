/**
 */
package performance.resources.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import performance.resources.HDDResourcePerformanceSpecification;
import performance.resources.ResourcesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>HDD Resource Performance Specification</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HDDResourcePerformanceSpecificationTest extends TestCase {

	/**
	 * The fixture for this HDD Resource Performance Specification test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HDDResourcePerformanceSpecification fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HDDResourcePerformanceSpecificationTest.class);
	}

	/**
	 * Constructs a new HDD Resource Performance Specification test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HDDResourcePerformanceSpecificationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this HDD Resource Performance Specification test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(HDDResourcePerformanceSpecification fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this HDD Resource Performance Specification test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HDDResourcePerformanceSpecification getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ResourcesFactory.eINSTANCE.createHDDResourcePerformanceSpecification());
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

} //HDDResourcePerformanceSpecificationTest
