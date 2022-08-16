/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.tests;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.PowerNetwork;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.StructureRepositoryFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Power Network</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PowerNetworkTest extends StructureTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PowerNetworkTest.class);
	}

	/**
	 * Constructs a new Power Network test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerNetworkTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Power Network test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PowerNetwork getFixture() {
		return (PowerNetwork)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StructureRepositoryFactory.eINSTANCE.createPowerNetwork());
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

} //PowerNetworkTest
