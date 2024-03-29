grammar Vmsc


entry VModel:
	'{'
	'"VModel"' ':' '{'
	'"id"' ':' id=ID ','
	'"name"' ':' name=ID ','
	('"VPackages"' ':' '[' '{' VPackage+=VPackage '}' ( ',' '{' VPackage+=VPackage '}')* ']' )?
	 '}'
	 '}';

VPackage:
	'"VPackage"'
	':' 
	'{' 
	'"id"' ':' id=ID ','
	'"name"' ':' name=ID ','
	('"VPrefix"' ':' VPrefix=ID	',')
	('"VUri"' ':' VUri=ID ',')
	('"VComponents"' ':' '[' '{' VComponents+=VStructuralComponent '}' ( ',' '{' VComponents+=VStructuralComponent '}')* ']' )?
  '}';

VStructuralComponent:
	VEnum | VDatatype | VPackage | VClass;


VStructuralFeatures:
	VAttribute | VReference;

VEnum:
	'"VEnum"' ':'
	'{'
	'"id"' ':' id=ID ','
	'"name"' ':' name=ID ','
	('"VAnnotations"' ':' '[' '{' VAnnotations+=VAnnotation '}' ( ',' '{' VAnnotations+=VAnnotation '}')* ']' ',')?
	('"VEnumLiterals"' ':' '[' '{' VEnumLiterals+=VLiteral '}' ( ',' '{' VEnumLiterals+=VLiteral '}')* ']' ',')?
	(IsSerializable?='"IsSerializable"' ':' 'true' ',')?
	 '}'
;

VDatatype:
	'"VDatatype"' ':' 
	'{'
	'"id"' ':' id=ID ','
	'"name"' ':' name=ID ','
	('"VAnnotations"' ':' '[' '{' VAnnotations+=VAnnotation '}' ( ',' '{' VAnnotations+=VAnnotation '}')* ']' ',')?
	(IsSerializable?='"IsSerializable"' ':' 'true' ','?)?
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
	(IsAbstract?='"IsAbstract"' ':' 'true' ',')?
	(IsInterface?='"IsInterface"' ':' 'true' ',')?
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
	(IsContainer?='"IsContainer"' ':' 'true' ',')?
	(IsContainment?='"IsContainment"' ':' 'true' ',')?
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


terminal VType: /"VString"|"VInt"|"VFloat"|"VBoolean"/;
terminal FLOAT: /\d+.\d+/;
hidden terminal WS: /\s+|','+/;
terminal ID returns string: /["][_a-zA-Z0-9][\w_]*["]/;
terminal STRING: /["][^"]*["]/;
terminal URL: /["]http[^ID]/;
terminal INT returns number: /-?[0-9]+/;


hidden terminal ML_COMMENT: /\/\*[\s\S]*?\*\//;
hidden terminal SL_COMMENT: /\/\/[^\n\r]*/;