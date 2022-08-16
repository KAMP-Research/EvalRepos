/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.tests;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryFactory;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.RampModule;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ramp Module</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RampModuleTest extends ModuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RampModuleTest.class);
	}

	/**
	 * Constructs a new Ramp Module test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RampModuleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Ramp Module test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RampModule getFixture() {
		return (RampModule)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModuleRepositoryFactory.eINSTANCE.createRampModule());
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

} //RampModuleTest
