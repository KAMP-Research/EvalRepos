/**
 */
package softwareusage.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import softwareusage.SoftwareusageFactory;
import softwareusage.UsageModel;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Usage Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UsageModelTest extends TestCase {

	/**
	 * The fixture for this Usage Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsageModel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UsageModelTest.class);
	}

	/**
	 * Constructs a new Usage Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageModelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Usage Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(UsageModel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Usage Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsageModel getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SoftwareusageFactory.eINSTANCE.createUsageModel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //UsageModelTest
