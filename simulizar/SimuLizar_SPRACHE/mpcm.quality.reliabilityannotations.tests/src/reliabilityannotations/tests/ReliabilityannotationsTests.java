/**
 */
package reliabilityannotations.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>reliabilityannotations</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReliabilityannotationsTests extends TestSuite {

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
		TestSuite suite = new ReliabilityannotationsTests("reliabilityannotations Tests");
		suite.addTestSuite(ServiceReliabilityAnnotationTest.class);
		suite.addTestSuite(ExternalFailureOccurrenceDescriptionTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReliabilityannotationsTests(String name) {
		super(name);
	}

} //ReliabilityannotationsTests
