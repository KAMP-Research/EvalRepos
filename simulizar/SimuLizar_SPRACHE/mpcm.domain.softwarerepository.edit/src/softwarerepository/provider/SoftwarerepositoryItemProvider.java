/**
 */
package softwarerepository.provider;


import base.provider.EntityItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import repository.datatypes.DatatypesFactory;

import softwarerepository.Softwarerepository;
import softwarerepository.SoftwarerepositoryFactory;
import softwarerepository.SoftwarerepositoryPackage;

/**
 * This is the item provider adapter for a {@link softwarerepository.Softwarerepository} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SoftwarerepositoryItemProvider extends EntityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwarerepositoryItemProvider(AdapterFactory adapterFactory) {
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

			addRepositoryDescriptionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Repository Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRepositoryDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Softwarerepository_repositoryDescription_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Softwarerepository_repositoryDescription_feature", "_UI_Softwarerepository_type"),
				 SoftwarerepositoryPackage.Literals.SOFTWAREREPOSITORY__REPOSITORY_DESCRIPTION,
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
			childrenFeatures.add(SoftwarerepositoryPackage.Literals.SOFTWAREREPOSITORY__COMPONENTS_REPOSITORY);
			childrenFeatures.add(SoftwarerepositoryPackage.Literals.SOFTWAREREPOSITORY__INTERFACES_REPOSITORY);
			childrenFeatures.add(SoftwarerepositoryPackage.Literals.SOFTWAREREPOSITORY__DATA_TYPES_REPOSITORY);
			childrenFeatures.add(SoftwarerepositoryPackage.Literals.SOFTWAREREPOSITORY__EXCEPTION_TYPES);
			childrenFeatures.add(SoftwarerepositoryPackage.Literals.SOFTWAREREPOSITORY__EXCEPTION_OCCURENCES);
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
	 * This returns Softwarerepository.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Softwarerepository"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Softwarerepository)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_Softwarerepository_type") :
			getString("_UI_Softwarerepository_type") + " " + label;
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

		switch (notification.getFeatureID(Softwarerepository.class)) {
			case SoftwarerepositoryPackage.SOFTWAREREPOSITORY__REPOSITORY_DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SoftwarerepositoryPackage.SOFTWAREREPOSITORY__COMPONENTS_REPOSITORY:
			case SoftwarerepositoryPackage.SOFTWAREREPOSITORY__INTERFACES_REPOSITORY:
			case SoftwarerepositoryPackage.SOFTWAREREPOSITORY__DATA_TYPES_REPOSITORY:
			case SoftwarerepositoryPackage.SOFTWAREREPOSITORY__EXCEPTION_TYPES:
			case SoftwarerepositoryPackage.SOFTWAREREPOSITORY__EXCEPTION_OCCURENCES:
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
				(SoftwarerepositoryPackage.Literals.SOFTWAREREPOSITORY__COMPONENTS_REPOSITORY,
				 SoftwarerepositoryFactory.eINSTANCE.createBasicComponent()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwarerepositoryPackage.Literals.SOFTWAREREPOSITORY__INTERFACES_REPOSITORY,
				 SoftwarerepositoryFactory.eINSTANCE.createOperationInterface()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwarerepositoryPackage.Literals.SOFTWAREREPOSITORY__DATA_TYPES_REPOSITORY,
				 DatatypesFactory.eINSTANCE.createPrimitiveDataType()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwarerepositoryPackage.Literals.SOFTWAREREPOSITORY__DATA_TYPES_REPOSITORY,
				 DatatypesFactory.eINSTANCE.createCollectionDataType()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwarerepositoryPackage.Literals.SOFTWAREREPOSITORY__DATA_TYPES_REPOSITORY,
				 DatatypesFactory.eINSTANCE.createCompositeDataType()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwarerepositoryPackage.Literals.SOFTWAREREPOSITORY__EXCEPTION_TYPES,
				 SoftwarerepositoryFactory.eINSTANCE.createExceptionType()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwarerepositoryPackage.Literals.SOFTWAREREPOSITORY__EXCEPTION_OCCURENCES,
				 SoftwarerepositoryFactory.eINSTANCE.createExceptionOccurence()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SoftwarerepositoryEditPlugin.INSTANCE;
	}

}
