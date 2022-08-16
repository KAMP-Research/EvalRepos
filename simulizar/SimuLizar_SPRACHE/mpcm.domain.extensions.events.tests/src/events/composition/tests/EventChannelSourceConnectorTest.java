/**
 */
package events.composition.tests;

import events.composition.CompositionFactory;
import events.composition.EventChannelSourceConnector;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Event Channel Source Connector</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EventChannelSourceConnectorTest extends TestCase {

	/**
	 * The fixture for this Event Channel Source Connector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventChannelSourceConnector fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EventChannelSourceConnectorTest.class);
	}

	/**
	 * Constructs a new Event Channel Source Connector test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventChannelSourceConnectorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Event Channel Source Connector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(EventChannelSourceConnector fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Event Channel Source Connector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventChannelSourceConnector getFixture() {
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
		setFixture(CompositionFactory.eINSTANCE.createEventChannelSourceConnector());
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

} //EventChannelSourceConnectorTest
