/**
 */
package Vmsc.provider;


import Vmsc.VStructuralFeatures;
import Vmsc.VmscPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link Vmsc.VStructuralFeatures} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VStructuralFeaturesItemProvider extends VNamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VStructuralFeaturesItemProvider(AdapterFactory adapterFactory) {
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

			addIsChangeablePropertyDescriptor(object);
			addIsOrderedPropertyDescriptor(object);
			addIsTransientPropertyDescriptor(object);
			addIsUnsettablePropertyDescriptor(object);
			addIsVolatilePropertyDescriptor(object);
			addLowerBoundPropertyDescriptor(object);
			addUpperBoundPropertyDescriptor(object);
			addIsDerivedPropertyDescriptor(object);
			addIsUniquePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is Changeable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsChangeablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VStructuralFeatures_IsChangeable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VStructuralFeatures_IsChangeable_feature", "_UI_VStructuralFeatures_type"),
				 VmscPackage.Literals.VSTRUCTURAL_FEATURES__IS_CHANGEABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Ordered feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsOrderedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VStructuralFeatures_IsOrdered_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VStructuralFeatures_IsOrdered_feature", "_UI_VStructuralFeatures_type"),
				 VmscPackage.Literals.VSTRUCTURAL_FEATURES__IS_ORDERED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Transient feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsTransientPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VStructuralFeatures_IsTransient_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VStructuralFeatures_IsTransient_feature", "_UI_VStructuralFeatures_type"),
				 VmscPackage.Literals.VSTRUCTURAL_FEATURES__IS_TRANSIENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Unsettable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsUnsettablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VStructuralFeatures_IsUnsettable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VStructuralFeatures_IsUnsettable_feature", "_UI_VStructuralFeatures_type"),
				 VmscPackage.Literals.VSTRUCTURAL_FEATURES__IS_UNSETTABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Volatile feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsVolatilePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VStructuralFeatures_IsVolatile_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VStructuralFeatures_IsVolatile_feature", "_UI_VStructuralFeatures_type"),
				 VmscPackage.Literals.VSTRUCTURAL_FEATURES__IS_VOLATILE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lower Bound feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLowerBoundPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VStructuralFeatures_LowerBound_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VStructuralFeatures_LowerBound_feature", "_UI_VStructuralFeatures_type"),
				 VmscPackage.Literals.VSTRUCTURAL_FEATURES__LOWER_BOUND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Upper Bound feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpperBoundPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VStructuralFeatures_UpperBound_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VStructuralFeatures_UpperBound_feature", "_UI_VStructuralFeatures_type"),
				 VmscPackage.Literals.VSTRUCTURAL_FEATURES__UPPER_BOUND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Derived feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsDerivedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VStructuralFeatures_IsDerived_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VStructuralFeatures_IsDerived_feature", "_UI_VStructuralFeatures_type"),
				 VmscPackage.Literals.VSTRUCTURAL_FEATURES__IS_DERIVED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Unique feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsUniquePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VStructuralFeatures_IsUnique_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VStructuralFeatures_IsUnique_feature", "_UI_VStructuralFeatures_type"),
				 VmscPackage.Literals.VSTRUCTURAL_FEATURES__IS_UNIQUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((VStructuralFeatures)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_VStructuralFeatures_type") :
			getString("_UI_VStructuralFeatures_type") + " " + label;
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

		switch (notification.getFeatureID(VStructuralFeatures.class)) {
			case VmscPackage.VSTRUCTURAL_FEATURES__IS_CHANGEABLE:
			case VmscPackage.VSTRUCTURAL_FEATURES__IS_ORDERED:
			case VmscPackage.VSTRUCTURAL_FEATURES__IS_TRANSIENT:
			case VmscPackage.VSTRUCTURAL_FEATURES__IS_UNSETTABLE:
			case VmscPackage.VSTRUCTURAL_FEATURES__IS_VOLATILE:
			case VmscPackage.VSTRUCTURAL_FEATURES__LOWER_BOUND:
			case VmscPackage.VSTRUCTURAL_FEATURES__UPPER_BOUND:
			case VmscPackage.VSTRUCTURAL_FEATURES__IS_DERIVED:
			case VmscPackage.VSTRUCTURAL_FEATURES__IS_UNIQUE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
