/**
 */
package reliability.repository.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import reliability.repository.ReliabilityContainer;
import reliability.repository.RepositoryFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Reliability Container</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReliabilityContainerTest extends TestCase {

	/**
	 * The fixture for this Reliability Container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReliabilityContainer fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReliabilityContainerTest.class);
	}

	/**
	 * Constructs a new Reliability Container test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReliabilityContainerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Reliability Container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ReliabilityContainer fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Reliability Container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReliabilityContainer getFixture() {
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
		setFixture(RepositoryFactory.eINSTANCE.createReliabilityContainer());
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

} //ReliabilityContainerTest
