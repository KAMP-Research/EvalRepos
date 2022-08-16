/**
 */
package infrastructure.composition.tests;

import infrastructure.composition.AssemblyInfrastructureConnector;
import infrastructure.composition.CompositionFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Assembly Infrastructure Connector</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssemblyInfrastructureConnectorTest extends TestCase {

	/**
	 * The fixture for this Assembly Infrastructure Connector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyInfrastructureConnector fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AssemblyInfrastructureConnectorTest.class);
	}

	/**
	 * Constructs a new Assembly Infrastructure Connector test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyInfrastructureConnectorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Assembly Infrastructure Connector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AssemblyInfrastructureConnector fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Assembly Infrastructure Connector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyInfrastructureConnector getFixture() {
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
		setFixture(CompositionFactory.eINSTANCE.createAssemblyInfrastructureConnector());
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

} //AssemblyInfrastructureConnectorTest
