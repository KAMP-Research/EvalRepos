/**
 */
package softwarerepository.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import softwarerepository.ExceptionOccurence;
import softwarerepository.SoftwarerepositoryFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Exception Occurence</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExceptionOccurenceTest extends TestCase {

	/**
	 * The fixture for this Exception Occurence test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExceptionOccurence fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExceptionOccurenceTest.class);
	}

	/**
	 * Constructs a new Exception Occurence test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionOccurenceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Exception Occurence test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ExceptionOccurence fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Exception Occurence test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExceptionOccurence getFixture() {
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
		setFixture(SoftwarerepositoryFactory.eINSTANCE.createExceptionOccurence());
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

} //ExceptionOccurenceTest
