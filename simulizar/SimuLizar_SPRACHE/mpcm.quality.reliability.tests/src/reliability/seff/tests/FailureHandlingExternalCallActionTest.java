/**
 */
package reliability.seff.tests;

import junit.textui.TestRunner;

import reliability.seff.FailureHandlingExternalCallAction;
import reliability.seff.SeffFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Failure Handling External Call Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FailureHandlingExternalCallActionTest extends FailureHandlingEntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FailureHandlingExternalCallActionTest.class);
	}

	/**
	 * Constructs a new Failure Handling External Call Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureHandlingExternalCallActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Failure Handling External Call Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FailureHandlingExternalCallAction getFixture() {
		return (FailureHandlingExternalCallAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SeffFactory.eINSTANCE.createFailureHandlingExternalCallAction());
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

} //FailureHandlingExternalCallActionTest
