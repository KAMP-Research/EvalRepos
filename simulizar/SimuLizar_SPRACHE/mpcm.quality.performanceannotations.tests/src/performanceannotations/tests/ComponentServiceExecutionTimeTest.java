/**
 */
package performanceannotations.tests;

import junit.textui.TestRunner;

import performanceannotations.ComponentServiceExecutionTime;
import performanceannotations.PerformanceannotationsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Component Service Execution Time</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentServiceExecutionTimeTest extends ServiceExecutionTimeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ComponentServiceExecutionTimeTest.class);
	}

	/**
	 * Constructs a new Component Service Execution Time test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentServiceExecutionTimeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Component Service Execution Time test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ComponentServiceExecutionTime getFixture() {
		return (ComponentServiceExecutionTime)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PerformanceannotationsFactory.eINSTANCE.createComponentServiceExecutionTime());
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

} //ComponentServiceExecutionTimeTest
