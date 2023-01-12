/**
 */
package Vmsc.impl;

import Vmsc.VClass;
import Vmsc.VStructuralFeatures;
import Vmsc.VmscPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Vmsc.impl.VClassImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link Vmsc.impl.VClassImpl#isIsInterface <em>Is Interface</em>}</li>
 *   <li>{@link Vmsc.impl.VClassImpl#getVSuperType <em>VSuper Type</em>}</li>
 *   <li>{@link Vmsc.impl.VClassImpl#getVStructural_features <em>VStructural features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VClassImpl extends VStructuralComponentImpl implements VClass {
	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsInterface() <em>Is Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInterface()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INTERFACE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsInterface() <em>Is Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInterface()
	 * @generated
	 * @ordered
	 */
	protected boolean isInterface = IS_INTERFACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVSuperType() <em>VSuper Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVSuperType()
	 * @generated
	 * @ordered
	 */
	protected EList<VClass> vSuperType;

	/**
	 * The cached value of the '{@link #getVStructural_features() <em>VStructural features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVStructural_features()
	 * @generated
	 * @ordered
	 */
	protected EList<VStructuralFeatures> vStructural_features;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmscPackage.Literals.VCLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmscPackage.VCLASS__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsInterface() {
		return isInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInterface(boolean newIsInterface) {
		boolean oldIsInterface = isInterface;
		isInterface = newIsInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmscPackage.VCLASS__IS_INTERFACE, oldIsInterface, isInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VClass> getVSuperType() {
		if (vSuperType == null) {
			vSuperType = new EObjectResolvingEList<VClass>(VClass.class, this, VmscPackage.VCLASS__VSUPER_TYPE);
		}
		return vSuperType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VStructuralFeatures> getVStructural_features() {
		if (vStructural_features == null) {
			vStructural_features = new EObjectContainmentEList<VStructuralFeatures>(VStructuralFeatures.class, this, VmscPackage.VCLASS__VSTRUCTURAL_FEATURES);
		}
		return vStructural_features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VmscPackage.VCLASS__VSTRUCTURAL_FEATURES:
				return ((InternalEList<?>)getVStructural_features()).basicRemove(otherEnd, msgs);
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
			case VmscPackage.VCLASS__IS_ABSTRACT:
				return isIsAbstract();
			case VmscPackage.VCLASS__IS_INTERFACE:
				return isIsInterface();
			case VmscPackage.VCLASS__VSUPER_TYPE:
				return getVSuperType();
			case VmscPackage.VCLASS__VSTRUCTURAL_FEATURES:
				return getVStructural_features();
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
			case VmscPackage.VCLASS__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case VmscPackage.VCLASS__IS_INTERFACE:
				setIsInterface((Boolean)newValue);
				return;
			case VmscPackage.VCLASS__VSUPER_TYPE:
				getVSuperType().clear();
				getVSuperType().addAll((Collection<? extends VClass>)newValue);
				return;
			case VmscPackage.VCLASS__VSTRUCTURAL_FEATURES:
				getVStructural_features().clear();
				getVStructural_features().addAll((Collection<? extends VStructuralFeatures>)newValue);
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
			case VmscPackage.VCLASS__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case VmscPackage.VCLASS__IS_INTERFACE:
				setIsInterface(IS_INTERFACE_EDEFAULT);
				return;
			case VmscPackage.VCLASS__VSUPER_TYPE:
				getVSuperType().clear();
				return;
			case VmscPackage.VCLASS__VSTRUCTURAL_FEATURES:
				getVStructural_features().clear();
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
			case VmscPackage.VCLASS__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case VmscPackage.VCLASS__IS_INTERFACE:
				return isInterface != IS_INTERFACE_EDEFAULT;
			case VmscPackage.VCLASS__VSUPER_TYPE:
				return vSuperType != null && !vSuperType.isEmpty();
			case VmscPackage.VCLASS__VSTRUCTURAL_FEATURES:
				return vStructural_features != null && !vStructural_features.isEmpty();
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
		result.append(" (IsAbstract: ");
		result.append(isAbstract);
		result.append(", IsInterface: ");
		result.append(isInterface);
		result.append(')');
		return result.toString();
	}

} //VClassImpl
