/**
 */
package quality.as_mm.impl;

import domain.as.ComponentRepository.Component;

import domain.as.InterfaceRepository.Interface;

import domain.as.StructureRepository.Structure;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import quality.as_mm.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class As_mmFactoryImpl extends EFactoryImpl implements As_mmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static As_mmFactory init() {
		try {
			As_mmFactory theAs_mmFactory = (As_mmFactory)EPackage.Registry.INSTANCE.getEFactory(As_mmPackage.eNS_URI);
			if (theAs_mmFactory != null) {
				return theAs_mmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new As_mmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As_mmFactoryImpl() {
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
			case As_mmPackage.KAMP_4A_PS_MODIFICATION_REPOSITORY: return createKAMP4aPSModificationRepository();
			case As_mmPackage.KAMP_4A_PS_SEED_MODIFICATIONS: return createKAMP4aPSSeedModifications();
			case As_mmPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE: return createChangePropagationDueToHardwareChange();
			case As_mmPackage.MODIFY_COMPONENT: return createModifyComponent();
			case As_mmPackage.MODIFY_MODULE: return createModifyModule();
			case As_mmPackage.MODIFY_STRUCTURE: return createModifyStructure();
			case As_mmPackage.MODIFY_INTERFACE: return createModifyInterface();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KAMP4aPSModificationRepository createKAMP4aPSModificationRepository() {
		KAMP4aPSModificationRepositoryImpl kamp4aPSModificationRepository = new KAMP4aPSModificationRepositoryImpl();
		return kamp4aPSModificationRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KAMP4aPSSeedModifications createKAMP4aPSSeedModifications() {
		KAMP4aPSSeedModificationsImpl kamp4aPSSeedModifications = new KAMP4aPSSeedModificationsImpl();
		return kamp4aPSSeedModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangePropagationDueToHardwareChange createChangePropagationDueToHardwareChange() {
		ChangePropagationDueToHardwareChangeImpl changePropagationDueToHardwareChange = new ChangePropagationDueToHardwareChangeImpl();
		return changePropagationDueToHardwareChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Component> ModifyComponent<T> createModifyComponent() {
		ModifyComponentImpl<T> modifyComponent = new ModifyComponentImpl<T>();
		return modifyComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends domain.as.ModuleRepository.Module> ModifyModule<T> createModifyModule() {
		ModifyModuleImpl<T> modifyModule = new ModifyModuleImpl<T>();
		return modifyModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Structure> ModifyStructure<T> createModifyStructure() {
		ModifyStructureImpl<T> modifyStructure = new ModifyStructureImpl<T>();
		return modifyStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Interface> ModifyInterface<T> createModifyInterface() {
		ModifyInterfaceImpl<T> modifyInterface = new ModifyInterfaceImpl<T>();
		return modifyInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As_mmPackage getAs_mmPackage() {
		return (As_mmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static As_mmPackage getPackage() {
		return As_mmPackage.eINSTANCE;
	}

} //As_mmFactoryImpl
