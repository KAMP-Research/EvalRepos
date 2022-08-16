/**
 */
package infrastructure.seff.tests;

import infrastructure.seff.InfrastructureSEFFRoot;
import infrastructure.seff.SeffFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Infrastructure SEFF Root</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InfrastructureSEFFRootTest extends TestCase {

	/**
	 * The fixture for this Infrastructure SEFF Root test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfrastructureSEFFRoot fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InfrastructureSEFFRootTest.class);
	}

	/**
	 * Constructs a new Infrastructure SEFF Root test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureSEFFRootTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Infrastructure SEFF Root test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(InfrastructureSEFFRoot fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Infrastructure SEFF Root test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfrastructureSEFFRoot getFixture() {
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
		setFixture(SeffFactory.eINSTANCE.createInfrastructureSEFFRoot());
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

} //InfrastructureSEFFRootTest
