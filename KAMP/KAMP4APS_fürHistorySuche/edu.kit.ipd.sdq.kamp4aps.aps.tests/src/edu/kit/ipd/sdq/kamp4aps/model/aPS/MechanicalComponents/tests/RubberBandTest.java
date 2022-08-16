/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.tests;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.MechanicalComponentsFactory;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.RubberBand;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Rubber Band</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RubberBandTest extends MechanicalPartTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RubberBandTest.class);
	}

	/**
	 * Constructs a new Rubber Band test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RubberBandTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Rubber Band test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RubberBand getFixture() {
		return (RubberBand)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MechanicalComponentsFactory.eINSTANCE.createRubberBand());
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

} //RubberBandTest
