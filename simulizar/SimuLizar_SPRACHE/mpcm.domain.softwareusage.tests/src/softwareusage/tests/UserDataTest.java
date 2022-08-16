/**
 */
package softwareusage.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import softwareusage.SoftwareusageFactory;
import softwareusage.UserData;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>User Data</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UserDataTest extends TestCase {

	/**
	 * The fixture for this User Data test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserData fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UserDataTest.class);
	}

	/**
	 * Constructs a new User Data test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserDataTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this User Data test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(UserData fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this User Data test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserData getFixture() {
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
		setFixture(SoftwareusageFactory.eINSTANCE.createUserData());
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

} //UserDataTest
