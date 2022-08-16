/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.tests;

import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Engineer;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.KAMP4aPSFieldofactivityannotationsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Engineer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EngineerTest extends RoleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EngineerTest.class);
	}

	/**
	 * Constructs a new Engineer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Engineer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Engineer getFixture() {
		return (Engineer)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(KAMP4aPSFieldofactivityannotationsFactory.eINSTANCE.createEngineer());
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

} //EngineerTest
