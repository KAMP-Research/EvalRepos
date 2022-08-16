/**
 */
package domain.ppu.ppustructures.impl;

import domain.ppu.ppustructures.*;

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
public class PpustructuresFactoryImpl extends EFactoryImpl implements PpustructuresFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PpustructuresFactory init() {
		try {
			PpustructuresFactory thePpustructuresFactory = (PpustructuresFactory)EPackage.Registry.INSTANCE.getEFactory(PpustructuresPackage.eNS_URI);
			if (thePpustructuresFactory != null) {
				return thePpustructuresFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PpustructuresFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PpustructuresFactoryImpl() {
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
			case PpustructuresPackage.CONVEYOR: return createConveyor();
			case PpustructuresPackage.PNEUMATIC_NETWORK: return createPneumaticNetwork();
			case PpustructuresPackage.COMMUNICATION_NETWORK: return createCommunicationNetwork();
			case PpustructuresPackage.POWER_NETWORK: return createPowerNetwork();
			case PpustructuresPackage.CRANE: return createCrane();
			case PpustructuresPackage.POWER_WIRING: return createPowerWiring();
			case PpustructuresPackage.LOGICAL_WIRING: return createLogicalWiring();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conveyor createConveyor() {
		ConveyorImpl conveyor = new ConveyorImpl();
		return conveyor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PneumaticNetwork createPneumaticNetwork() {
		PneumaticNetworkImpl pneumaticNetwork = new PneumaticNetworkImpl();
		return pneumaticNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationNetwork createCommunicationNetwork() {
		CommunicationNetworkImpl communicationNetwork = new CommunicationNetworkImpl();
		return communicationNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerNetwork createPowerNetwork() {
		PowerNetworkImpl powerNetwork = new PowerNetworkImpl();
		return powerNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Crane createCrane() {
		CraneImpl crane = new CraneImpl();
		return crane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerWiring createPowerWiring() {
		PowerWiringImpl powerWiring = new PowerWiringImpl();
		return powerWiring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalWiring createLogicalWiring() {
		LogicalWiringImpl logicalWiring = new LogicalWiringImpl();
		return logicalWiring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PpustructuresPackage getPpustructuresPackage() {
		return (PpustructuresPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PpustructuresPackage getPackage() {
		return PpustructuresPackage.eINSTANCE;
	}

} //PpustructuresFactoryImpl
