/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.provider;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.util.StructureRepositoryAdapterFactory;

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
public class StructureRepositoryItemProviderAdapterFactory extends StructureRepositoryAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public StructureRepositoryItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Structure} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureItemProvider structureItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Structure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStructureAdapter() {
		if (structureItemProvider == null) {
			structureItemProvider = new StructureItemProvider(this);
		}

		return structureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.CommunicationNetwork} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationNetworkItemProvider communicationNetworkItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.CommunicationNetwork}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommunicationNetworkAdapter() {
		if (communicationNetworkItemProvider == null) {
			communicationNetworkItemProvider = new CommunicationNetworkItemProvider(this);
		}

		return communicationNetworkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.PowerNetwork} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerNetworkItemProvider powerNetworkItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.PowerNetwork}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPowerNetworkAdapter() {
		if (powerNetworkItemProvider == null) {
			powerNetworkItemProvider = new PowerNetworkItemProvider(this);
		}

		return powerNetworkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.ControlCabinet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlCabinetItemProvider controlCabinetItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.ControlCabinet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createControlCabinetAdapter() {
		if (controlCabinetItemProvider == null) {
			controlCabinetItemProvider = new ControlCabinetItemProvider(this);
		}

		return controlCabinetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.PneumaticNetwork} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PneumaticNetworkItemProvider pneumaticNetworkItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.PneumaticNetwork}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPneumaticNetworkAdapter() {
		if (pneumaticNetworkItemProvider == null) {
			pneumaticNetworkItemProvider = new PneumaticNetworkItemProvider(this);
		}

		return pneumaticNetworkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Conveyor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConveyorItemProvider conveyorItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Conveyor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConveyorAdapter() {
		if (conveyorItemProvider == null) {
			conveyorItemProvider = new ConveyorItemProvider(this);
		}

		return conveyorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Crane} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CraneItemProvider craneItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Crane}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCraneAdapter() {
		if (craneItemProvider == null) {
			craneItemProvider = new CraneItemProvider(this);
		}

		return craneItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.PowerWiring} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerWiringItemProvider powerWiringItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.PowerWiring}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPowerWiringAdapter() {
		if (powerWiringItemProvider == null) {
			powerWiringItemProvider = new PowerWiringItemProvider(this);
		}

		return powerWiringItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.LogicalWiring} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalWiringItemProvider logicalWiringItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.LogicalWiring}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLogicalWiringAdapter() {
		if (logicalWiringItemProvider == null) {
			logicalWiringItemProvider = new LogicalWiringItemProvider(this);
		}

		return logicalWiringItemProvider;
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
		if (structureItemProvider != null) structureItemProvider.dispose();
		if (communicationNetworkItemProvider != null) communicationNetworkItemProvider.dispose();
		if (powerNetworkItemProvider != null) powerNetworkItemProvider.dispose();
		if (controlCabinetItemProvider != null) controlCabinetItemProvider.dispose();
		if (pneumaticNetworkItemProvider != null) pneumaticNetworkItemProvider.dispose();
		if (conveyorItemProvider != null) conveyorItemProvider.dispose();
		if (craneItemProvider != null) craneItemProvider.dispose();
		if (powerWiringItemProvider != null) powerWiringItemProvider.dispose();
		if (logicalWiringItemProvider != null) logicalWiringItemProvider.dispose();
	}

}
