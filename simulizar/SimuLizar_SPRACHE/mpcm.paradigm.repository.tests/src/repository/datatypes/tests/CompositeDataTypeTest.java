/**
 */
package repository.datatypes.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import repository.datatypes.CompositeDataType;
import repository.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Composite Data Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompositeDataTypeTest extends TestCase {

	/**
	 * The fixture for this Composite Data Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeDataType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CompositeDataTypeTest.class);
	}

	/**
	 * Constructs a new Composite Data Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeDataTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Composite Data Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CompositeDataType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Composite Data Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeDataType getFixture() {
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
		setFixture(DatatypesFactory.eINSTANCE.createCompositeDataType());
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

} //CompositeDataTypeTest
