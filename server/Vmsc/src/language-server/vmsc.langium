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

VType:
	VString | VInt | VFloat;


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
	(IsSerializable?='"IsSerializable"' ':' 'True' ',')?
	 '}'
;

VClass:
	'"VClass"' ':'
	'{'
	'"id"' ':' id=ID ','
	'"name"' ':' name=ID ','
	('"VStructuralFeatures"' ':' '[' '{' VStructural_features+=VStructuralFeatures '}' ( ',' '{' VStructural_features+=VStructuralFeatures '}')*  ']' ',')? 
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
	(IsChangeable?='"IsChangeable"')?
	(IsOrdered?='"IsOrdered"')?
	(IsTransient?='"IsTransient"')?
	(IsUnsettable?='"IsUnsettable"')?
	(IsVolatile?='"IsVolatile"')?
	(IsDerived?='"IsDerived"')?
	(IsUnique?='"IsUnique"')?
		('"LowerBound"' ':' LowerBound=INT ',')?
		('"UpperBound"' ':' UpperBound=INT ',')?
		('"VType"' ':' VType=VType)?
	 '}';

VReference:
	'"VReference"' ':'
	'{'
	'"id"' ':' id=ID ','
	'"name"' ':' name=ID ','
	('"VAnnotations"' ':' '[' '{' VAnnotations+=VAnnotation '}' ( ',' '{' VAnnotations+=VAnnotation '}')* ']' ',')?
	(IsChangeable?='"IsChangeable"' ':' 'True' ',')?
	(IsOrdered?='"IsOrdered"' ':' 'True' ',')?
	(IsTransient?='"IsTransient"' ':' 'True' ',')?
	(IsUnsettable?='"IsUnsettable"' ':' 'True' ',')?
	(IsVolatile?='"IsVolatile"' ':' 'True' ',')?
	(IsDerived?='"IsDerived"' ':' 'True' ',')?
	(IsUnique?='"IsUnique"' ':' 'True' ',')?
	(IsContainer?='"IsContainer"' ':' 'True' ',')?
	(IsContainment?='"IsContainment"' ':' 'True' ',')?
		('"LowerBound"' ':' LowerBound=INT ',')?
		('"UpperBound"' ':' UpperBound=INT ',')?
		('"VType"' ':' VType=VClass)? 
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


VString:
	'"VString"'
	','
	'"value"' ':' value=STRING
;

VInt:
	'"VInt"'
	','
	'"value"' ':' value=INT
;

VFloat:
	'"VFloat"'
	','
	'"value"' ':' value=FLOAT
;

terminal FLOAT: /\d+.\d+/;
hidden terminal WS: /\s+|','+/;
terminal ID: /["][_a-zA-Z][\w_]*["]/;
terminal STRING: /["][^"]*["]/;
terminal INT returns number: /[0-9]+/;


hidden terminal ML_COMMENT: /\/\*[\s\S]*?\*\//;
hidden terminal SL_COMMENT: /\/\/[^\n\r]*/;
