/**
 */
package Vmsc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VReference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Vmsc.VReference#isIsContainer <em>Is Container</em>}</li>
 *   <li>{@link Vmsc.VReference#isIsContainment <em>Is Containment</em>}</li>
 *   <li>{@link Vmsc.VReference#getVType <em>VType</em>}</li>
 * </ul>
 *
 * @see Vmsc.VmscPackage#getVReference()
 * @model
 * @generated
 */
public interface VReference extends VStructuralFeatures {
	/**
	 * Returns the value of the '<em><b>Is Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Container</em>' attribute.
	 * @see #setIsContainer(boolean)
	 * @see Vmsc.VmscPackage#getVReference_IsContainer()
	 * @model
	 * @generated
	 */
	boolean isIsContainer();

	/**
	 * Sets the value of the '{@link Vmsc.VReference#isIsContainer <em>Is Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Container</em>' attribute.
	 * @see #isIsContainer()
	 * @generated
	 */
	void setIsContainer(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Containment</em>' attribute.
	 * @see #setIsContainment(boolean)
	 * @see Vmsc.VmscPackage#getVReference_IsContainment()
	 * @model
	 * @generated
	 */
	boolean isIsContainment();

	/**
	 * Sets the value of the '{@link Vmsc.VReference#isIsContainment <em>Is Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Containment</em>' attribute.
	 * @see #isIsContainment()
	 * @generated
	 */
	void setIsContainment(boolean value);

	/**
	 * Returns the value of the '<em><b>VType</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VType</em>' containment reference.
	 * @see #setVType(VClass)
	 * @see Vmsc.VmscPackage#getVReference_VType()
	 * @model containment="true"
	 * @generated
	 */
	VClass getVType();

	/**
	 * Sets the value of the '{@link Vmsc.VReference#getVType <em>VType</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VType</em>' containment reference.
	 * @see #getVType()
	 * @generated
	 */
	void setVType(VClass value);

} // VReference
