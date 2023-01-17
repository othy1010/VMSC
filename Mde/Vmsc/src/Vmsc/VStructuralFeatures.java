/**
 */
package Vmsc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VStructural Features</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Vmsc.VStructuralFeatures#isIsChangeable <em>Is Changeable</em>}</li>
 *   <li>{@link Vmsc.VStructuralFeatures#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link Vmsc.VStructuralFeatures#isIsTransient <em>Is Transient</em>}</li>
 *   <li>{@link Vmsc.VStructuralFeatures#isIsUnsettable <em>Is Unsettable</em>}</li>
 *   <li>{@link Vmsc.VStructuralFeatures#isIsVolatile <em>Is Volatile</em>}</li>
 *   <li>{@link Vmsc.VStructuralFeatures#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link Vmsc.VStructuralFeatures#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link Vmsc.VStructuralFeatures#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link Vmsc.VStructuralFeatures#isIsUnique <em>Is Unique</em>}</li>
 * </ul>
 *
 * @see Vmsc.VmscPackage#getVStructuralFeatures()
 * @model abstract="true"
 * @generated
 */
public interface VStructuralFeatures extends VNamedElement {
	/**
	 * Returns the value of the '<em><b>Is Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Changeable</em>' attribute.
	 * @see #setIsChangeable(boolean)
	 * @see Vmsc.VmscPackage#getVStructuralFeatures_IsChangeable()
	 * @model
	 * @generated
	 */
	boolean isIsChangeable();

	/**
	 * Sets the value of the '{@link Vmsc.VStructuralFeatures#isIsChangeable <em>Is Changeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Changeable</em>' attribute.
	 * @see #isIsChangeable()
	 * @generated
	 */
	void setIsChangeable(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Ordered</em>' attribute.
	 * @see #setIsOrdered(boolean)
	 * @see Vmsc.VmscPackage#getVStructuralFeatures_IsOrdered()
	 * @model
	 * @generated
	 */
	boolean isIsOrdered();

	/**
	 * Sets the value of the '{@link Vmsc.VStructuralFeatures#isIsOrdered <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Ordered</em>' attribute.
	 * @see #isIsOrdered()
	 * @generated
	 */
	void setIsOrdered(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Transient</em>' attribute.
	 * @see #setIsTransient(boolean)
	 * @see Vmsc.VmscPackage#getVStructuralFeatures_IsTransient()
	 * @model
	 * @generated
	 */
	boolean isIsTransient();

	/**
	 * Sets the value of the '{@link Vmsc.VStructuralFeatures#isIsTransient <em>Is Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Transient</em>' attribute.
	 * @see #isIsTransient()
	 * @generated
	 */
	void setIsTransient(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Unsettable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Unsettable</em>' attribute.
	 * @see #setIsUnsettable(boolean)
	 * @see Vmsc.VmscPackage#getVStructuralFeatures_IsUnsettable()
	 * @model
	 * @generated
	 */
	boolean isIsUnsettable();

	/**
	 * Sets the value of the '{@link Vmsc.VStructuralFeatures#isIsUnsettable <em>Is Unsettable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unsettable</em>' attribute.
	 * @see #isIsUnsettable()
	 * @generated
	 */
	void setIsUnsettable(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Volatile</em>' attribute.
	 * @see #setIsVolatile(boolean)
	 * @see Vmsc.VmscPackage#getVStructuralFeatures_IsVolatile()
	 * @model
	 * @generated
	 */
	boolean isIsVolatile();

	/**
	 * Sets the value of the '{@link Vmsc.VStructuralFeatures#isIsVolatile <em>Is Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Volatile</em>' attribute.
	 * @see #isIsVolatile()
	 * @generated
	 */
	void setIsVolatile(boolean value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(int)
	 * @see Vmsc.VmscPackage#getVStructuralFeatures_LowerBound()
	 * @model
	 * @generated
	 */
	int getLowerBound();

	/**
	 * Sets the value of the '{@link Vmsc.VStructuralFeatures#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(int value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(int)
	 * @see Vmsc.VmscPackage#getVStructuralFeatures_UpperBound()
	 * @model
	 * @generated
	 */
	int getUpperBound();

	/**
	 * Sets the value of the '{@link Vmsc.VStructuralFeatures#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(int value);

	/**
	 * Returns the value of the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Derived</em>' attribute.
	 * @see #setIsDerived(boolean)
	 * @see Vmsc.VmscPackage#getVStructuralFeatures_IsDerived()
	 * @model
	 * @generated
	 */
	boolean isIsDerived();

	/**
	 * Sets the value of the '{@link Vmsc.VStructuralFeatures#isIsDerived <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived</em>' attribute.
	 * @see #isIsDerived()
	 * @generated
	 */
	void setIsDerived(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Unique</em>' attribute.
	 * @see #setIsUnique(boolean)
	 * @see Vmsc.VmscPackage#getVStructuralFeatures_IsUnique()
	 * @model
	 * @generated
	 */
	boolean isIsUnique();

	/**
	 * Sets the value of the '{@link Vmsc.VStructuralFeatures#isIsUnique <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unique</em>' attribute.
	 * @see #isIsUnique()
	 * @generated
	 */
	void setIsUnique(boolean value);

} // VStructuralFeatures
