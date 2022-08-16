/**
 */
package resourceinterfaces.repository.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import resourceinterfaces.repository.RepositoryFactory;
import resourceinterfaces.repository.ResourceRequiredRole;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resource Required Role</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceRequiredRoleTest extends TestCase {

	/**
	 * The fixture for this Resource Required Role test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceRequiredRole fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResourceRequiredRoleTest.class);
	}

	/**
	 * Constructs a new Resource Required Role test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRequiredRoleTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Resource Required Role test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ResourceRequiredRole fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Resource Required Role test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceRequiredRole getFixture() {
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
		setFixture(RepositoryFactory.eINSTANCE.createResourceRequiredRole());
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

} //ResourceRequiredRoleTest
