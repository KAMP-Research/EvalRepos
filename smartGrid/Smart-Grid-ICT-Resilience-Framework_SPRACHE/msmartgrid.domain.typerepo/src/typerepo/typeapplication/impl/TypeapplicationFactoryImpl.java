/**
 */
package typerepo.typeapplication.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import typerepo.typeapplication.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypeapplicationFactoryImpl extends EFactoryImpl implements TypeapplicationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeapplicationFactory init() {
		try {
			TypeapplicationFactory theTypeapplicationFactory = (TypeapplicationFactory)EPackage.Registry.INSTANCE.getEFactory(TypeapplicationPackage.eNS_URI);
			if (theTypeapplicationFactory != null) {
				return theTypeapplicationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TypeapplicationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeapplicationFactoryImpl() {
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
			case TypeapplicationPackage.TYPE_APPLICATIONS: return createTypeApplications();
			case TypeapplicationPackage.CONNECTION_TYPE_APPLICATION: return createConnectionTypeApplication();
			case TypeapplicationPackage.SMART_METER_TYPE_APPLICATION: return createSmartMeterTypeApplication();
			case TypeapplicationPackage.NETWORK_NODE_TYPE_APPLICATION: return createNetworkNodeTypeApplication();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeApplications createTypeApplications() {
		TypeApplicationsImpl typeApplications = new TypeApplicationsImpl();
		return typeApplications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionTypeApplication createConnectionTypeApplication() {
		ConnectionTypeApplicationImpl connectionTypeApplication = new ConnectionTypeApplicationImpl();
		return connectionTypeApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartMeterTypeApplication createSmartMeterTypeApplication() {
		SmartMeterTypeApplicationImpl smartMeterTypeApplication = new SmartMeterTypeApplicationImpl();
		return smartMeterTypeApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkNodeTypeApplication createNetworkNodeTypeApplication() {
		NetworkNodeTypeApplicationImpl networkNodeTypeApplication = new NetworkNodeTypeApplicationImpl();
		return networkNodeTypeApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeapplicationPackage getTypeapplicationPackage() {
		return (TypeapplicationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TypeapplicationPackage getPackage() {
		return TypeapplicationPackage.eINSTANCE;
	}

} //TypeapplicationFactoryImpl
