/**
 */
package domain.ppu.ppubuscomponents.impl;

import domain.ppu.ppubuscomponents.*;

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
public class PpubuscomponentsFactoryImpl extends EFactoryImpl implements PpubuscomponentsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PpubuscomponentsFactory init() {
		try {
			PpubuscomponentsFactory thePpubuscomponentsFactory = (PpubuscomponentsFactory)EPackage.Registry.INSTANCE.getEFactory(PpubuscomponentsPackage.eNS_URI);
			if (thePpubuscomponentsFactory != null) {
				return thePpubuscomponentsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PpubuscomponentsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PpubuscomponentsFactoryImpl() {
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
			case PpubuscomponentsPackage.PROFIBUS_DP_SLAVE: return createProfibusDPSlave();
			case PpubuscomponentsPackage.ETHER_CAT_SLAVE: return createEtherCATSlave();
			case PpubuscomponentsPackage.PROFIBUS_DP_CABLE: return createProfibusDPCable();
			case PpubuscomponentsPackage.PROFIBUS_DP_BOX: return createProfibusDPBox();
			case PpubuscomponentsPackage.PROFIBUS_DP_MASTER: return createProfibusDPMaster();
			case PpubuscomponentsPackage.ETHER_CAT_BOX: return createEtherCATBox();
			case PpubuscomponentsPackage.ETHER_CAT_MASTER: return createEtherCATMaster();
			case PpubuscomponentsPackage.ETHER_CAT_CABLE: return createEtherCATCable();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfibusDPSlave createProfibusDPSlave() {
		ProfibusDPSlaveImpl profibusDPSlave = new ProfibusDPSlaveImpl();
		return profibusDPSlave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EtherCATSlave createEtherCATSlave() {
		EtherCATSlaveImpl etherCATSlave = new EtherCATSlaveImpl();
		return etherCATSlave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfibusDPCable createProfibusDPCable() {
		ProfibusDPCableImpl profibusDPCable = new ProfibusDPCableImpl();
		return profibusDPCable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfibusDPBox createProfibusDPBox() {
		ProfibusDPBoxImpl profibusDPBox = new ProfibusDPBoxImpl();
		return profibusDPBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfibusDPMaster createProfibusDPMaster() {
		ProfibusDPMasterImpl profibusDPMaster = new ProfibusDPMasterImpl();
		return profibusDPMaster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EtherCATBox createEtherCATBox() {
		EtherCATBoxImpl etherCATBox = new EtherCATBoxImpl();
		return etherCATBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EtherCATMaster createEtherCATMaster() {
		EtherCATMasterImpl etherCATMaster = new EtherCATMasterImpl();
		return etherCATMaster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EtherCATCable createEtherCATCable() {
		EtherCATCableImpl etherCATCable = new EtherCATCableImpl();
		return etherCATCable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PpubuscomponentsPackage getPpubuscomponentsPackage() {
		return (PpubuscomponentsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PpubuscomponentsPackage getPackage() {
		return PpubuscomponentsPackage.eINSTANCE;
	}

} //PpubuscomponentsFactoryImpl
