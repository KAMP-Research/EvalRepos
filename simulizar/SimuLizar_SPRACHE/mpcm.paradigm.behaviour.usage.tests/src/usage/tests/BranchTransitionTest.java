/**
 */
package usage.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import usage.BranchTransition;
import usage.UsageFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Branch Transition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BranchTransitionTest extends TestCase {

	/**
	 * The fixture for this Branch Transition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BranchTransition fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BranchTransitionTest.class);
	}

	/**
	 * Constructs a new Branch Transition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BranchTransitionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Branch Transition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(BranchTransition fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Branch Transition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BranchTransition getFixture() {
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
		setFixture(UsageFactory.eINSTANCE.createBranchTransition());
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

} //BranchTransitionTest
