/**
 */
package performance.seff.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import performance.seff.ResourceDemandingSEFF;
import performance.seff.SeffFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resource Demanding SEFF</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceDemandingSEFFTest extends TestCase {

	/**
	 * The fixture for this Resource Demanding SEFF test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceDemandingSEFF fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResourceDemandingSEFFTest.class);
	}

	/**
	 * Constructs a new Resource Demanding SEFF test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceDemandingSEFFTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Resource Demanding SEFF test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ResourceDemandingSEFF fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Resource Demanding SEFF test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceDemandingSEFF getFixture() {
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
		setFixture(SeffFactory.eINSTANCE.createResourceDemandingSEFF());
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

} //ResourceDemandingSEFFTest
