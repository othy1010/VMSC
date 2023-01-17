package org.xtext.example.vmsc.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.vmsc.services.VmscGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVmscParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'VPackage'", "':'", "'{'", "'name'", "','", "'}'", "'VPrefix'", "'VUri'", "'VComponents'", "'['", "']'", "'VEnum'", "'IsSerializable'", "'True'", "'VDatatype'", "'VClass'", "'VStructuralFeatures'", "'VSuperType'", "'IsAbstract'", "'IsInterface'", "'-'", "'VAttribute'", "'IsChangeable'", "'IsOrdered'", "'IsTransient'", "'IsUnsettable'", "'IsVolatile'", "'IsDerived'", "'IsUnique'", "'LowerBound'", "'UpperBound'", "'VType'", "'VReference'", "'IsContainer'", "'IsContainment'", "'VString'", "'VContent'", "'VInt'", "'VFloat'", "'.'", "'E'", "'e'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalVmscParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVmscParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVmscParser.tokenNames; }
    public String getGrammarFileName() { return "InternalVmsc.g"; }



     	private VmscGrammarAccess grammarAccess;

        public InternalVmscParser(TokenStream input, VmscGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "VPackage";
       	}

       	@Override
       	protected VmscGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleVPackage"
    // InternalVmsc.g:64:1: entryRuleVPackage returns [EObject current=null] : iv_ruleVPackage= ruleVPackage EOF ;
    public final EObject entryRuleVPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVPackage = null;


        try {
            // InternalVmsc.g:64:49: (iv_ruleVPackage= ruleVPackage EOF )
            // InternalVmsc.g:65:2: iv_ruleVPackage= ruleVPackage EOF
            {
             newCompositeNode(grammarAccess.getVPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVPackage=ruleVPackage();

            state._fsp--;

             current =iv_ruleVPackage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVPackage"


    // $ANTLR start "ruleVPackage"
    // InternalVmsc.g:71:1: ruleVPackage returns [EObject current=null] : ( () otherlv_1= 'VPackage' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) (otherlv_7= ',' | otherlv_8= '}' ) (otherlv_9= 'VPrefix' otherlv_10= ':' ( (lv_VPrefix_11_0= ruleEString ) ) otherlv_12= ',' ) (otherlv_13= 'VUri' otherlv_14= ':' ( (lv_VUri_15_0= ruleEString ) ) otherlv_16= ',' ) (otherlv_17= 'VComponents' otherlv_18= ':' otherlv_19= '[' otherlv_20= '{' ( (lv_VComponents_21_0= ruleVStructuralComponent ) ) otherlv_22= '}' (otherlv_23= ',' otherlv_24= '{' ( (lv_VComponents_25_0= ruleVStructuralComponent ) ) otherlv_26= '}' )* otherlv_27= ']' )? otherlv_28= '}' ) ;
    public final EObject ruleVPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_name_6_0 = null;

        AntlrDatatypeRuleToken lv_VPrefix_11_0 = null;

        AntlrDatatypeRuleToken lv_VUri_15_0 = null;

        EObject lv_VComponents_21_0 = null;

        EObject lv_VComponents_25_0 = null;



        	enterRule();

        try {
            // InternalVmsc.g:77:2: ( ( () otherlv_1= 'VPackage' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) (otherlv_7= ',' | otherlv_8= '}' ) (otherlv_9= 'VPrefix' otherlv_10= ':' ( (lv_VPrefix_11_0= ruleEString ) ) otherlv_12= ',' ) (otherlv_13= 'VUri' otherlv_14= ':' ( (lv_VUri_15_0= ruleEString ) ) otherlv_16= ',' ) (otherlv_17= 'VComponents' otherlv_18= ':' otherlv_19= '[' otherlv_20= '{' ( (lv_VComponents_21_0= ruleVStructuralComponent ) ) otherlv_22= '}' (otherlv_23= ',' otherlv_24= '{' ( (lv_VComponents_25_0= ruleVStructuralComponent ) ) otherlv_26= '}' )* otherlv_27= ']' )? otherlv_28= '}' ) )
            // InternalVmsc.g:78:2: ( () otherlv_1= 'VPackage' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) (otherlv_7= ',' | otherlv_8= '}' ) (otherlv_9= 'VPrefix' otherlv_10= ':' ( (lv_VPrefix_11_0= ruleEString ) ) otherlv_12= ',' ) (otherlv_13= 'VUri' otherlv_14= ':' ( (lv_VUri_15_0= ruleEString ) ) otherlv_16= ',' ) (otherlv_17= 'VComponents' otherlv_18= ':' otherlv_19= '[' otherlv_20= '{' ( (lv_VComponents_21_0= ruleVStructuralComponent ) ) otherlv_22= '}' (otherlv_23= ',' otherlv_24= '{' ( (lv_VComponents_25_0= ruleVStructuralComponent ) ) otherlv_26= '}' )* otherlv_27= ']' )? otherlv_28= '}' )
            {
            // InternalVmsc.g:78:2: ( () otherlv_1= 'VPackage' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) (otherlv_7= ',' | otherlv_8= '}' ) (otherlv_9= 'VPrefix' otherlv_10= ':' ( (lv_VPrefix_11_0= ruleEString ) ) otherlv_12= ',' ) (otherlv_13= 'VUri' otherlv_14= ':' ( (lv_VUri_15_0= ruleEString ) ) otherlv_16= ',' ) (otherlv_17= 'VComponents' otherlv_18= ':' otherlv_19= '[' otherlv_20= '{' ( (lv_VComponents_21_0= ruleVStructuralComponent ) ) otherlv_22= '}' (otherlv_23= ',' otherlv_24= '{' ( (lv_VComponents_25_0= ruleVStructuralComponent ) ) otherlv_26= '}' )* otherlv_27= ']' )? otherlv_28= '}' )
            // InternalVmsc.g:79:3: () otherlv_1= 'VPackage' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) (otherlv_7= ',' | otherlv_8= '}' ) (otherlv_9= 'VPrefix' otherlv_10= ':' ( (lv_VPrefix_11_0= ruleEString ) ) otherlv_12= ',' ) (otherlv_13= 'VUri' otherlv_14= ':' ( (lv_VUri_15_0= ruleEString ) ) otherlv_16= ',' ) (otherlv_17= 'VComponents' otherlv_18= ':' otherlv_19= '[' otherlv_20= '{' ( (lv_VComponents_21_0= ruleVStructuralComponent ) ) otherlv_22= '}' (otherlv_23= ',' otherlv_24= '{' ( (lv_VComponents_25_0= ruleVStructuralComponent ) ) otherlv_26= '}' )* otherlv_27= ']' )? otherlv_28= '}'
            {
            // InternalVmsc.g:79:3: ()
            // InternalVmsc.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVPackageAccess().getVPackageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVPackageAccess().getVPackageKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getVPackageAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getVPackageAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getVPackageAccess().getNameKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getVPackageAccess().getColonKeyword_5());
            		
            // InternalVmsc.g:106:3: ( (lv_name_6_0= ruleEString ) )
            // InternalVmsc.g:107:4: (lv_name_6_0= ruleEString )
            {
            // InternalVmsc.g:107:4: (lv_name_6_0= ruleEString )
            // InternalVmsc.g:108:5: lv_name_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVPackageAccess().getNameEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVPackageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_6_0,
            						"org.xtext.example.vmsc.Vmsc.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVmsc.g:125:3: (otherlv_7= ',' | otherlv_8= '}' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            else if ( (LA1_0==16) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalVmsc.g:126:4: otherlv_7= ','
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getVPackageAccess().getCommaKeyword_7_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalVmsc.g:131:4: otherlv_8= '}'
                    {
                    otherlv_8=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getVPackageAccess().getRightCurlyBracketKeyword_7_1());
                    			

                    }
                    break;

            }

            // InternalVmsc.g:136:3: (otherlv_9= 'VPrefix' otherlv_10= ':' ( (lv_VPrefix_11_0= ruleEString ) ) otherlv_12= ',' )
            // InternalVmsc.g:137:4: otherlv_9= 'VPrefix' otherlv_10= ':' ( (lv_VPrefix_11_0= ruleEString ) ) otherlv_12= ','
            {
            otherlv_9=(Token)match(input,17,FOLLOW_3); 

            				newLeafNode(otherlv_9, grammarAccess.getVPackageAccess().getVPrefixKeyword_8_0());
            			
            otherlv_10=(Token)match(input,12,FOLLOW_6); 

            				newLeafNode(otherlv_10, grammarAccess.getVPackageAccess().getColonKeyword_8_1());
            			
            // InternalVmsc.g:145:4: ( (lv_VPrefix_11_0= ruleEString ) )
            // InternalVmsc.g:146:5: (lv_VPrefix_11_0= ruleEString )
            {
            // InternalVmsc.g:146:5: (lv_VPrefix_11_0= ruleEString )
            // InternalVmsc.g:147:6: lv_VPrefix_11_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getVPackageAccess().getVPrefixEStringParserRuleCall_8_2_0());
            					
            pushFollow(FOLLOW_9);
            lv_VPrefix_11_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getVPackageRule());
            						}
            						set(
            							current,
            							"VPrefix",
            							lv_VPrefix_11_0,
            							"org.xtext.example.vmsc.Vmsc.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_12=(Token)match(input,15,FOLLOW_10); 

            				newLeafNode(otherlv_12, grammarAccess.getVPackageAccess().getCommaKeyword_8_3());
            			

            }

            // InternalVmsc.g:169:3: (otherlv_13= 'VUri' otherlv_14= ':' ( (lv_VUri_15_0= ruleEString ) ) otherlv_16= ',' )
            // InternalVmsc.g:170:4: otherlv_13= 'VUri' otherlv_14= ':' ( (lv_VUri_15_0= ruleEString ) ) otherlv_16= ','
            {
            otherlv_13=(Token)match(input,18,FOLLOW_3); 

            				newLeafNode(otherlv_13, grammarAccess.getVPackageAccess().getVUriKeyword_9_0());
            			
            otherlv_14=(Token)match(input,12,FOLLOW_6); 

            				newLeafNode(otherlv_14, grammarAccess.getVPackageAccess().getColonKeyword_9_1());
            			
            // InternalVmsc.g:178:4: ( (lv_VUri_15_0= ruleEString ) )
            // InternalVmsc.g:179:5: (lv_VUri_15_0= ruleEString )
            {
            // InternalVmsc.g:179:5: (lv_VUri_15_0= ruleEString )
            // InternalVmsc.g:180:6: lv_VUri_15_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getVPackageAccess().getVUriEStringParserRuleCall_9_2_0());
            					
            pushFollow(FOLLOW_9);
            lv_VUri_15_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getVPackageRule());
            						}
            						set(
            							current,
            							"VUri",
            							lv_VUri_15_0,
            							"org.xtext.example.vmsc.Vmsc.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_16=(Token)match(input,15,FOLLOW_11); 

            				newLeafNode(otherlv_16, grammarAccess.getVPackageAccess().getCommaKeyword_9_3());
            			

            }

            // InternalVmsc.g:202:3: (otherlv_17= 'VComponents' otherlv_18= ':' otherlv_19= '[' otherlv_20= '{' ( (lv_VComponents_21_0= ruleVStructuralComponent ) ) otherlv_22= '}' (otherlv_23= ',' otherlv_24= '{' ( (lv_VComponents_25_0= ruleVStructuralComponent ) ) otherlv_26= '}' )* otherlv_27= ']' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalVmsc.g:203:4: otherlv_17= 'VComponents' otherlv_18= ':' otherlv_19= '[' otherlv_20= '{' ( (lv_VComponents_21_0= ruleVStructuralComponent ) ) otherlv_22= '}' (otherlv_23= ',' otherlv_24= '{' ( (lv_VComponents_25_0= ruleVStructuralComponent ) ) otherlv_26= '}' )* otherlv_27= ']'
                    {
                    otherlv_17=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getVPackageAccess().getVComponentsKeyword_10_0());
                    			
                    otherlv_18=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_18, grammarAccess.getVPackageAccess().getColonKeyword_10_1());
                    			
                    otherlv_19=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_19, grammarAccess.getVPackageAccess().getLeftSquareBracketKeyword_10_2());
                    			
                    otherlv_20=(Token)match(input,13,FOLLOW_13); 

                    				newLeafNode(otherlv_20, grammarAccess.getVPackageAccess().getLeftCurlyBracketKeyword_10_3());
                    			
                    // InternalVmsc.g:219:4: ( (lv_VComponents_21_0= ruleVStructuralComponent ) )
                    // InternalVmsc.g:220:5: (lv_VComponents_21_0= ruleVStructuralComponent )
                    {
                    // InternalVmsc.g:220:5: (lv_VComponents_21_0= ruleVStructuralComponent )
                    // InternalVmsc.g:221:6: lv_VComponents_21_0= ruleVStructuralComponent
                    {

                    						newCompositeNode(grammarAccess.getVPackageAccess().getVComponentsVStructuralComponentParserRuleCall_10_4_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_VComponents_21_0=ruleVStructuralComponent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVPackageRule());
                    						}
                    						add(
                    							current,
                    							"VComponents",
                    							lv_VComponents_21_0,
                    							"org.xtext.example.vmsc.Vmsc.VStructuralComponent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_22=(Token)match(input,16,FOLLOW_15); 

                    				newLeafNode(otherlv_22, grammarAccess.getVPackageAccess().getRightCurlyBracketKeyword_10_5());
                    			
                    // InternalVmsc.g:242:4: (otherlv_23= ',' otherlv_24= '{' ( (lv_VComponents_25_0= ruleVStructuralComponent ) ) otherlv_26= '}' )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalVmsc.g:243:5: otherlv_23= ',' otherlv_24= '{' ( (lv_VComponents_25_0= ruleVStructuralComponent ) ) otherlv_26= '}'
                    	    {
                    	    otherlv_23=(Token)match(input,15,FOLLOW_4); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getVPackageAccess().getCommaKeyword_10_6_0());
                    	    				
                    	    otherlv_24=(Token)match(input,13,FOLLOW_13); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getVPackageAccess().getLeftCurlyBracketKeyword_10_6_1());
                    	    				
                    	    // InternalVmsc.g:251:5: ( (lv_VComponents_25_0= ruleVStructuralComponent ) )
                    	    // InternalVmsc.g:252:6: (lv_VComponents_25_0= ruleVStructuralComponent )
                    	    {
                    	    // InternalVmsc.g:252:6: (lv_VComponents_25_0= ruleVStructuralComponent )
                    	    // InternalVmsc.g:253:7: lv_VComponents_25_0= ruleVStructuralComponent
                    	    {

                    	    							newCompositeNode(grammarAccess.getVPackageAccess().getVComponentsVStructuralComponentParserRuleCall_10_6_2_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_VComponents_25_0=ruleVStructuralComponent();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getVPackageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"VComponents",
                    	    								lv_VComponents_25_0,
                    	    								"org.xtext.example.vmsc.Vmsc.VStructuralComponent");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    otherlv_26=(Token)match(input,16,FOLLOW_15); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getVPackageAccess().getRightCurlyBracketKeyword_10_6_3());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_27, grammarAccess.getVPackageAccess().getRightSquareBracketKeyword_10_7());
                    			

                    }
                    break;

            }

            otherlv_28=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_28, grammarAccess.getVPackageAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVPackage"


    // $ANTLR start "entryRuleVStructuralComponent"
    // InternalVmsc.g:288:1: entryRuleVStructuralComponent returns [EObject current=null] : iv_ruleVStructuralComponent= ruleVStructuralComponent EOF ;
    public final EObject entryRuleVStructuralComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVStructuralComponent = null;


        try {
            // InternalVmsc.g:288:61: (iv_ruleVStructuralComponent= ruleVStructuralComponent EOF )
            // InternalVmsc.g:289:2: iv_ruleVStructuralComponent= ruleVStructuralComponent EOF
            {
             newCompositeNode(grammarAccess.getVStructuralComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVStructuralComponent=ruleVStructuralComponent();

            state._fsp--;

             current =iv_ruleVStructuralComponent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVStructuralComponent"


    // $ANTLR start "ruleVStructuralComponent"
    // InternalVmsc.g:295:1: ruleVStructuralComponent returns [EObject current=null] : (this_VEnum_0= ruleVEnum | this_VDatatype_Impl_1= ruleVDatatype_Impl | this_VPackage_2= ruleVPackage | this_VClass_3= ruleVClass ) ;
    public final EObject ruleVStructuralComponent() throws RecognitionException {
        EObject current = null;

        EObject this_VEnum_0 = null;

        EObject this_VDatatype_Impl_1 = null;

        EObject this_VPackage_2 = null;

        EObject this_VClass_3 = null;



        	enterRule();

        try {
            // InternalVmsc.g:301:2: ( (this_VEnum_0= ruleVEnum | this_VDatatype_Impl_1= ruleVDatatype_Impl | this_VPackage_2= ruleVPackage | this_VClass_3= ruleVClass ) )
            // InternalVmsc.g:302:2: (this_VEnum_0= ruleVEnum | this_VDatatype_Impl_1= ruleVDatatype_Impl | this_VPackage_2= ruleVPackage | this_VClass_3= ruleVClass )
            {
            // InternalVmsc.g:302:2: (this_VEnum_0= ruleVEnum | this_VDatatype_Impl_1= ruleVDatatype_Impl | this_VPackage_2= ruleVPackage | this_VClass_3= ruleVClass )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt4=1;
                }
                break;
            case 25:
                {
                alt4=2;
                }
                break;
            case 11:
                {
                alt4=3;
                }
                break;
            case 26:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalVmsc.g:303:3: this_VEnum_0= ruleVEnum
                    {

                    			newCompositeNode(grammarAccess.getVStructuralComponentAccess().getVEnumParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_VEnum_0=ruleVEnum();

                    state._fsp--;


                    			current = this_VEnum_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalVmsc.g:312:3: this_VDatatype_Impl_1= ruleVDatatype_Impl
                    {

                    			newCompositeNode(grammarAccess.getVStructuralComponentAccess().getVDatatype_ImplParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VDatatype_Impl_1=ruleVDatatype_Impl();

                    state._fsp--;


                    			current = this_VDatatype_Impl_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalVmsc.g:321:3: this_VPackage_2= ruleVPackage
                    {

                    			newCompositeNode(grammarAccess.getVStructuralComponentAccess().getVPackageParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VPackage_2=ruleVPackage();

                    state._fsp--;


                    			current = this_VPackage_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalVmsc.g:330:3: this_VClass_3= ruleVClass
                    {

                    			newCompositeNode(grammarAccess.getVStructuralComponentAccess().getVClassParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_VClass_3=ruleVClass();

                    state._fsp--;


                    			current = this_VClass_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVStructuralComponent"


    // $ANTLR start "entryRuleVStructuralFeatures"
    // InternalVmsc.g:342:1: entryRuleVStructuralFeatures returns [EObject current=null] : iv_ruleVStructuralFeatures= ruleVStructuralFeatures EOF ;
    public final EObject entryRuleVStructuralFeatures() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVStructuralFeatures = null;


        try {
            // InternalVmsc.g:342:60: (iv_ruleVStructuralFeatures= ruleVStructuralFeatures EOF )
            // InternalVmsc.g:343:2: iv_ruleVStructuralFeatures= ruleVStructuralFeatures EOF
            {
             newCompositeNode(grammarAccess.getVStructuralFeaturesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVStructuralFeatures=ruleVStructuralFeatures();

            state._fsp--;

             current =iv_ruleVStructuralFeatures; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVStructuralFeatures"


    // $ANTLR start "ruleVStructuralFeatures"
    // InternalVmsc.g:349:1: ruleVStructuralFeatures returns [EObject current=null] : (this_VAttribute_0= ruleVAttribute | this_VReference_1= ruleVReference ) ;
    public final EObject ruleVStructuralFeatures() throws RecognitionException {
        EObject current = null;

        EObject this_VAttribute_0 = null;

        EObject this_VReference_1 = null;



        	enterRule();

        try {
            // InternalVmsc.g:355:2: ( (this_VAttribute_0= ruleVAttribute | this_VReference_1= ruleVReference ) )
            // InternalVmsc.g:356:2: (this_VAttribute_0= ruleVAttribute | this_VReference_1= ruleVReference )
            {
            // InternalVmsc.g:356:2: (this_VAttribute_0= ruleVAttribute | this_VReference_1= ruleVReference )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==32) ) {
                alt5=1;
            }
            else if ( (LA5_0==43) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalVmsc.g:357:3: this_VAttribute_0= ruleVAttribute
                    {

                    			newCompositeNode(grammarAccess.getVStructuralFeaturesAccess().getVAttributeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_VAttribute_0=ruleVAttribute();

                    state._fsp--;


                    			current = this_VAttribute_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalVmsc.g:366:3: this_VReference_1= ruleVReference
                    {

                    			newCompositeNode(grammarAccess.getVStructuralFeaturesAccess().getVReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VReference_1=ruleVReference();

                    state._fsp--;


                    			current = this_VReference_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVStructuralFeatures"


    // $ANTLR start "entryRuleVType"
    // InternalVmsc.g:378:1: entryRuleVType returns [EObject current=null] : iv_ruleVType= ruleVType EOF ;
    public final EObject entryRuleVType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVType = null;


        try {
            // InternalVmsc.g:378:46: (iv_ruleVType= ruleVType EOF )
            // InternalVmsc.g:379:2: iv_ruleVType= ruleVType EOF
            {
             newCompositeNode(grammarAccess.getVTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVType=ruleVType();

            state._fsp--;

             current =iv_ruleVType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVType"


    // $ANTLR start "ruleVType"
    // InternalVmsc.g:385:1: ruleVType returns [EObject current=null] : (this_VString_0= ruleVString | this_VInt_1= ruleVInt | this_VFloat_2= ruleVFloat ) ;
    public final EObject ruleVType() throws RecognitionException {
        EObject current = null;

        EObject this_VString_0 = null;

        EObject this_VInt_1 = null;

        EObject this_VFloat_2 = null;



        	enterRule();

        try {
            // InternalVmsc.g:391:2: ( (this_VString_0= ruleVString | this_VInt_1= ruleVInt | this_VFloat_2= ruleVFloat ) )
            // InternalVmsc.g:392:2: (this_VString_0= ruleVString | this_VInt_1= ruleVInt | this_VFloat_2= ruleVFloat )
            {
            // InternalVmsc.g:392:2: (this_VString_0= ruleVString | this_VInt_1= ruleVInt | this_VFloat_2= ruleVFloat )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt6=1;
                }
                break;
            case 48:
                {
                alt6=2;
                }
                break;
            case 49:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalVmsc.g:393:3: this_VString_0= ruleVString
                    {

                    			newCompositeNode(grammarAccess.getVTypeAccess().getVStringParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_VString_0=ruleVString();

                    state._fsp--;


                    			current = this_VString_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalVmsc.g:402:3: this_VInt_1= ruleVInt
                    {

                    			newCompositeNode(grammarAccess.getVTypeAccess().getVIntParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VInt_1=ruleVInt();

                    state._fsp--;


                    			current = this_VInt_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalVmsc.g:411:3: this_VFloat_2= ruleVFloat
                    {

                    			newCompositeNode(grammarAccess.getVTypeAccess().getVFloatParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VFloat_2=ruleVFloat();

                    state._fsp--;


                    			current = this_VFloat_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVType"


    // $ANTLR start "entryRuleEString"
    // InternalVmsc.g:423:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalVmsc.g:423:47: (iv_ruleEString= ruleEString EOF )
            // InternalVmsc.g:424:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalVmsc.g:430:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalVmsc.g:436:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalVmsc.g:437:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalVmsc.g:437:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalVmsc.g:438:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalVmsc.g:446:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleVEnum"
    // InternalVmsc.g:457:1: entryRuleVEnum returns [EObject current=null] : iv_ruleVEnum= ruleVEnum EOF ;
    public final EObject entryRuleVEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVEnum = null;


        try {
            // InternalVmsc.g:457:46: (iv_ruleVEnum= ruleVEnum EOF )
            // InternalVmsc.g:458:2: iv_ruleVEnum= ruleVEnum EOF
            {
             newCompositeNode(grammarAccess.getVEnumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVEnum=ruleVEnum();

            state._fsp--;

             current =iv_ruleVEnum; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVEnum"


    // $ANTLR start "ruleVEnum"
    // InternalVmsc.g:464:1: ruleVEnum returns [EObject current=null] : ( () otherlv_1= 'VEnum' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' ( ( (lv_IsSerializable_8_0= 'IsSerializable' ) ) otherlv_9= ':' otherlv_10= 'True' otherlv_11= ',' )? otherlv_12= '}' ) ;
    public final EObject ruleVEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_IsSerializable_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_6_0 = null;



        	enterRule();

        try {
            // InternalVmsc.g:470:2: ( ( () otherlv_1= 'VEnum' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' ( ( (lv_IsSerializable_8_0= 'IsSerializable' ) ) otherlv_9= ':' otherlv_10= 'True' otherlv_11= ',' )? otherlv_12= '}' ) )
            // InternalVmsc.g:471:2: ( () otherlv_1= 'VEnum' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' ( ( (lv_IsSerializable_8_0= 'IsSerializable' ) ) otherlv_9= ':' otherlv_10= 'True' otherlv_11= ',' )? otherlv_12= '}' )
            {
            // InternalVmsc.g:471:2: ( () otherlv_1= 'VEnum' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' ( ( (lv_IsSerializable_8_0= 'IsSerializable' ) ) otherlv_9= ':' otherlv_10= 'True' otherlv_11= ',' )? otherlv_12= '}' )
            // InternalVmsc.g:472:3: () otherlv_1= 'VEnum' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' ( ( (lv_IsSerializable_8_0= 'IsSerializable' ) ) otherlv_9= ':' otherlv_10= 'True' otherlv_11= ',' )? otherlv_12= '}'
            {
            // InternalVmsc.g:472:3: ()
            // InternalVmsc.g:473:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVEnumAccess().getVEnumAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVEnumAccess().getVEnumKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getVEnumAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getVEnumAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getVEnumAccess().getNameKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getVEnumAccess().getColonKeyword_5());
            		
            // InternalVmsc.g:499:3: ( (lv_name_6_0= ruleEString ) )
            // InternalVmsc.g:500:4: (lv_name_6_0= ruleEString )
            {
            // InternalVmsc.g:500:4: (lv_name_6_0= ruleEString )
            // InternalVmsc.g:501:5: lv_name_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVEnumAccess().getNameEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVEnumRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_6_0,
            						"org.xtext.example.vmsc.Vmsc.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_16); 

            			newLeafNode(otherlv_7, grammarAccess.getVEnumAccess().getCommaKeyword_7());
            		
            // InternalVmsc.g:522:3: ( ( (lv_IsSerializable_8_0= 'IsSerializable' ) ) otherlv_9= ':' otherlv_10= 'True' otherlv_11= ',' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalVmsc.g:523:4: ( (lv_IsSerializable_8_0= 'IsSerializable' ) ) otherlv_9= ':' otherlv_10= 'True' otherlv_11= ','
                    {
                    // InternalVmsc.g:523:4: ( (lv_IsSerializable_8_0= 'IsSerializable' ) )
                    // InternalVmsc.g:524:5: (lv_IsSerializable_8_0= 'IsSerializable' )
                    {
                    // InternalVmsc.g:524:5: (lv_IsSerializable_8_0= 'IsSerializable' )
                    // InternalVmsc.g:525:6: lv_IsSerializable_8_0= 'IsSerializable'
                    {
                    lv_IsSerializable_8_0=(Token)match(input,23,FOLLOW_3); 

                    						newLeafNode(lv_IsSerializable_8_0, grammarAccess.getVEnumAccess().getIsSerializableIsSerializableKeyword_8_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVEnumRule());
                    						}
                    						setWithLastConsumed(current, "IsSerializable", lv_IsSerializable_8_0 != null, "IsSerializable");
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getVEnumAccess().getColonKeyword_8_1());
                    			
                    otherlv_10=(Token)match(input,24,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getVEnumAccess().getTrueKeyword_8_2());
                    			
                    otherlv_11=(Token)match(input,15,FOLLOW_14); 

                    				newLeafNode(otherlv_11, grammarAccess.getVEnumAccess().getCommaKeyword_8_3());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getVEnumAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVEnum"


    // $ANTLR start "entryRuleVDatatype_Impl"
    // InternalVmsc.g:558:1: entryRuleVDatatype_Impl returns [EObject current=null] : iv_ruleVDatatype_Impl= ruleVDatatype_Impl EOF ;
    public final EObject entryRuleVDatatype_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVDatatype_Impl = null;


        try {
            // InternalVmsc.g:558:55: (iv_ruleVDatatype_Impl= ruleVDatatype_Impl EOF )
            // InternalVmsc.g:559:2: iv_ruleVDatatype_Impl= ruleVDatatype_Impl EOF
            {
             newCompositeNode(grammarAccess.getVDatatype_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVDatatype_Impl=ruleVDatatype_Impl();

            state._fsp--;

             current =iv_ruleVDatatype_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVDatatype_Impl"


    // $ANTLR start "ruleVDatatype_Impl"
    // InternalVmsc.g:565:1: ruleVDatatype_Impl returns [EObject current=null] : ( () otherlv_1= 'VDatatype' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' ( ( (lv_IsSerializable_8_0= 'IsSerializable' ) ) otherlv_9= ':' otherlv_10= 'True' otherlv_11= ',' )? otherlv_12= '}' ) ;
    public final EObject ruleVDatatype_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_IsSerializable_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_6_0 = null;



        	enterRule();

        try {
            // InternalVmsc.g:571:2: ( ( () otherlv_1= 'VDatatype' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' ( ( (lv_IsSerializable_8_0= 'IsSerializable' ) ) otherlv_9= ':' otherlv_10= 'True' otherlv_11= ',' )? otherlv_12= '}' ) )
            // InternalVmsc.g:572:2: ( () otherlv_1= 'VDatatype' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' ( ( (lv_IsSerializable_8_0= 'IsSerializable' ) ) otherlv_9= ':' otherlv_10= 'True' otherlv_11= ',' )? otherlv_12= '}' )
            {
            // InternalVmsc.g:572:2: ( () otherlv_1= 'VDatatype' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' ( ( (lv_IsSerializable_8_0= 'IsSerializable' ) ) otherlv_9= ':' otherlv_10= 'True' otherlv_11= ',' )? otherlv_12= '}' )
            // InternalVmsc.g:573:3: () otherlv_1= 'VDatatype' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' ( ( (lv_IsSerializable_8_0= 'IsSerializable' ) ) otherlv_9= ':' otherlv_10= 'True' otherlv_11= ',' )? otherlv_12= '}'
            {
            // InternalVmsc.g:573:3: ()
            // InternalVmsc.g:574:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVDatatype_ImplAccess().getVDatatypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVDatatype_ImplAccess().getVDatatypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getVDatatype_ImplAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getVDatatype_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getVDatatype_ImplAccess().getNameKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getVDatatype_ImplAccess().getColonKeyword_5());
            		
            // InternalVmsc.g:600:3: ( (lv_name_6_0= ruleEString ) )
            // InternalVmsc.g:601:4: (lv_name_6_0= ruleEString )
            {
            // InternalVmsc.g:601:4: (lv_name_6_0= ruleEString )
            // InternalVmsc.g:602:5: lv_name_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVDatatype_ImplAccess().getNameEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVDatatype_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_6_0,
            						"org.xtext.example.vmsc.Vmsc.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_16); 

            			newLeafNode(otherlv_7, grammarAccess.getVDatatype_ImplAccess().getCommaKeyword_7());
            		
            // InternalVmsc.g:623:3: ( ( (lv_IsSerializable_8_0= 'IsSerializable' ) ) otherlv_9= ':' otherlv_10= 'True' otherlv_11= ',' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalVmsc.g:624:4: ( (lv_IsSerializable_8_0= 'IsSerializable' ) ) otherlv_9= ':' otherlv_10= 'True' otherlv_11= ','
                    {
                    // InternalVmsc.g:624:4: ( (lv_IsSerializable_8_0= 'IsSerializable' ) )
                    // InternalVmsc.g:625:5: (lv_IsSerializable_8_0= 'IsSerializable' )
                    {
                    // InternalVmsc.g:625:5: (lv_IsSerializable_8_0= 'IsSerializable' )
                    // InternalVmsc.g:626:6: lv_IsSerializable_8_0= 'IsSerializable'
                    {
                    lv_IsSerializable_8_0=(Token)match(input,23,FOLLOW_3); 

                    						newLeafNode(lv_IsSerializable_8_0, grammarAccess.getVDatatype_ImplAccess().getIsSerializableIsSerializableKeyword_8_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVDatatype_ImplRule());
                    						}
                    						setWithLastConsumed(current, "IsSerializable", lv_IsSerializable_8_0 != null, "IsSerializable");
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getVDatatype_ImplAccess().getColonKeyword_8_1());
                    			
                    otherlv_10=(Token)match(input,24,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getVDatatype_ImplAccess().getTrueKeyword_8_2());
                    			
                    otherlv_11=(Token)match(input,15,FOLLOW_14); 

                    				newLeafNode(otherlv_11, grammarAccess.getVDatatype_ImplAccess().getCommaKeyword_8_3());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getVDatatype_ImplAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVDatatype_Impl"


    // $ANTLR start "entryRuleVClass"
    // InternalVmsc.g:659:1: entryRuleVClass returns [EObject current=null] : iv_ruleVClass= ruleVClass EOF ;
    public final EObject entryRuleVClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVClass = null;


        try {
            // InternalVmsc.g:659:47: (iv_ruleVClass= ruleVClass EOF )
            // InternalVmsc.g:660:2: iv_ruleVClass= ruleVClass EOF
            {
             newCompositeNode(grammarAccess.getVClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVClass=ruleVClass();

            state._fsp--;

             current =iv_ruleVClass; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVClass"


    // $ANTLR start "ruleVClass"
    // InternalVmsc.g:666:1: ruleVClass returns [EObject current=null] : ( () otherlv_1= 'VClass' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' (otherlv_8= 'VStructuralFeatures' otherlv_9= ':' otherlv_10= '[' otherlv_11= '{' ( (lv_VStructural_features_12_0= ruleVStructuralFeatures ) ) otherlv_13= '}' (otherlv_14= ',' otherlv_15= '{' ( (lv_VStructural_features_16_0= ruleVStructuralFeatures ) ) otherlv_17= '}' )* otherlv_18= ']' otherlv_19= ',' )? (otherlv_20= 'VSuperType' otherlv_21= ':' otherlv_22= '[' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ']' otherlv_27= ',' )? ( ( (lv_IsAbstract_28_0= 'IsAbstract' ) ) otherlv_29= ':' otherlv_30= 'True' otherlv_31= ',' )? ( ( (lv_IsInterface_32_0= 'IsInterface' ) ) otherlv_33= ':' otherlv_34= 'True' otherlv_35= ',' )? otherlv_36= '}' ) ;
    public final EObject ruleVClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token lv_IsAbstract_28_0=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token lv_IsInterface_32_0=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        AntlrDatatypeRuleToken lv_name_6_0 = null;

        EObject lv_VStructural_features_12_0 = null;

        EObject lv_VStructural_features_16_0 = null;



        	enterRule();

        try {
            // InternalVmsc.g:672:2: ( ( () otherlv_1= 'VClass' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' (otherlv_8= 'VStructuralFeatures' otherlv_9= ':' otherlv_10= '[' otherlv_11= '{' ( (lv_VStructural_features_12_0= ruleVStructuralFeatures ) ) otherlv_13= '}' (otherlv_14= ',' otherlv_15= '{' ( (lv_VStructural_features_16_0= ruleVStructuralFeatures ) ) otherlv_17= '}' )* otherlv_18= ']' otherlv_19= ',' )? (otherlv_20= 'VSuperType' otherlv_21= ':' otherlv_22= '[' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ']' otherlv_27= ',' )? ( ( (lv_IsAbstract_28_0= 'IsAbstract' ) ) otherlv_29= ':' otherlv_30= 'True' otherlv_31= ',' )? ( ( (lv_IsInterface_32_0= 'IsInterface' ) ) otherlv_33= ':' otherlv_34= 'True' otherlv_35= ',' )? otherlv_36= '}' ) )
            // InternalVmsc.g:673:2: ( () otherlv_1= 'VClass' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' (otherlv_8= 'VStructuralFeatures' otherlv_9= ':' otherlv_10= '[' otherlv_11= '{' ( (lv_VStructural_features_12_0= ruleVStructuralFeatures ) ) otherlv_13= '}' (otherlv_14= ',' otherlv_15= '{' ( (lv_VStructural_features_16_0= ruleVStructuralFeatures ) ) otherlv_17= '}' )* otherlv_18= ']' otherlv_19= ',' )? (otherlv_20= 'VSuperType' otherlv_21= ':' otherlv_22= '[' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ']' otherlv_27= ',' )? ( ( (lv_IsAbstract_28_0= 'IsAbstract' ) ) otherlv_29= ':' otherlv_30= 'True' otherlv_31= ',' )? ( ( (lv_IsInterface_32_0= 'IsInterface' ) ) otherlv_33= ':' otherlv_34= 'True' otherlv_35= ',' )? otherlv_36= '}' )
            {
            // InternalVmsc.g:673:2: ( () otherlv_1= 'VClass' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' (otherlv_8= 'VStructuralFeatures' otherlv_9= ':' otherlv_10= '[' otherlv_11= '{' ( (lv_VStructural_features_12_0= ruleVStructuralFeatures ) ) otherlv_13= '}' (otherlv_14= ',' otherlv_15= '{' ( (lv_VStructural_features_16_0= ruleVStructuralFeatures ) ) otherlv_17= '}' )* otherlv_18= ']' otherlv_19= ',' )? (otherlv_20= 'VSuperType' otherlv_21= ':' otherlv_22= '[' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ']' otherlv_27= ',' )? ( ( (lv_IsAbstract_28_0= 'IsAbstract' ) ) otherlv_29= ':' otherlv_30= 'True' otherlv_31= ',' )? ( ( (lv_IsInterface_32_0= 'IsInterface' ) ) otherlv_33= ':' otherlv_34= 'True' otherlv_35= ',' )? otherlv_36= '}' )
            // InternalVmsc.g:674:3: () otherlv_1= 'VClass' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' (otherlv_8= 'VStructuralFeatures' otherlv_9= ':' otherlv_10= '[' otherlv_11= '{' ( (lv_VStructural_features_12_0= ruleVStructuralFeatures ) ) otherlv_13= '}' (otherlv_14= ',' otherlv_15= '{' ( (lv_VStructural_features_16_0= ruleVStructuralFeatures ) ) otherlv_17= '}' )* otherlv_18= ']' otherlv_19= ',' )? (otherlv_20= 'VSuperType' otherlv_21= ':' otherlv_22= '[' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ']' otherlv_27= ',' )? ( ( (lv_IsAbstract_28_0= 'IsAbstract' ) ) otherlv_29= ':' otherlv_30= 'True' otherlv_31= ',' )? ( ( (lv_IsInterface_32_0= 'IsInterface' ) ) otherlv_33= ':' otherlv_34= 'True' otherlv_35= ',' )? otherlv_36= '}'
            {
            // InternalVmsc.g:674:3: ()
            // InternalVmsc.g:675:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVClassAccess().getVClassAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVClassAccess().getVClassKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getVClassAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getVClassAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getVClassAccess().getNameKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getVClassAccess().getColonKeyword_5());
            		
            // InternalVmsc.g:701:3: ( (lv_name_6_0= ruleEString ) )
            // InternalVmsc.g:702:4: (lv_name_6_0= ruleEString )
            {
            // InternalVmsc.g:702:4: (lv_name_6_0= ruleEString )
            // InternalVmsc.g:703:5: lv_name_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVClassAccess().getNameEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVClassRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_6_0,
            						"org.xtext.example.vmsc.Vmsc.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_7, grammarAccess.getVClassAccess().getCommaKeyword_7());
            		
            // InternalVmsc.g:724:3: (otherlv_8= 'VStructuralFeatures' otherlv_9= ':' otherlv_10= '[' otherlv_11= '{' ( (lv_VStructural_features_12_0= ruleVStructuralFeatures ) ) otherlv_13= '}' (otherlv_14= ',' otherlv_15= '{' ( (lv_VStructural_features_16_0= ruleVStructuralFeatures ) ) otherlv_17= '}' )* otherlv_18= ']' otherlv_19= ',' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalVmsc.g:725:4: otherlv_8= 'VStructuralFeatures' otherlv_9= ':' otherlv_10= '[' otherlv_11= '{' ( (lv_VStructural_features_12_0= ruleVStructuralFeatures ) ) otherlv_13= '}' (otherlv_14= ',' otherlv_15= '{' ( (lv_VStructural_features_16_0= ruleVStructuralFeatures ) ) otherlv_17= '}' )* otherlv_18= ']' otherlv_19= ','
                    {
                    otherlv_8=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getVClassAccess().getVStructuralFeaturesKeyword_8_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getVClassAccess().getColonKeyword_8_1());
                    			
                    otherlv_10=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getVClassAccess().getLeftSquareBracketKeyword_8_2());
                    			
                    otherlv_11=(Token)match(input,13,FOLLOW_19); 

                    				newLeafNode(otherlv_11, grammarAccess.getVClassAccess().getLeftCurlyBracketKeyword_8_3());
                    			
                    // InternalVmsc.g:741:4: ( (lv_VStructural_features_12_0= ruleVStructuralFeatures ) )
                    // InternalVmsc.g:742:5: (lv_VStructural_features_12_0= ruleVStructuralFeatures )
                    {
                    // InternalVmsc.g:742:5: (lv_VStructural_features_12_0= ruleVStructuralFeatures )
                    // InternalVmsc.g:743:6: lv_VStructural_features_12_0= ruleVStructuralFeatures
                    {

                    						newCompositeNode(grammarAccess.getVClassAccess().getVStructural_featuresVStructuralFeaturesParserRuleCall_8_4_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_VStructural_features_12_0=ruleVStructuralFeatures();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVClassRule());
                    						}
                    						add(
                    							current,
                    							"VStructural_features",
                    							lv_VStructural_features_12_0,
                    							"org.xtext.example.vmsc.Vmsc.VStructuralFeatures");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,16,FOLLOW_15); 

                    				newLeafNode(otherlv_13, grammarAccess.getVClassAccess().getRightCurlyBracketKeyword_8_5());
                    			
                    // InternalVmsc.g:764:4: (otherlv_14= ',' otherlv_15= '{' ( (lv_VStructural_features_16_0= ruleVStructuralFeatures ) ) otherlv_17= '}' )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==15) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalVmsc.g:765:5: otherlv_14= ',' otherlv_15= '{' ( (lv_VStructural_features_16_0= ruleVStructuralFeatures ) ) otherlv_17= '}'
                    	    {
                    	    otherlv_14=(Token)match(input,15,FOLLOW_4); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getVClassAccess().getCommaKeyword_8_6_0());
                    	    				
                    	    otherlv_15=(Token)match(input,13,FOLLOW_19); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getVClassAccess().getLeftCurlyBracketKeyword_8_6_1());
                    	    				
                    	    // InternalVmsc.g:773:5: ( (lv_VStructural_features_16_0= ruleVStructuralFeatures ) )
                    	    // InternalVmsc.g:774:6: (lv_VStructural_features_16_0= ruleVStructuralFeatures )
                    	    {
                    	    // InternalVmsc.g:774:6: (lv_VStructural_features_16_0= ruleVStructuralFeatures )
                    	    // InternalVmsc.g:775:7: lv_VStructural_features_16_0= ruleVStructuralFeatures
                    	    {

                    	    							newCompositeNode(grammarAccess.getVClassAccess().getVStructural_featuresVStructuralFeaturesParserRuleCall_8_6_2_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_VStructural_features_16_0=ruleVStructuralFeatures();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getVClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"VStructural_features",
                    	    								lv_VStructural_features_16_0,
                    	    								"org.xtext.example.vmsc.Vmsc.VStructuralFeatures");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    otherlv_17=(Token)match(input,16,FOLLOW_15); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getVClassAccess().getRightCurlyBracketKeyword_8_6_3());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,21,FOLLOW_9); 

                    				newLeafNode(otherlv_18, grammarAccess.getVClassAccess().getRightSquareBracketKeyword_8_7());
                    			
                    otherlv_19=(Token)match(input,15,FOLLOW_20); 

                    				newLeafNode(otherlv_19, grammarAccess.getVClassAccess().getCommaKeyword_8_8());
                    			

                    }
                    break;

            }

            // InternalVmsc.g:806:3: (otherlv_20= 'VSuperType' otherlv_21= ':' otherlv_22= '[' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ']' otherlv_27= ',' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalVmsc.g:807:4: otherlv_20= 'VSuperType' otherlv_21= ':' otherlv_22= '[' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ']' otherlv_27= ','
                    {
                    otherlv_20=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_20, grammarAccess.getVClassAccess().getVSuperTypeKeyword_9_0());
                    			
                    otherlv_21=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_21, grammarAccess.getVClassAccess().getColonKeyword_9_1());
                    			
                    otherlv_22=(Token)match(input,20,FOLLOW_6); 

                    				newLeafNode(otherlv_22, grammarAccess.getVClassAccess().getLeftSquareBracketKeyword_9_2());
                    			
                    // InternalVmsc.g:819:4: ( ( ruleEString ) )
                    // InternalVmsc.g:820:5: ( ruleEString )
                    {
                    // InternalVmsc.g:820:5: ( ruleEString )
                    // InternalVmsc.g:821:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getVClassAccess().getVSuperTypeVClassCrossReference_9_3_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalVmsc.g:835:4: (otherlv_24= ',' ( ( ruleEString ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==15) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalVmsc.g:836:5: otherlv_24= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_24=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getVClassAccess().getCommaKeyword_9_4_0());
                    	    				
                    	    // InternalVmsc.g:840:5: ( ( ruleEString ) )
                    	    // InternalVmsc.g:841:6: ( ruleEString )
                    	    {
                    	    // InternalVmsc.g:841:6: ( ruleEString )
                    	    // InternalVmsc.g:842:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getVClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getVClassAccess().getVSuperTypeVClassCrossReference_9_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,21,FOLLOW_9); 

                    				newLeafNode(otherlv_26, grammarAccess.getVClassAccess().getRightSquareBracketKeyword_9_5());
                    			
                    otherlv_27=(Token)match(input,15,FOLLOW_21); 

                    				newLeafNode(otherlv_27, grammarAccess.getVClassAccess().getCommaKeyword_9_6());
                    			

                    }
                    break;

            }

            // InternalVmsc.g:866:3: ( ( (lv_IsAbstract_28_0= 'IsAbstract' ) ) otherlv_29= ':' otherlv_30= 'True' otherlv_31= ',' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalVmsc.g:867:4: ( (lv_IsAbstract_28_0= 'IsAbstract' ) ) otherlv_29= ':' otherlv_30= 'True' otherlv_31= ','
                    {
                    // InternalVmsc.g:867:4: ( (lv_IsAbstract_28_0= 'IsAbstract' ) )
                    // InternalVmsc.g:868:5: (lv_IsAbstract_28_0= 'IsAbstract' )
                    {
                    // InternalVmsc.g:868:5: (lv_IsAbstract_28_0= 'IsAbstract' )
                    // InternalVmsc.g:869:6: lv_IsAbstract_28_0= 'IsAbstract'
                    {
                    lv_IsAbstract_28_0=(Token)match(input,29,FOLLOW_3); 

                    						newLeafNode(lv_IsAbstract_28_0, grammarAccess.getVClassAccess().getIsAbstractIsAbstractKeyword_10_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVClassRule());
                    						}
                    						setWithLastConsumed(current, "IsAbstract", lv_IsAbstract_28_0 != null, "IsAbstract");
                    					

                    }


                    }

                    otherlv_29=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_29, grammarAccess.getVClassAccess().getColonKeyword_10_1());
                    			
                    otherlv_30=(Token)match(input,24,FOLLOW_9); 

                    				newLeafNode(otherlv_30, grammarAccess.getVClassAccess().getTrueKeyword_10_2());
                    			
                    otherlv_31=(Token)match(input,15,FOLLOW_22); 

                    				newLeafNode(otherlv_31, grammarAccess.getVClassAccess().getCommaKeyword_10_3());
                    			

                    }
                    break;

            }

            // InternalVmsc.g:894:3: ( ( (lv_IsInterface_32_0= 'IsInterface' ) ) otherlv_33= ':' otherlv_34= 'True' otherlv_35= ',' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalVmsc.g:895:4: ( (lv_IsInterface_32_0= 'IsInterface' ) ) otherlv_33= ':' otherlv_34= 'True' otherlv_35= ','
                    {
                    // InternalVmsc.g:895:4: ( (lv_IsInterface_32_0= 'IsInterface' ) )
                    // InternalVmsc.g:896:5: (lv_IsInterface_32_0= 'IsInterface' )
                    {
                    // InternalVmsc.g:896:5: (lv_IsInterface_32_0= 'IsInterface' )
                    // InternalVmsc.g:897:6: lv_IsInterface_32_0= 'IsInterface'
                    {
                    lv_IsInterface_32_0=(Token)match(input,30,FOLLOW_3); 

                    						newLeafNode(lv_IsInterface_32_0, grammarAccess.getVClassAccess().getIsInterfaceIsInterfaceKeyword_11_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVClassRule());
                    						}
                    						setWithLastConsumed(current, "IsInterface", lv_IsInterface_32_0 != null, "IsInterface");
                    					

                    }


                    }

                    otherlv_33=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_33, grammarAccess.getVClassAccess().getColonKeyword_11_1());
                    			
                    otherlv_34=(Token)match(input,24,FOLLOW_9); 

                    				newLeafNode(otherlv_34, grammarAccess.getVClassAccess().getTrueKeyword_11_2());
                    			
                    otherlv_35=(Token)match(input,15,FOLLOW_14); 

                    				newLeafNode(otherlv_35, grammarAccess.getVClassAccess().getCommaKeyword_11_3());
                    			

                    }
                    break;

            }

            otherlv_36=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_36, grammarAccess.getVClassAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVClass"


    // $ANTLR start "entryRuleEInt"
    // InternalVmsc.g:930:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalVmsc.g:930:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalVmsc.g:931:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalVmsc.g:937:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalVmsc.g:943:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalVmsc.g:944:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalVmsc.g:944:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalVmsc.g:945:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalVmsc.g:945:3: (kw= '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalVmsc.g:946:4: kw= '-'
                    {
                    kw=(Token)match(input,31,FOLLOW_23); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleVAttribute"
    // InternalVmsc.g:963:1: entryRuleVAttribute returns [EObject current=null] : iv_ruleVAttribute= ruleVAttribute EOF ;
    public final EObject entryRuleVAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVAttribute = null;


        try {
            // InternalVmsc.g:963:51: (iv_ruleVAttribute= ruleVAttribute EOF )
            // InternalVmsc.g:964:2: iv_ruleVAttribute= ruleVAttribute EOF
            {
             newCompositeNode(grammarAccess.getVAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVAttribute=ruleVAttribute();

            state._fsp--;

             current =iv_ruleVAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVAttribute"


    // $ANTLR start "ruleVAttribute"
    // InternalVmsc.g:970:1: ruleVAttribute returns [EObject current=null] : ( () otherlv_1= 'VAttribute' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' ( (lv_IsChangeable_8_0= 'IsChangeable' ) )? ( (lv_IsOrdered_9_0= 'IsOrdered' ) )? ( (lv_IsTransient_10_0= 'IsTransient' ) )? ( (lv_IsUnsettable_11_0= 'IsUnsettable' ) )? ( (lv_IsVolatile_12_0= 'IsVolatile' ) )? ( (lv_IsDerived_13_0= 'IsDerived' ) )? ( (lv_IsUnique_14_0= 'IsUnique' ) )? (otherlv_15= 'LowerBound' otherlv_16= ':' ( (lv_LowerBound_17_0= ruleEInt ) ) otherlv_18= ',' )? (otherlv_19= 'UpperBound' otherlv_20= ':' ( (lv_UpperBound_21_0= ruleEInt ) ) otherlv_22= ',' )? (otherlv_23= 'VType' otherlv_24= ':' ( (lv_VType_25_0= ruleVType ) ) )? otherlv_26= '}' ) ;
    public final EObject ruleVAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_IsChangeable_8_0=null;
        Token lv_IsOrdered_9_0=null;
        Token lv_IsTransient_10_0=null;
        Token lv_IsUnsettable_11_0=null;
        Token lv_IsVolatile_12_0=null;
        Token lv_IsDerived_13_0=null;
        Token lv_IsUnique_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_name_6_0 = null;

        AntlrDatatypeRuleToken lv_LowerBound_17_0 = null;

        AntlrDatatypeRuleToken lv_UpperBound_21_0 = null;

        EObject lv_VType_25_0 = null;



        	enterRule();

        try {
            // InternalVmsc.g:976:2: ( ( () otherlv_1= 'VAttribute' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' ( (lv_IsChangeable_8_0= 'IsChangeable' ) )? ( (lv_IsOrdered_9_0= 'IsOrdered' ) )? ( (lv_IsTransient_10_0= 'IsTransient' ) )? ( (lv_IsUnsettable_11_0= 'IsUnsettable' ) )? ( (lv_IsVolatile_12_0= 'IsVolatile' ) )? ( (lv_IsDerived_13_0= 'IsDerived' ) )? ( (lv_IsUnique_14_0= 'IsUnique' ) )? (otherlv_15= 'LowerBound' otherlv_16= ':' ( (lv_LowerBound_17_0= ruleEInt ) ) otherlv_18= ',' )? (otherlv_19= 'UpperBound' otherlv_20= ':' ( (lv_UpperBound_21_0= ruleEInt ) ) otherlv_22= ',' )? (otherlv_23= 'VType' otherlv_24= ':' ( (lv_VType_25_0= ruleVType ) ) )? otherlv_26= '}' ) )
            // InternalVmsc.g:977:2: ( () otherlv_1= 'VAttribute' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' ( (lv_IsChangeable_8_0= 'IsChangeable' ) )? ( (lv_IsOrdered_9_0= 'IsOrdered' ) )? ( (lv_IsTransient_10_0= 'IsTransient' ) )? ( (lv_IsUnsettable_11_0= 'IsUnsettable' ) )? ( (lv_IsVolatile_12_0= 'IsVolatile' ) )? ( (lv_IsDerived_13_0= 'IsDerived' ) )? ( (lv_IsUnique_14_0= 'IsUnique' ) )? (otherlv_15= 'LowerBound' otherlv_16= ':' ( (lv_LowerBound_17_0= ruleEInt ) ) otherlv_18= ',' )? (otherlv_19= 'UpperBound' otherlv_20= ':' ( (lv_UpperBound_21_0= ruleEInt ) ) otherlv_22= ',' )? (otherlv_23= 'VType' otherlv_24= ':' ( (lv_VType_25_0= ruleVType ) ) )? otherlv_26= '}' )
            {
            // InternalVmsc.g:977:2: ( () otherlv_1= 'VAttribute' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' ( (lv_IsChangeable_8_0= 'IsChangeable' ) )? ( (lv_IsOrdered_9_0= 'IsOrdered' ) )? ( (lv_IsTransient_10_0= 'IsTransient' ) )? ( (lv_IsUnsettable_11_0= 'IsUnsettable' ) )? ( (lv_IsVolatile_12_0= 'IsVolatile' ) )? ( (lv_IsDerived_13_0= 'IsDerived' ) )? ( (lv_IsUnique_14_0= 'IsUnique' ) )? (otherlv_15= 'LowerBound' otherlv_16= ':' ( (lv_LowerBound_17_0= ruleEInt ) ) otherlv_18= ',' )? (otherlv_19= 'UpperBound' otherlv_20= ':' ( (lv_UpperBound_21_0= ruleEInt ) ) otherlv_22= ',' )? (otherlv_23= 'VType' otherlv_24= ':' ( (lv_VType_25_0= ruleVType ) ) )? otherlv_26= '}' )
            // InternalVmsc.g:978:3: () otherlv_1= 'VAttribute' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' ( (lv_IsChangeable_8_0= 'IsChangeable' ) )? ( (lv_IsOrdered_9_0= 'IsOrdered' ) )? ( (lv_IsTransient_10_0= 'IsTransient' ) )? ( (lv_IsUnsettable_11_0= 'IsUnsettable' ) )? ( (lv_IsVolatile_12_0= 'IsVolatile' ) )? ( (lv_IsDerived_13_0= 'IsDerived' ) )? ( (lv_IsUnique_14_0= 'IsUnique' ) )? (otherlv_15= 'LowerBound' otherlv_16= ':' ( (lv_LowerBound_17_0= ruleEInt ) ) otherlv_18= ',' )? (otherlv_19= 'UpperBound' otherlv_20= ':' ( (lv_UpperBound_21_0= ruleEInt ) ) otherlv_22= ',' )? (otherlv_23= 'VType' otherlv_24= ':' ( (lv_VType_25_0= ruleVType ) ) )? otherlv_26= '}'
            {
            // InternalVmsc.g:978:3: ()
            // InternalVmsc.g:979:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVAttributeAccess().getVAttributeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVAttributeAccess().getVAttributeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getVAttributeAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getVAttributeAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getVAttributeAccess().getNameKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getVAttributeAccess().getColonKeyword_5());
            		
            // InternalVmsc.g:1005:3: ( (lv_name_6_0= ruleEString ) )
            // InternalVmsc.g:1006:4: (lv_name_6_0= ruleEString )
            {
            // InternalVmsc.g:1006:4: (lv_name_6_0= ruleEString )
            // InternalVmsc.g:1007:5: lv_name_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVAttributeAccess().getNameEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_6_0,
            						"org.xtext.example.vmsc.Vmsc.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_24); 

            			newLeafNode(otherlv_7, grammarAccess.getVAttributeAccess().getCommaKeyword_7());
            		
            // InternalVmsc.g:1028:3: ( (lv_IsChangeable_8_0= 'IsChangeable' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalVmsc.g:1029:4: (lv_IsChangeable_8_0= 'IsChangeable' )
                    {
                    // InternalVmsc.g:1029:4: (lv_IsChangeable_8_0= 'IsChangeable' )
                    // InternalVmsc.g:1030:5: lv_IsChangeable_8_0= 'IsChangeable'
                    {
                    lv_IsChangeable_8_0=(Token)match(input,33,FOLLOW_25); 

                    					newLeafNode(lv_IsChangeable_8_0, grammarAccess.getVAttributeAccess().getIsChangeableIsChangeableKeyword_8_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVAttributeRule());
                    					}
                    					setWithLastConsumed(current, "IsChangeable", lv_IsChangeable_8_0 != null, "IsChangeable");
                    				

                    }


                    }
                    break;

            }

            // InternalVmsc.g:1042:3: ( (lv_IsOrdered_9_0= 'IsOrdered' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalVmsc.g:1043:4: (lv_IsOrdered_9_0= 'IsOrdered' )
                    {
                    // InternalVmsc.g:1043:4: (lv_IsOrdered_9_0= 'IsOrdered' )
                    // InternalVmsc.g:1044:5: lv_IsOrdered_9_0= 'IsOrdered'
                    {
                    lv_IsOrdered_9_0=(Token)match(input,34,FOLLOW_26); 

                    					newLeafNode(lv_IsOrdered_9_0, grammarAccess.getVAttributeAccess().getIsOrderedIsOrderedKeyword_9_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVAttributeRule());
                    					}
                    					setWithLastConsumed(current, "IsOrdered", lv_IsOrdered_9_0 != null, "IsOrdered");
                    				

                    }


                    }
                    break;

            }

            // InternalVmsc.g:1056:3: ( (lv_IsTransient_10_0= 'IsTransient' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalVmsc.g:1057:4: (lv_IsTransient_10_0= 'IsTransient' )
                    {
                    // InternalVmsc.g:1057:4: (lv_IsTransient_10_0= 'IsTransient' )
                    // InternalVmsc.g:1058:5: lv_IsTransient_10_0= 'IsTransient'
                    {
                    lv_IsTransient_10_0=(Token)match(input,35,FOLLOW_27); 

                    					newLeafNode(lv_IsTransient_10_0, grammarAccess.getVAttributeAccess().getIsTransientIsTransientKeyword_10_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVAttributeRule());
                    					}
                    					setWithLastConsumed(current, "IsTransient", lv_IsTransient_10_0 != null, "IsTransient");
                    				

                    }


                    }
                    break;

            }

            // InternalVmsc.g:1070:3: ( (lv_IsUnsettable_11_0= 'IsUnsettable' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalVmsc.g:1071:4: (lv_IsUnsettable_11_0= 'IsUnsettable' )
                    {
                    // InternalVmsc.g:1071:4: (lv_IsUnsettable_11_0= 'IsUnsettable' )
                    // InternalVmsc.g:1072:5: lv_IsUnsettable_11_0= 'IsUnsettable'
                    {
                    lv_IsUnsettable_11_0=(Token)match(input,36,FOLLOW_28); 

                    					newLeafNode(lv_IsUnsettable_11_0, grammarAccess.getVAttributeAccess().getIsUnsettableIsUnsettableKeyword_11_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVAttributeRule());
                    					}
                    					setWithLastConsumed(current, "IsUnsettable", lv_IsUnsettable_11_0 != null, "IsUnsettable");
                    				

                    }


                    }
                    break;

            }

            // InternalVmsc.g:1084:3: ( (lv_IsVolatile_12_0= 'IsVolatile' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==37) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalVmsc.g:1085:4: (lv_IsVolatile_12_0= 'IsVolatile' )
                    {
                    // InternalVmsc.g:1085:4: (lv_IsVolatile_12_0= 'IsVolatile' )
                    // InternalVmsc.g:1086:5: lv_IsVolatile_12_0= 'IsVolatile'
                    {
                    lv_IsVolatile_12_0=(Token)match(input,37,FOLLOW_29); 

                    					newLeafNode(lv_IsVolatile_12_0, grammarAccess.getVAttributeAccess().getIsVolatileIsVolatileKeyword_12_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVAttributeRule());
                    					}
                    					setWithLastConsumed(current, "IsVolatile", lv_IsVolatile_12_0 != null, "IsVolatile");
                    				

                    }


                    }
                    break;

            }

            // InternalVmsc.g:1098:3: ( (lv_IsDerived_13_0= 'IsDerived' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalVmsc.g:1099:4: (lv_IsDerived_13_0= 'IsDerived' )
                    {
                    // InternalVmsc.g:1099:4: (lv_IsDerived_13_0= 'IsDerived' )
                    // InternalVmsc.g:1100:5: lv_IsDerived_13_0= 'IsDerived'
                    {
                    lv_IsDerived_13_0=(Token)match(input,38,FOLLOW_30); 

                    					newLeafNode(lv_IsDerived_13_0, grammarAccess.getVAttributeAccess().getIsDerivedIsDerivedKeyword_13_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVAttributeRule());
                    					}
                    					setWithLastConsumed(current, "IsDerived", lv_IsDerived_13_0 != null, "IsDerived");
                    				

                    }


                    }
                    break;

            }

            // InternalVmsc.g:1112:3: ( (lv_IsUnique_14_0= 'IsUnique' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalVmsc.g:1113:4: (lv_IsUnique_14_0= 'IsUnique' )
                    {
                    // InternalVmsc.g:1113:4: (lv_IsUnique_14_0= 'IsUnique' )
                    // InternalVmsc.g:1114:5: lv_IsUnique_14_0= 'IsUnique'
                    {
                    lv_IsUnique_14_0=(Token)match(input,39,FOLLOW_31); 

                    					newLeafNode(lv_IsUnique_14_0, grammarAccess.getVAttributeAccess().getIsUniqueIsUniqueKeyword_14_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVAttributeRule());
                    					}
                    					setWithLastConsumed(current, "IsUnique", lv_IsUnique_14_0 != null, "IsUnique");
                    				

                    }


                    }
                    break;

            }

            // InternalVmsc.g:1126:3: (otherlv_15= 'LowerBound' otherlv_16= ':' ( (lv_LowerBound_17_0= ruleEInt ) ) otherlv_18= ',' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalVmsc.g:1127:4: otherlv_15= 'LowerBound' otherlv_16= ':' ( (lv_LowerBound_17_0= ruleEInt ) ) otherlv_18= ','
                    {
                    otherlv_15=(Token)match(input,40,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getVAttributeAccess().getLowerBoundKeyword_15_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_32); 

                    				newLeafNode(otherlv_16, grammarAccess.getVAttributeAccess().getColonKeyword_15_1());
                    			
                    // InternalVmsc.g:1135:4: ( (lv_LowerBound_17_0= ruleEInt ) )
                    // InternalVmsc.g:1136:5: (lv_LowerBound_17_0= ruleEInt )
                    {
                    // InternalVmsc.g:1136:5: (lv_LowerBound_17_0= ruleEInt )
                    // InternalVmsc.g:1137:6: lv_LowerBound_17_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getVAttributeAccess().getLowerBoundEIntParserRuleCall_15_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_LowerBound_17_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVAttributeRule());
                    						}
                    						set(
                    							current,
                    							"LowerBound",
                    							lv_LowerBound_17_0,
                    							"org.xtext.example.vmsc.Vmsc.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_18=(Token)match(input,15,FOLLOW_33); 

                    				newLeafNode(otherlv_18, grammarAccess.getVAttributeAccess().getCommaKeyword_15_3());
                    			

                    }
                    break;

            }

            // InternalVmsc.g:1159:3: (otherlv_19= 'UpperBound' otherlv_20= ':' ( (lv_UpperBound_21_0= ruleEInt ) ) otherlv_22= ',' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==41) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalVmsc.g:1160:4: otherlv_19= 'UpperBound' otherlv_20= ':' ( (lv_UpperBound_21_0= ruleEInt ) ) otherlv_22= ','
                    {
                    otherlv_19=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_19, grammarAccess.getVAttributeAccess().getUpperBoundKeyword_16_0());
                    			
                    otherlv_20=(Token)match(input,12,FOLLOW_32); 

                    				newLeafNode(otherlv_20, grammarAccess.getVAttributeAccess().getColonKeyword_16_1());
                    			
                    // InternalVmsc.g:1168:4: ( (lv_UpperBound_21_0= ruleEInt ) )
                    // InternalVmsc.g:1169:5: (lv_UpperBound_21_0= ruleEInt )
                    {
                    // InternalVmsc.g:1169:5: (lv_UpperBound_21_0= ruleEInt )
                    // InternalVmsc.g:1170:6: lv_UpperBound_21_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getVAttributeAccess().getUpperBoundEIntParserRuleCall_16_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_UpperBound_21_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVAttributeRule());
                    						}
                    						set(
                    							current,
                    							"UpperBound",
                    							lv_UpperBound_21_0,
                    							"org.xtext.example.vmsc.Vmsc.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_22=(Token)match(input,15,FOLLOW_34); 

                    				newLeafNode(otherlv_22, grammarAccess.getVAttributeAccess().getCommaKeyword_16_3());
                    			

                    }
                    break;

            }

            // InternalVmsc.g:1192:3: (otherlv_23= 'VType' otherlv_24= ':' ( (lv_VType_25_0= ruleVType ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==42) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalVmsc.g:1193:4: otherlv_23= 'VType' otherlv_24= ':' ( (lv_VType_25_0= ruleVType ) )
                    {
                    otherlv_23=(Token)match(input,42,FOLLOW_3); 

                    				newLeafNode(otherlv_23, grammarAccess.getVAttributeAccess().getVTypeKeyword_17_0());
                    			
                    otherlv_24=(Token)match(input,12,FOLLOW_35); 

                    				newLeafNode(otherlv_24, grammarAccess.getVAttributeAccess().getColonKeyword_17_1());
                    			
                    // InternalVmsc.g:1201:4: ( (lv_VType_25_0= ruleVType ) )
                    // InternalVmsc.g:1202:5: (lv_VType_25_0= ruleVType )
                    {
                    // InternalVmsc.g:1202:5: (lv_VType_25_0= ruleVType )
                    // InternalVmsc.g:1203:6: lv_VType_25_0= ruleVType
                    {

                    						newCompositeNode(grammarAccess.getVAttributeAccess().getVTypeVTypeParserRuleCall_17_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_VType_25_0=ruleVType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVAttributeRule());
                    						}
                    						set(
                    							current,
                    							"VType",
                    							lv_VType_25_0,
                    							"org.xtext.example.vmsc.Vmsc.VType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_26=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_26, grammarAccess.getVAttributeAccess().getRightCurlyBracketKeyword_18());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVAttribute"


    // $ANTLR start "entryRuleVReference"
    // InternalVmsc.g:1229:1: entryRuleVReference returns [EObject current=null] : iv_ruleVReference= ruleVReference EOF ;
    public final EObject entryRuleVReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVReference = null;


        try {
            // InternalVmsc.g:1229:51: (iv_ruleVReference= ruleVReference EOF )
            // InternalVmsc.g:1230:2: iv_ruleVReference= ruleVReference EOF
            {
             newCompositeNode(grammarAccess.getVReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVReference=ruleVReference();

            state._fsp--;

             current =iv_ruleVReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVReference"


    // $ANTLR start "ruleVReference"
    // InternalVmsc.g:1236:1: ruleVReference returns [EObject current=null] : ( () otherlv_1= 'VReference' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' ( ( (lv_IsChangeable_8_0= 'IsChangeable' ) ) otherlv_9= ':' otherlv_10= 'True' otherlv_11= ',' )? ( ( (lv_IsOrdered_12_0= 'IsOrdered' ) ) otherlv_13= ':' otherlv_14= 'True' otherlv_15= ',' )? ( ( (lv_IsTransient_16_0= 'IsTransient' ) ) otherlv_17= ':' otherlv_18= 'True' otherlv_19= ',' )? ( ( (lv_IsUnsettable_20_0= 'IsUnsettable' ) ) otherlv_21= ':' otherlv_22= 'True' otherlv_23= ',' )? ( ( (lv_IsVolatile_24_0= 'IsVolatile' ) ) otherlv_25= ':' otherlv_26= 'True' otherlv_27= ',' )? ( ( (lv_IsDerived_28_0= 'IsDerived' ) ) otherlv_29= ':' otherlv_30= 'True' otherlv_31= ',' )? ( ( (lv_IsUnique_32_0= 'IsUnique' ) ) otherlv_33= ':' otherlv_34= 'True' otherlv_35= ',' )? ( ( (lv_IsContainer_36_0= 'IsContainer' ) ) otherlv_37= ':' otherlv_38= 'True' otherlv_39= ',' )? ( ( (lv_IsContainment_40_0= 'IsContainment' ) ) otherlv_41= ':' otherlv_42= 'True' otherlv_43= ',' )? (otherlv_44= 'LowerBound' otherlv_45= ':' ( (lv_LowerBound_46_0= ruleEInt ) ) otherlv_47= ',' )? (otherlv_48= 'UpperBound' otherlv_49= ':' ( (lv_UpperBound_50_0= ruleEInt ) ) otherlv_51= ',' )? (otherlv_52= 'VType' otherlv_53= ':' ( (lv_VType_54_0= ruleVClass ) ) )? otherlv_55= '}' ) ;
    public final EObject ruleVReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_IsChangeable_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_IsOrdered_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_IsTransient_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_IsUnsettable_20_0=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token lv_IsVolatile_24_0=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token lv_IsDerived_28_0=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token lv_IsUnique_32_0=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token lv_IsContainer_36_0=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token lv_IsContainment_40_0=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        Token otherlv_45=null;
        Token otherlv_47=null;
        Token otherlv_48=null;
        Token otherlv_49=null;
        Token otherlv_51=null;
        Token otherlv_52=null;
        Token otherlv_53=null;
        Token otherlv_55=null;
        AntlrDatatypeRuleToken lv_name_6_0 = null;

        AntlrDatatypeRuleToken lv_LowerBound_46_0 = null;

        AntlrDatatypeRuleToken lv_UpperBound_50_0 = null;

        EObject lv_VType_54_0 = null;



        	enterRule();

        try {
            // InternalVmsc.g:1242:2: ( ( () otherlv_1= 'VReference' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' ( ( (lv_IsChangeable_8_0= 'IsChangeable' ) ) otherlv_9= ':' otherlv_10= 'True' otherlv_11= ',' )? ( ( (lv_IsOrdered_12_0= 'IsOrdered' ) ) otherlv_13= ':' otherlv_14= 'True' otherlv_15= ',' )? ( ( (lv_IsTransient_16_0= 'IsTransient' ) ) otherlv_17= ':' otherlv_18= 'True' otherlv_19= ',' )? ( ( (lv_IsUnsettable_20_0= 'IsUnsettable' ) ) otherlv_21= ':' otherlv_22= 'True' otherlv_23= ',' )? ( ( (lv_IsVolatile_24_0= 'IsVolatile' ) ) otherlv_25= ':' otherlv_26= 'True' otherlv_27= ',' )? ( ( (lv_IsDerived_28_0= 'IsDerived' ) ) otherlv_29= ':' otherlv_30= 'True' otherlv_31= ',' )? ( ( (lv_IsUnique_32_0= 'IsUnique' ) ) otherlv_33= ':' otherlv_34= 'True' otherlv_35= ',' )? ( ( (lv_IsContainer_36_0= 'IsContainer' ) ) otherlv_37= ':' otherlv_38= 'True' otherlv_39= ',' )? ( ( (lv_IsContainment_40_0= 'IsContainment' ) ) otherlv_41= ':' otherlv_42= 'True' otherlv_43= ',' )? (otherlv_44= 'LowerBound' otherlv_45= ':' ( (lv_LowerBound_46_0= ruleEInt ) ) otherlv_47= ',' )? (otherlv_48= 'UpperBound' otherlv_49= ':' ( (lv_UpperBound_50_0= ruleEInt ) ) otherlv_51= ',' )? (otherlv_52= 'VType' otherlv_53= ':' ( (lv_VType_54_0= ruleVClass ) ) )? otherlv_55= '}' ) )
            // InternalVmsc.g:1243:2: ( () otherlv_1= 'VReference' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' ( ( (lv_IsChangeable_8_0= 'IsChangeable' ) ) otherlv_9= ':' otherlv_10= 'True' otherlv_11= ',' )? ( ( (lv_IsOrdered_12_0= 'IsOrdered' ) ) otherlv_13= ':' otherlv_14= 'True' otherlv_15= ',' )? ( ( (lv_IsTransient_16_0= 'IsTransient' ) ) otherlv_17= ':' otherlv_18= 'True' otherlv_19= ',' )? ( ( (lv_IsUnsettable_20_0= 'IsUnsettable' ) ) otherlv_21= ':' otherlv_22= 'True' otherlv_23= ',' )? ( ( (lv_IsVolatile_24_0= 'IsVolatile' ) ) otherlv_25= ':' otherlv_26= 'True' otherlv_27= ',' )? ( ( (lv_IsDerived_28_0= 'IsDerived' ) ) otherlv_29= ':' otherlv_30= 'True' otherlv_31= ',' )? ( ( (lv_IsUnique_32_0= 'IsUnique' ) ) otherlv_33= ':' otherlv_34= 'True' otherlv_35= ',' )? ( ( (lv_IsContainer_36_0= 'IsContainer' ) ) otherlv_37= ':' otherlv_38= 'True' otherlv_39= ',' )? ( ( (lv_IsContainment_40_0= 'IsContainment' ) ) otherlv_41= ':' otherlv_42= 'True' otherlv_43= ',' )? (otherlv_44= 'LowerBound' otherlv_45= ':' ( (lv_LowerBound_46_0= ruleEInt ) ) otherlv_47= ',' )? (otherlv_48= 'UpperBound' otherlv_49= ':' ( (lv_UpperBound_50_0= ruleEInt ) ) otherlv_51= ',' )? (otherlv_52= 'VType' otherlv_53= ':' ( (lv_VType_54_0= ruleVClass ) ) )? otherlv_55= '}' )
            {
            // InternalVmsc.g:1243:2: ( () otherlv_1= 'VReference' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' ( ( (lv_IsChangeable_8_0= 'IsChangeable' ) ) otherlv_9= ':' otherlv_10= 'True' otherlv_11= ',' )? ( ( (lv_IsOrdered_12_0= 'IsOrdered' ) ) otherlv_13= ':' otherlv_14= 'True' otherlv_15= ',' )? ( ( (lv_IsTransient_16_0= 'IsTransient' ) ) otherlv_17= ':' otherlv_18= 'True' otherlv_19= ',' )? ( ( (lv_IsUnsettable_20_0= 'IsUnsettable' ) ) otherlv_21= ':' otherlv_22= 'True' otherlv_23= ',' )? ( ( (lv_IsVolatile_24_0= 'IsVolatile' ) ) otherlv_25= ':' otherlv_26= 'True' otherlv_27= ',' )? ( ( (lv_IsDerived_28_0= 'IsDerived' ) ) otherlv_29= ':' otherlv_30= 'True' otherlv_31= ',' )? ( ( (lv_IsUnique_32_0= 'IsUnique' ) ) otherlv_33= ':' otherlv_34= 'True' otherlv_35= ',' )? ( ( (lv_IsContainer_36_0= 'IsContainer' ) ) otherlv_37= ':' otherlv_38= 'True' otherlv_39= ',' )? ( ( (lv_IsContainment_40_0= 'IsContainment' ) ) otherlv_41= ':' otherlv_42= 'True' otherlv_43= ',' )? (otherlv_44= 'LowerBound' otherlv_45= ':' ( (lv_LowerBound_46_0= ruleEInt ) ) otherlv_47= ',' )? (otherlv_48= 'UpperBound' otherlv_49= ':' ( (lv_UpperBound_50_0= ruleEInt ) ) otherlv_51= ',' )? (otherlv_52= 'VType' otherlv_53= ':' ( (lv_VType_54_0= ruleVClass ) ) )? otherlv_55= '}' )
            // InternalVmsc.g:1244:3: () otherlv_1= 'VReference' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' ( ( (lv_IsChangeable_8_0= 'IsChangeable' ) ) otherlv_9= ':' otherlv_10= 'True' otherlv_11= ',' )? ( ( (lv_IsOrdered_12_0= 'IsOrdered' ) ) otherlv_13= ':' otherlv_14= 'True' otherlv_15= ',' )? ( ( (lv_IsTransient_16_0= 'IsTransient' ) ) otherlv_17= ':' otherlv_18= 'True' otherlv_19= ',' )? ( ( (lv_IsUnsettable_20_0= 'IsUnsettable' ) ) otherlv_21= ':' otherlv_22= 'True' otherlv_23= ',' )? ( ( (lv_IsVolatile_24_0= 'IsVolatile' ) ) otherlv_25= ':' otherlv_26= 'True' otherlv_27= ',' )? ( ( (lv_IsDerived_28_0= 'IsDerived' ) ) otherlv_29= ':' otherlv_30= 'True' otherlv_31= ',' )? ( ( (lv_IsUnique_32_0= 'IsUnique' ) ) otherlv_33= ':' otherlv_34= 'True' otherlv_35= ',' )? ( ( (lv_IsContainer_36_0= 'IsContainer' ) ) otherlv_37= ':' otherlv_38= 'True' otherlv_39= ',' )? ( ( (lv_IsContainment_40_0= 'IsContainment' ) ) otherlv_41= ':' otherlv_42= 'True' otherlv_43= ',' )? (otherlv_44= 'LowerBound' otherlv_45= ':' ( (lv_LowerBound_46_0= ruleEInt ) ) otherlv_47= ',' )? (otherlv_48= 'UpperBound' otherlv_49= ':' ( (lv_UpperBound_50_0= ruleEInt ) ) otherlv_51= ',' )? (otherlv_52= 'VType' otherlv_53= ':' ( (lv_VType_54_0= ruleVClass ) ) )? otherlv_55= '}'
            {
            // InternalVmsc.g:1244:3: ()
            // InternalVmsc.g:1245:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVReferenceAccess().getVReferenceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVReferenceAccess().getVReferenceKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getVReferenceAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getVReferenceAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getVReferenceAccess().getNameKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getVReferenceAccess().getColonKeyword_5());
            		
            // InternalVmsc.g:1271:3: ( (lv_name_6_0= ruleEString ) )
            // InternalVmsc.g:1272:4: (lv_name_6_0= ruleEString )
            {
            // InternalVmsc.g:1272:4: (lv_name_6_0= ruleEString )
            // InternalVmsc.g:1273:5: lv_name_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVReferenceAccess().getNameEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVReferenceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_6_0,
            						"org.xtext.example.vmsc.Vmsc.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_36); 

            			newLeafNode(otherlv_7, grammarAccess.getVReferenceAccess().getCommaKeyword_7());
            		
            // InternalVmsc.g:1294:3: ( ( (lv_IsChangeable_8_0= 'IsChangeable' ) ) otherlv_9= ':' otherlv_10= 'True' otherlv_11= ',' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==33) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalVmsc.g:1295:4: ( (lv_IsChangeable_8_0= 'IsChangeable' ) ) otherlv_9= ':' otherlv_10= 'True' otherlv_11= ','
                    {
                    // InternalVmsc.g:1295:4: ( (lv_IsChangeable_8_0= 'IsChangeable' ) )
                    // InternalVmsc.g:1296:5: (lv_IsChangeable_8_0= 'IsChangeable' )
                    {
                    // InternalVmsc.g:1296:5: (lv_IsChangeable_8_0= 'IsChangeable' )
                    // InternalVmsc.g:1297:6: lv_IsChangeable_8_0= 'IsChangeable'
                    {
                    lv_IsChangeable_8_0=(Token)match(input,33,FOLLOW_3); 

                    						newLeafNode(lv_IsChangeable_8_0, grammarAccess.getVReferenceAccess().getIsChangeableIsChangeableKeyword_8_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVReferenceRule());
                    						}
                    						setWithLastConsumed(current, "IsChangeable", lv_IsChangeable_8_0 != null, "IsChangeable");
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getVReferenceAccess().getColonKeyword_8_1());
                    			
                    otherlv_10=(Token)match(input,24,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getVReferenceAccess().getTrueKeyword_8_2());
                    			
                    otherlv_11=(Token)match(input,15,FOLLOW_37); 

                    				newLeafNode(otherlv_11, grammarAccess.getVReferenceAccess().getCommaKeyword_8_3());
                    			

                    }
                    break;

            }

            // InternalVmsc.g:1322:3: ( ( (lv_IsOrdered_12_0= 'IsOrdered' ) ) otherlv_13= ':' otherlv_14= 'True' otherlv_15= ',' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==34) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalVmsc.g:1323:4: ( (lv_IsOrdered_12_0= 'IsOrdered' ) ) otherlv_13= ':' otherlv_14= 'True' otherlv_15= ','
                    {
                    // InternalVmsc.g:1323:4: ( (lv_IsOrdered_12_0= 'IsOrdered' ) )
                    // InternalVmsc.g:1324:5: (lv_IsOrdered_12_0= 'IsOrdered' )
                    {
                    // InternalVmsc.g:1324:5: (lv_IsOrdered_12_0= 'IsOrdered' )
                    // InternalVmsc.g:1325:6: lv_IsOrdered_12_0= 'IsOrdered'
                    {
                    lv_IsOrdered_12_0=(Token)match(input,34,FOLLOW_3); 

                    						newLeafNode(lv_IsOrdered_12_0, grammarAccess.getVReferenceAccess().getIsOrderedIsOrderedKeyword_9_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVReferenceRule());
                    						}
                    						setWithLastConsumed(current, "IsOrdered", lv_IsOrdered_12_0 != null, "IsOrdered");
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_13, grammarAccess.getVReferenceAccess().getColonKeyword_9_1());
                    			
                    otherlv_14=(Token)match(input,24,FOLLOW_9); 

                    				newLeafNode(otherlv_14, grammarAccess.getVReferenceAccess().getTrueKeyword_9_2());
                    			
                    otherlv_15=(Token)match(input,15,FOLLOW_38); 

                    				newLeafNode(otherlv_15, grammarAccess.getVReferenceAccess().getCommaKeyword_9_3());
                    			

                    }
                    break;

            }

            // InternalVmsc.g:1350:3: ( ( (lv_IsTransient_16_0= 'IsTransient' ) ) otherlv_17= ':' otherlv_18= 'True' otherlv_19= ',' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==35) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalVmsc.g:1351:4: ( (lv_IsTransient_16_0= 'IsTransient' ) ) otherlv_17= ':' otherlv_18= 'True' otherlv_19= ','
                    {
                    // InternalVmsc.g:1351:4: ( (lv_IsTransient_16_0= 'IsTransient' ) )
                    // InternalVmsc.g:1352:5: (lv_IsTransient_16_0= 'IsTransient' )
                    {
                    // InternalVmsc.g:1352:5: (lv_IsTransient_16_0= 'IsTransient' )
                    // InternalVmsc.g:1353:6: lv_IsTransient_16_0= 'IsTransient'
                    {
                    lv_IsTransient_16_0=(Token)match(input,35,FOLLOW_3); 

                    						newLeafNode(lv_IsTransient_16_0, grammarAccess.getVReferenceAccess().getIsTransientIsTransientKeyword_10_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVReferenceRule());
                    						}
                    						setWithLastConsumed(current, "IsTransient", lv_IsTransient_16_0 != null, "IsTransient");
                    					

                    }


                    }

                    otherlv_17=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_17, grammarAccess.getVReferenceAccess().getColonKeyword_10_1());
                    			
                    otherlv_18=(Token)match(input,24,FOLLOW_9); 

                    				newLeafNode(otherlv_18, grammarAccess.getVReferenceAccess().getTrueKeyword_10_2());
                    			
                    otherlv_19=(Token)match(input,15,FOLLOW_39); 

                    				newLeafNode(otherlv_19, grammarAccess.getVReferenceAccess().getCommaKeyword_10_3());
                    			

                    }
                    break;

            }

            // InternalVmsc.g:1378:3: ( ( (lv_IsUnsettable_20_0= 'IsUnsettable' ) ) otherlv_21= ':' otherlv_22= 'True' otherlv_23= ',' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==36) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalVmsc.g:1379:4: ( (lv_IsUnsettable_20_0= 'IsUnsettable' ) ) otherlv_21= ':' otherlv_22= 'True' otherlv_23= ','
                    {
                    // InternalVmsc.g:1379:4: ( (lv_IsUnsettable_20_0= 'IsUnsettable' ) )
                    // InternalVmsc.g:1380:5: (lv_IsUnsettable_20_0= 'IsUnsettable' )
                    {
                    // InternalVmsc.g:1380:5: (lv_IsUnsettable_20_0= 'IsUnsettable' )
                    // InternalVmsc.g:1381:6: lv_IsUnsettable_20_0= 'IsUnsettable'
                    {
                    lv_IsUnsettable_20_0=(Token)match(input,36,FOLLOW_3); 

                    						newLeafNode(lv_IsUnsettable_20_0, grammarAccess.getVReferenceAccess().getIsUnsettableIsUnsettableKeyword_11_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVReferenceRule());
                    						}
                    						setWithLastConsumed(current, "IsUnsettable", lv_IsUnsettable_20_0 != null, "IsUnsettable");
                    					

                    }


                    }

                    otherlv_21=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_21, grammarAccess.getVReferenceAccess().getColonKeyword_11_1());
                    			
                    otherlv_22=(Token)match(input,24,FOLLOW_9); 

                    				newLeafNode(otherlv_22, grammarAccess.getVReferenceAccess().getTrueKeyword_11_2());
                    			
                    otherlv_23=(Token)match(input,15,FOLLOW_40); 

                    				newLeafNode(otherlv_23, grammarAccess.getVReferenceAccess().getCommaKeyword_11_3());
                    			

                    }
                    break;

            }

            // InternalVmsc.g:1406:3: ( ( (lv_IsVolatile_24_0= 'IsVolatile' ) ) otherlv_25= ':' otherlv_26= 'True' otherlv_27= ',' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==37) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalVmsc.g:1407:4: ( (lv_IsVolatile_24_0= 'IsVolatile' ) ) otherlv_25= ':' otherlv_26= 'True' otherlv_27= ','
                    {
                    // InternalVmsc.g:1407:4: ( (lv_IsVolatile_24_0= 'IsVolatile' ) )
                    // InternalVmsc.g:1408:5: (lv_IsVolatile_24_0= 'IsVolatile' )
                    {
                    // InternalVmsc.g:1408:5: (lv_IsVolatile_24_0= 'IsVolatile' )
                    // InternalVmsc.g:1409:6: lv_IsVolatile_24_0= 'IsVolatile'
                    {
                    lv_IsVolatile_24_0=(Token)match(input,37,FOLLOW_3); 

                    						newLeafNode(lv_IsVolatile_24_0, grammarAccess.getVReferenceAccess().getIsVolatileIsVolatileKeyword_12_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVReferenceRule());
                    						}
                    						setWithLastConsumed(current, "IsVolatile", lv_IsVolatile_24_0 != null, "IsVolatile");
                    					

                    }


                    }

                    otherlv_25=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_25, grammarAccess.getVReferenceAccess().getColonKeyword_12_1());
                    			
                    otherlv_26=(Token)match(input,24,FOLLOW_9); 

                    				newLeafNode(otherlv_26, grammarAccess.getVReferenceAccess().getTrueKeyword_12_2());
                    			
                    otherlv_27=(Token)match(input,15,FOLLOW_41); 

                    				newLeafNode(otherlv_27, grammarAccess.getVReferenceAccess().getCommaKeyword_12_3());
                    			

                    }
                    break;

            }

            // InternalVmsc.g:1434:3: ( ( (lv_IsDerived_28_0= 'IsDerived' ) ) otherlv_29= ':' otherlv_30= 'True' otherlv_31= ',' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==38) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalVmsc.g:1435:4: ( (lv_IsDerived_28_0= 'IsDerived' ) ) otherlv_29= ':' otherlv_30= 'True' otherlv_31= ','
                    {
                    // InternalVmsc.g:1435:4: ( (lv_IsDerived_28_0= 'IsDerived' ) )
                    // InternalVmsc.g:1436:5: (lv_IsDerived_28_0= 'IsDerived' )
                    {
                    // InternalVmsc.g:1436:5: (lv_IsDerived_28_0= 'IsDerived' )
                    // InternalVmsc.g:1437:6: lv_IsDerived_28_0= 'IsDerived'
                    {
                    lv_IsDerived_28_0=(Token)match(input,38,FOLLOW_3); 

                    						newLeafNode(lv_IsDerived_28_0, grammarAccess.getVReferenceAccess().getIsDerivedIsDerivedKeyword_13_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVReferenceRule());
                    						}
                    						setWithLastConsumed(current, "IsDerived", lv_IsDerived_28_0 != null, "IsDerived");
                    					

                    }


                    }

                    otherlv_29=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_29, grammarAccess.getVReferenceAccess().getColonKeyword_13_1());
                    			
                    otherlv_30=(Token)match(input,24,FOLLOW_9); 

                    				newLeafNode(otherlv_30, grammarAccess.getVReferenceAccess().getTrueKeyword_13_2());
                    			
                    otherlv_31=(Token)match(input,15,FOLLOW_42); 

                    				newLeafNode(otherlv_31, grammarAccess.getVReferenceAccess().getCommaKeyword_13_3());
                    			

                    }
                    break;

            }

            // InternalVmsc.g:1462:3: ( ( (lv_IsUnique_32_0= 'IsUnique' ) ) otherlv_33= ':' otherlv_34= 'True' otherlv_35= ',' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==39) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalVmsc.g:1463:4: ( (lv_IsUnique_32_0= 'IsUnique' ) ) otherlv_33= ':' otherlv_34= 'True' otherlv_35= ','
                    {
                    // InternalVmsc.g:1463:4: ( (lv_IsUnique_32_0= 'IsUnique' ) )
                    // InternalVmsc.g:1464:5: (lv_IsUnique_32_0= 'IsUnique' )
                    {
                    // InternalVmsc.g:1464:5: (lv_IsUnique_32_0= 'IsUnique' )
                    // InternalVmsc.g:1465:6: lv_IsUnique_32_0= 'IsUnique'
                    {
                    lv_IsUnique_32_0=(Token)match(input,39,FOLLOW_3); 

                    						newLeafNode(lv_IsUnique_32_0, grammarAccess.getVReferenceAccess().getIsUniqueIsUniqueKeyword_14_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVReferenceRule());
                    						}
                    						setWithLastConsumed(current, "IsUnique", lv_IsUnique_32_0 != null, "IsUnique");
                    					

                    }


                    }

                    otherlv_33=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_33, grammarAccess.getVReferenceAccess().getColonKeyword_14_1());
                    			
                    otherlv_34=(Token)match(input,24,FOLLOW_9); 

                    				newLeafNode(otherlv_34, grammarAccess.getVReferenceAccess().getTrueKeyword_14_2());
                    			
                    otherlv_35=(Token)match(input,15,FOLLOW_43); 

                    				newLeafNode(otherlv_35, grammarAccess.getVReferenceAccess().getCommaKeyword_14_3());
                    			

                    }
                    break;

            }

            // InternalVmsc.g:1490:3: ( ( (lv_IsContainer_36_0= 'IsContainer' ) ) otherlv_37= ':' otherlv_38= 'True' otherlv_39= ',' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==44) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalVmsc.g:1491:4: ( (lv_IsContainer_36_0= 'IsContainer' ) ) otherlv_37= ':' otherlv_38= 'True' otherlv_39= ','
                    {
                    // InternalVmsc.g:1491:4: ( (lv_IsContainer_36_0= 'IsContainer' ) )
                    // InternalVmsc.g:1492:5: (lv_IsContainer_36_0= 'IsContainer' )
                    {
                    // InternalVmsc.g:1492:5: (lv_IsContainer_36_0= 'IsContainer' )
                    // InternalVmsc.g:1493:6: lv_IsContainer_36_0= 'IsContainer'
                    {
                    lv_IsContainer_36_0=(Token)match(input,44,FOLLOW_3); 

                    						newLeafNode(lv_IsContainer_36_0, grammarAccess.getVReferenceAccess().getIsContainerIsContainerKeyword_15_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVReferenceRule());
                    						}
                    						setWithLastConsumed(current, "IsContainer", lv_IsContainer_36_0 != null, "IsContainer");
                    					

                    }


                    }

                    otherlv_37=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_37, grammarAccess.getVReferenceAccess().getColonKeyword_15_1());
                    			
                    otherlv_38=(Token)match(input,24,FOLLOW_9); 

                    				newLeafNode(otherlv_38, grammarAccess.getVReferenceAccess().getTrueKeyword_15_2());
                    			
                    otherlv_39=(Token)match(input,15,FOLLOW_44); 

                    				newLeafNode(otherlv_39, grammarAccess.getVReferenceAccess().getCommaKeyword_15_3());
                    			

                    }
                    break;

            }

            // InternalVmsc.g:1518:3: ( ( (lv_IsContainment_40_0= 'IsContainment' ) ) otherlv_41= ':' otherlv_42= 'True' otherlv_43= ',' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==45) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalVmsc.g:1519:4: ( (lv_IsContainment_40_0= 'IsContainment' ) ) otherlv_41= ':' otherlv_42= 'True' otherlv_43= ','
                    {
                    // InternalVmsc.g:1519:4: ( (lv_IsContainment_40_0= 'IsContainment' ) )
                    // InternalVmsc.g:1520:5: (lv_IsContainment_40_0= 'IsContainment' )
                    {
                    // InternalVmsc.g:1520:5: (lv_IsContainment_40_0= 'IsContainment' )
                    // InternalVmsc.g:1521:6: lv_IsContainment_40_0= 'IsContainment'
                    {
                    lv_IsContainment_40_0=(Token)match(input,45,FOLLOW_3); 

                    						newLeafNode(lv_IsContainment_40_0, grammarAccess.getVReferenceAccess().getIsContainmentIsContainmentKeyword_16_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVReferenceRule());
                    						}
                    						setWithLastConsumed(current, "IsContainment", lv_IsContainment_40_0 != null, "IsContainment");
                    					

                    }


                    }

                    otherlv_41=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_41, grammarAccess.getVReferenceAccess().getColonKeyword_16_1());
                    			
                    otherlv_42=(Token)match(input,24,FOLLOW_9); 

                    				newLeafNode(otherlv_42, grammarAccess.getVReferenceAccess().getTrueKeyword_16_2());
                    			
                    otherlv_43=(Token)match(input,15,FOLLOW_31); 

                    				newLeafNode(otherlv_43, grammarAccess.getVReferenceAccess().getCommaKeyword_16_3());
                    			

                    }
                    break;

            }

            // InternalVmsc.g:1546:3: (otherlv_44= 'LowerBound' otherlv_45= ':' ( (lv_LowerBound_46_0= ruleEInt ) ) otherlv_47= ',' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==40) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalVmsc.g:1547:4: otherlv_44= 'LowerBound' otherlv_45= ':' ( (lv_LowerBound_46_0= ruleEInt ) ) otherlv_47= ','
                    {
                    otherlv_44=(Token)match(input,40,FOLLOW_3); 

                    				newLeafNode(otherlv_44, grammarAccess.getVReferenceAccess().getLowerBoundKeyword_17_0());
                    			
                    otherlv_45=(Token)match(input,12,FOLLOW_32); 

                    				newLeafNode(otherlv_45, grammarAccess.getVReferenceAccess().getColonKeyword_17_1());
                    			
                    // InternalVmsc.g:1555:4: ( (lv_LowerBound_46_0= ruleEInt ) )
                    // InternalVmsc.g:1556:5: (lv_LowerBound_46_0= ruleEInt )
                    {
                    // InternalVmsc.g:1556:5: (lv_LowerBound_46_0= ruleEInt )
                    // InternalVmsc.g:1557:6: lv_LowerBound_46_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getVReferenceAccess().getLowerBoundEIntParserRuleCall_17_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_LowerBound_46_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVReferenceRule());
                    						}
                    						set(
                    							current,
                    							"LowerBound",
                    							lv_LowerBound_46_0,
                    							"org.xtext.example.vmsc.Vmsc.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_47=(Token)match(input,15,FOLLOW_33); 

                    				newLeafNode(otherlv_47, grammarAccess.getVReferenceAccess().getCommaKeyword_17_3());
                    			

                    }
                    break;

            }

            // InternalVmsc.g:1579:3: (otherlv_48= 'UpperBound' otherlv_49= ':' ( (lv_UpperBound_50_0= ruleEInt ) ) otherlv_51= ',' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==41) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalVmsc.g:1580:4: otherlv_48= 'UpperBound' otherlv_49= ':' ( (lv_UpperBound_50_0= ruleEInt ) ) otherlv_51= ','
                    {
                    otherlv_48=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_48, grammarAccess.getVReferenceAccess().getUpperBoundKeyword_18_0());
                    			
                    otherlv_49=(Token)match(input,12,FOLLOW_32); 

                    				newLeafNode(otherlv_49, grammarAccess.getVReferenceAccess().getColonKeyword_18_1());
                    			
                    // InternalVmsc.g:1588:4: ( (lv_UpperBound_50_0= ruleEInt ) )
                    // InternalVmsc.g:1589:5: (lv_UpperBound_50_0= ruleEInt )
                    {
                    // InternalVmsc.g:1589:5: (lv_UpperBound_50_0= ruleEInt )
                    // InternalVmsc.g:1590:6: lv_UpperBound_50_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getVReferenceAccess().getUpperBoundEIntParserRuleCall_18_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_UpperBound_50_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVReferenceRule());
                    						}
                    						set(
                    							current,
                    							"UpperBound",
                    							lv_UpperBound_50_0,
                    							"org.xtext.example.vmsc.Vmsc.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_51=(Token)match(input,15,FOLLOW_34); 

                    				newLeafNode(otherlv_51, grammarAccess.getVReferenceAccess().getCommaKeyword_18_3());
                    			

                    }
                    break;

            }

            // InternalVmsc.g:1612:3: (otherlv_52= 'VType' otherlv_53= ':' ( (lv_VType_54_0= ruleVClass ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==42) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalVmsc.g:1613:4: otherlv_52= 'VType' otherlv_53= ':' ( (lv_VType_54_0= ruleVClass ) )
                    {
                    otherlv_52=(Token)match(input,42,FOLLOW_3); 

                    				newLeafNode(otherlv_52, grammarAccess.getVReferenceAccess().getVTypeKeyword_19_0());
                    			
                    otherlv_53=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_53, grammarAccess.getVReferenceAccess().getColonKeyword_19_1());
                    			
                    // InternalVmsc.g:1621:4: ( (lv_VType_54_0= ruleVClass ) )
                    // InternalVmsc.g:1622:5: (lv_VType_54_0= ruleVClass )
                    {
                    // InternalVmsc.g:1622:5: (lv_VType_54_0= ruleVClass )
                    // InternalVmsc.g:1623:6: lv_VType_54_0= ruleVClass
                    {

                    						newCompositeNode(grammarAccess.getVReferenceAccess().getVTypeVClassParserRuleCall_19_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_VType_54_0=ruleVClass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVReferenceRule());
                    						}
                    						set(
                    							current,
                    							"VType",
                    							lv_VType_54_0,
                    							"org.xtext.example.vmsc.Vmsc.VClass");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_55=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_55, grammarAccess.getVReferenceAccess().getRightCurlyBracketKeyword_20());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVReference"


    // $ANTLR start "entryRuleVString"
    // InternalVmsc.g:1649:1: entryRuleVString returns [EObject current=null] : iv_ruleVString= ruleVString EOF ;
    public final EObject entryRuleVString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVString = null;


        try {
            // InternalVmsc.g:1649:48: (iv_ruleVString= ruleVString EOF )
            // InternalVmsc.g:1650:2: iv_ruleVString= ruleVString EOF
            {
             newCompositeNode(grammarAccess.getVStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVString=ruleVString();

            state._fsp--;

             current =iv_ruleVString; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVString"


    // $ANTLR start "ruleVString"
    // InternalVmsc.g:1656:1: ruleVString returns [EObject current=null] : ( () otherlv_1= 'VString' otherlv_2= ',' otherlv_3= 'VContent' otherlv_4= ':' ( (lv_VContent_5_0= ruleEString ) ) (otherlv_6= ',' )? ) ;
    public final EObject ruleVString() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_VContent_5_0 = null;



        	enterRule();

        try {
            // InternalVmsc.g:1662:2: ( ( () otherlv_1= 'VString' otherlv_2= ',' otherlv_3= 'VContent' otherlv_4= ':' ( (lv_VContent_5_0= ruleEString ) ) (otherlv_6= ',' )? ) )
            // InternalVmsc.g:1663:2: ( () otherlv_1= 'VString' otherlv_2= ',' otherlv_3= 'VContent' otherlv_4= ':' ( (lv_VContent_5_0= ruleEString ) ) (otherlv_6= ',' )? )
            {
            // InternalVmsc.g:1663:2: ( () otherlv_1= 'VString' otherlv_2= ',' otherlv_3= 'VContent' otherlv_4= ':' ( (lv_VContent_5_0= ruleEString ) ) (otherlv_6= ',' )? )
            // InternalVmsc.g:1664:3: () otherlv_1= 'VString' otherlv_2= ',' otherlv_3= 'VContent' otherlv_4= ':' ( (lv_VContent_5_0= ruleEString ) ) (otherlv_6= ',' )?
            {
            // InternalVmsc.g:1664:3: ()
            // InternalVmsc.g:1665:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVStringAccess().getVStringAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getVStringAccess().getVStringKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_45); 

            			newLeafNode(otherlv_2, grammarAccess.getVStringAccess().getCommaKeyword_2());
            		
            otherlv_3=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getVStringAccess().getVContentKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getVStringAccess().getColonKeyword_4());
            		
            // InternalVmsc.g:1687:3: ( (lv_VContent_5_0= ruleEString ) )
            // InternalVmsc.g:1688:4: (lv_VContent_5_0= ruleEString )
            {
            // InternalVmsc.g:1688:4: (lv_VContent_5_0= ruleEString )
            // InternalVmsc.g:1689:5: lv_VContent_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVStringAccess().getVContentEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_46);
            lv_VContent_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVStringRule());
            					}
            					set(
            						current,
            						"VContent",
            						lv_VContent_5_0,
            						"org.xtext.example.vmsc.Vmsc.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVmsc.g:1706:3: (otherlv_6= ',' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==15) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalVmsc.g:1707:4: otherlv_6= ','
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getVStringAccess().getCommaKeyword_6());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVString"


    // $ANTLR start "entryRuleVInt"
    // InternalVmsc.g:1716:1: entryRuleVInt returns [EObject current=null] : iv_ruleVInt= ruleVInt EOF ;
    public final EObject entryRuleVInt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVInt = null;


        try {
            // InternalVmsc.g:1716:45: (iv_ruleVInt= ruleVInt EOF )
            // InternalVmsc.g:1717:2: iv_ruleVInt= ruleVInt EOF
            {
             newCompositeNode(grammarAccess.getVIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVInt=ruleVInt();

            state._fsp--;

             current =iv_ruleVInt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVInt"


    // $ANTLR start "ruleVInt"
    // InternalVmsc.g:1723:1: ruleVInt returns [EObject current=null] : ( () otherlv_1= 'VInt' otherlv_2= ',' otherlv_3= 'VContent' otherlv_4= ':' ( (lv_VContent_5_0= ruleEInt ) ) (otherlv_6= ',' )? ) ;
    public final EObject ruleVInt() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_VContent_5_0 = null;



        	enterRule();

        try {
            // InternalVmsc.g:1729:2: ( ( () otherlv_1= 'VInt' otherlv_2= ',' otherlv_3= 'VContent' otherlv_4= ':' ( (lv_VContent_5_0= ruleEInt ) ) (otherlv_6= ',' )? ) )
            // InternalVmsc.g:1730:2: ( () otherlv_1= 'VInt' otherlv_2= ',' otherlv_3= 'VContent' otherlv_4= ':' ( (lv_VContent_5_0= ruleEInt ) ) (otherlv_6= ',' )? )
            {
            // InternalVmsc.g:1730:2: ( () otherlv_1= 'VInt' otherlv_2= ',' otherlv_3= 'VContent' otherlv_4= ':' ( (lv_VContent_5_0= ruleEInt ) ) (otherlv_6= ',' )? )
            // InternalVmsc.g:1731:3: () otherlv_1= 'VInt' otherlv_2= ',' otherlv_3= 'VContent' otherlv_4= ':' ( (lv_VContent_5_0= ruleEInt ) ) (otherlv_6= ',' )?
            {
            // InternalVmsc.g:1731:3: ()
            // InternalVmsc.g:1732:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVIntAccess().getVIntAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getVIntAccess().getVIntKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_45); 

            			newLeafNode(otherlv_2, grammarAccess.getVIntAccess().getCommaKeyword_2());
            		
            otherlv_3=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getVIntAccess().getVContentKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_4, grammarAccess.getVIntAccess().getColonKeyword_4());
            		
            // InternalVmsc.g:1754:3: ( (lv_VContent_5_0= ruleEInt ) )
            // InternalVmsc.g:1755:4: (lv_VContent_5_0= ruleEInt )
            {
            // InternalVmsc.g:1755:4: (lv_VContent_5_0= ruleEInt )
            // InternalVmsc.g:1756:5: lv_VContent_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getVIntAccess().getVContentEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_46);
            lv_VContent_5_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVIntRule());
            					}
            					set(
            						current,
            						"VContent",
            						lv_VContent_5_0,
            						"org.xtext.example.vmsc.Vmsc.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVmsc.g:1773:3: (otherlv_6= ',' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==15) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalVmsc.g:1774:4: otherlv_6= ','
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getVIntAccess().getCommaKeyword_6());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVInt"


    // $ANTLR start "entryRuleVFloat"
    // InternalVmsc.g:1783:1: entryRuleVFloat returns [EObject current=null] : iv_ruleVFloat= ruleVFloat EOF ;
    public final EObject entryRuleVFloat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVFloat = null;


        try {
            // InternalVmsc.g:1783:47: (iv_ruleVFloat= ruleVFloat EOF )
            // InternalVmsc.g:1784:2: iv_ruleVFloat= ruleVFloat EOF
            {
             newCompositeNode(grammarAccess.getVFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVFloat=ruleVFloat();

            state._fsp--;

             current =iv_ruleVFloat; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVFloat"


    // $ANTLR start "ruleVFloat"
    // InternalVmsc.g:1790:1: ruleVFloat returns [EObject current=null] : ( () otherlv_1= 'VFloat' otherlv_2= ',' otherlv_3= 'VContent' otherlv_4= ':' ( (lv_VContent_5_0= ruleEFloat ) ) (otherlv_6= ',' )? ) ;
    public final EObject ruleVFloat() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_VContent_5_0 = null;



        	enterRule();

        try {
            // InternalVmsc.g:1796:2: ( ( () otherlv_1= 'VFloat' otherlv_2= ',' otherlv_3= 'VContent' otherlv_4= ':' ( (lv_VContent_5_0= ruleEFloat ) ) (otherlv_6= ',' )? ) )
            // InternalVmsc.g:1797:2: ( () otherlv_1= 'VFloat' otherlv_2= ',' otherlv_3= 'VContent' otherlv_4= ':' ( (lv_VContent_5_0= ruleEFloat ) ) (otherlv_6= ',' )? )
            {
            // InternalVmsc.g:1797:2: ( () otherlv_1= 'VFloat' otherlv_2= ',' otherlv_3= 'VContent' otherlv_4= ':' ( (lv_VContent_5_0= ruleEFloat ) ) (otherlv_6= ',' )? )
            // InternalVmsc.g:1798:3: () otherlv_1= 'VFloat' otherlv_2= ',' otherlv_3= 'VContent' otherlv_4= ':' ( (lv_VContent_5_0= ruleEFloat ) ) (otherlv_6= ',' )?
            {
            // InternalVmsc.g:1798:3: ()
            // InternalVmsc.g:1799:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVFloatAccess().getVFloatAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getVFloatAccess().getVFloatKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_45); 

            			newLeafNode(otherlv_2, grammarAccess.getVFloatAccess().getCommaKeyword_2());
            		
            otherlv_3=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getVFloatAccess().getVContentKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_47); 

            			newLeafNode(otherlv_4, grammarAccess.getVFloatAccess().getColonKeyword_4());
            		
            // InternalVmsc.g:1821:3: ( (lv_VContent_5_0= ruleEFloat ) )
            // InternalVmsc.g:1822:4: (lv_VContent_5_0= ruleEFloat )
            {
            // InternalVmsc.g:1822:4: (lv_VContent_5_0= ruleEFloat )
            // InternalVmsc.g:1823:5: lv_VContent_5_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getVFloatAccess().getVContentEFloatParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_46);
            lv_VContent_5_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVFloatRule());
            					}
            					set(
            						current,
            						"VContent",
            						lv_VContent_5_0,
            						"org.xtext.example.vmsc.Vmsc.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVmsc.g:1840:3: (otherlv_6= ',' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==15) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalVmsc.g:1841:4: otherlv_6= ','
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getVFloatAccess().getCommaKeyword_6());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVFloat"


    // $ANTLR start "entryRuleEFloat"
    // InternalVmsc.g:1850:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalVmsc.g:1850:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalVmsc.g:1851:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalVmsc.g:1857:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalVmsc.g:1863:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalVmsc.g:1864:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalVmsc.g:1864:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalVmsc.g:1865:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalVmsc.g:1865:3: (kw= '-' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==31) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalVmsc.g:1866:4: kw= '-'
                    {
                    kw=(Token)match(input,31,FOLLOW_48); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalVmsc.g:1872:3: (this_INT_1= RULE_INT )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_INT) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalVmsc.g:1873:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_49); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,50,FOLLOW_23); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_50); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
            		
            // InternalVmsc.g:1893:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=51 && LA46_0<=52)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalVmsc.g:1894:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalVmsc.g:1894:4: (kw= 'E' | kw= 'e' )
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==51) ) {
                        alt44=1;
                    }
                    else if ( (LA44_0==52) ) {
                        alt44=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 0, input);

                        throw nvae;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalVmsc.g:1895:5: kw= 'E'
                            {
                            kw=(Token)match(input,51,FOLLOW_32); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalVmsc.g:1901:5: kw= 'e'
                            {
                            kw=(Token)match(input,52,FOLLOW_32); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalVmsc.g:1907:4: (kw= '-' )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==31) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalVmsc.g:1908:5: kw= '-'
                            {
                            kw=(Token)match(input,31,FOLLOW_23); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEFloat"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000006400800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000078010000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000080100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000070010000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000060010000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000007FE00010000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000007FC00010000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000007F800010000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000007F000010000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000007E000010000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000007C000010000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000078000010000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000070000010000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000080000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000060000010000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040000010000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0003400000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000037FE00010000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000037FC00010000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000037F800010000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000037F000010000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x000037E000010000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x000037C000010000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000378000010000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000370000010000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000270000010000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0004000080000040L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0004000000000040L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0018000000000002L});

}