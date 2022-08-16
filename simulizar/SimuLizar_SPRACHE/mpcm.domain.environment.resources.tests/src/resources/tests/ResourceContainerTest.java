/**
 */
package resources.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import resources.ResourceContainer;
import resources.ResourcesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resource Container</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceContainerTest extends TestCase {

	/**
	 * The fixture for this Resource Container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceContainer fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResourceContainerTest.class);
	}

	/**
	 * Constructs a new Resource Container test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceContainerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Resource Container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ResourceContainer fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Resource Container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceContainer getFixture() {
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
		setFixture(ResourcesFactory.eINSTANCE.createResourceContainer());
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

} //ResourceContainerTest
