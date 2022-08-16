/**
 */
package domain.ppu.ppubuscomponents.impl;

import domain.aps.buscomponents.BuscomponentsPackage;

import domain.aps.components.ComponentsPackage;

import domain.aps.electroniccomponents.ElectroniccomponentsPackage;

import domain.aps.interfaces.InterfacesPackage;

import domain.aps.mechanicalcomponents.MechanicalcomponentsPackage;

import domain.aps.structures.StructuresPackage;

import domain.as.AsPackage;

import domain.ppu.ppubuscomponents.EtherCATBox;
import domain.ppu.ppubuscomponents.EtherCATCable;
import domain.ppu.ppubuscomponents.EtherCATMaster;
import domain.ppu.ppubuscomponents.EtherCATSlave;
import domain.ppu.ppubuscomponents.PpubuscomponentsFactory;
import domain.ppu.ppubuscomponents.PpubuscomponentsPackage;
import domain.ppu.ppubuscomponents.ProfibusDPBox;
import domain.ppu.ppubuscomponents.ProfibusDPCable;
import domain.ppu.ppubuscomponents.ProfibusDPMaster;
import domain.ppu.ppubuscomponents.ProfibusDPSlave;

import domain.ppu.ppucomponents.PpucomponentsPackage;

import domain.ppu.ppucomponents.impl.PpucomponentsPackageImpl;

import domain.ppu.ppuinterfaces.PpuinterfacesPackage;

import domain.ppu.ppuinterfaces.impl.PpuinterfacesPackageImpl;

import domain.ppu.ppumechanicalcomponents.PpumechanicalcomponentsPackage;

import domain.ppu.ppumechanicalcomponents.impl.PpumechanicalcomponentsPackageImpl;

import domain.ppu.ppumodules.PpumodulesPackage;

import domain.ppu.ppumodules.impl.PpumodulesPackageImpl;

import domain.ppu.ppustructures.PpustructuresPackage;

import domain.ppu.ppustructures.impl.PpustructuresPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import paradigm.basic.BasicPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PpubuscomponentsPackageImpl extends EPackageImpl implements PpubuscomponentsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass profibusDPSlaveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass etherCATSlaveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass profibusDPCableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass profibusDPBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass profibusDPMasterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass etherCATBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass etherCATMasterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass etherCATCableEClass = null;

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
	 * @see domain.ppu.ppubuscomponents.PpubuscomponentsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PpubuscomponentsPackageImpl() {
		super(eNS_URI, PpubuscomponentsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PpubuscomponentsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PpubuscomponentsPackage init() {
		if (isInited) return (PpubuscomponentsPackage)EPackage.Registry.INSTANCE.getEPackage(PpubuscomponentsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPpubuscomponentsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PpubuscomponentsPackageImpl thePpubuscomponentsPackage = registeredPpubuscomponentsPackage instanceof PpubuscomponentsPackageImpl ? (PpubuscomponentsPackageImpl)registeredPpubuscomponentsPackage : new PpubuscomponentsPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PpumechanicalcomponentsPackage.eNS_URI);
		PpumechanicalcomponentsPackageImpl thePpumechanicalcomponentsPackage = (PpumechanicalcomponentsPackageImpl)(registeredPackage instanceof PpumechanicalcomponentsPackageImpl ? registeredPackage : PpumechanicalcomponentsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PpustructuresPackage.eNS_URI);
		PpustructuresPackageImpl thePpustructuresPackage = (PpustructuresPackageImpl)(registeredPackage instanceof PpustructuresPackageImpl ? registeredPackage : PpustructuresPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PpumodulesPackage.eNS_URI);
		PpumodulesPackageImpl thePpumodulesPackage = (PpumodulesPackageImpl)(registeredPackage instanceof PpumodulesPackageImpl ? registeredPackage : PpumodulesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PpuinterfacesPackage.eNS_URI);
		PpuinterfacesPackageImpl thePpuinterfacesPackage = (PpuinterfacesPackageImpl)(registeredPackage instanceof PpuinterfacesPackageImpl ? registeredPackage : PpuinterfacesPackage.eINSTANCE);

		// Create package meta-data objects
		thePpubuscomponentsPackage.createPackageContents();
		thePpucomponentsPackage.createPackageContents();
		thePpumechanicalcomponentsPackage.createPackageContents();
		thePpustructuresPackage.createPackageContents();
		thePpumodulesPackage.createPackageContents();
		thePpuinterfacesPackage.createPackageContents();

		// Initialize created meta-data
		thePpubuscomponentsPackage.initializePackageContents();
		thePpucomponentsPackage.initializePackageContents();
		thePpumechanicalcomponentsPackage.initializePackageContents();
		thePpustructuresPackage.initializePackageContents();
		thePpumodulesPackage.initializePackageContents();
		thePpuinterfacesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePpubuscomponentsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PpubuscomponentsPackage.eNS_URI, thePpubuscomponentsPackage);
		return thePpubuscomponentsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfibusDPSlave() {
		return profibusDPSlaveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEtherCATSlave() {
		return etherCATSlaveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfibusDPCable() {
		return profibusDPCableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfibusDPBox() {
		return profibusDPBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfibusDPMaster() {
		return profibusDPMasterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEtherCATBox() {
		return etherCATBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEtherCATMaster() {
		return etherCATMasterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEtherCATCable() {
		return etherCATCableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PpubuscomponentsFactory getPpubuscomponentsFactory() {
		return (PpubuscomponentsFactory)getEFactoryInstance();
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
		profibusDPSlaveEClass = createEClass(PROFIBUS_DP_SLAVE);

		etherCATSlaveEClass = createEClass(ETHER_CAT_SLAVE);

		profibusDPCableEClass = createEClass(PROFIBUS_DP_CABLE);

		profibusDPBoxEClass = createEClass(PROFIBUS_DP_BOX);

		profibusDPMasterEClass = createEClass(PROFIBUS_DP_MASTER);

		etherCATBoxEClass = createEClass(ETHER_CAT_BOX);

		etherCATMasterEClass = createEClass(ETHER_CAT_MASTER);

		etherCATCableEClass = createEClass(ETHER_CAT_CABLE);
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
		BuscomponentsPackage theBuscomponentsPackage = (BuscomponentsPackage)EPackage.Registry.INSTANCE.getEPackage(BuscomponentsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		profibusDPSlaveEClass.getESuperTypes().add(theBuscomponentsPackage.getBusSlave());
		etherCATSlaveEClass.getESuperTypes().add(theBuscomponentsPackage.getBusSlave());
		profibusDPCableEClass.getESuperTypes().add(theBuscomponentsPackage.getBusCable());
		profibusDPBoxEClass.getESuperTypes().add(theBuscomponentsPackage.getBusBox());
		profibusDPMasterEClass.getESuperTypes().add(theBuscomponentsPackage.getBusMaster());
		etherCATBoxEClass.getESuperTypes().add(theBuscomponentsPackage.getBusBox());
		etherCATMasterEClass.getESuperTypes().add(theBuscomponentsPackage.getBusMaster());
		etherCATCableEClass.getESuperTypes().add(theBuscomponentsPackage.getBusCable());

		// Initialize classes, features, and operations; add parameters
		initEClass(profibusDPSlaveEClass, ProfibusDPSlave.class, "ProfibusDPSlave", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(etherCATSlaveEClass, EtherCATSlave.class, "EtherCATSlave", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(profibusDPCableEClass, ProfibusDPCable.class, "ProfibusDPCable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(profibusDPBoxEClass, ProfibusDPBox.class, "ProfibusDPBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(profibusDPMasterEClass, ProfibusDPMaster.class, "ProfibusDPMaster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(etherCATBoxEClass, EtherCATBox.class, "EtherCATBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(etherCATMasterEClass, EtherCATMaster.class, "EtherCATMaster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(etherCATCableEClass, EtherCATCable.class, "EtherCATCable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //PpubuscomponentsPackageImpl
