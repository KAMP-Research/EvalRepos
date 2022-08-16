/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.tests;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusComponentsFactory;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.EtherCATBox;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ether CAT Box</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EtherCATBoxTest extends BusBoxTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EtherCATBoxTest.class);
	}

	/**
	 * Constructs a new Ether CAT Box test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EtherCATBoxTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Ether CAT Box test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EtherCATBox getFixture() {
		return (EtherCATBox)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BusComponentsFactory.eINSTANCE.createEtherCATBox());
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

} //EtherCATBoxTest
