/**
 */
package usage.tests;

import junit.textui.TestRunner;

import usage.Start;
import usage.UsageFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Start</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link usage.Start#StartHasNoPredecessor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Start Has No Predecessor</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class StartTest extends AbstractUserActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StartTest.class);
	}

	/**
	 * Constructs a new Start test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Start test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Start getFixture() {
		return (Start)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UsageFactory.eINSTANCE.createStart());
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
	 * Tests the '{@link usage.Start#StartHasNoPredecessor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Start Has No Predecessor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see usage.Start#StartHasNoPredecessor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testStartHasNoPredecessor__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //StartTest
