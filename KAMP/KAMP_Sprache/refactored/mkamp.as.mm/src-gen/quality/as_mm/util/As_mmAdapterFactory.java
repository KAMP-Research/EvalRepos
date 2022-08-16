/**
 */
package quality.as_mm.util;

import domain.as.ComponentRepository.Component;

import domain.as.InterfaceRepository.Interface;

import domain.as.StructureRepository.Structure;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import paradigm.basic.Entity;

import paradigm.modificationmarks.AbstractChangePropagationStep;
import paradigm.modificationmarks.AbstractModification;
import paradigm.modificationmarks.AbstractModificationRepository;
import paradigm.modificationmarks.AbstractSeedModifications;
import paradigm.modificationmarks.ChangePropagationStep;

import quality.as_mm.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see quality.as_mm.As_mmPackage
 * @generated
 */
public class As_mmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static As_mmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As_mmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = As_mmPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected As_mmSwitch<Adapter> modelSwitch =
		new As_mmSwitch<Adapter>() {
			@Override
			public <T extends KAMP4aPSSeedModifications> Adapter caseAbstractKAMP4aPSModificationRepository(AbstractKAMP4aPSModificationRepository<T> object) {
				return createAbstractKAMP4aPSModificationRepositoryAdapter();
			}
			@Override
			public Adapter caseKAMP4aPSModificationRepository(KAMP4aPSModificationRepository object) {
				return createKAMP4aPSModificationRepositoryAdapter();
			}
			@Override
			public Adapter caseKAMP4aPSSeedModifications(KAMP4aPSSeedModifications object) {
				return createKAMP4aPSSeedModificationsAdapter();
			}
			@Override
			public Adapter caseChangePropagationDueToHardwareChange(ChangePropagationDueToHardwareChange object) {
				return createChangePropagationDueToHardwareChangeAdapter();
			}
			@Override
			public <T extends Entity> Adapter caseModifyEntity(ModifyEntity<T> object) {
				return createModifyEntityAdapter();
			}
			@Override
			public <T extends Component> Adapter caseModifyComponent(ModifyComponent<T> object) {
				return createModifyComponentAdapter();
			}
			@Override
			public <T extends domain.as.ModuleRepository.Module> Adapter caseModifyModule(ModifyModule<T> object) {
				return createModifyModuleAdapter();
			}
			@Override
			public <T extends Structure> Adapter caseModifyStructure(ModifyStructure<T> object) {
				return createModifyStructureAdapter();
			}
			@Override
			public <T extends Interface> Adapter caseModifyInterface(ModifyInterface<T> object) {
				return createModifyInterfaceAdapter();
			}
			@Override
			public <S extends AbstractSeedModifications, T extends AbstractChangePropagationStep> Adapter caseAbstractModificationRepository(AbstractModificationRepository<S, T> object) {
				return createAbstractModificationRepositoryAdapter();
			}
			@Override
			public Adapter caseAbstractSeedModifications(AbstractSeedModifications object) {
				return createAbstractSeedModificationsAdapter();
			}
			@Override
			public Adapter caseAbstractChangePropagationStep(AbstractChangePropagationStep object) {
				return createAbstractChangePropagationStepAdapter();
			}
			@Override
			public Adapter caseChangePropagationStep(ChangePropagationStep object) {
				return createChangePropagationStepAdapter();
			}
			@Override
			public <S, T> Adapter caseAbstractModification(AbstractModification<S, T> object) {
				return createAbstractModificationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link quality.as_mm.AbstractKAMP4aPSModificationRepository <em>Abstract KAMP 4a PS Modification Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see quality.as_mm.AbstractKAMP4aPSModificationRepository
	 * @generated
	 */
	public Adapter createAbstractKAMP4aPSModificationRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link quality.as_mm.KAMP4aPSModificationRepository <em>KAMP 4a PS Modification Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see quality.as_mm.KAMP4aPSModificationRepository
	 * @generated
	 */
	public Adapter createKAMP4aPSModificationRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link quality.as_mm.KAMP4aPSSeedModifications <em>KAMP 4a PS Seed Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see quality.as_mm.KAMP4aPSSeedModifications
	 * @generated
	 */
	public Adapter createKAMP4aPSSeedModificationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link quality.as_mm.ChangePropagationDueToHardwareChange <em>Change Propagation Due To Hardware Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see quality.as_mm.ChangePropagationDueToHardwareChange
	 * @generated
	 */
	public Adapter createChangePropagationDueToHardwareChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link quality.as_mm.ModifyEntity <em>Modify Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see quality.as_mm.ModifyEntity
	 * @generated
	 */
	public Adapter createModifyEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link quality.as_mm.ModifyComponent <em>Modify Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see quality.as_mm.ModifyComponent
	 * @generated
	 */
	public Adapter createModifyComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link quality.as_mm.ModifyModule <em>Modify Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see quality.as_mm.ModifyModule
	 * @generated
	 */
	public Adapter createModifyModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link quality.as_mm.ModifyStructure <em>Modify Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see quality.as_mm.ModifyStructure
	 * @generated
	 */
	public Adapter createModifyStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link quality.as_mm.ModifyInterface <em>Modify Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see quality.as_mm.ModifyInterface
	 * @generated
	 */
	public Adapter createModifyInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link paradigm.modificationmarks.AbstractModificationRepository <em>Abstract Modification Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see paradigm.modificationmarks.AbstractModificationRepository
	 * @generated
	 */
	public Adapter createAbstractModificationRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link paradigm.modificationmarks.AbstractSeedModifications <em>Abstract Seed Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see paradigm.modificationmarks.AbstractSeedModifications
	 * @generated
	 */
	public Adapter createAbstractSeedModificationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link paradigm.modificationmarks.AbstractChangePropagationStep <em>Abstract Change Propagation Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see paradigm.modificationmarks.AbstractChangePropagationStep
	 * @generated
	 */
	public Adapter createAbstractChangePropagationStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link paradigm.modificationmarks.ChangePropagationStep <em>Change Propagation Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see paradigm.modificationmarks.ChangePropagationStep
	 * @generated
	 */
	public Adapter createChangePropagationStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link paradigm.modificationmarks.AbstractModification <em>Abstract Modification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see paradigm.modificationmarks.AbstractModification
	 * @generated
	 */
	public Adapter createAbstractModificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //As_mmAdapterFactory
