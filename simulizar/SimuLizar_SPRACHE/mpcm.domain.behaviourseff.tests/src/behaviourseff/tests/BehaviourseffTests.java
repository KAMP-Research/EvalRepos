/**
 */
package behaviourseff.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>behaviourseff</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviourseffTests extends TestSuite {

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
		TestSuite suite = new BehaviourseffTests("behaviourseff Tests");
		suite.addTestSuite(BehaviourSEFFTest.class);
		suite.addTestSuite(ExternalCallActionTest.class);
		suite.addTestSuite(AcquireActionTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourseffTests(String name) {
		super(name);
	}

} //BehaviourseffTests
