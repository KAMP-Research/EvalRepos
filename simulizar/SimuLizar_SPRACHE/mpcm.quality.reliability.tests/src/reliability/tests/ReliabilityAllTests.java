/**
 */
package reliability.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

import reliability.failuretypes.tests.FailuretypesTests;

import reliability.seff.tests.SeffTests;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Reliability</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReliabilityAllTests extends TestSuite {

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
		TestSuite suite = new ReliabilityAllTests("Reliability Tests");
		suite.addTest(ReliabilityTests.suite());
		suite.addTest(SeffTests.suite());
		suite.addTest(FailuretypesTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReliabilityAllTests(String name) {
		super(name);
	}

} //ReliabilityAllTests
