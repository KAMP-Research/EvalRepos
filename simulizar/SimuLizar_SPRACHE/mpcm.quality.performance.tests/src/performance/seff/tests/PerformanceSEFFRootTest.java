/**
 */
package performance.seff.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import performance.seff.PerformanceSEFFRoot;
import performance.seff.SeffFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Performance SEFF Root</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PerformanceSEFFRootTest extends TestCase {

	/**
	 * The fixture for this Performance SEFF Root test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerformanceSEFFRoot fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PerformanceSEFFRootTest.class);
	}

	/**
	 * Constructs a new Performance SEFF Root test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformanceSEFFRootTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Performance SEFF Root test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PerformanceSEFFRoot fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Performance SEFF Root test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerformanceSEFFRoot getFixture() {
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
		setFixture(SeffFactory.eINSTANCE.createPerformanceSEFFRoot());
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

} //PerformanceSEFFRootTest
