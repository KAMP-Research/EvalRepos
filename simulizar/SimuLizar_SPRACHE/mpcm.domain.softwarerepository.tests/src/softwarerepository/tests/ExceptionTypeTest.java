/**
 */
package softwarerepository.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import softwarerepository.ExceptionType;
import softwarerepository.SoftwarerepositoryFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Exception Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExceptionTypeTest extends TestCase {

	/**
	 * The fixture for this Exception Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExceptionType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExceptionTypeTest.class);
	}

	/**
	 * Constructs a new Exception Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Exception Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ExceptionType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Exception Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExceptionType getFixture() {
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
		setFixture(SoftwarerepositoryFactory.eINSTANCE.createExceptionType());
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

} //ExceptionTypeTest
