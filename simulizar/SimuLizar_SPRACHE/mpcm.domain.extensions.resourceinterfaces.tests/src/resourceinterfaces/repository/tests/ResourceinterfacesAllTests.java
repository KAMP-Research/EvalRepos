/**
 */
package resourceinterfaces.repository.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

import resourceinterfaces.seff.tests.SeffTests;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Resourceinterfaces</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceinterfacesAllTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new ResourceinterfacesAllTests("Resourceinterfaces Tests");
		suite.addTest(SeffTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceinterfacesAllTests(String name) {
		super(name);
	}

} //ResourceinterfacesAllTests
