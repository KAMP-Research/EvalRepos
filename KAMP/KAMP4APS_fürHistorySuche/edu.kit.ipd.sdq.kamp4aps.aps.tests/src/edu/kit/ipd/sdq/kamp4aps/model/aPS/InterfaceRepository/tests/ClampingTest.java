/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.tests;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Clamping;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.InterfaceRepositoryFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Clamping</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClampingTest extends InterfaceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClampingTest.class);
	}

	/**
	 * Constructs a new Clamping test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClampingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Clamping test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Clamping getFixture() {
		return (Clamping)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(InterfaceRepositoryFactory.eINSTANCE.createClamping());
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

} //ClampingTest
