/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.provider;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.util.BusComponentsAdapterFactory;

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
public class BusComponentsItemProviderAdapterFactory extends BusComponentsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public BusComponentsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusBox} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusBoxItemProvider busBoxItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusBox}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBusBoxAdapter() {
		if (busBoxItemProvider == null) {
			busBoxItemProvider = new BusBoxItemProvider(this);
		}

		return busBoxItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusMaster} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusMasterItemProvider busMasterItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusMaster}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBusMasterAdapter() {
		if (busMasterItemProvider == null) {
			busMasterItemProvider = new BusMasterItemProvider(this);
		}

		return busMasterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusSlave} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusSlaveItemProvider busSlaveItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusSlave}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBusSlaveAdapter() {
		if (busSlaveItemProvider == null) {
			busSlaveItemProvider = new BusSlaveItemProvider(this);
		}

		return busSlaveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusCable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusCableItemProvider busCableItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusCable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBusCableAdapter() {
		if (busCableItemProvider == null) {
			busCableItemProvider = new BusCableItemProvider(this);
		}

		return busCableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.ProfibusDPBox} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfibusDPBoxItemProvider profibusDPBoxItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.ProfibusDPBox}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProfibusDPBoxAdapter() {
		if (profibusDPBoxItemProvider == null) {
			profibusDPBoxItemProvider = new ProfibusDPBoxItemProvider(this);
		}

		return profibusDPBoxItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.ProfibusDPMaster} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfibusDPMasterItemProvider profibusDPMasterItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.ProfibusDPMaster}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProfibusDPMasterAdapter() {
		if (profibusDPMasterItemProvider == null) {
			profibusDPMasterItemProvider = new ProfibusDPMasterItemProvider(this);
		}

		return profibusDPMasterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.ProfibusDPSlave} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfibusDPSlaveItemProvider profibusDPSlaveItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.ProfibusDPSlave}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProfibusDPSlaveAdapter() {
		if (profibusDPSlaveItemProvider == null) {
			profibusDPSlaveItemProvider = new ProfibusDPSlaveItemProvider(this);
		}

		return profibusDPSlaveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.ProfibusDPCable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfibusDPCableItemProvider profibusDPCableItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.ProfibusDPCable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProfibusDPCableAdapter() {
		if (profibusDPCableItemProvider == null) {
			profibusDPCableItemProvider = new ProfibusDPCableItemProvider(this);
		}

		return profibusDPCableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.EtherCATBox} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EtherCATBoxItemProvider etherCATBoxItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.EtherCATBox}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEtherCATBoxAdapter() {
		if (etherCATBoxItemProvider == null) {
			etherCATBoxItemProvider = new EtherCATBoxItemProvider(this);
		}

		return etherCATBoxItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.EtherCATMaster} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EtherCATMasterItemProvider etherCATMasterItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.EtherCATMaster}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEtherCATMasterAdapter() {
		if (etherCATMasterItemProvider == null) {
			etherCATMasterItemProvider = new EtherCATMasterItemProvider(this);
		}

		return etherCATMasterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.EtherCATSlave} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EtherCATSlaveItemProvider etherCATSlaveItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.EtherCATSlave}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEtherCATSlaveAdapter() {
		if (etherCATSlaveItemProvider == null) {
			etherCATSlaveItemProvider = new EtherCATSlaveItemProvider(this);
		}

		return etherCATSlaveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.EtherCATCable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EtherCATCableItemProvider etherCATCableItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.EtherCATCable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEtherCATCableAdapter() {
		if (etherCATCableItemProvider == null) {
			etherCATCableItemProvider = new EtherCATCableItemProvider(this);
		}

		return etherCATCableItemProvider;
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
		if (busBoxItemProvider != null) busBoxItemProvider.dispose();
		if (busMasterItemProvider != null) busMasterItemProvider.dispose();
		if (busSlaveItemProvider != null) busSlaveItemProvider.dispose();
		if (busCableItemProvider != null) busCableItemProvider.dispose();
		if (profibusDPBoxItemProvider != null) profibusDPBoxItemProvider.dispose();
		if (profibusDPMasterItemProvider != null) profibusDPMasterItemProvider.dispose();
		if (profibusDPSlaveItemProvider != null) profibusDPSlaveItemProvider.dispose();
		if (profibusDPCableItemProvider != null) profibusDPCableItemProvider.dispose();
		if (etherCATBoxItemProvider != null) etherCATBoxItemProvider.dispose();
		if (etherCATMasterItemProvider != null) etherCATMasterItemProvider.dispose();
		if (etherCATSlaveItemProvider != null) etherCATSlaveItemProvider.dispose();
		if (etherCATCableItemProvider != null) etherCATCableItemProvider.dispose();
	}

}
