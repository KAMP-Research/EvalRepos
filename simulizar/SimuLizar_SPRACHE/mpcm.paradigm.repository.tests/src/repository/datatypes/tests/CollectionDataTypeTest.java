/**
 */
package repository.datatypes.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import repository.datatypes.CollectionDataType;
import repository.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Collection Data Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CollectionDataTypeTest extends TestCase {

	/**
	 * The fixture for this Collection Data Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionDataType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CollectionDataTypeTest.class);
	}

	/**
	 * Constructs a new Collection Data Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionDataTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Collection Data Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CollectionDataType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Collection Data Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionDataType getFixture() {
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
		setFixture(DatatypesFactory.eINSTANCE.createCollectionDataType());
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

} //CollectionDataTypeTest
