/**
 */
package usage.tests;

import junit.textui.TestRunner;

import usage.Branch;
import usage.UsageFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Branch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link usage.Branch#AllBranchProbabilitiesMustSumUpTo1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>All Branch Probabilities Must Sum Up To1</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class BranchTest extends AbstractUserActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BranchTest.class);
	}

	/**
	 * Constructs a new Branch test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BranchTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Branch test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Branch getFixture() {
		return (Branch)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UsageFactory.eINSTANCE.createBranch());
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
	 * Tests the '{@link usage.Branch#AllBranchProbabilitiesMustSumUpTo1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>All Branch Probabilities Must Sum Up To1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see usage.Branch#AllBranchProbabilitiesMustSumUpTo1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testAllBranchProbabilitiesMustSumUpTo1__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //BranchTest
