/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.tests;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Crane;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.StructureRepositoryFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Crane</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CraneTest extends StructureTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CraneTest.class);
	}

	/**
	 * Constructs a new Crane test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CraneTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Crane test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Crane getFixture() {
		return (Crane)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StructureRepositoryFactory.eINSTANCE.createCrane());
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

} //CraneTest
