/**
 */
package softwarerepository.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>softwarerepository</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class SoftwarerepositoryTests extends TestSuite {

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
		TestSuite suite = new SoftwarerepositoryTests("softwarerepository Tests");
		suite.addTestSuite(BasicComponentTest.class);
		suite.addTestSuite(OperationInterfaceTest.class);
		suite.addTestSuite(OperationSignatureTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwarerepositoryTests(String name) {
		super(name);
	}

} //SoftwarerepositoryTests
