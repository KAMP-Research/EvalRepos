/**
 */
package infrastructure.repository.tests;

import infrastructure.repository.InfrastructureRepositoryRoot;
import infrastructure.repository.RepositoryFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Infrastructure Repository Root</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InfrastructureRepositoryRootTest extends TestCase {

	/**
	 * The fixture for this Infrastructure Repository Root test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfrastructureRepositoryRoot fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InfrastructureRepositoryRootTest.class);
	}

	/**
	 * Constructs a new Infrastructure Repository Root test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureRepositoryRootTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Infrastructure Repository Root test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(InfrastructureRepositoryRoot fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Infrastructure Repository Root test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfrastructureRepositoryRoot getFixture() {
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
		setFixture(RepositoryFactory.eINSTANCE.createInfrastructureRepositoryRoot());
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

} //InfrastructureRepositoryRootTest
