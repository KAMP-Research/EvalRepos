/**
 */
package resourceinterfaces.resourcetype.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import resourceinterfaces.resourcetype.ResourceProvidedRole;
import resourceinterfaces.resourcetype.ResourcetypeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resource Provided Role</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceProvidedRoleTest extends TestCase {

	/**
	 * The fixture for this Resource Provided Role test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceProvidedRole fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResourceProvidedRoleTest.class);
	}

	/**
	 * Constructs a new Resource Provided Role test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceProvidedRoleTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Resource Provided Role test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ResourceProvidedRole fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Resource Provided Role test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceProvidedRole getFixture() {
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
		setFixture(ResourcetypeFactory.eINSTANCE.createResourceProvidedRole());
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

} //ResourceProvidedRoleTest
