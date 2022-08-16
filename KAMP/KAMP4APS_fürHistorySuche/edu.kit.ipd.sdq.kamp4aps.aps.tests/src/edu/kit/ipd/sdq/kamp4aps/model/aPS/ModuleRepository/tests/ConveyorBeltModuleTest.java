/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.tests;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ConveyorBeltModule;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Conveyor Belt Module</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConveyorBeltModuleTest extends ModuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConveyorBeltModuleTest.class);
	}

	/**
	 * Constructs a new Conveyor Belt Module test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConveyorBeltModuleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Conveyor Belt Module test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ConveyorBeltModule getFixture() {
		return (ConveyorBeltModule)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModuleRepositoryFactory.eINSTANCE.createConveyorBeltModule());
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

} //ConveyorBeltModuleTest
