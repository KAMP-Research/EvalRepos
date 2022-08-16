/**
 */
package domain.ppu.ppumechanicalcomponents.impl;

import domain.aps.buscomponents.BuscomponentsPackage;

import domain.aps.components.ComponentsPackage;

import domain.aps.electroniccomponents.ElectroniccomponentsPackage;

import domain.aps.interfaces.InterfacesPackage;

import domain.aps.mechanicalcomponents.MechanicalcomponentsPackage;

import domain.aps.structures.StructuresPackage;

import domain.as.AsPackage;

import domain.ppu.ppubuscomponents.PpubuscomponentsPackage;

import domain.ppu.ppubuscomponents.impl.PpubuscomponentsPackageImpl;

import domain.ppu.ppucomponents.PpucomponentsPackage;

import domain.ppu.ppucomponents.impl.PpucomponentsPackageImpl;

import domain.ppu.ppuinterfaces.PpuinterfacesPackage;

import domain.ppu.ppuinterfaces.impl.PpuinterfacesPackageImpl;

import domain.ppu.ppumechanicalcomponents.Arm;
import domain.ppu.ppumechanicalcomponents.Housing;
import domain.ppu.ppumechanicalcomponents.PpumechanicalcomponentsFactory;
import domain.ppu.ppumechanicalcomponents.PpumechanicalcomponentsPackage;

import domain.ppu.ppumodules.PpumodulesPackage;

import domain.ppu.ppumodules.impl.PpumodulesPackageImpl;

import domain.ppu.ppustructures.PpustructuresPackage;

import domain.ppu.ppustructures.impl.PpustructuresPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import paradigm.basic.BasicPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PpumechanicalcomponentsPackageImpl extends EPackageImpl implements PpumechanicalcomponentsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass armEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass housingEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see domain.ppu.ppumechanicalcomponents.PpumechanicalcomponentsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PpumechanicalcomponentsPackageImpl() {
		super(eNS_URI, PpumechanicalcomponentsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PpumechanicalcomponentsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PpumechanicalcomponentsPackage init() {
		if (isInited) return (PpumechanicalcomponentsPackage)EPackage.Registry.INSTANCE.getEPackage(PpumechanicalcomponentsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPpumechanicalcomponentsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PpumechanicalcomponentsPackageImpl thePpumechanicalcomponentsPackage = registeredPpumechanicalcomponentsPackage instanceof PpumechanicalcomponentsPackageImpl ? (PpumechanicalcomponentsPackageImpl)registeredPpumechanicalcomponentsPackage : new PpumechanicalcomponentsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ComponentsPackage.eINSTANCE.eClass();
		BuscomponentsPackage.eINSTANCE.eClass();
		ElectroniccomponentsPackage.eINSTANCE.eClass();
		MechanicalcomponentsPackage.eINSTANCE.eClass();
		StructuresPackage.eINSTANCE.eClass();
		InterfacesPackage.eINSTANCE.eClass();
		AsPackage.eINSTANCE.eClass();
		BasicPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PpucomponentsPackage.eNS_URI);
		PpucomponentsPackageImpl thePpucomponentsPackage = (PpucomponentsPackageImpl)(registeredPackage instanceof PpucomponentsPackageImpl ? registeredPackage : PpucomponentsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PpubuscomponentsPackage.eNS_URI);
		PpubuscomponentsPackageImpl thePpubuscomponentsPackage = (PpubuscomponentsPackageImpl)(registeredPackage instanceof PpubuscomponentsPackageImpl ? registeredPackage : PpubuscomponentsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PpustructuresPackage.eNS_URI);
		PpustructuresPackageImpl thePpustructuresPackage = (PpustructuresPackageImpl)(registeredPackage instanceof PpustructuresPackageImpl ? registeredPackage : PpustructuresPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PpumodulesPackage.eNS_URI);
		PpumodulesPackageImpl thePpumodulesPackage = (PpumodulesPackageImpl)(registeredPackage instanceof PpumodulesPackageImpl ? registeredPackage : PpumodulesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PpuinterfacesPackage.eNS_URI);
		PpuinterfacesPackageImpl thePpuinterfacesPackage = (PpuinterfacesPackageImpl)(registeredPackage instanceof PpuinterfacesPackageImpl ? registeredPackage : PpuinterfacesPackage.eINSTANCE);

		// Create package meta-data objects
		thePpumechanicalcomponentsPackage.createPackageContents();
		thePpucomponentsPackage.createPackageContents();
		thePpubuscomponentsPackage.createPackageContents();
		thePpustructuresPackage.createPackageContents();
		thePpumodulesPackage.createPackageContents();
		thePpuinterfacesPackage.createPackageContents();

		// Initialize created meta-data
		thePpumechanicalcomponentsPackage.initializePackageContents();
		thePpucomponentsPackage.initializePackageContents();
		thePpubuscomponentsPackage.initializePackageContents();
		thePpustructuresPackage.initializePackageContents();
		thePpumodulesPackage.initializePackageContents();
		thePpuinterfacesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePpumechanicalcomponentsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PpumechanicalcomponentsPackage.eNS_URI, thePpumechanicalcomponentsPackage);
		return thePpumechanicalcomponentsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArm() {
		return armEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArm_MountedTo() {
		return (EReference)armEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHousing() {
		return housingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PpumechanicalcomponentsFactory getPpumechanicalcomponentsFactory() {
		return (PpumechanicalcomponentsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		armEClass = createEClass(ARM);
		createEReference(armEClass, ARM__MOUNTED_TO);

		housingEClass = createEClass(HOUSING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ComponentsPackage theComponentsPackage = (ComponentsPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentsPackage.eNS_URI);
		PpustructuresPackage thePpustructuresPackage = (PpustructuresPackage)EPackage.Registry.INSTANCE.getEPackage(PpustructuresPackage.eNS_URI);
		MechanicalcomponentsPackage theMechanicalcomponentsPackage = (MechanicalcomponentsPackage)EPackage.Registry.INSTANCE.getEPackage(MechanicalcomponentsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		armEClass.getESuperTypes().add(theComponentsPackage.getMechanicalAssembly());
		housingEClass.getESuperTypes().add(theMechanicalcomponentsPackage.getMechanicalPart());

		// Initialize classes, features, and operations; add parameters
		initEClass(armEClass, Arm.class, "Arm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArm_MountedTo(), thePpustructuresPackage.getCrane(), thePpustructuresPackage.getCrane_Arm(), "mountedTo", null, 1, 1, Arm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(housingEClass, Housing.class, "Housing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //PpumechanicalcomponentsPackageImpl
