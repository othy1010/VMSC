/**
 */
package Vmsc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VAttribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Vmsc.VAttribute#getVType <em>VType</em>}</li>
 * </ul>
 *
 * @see Vmsc.VmscPackage#getVAttribute()
 * @model
 * @generated
 */
public interface VAttribute extends VStructuralFeatures {
	/**
	 * Returns the value of the '<em><b>VType</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VType</em>' containment reference.
	 * @see #setVType(VType)
	 * @see Vmsc.VmscPackage#getVAttribute_VType()
	 * @model containment="true"
	 * @generated
	 */
	VType getVType();

	/**
	 * Sets the value of the '{@link Vmsc.VAttribute#getVType <em>VType</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VType</em>' containment reference.
	 * @see #getVType()
	 * @generated
	 */
	void setVType(VType value);

} // VAttribute
