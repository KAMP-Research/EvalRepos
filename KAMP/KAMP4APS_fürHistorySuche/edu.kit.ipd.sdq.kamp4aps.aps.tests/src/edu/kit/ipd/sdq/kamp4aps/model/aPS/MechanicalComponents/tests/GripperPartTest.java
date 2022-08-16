/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.tests;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.tests.MechanicalAssemblyTest;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.GripperPart;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.MechanicalComponentsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Gripper Part</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GripperPartTest extends MechanicalAssemblyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GripperPartTest.class);
	}

	/**
	 * Constructs a new Gripper Part test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GripperPartTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Gripper Part test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GripperPart getFixture() {
		return (GripperPart)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MechanicalComponentsFactory.eINSTANCE.createGripperPart());
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

} //GripperPartTest
