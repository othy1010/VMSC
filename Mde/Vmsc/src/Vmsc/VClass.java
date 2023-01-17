/**
 */
package Vmsc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Vmsc.VClass#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link Vmsc.VClass#isIsInterface <em>Is Interface</em>}</li>
 *   <li>{@link Vmsc.VClass#getVSuperType <em>VSuper Type</em>}</li>
 *   <li>{@link Vmsc.VClass#getVStructural_features <em>VStructural features</em>}</li>
 * </ul>
 *
 * @see Vmsc.VmscPackage#getVClass()
 * @model
 * @generated
 */
public interface VClass extends VStructuralComponent {
	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see Vmsc.VmscPackage#getVClass_IsAbstract()
	 * @model
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link Vmsc.VClass#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Interface</em>' attribute.
	 * @see #setIsInterface(boolean)
	 * @see Vmsc.VmscPackage#getVClass_IsInterface()
	 * @model
	 * @generated
	 */
	boolean isIsInterface();

	/**
	 * Sets the value of the '{@link Vmsc.VClass#isIsInterface <em>Is Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Interface</em>' attribute.
	 * @see #isIsInterface()
	 * @generated
	 */
	void setIsInterface(boolean value);

	/**
	 * Returns the value of the '<em><b>VSuper Type</b></em>' reference list.
	 * The list contents are of type {@link Vmsc.VClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VSuper Type</em>' reference list.
	 * @see Vmsc.VmscPackage#getVClass_VSuperType()
	 * @model
	 * @generated
	 */
	EList<VClass> getVSuperType();

	/**
	 * Returns the value of the '<em><b>VStructural features</b></em>' containment reference list.
	 * The list contents are of type {@link Vmsc.VStructuralFeatures}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VStructural features</em>' containment reference list.
	 * @see Vmsc.VmscPackage#getVClass_VStructural_features()
	 * @model containment="true"
	 * @generated
	 */
	EList<VStructuralFeatures> getVStructural_features();

} // VClass
