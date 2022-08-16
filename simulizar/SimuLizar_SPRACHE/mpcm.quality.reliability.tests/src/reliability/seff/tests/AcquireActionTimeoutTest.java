/**
 */
package reliability.seff.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import reliability.seff.AcquireActionTimeout;
import reliability.seff.SeffFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Acquire Action Timeout</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AcquireActionTimeoutTest extends TestCase {

	/**
	 * The fixture for this Acquire Action Timeout test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcquireActionTimeout fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AcquireActionTimeoutTest.class);
	}

	/**
	 * Constructs a new Acquire Action Timeout test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcquireActionTimeoutTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Acquire Action Timeout test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AcquireActionTimeout fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Acquire Action Timeout test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcquireActionTimeout getFixture() {
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
		setFixture(SeffFactory.eINSTANCE.createAcquireActionTimeout());
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

} //AcquireActionTimeoutTest
