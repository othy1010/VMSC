/**
 */
package Vmsc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Vmsc.VmscFactory
 * @model kind="package"
 * @generated
 */
public interface VmscPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Vmsc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.Vmsc.gen";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Vmsc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VmscPackage eINSTANCE = Vmsc.impl.VmscPackageImpl.init();

	/**
	 * The meta object id for the '{@link Vmsc.impl.VNamedElementImpl <em>VNamed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Vmsc.impl.VNamedElementImpl
	 * @see Vmsc.impl.VmscPackageImpl#getVNamedElement()
	 * @generated
	 */
	int VNAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VNAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>VNamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VNAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>VNamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VNAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Vmsc.impl.VStructuralComponentImpl <em>VStructural Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Vmsc.impl.VStructuralComponentImpl
	 * @see Vmsc.impl.VmscPackageImpl#getVStructuralComponent()
	 * @generated
	 */
	int VSTRUCTURAL_COMPONENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSTRUCTURAL_COMPONENT__NAME = VNAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>VStructural Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSTRUCTURAL_COMPONENT_FEATURE_COUNT = VNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VStructural Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSTRUCTURAL_COMPONENT_OPERATION_COUNT = VNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Vmsc.impl.VDatatypeImpl <em>VDatatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Vmsc.impl.VDatatypeImpl
	 * @see Vmsc.impl.VmscPackageImpl#getVDatatype()
	 * @generated
	 */
	int VDATATYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDATATYPE__NAME = VSTRUCTURAL_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Serializable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDATATYPE__IS_SERIALIZABLE = VSTRUCTURAL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VDatatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDATATYPE_FEATURE_COUNT = VSTRUCTURAL_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VDatatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDATATYPE_OPERATION_COUNT = VSTRUCTURAL_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Vmsc.impl.VEnumImpl <em>VEnum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Vmsc.impl.VEnumImpl
	 * @see Vmsc.impl.VmscPackageImpl#getVEnum()
	 * @generated
	 */
	int VENUM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENUM__NAME = VDATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Is Serializable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENUM__IS_SERIALIZABLE = VDATATYPE__IS_SERIALIZABLE;

	/**
	 * The number of structural features of the '<em>VEnum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENUM_FEATURE_COUNT = VDATATYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VEnum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENUM_OPERATION_COUNT = VDATATYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Vmsc.impl.VPackageImpl <em>VPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Vmsc.impl.VPackageImpl
	 * @see Vmsc.impl.VmscPackageImpl#getVPackage()
	 * @generated
	 */
	int VPACKAGE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPACKAGE__NAME = VSTRUCTURAL_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>VPrefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPACKAGE__VPREFIX = VSTRUCTURAL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>VUri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPACKAGE__VURI = VSTRUCTURAL_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>VComponents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPACKAGE__VCOMPONENTS = VSTRUCTURAL_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>VPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPACKAGE_FEATURE_COUNT = VSTRUCTURAL_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>VPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPACKAGE_OPERATION_COUNT = VSTRUCTURAL_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Vmsc.impl.VClassImpl <em>VClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Vmsc.impl.VClassImpl
	 * @see Vmsc.impl.VmscPackageImpl#getVClass()
	 * @generated
	 */
	int VCLASS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCLASS__NAME = VSTRUCTURAL_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCLASS__IS_ABSTRACT = VSTRUCTURAL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCLASS__IS_INTERFACE = VSTRUCTURAL_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>VSuper Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCLASS__VSUPER_TYPE = VSTRUCTURAL_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>VStructural features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCLASS__VSTRUCTURAL_FEATURES = VSTRUCTURAL_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>VClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCLASS_FEATURE_COUNT = VSTRUCTURAL_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>VClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCLASS_OPERATION_COUNT = VSTRUCTURAL_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Vmsc.impl.VStructuralFeaturesImpl <em>VStructural Features</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Vmsc.impl.VStructuralFeaturesImpl
	 * @see Vmsc.impl.VmscPackageImpl#getVStructuralFeatures()
	 * @generated
	 */
	int VSTRUCTURAL_FEATURES = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSTRUCTURAL_FEATURES__NAME = VNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSTRUCTURAL_FEATURES__IS_CHANGEABLE = VNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSTRUCTURAL_FEATURES__IS_ORDERED = VNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSTRUCTURAL_FEATURES__IS_TRANSIENT = VNAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Unsettable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSTRUCTURAL_FEATURES__IS_UNSETTABLE = VNAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSTRUCTURAL_FEATURES__IS_VOLATILE = VNAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSTRUCTURAL_FEATURES__LOWER_BOUND = VNAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSTRUCTURAL_FEATURES__UPPER_BOUND = VNAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSTRUCTURAL_FEATURES__IS_DERIVED = VNAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSTRUCTURAL_FEATURES__IS_UNIQUE = VNAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>VStructural Features</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSTRUCTURAL_FEATURES_FEATURE_COUNT = VNAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>VStructural Features</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSTRUCTURAL_FEATURES_OPERATION_COUNT = VNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Vmsc.impl.VAttributeImpl <em>VAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Vmsc.impl.VAttributeImpl
	 * @see Vmsc.impl.VmscPackageImpl#getVAttribute()
	 * @generated
	 */
	int VATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VATTRIBUTE__NAME = VSTRUCTURAL_FEATURES__NAME;

	/**
	 * The feature id for the '<em><b>Is Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VATTRIBUTE__IS_CHANGEABLE = VSTRUCTURAL_FEATURES__IS_CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VATTRIBUTE__IS_ORDERED = VSTRUCTURAL_FEATURES__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VATTRIBUTE__IS_TRANSIENT = VSTRUCTURAL_FEATURES__IS_TRANSIENT;

	/**
	 * The feature id for the '<em><b>Is Unsettable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VATTRIBUTE__IS_UNSETTABLE = VSTRUCTURAL_FEATURES__IS_UNSETTABLE;

	/**
	 * The feature id for the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VATTRIBUTE__IS_VOLATILE = VSTRUCTURAL_FEATURES__IS_VOLATILE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VATTRIBUTE__LOWER_BOUND = VSTRUCTURAL_FEATURES__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VATTRIBUTE__UPPER_BOUND = VSTRUCTURAL_FEATURES__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VATTRIBUTE__IS_DERIVED = VSTRUCTURAL_FEATURES__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VATTRIBUTE__IS_UNIQUE = VSTRUCTURAL_FEATURES__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>VType</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VATTRIBUTE__VTYPE = VSTRUCTURAL_FEATURES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VATTRIBUTE_FEATURE_COUNT = VSTRUCTURAL_FEATURES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VATTRIBUTE_OPERATION_COUNT = VSTRUCTURAL_FEATURES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Vmsc.impl.VReferenceImpl <em>VReference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Vmsc.impl.VReferenceImpl
	 * @see Vmsc.impl.VmscPackageImpl#getVReference()
	 * @generated
	 */
	int VREFERENCE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VREFERENCE__NAME = VSTRUCTURAL_FEATURES__NAME;

	/**
	 * The feature id for the '<em><b>Is Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VREFERENCE__IS_CHANGEABLE = VSTRUCTURAL_FEATURES__IS_CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VREFERENCE__IS_ORDERED = VSTRUCTURAL_FEATURES__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VREFERENCE__IS_TRANSIENT = VSTRUCTURAL_FEATURES__IS_TRANSIENT;

	/**
	 * The feature id for the '<em><b>Is Unsettable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VREFERENCE__IS_UNSETTABLE = VSTRUCTURAL_FEATURES__IS_UNSETTABLE;

	/**
	 * The feature id for the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VREFERENCE__IS_VOLATILE = VSTRUCTURAL_FEATURES__IS_VOLATILE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VREFERENCE__LOWER_BOUND = VSTRUCTURAL_FEATURES__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VREFERENCE__UPPER_BOUND = VSTRUCTURAL_FEATURES__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VREFERENCE__IS_DERIVED = VSTRUCTURAL_FEATURES__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VREFERENCE__IS_UNIQUE = VSTRUCTURAL_FEATURES__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Is Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VREFERENCE__IS_CONTAINER = VSTRUCTURAL_FEATURES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VREFERENCE__IS_CONTAINMENT = VSTRUCTURAL_FEATURES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>VType</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VREFERENCE__VTYPE = VSTRUCTURAL_FEATURES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>VReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VREFERENCE_FEATURE_COUNT = VSTRUCTURAL_FEATURES_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>VReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VREFERENCE_OPERATION_COUNT = VSTRUCTURAL_FEATURES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Vmsc.impl.VTypeImpl <em>VType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Vmsc.impl.VTypeImpl
	 * @see Vmsc.impl.VmscPackageImpl#getVType()
	 * @generated
	 */
	int VTYPE = 12;

	/**
	 * The number of structural features of the '<em>VType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>VType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Vmsc.impl.VStringImpl <em>VString</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Vmsc.impl.VStringImpl
	 * @see Vmsc.impl.VmscPackageImpl#getVString()
	 * @generated
	 */
	int VSTRING = 9;

	/**
	 * The feature id for the '<em><b>VContent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSTRING__VCONTENT = VTYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VString</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSTRING_FEATURE_COUNT = VTYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VString</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSTRING_OPERATION_COUNT = VTYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Vmsc.impl.VIntImpl <em>VInt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Vmsc.impl.VIntImpl
	 * @see Vmsc.impl.VmscPackageImpl#getVInt()
	 * @generated
	 */
	int VINT = 10;

	/**
	 * The feature id for the '<em><b>VContent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VINT__VCONTENT = VTYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VInt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VINT_FEATURE_COUNT = VTYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VInt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VINT_OPERATION_COUNT = VTYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Vmsc.impl.VFloatImpl <em>VFloat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Vmsc.impl.VFloatImpl
	 * @see Vmsc.impl.VmscPackageImpl#getVFloat()
	 * @generated
	 */
	int VFLOAT = 11;

	/**
	 * The feature id for the '<em><b>VContent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VFLOAT__VCONTENT = VTYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VFloat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VFLOAT_FEATURE_COUNT = VTYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VFloat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VFLOAT_OPERATION_COUNT = VTYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link Vmsc.VEnum <em>VEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VEnum</em>'.
	 * @see Vmsc.VEnum
	 * @generated
	 */
	EClass getVEnum();

	/**
	 * Returns the meta object for class '{@link Vmsc.VNamedElement <em>VNamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VNamed Element</em>'.
	 * @see Vmsc.VNamedElement
	 * @generated
	 */
	EClass getVNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link Vmsc.VNamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Vmsc.VNamedElement#getName()
	 * @see #getVNamedElement()
	 * @generated
	 */
	EAttribute getVNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link Vmsc.VDatatype <em>VDatatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VDatatype</em>'.
	 * @see Vmsc.VDatatype
	 * @generated
	 */
	EClass getVDatatype();

	/**
	 * Returns the meta object for the attribute '{@link Vmsc.VDatatype#isIsSerializable <em>Is Serializable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Serializable</em>'.
	 * @see Vmsc.VDatatype#isIsSerializable()
	 * @see #getVDatatype()
	 * @generated
	 */
	EAttribute getVDatatype_IsSerializable();

	/**
	 * Returns the meta object for class '{@link Vmsc.VPackage <em>VPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VPackage</em>'.
	 * @see Vmsc.VPackage
	 * @generated
	 */
	EClass getVPackage();

	/**
	 * Returns the meta object for the attribute '{@link Vmsc.VPackage#getVPrefix <em>VPrefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>VPrefix</em>'.
	 * @see Vmsc.VPackage#getVPrefix()
	 * @see #getVPackage()
	 * @generated
	 */
	EAttribute getVPackage_VPrefix();

	/**
	 * Returns the meta object for the attribute '{@link Vmsc.VPackage#getVUri <em>VUri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>VUri</em>'.
	 * @see Vmsc.VPackage#getVUri()
	 * @see #getVPackage()
	 * @generated
	 */
	EAttribute getVPackage_VUri();

	/**
	 * Returns the meta object for the containment reference list '{@link Vmsc.VPackage#getVComponents <em>VComponents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>VComponents</em>'.
	 * @see Vmsc.VPackage#getVComponents()
	 * @see #getVPackage()
	 * @generated
	 */
	EReference getVPackage_VComponents();

	/**
	 * Returns the meta object for class '{@link Vmsc.VClass <em>VClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VClass</em>'.
	 * @see Vmsc.VClass
	 * @generated
	 */
	EClass getVClass();

	/**
	 * Returns the meta object for the attribute '{@link Vmsc.VClass#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see Vmsc.VClass#isIsAbstract()
	 * @see #getVClass()
	 * @generated
	 */
	EAttribute getVClass_IsAbstract();

	/**
	 * Returns the meta object for the attribute '{@link Vmsc.VClass#isIsInterface <em>Is Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Interface</em>'.
	 * @see Vmsc.VClass#isIsInterface()
	 * @see #getVClass()
	 * @generated
	 */
	EAttribute getVClass_IsInterface();

	/**
	 * Returns the meta object for the reference list '{@link Vmsc.VClass#getVSuperType <em>VSuper Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>VSuper Type</em>'.
	 * @see Vmsc.VClass#getVSuperType()
	 * @see #getVClass()
	 * @generated
	 */
	EReference getVClass_VSuperType();

	/**
	 * Returns the meta object for the containment reference list '{@link Vmsc.VClass#getVStructural_features <em>VStructural features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>VStructural features</em>'.
	 * @see Vmsc.VClass#getVStructural_features()
	 * @see #getVClass()
	 * @generated
	 */
	EReference getVClass_VStructural_features();

	/**
	 * Returns the meta object for class '{@link Vmsc.VAttribute <em>VAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VAttribute</em>'.
	 * @see Vmsc.VAttribute
	 * @generated
	 */
	EClass getVAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link Vmsc.VAttribute#getVType <em>VType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>VType</em>'.
	 * @see Vmsc.VAttribute#getVType()
	 * @see #getVAttribute()
	 * @generated
	 */
	EReference getVAttribute_VType();

	/**
	 * Returns the meta object for class '{@link Vmsc.VReference <em>VReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VReference</em>'.
	 * @see Vmsc.VReference
	 * @generated
	 */
	EClass getVReference();

	/**
	 * Returns the meta object for the attribute '{@link Vmsc.VReference#isIsContainer <em>Is Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Container</em>'.
	 * @see Vmsc.VReference#isIsContainer()
	 * @see #getVReference()
	 * @generated
	 */
	EAttribute getVReference_IsContainer();

	/**
	 * Returns the meta object for the attribute '{@link Vmsc.VReference#isIsContainment <em>Is Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Containment</em>'.
	 * @see Vmsc.VReference#isIsContainment()
	 * @see #getVReference()
	 * @generated
	 */
	EAttribute getVReference_IsContainment();

	/**
	 * Returns the meta object for the containment reference '{@link Vmsc.VReference#getVType <em>VType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>VType</em>'.
	 * @see Vmsc.VReference#getVType()
	 * @see #getVReference()
	 * @generated
	 */
	EReference getVReference_VType();

	/**
	 * Returns the meta object for class '{@link Vmsc.VStructuralFeatures <em>VStructural Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VStructural Features</em>'.
	 * @see Vmsc.VStructuralFeatures
	 * @generated
	 */
	EClass getVStructuralFeatures();

	/**
	 * Returns the meta object for the attribute '{@link Vmsc.VStructuralFeatures#isIsChangeable <em>Is Changeable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Changeable</em>'.
	 * @see Vmsc.VStructuralFeatures#isIsChangeable()
	 * @see #getVStructuralFeatures()
	 * @generated
	 */
	EAttribute getVStructuralFeatures_IsChangeable();

	/**
	 * Returns the meta object for the attribute '{@link Vmsc.VStructuralFeatures#isIsOrdered <em>Is Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ordered</em>'.
	 * @see Vmsc.VStructuralFeatures#isIsOrdered()
	 * @see #getVStructuralFeatures()
	 * @generated
	 */
	EAttribute getVStructuralFeatures_IsOrdered();

	/**
	 * Returns the meta object for the attribute '{@link Vmsc.VStructuralFeatures#isIsTransient <em>Is Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Transient</em>'.
	 * @see Vmsc.VStructuralFeatures#isIsTransient()
	 * @see #getVStructuralFeatures()
	 * @generated
	 */
	EAttribute getVStructuralFeatures_IsTransient();

	/**
	 * Returns the meta object for the attribute '{@link Vmsc.VStructuralFeatures#isIsUnsettable <em>Is Unsettable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unsettable</em>'.
	 * @see Vmsc.VStructuralFeatures#isIsUnsettable()
	 * @see #getVStructuralFeatures()
	 * @generated
	 */
	EAttribute getVStructuralFeatures_IsUnsettable();

	/**
	 * Returns the meta object for the attribute '{@link Vmsc.VStructuralFeatures#isIsVolatile <em>Is Volatile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Volatile</em>'.
	 * @see Vmsc.VStructuralFeatures#isIsVolatile()
	 * @see #getVStructuralFeatures()
	 * @generated
	 */
	EAttribute getVStructuralFeatures_IsVolatile();

	/**
	 * Returns the meta object for the attribute '{@link Vmsc.VStructuralFeatures#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see Vmsc.VStructuralFeatures#getLowerBound()
	 * @see #getVStructuralFeatures()
	 * @generated
	 */
	EAttribute getVStructuralFeatures_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link Vmsc.VStructuralFeatures#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see Vmsc.VStructuralFeatures#getUpperBound()
	 * @see #getVStructuralFeatures()
	 * @generated
	 */
	EAttribute getVStructuralFeatures_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link Vmsc.VStructuralFeatures#isIsDerived <em>Is Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Derived</em>'.
	 * @see Vmsc.VStructuralFeatures#isIsDerived()
	 * @see #getVStructuralFeatures()
	 * @generated
	 */
	EAttribute getVStructuralFeatures_IsDerived();

	/**
	 * Returns the meta object for the attribute '{@link Vmsc.VStructuralFeatures#isIsUnique <em>Is Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unique</em>'.
	 * @see Vmsc.VStructuralFeatures#isIsUnique()
	 * @see #getVStructuralFeatures()
	 * @generated
	 */
	EAttribute getVStructuralFeatures_IsUnique();

	/**
	 * Returns the meta object for class '{@link Vmsc.VStructuralComponent <em>VStructural Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VStructural Component</em>'.
	 * @see Vmsc.VStructuralComponent
	 * @generated
	 */
	EClass getVStructuralComponent();

	/**
	 * Returns the meta object for class '{@link Vmsc.VString <em>VString</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VString</em>'.
	 * @see Vmsc.VString
	 * @generated
	 */
	EClass getVString();

	/**
	 * Returns the meta object for the attribute '{@link Vmsc.VString#getVContent <em>VContent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>VContent</em>'.
	 * @see Vmsc.VString#getVContent()
	 * @see #getVString()
	 * @generated
	 */
	EAttribute getVString_VContent();

	/**
	 * Returns the meta object for class '{@link Vmsc.VInt <em>VInt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VInt</em>'.
	 * @see Vmsc.VInt
	 * @generated
	 */
	EClass getVInt();

	/**
	 * Returns the meta object for the attribute '{@link Vmsc.VInt#getVContent <em>VContent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>VContent</em>'.
	 * @see Vmsc.VInt#getVContent()
	 * @see #getVInt()
	 * @generated
	 */
	EAttribute getVInt_VContent();

	/**
	 * Returns the meta object for class '{@link Vmsc.VFloat <em>VFloat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VFloat</em>'.
	 * @see Vmsc.VFloat
	 * @generated
	 */
	EClass getVFloat();

	/**
	 * Returns the meta object for the attribute '{@link Vmsc.VFloat#getVContent <em>VContent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>VContent</em>'.
	 * @see Vmsc.VFloat#getVContent()
	 * @see #getVFloat()
	 * @generated
	 */
	EAttribute getVFloat_VContent();

	/**
	 * Returns the meta object for class '{@link Vmsc.VType <em>VType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VType</em>'.
	 * @see Vmsc.VType
	 * @generated
	 */
	EClass getVType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VmscFactory getVmscFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Vmsc.impl.VEnumImpl <em>VEnum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Vmsc.impl.VEnumImpl
		 * @see Vmsc.impl.VmscPackageImpl#getVEnum()
		 * @generated
		 */
		EClass VENUM = eINSTANCE.getVEnum();

		/**
		 * The meta object literal for the '{@link Vmsc.impl.VNamedElementImpl <em>VNamed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Vmsc.impl.VNamedElementImpl
		 * @see Vmsc.impl.VmscPackageImpl#getVNamedElement()
		 * @generated
		 */
		EClass VNAMED_ELEMENT = eINSTANCE.getVNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VNAMED_ELEMENT__NAME = eINSTANCE.getVNamedElement_Name();

		/**
		 * The meta object literal for the '{@link Vmsc.impl.VDatatypeImpl <em>VDatatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Vmsc.impl.VDatatypeImpl
		 * @see Vmsc.impl.VmscPackageImpl#getVDatatype()
		 * @generated
		 */
		EClass VDATATYPE = eINSTANCE.getVDatatype();

		/**
		 * The meta object literal for the '<em><b>Is Serializable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VDATATYPE__IS_SERIALIZABLE = eINSTANCE.getVDatatype_IsSerializable();

		/**
		 * The meta object literal for the '{@link Vmsc.impl.VPackageImpl <em>VPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Vmsc.impl.VPackageImpl
		 * @see Vmsc.impl.VmscPackageImpl#getVPackage()
		 * @generated
		 */
		EClass VPACKAGE = eINSTANCE.getVPackage();

		/**
		 * The meta object literal for the '<em><b>VPrefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPACKAGE__VPREFIX = eINSTANCE.getVPackage_VPrefix();

		/**
		 * The meta object literal for the '<em><b>VUri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPACKAGE__VURI = eINSTANCE.getVPackage_VUri();

		/**
		 * The meta object literal for the '<em><b>VComponents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VPACKAGE__VCOMPONENTS = eINSTANCE.getVPackage_VComponents();

		/**
		 * The meta object literal for the '{@link Vmsc.impl.VClassImpl <em>VClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Vmsc.impl.VClassImpl
		 * @see Vmsc.impl.VmscPackageImpl#getVClass()
		 * @generated
		 */
		EClass VCLASS = eINSTANCE.getVClass();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VCLASS__IS_ABSTRACT = eINSTANCE.getVClass_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Is Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VCLASS__IS_INTERFACE = eINSTANCE.getVClass_IsInterface();

		/**
		 * The meta object literal for the '<em><b>VSuper Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VCLASS__VSUPER_TYPE = eINSTANCE.getVClass_VSuperType();

		/**
		 * The meta object literal for the '<em><b>VStructural features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VCLASS__VSTRUCTURAL_FEATURES = eINSTANCE.getVClass_VStructural_features();

		/**
		 * The meta object literal for the '{@link Vmsc.impl.VAttributeImpl <em>VAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Vmsc.impl.VAttributeImpl
		 * @see Vmsc.impl.VmscPackageImpl#getVAttribute()
		 * @generated
		 */
		EClass VATTRIBUTE = eINSTANCE.getVAttribute();

		/**
		 * The meta object literal for the '<em><b>VType</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VATTRIBUTE__VTYPE = eINSTANCE.getVAttribute_VType();

		/**
		 * The meta object literal for the '{@link Vmsc.impl.VReferenceImpl <em>VReference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Vmsc.impl.VReferenceImpl
		 * @see Vmsc.impl.VmscPackageImpl#getVReference()
		 * @generated
		 */
		EClass VREFERENCE = eINSTANCE.getVReference();

		/**
		 * The meta object literal for the '<em><b>Is Container</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VREFERENCE__IS_CONTAINER = eINSTANCE.getVReference_IsContainer();

		/**
		 * The meta object literal for the '<em><b>Is Containment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VREFERENCE__IS_CONTAINMENT = eINSTANCE.getVReference_IsContainment();

		/**
		 * The meta object literal for the '<em><b>VType</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VREFERENCE__VTYPE = eINSTANCE.getVReference_VType();

		/**
		 * The meta object literal for the '{@link Vmsc.impl.VStructuralFeaturesImpl <em>VStructural Features</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Vmsc.impl.VStructuralFeaturesImpl
		 * @see Vmsc.impl.VmscPackageImpl#getVStructuralFeatures()
		 * @generated
		 */
		EClass VSTRUCTURAL_FEATURES = eINSTANCE.getVStructuralFeatures();

		/**
		 * The meta object literal for the '<em><b>Is Changeable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSTRUCTURAL_FEATURES__IS_CHANGEABLE = eINSTANCE.getVStructuralFeatures_IsChangeable();

		/**
		 * The meta object literal for the '<em><b>Is Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSTRUCTURAL_FEATURES__IS_ORDERED = eINSTANCE.getVStructuralFeatures_IsOrdered();

		/**
		 * The meta object literal for the '<em><b>Is Transient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSTRUCTURAL_FEATURES__IS_TRANSIENT = eINSTANCE.getVStructuralFeatures_IsTransient();

		/**
		 * The meta object literal for the '<em><b>Is Unsettable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSTRUCTURAL_FEATURES__IS_UNSETTABLE = eINSTANCE.getVStructuralFeatures_IsUnsettable();

		/**
		 * The meta object literal for the '<em><b>Is Volatile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSTRUCTURAL_FEATURES__IS_VOLATILE = eINSTANCE.getVStructuralFeatures_IsVolatile();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSTRUCTURAL_FEATURES__LOWER_BOUND = eINSTANCE.getVStructuralFeatures_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSTRUCTURAL_FEATURES__UPPER_BOUND = eINSTANCE.getVStructuralFeatures_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Is Derived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSTRUCTURAL_FEATURES__IS_DERIVED = eINSTANCE.getVStructuralFeatures_IsDerived();

		/**
		 * The meta object literal for the '<em><b>Is Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSTRUCTURAL_FEATURES__IS_UNIQUE = eINSTANCE.getVStructuralFeatures_IsUnique();

		/**
		 * The meta object literal for the '{@link Vmsc.impl.VStructuralComponentImpl <em>VStructural Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Vmsc.impl.VStructuralComponentImpl
		 * @see Vmsc.impl.VmscPackageImpl#getVStructuralComponent()
		 * @generated
		 */
		EClass VSTRUCTURAL_COMPONENT = eINSTANCE.getVStructuralComponent();

		/**
		 * The meta object literal for the '{@link Vmsc.impl.VStringImpl <em>VString</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Vmsc.impl.VStringImpl
		 * @see Vmsc.impl.VmscPackageImpl#getVString()
		 * @generated
		 */
		EClass VSTRING = eINSTANCE.getVString();

		/**
		 * The meta object literal for the '<em><b>VContent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSTRING__VCONTENT = eINSTANCE.getVString_VContent();

		/**
		 * The meta object literal for the '{@link Vmsc.impl.VIntImpl <em>VInt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Vmsc.impl.VIntImpl
		 * @see Vmsc.impl.VmscPackageImpl#getVInt()
		 * @generated
		 */
		EClass VINT = eINSTANCE.getVInt();

		/**
		 * The meta object literal for the '<em><b>VContent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VINT__VCONTENT = eINSTANCE.getVInt_VContent();

		/**
		 * The meta object literal for the '{@link Vmsc.impl.VFloatImpl <em>VFloat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Vmsc.impl.VFloatImpl
		 * @see Vmsc.impl.VmscPackageImpl#getVFloat()
		 * @generated
		 */
		EClass VFLOAT = eINSTANCE.getVFloat();

		/**
		 * The meta object literal for the '<em><b>VContent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VFLOAT__VCONTENT = eINSTANCE.getVFloat_VContent();

		/**
		 * The meta object literal for the '{@link Vmsc.impl.VTypeImpl <em>VType</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Vmsc.impl.VTypeImpl
		 * @see Vmsc.impl.VmscPackageImpl#getVType()
		 * @generated
		 */
		EClass VTYPE = eINSTANCE.getVType();

	}

} //VmscPackage
