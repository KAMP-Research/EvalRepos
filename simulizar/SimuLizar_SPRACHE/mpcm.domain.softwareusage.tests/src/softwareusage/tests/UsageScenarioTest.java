/**
 */
package softwareusage.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import softwareusage.SoftwareusageFactory;
import softwareusage.UsageScenario;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Usage Scenario</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UsageScenarioTest extends TestCase {

	/**
	 * The fixture for this Usage Scenario test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsageScenario fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UsageScenarioTest.class);
	}

	/**
	 * Constructs a new Usage Scenario test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageScenarioTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Usage Scenario test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(UsageScenario fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Usage Scenario test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsageScenario getFixture() {
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
		setFixture(SoftwareusageFactory.eINSTANCE.createUsageScenario());
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

} //UsageScenarioTest
