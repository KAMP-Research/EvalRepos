/**
 */
package domain.ppu.ppumechanicalcomponents;

import domain.aps.components.ComponentsPackage;

import domain.aps.mechanicalcomponents.MechanicalcomponentsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see domain.ppu.ppumechanicalcomponents.PpumechanicalcomponentsFactory
 * @model kind="package"
 * @generated
 */
public interface PpumechanicalcomponentsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ppumechanicalcomponents";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ppumechanicalcomponents";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ppumechanicalcomponents";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PpumechanicalcomponentsPackage eINSTANCE = domain.ppu.ppumechanicalcomponents.impl.PpumechanicalcomponentsPackageImpl.init();

	/**
	 * The meta object id for the '{@link domain.ppu.ppumechanicalcomponents.impl.ArmImpl <em>Arm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppumechanicalcomponents.impl.ArmImpl
	 * @see domain.ppu.ppumechanicalcomponents.impl.PpumechanicalcomponentsPackageImpl#getArm()
	 * @generated
	 */
	int ARM = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARM__ID = ComponentsPackage.MECHANICAL_ASSEMBLY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARM__NAME = ComponentsPackage.MECHANICAL_ASSEMBLY__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARM__CONNECTED_INTERFACES = ComponentsPackage.MECHANICAL_ASSEMBLY__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARM__PARENT = ComponentsPackage.MECHANICAL_ASSEMBLY__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARM__PARENT_MODULE = ComponentsPackage.MECHANICAL_ASSEMBLY__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Mounted To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARM__MOUNTED_TO = ComponentsPackage.MECHANICAL_ASSEMBLY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARM_FEATURE_COUNT = ComponentsPackage.MECHANICAL_ASSEMBLY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Arm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARM_OPERATION_COUNT = ComponentsPackage.MECHANICAL_ASSEMBLY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppumechanicalcomponents.impl.HousingImpl <em>Housing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppumechanicalcomponents.impl.HousingImpl
	 * @see domain.ppu.ppumechanicalcomponents.impl.PpumechanicalcomponentsPackageImpl#getHousing()
	 * @generated
	 */
	int HOUSING = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSING__ID = MechanicalcomponentsPackage.MECHANICAL_PART__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSING__NAME = MechanicalcomponentsPackage.MECHANICAL_PART__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSING__CONNECTED_INTERFACES = MechanicalcomponentsPackage.MECHANICAL_PART__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSING__PARENT = MechanicalcomponentsPackage.MECHANICAL_PART__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSING__PARENT_MODULE = MechanicalcomponentsPackage.MECHANICAL_PART__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSING__SCREWING = MechanicalcomponentsPackage.MECHANICAL_PART__SCREWING;

	/**
	 * The number of structural features of the '<em>Housing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSING_FEATURE_COUNT = MechanicalcomponentsPackage.MECHANICAL_PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Housing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSING_OPERATION_COUNT = MechanicalcomponentsPackage.MECHANICAL_PART_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link domain.ppu.ppumechanicalcomponents.Arm <em>Arm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arm</em>'.
	 * @see domain.ppu.ppumechanicalcomponents.Arm
	 * @generated
	 */
	EClass getArm();

	/**
	 * Returns the meta object for the reference '{@link domain.ppu.ppumechanicalcomponents.Arm#getMountedTo <em>Mounted To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mounted To</em>'.
	 * @see domain.ppu.ppumechanicalcomponents.Arm#getMountedTo()
	 * @see #getArm()
	 * @generated
	 */
	EReference getArm_MountedTo();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppumechanicalcomponents.Housing <em>Housing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Housing</em>'.
	 * @see domain.ppu.ppumechanicalcomponents.Housing
	 * @generated
	 */
	EClass getHousing();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PpumechanicalcomponentsFactory getPpumechanicalcomponentsFactory();

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
		 * The meta object literal for the '{@link domain.ppu.ppumechanicalcomponents.impl.ArmImpl <em>Arm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppumechanicalcomponents.impl.ArmImpl
		 * @see domain.ppu.ppumechanicalcomponents.impl.PpumechanicalcomponentsPackageImpl#getArm()
		 * @generated
		 */
		EClass ARM = eINSTANCE.getArm();

		/**
		 * The meta object literal for the '<em><b>Mounted To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARM__MOUNTED_TO = eINSTANCE.getArm_MountedTo();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppumechanicalcomponents.impl.HousingImpl <em>Housing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppumechanicalcomponents.impl.HousingImpl
		 * @see domain.ppu.ppumechanicalcomponents.impl.PpumechanicalcomponentsPackageImpl#getHousing()
		 * @generated
		 */
		EClass HOUSING = eINSTANCE.getHousing();

	}

} //PpumechanicalcomponentsPackage
