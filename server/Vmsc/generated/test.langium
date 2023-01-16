grammar Package1

entry Class1 : 
  "Class1"
  name=ID
  '{'
"attr1" attr1=INT
"attr2" attr2=FLOAT

    '}';
    
Class2 : 
  "Class2"
  name=ID
  '{'
"attr1" attr1=INT
"attr2" attr2=FLOAT
    '}';
    

terminal FLOAT: /\d+.\d+/;
hidden terminal WS: /\s+|','+/;
terminal ID: /["][_a-zA-Z][\w_]*["]/;
terminal STRING: /["][^"]*["]/;
terminal INT returns number: /[0-9]+/;


hidden terminal ML_COMMENT: /\/\*[\s\S]*?\*\//;
hidden terminal SL_COMMENT: /\/\/[^\n\r]*/;
  