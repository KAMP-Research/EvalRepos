/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.tests;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusComponentsFactory;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusMaster;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.tests.ComponentTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bus Master</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BusMasterTest extends ComponentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BusMasterTest.class);
	}

	/**
	 * Constructs a new Bus Master test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusMasterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bus Master test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BusMaster getFixture() {
		return (BusMaster)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BusComponentsFactory.eINSTANCE.createBusMaster());
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

} //BusMasterTest
