/**
 */
package Vmsc.provider;

import Vmsc.util.VmscAdapterFactory;

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
public class VmscItemProviderAdapterFactory extends VmscAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public VmscItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link Vmsc.VEnum} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VEnumItemProvider vEnumItemProvider;

	/**
	 * This creates an adapter for a {@link Vmsc.VEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVEnumAdapter() {
		if (vEnumItemProvider == null) {
			vEnumItemProvider = new VEnumItemProvider(this);
		}

		return vEnumItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Vmsc.VDatatype} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VDatatypeItemProvider vDatatypeItemProvider;

	/**
	 * This creates an adapter for a {@link Vmsc.VDatatype}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVDatatypeAdapter() {
		if (vDatatypeItemProvider == null) {
			vDatatypeItemProvider = new VDatatypeItemProvider(this);
		}

		return vDatatypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Vmsc.VPackage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VPackageItemProvider vPackageItemProvider;

	/**
	 * This creates an adapter for a {@link Vmsc.VPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVPackageAdapter() {
		if (vPackageItemProvider == null) {
			vPackageItemProvider = new VPackageItemProvider(this);
		}

		return vPackageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Vmsc.VClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VClassItemProvider vClassItemProvider;

	/**
	 * This creates an adapter for a {@link Vmsc.VClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVClassAdapter() {
		if (vClassItemProvider == null) {
			vClassItemProvider = new VClassItemProvider(this);
		}

		return vClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Vmsc.VAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VAttributeItemProvider vAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link Vmsc.VAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVAttributeAdapter() {
		if (vAttributeItemProvider == null) {
			vAttributeItemProvider = new VAttributeItemProvider(this);
		}

		return vAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Vmsc.VReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VReferenceItemProvider vReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link Vmsc.VReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVReferenceAdapter() {
		if (vReferenceItemProvider == null) {
			vReferenceItemProvider = new VReferenceItemProvider(this);
		}

		return vReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Vmsc.VString} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VStringItemProvider vStringItemProvider;

	/**
	 * This creates an adapter for a {@link Vmsc.VString}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVStringAdapter() {
		if (vStringItemProvider == null) {
			vStringItemProvider = new VStringItemProvider(this);
		}

		return vStringItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Vmsc.VInt} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VIntItemProvider vIntItemProvider;

	/**
	 * This creates an adapter for a {@link Vmsc.VInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVIntAdapter() {
		if (vIntItemProvider == null) {
			vIntItemProvider = new VIntItemProvider(this);
		}

		return vIntItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Vmsc.VFloat} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VFloatItemProvider vFloatItemProvider;

	/**
	 * This creates an adapter for a {@link Vmsc.VFloat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVFloatAdapter() {
		if (vFloatItemProvider == null) {
			vFloatItemProvider = new VFloatItemProvider(this);
		}

		return vFloatItemProvider;
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
		if (vEnumItemProvider != null) vEnumItemProvider.dispose();
		if (vDatatypeItemProvider != null) vDatatypeItemProvider.dispose();
		if (vPackageItemProvider != null) vPackageItemProvider.dispose();
		if (vClassItemProvider != null) vClassItemProvider.dispose();
		if (vAttributeItemProvider != null) vAttributeItemProvider.dispose();
		if (vReferenceItemProvider != null) vReferenceItemProvider.dispose();
		if (vStringItemProvider != null) vStringItemProvider.dispose();
		if (vIntItemProvider != null) vIntItemProvider.dispose();
		if (vFloatItemProvider != null) vFloatItemProvider.dispose();
	}

}
