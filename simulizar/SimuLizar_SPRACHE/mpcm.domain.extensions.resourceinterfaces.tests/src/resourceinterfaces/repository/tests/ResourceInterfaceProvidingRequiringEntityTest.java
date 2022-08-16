/**
 */
package resourceinterfaces.repository.tests;

import junit.textui.TestRunner;

import resourceinterfaces.repository.RepositoryFactory;
import resourceinterfaces.repository.ResourceInterfaceProvidingRequiringEntity;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resource Interface Providing Requiring Entity</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceInterfaceProvidingRequiringEntityTest extends ResourceInterfaceRequiringEntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResourceInterfaceProvidingRequiringEntityTest.class);
	}

	/**
	 * Constructs a new Resource Interface Providing Requiring Entity test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceInterfaceProvidingRequiringEntityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Resource Interface Providing Requiring Entity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ResourceInterfaceProvidingRequiringEntity getFixture() {
		return (ResourceInterfaceProvidingRequiringEntity)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RepositoryFactory.eINSTANCE.createResourceInterfaceProvidingRequiringEntity());
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

} //ResourceInterfaceProvidingRequiringEntityTest
