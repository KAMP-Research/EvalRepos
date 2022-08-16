/**
 */
package resources.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import resources.ResourceEnvironment;
import resources.ResourcesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resource Environment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceEnvironmentTest extends TestCase {

	/**
	 * The fixture for this Resource Environment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceEnvironment fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResourceEnvironmentTest.class);
	}

	/**
	 * Constructs a new Resource Environment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceEnvironmentTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Resource Environment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ResourceEnvironment fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Resource Environment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceEnvironment getFixture() {
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
		setFixture(ResourcesFactory.eINSTANCE.createResourceEnvironment());
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

} //ResourceEnvironmentTest
