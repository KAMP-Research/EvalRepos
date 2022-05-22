/**
 */
package typerepo.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import typerepo.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TyperepoFactoryImpl extends EFactoryImpl implements TyperepoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TyperepoFactory init() {
		try {
			TyperepoFactory theTyperepoFactory = (TyperepoFactory)EPackage.Registry.INSTANCE.getEFactory(TyperepoPackage.eNS_URI);
			if (theTyperepoFactory != null) {
				return theTyperepoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TyperepoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TyperepoFactoryImpl() {
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
			case TyperepoPackage.REPOSITORY: return createRepository();
			case TyperepoPackage.SMART_METER_TYPE: return createSmartMeterType();
			case TyperepoPackage.CONNECTION_TYPE: return createConnectionType();
			case TyperepoPackage.NETWORK_NODE_TYPE: return createNetworkNodeType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository createRepository() {
		RepositoryImpl repository = new RepositoryImpl();
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartMeterType createSmartMeterType() {
		SmartMeterTypeImpl smartMeterType = new SmartMeterTypeImpl();
		return smartMeterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionType createConnectionType() {
		ConnectionTypeImpl connectionType = new ConnectionTypeImpl();
		return connectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkNodeType createNetworkNodeType() {
		NetworkNodeTypeImpl networkNodeType = new NetworkNodeTypeImpl();
		return networkNodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TyperepoPackage getTyperepoPackage() {
		return (TyperepoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TyperepoPackage getPackage() {
		return TyperepoPackage.eINSTANCE;
	}

} //TyperepoFactoryImpl
