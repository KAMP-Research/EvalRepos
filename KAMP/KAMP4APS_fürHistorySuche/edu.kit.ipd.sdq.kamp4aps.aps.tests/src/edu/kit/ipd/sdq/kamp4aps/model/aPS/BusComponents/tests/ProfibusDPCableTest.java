/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.tests;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusComponentsFactory;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.ProfibusDPCable;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Profibus DP Cable</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProfibusDPCableTest extends BusCableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProfibusDPCableTest.class);
	}

	/**
	 * Constructs a new Profibus DP Cable test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfibusDPCableTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Profibus DP Cable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ProfibusDPCable getFixture() {
		return (ProfibusDPCable)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BusComponentsFactory.eINSTANCE.createProfibusDPCable());
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

} //ProfibusDPCableTest
