/**
 */
package Vmsc.impl;

import Vmsc.VClass;
import Vmsc.VReference;
import Vmsc.VmscPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VReference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Vmsc.impl.VReferenceImpl#isIsContainer <em>Is Container</em>}</li>
 *   <li>{@link Vmsc.impl.VReferenceImpl#isIsContainment <em>Is Containment</em>}</li>
 *   <li>{@link Vmsc.impl.VReferenceImpl#getVType <em>VType</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VReferenceImpl extends VStructuralFeaturesImpl implements VReference {
	/**
	 * The default value of the '{@link #isIsContainer() <em>Is Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsContainer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONTAINER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsContainer() <em>Is Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsContainer()
	 * @generated
	 * @ordered
	 */
	protected boolean isContainer = IS_CONTAINER_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsContainment() <em>Is Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsContainment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONTAINMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsContainment() <em>Is Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsContainment()
	 * @generated
	 * @ordered
	 */
	protected boolean isContainment = IS_CONTAINMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVType() <em>VType</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVType()
	 * @generated
	 * @ordered
	 */
	protected VClass vType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmscPackage.Literals.VREFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsContainer() {
		return isContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsContainer(boolean newIsContainer) {
		boolean oldIsContainer = isContainer;
		isContainer = newIsContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmscPackage.VREFERENCE__IS_CONTAINER, oldIsContainer, isContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsContainment() {
		return isContainment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsContainment(boolean newIsContainment) {
		boolean oldIsContainment = isContainment;
		isContainment = newIsContainment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmscPackage.VREFERENCE__IS_CONTAINMENT, oldIsContainment, isContainment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VClass getVType() {
		return vType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVType(VClass newVType, NotificationChain msgs) {
		VClass oldVType = vType;
		vType = newVType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VmscPackage.VREFERENCE__VTYPE, oldVType, newVType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVType(VClass newVType) {
		if (newVType != vType) {
			NotificationChain msgs = null;
			if (vType != null)
				msgs = ((InternalEObject)vType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VmscPackage.VREFERENCE__VTYPE, null, msgs);
			if (newVType != null)
				msgs = ((InternalEObject)newVType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VmscPackage.VREFERENCE__VTYPE, null, msgs);
			msgs = basicSetVType(newVType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmscPackage.VREFERENCE__VTYPE, newVType, newVType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VmscPackage.VREFERENCE__VTYPE:
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
			case VmscPackage.VREFERENCE__IS_CONTAINER:
				return isIsContainer();
			case VmscPackage.VREFERENCE__IS_CONTAINMENT:
				return isIsContainment();
			case VmscPackage.VREFERENCE__VTYPE:
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
			case VmscPackage.VREFERENCE__IS_CONTAINER:
				setIsContainer((Boolean)newValue);
				return;
			case VmscPackage.VREFERENCE__IS_CONTAINMENT:
				setIsContainment((Boolean)newValue);
				return;
			case VmscPackage.VREFERENCE__VTYPE:
				setVType((VClass)newValue);
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
			case VmscPackage.VREFERENCE__IS_CONTAINER:
				setIsContainer(IS_CONTAINER_EDEFAULT);
				return;
			case VmscPackage.VREFERENCE__IS_CONTAINMENT:
				setIsContainment(IS_CONTAINMENT_EDEFAULT);
				return;
			case VmscPackage.VREFERENCE__VTYPE:
				setVType((VClass)null);
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
			case VmscPackage.VREFERENCE__IS_CONTAINER:
				return isContainer != IS_CONTAINER_EDEFAULT;
			case VmscPackage.VREFERENCE__IS_CONTAINMENT:
				return isContainment != IS_CONTAINMENT_EDEFAULT;
			case VmscPackage.VREFERENCE__VTYPE:
				return vType != null;
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
		result.append(" (IsContainer: ");
		result.append(isContainer);
		result.append(", IsContainment: ");
		result.append(isContainment);
		result.append(')');
		return result.toString();
	}

} //VReferenceImpl
