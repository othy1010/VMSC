/**
 */
package Vmsc.impl;

import Vmsc.VAttribute;
import Vmsc.VClass;
import Vmsc.VDatatype;
import Vmsc.VEnum;
import Vmsc.VFloat;
import Vmsc.VInt;
import Vmsc.VNamedElement;
import Vmsc.VPackage;
import Vmsc.VReference;
import Vmsc.VString;
import Vmsc.VStructuralComponent;
import Vmsc.VStructuralFeatures;
import Vmsc.VType;
import Vmsc.VmscFactory;
import Vmsc.VmscPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VmscPackageImpl extends EPackageImpl implements VmscPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vEnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vDatatypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vStructuralFeaturesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vStructuralComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vIntEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vFloatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vTypeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Vmsc.VmscPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VmscPackageImpl() {
		super(eNS_URI, VmscFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link VmscPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VmscPackage init() {
		if (isInited) return (VmscPackage)EPackage.Registry.INSTANCE.getEPackage(VmscPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredVmscPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		VmscPackageImpl theVmscPackage = registeredVmscPackage instanceof VmscPackageImpl ? (VmscPackageImpl)registeredVmscPackage : new VmscPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theVmscPackage.createPackageContents();

		// Initialize created meta-data
		theVmscPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVmscPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VmscPackage.eNS_URI, theVmscPackage);
		return theVmscPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVEnum() {
		return vEnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVNamedElement() {
		return vNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVNamedElement_Name() {
		return (EAttribute)vNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVDatatype() {
		return vDatatypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVDatatype_IsSerializable() {
		return (EAttribute)vDatatypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVPackage() {
		return vPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVPackage_VPrefix() {
		return (EAttribute)vPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVPackage_VUri() {
		return (EAttribute)vPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVPackage_VComponents() {
		return (EReference)vPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVClass() {
		return vClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVClass_IsAbstract() {
		return (EAttribute)vClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVClass_IsInterface() {
		return (EAttribute)vClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVClass_VSuperType() {
		return (EReference)vClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVClass_VStructural_features() {
		return (EReference)vClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVAttribute() {
		return vAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVAttribute_VType() {
		return (EReference)vAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVReference() {
		return vReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVReference_IsContainer() {
		return (EAttribute)vReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVReference_IsContainment() {
		return (EAttribute)vReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVReference_VType() {
		return (EReference)vReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVStructuralFeatures() {
		return vStructuralFeaturesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVStructuralFeatures_IsChangeable() {
		return (EAttribute)vStructuralFeaturesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVStructuralFeatures_IsOrdered() {
		return (EAttribute)vStructuralFeaturesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVStructuralFeatures_IsTransient() {
		return (EAttribute)vStructuralFeaturesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVStructuralFeatures_IsUnsettable() {
		return (EAttribute)vStructuralFeaturesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVStructuralFeatures_IsVolatile() {
		return (EAttribute)vStructuralFeaturesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVStructuralFeatures_LowerBound() {
		return (EAttribute)vStructuralFeaturesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVStructuralFeatures_UpperBound() {
		return (EAttribute)vStructuralFeaturesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVStructuralFeatures_IsDerived() {
		return (EAttribute)vStructuralFeaturesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVStructuralFeatures_IsUnique() {
		return (EAttribute)vStructuralFeaturesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVStructuralComponent() {
		return vStructuralComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVString() {
		return vStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVString_VContent() {
		return (EAttribute)vStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVInt() {
		return vIntEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVInt_VContent() {
		return (EAttribute)vIntEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVFloat() {
		return vFloatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVFloat_VContent() {
		return (EAttribute)vFloatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVType() {
		return vTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmscFactory getVmscFactory() {
		return (VmscFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		vEnumEClass = createEClass(VENUM);

		vNamedElementEClass = createEClass(VNAMED_ELEMENT);
		createEAttribute(vNamedElementEClass, VNAMED_ELEMENT__NAME);

		vDatatypeEClass = createEClass(VDATATYPE);
		createEAttribute(vDatatypeEClass, VDATATYPE__IS_SERIALIZABLE);

		vPackageEClass = createEClass(VPACKAGE);
		createEAttribute(vPackageEClass, VPACKAGE__VPREFIX);
		createEAttribute(vPackageEClass, VPACKAGE__VURI);
		createEReference(vPackageEClass, VPACKAGE__VCOMPONENTS);

		vClassEClass = createEClass(VCLASS);
		createEAttribute(vClassEClass, VCLASS__IS_ABSTRACT);
		createEAttribute(vClassEClass, VCLASS__IS_INTERFACE);
		createEReference(vClassEClass, VCLASS__VSUPER_TYPE);
		createEReference(vClassEClass, VCLASS__VSTRUCTURAL_FEATURES);

		vAttributeEClass = createEClass(VATTRIBUTE);
		createEReference(vAttributeEClass, VATTRIBUTE__VTYPE);

		vReferenceEClass = createEClass(VREFERENCE);
		createEAttribute(vReferenceEClass, VREFERENCE__IS_CONTAINER);
		createEAttribute(vReferenceEClass, VREFERENCE__IS_CONTAINMENT);
		createEReference(vReferenceEClass, VREFERENCE__VTYPE);

		vStructuralFeaturesEClass = createEClass(VSTRUCTURAL_FEATURES);
		createEAttribute(vStructuralFeaturesEClass, VSTRUCTURAL_FEATURES__IS_CHANGEABLE);
		createEAttribute(vStructuralFeaturesEClass, VSTRUCTURAL_FEATURES__IS_ORDERED);
		createEAttribute(vStructuralFeaturesEClass, VSTRUCTURAL_FEATURES__IS_TRANSIENT);
		createEAttribute(vStructuralFeaturesEClass, VSTRUCTURAL_FEATURES__IS_UNSETTABLE);
		createEAttribute(vStructuralFeaturesEClass, VSTRUCTURAL_FEATURES__IS_VOLATILE);
		createEAttribute(vStructuralFeaturesEClass, VSTRUCTURAL_FEATURES__LOWER_BOUND);
		createEAttribute(vStructuralFeaturesEClass, VSTRUCTURAL_FEATURES__UPPER_BOUND);
		createEAttribute(vStructuralFeaturesEClass, VSTRUCTURAL_FEATURES__IS_DERIVED);
		createEAttribute(vStructuralFeaturesEClass, VSTRUCTURAL_FEATURES__IS_UNIQUE);

		vStructuralComponentEClass = createEClass(VSTRUCTURAL_COMPONENT);

		vStringEClass = createEClass(VSTRING);
		createEAttribute(vStringEClass, VSTRING__VCONTENT);

		vIntEClass = createEClass(VINT);
		createEAttribute(vIntEClass, VINT__VCONTENT);

		vFloatEClass = createEClass(VFLOAT);
		createEAttribute(vFloatEClass, VFLOAT__VCONTENT);

		vTypeEClass = createEClass(VTYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		vEnumEClass.getESuperTypes().add(this.getVDatatype());
		vDatatypeEClass.getESuperTypes().add(this.getVStructuralComponent());
		vPackageEClass.getESuperTypes().add(this.getVStructuralComponent());
		vClassEClass.getESuperTypes().add(this.getVStructuralComponent());
		vAttributeEClass.getESuperTypes().add(this.getVStructuralFeatures());
		vReferenceEClass.getESuperTypes().add(this.getVStructuralFeatures());
		vStructuralFeaturesEClass.getESuperTypes().add(this.getVNamedElement());
		vStructuralComponentEClass.getESuperTypes().add(this.getVNamedElement());
		vStringEClass.getESuperTypes().add(this.getVType());
		vIntEClass.getESuperTypes().add(this.getVType());
		vFloatEClass.getESuperTypes().add(this.getVType());

		// Initialize classes, features, and operations; add parameters
		initEClass(vEnumEClass, VEnum.class, "VEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vNamedElementEClass, VNamedElement.class, "VNamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, VNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vDatatypeEClass, VDatatype.class, "VDatatype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVDatatype_IsSerializable(), ecorePackage.getEBoolean(), "IsSerializable", null, 0, 1, VDatatype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vPackageEClass, VPackage.class, "VPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVPackage_VPrefix(), ecorePackage.getEString(), "VPrefix", null, 0, 1, VPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVPackage_VUri(), ecorePackage.getEString(), "VUri", null, 0, 1, VPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVPackage_VComponents(), this.getVStructuralComponent(), null, "VComponents", null, 0, -1, VPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vClassEClass, VClass.class, "VClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVClass_IsAbstract(), ecorePackage.getEBoolean(), "IsAbstract", null, 0, 1, VClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVClass_IsInterface(), ecorePackage.getEBoolean(), "IsInterface", null, 0, 1, VClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVClass_VSuperType(), this.getVClass(), null, "VSuperType", null, 0, -1, VClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVClass_VStructural_features(), this.getVStructuralFeatures(), null, "VStructural_features", null, 0, -1, VClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vAttributeEClass, VAttribute.class, "VAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVAttribute_VType(), this.getVType(), null, "VType", null, 0, 1, VAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vReferenceEClass, VReference.class, "VReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVReference_IsContainer(), ecorePackage.getEBoolean(), "IsContainer", null, 0, 1, VReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVReference_IsContainment(), ecorePackage.getEBoolean(), "IsContainment", null, 0, 1, VReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVReference_VType(), this.getVClass(), null, "VType", null, 0, 1, VReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vStructuralFeaturesEClass, VStructuralFeatures.class, "VStructuralFeatures", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVStructuralFeatures_IsChangeable(), ecorePackage.getEBoolean(), "IsChangeable", null, 0, 1, VStructuralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVStructuralFeatures_IsOrdered(), ecorePackage.getEBoolean(), "IsOrdered", null, 0, 1, VStructuralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVStructuralFeatures_IsTransient(), ecorePackage.getEBoolean(), "IsTransient", null, 0, 1, VStructuralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVStructuralFeatures_IsUnsettable(), ecorePackage.getEBoolean(), "IsUnsettable", null, 0, 1, VStructuralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVStructuralFeatures_IsVolatile(), ecorePackage.getEBoolean(), "IsVolatile", null, 0, 1, VStructuralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVStructuralFeatures_LowerBound(), ecorePackage.getEInt(), "LowerBound", null, 0, 1, VStructuralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVStructuralFeatures_UpperBound(), ecorePackage.getEInt(), "UpperBound", null, 0, 1, VStructuralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVStructuralFeatures_IsDerived(), ecorePackage.getEBoolean(), "IsDerived", null, 0, 1, VStructuralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVStructuralFeatures_IsUnique(), ecorePackage.getEBoolean(), "IsUnique", null, 0, 1, VStructuralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vStructuralComponentEClass, VStructuralComponent.class, "VStructuralComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vStringEClass, VString.class, "VString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVString_VContent(), ecorePackage.getEString(), "VContent", null, 0, 1, VString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vIntEClass, VInt.class, "VInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVInt_VContent(), ecorePackage.getEInt(), "VContent", null, 0, 1, VInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vFloatEClass, VFloat.class, "VFloat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVFloat_VContent(), ecorePackage.getEFloat(), "VContent", null, 0, 1, VFloat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vTypeEClass, VType.class, "VType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //VmscPackageImpl
