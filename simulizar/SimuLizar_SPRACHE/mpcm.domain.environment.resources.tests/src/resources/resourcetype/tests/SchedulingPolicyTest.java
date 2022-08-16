/**
 */
package resources.resourcetype.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import resources.resourcetype.ResourcetypeFactory;
import resources.resourcetype.SchedulingPolicy;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Scheduling Policy</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SchedulingPolicyTest extends TestCase {

	/**
	 * The fixture for this Scheduling Policy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulingPolicy fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SchedulingPolicyTest.class);
	}

	/**
	 * Constructs a new Scheduling Policy test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingPolicyTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Scheduling Policy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SchedulingPolicy fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Scheduling Policy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulingPolicy getFixture() {
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
		setFixture(ResourcetypeFactory.eINSTANCE.createSchedulingPolicy());
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

} //SchedulingPolicyTest
