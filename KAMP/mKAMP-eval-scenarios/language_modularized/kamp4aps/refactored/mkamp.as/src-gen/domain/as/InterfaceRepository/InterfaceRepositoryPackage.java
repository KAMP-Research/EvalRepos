/**
 */
package domain.as.InterfaceRepository;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import paradigm.basic.BasicPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see domain.as.InterfaceRepository.InterfaceRepositoryFactory
 * @model kind="package"
 * @generated
 */
public interface InterfaceRepositoryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "InterfaceRepository";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "edu.kit.ipd.sdq.kaps.xppu.interfacerepository";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "InterfaceRepository";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InterfaceRepositoryPackage eINSTANCE = domain.as.InterfaceRepository.impl.InterfaceRepositoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link domain.as.InterfaceRepository.impl.InterfaceRepositoryImpl <em>Interface Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.as.InterfaceRepository.impl.InterfaceRepositoryImpl
	 * @see domain.as.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getInterfaceRepository()
	 * @generated
	 */
	int INTERFACE_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REPOSITORY__ID = BasicPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REPOSITORY__NAME = BasicPackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>All Interfaces In Plant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REPOSITORY__ALL_INTERFACES_IN_PLANT = BasicPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REPOSITORY_FEATURE_COUNT = BasicPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interface Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REPOSITORY_OPERATION_COUNT = BasicPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.as.InterfaceRepository.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.as.InterfaceRepository.impl.InterfaceImpl
	 * @see domain.as.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ID = BasicPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = BasicPackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__PARENT_ELEMENT = BasicPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = BasicPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = BasicPackage.ENTITY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link domain.as.InterfaceRepository.InterfaceRepository <em>Interface Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Repository</em>'.
	 * @see domain.as.InterfaceRepository.InterfaceRepository
	 * @generated
	 */
	EClass getInterfaceRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link domain.as.InterfaceRepository.InterfaceRepository#getAllInterfacesInPlant <em>All Interfaces In Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Interfaces In Plant</em>'.
	 * @see domain.as.InterfaceRepository.InterfaceRepository#getAllInterfacesInPlant()
	 * @see #getInterfaceRepository()
	 * @generated
	 */
	EReference getInterfaceRepository_AllInterfacesInPlant();

	/**
	 * Returns the meta object for class '{@link domain.as.InterfaceRepository.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see domain.as.InterfaceRepository.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the reference list '{@link domain.as.InterfaceRepository.Interface#getParentElement <em>Parent Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent Element</em>'.
	 * @see domain.as.InterfaceRepository.Interface#getParentElement()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_ParentElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InterfaceRepositoryFactory getInterfaceRepositoryFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link domain.as.InterfaceRepository.impl.InterfaceRepositoryImpl <em>Interface Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.as.InterfaceRepository.impl.InterfaceRepositoryImpl
		 * @see domain.as.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getInterfaceRepository()
		 * @generated
		 */
		EClass INTERFACE_REPOSITORY = eINSTANCE.getInterfaceRepository();

		/**
		 * The meta object literal for the '<em><b>All Interfaces In Plant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_REPOSITORY__ALL_INTERFACES_IN_PLANT = eINSTANCE.getInterfaceRepository_AllInterfacesInPlant();

		/**
		 * The meta object literal for the '{@link domain.as.InterfaceRepository.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.as.InterfaceRepository.impl.InterfaceImpl
		 * @see domain.as.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Parent Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__PARENT_ELEMENT = eINSTANCE.getInterface_ParentElement();

	}

} //InterfaceRepositoryPackage
