/**
 */
package softwarerepository.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import softwarerepository.PassiveResource;
import softwarerepository.SoftwarerepositoryFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Passive Resource</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PassiveResourceTest extends TestCase {

	/**
	 * The fixture for this Passive Resource test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PassiveResource fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PassiveResourceTest.class);
	}

	/**
	 * Constructs a new Passive Resource test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassiveResourceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Passive Resource test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PassiveResource fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Passive Resource test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PassiveResource getFixture() {
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
		setFixture(SoftwarerepositoryFactory.eINSTANCE.createPassiveResource());
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

} //PassiveResourceTest
