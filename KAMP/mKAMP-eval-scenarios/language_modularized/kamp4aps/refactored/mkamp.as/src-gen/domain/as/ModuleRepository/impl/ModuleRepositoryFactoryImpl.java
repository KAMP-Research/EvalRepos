/**
 */
package domain.as.ModuleRepository.impl;

import domain.as.ModuleRepository.ModuleRepository;
import domain.as.ModuleRepository.ModuleRepositoryFactory;
import domain.as.ModuleRepository.ModuleRepositoryPackage;

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
public class ModuleRepositoryFactoryImpl extends EFactoryImpl implements ModuleRepositoryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModuleRepositoryFactory init() {
		try {
			ModuleRepositoryFactory theModuleRepositoryFactory = (ModuleRepositoryFactory)EPackage.Registry.INSTANCE.getEFactory(ModuleRepositoryPackage.eNS_URI);
			if (theModuleRepositoryFactory != null) {
				return theModuleRepositoryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModuleRepositoryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleRepositoryFactoryImpl() {
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
			case ModuleRepositoryPackage.MODULE_REPOSITORY: return createModuleRepository();
			case ModuleRepositoryPackage.MODULE: return createModule();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleRepository createModuleRepository() {
		ModuleRepositoryImpl moduleRepository = new ModuleRepositoryImpl();
		return moduleRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public domain.as.ModuleRepository.Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleRepositoryPackage getModuleRepositoryPackage() {
		return (ModuleRepositoryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModuleRepositoryPackage getPackage() {
		return ModuleRepositoryPackage.eINSTANCE;
	}

} //ModuleRepositoryFactoryImpl
