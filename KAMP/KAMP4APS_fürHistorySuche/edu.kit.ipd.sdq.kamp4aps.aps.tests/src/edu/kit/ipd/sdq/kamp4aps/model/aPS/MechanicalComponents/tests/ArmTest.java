/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.tests;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.tests.MechanicalAssemblyTest;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.Arm;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.MechanicalComponentsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Arm</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArmTest extends MechanicalAssemblyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ArmTest.class);
	}

	/**
	 * Constructs a new Arm test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArmTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Arm test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Arm getFixture() {
		return (Arm)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MechanicalComponentsFactory.eINSTANCE.createArm());
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

} //ArmTest
