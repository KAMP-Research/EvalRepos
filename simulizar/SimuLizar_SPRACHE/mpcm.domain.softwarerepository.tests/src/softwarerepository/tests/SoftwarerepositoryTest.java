/**
 */
package softwarerepository.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import softwarerepository.Softwarerepository;
import softwarerepository.SoftwarerepositoryFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Softwarerepository</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SoftwarerepositoryTest extends TestCase {

	/**
	 * The fixture for this Softwarerepository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Softwarerepository fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SoftwarerepositoryTest.class);
	}

	/**
	 * Constructs a new Softwarerepository test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwarerepositoryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Softwarerepository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Softwarerepository fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Softwarerepository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Softwarerepository getFixture() {
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
		setFixture(SoftwarerepositoryFactory.eINSTANCE.createSoftwarerepository());
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

} //SoftwarerepositoryTest
