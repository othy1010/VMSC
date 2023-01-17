/**
 */
package Vmsc.impl;

import Vmsc.VStructuralFeatures;
import Vmsc.VmscPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VStructural Features</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Vmsc.impl.VStructuralFeaturesImpl#isIsChangeable <em>Is Changeable</em>}</li>
 *   <li>{@link Vmsc.impl.VStructuralFeaturesImpl#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link Vmsc.impl.VStructuralFeaturesImpl#isIsTransient <em>Is Transient</em>}</li>
 *   <li>{@link Vmsc.impl.VStructuralFeaturesImpl#isIsUnsettable <em>Is Unsettable</em>}</li>
 *   <li>{@link Vmsc.impl.VStructuralFeaturesImpl#isIsVolatile <em>Is Volatile</em>}</li>
 *   <li>{@link Vmsc.impl.VStructuralFeaturesImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link Vmsc.impl.VStructuralFeaturesImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link Vmsc.impl.VStructuralFeaturesImpl#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link Vmsc.impl.VStructuralFeaturesImpl#isIsUnique <em>Is Unique</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class VStructuralFeaturesImpl extends VNamedElementImpl implements VStructuralFeatures {
	/**
	 * The default value of the '{@link #isIsChangeable() <em>Is Changeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsChangeable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CHANGEABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsChangeable() <em>Is Changeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsChangeable()
	 * @generated
	 * @ordered
	 */
	protected boolean isChangeable = IS_CHANGEABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ORDERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected boolean isOrdered = IS_ORDERED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsTransient() <em>Is Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTransient()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TRANSIENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsTransient() <em>Is Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTransient()
	 * @generated
	 * @ordered
	 */
	protected boolean isTransient = IS_TRANSIENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsUnsettable() <em>Is Unsettable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnsettable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNSETTABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsUnsettable() <em>Is Unsettable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnsettable()
	 * @generated
	 * @ordered
	 */
	protected boolean isUnsettable = IS_UNSETTABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsVolatile() <em>Is Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsVolatile()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_VOLATILE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsVolatile() <em>Is Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsVolatile()
	 * @generated
	 * @ordered
	 */
	protected boolean isVolatile = IS_VOLATILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_BOUND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected int lowerBound = LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_BOUND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected int upperBound = UPPER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DERIVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerived()
	 * @generated
	 * @ordered
	 */
	protected boolean isDerived = IS_DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean isUnique = IS_UNIQUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VStructuralFeaturesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmscPackage.Literals.VSTRUCTURAL_FEATURES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsChangeable() {
		return isChangeable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsChangeable(boolean newIsChangeable) {
		boolean oldIsChangeable = isChangeable;
		isChangeable = newIsChangeable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmscPackage.VSTRUCTURAL_FEATURES__IS_CHANGEABLE, oldIsChangeable, isChangeable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOrdered() {
		return isOrdered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOrdered(boolean newIsOrdered) {
		boolean oldIsOrdered = isOrdered;
		isOrdered = newIsOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmscPackage.VSTRUCTURAL_FEATURES__IS_ORDERED, oldIsOrdered, isOrdered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsTransient() {
		return isTransient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTransient(boolean newIsTransient) {
		boolean oldIsTransient = isTransient;
		isTransient = newIsTransient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmscPackage.VSTRUCTURAL_FEATURES__IS_TRANSIENT, oldIsTransient, isTransient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsUnsettable() {
		return isUnsettable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnsettable(boolean newIsUnsettable) {
		boolean oldIsUnsettable = isUnsettable;
		isUnsettable = newIsUnsettable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmscPackage.VSTRUCTURAL_FEATURES__IS_UNSETTABLE, oldIsUnsettable, isUnsettable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsVolatile() {
		return isVolatile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsVolatile(boolean newIsVolatile) {
		boolean oldIsVolatile = isVolatile;
		isVolatile = newIsVolatile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmscPackage.VSTRUCTURAL_FEATURES__IS_VOLATILE, oldIsVolatile, isVolatile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBound(int newLowerBound) {
		int oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmscPackage.VSTRUCTURAL_FEATURES__LOWER_BOUND, oldLowerBound, lowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound(int newUpperBound) {
		int oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmscPackage.VSTRUCTURAL_FEATURES__UPPER_BOUND, oldUpperBound, upperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDerived() {
		return isDerived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerived(boolean newIsDerived) {
		boolean oldIsDerived = isDerived;
		isDerived = newIsDerived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmscPackage.VSTRUCTURAL_FEATURES__IS_DERIVED, oldIsDerived, isDerived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsUnique() {
		return isUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnique(boolean newIsUnique) {
		boolean oldIsUnique = isUnique;
		isUnique = newIsUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmscPackage.VSTRUCTURAL_FEATURES__IS_UNIQUE, oldIsUnique, isUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VmscPackage.VSTRUCTURAL_FEATURES__IS_CHANGEABLE:
				return isIsChangeable();
			case VmscPackage.VSTRUCTURAL_FEATURES__IS_ORDERED:
				return isIsOrdered();
			case VmscPackage.VSTRUCTURAL_FEATURES__IS_TRANSIENT:
				return isIsTransient();
			case VmscPackage.VSTRUCTURAL_FEATURES__IS_UNSETTABLE:
				return isIsUnsettable();
			case VmscPackage.VSTRUCTURAL_FEATURES__IS_VOLATILE:
				return isIsVolatile();
			case VmscPackage.VSTRUCTURAL_FEATURES__LOWER_BOUND:
				return getLowerBound();
			case VmscPackage.VSTRUCTURAL_FEATURES__UPPER_BOUND:
				return getUpperBound();
			case VmscPackage.VSTRUCTURAL_FEATURES__IS_DERIVED:
				return isIsDerived();
			case VmscPackage.VSTRUCTURAL_FEATURES__IS_UNIQUE:
				return isIsUnique();
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
			case VmscPackage.VSTRUCTURAL_FEATURES__IS_CHANGEABLE:
				setIsChangeable((Boolean)newValue);
				return;
			case VmscPackage.VSTRUCTURAL_FEATURES__IS_ORDERED:
				setIsOrdered((Boolean)newValue);
				return;
			case VmscPackage.VSTRUCTURAL_FEATURES__IS_TRANSIENT:
				setIsTransient((Boolean)newValue);
				return;
			case VmscPackage.VSTRUCTURAL_FEATURES__IS_UNSETTABLE:
				setIsUnsettable((Boolean)newValue);
				return;
			case VmscPackage.VSTRUCTURAL_FEATURES__IS_VOLATILE:
				setIsVolatile((Boolean)newValue);
				return;
			case VmscPackage.VSTRUCTURAL_FEATURES__LOWER_BOUND:
				setLowerBound((Integer)newValue);
				return;
			case VmscPackage.VSTRUCTURAL_FEATURES__UPPER_BOUND:
				setUpperBound((Integer)newValue);
				return;
			case VmscPackage.VSTRUCTURAL_FEATURES__IS_DERIVED:
				setIsDerived((Boolean)newValue);
				return;
			case VmscPackage.VSTRUCTURAL_FEATURES__IS_UNIQUE:
				setIsUnique((Boolean)newValue);
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
			case VmscPackage.VSTRUCTURAL_FEATURES__IS_CHANGEABLE:
				setIsChangeable(IS_CHANGEABLE_EDEFAULT);
				return;
			case VmscPackage.VSTRUCTURAL_FEATURES__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case VmscPackage.VSTRUCTURAL_FEATURES__IS_TRANSIENT:
				setIsTransient(IS_TRANSIENT_EDEFAULT);
				return;
			case VmscPackage.VSTRUCTURAL_FEATURES__IS_UNSETTABLE:
				setIsUnsettable(IS_UNSETTABLE_EDEFAULT);
				return;
			case VmscPackage.VSTRUCTURAL_FEATURES__IS_VOLATILE:
				setIsVolatile(IS_VOLATILE_EDEFAULT);
				return;
			case VmscPackage.VSTRUCTURAL_FEATURES__LOWER_BOUND:
				setLowerBound(LOWER_BOUND_EDEFAULT);
				return;
			case VmscPackage.VSTRUCTURAL_FEATURES__UPPER_BOUND:
				setUpperBound(UPPER_BOUND_EDEFAULT);
				return;
			case VmscPackage.VSTRUCTURAL_FEATURES__IS_DERIVED:
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case VmscPackage.VSTRUCTURAL_FEATURES__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
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
			case VmscPackage.VSTRUCTURAL_FEATURES__IS_CHANGEABLE:
				return isChangeable != IS_CHANGEABLE_EDEFAULT;
			case VmscPackage.VSTRUCTURAL_FEATURES__IS_ORDERED:
				return isOrdered != IS_ORDERED_EDEFAULT;
			case VmscPackage.VSTRUCTURAL_FEATURES__IS_TRANSIENT:
				return isTransient != IS_TRANSIENT_EDEFAULT;
			case VmscPackage.VSTRUCTURAL_FEATURES__IS_UNSETTABLE:
				return isUnsettable != IS_UNSETTABLE_EDEFAULT;
			case VmscPackage.VSTRUCTURAL_FEATURES__IS_VOLATILE:
				return isVolatile != IS_VOLATILE_EDEFAULT;
			case VmscPackage.VSTRUCTURAL_FEATURES__LOWER_BOUND:
				return lowerBound != LOWER_BOUND_EDEFAULT;
			case VmscPackage.VSTRUCTURAL_FEATURES__UPPER_BOUND:
				return upperBound != UPPER_BOUND_EDEFAULT;
			case VmscPackage.VSTRUCTURAL_FEATURES__IS_DERIVED:
				return isDerived != IS_DERIVED_EDEFAULT;
			case VmscPackage.VSTRUCTURAL_FEATURES__IS_UNIQUE:
				return isUnique != IS_UNIQUE_EDEFAULT;
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
		result.append(" (IsChangeable: ");
		result.append(isChangeable);
		result.append(", IsOrdered: ");
		result.append(isOrdered);
		result.append(", IsTransient: ");
		result.append(isTransient);
		result.append(", IsUnsettable: ");
		result.append(isUnsettable);
		result.append(", IsVolatile: ");
		result.append(isVolatile);
		result.append(", LowerBound: ");
		result.append(lowerBound);
		result.append(", UpperBound: ");
		result.append(upperBound);
		result.append(", IsDerived: ");
		result.append(isDerived);
		result.append(", IsUnique: ");
		result.append(isUnique);
		result.append(')');
		return result.toString();
	}

} //VStructuralFeaturesImpl
