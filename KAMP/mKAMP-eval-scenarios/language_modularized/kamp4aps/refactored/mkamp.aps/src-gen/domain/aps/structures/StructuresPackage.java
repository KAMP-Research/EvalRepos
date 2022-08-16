/**
 */
package domain.aps.structures;

import domain.as.StructureRepository.StructureRepositoryPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see domain.aps.structures.StructuresFactory
 * @model kind="package"
 * @generated
 */
public interface StructuresPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "structures";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "structures";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "structures";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StructuresPackage eINSTANCE = domain.aps.structures.impl.StructuresPackageImpl.init();

	/**
	 * The meta object id for the '{@link domain.aps.structures.impl.ControlCabinetImpl <em>Control Cabinet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.structures.impl.ControlCabinetImpl
	 * @see domain.aps.structures.impl.StructuresPackageImpl#getControlCabinet()
	 * @generated
	 */
	int CONTROL_CABINET = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CABINET__ID = StructureRepositoryPackage.STRUCTURE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CABINET__NAME = StructureRepositoryPackage.STRUCTURE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Plant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CABINET__PARENT_PLANT = StructureRepositoryPackage.STRUCTURE__PARENT_PLANT;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CABINET__MODULES = StructureRepositoryPackage.STRUCTURE__MODULES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CABINET__COMPONENTS = StructureRepositoryPackage.STRUCTURE__COMPONENTS;

	/**
	 * The number of structural features of the '<em>Control Cabinet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CABINET_FEATURE_COUNT = StructureRepositoryPackage.STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Control Cabinet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CABINET_OPERATION_COUNT = StructureRepositoryPackage.STRUCTURE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link domain.aps.structures.ControlCabinet <em>Control Cabinet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Cabinet</em>'.
	 * @see domain.aps.structures.ControlCabinet
	 * @generated
	 */
	EClass getControlCabinet();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StructuresFactory getStructuresFactory();

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
		 * The meta object literal for the '{@link domain.aps.structures.impl.ControlCabinetImpl <em>Control Cabinet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.structures.impl.ControlCabinetImpl
		 * @see domain.aps.structures.impl.StructuresPackageImpl#getControlCabinet()
		 * @generated
		 */
		EClass CONTROL_CABINET = eINSTANCE.getControlCabinet();

	}

} //StructuresPackage
