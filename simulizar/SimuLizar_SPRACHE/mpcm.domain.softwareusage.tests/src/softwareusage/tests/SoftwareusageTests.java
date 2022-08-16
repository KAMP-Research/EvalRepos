/**
 */
package softwareusage.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>softwareusage</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class SoftwareusageTests extends TestSuite {

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
		TestSuite suite = new SoftwareusageTests("softwareusage Tests");
		suite.addTestSuite(OpenWorkloadTest.class);
		suite.addTestSuite(ClosedWorkloadTest.class);
		suite.addTestSuite(EntryLevelSystemCallTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareusageTests(String name) {
		super(name);
	}

} //SoftwareusageTests
