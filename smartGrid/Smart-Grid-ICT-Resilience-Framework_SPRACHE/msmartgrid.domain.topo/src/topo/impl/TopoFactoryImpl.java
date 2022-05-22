/**
 */
package topo.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import topo.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TopoFactoryImpl extends EFactoryImpl implements TopoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TopoFactory init() {
		try {
			TopoFactory theTopoFactory = (TopoFactory)EPackage.Registry.INSTANCE.getEFactory(TopoPackage.eNS_URI);
			if (theTopoFactory != null) {
				return theTopoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TopoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopoFactoryImpl() {
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
			case TopoPackage.SMART_GRID_TOPOLOGY: return createSmartGridTopology();
			case TopoPackage.SMART_METER: return createSmartMeter();
			case TopoPackage.NETWORK_NODE: return createNetworkNode();
			case TopoPackage.CONTROL_CENTER: return createControlCenter();
			case TopoPackage.GENERIC_CONTROLLER: return createGenericController();
			case TopoPackage.INTER_COM: return createInterCom();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartGridTopology createSmartGridTopology() {
		SmartGridTopologyImpl smartGridTopology = new SmartGridTopologyImpl();
		return smartGridTopology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartMeter createSmartMeter() {
		SmartMeterImpl smartMeter = new SmartMeterImpl();
		return smartMeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkNode createNetworkNode() {
		NetworkNodeImpl networkNode = new NetworkNodeImpl();
		return networkNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlCenter createControlCenter() {
		ControlCenterImpl controlCenter = new ControlCenterImpl();
		return controlCenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericController createGenericController() {
		GenericControllerImpl genericController = new GenericControllerImpl();
		return genericController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterCom createInterCom() {
		InterComImpl interCom = new InterComImpl();
		return interCom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopoPackage getTopoPackage() {
		return (TopoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TopoPackage getPackage() {
		return TopoPackage.eINSTANCE;
	}

} //TopoFactoryImpl
