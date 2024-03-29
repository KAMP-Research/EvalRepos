/**
 */
package domain.as;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see domain.as.AsFactory
 * @model kind="package"
 * @generated
 */
public interface AsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "as";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "as";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "as";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AsPackage eINSTANCE = domain.as.impl.AsPackageImpl.init();

	/**
	 * The meta object id for the '{@link domain.as.impl.PlantImpl <em>Plant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.as.impl.PlantImpl
	 * @see domain.as.impl.AsPackageImpl#getPlant()
	 * @generated
	 */
	int PLANT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__ID = BasicPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__NAME = BasicPackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Plant Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__PLANT_NAME = BasicPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Structures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__STRUCTURES = BasicPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interface Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__INTERFACE_REPOSITORY = BasicPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Component Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__COMPONENT_REPOSITORY = BasicPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Module Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__MODULE_REPOSITORY = BasicPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Plant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_FEATURE_COUNT = BasicPackage.ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Plant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_OPERATION_COUNT = BasicPackage.ENTITY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link domain.as.Plant <em>Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plant</em>'.
	 * @see domain.as.Plant
	 * @generated
	 */
	EClass getPlant();

	/**
	 * Returns the meta object for the attribute '{@link domain.as.Plant#getPlantName <em>Plant Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plant Name</em>'.
	 * @see domain.as.Plant#getPlantName()
	 * @see #getPlant()
	 * @generated
	 */
	EAttribute getPlant_PlantName();

	/**
	 * Returns the meta object for the containment reference list '{@link domain.as.Plant#getStructures <em>Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Structures</em>'.
	 * @see domain.as.Plant#getStructures()
	 * @see #getPlant()
	 * @generated
	 */
	EReference getPlant_Structures();

	/**
	 * Returns the meta object for the containment reference '{@link domain.as.Plant#getInterfaceRepository <em>Interface Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interface Repository</em>'.
	 * @see domain.as.Plant#getInterfaceRepository()
	 * @see #getPlant()
	 * @generated
	 */
	EReference getPlant_InterfaceRepository();

	/**
	 * Returns the meta object for the containment reference '{@link domain.as.Plant#getComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component Repository</em>'.
	 * @see domain.as.Plant#getComponentRepository()
	 * @see #getPlant()
	 * @generated
	 */
	EReference getPlant_ComponentRepository();

	/**
	 * Returns the meta object for the containment reference '{@link domain.as.Plant#getModuleRepository <em>Module Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Module Repository</em>'.
	 * @see domain.as.Plant#getModuleRepository()
	 * @see #getPlant()
	 * @generated
	 */
	EReference getPlant_ModuleRepository();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AsFactory getAsFactory();

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
		 * The meta object literal for the '{@link domain.as.impl.PlantImpl <em>Plant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.as.impl.PlantImpl
		 * @see domain.as.impl.AsPackageImpl#getPlant()
		 * @generated
		 */
		EClass PLANT = eINSTANCE.getPlant();

		/**
		 * The meta object literal for the '<em><b>Plant Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANT__PLANT_NAME = eINSTANCE.getPlant_PlantName();

		/**
		 * The meta object literal for the '<em><b>Structures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANT__STRUCTURES = eINSTANCE.getPlant_Structures();

		/**
		 * The meta object literal for the '<em><b>Interface Repository</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANT__INTERFACE_REPOSITORY = eINSTANCE.getPlant_InterfaceRepository();

		/**
		 * The meta object literal for the '<em><b>Component Repository</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANT__COMPONENT_REPOSITORY = eINSTANCE.getPlant_ComponentRepository();

		/**
		 * The meta object literal for the '<em><b>Module Repository</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANT__MODULE_REPOSITORY = eINSTANCE.getPlant_ModuleRepository();

	}

} //AsPackage
