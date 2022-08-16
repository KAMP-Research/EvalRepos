/**
 */
package reliability.failuretypes.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>failuretypes</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class FailuretypesTests extends TestSuite {

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
		TestSuite suite = new FailuretypesTests("failuretypes Tests");
		suite.addTestSuite(NetworkInducedFailureTypeTest.class);
		suite.addTestSuite(HardwareInducedFailureTypeTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailuretypesTests(String name) {
		super(name);
	}

} //FailuretypesTests
