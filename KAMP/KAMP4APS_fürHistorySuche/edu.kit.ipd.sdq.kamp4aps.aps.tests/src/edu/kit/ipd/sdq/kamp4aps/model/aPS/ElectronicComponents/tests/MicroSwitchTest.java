/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.tests;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.ElectronicComponentsFactory;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.MicroSwitch;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Micro Switch</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MicroSwitchTest extends SwitchTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MicroSwitchTest.class);
	}

	/**
	 * Constructs a new Micro Switch test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroSwitchTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Micro Switch test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MicroSwitch getFixture() {
		return (MicroSwitch)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ElectronicComponentsFactory.eINSTANCE.createMicroSwitch());
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

} //MicroSwitchTest
