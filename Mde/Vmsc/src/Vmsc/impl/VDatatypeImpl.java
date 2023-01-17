/**
 */
package Vmsc.impl;

import Vmsc.VDatatype;
import Vmsc.VmscPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VDatatype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Vmsc.impl.VDatatypeImpl#isIsSerializable <em>Is Serializable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VDatatypeImpl extends VStructuralComponentImpl implements VDatatype {
	/**
	 * The default value of the '{@link #isIsSerializable() <em>Is Serializable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSerializable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SERIALIZABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSerializable() <em>Is Serializable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSerializable()
	 * @generated
	 * @ordered
	 */
	protected boolean isSerializable = IS_SERIALIZABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VDatatypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmscPackage.Literals.VDATATYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSerializable() {
		return isSerializable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSerializable(boolean newIsSerializable) {
		boolean oldIsSerializable = isSerializable;
		isSerializable = newIsSerializable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmscPackage.VDATATYPE__IS_SERIALIZABLE, oldIsSerializable, isSerializable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VmscPackage.VDATATYPE__IS_SERIALIZABLE:
				return isIsSerializable();
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
			case VmscPackage.VDATATYPE__IS_SERIALIZABLE:
				setIsSerializable((Boolean)newValue);
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
			case VmscPackage.VDATATYPE__IS_SERIALIZABLE:
				setIsSerializable(IS_SERIALIZABLE_EDEFAULT);
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
			case VmscPackage.VDATATYPE__IS_SERIALIZABLE:
				return isSerializable != IS_SERIALIZABLE_EDEFAULT;
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
		result.append(" (IsSerializable: ");
		result.append(isSerializable);
		result.append(')');
		return result.toString();
	}

} //VDatatypeImpl
