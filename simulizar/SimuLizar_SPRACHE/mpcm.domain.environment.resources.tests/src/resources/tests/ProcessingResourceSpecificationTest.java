/**
 */
package resources.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import resources.ProcessingResourceSpecification;
import resources.ResourcesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Processing Resource Specification</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessingResourceSpecificationTest extends TestCase {

	/**
	 * The fixture for this Processing Resource Specification test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessingResourceSpecification fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProcessingResourceSpecificationTest.class);
	}

	/**
	 * Constructs a new Processing Resource Specification test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingResourceSpecificationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Processing Resource Specification test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ProcessingResourceSpecification fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Processing Resource Specification test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessingResourceSpecification getFixture() {
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
		setFixture(ResourcesFactory.eINSTANCE.createProcessingResourceSpecification());
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

} //ProcessingResourceSpecificationTest
