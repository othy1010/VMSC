/**
 */
package Vmsc.impl;

import Vmsc.VString;
import Vmsc.VmscPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VString</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Vmsc.impl.VStringImpl#getVContent <em>VContent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VStringImpl extends VTypeImpl implements VString {
	/**
	 * The default value of the '{@link #getVContent() <em>VContent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVContent()
	 * @generated
	 * @ordered
	 */
	protected static final String VCONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVContent() <em>VContent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVContent()
	 * @generated
	 * @ordered
	 */
	protected String vContent = VCONTENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VStringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmscPackage.Literals.VSTRING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVContent() {
		return vContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVContent(String newVContent) {
		String oldVContent = vContent;
		vContent = newVContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmscPackage.VSTRING__VCONTENT, oldVContent, vContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VmscPackage.VSTRING__VCONTENT:
				return getVContent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VmscPackage.VSTRING__VCONTENT:
				setVContent((String)newValue);
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
			case VmscPackage.VSTRING__VCONTENT:
				setVContent(VCONTENT_EDEFAULT);
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
			case VmscPackage.VSTRING__VCONTENT:
				return VCONTENT_EDEFAULT == null ? vContent != null : !VCONTENT_EDEFAULT.equals(vContent);
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
		result.append(" (VContent: ");
		result.append(vContent);
		result.append(')');
		return result.toString();
	}

} //VStringImpl
