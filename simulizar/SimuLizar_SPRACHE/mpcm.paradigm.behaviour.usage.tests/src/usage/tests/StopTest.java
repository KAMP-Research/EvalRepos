/**
 */
package usage.tests;

import junit.textui.TestRunner;

import usage.Stop;
import usage.UsageFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Stop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link usage.Stop#StopHasNoSuccessor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Stop Has No Successor</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class StopTest extends AbstractUserActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StopTest.class);
	}

	/**
	 * Constructs a new Stop test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StopTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Stop test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Stop getFixture() {
		return (Stop)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UsageFactory.eINSTANCE.createStop());
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

	/**
	 * Tests the '{@link usage.Stop#StopHasNoSuccessor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Stop Has No Successor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see usage.Stop#StopHasNoSuccessor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testStopHasNoSuccessor__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //StopTest
