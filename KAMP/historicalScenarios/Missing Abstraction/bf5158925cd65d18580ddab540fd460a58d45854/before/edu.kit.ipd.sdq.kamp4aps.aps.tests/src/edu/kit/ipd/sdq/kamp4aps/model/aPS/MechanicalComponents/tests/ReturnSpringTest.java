/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.tests;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.MechanicalComponentsFactory;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.ReturnSpring;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Return Spring</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReturnSpringTest extends MechanicalPartTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReturnSpringTest.class);
	}

	/**
	 * Constructs a new Return Spring test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnSpringTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Return Spring test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ReturnSpring getFixture() {
		return (ReturnSpring)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MechanicalComponentsFactory.eINSTANCE.createReturnSpring());
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

} //ReturnSpringTest
