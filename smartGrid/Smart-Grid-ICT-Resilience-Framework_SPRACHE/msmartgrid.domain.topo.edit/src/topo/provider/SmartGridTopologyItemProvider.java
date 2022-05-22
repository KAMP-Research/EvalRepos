/**
 */
package topo.provider;


import base.BasePackage;

import graph.GraphFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import topo.SmartGridTopology;
import topo.TopoFactory;
import topo.TopoPackage;

/**
 * This is the item provider adapter for a {@link topo.SmartGridTopology} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SmartGridTopologyItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartGridTopologyItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIdPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Identifier_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Identifier_id_feature", "_UI_Identifier_type"),
				 BasePackage.Literals.IDENTIFIER__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NamedEntity_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NamedEntity_name_feature", "_UI_NamedEntity_type"),
				 BasePackage.Literals.NAMED_ENTITY__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(TopoPackage.Literals.SMART_GRID_TOPOLOGY__CONTAINS_NE);
			childrenFeatures.add(TopoPackage.Literals.SMART_GRID_TOPOLOGY__CONTAINS_PGN);
			childrenFeatures.add(TopoPackage.Literals.SMART_GRID_TOPOLOGY__CONTAINS_PC);
			childrenFeatures.add(TopoPackage.Literals.SMART_GRID_TOPOLOGY__CONTAINS_LC);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns SmartGridTopology.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SmartGridTopology"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SmartGridTopology)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SmartGridTopology_type") :
			getString("_UI_SmartGridTopology_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(SmartGridTopology.class)) {
			case TopoPackage.SMART_GRID_TOPOLOGY__ID:
			case TopoPackage.SMART_GRID_TOPOLOGY__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TopoPackage.SMART_GRID_TOPOLOGY__CONTAINS_NE:
			case TopoPackage.SMART_GRID_TOPOLOGY__CONTAINS_PGN:
			case TopoPackage.SMART_GRID_TOPOLOGY__CONTAINS_PC:
			case TopoPackage.SMART_GRID_TOPOLOGY__CONTAINS_LC:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(TopoPackage.Literals.SMART_GRID_TOPOLOGY__CONTAINS_NE,
				 TopoFactory.eINSTANCE.createSmartMeter()));

		newChildDescriptors.add
			(createChildParameter
				(TopoPackage.Literals.SMART_GRID_TOPOLOGY__CONTAINS_NE,
				 TopoFactory.eINSTANCE.createNetworkNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopoPackage.Literals.SMART_GRID_TOPOLOGY__CONTAINS_NE,
				 TopoFactory.eINSTANCE.createControlCenter()));

		newChildDescriptors.add
			(createChildParameter
				(TopoPackage.Literals.SMART_GRID_TOPOLOGY__CONTAINS_NE,
				 TopoFactory.eINSTANCE.createGenericController()));

		newChildDescriptors.add
			(createChildParameter
				(TopoPackage.Literals.SMART_GRID_TOPOLOGY__CONTAINS_NE,
				 TopoFactory.eINSTANCE.createInterCom()));

		newChildDescriptors.add
			(createChildParameter
				(TopoPackage.Literals.SMART_GRID_TOPOLOGY__CONTAINS_PGN,
				 GraphFactory.eINSTANCE.createPowerGridNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopoPackage.Literals.SMART_GRID_TOPOLOGY__CONTAINS_PC,
				 GraphFactory.eINSTANCE.createPhysicalConnection()));

		newChildDescriptors.add
			(createChildParameter
				(TopoPackage.Literals.SMART_GRID_TOPOLOGY__CONTAINS_LC,
				 GraphFactory.eINSTANCE.createLogicalCommunication()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TopoEditPlugin.INSTANCE;
	}

}
