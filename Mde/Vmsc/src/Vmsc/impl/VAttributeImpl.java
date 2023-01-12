/**
 */
package Vmsc.impl;

import Vmsc.VAttribute;
import Vmsc.VType;
import Vmsc.VmscPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VAttribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Vmsc.impl.VAttributeImpl#getVType <em>VType</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VAttributeImpl extends VStructuralFeaturesImpl implements VAttribute {
	/**
	 * The cached value of the '{@link #getVType() <em>VType</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVType()
	 * @generated
	 * @ordered
	 */
	protected VType vType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmscPackage.Literals.VATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VType getVType() {
		return vType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVType(VType newVType, NotificationChain msgs) {
		VType oldVType = vType;
		vType = newVType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VmscPackage.VATTRIBUTE__VTYPE, oldVType, newVType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVType(VType newVType) {
		if (newVType != vType) {
			NotificationChain msgs = null;
			if (vType != null)
				msgs = ((InternalEObject)vType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VmscPackage.VATTRIBUTE__VTYPE, null, msgs);
			if (newVType != null)
				msgs = ((InternalEObject)newVType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VmscPackage.VATTRIBUTE__VTYPE, null, msgs);
			msgs = basicSetVType(newVType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmscPackage.VATTRIBUTE__VTYPE, newVType, newVType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VmscPackage.VATTRIBUTE__VTYPE:
				return basicSetVType(null, msgs);
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
			case VmscPackage.VATTRIBUTE__VTYPE:
				return getVType();
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
			case VmscPackage.VATTRIBUTE__VTYPE:
				setVType((VType)newValue);
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
			case VmscPackage.VATTRIBUTE__VTYPE:
				setVType((VType)null);
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
			case VmscPackage.VATTRIBUTE__VTYPE:
				return vType != null;
		}
		return super.eIsSet(featureID);
	}

} //VAttributeImpl
