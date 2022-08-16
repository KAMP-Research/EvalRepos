/**
 */
package seff.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import seff.SeffFactory;
import seff.SynchronisationPoint;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Synchronisation Point</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SynchronisationPointTest extends TestCase {

	/**
	 * The fixture for this Synchronisation Point test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynchronisationPoint fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SynchronisationPointTest.class);
	}

	/**
	 * Constructs a new Synchronisation Point test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronisationPointTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Synchronisation Point test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SynchronisationPoint fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Synchronisation Point test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynchronisationPoint getFixture() {
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
		setFixture(SeffFactory.eINSTANCE.createSynchronisationPoint());
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

} //SynchronisationPointTest
