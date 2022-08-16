/**
 */
package softwarecomposition.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>softwarecomposition</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class SoftwarecompositionTests extends TestSuite {

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
		TestSuite suite = new SoftwarecompositionTests("softwarecomposition Tests");
		suite.addTestSuite(SystemTest.class);
		suite.addTestSuite(CompositeComponentTest.class);
		suite.addTestSuite(SubSystemTest.class);
		suite.addTestSuite(AssemblyConnectorTest.class);
		suite.addTestSuite(ProvidedDelegationConnectorTest.class);
		suite.addTestSuite(RequiredDelegationConnectorTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwarecompositionTests(String name) {
		super(name);
	}

} //SoftwarecompositionTests
