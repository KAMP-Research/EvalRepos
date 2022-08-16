/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.tests;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Fixture;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.InterfaceRepositoryFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Fixture</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FixtureTest extends InterfaceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FixtureTest.class);
	}

	/**
	 * Constructs a new Fixture test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixtureTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Fixture test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Fixture getFixture() {
		return (Fixture)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(InterfaceRepositoryFactory.eINSTANCE.createFixture());
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

} //FixtureTest
