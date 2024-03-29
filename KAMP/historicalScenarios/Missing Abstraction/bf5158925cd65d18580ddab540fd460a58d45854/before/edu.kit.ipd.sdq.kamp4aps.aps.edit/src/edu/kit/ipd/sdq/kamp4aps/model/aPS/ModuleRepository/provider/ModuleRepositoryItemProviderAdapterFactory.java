/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.provider;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.util.ModuleRepositoryAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModuleRepositoryItemProviderAdapterFactory extends ModuleRepositoryAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleRepositoryItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MicroswitchModule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MicroswitchModuleItemProvider microswitchModuleItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MicroswitchModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMicroswitchModuleAdapter() {
		if (microswitchModuleItemProvider == null) {
			microswitchModuleItemProvider = new MicroswitchModuleItemProvider(this);
		}

		return microswitchModuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.PotentiometerModule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PotentiometerModuleItemProvider potentiometerModuleItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.PotentiometerModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPotentiometerModuleAdapter() {
		if (potentiometerModuleItemProvider == null) {
			potentiometerModuleItemProvider = new PotentiometerModuleItemProvider(this);
		}

		return potentiometerModuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepository} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleRepositoryItemProvider moduleRepositoryItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModuleRepositoryAdapter() {
		if (moduleRepositoryItemProvider == null) {
			moduleRepositoryItemProvider = new ModuleRepositoryItemProvider(this);
		}

		return moduleRepositoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleItemProvider moduleItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModuleAdapter() {
		if (moduleItemProvider == null) {
			moduleItemProvider = new ModuleItemProvider(this);
		}

		return moduleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.RampModule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RampModuleItemProvider rampModuleItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.RampModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRampModuleAdapter() {
		if (rampModuleItemProvider == null) {
			rampModuleItemProvider = new RampModuleItemProvider(this);
		}

		return rampModuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.PusherModule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PusherModuleItemProvider pusherModuleItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.PusherModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPusherModuleAdapter() {
		if (pusherModuleItemProvider == null) {
			pusherModuleItemProvider = new PusherModuleItemProvider(this);
		}

		return pusherModuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MotorModule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MotorModuleItemProvider motorModuleItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MotorModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMotorModuleAdapter() {
		if (motorModuleItemProvider == null) {
			motorModuleItemProvider = new MotorModuleItemProvider(this);
		}

		return motorModuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.SensorModule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorModuleItemProvider sensorModuleItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.SensorModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSensorModuleAdapter() {
		if (sensorModuleItemProvider == null) {
			sensorModuleItemProvider = new SensorModuleItemProvider(this);
		}

		return sensorModuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.OpticalSensorModule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpticalSensorModuleItemProvider opticalSensorModuleItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.OpticalSensorModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOpticalSensorModuleAdapter() {
		if (opticalSensorModuleItemProvider == null) {
			opticalSensorModuleItemProvider = new OpticalSensorModuleItemProvider(this);
		}

		return opticalSensorModuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.InductiveSensorModule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InductiveSensorModuleItemProvider inductiveSensorModuleItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.InductiveSensorModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInductiveSensorModuleAdapter() {
		if (inductiveSensorModuleItemProvider == null) {
			inductiveSensorModuleItemProvider = new InductiveSensorModuleItemProvider(this);
		}

		return inductiveSensorModuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.PresenceSensorModule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PresenceSensorModuleItemProvider presenceSensorModuleItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.PresenceSensorModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPresenceSensorModuleAdapter() {
		if (presenceSensorModuleItemProvider == null) {
			presenceSensorModuleItemProvider = new PresenceSensorModuleItemProvider(this);
		}

		return presenceSensorModuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.PressureSensorModule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PressureSensorModuleItemProvider pressureSensorModuleItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.PressureSensorModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPressureSensorModuleAdapter() {
		if (pressureSensorModuleItemProvider == null) {
			pressureSensorModuleItemProvider = new PressureSensorModuleItemProvider(this);
		}

		return pressureSensorModuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ConveyorBeltModule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConveyorBeltModuleItemProvider conveyorBeltModuleItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ConveyorBeltModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConveyorBeltModuleAdapter() {
		if (conveyorBeltModuleItemProvider == null) {
			conveyorBeltModuleItemProvider = new ConveyorBeltModuleItemProvider(this);
		}

		return conveyorBeltModuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.VacuumGripperModule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VacuumGripperModuleItemProvider vacuumGripperModuleItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.VacuumGripperModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVacuumGripperModuleAdapter() {
		if (vacuumGripperModuleItemProvider == null) {
			vacuumGripperModuleItemProvider = new VacuumGripperModuleItemProvider(this);
		}

		return vacuumGripperModuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MonostableCylinderModule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MonostableCylinderModuleItemProvider monostableCylinderModuleItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MonostableCylinderModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMonostableCylinderModuleAdapter() {
		if (monostableCylinderModuleItemProvider == null) {
			monostableCylinderModuleItemProvider = new MonostableCylinderModuleItemProvider(this);
		}

		return monostableCylinderModuleItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (microswitchModuleItemProvider != null) microswitchModuleItemProvider.dispose();
		if (potentiometerModuleItemProvider != null) potentiometerModuleItemProvider.dispose();
		if (moduleRepositoryItemProvider != null) moduleRepositoryItemProvider.dispose();
		if (moduleItemProvider != null) moduleItemProvider.dispose();
		if (rampModuleItemProvider != null) rampModuleItemProvider.dispose();
		if (pusherModuleItemProvider != null) pusherModuleItemProvider.dispose();
		if (motorModuleItemProvider != null) motorModuleItemProvider.dispose();
		if (sensorModuleItemProvider != null) sensorModuleItemProvider.dispose();
		if (opticalSensorModuleItemProvider != null) opticalSensorModuleItemProvider.dispose();
		if (inductiveSensorModuleItemProvider != null) inductiveSensorModuleItemProvider.dispose();
		if (presenceSensorModuleItemProvider != null) presenceSensorModuleItemProvider.dispose();
		if (pressureSensorModuleItemProvider != null) pressureSensorModuleItemProvider.dispose();
		if (conveyorBeltModuleItemProvider != null) conveyorBeltModuleItemProvider.dispose();
		if (vacuumGripperModuleItemProvider != null) vacuumGripperModuleItemProvider.dispose();
		if (monostableCylinderModuleItemProvider != null) monostableCylinderModuleItemProvider.dispose();
	}

}
