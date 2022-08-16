/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.tests;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.InterfaceRepositoryFactory;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Suspension;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Suspension</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SuspensionTest extends InterfaceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SuspensionTest.class);
	}

	/**
	 * Constructs a new Suspension test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuspensionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Suspension test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Suspension getFixture() {
		return (Suspension)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(InterfaceRepositoryFactory.eINSTANCE.createSuspension());
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

} //SuspensionTest
