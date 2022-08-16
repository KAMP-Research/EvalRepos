/**
 */
package allocation.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>allocation</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class AllocationDomainTests extends TestSuite {

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
		TestSuite suite = new AllocationDomainTests("allocation Tests");
		suite.addTestSuite(AllocationTest.class);
		suite.addTestSuite(AllocationContextTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationDomainTests(String name) {
		super(name);
	}

} //AllocationDomainTests
