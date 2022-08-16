/**
 */
package domain.as.InterfaceRepository.impl;

import domain.as.InterfaceRepository.*;

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
public class InterfaceRepositoryFactoryImpl extends EFactoryImpl implements InterfaceRepositoryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InterfaceRepositoryFactory init() {
		try {
			InterfaceRepositoryFactory theInterfaceRepositoryFactory = (InterfaceRepositoryFactory)EPackage.Registry.INSTANCE.getEFactory(InterfaceRepositoryPackage.eNS_URI);
			if (theInterfaceRepositoryFactory != null) {
				return theInterfaceRepositoryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InterfaceRepositoryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceRepositoryFactoryImpl() {
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
			case InterfaceRepositoryPackage.INTERFACE_REPOSITORY: return createInterfaceRepository();
			case InterfaceRepositoryPackage.INTERFACE: return createInterface();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceRepository createInterfaceRepository() {
		InterfaceRepositoryImpl interfaceRepository = new InterfaceRepositoryImpl();
		return interfaceRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceRepositoryPackage getInterfaceRepositoryPackage() {
		return (InterfaceRepositoryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InterfaceRepositoryPackage getPackage() {
		return InterfaceRepositoryPackage.eINSTANCE;
	}

} //InterfaceRepositoryFactoryImpl
