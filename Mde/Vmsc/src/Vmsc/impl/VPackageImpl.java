/**
 */
package Vmsc.impl;

import Vmsc.VPackage;
import Vmsc.VStructuralComponent;
import Vmsc.VmscPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VPackage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Vmsc.impl.VPackageImpl#getVPrefix <em>VPrefix</em>}</li>
 *   <li>{@link Vmsc.impl.VPackageImpl#getVUri <em>VUri</em>}</li>
 *   <li>{@link Vmsc.impl.VPackageImpl#getVComponents <em>VComponents</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VPackageImpl extends VStructuralComponentImpl implements VPackage {
	/**
	 * The default value of the '{@link #getVPrefix() <em>VPrefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String VPREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVPrefix() <em>VPrefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVPrefix()
	 * @generated
	 * @ordered
	 */
	protected String vPrefix = VPREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getVUri() <em>VUri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVUri()
	 * @generated
	 * @ordered
	 */
	protected static final String VURI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVUri() <em>VUri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVUri()
	 * @generated
	 * @ordered
	 */
	protected String vUri = VURI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVComponents() <em>VComponents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<VStructuralComponent> vComponents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmscPackage.Literals.VPACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVPrefix() {
		return vPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVPrefix(String newVPrefix) {
		String oldVPrefix = vPrefix;
		vPrefix = newVPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmscPackage.VPACKAGE__VPREFIX, oldVPrefix, vPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVUri() {
		return vUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVUri(String newVUri) {
		String oldVUri = vUri;
		vUri = newVUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmscPackage.VPACKAGE__VURI, oldVUri, vUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VStructuralComponent> getVComponents() {
		if (vComponents == null) {
			vComponents = new EObjectContainmentEList<VStructuralComponent>(VStructuralComponent.class, this, VmscPackage.VPACKAGE__VCOMPONENTS);
		}
		return vComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VmscPackage.VPACKAGE__VCOMPONENTS:
				return ((InternalEList<?>)getVComponents()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VmscPackage.VPACKAGE__VPREFIX:
				return getVPrefix();
			case VmscPackage.VPACKAGE__VURI:
				return getVUri();
			case VmscPackage.VPACKAGE__VCOMPONENTS:
				return getVComponents();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VmscPackage.VPACKAGE__VPREFIX:
				setVPrefix((String)newValue);
				return;
			case VmscPackage.VPACKAGE__VURI:
				setVUri((String)newValue);
				return;
			case VmscPackage.VPACKAGE__VCOMPONENTS:
				getVComponents().clear();
				getVComponents().addAll((Collection<? extends VStructuralComponent>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VmscPackage.VPACKAGE__VPREFIX:
				setVPrefix(VPREFIX_EDEFAULT);
				return;
			case VmscPackage.VPACKAGE__VURI:
				setVUri(VURI_EDEFAULT);
				return;
			case VmscPackage.VPACKAGE__VCOMPONENTS:
				getVComponents().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VmscPackage.VPACKAGE__VPREFIX:
				return VPREFIX_EDEFAULT == null ? vPrefix != null : !VPREFIX_EDEFAULT.equals(vPrefix);
			case VmscPackage.VPACKAGE__VURI:
				return VURI_EDEFAULT == null ? vUri != null : !VURI_EDEFAULT.equals(vUri);
			case VmscPackage.VPACKAGE__VCOMPONENTS:
				return vComponents != null && !vComponents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (VPrefix: ");
		result.append(vPrefix);
		result.append(", VUri: ");
		result.append(vUri);
		result.append(')');
		return result.toString();
	}

} //VPackageImpl
