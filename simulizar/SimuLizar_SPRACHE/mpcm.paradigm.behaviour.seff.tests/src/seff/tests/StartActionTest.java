/**
 */
package seff.tests;

import junit.textui.TestRunner;

import seff.SeffFactory;
import seff.StartAction;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Start Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link seff.StartAction#StartActionPredecessorMustNotBeDefined(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Start Action Predecessor Must Not Be Defined</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class StartActionTest extends AbstractInternalControlFlowActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StartActionTest.class);
	}

	/**
	 * Constructs a new Start Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Start Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StartAction getFixture() {
		return (StartAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SeffFactory.eINSTANCE.createStartAction());
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
	 * Tests the '{@link seff.StartAction#StartActionPredecessorMustNotBeDefined(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Start Action Predecessor Must Not Be Defined</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see seff.StartAction#StartActionPredecessorMustNotBeDefined(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testStartActionPredecessorMustNotBeDefined__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //StartActionTest
