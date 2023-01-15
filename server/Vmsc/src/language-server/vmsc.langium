grammar Vmsc


entry VModel:
	'{'
	'"id"' ':' id=ID ','
	'"name"' ':' name=ID ','
	('"VPackages"' ':' '[' '{' VPackage+=VPackage '}' ( ',' '{' VPackage+=VPackage '}')* ']' )?
	 '}';

VPackage:
	'"VPackage"'
	':' 
	'{' 
	'"id"' ':' id=ID ','
	'"name"' ':' name=ID ','
	('"VPrefix"' ':' VPrefix=ID	',')?
	('"VUri"' ':' VUri=ID ',')?
	('"VComponents"' ':' '[' '{' VComponents+=VStructuralComponent '}' ( ',' '{' VComponents+=VStructuralComponent '}')* ']' )?
  '}';

VStructuralComponent:
	VEnum | VDatatype | VPackage | VClass;


VStructuralFeatures:
	VAttribute | VReference;

// VType:
// 	VString | VInt | VFloat;


VEnum:
	'"VEnum"' ':'
	'{'
	'"id"' ':' id=ID ','
	'"name"' ':' name=ID ','
	('"VAnnotations"' ':' '[' '{' VAnnotations+=VAnnotation '}' ( ',' '{' VAnnotations+=VAnnotation '}')* ']' ',')?
	('"VEnumLiterals"' ':' '[' '{' VEnumLiterals+=VLiteral '}' ( ',' '{' VEnumLiterals+=VLiteral '}')* ']' ',')?
	(IsSerializable?='"IsSerializable"' ':' 'True' ',')?
	 '}'
;

VDatatype:
	'"VDatatype"' ':' 
	'{'
	'"id"' ':' id=ID ','
	'"name"' ':' name=ID ','
	('"VAnnotations"' ':' '[' '{' VAnnotations+=VAnnotation '}' ( ',' '{' VAnnotations+=VAnnotation '}')* ']' ',')?
	(IsSerializable?='"IsSerializable"' ':' 'True' ','?)?
	 '}'
;

VClass:
	'"VClass"' ':'
	'{'
	'"id"' ':' id=ID ','
	'"name"' ':' name=ID ','
	('"VStructuralFeatures"' ':' '[' '{' VStructuralFeatures+=VStructuralFeatures '}' ( ',' '{' VStructuralFeatures+=VStructuralFeatures '}')*  ']' ',')? 
	('"VSuperType"' ':' '['  VSuperType+=[VClass:ID] ( ',' VSuperType+=[VClass:ID])* ']' ',')? 
	('"VOperations"' ':' '[' '{' VOperations+=VOperation '}' ( ',' '{' VOperations+=VOperation '}')* ']' ',')?
	('"VAnnotations"' ':' '[' '{' VAnnotations+=VAnnotation '}' ( ',' '{' VAnnotations+=VAnnotation '}')* ']' ',')?
	(IsAbstract?='"IsAbstract"' ':' 'True' ',')?
	(IsInterface?='"IsInterface"' ':' 'True' ',')?
	 '}';




VAttribute:
	'"VAttribute"' ':'
	'{'
	'"id"' ':' id=ID ','
	'"name"' ':' name=ID ','
	('"VAnnotations"' ':' '[' '{' VAnnotations+=VAnnotation '}' ( ',' '{' VAnnotations+=VAnnotation '}')* ']' ',')?
  ('"VType"' ':' VType=VType) ','
  ('"LowerBound"' ':' LowerBound=INT ',')?
  ('"UpperBound"' ':' UpperBound=INT ',')?
	(IsNotChangeable?='"IsNotChangeable"' ':' 'true' ',')?
	(IsNotOrdered?='"IsNotOrdered"' ':' 'true' ',')?
	(IsTransient?='"IsTransient"' ':' 'true' ',')?
	(IsUnsettable?='"IsUnsettable"' ':' 'true' ',')?
	(IsVolatile?='"IsVolatile"' ':' 'true' ',')?
	(IsDerived?='"IsDerived"' ':' 'true' ',')?
	(IsNotUnique?='"IsNotUnique"' ':' 'true' ',')?
  (IsID?='"IsID"' ':' 'true' ',')?
	 '}';

VReference:
	'"VReference"' ':'
	'{'
	'"id"' ':' id=ID ','
	'"name"' ':' name=ID ','
	('"VAnnotations"' ':' '[' '{' VAnnotations+=VAnnotation '}' ( ',' '{' VAnnotations+=VAnnotation '}')* ']' ',')?
	('"VType"' ':' VType=[VClass:ID])','
	('"LowerBound"' ':' LowerBound=INT ',')?
	('"UpperBound"' ':' UpperBound=INT ',')?
	(IsContainer?='"IsContainer"' ':' 'True' ',')?
	(IsContainment?='"IsContainment"' ':' 'True' ',')?
	(IsNotChangeable?='"IsNotChangeable"' ':' 'true' ',')?
	(IsNotOrdered?='"IsNotOrdered"' ':' 'true' ',')?
	(IsTransient?='"IsTransient"' ':' 'true' ',')?
	(IsUnsettable?='"IsUnsettable"' ':' 'true' ',')?
	(IsVolatile?='"IsVolatile"' ':' 'true' ',')?
	(IsDerived?='"IsDerived"' ':' 'true' ',')?
	(IsNotUnique?='"IsNotUnique"' ':' 'true' ',')?
  (IsID?='"IsID"' ':' 'true' ',')?
	 '}';

VOperation:
	'"VOperation"' ':'
	'{'
	'"id"' ':' id=ID ','
	'"name"' ':' name=ID ','
	('"VAnnotations"' ':' '[' '{' VAnnotations+=VAnnotation '}' ( ',' '{' VAnnotations+=VAnnotation '}')* ']' ',')?
	('"VParameters"' ':' '[' '{' VParameters+=VParameter '}' ( ',' '{' VParameters+=VParameter '}')* ']' ',')?
	('"VReturnType"' ':' VType=VType)?
	 '}';

VParameter:
	'"VParameter"' ':'
	'{'
	'"id"' ':' id=ID ','
	'"name"' ':' name=ID ','
	('"VType"' ':' VType=VType)?
	 '}';

VAnnotation:
	'"VAnnotation"' ':'
	'{'
	'"id"' ':' id=ID ','
	'"name"' ':' name=ID ','
	('"value"' ':' value=STRING ',')?
	 '}';

VLiteral:
	'"VLiteral"' ':'
	'{'
	'"id"' ':' id=ID ','
	'"name"' ':' name=ID ','
	('"value"' ':' value=INT ',')?
	 '}';


// VString:
// 	'"VString"'
// 	','
// 	'"value"' ':' value=STRING
// ;

// VInt:
// 	'"VInt"'
// 	','
// 	'"value"' ':' value=INT
// ;

// VFloat:
// 	'"VFloat"'
// 	','
// 	'"value"' ':' value=FLOAT
// ;
terminal VType: /"VString"|"VInt"|"VFloat"|"VBoolean"/;
terminal FLOAT: /\d+.\d+/;
hidden terminal WS: /\s+|','+/;
terminal ID: /["][_a-zA-Z][\w_]*["]/;
terminal STRING: /["][^"]*["]/;
terminal INT returns number: /[0-9]+/;


hidden terminal ML_COMMENT: /\/\*[\s\S]*?\*\//;
hidden terminal SL_COMMENT: /\/\/[^\n\r]*/;
