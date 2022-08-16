/**
 */
package domain.ppu.ppustructures.impl;

import domain.aps.buscomponents.BuscomponentsPackage;

import domain.aps.components.ComponentsPackage;

import domain.aps.electroniccomponents.ElectroniccomponentsPackage;

import domain.aps.interfaces.InterfacesPackage;

import domain.aps.mechanicalcomponents.MechanicalcomponentsPackage;

import domain.aps.structures.StructuresPackage;

import domain.as.AsPackage;

import domain.as.StructureRepository.StructureRepositoryPackage;

import domain.ppu.ppubuscomponents.PpubuscomponentsPackage;

import domain.ppu.ppubuscomponents.impl.PpubuscomponentsPackageImpl;

import domain.ppu.ppucomponents.PpucomponentsPackage;

import domain.ppu.ppucomponents.impl.PpucomponentsPackageImpl;

import domain.ppu.ppuinterfaces.PpuinterfacesPackage;

import domain.ppu.ppuinterfaces.impl.PpuinterfacesPackageImpl;

import domain.ppu.ppumechanicalcomponents.PpumechanicalcomponentsPackage;

import domain.ppu.ppumechanicalcomponents.impl.PpumechanicalcomponentsPackageImpl;

import domain.ppu.ppumodules.PpumodulesPackage;

import domain.ppu.ppumodules.impl.PpumodulesPackageImpl;

import domain.ppu.ppustructures.CommunicationNetwork;
import domain.ppu.ppustructures.Conveyor;
import domain.ppu.ppustructures.Crane;
import domain.ppu.ppustructures.LogicalWiring;
import domain.ppu.ppustructures.PneumaticNetwork;
import domain.ppu.ppustructures.PowerNetwork;
import domain.ppu.ppustructures.PowerWiring;
import domain.ppu.ppustructures.PpustructuresFactory;
import domain.ppu.ppustructures.PpustructuresPackage;

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
public class PpustructuresPackageImpl extends EPackageImpl implements PpustructuresPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conveyorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pneumaticNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass craneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerWiringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalWiringEClass = null;

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
	 * @see domain.ppu.ppustructures.PpustructuresPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PpustructuresPackageImpl() {
		super(eNS_URI, PpustructuresFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PpustructuresPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PpustructuresPackage init() {
		if (isInited) return (PpustructuresPackage)EPackage.Registry.INSTANCE.getEPackage(PpustructuresPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPpustructuresPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PpustructuresPackageImpl thePpustructuresPackage = registeredPpustructuresPackage instanceof PpustructuresPackageImpl ? (PpustructuresPackageImpl)registeredPpustructuresPackage : new PpustructuresPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PpumechanicalcomponentsPackage.eNS_URI);
		PpumechanicalcomponentsPackageImpl thePpumechanicalcomponentsPackage = (PpumechanicalcomponentsPackageImpl)(registeredPackage instanceof PpumechanicalcomponentsPackageImpl ? registeredPackage : PpumechanicalcomponentsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PpumodulesPackage.eNS_URI);
		PpumodulesPackageImpl thePpumodulesPackage = (PpumodulesPackageImpl)(registeredPackage instanceof PpumodulesPackageImpl ? registeredPackage : PpumodulesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PpuinterfacesPackage.eNS_URI);
		PpuinterfacesPackageImpl thePpuinterfacesPackage = (PpuinterfacesPackageImpl)(registeredPackage instanceof PpuinterfacesPackageImpl ? registeredPackage : PpuinterfacesPackage.eINSTANCE);

		// Create package meta-data objects
		thePpustructuresPackage.createPackageContents();
		thePpucomponentsPackage.createPackageContents();
		thePpubuscomponentsPackage.createPackageContents();
		thePpumechanicalcomponentsPackage.createPackageContents();
		thePpumodulesPackage.createPackageContents();
		thePpuinterfacesPackage.createPackageContents();

		// Initialize created meta-data
		thePpustructuresPackage.initializePackageContents();
		thePpucomponentsPackage.initializePackageContents();
		thePpubuscomponentsPackage.initializePackageContents();
		thePpumechanicalcomponentsPackage.initializePackageContents();
		thePpumodulesPackage.initializePackageContents();
		thePpuinterfacesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePpustructuresPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PpustructuresPackage.eNS_URI, thePpustructuresPackage);
		return thePpustructuresPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConveyor() {
		return conveyorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConveyor_Belts() {
		return (EReference)conveyorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPneumaticNetwork() {
		return pneumaticNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationNetwork() {
		return communicationNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerNetwork() {
		return powerNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCrane() {
		return craneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrane_Arm() {
		return (EReference)craneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrane_MountedOn() {
		return (EReference)craneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrane_Vacuumgripper() {
		return (EReference)craneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerWiring() {
		return powerWiringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalWiring() {
		return logicalWiringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PpustructuresFactory getPpustructuresFactory() {
		return (PpustructuresFactory)getEFactoryInstance();
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
		conveyorEClass = createEClass(CONVEYOR);
		createEReference(conveyorEClass, CONVEYOR__BELTS);

		pneumaticNetworkEClass = createEClass(PNEUMATIC_NETWORK);

		communicationNetworkEClass = createEClass(COMMUNICATION_NETWORK);

		powerNetworkEClass = createEClass(POWER_NETWORK);

		craneEClass = createEClass(CRANE);
		createEReference(craneEClass, CRANE__ARM);
		createEReference(craneEClass, CRANE__MOUNTED_ON);
		createEReference(craneEClass, CRANE__VACUUMGRIPPER);

		powerWiringEClass = createEClass(POWER_WIRING);

		logicalWiringEClass = createEClass(LOGICAL_WIRING);
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
		StructureRepositoryPackage theStructureRepositoryPackage = (StructureRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(StructureRepositoryPackage.eNS_URI);
		ComponentsPackage theComponentsPackage = (ComponentsPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentsPackage.eNS_URI);
		PpumechanicalcomponentsPackage thePpumechanicalcomponentsPackage = (PpumechanicalcomponentsPackage)EPackage.Registry.INSTANCE.getEPackage(PpumechanicalcomponentsPackage.eNS_URI);
		PpumodulesPackage thePpumodulesPackage = (PpumodulesPackage)EPackage.Registry.INSTANCE.getEPackage(PpumodulesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		conveyorEClass.getESuperTypes().add(theStructureRepositoryPackage.getStructure());
		pneumaticNetworkEClass.getESuperTypes().add(theStructureRepositoryPackage.getStructure());
		communicationNetworkEClass.getESuperTypes().add(theStructureRepositoryPackage.getStructure());
		powerNetworkEClass.getESuperTypes().add(theStructureRepositoryPackage.getStructure());
		craneEClass.getESuperTypes().add(theStructureRepositoryPackage.getStructure());
		powerWiringEClass.getESuperTypes().add(theStructureRepositoryPackage.getStructure());
		logicalWiringEClass.getESuperTypes().add(theStructureRepositoryPackage.getStructure());

		// Initialize classes, features, and operations; add parameters
		initEClass(conveyorEClass, Conveyor.class, "Conveyor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConveyor_Belts(), theComponentsPackage.getConveyorBelt(), null, "belts", null, 0, -1, Conveyor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pneumaticNetworkEClass, PneumaticNetwork.class, "PneumaticNetwork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(communicationNetworkEClass, CommunicationNetwork.class, "CommunicationNetwork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(powerNetworkEClass, PowerNetwork.class, "PowerNetwork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(craneEClass, Crane.class, "Crane", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCrane_Arm(), thePpumechanicalcomponentsPackage.getArm(), thePpumechanicalcomponentsPackage.getArm_MountedTo(), "arm", null, 1, 1, Crane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCrane_MountedOn(), theComponentsPackage.getTurningTable(), null, "mountedOn", null, 1, 1, Crane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCrane_Vacuumgripper(), thePpumodulesPackage.getVacuumGripperModule(), null, "vacuumgripper", null, 1, 1, Crane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(powerWiringEClass, PowerWiring.class, "PowerWiring", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(logicalWiringEClass, LogicalWiring.class, "LogicalWiring", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //PpustructuresPackageImpl
