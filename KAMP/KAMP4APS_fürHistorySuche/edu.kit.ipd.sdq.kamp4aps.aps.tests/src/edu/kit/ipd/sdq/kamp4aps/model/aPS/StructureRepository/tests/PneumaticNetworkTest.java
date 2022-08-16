/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.tests;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.PneumaticNetwork;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.StructureRepositoryFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pneumatic Network</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PneumaticNetworkTest extends StructureTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PneumaticNetworkTest.class);
	}

	/**
	 * Constructs a new Pneumatic Network test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PneumaticNetworkTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Pneumatic Network test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PneumaticNetwork getFixture() {
		return (PneumaticNetwork)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StructureRepositoryFactory.eINSTANCE.createPneumaticNetwork());
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

} //PneumaticNetworkTest
