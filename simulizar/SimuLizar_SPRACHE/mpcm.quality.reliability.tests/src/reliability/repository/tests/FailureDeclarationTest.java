/**
 */
package reliability.repository.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import reliability.repository.FailureDeclaration;
import reliability.repository.RepositoryFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Failure Declaration</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FailureDeclarationTest extends TestCase {

	/**
	 * The fixture for this Failure Declaration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailureDeclaration fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FailureDeclarationTest.class);
	}

	/**
	 * Constructs a new Failure Declaration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureDeclarationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Failure Declaration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(FailureDeclaration fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Failure Declaration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailureDeclaration getFixture() {
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
		setFixture(RepositoryFactory.eINSTANCE.createFailureDeclaration());
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

} //FailureDeclarationTest
