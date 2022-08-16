/**
 */
package softwarerepository.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import softwarerepository.OperationRequiredRole;
import softwarerepository.SoftwarerepositoryFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Operation Required Role</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperationRequiredRoleTest extends TestCase {

	/**
	 * The fixture for this Operation Required Role test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationRequiredRole fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OperationRequiredRoleTest.class);
	}

	/**
	 * Constructs a new Operation Required Role test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationRequiredRoleTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Operation Required Role test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(OperationRequiredRole fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Operation Required Role test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationRequiredRole getFixture() {
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
		setFixture(SoftwarerepositoryFactory.eINSTANCE.createOperationRequiredRole());
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

} //OperationRequiredRoleTest
