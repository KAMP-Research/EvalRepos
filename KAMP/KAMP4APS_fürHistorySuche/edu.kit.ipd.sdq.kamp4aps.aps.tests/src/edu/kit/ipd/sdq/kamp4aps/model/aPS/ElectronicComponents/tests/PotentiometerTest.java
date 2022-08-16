/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.tests;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.ElectronicComponentsFactory;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.Potentiometer;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Potentiometer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PotentiometerTest extends ElectronicPartTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PotentiometerTest.class);
	}

	/**
	 * Constructs a new Potentiometer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PotentiometerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Potentiometer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Potentiometer getFixture() {
		return (Potentiometer)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ElectronicComponentsFactory.eINSTANCE.createPotentiometer());
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

} //PotentiometerTest
