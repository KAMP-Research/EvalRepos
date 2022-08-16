/**
 */
package events.allocation.tests;

import events.allocation.AllocationFactory;
import events.allocation.EventChannelAllocation;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Event Channel Allocation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EventChannelAllocationTest extends TestCase {

	/**
	 * The fixture for this Event Channel Allocation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventChannelAllocation fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EventChannelAllocationTest.class);
	}

	/**
	 * Constructs a new Event Channel Allocation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventChannelAllocationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Event Channel Allocation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(EventChannelAllocation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Event Channel Allocation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventChannelAllocation getFixture() {
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
		setFixture(AllocationFactory.eINSTANCE.createEventChannelAllocation());
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

} //EventChannelAllocationTest
