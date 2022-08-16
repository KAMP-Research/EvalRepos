/**
 */
package infrastructure.repository.tests;

import infrastructure.seff.tests.SeffTests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Infrastructure</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class InfrastructureAllTests extends TestSuite {

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
		TestSuite suite = new InfrastructureAllTests("Infrastructure Tests");
		suite.addTest(RepositoryTests.suite());
		suite.addTest(SeffTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureAllTests(String name) {
		super(name);
	}

} //InfrastructureAllTests
