/**
 */
package domain.aps.interfaces.impl;

import domain.aps.interfaces.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InterfacesFactoryImpl extends EFactoryImpl implements InterfacesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InterfacesFactory init() {
		try {
			InterfacesFactory theInterfacesFactory = (InterfacesFactory)EPackage.Registry.INSTANCE.getEFactory(InterfacesPackage.eNS_URI);
			if (theInterfacesFactory != null) {
				return theInterfacesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InterfacesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfacesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case InterfacesPackage.FIXTURE: return createFixture();
			case InterfacesPackage.WATER_SUPPLY: return createWaterSupply();
			case InterfacesPackage.PHYSICAL_CONNECTION: return createPhysicalConnection();
			case InterfacesPackage.SUSPENSION: return createSuspension();
			case InterfacesPackage.TRANSPORT_CONNECTION: return createTransportConnection();
			case InterfacesPackage.CLAMPING: return createClamping();
			case InterfacesPackage.GEARING: return createGearing();
			case InterfacesPackage.SCREWING: return createScrewing();
			case InterfacesPackage.PNEUMATIC_SUPPLY: return createPneumaticSupply();
			case InterfacesPackage.SIGNAL_INTERFACE: return createSignalInterface();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fixture createFixture() {
		FixtureImpl fixture = new FixtureImpl();
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaterSupply createWaterSupply() {
		WaterSupplyImpl waterSupply = new WaterSupplyImpl();
		return waterSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalConnection createPhysicalConnection() {
		PhysicalConnectionImpl physicalConnection = new PhysicalConnectionImpl();
		return physicalConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Suspension createSuspension() {
		SuspensionImpl suspension = new SuspensionImpl();
		return suspension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportConnection createTransportConnection() {
		TransportConnectionImpl transportConnection = new TransportConnectionImpl();
		return transportConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clamping createClamping() {
		ClampingImpl clamping = new ClampingImpl();
		return clamping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gearing createGearing() {
		GearingImpl gearing = new GearingImpl();
		return gearing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Screwing createScrewing() {
		ScrewingImpl screwing = new ScrewingImpl();
		return screwing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PneumaticSupply createPneumaticSupply() {
		PneumaticSupplyImpl pneumaticSupply = new PneumaticSupplyImpl();
		return pneumaticSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInterface createSignalInterface() {
		SignalInterfaceImpl signalInterface = new SignalInterfaceImpl();
		return signalInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfacesPackage getInterfacesPackage() {
		return (InterfacesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InterfacesPackage getPackage() {
		return InterfacesPackage.eINSTANCE;
	}

} //InterfacesFactoryImpl
