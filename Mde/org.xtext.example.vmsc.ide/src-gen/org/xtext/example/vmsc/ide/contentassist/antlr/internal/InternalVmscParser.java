package org.xtext.example.vmsc.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.vmsc.services.VmscGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVmscParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "'}'", "'E'", "'e'", "'VPackage'", "':'", "'{'", "'name'", "'VPrefix'", "'VUri'", "'VComponents'", "'['", "']'", "'VEnum'", "'True'", "'VDatatype'", "'VClass'", "'VStructuralFeatures'", "'VSuperType'", "'-'", "'VAttribute'", "'LowerBound'", "'UpperBound'", "'VType'", "'VReference'", "'VString'", "'VContent'", "'VInt'", "'VFloat'", "'.'", "'IsSerializable'", "'IsAbstract'", "'IsInterface'", "'IsChangeable'", "'IsOrdered'", "'IsTransient'", "'IsUnsettable'", "'IsVolatile'", "'IsDerived'", "'IsUnique'", "'IsContainer'", "'IsContainment'"
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

    	public void setGrammarAccess(VmscGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleVPackage"
    // InternalVmsc.g:53:1: entryRuleVPackage : ruleVPackage EOF ;
    public final void entryRuleVPackage() throws RecognitionException {
        try {
            // InternalVmsc.g:54:1: ( ruleVPackage EOF )
            // InternalVmsc.g:55:1: ruleVPackage EOF
            {
             before(grammarAccess.getVPackageRule()); 
            pushFollow(FOLLOW_1);
            ruleVPackage();

            state._fsp--;

             after(grammarAccess.getVPackageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVPackage"


    // $ANTLR start "ruleVPackage"
    // InternalVmsc.g:62:1: ruleVPackage : ( ( rule__VPackage__Group__0 ) ) ;
    public final void ruleVPackage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:66:2: ( ( ( rule__VPackage__Group__0 ) ) )
            // InternalVmsc.g:67:2: ( ( rule__VPackage__Group__0 ) )
            {
            // InternalVmsc.g:67:2: ( ( rule__VPackage__Group__0 ) )
            // InternalVmsc.g:68:3: ( rule__VPackage__Group__0 )
            {
             before(grammarAccess.getVPackageAccess().getGroup()); 
            // InternalVmsc.g:69:3: ( rule__VPackage__Group__0 )
            // InternalVmsc.g:69:4: rule__VPackage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VPackage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVPackageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVPackage"


    // $ANTLR start "entryRuleVStructuralComponent"
    // InternalVmsc.g:78:1: entryRuleVStructuralComponent : ruleVStructuralComponent EOF ;
    public final void entryRuleVStructuralComponent() throws RecognitionException {
        try {
            // InternalVmsc.g:79:1: ( ruleVStructuralComponent EOF )
            // InternalVmsc.g:80:1: ruleVStructuralComponent EOF
            {
             before(grammarAccess.getVStructuralComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleVStructuralComponent();

            state._fsp--;

             after(grammarAccess.getVStructuralComponentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVStructuralComponent"


    // $ANTLR start "ruleVStructuralComponent"
    // InternalVmsc.g:87:1: ruleVStructuralComponent : ( ( rule__VStructuralComponent__Alternatives ) ) ;
    public final void ruleVStructuralComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:91:2: ( ( ( rule__VStructuralComponent__Alternatives ) ) )
            // InternalVmsc.g:92:2: ( ( rule__VStructuralComponent__Alternatives ) )
            {
            // InternalVmsc.g:92:2: ( ( rule__VStructuralComponent__Alternatives ) )
            // InternalVmsc.g:93:3: ( rule__VStructuralComponent__Alternatives )
            {
             before(grammarAccess.getVStructuralComponentAccess().getAlternatives()); 
            // InternalVmsc.g:94:3: ( rule__VStructuralComponent__Alternatives )
            // InternalVmsc.g:94:4: rule__VStructuralComponent__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VStructuralComponent__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVStructuralComponentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVStructuralComponent"


    // $ANTLR start "entryRuleVStructuralFeatures"
    // InternalVmsc.g:103:1: entryRuleVStructuralFeatures : ruleVStructuralFeatures EOF ;
    public final void entryRuleVStructuralFeatures() throws RecognitionException {
        try {
            // InternalVmsc.g:104:1: ( ruleVStructuralFeatures EOF )
            // InternalVmsc.g:105:1: ruleVStructuralFeatures EOF
            {
             before(grammarAccess.getVStructuralFeaturesRule()); 
            pushFollow(FOLLOW_1);
            ruleVStructuralFeatures();

            state._fsp--;

             after(grammarAccess.getVStructuralFeaturesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVStructuralFeatures"


    // $ANTLR start "ruleVStructuralFeatures"
    // InternalVmsc.g:112:1: ruleVStructuralFeatures : ( ( rule__VStructuralFeatures__Alternatives ) ) ;
    public final void ruleVStructuralFeatures() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:116:2: ( ( ( rule__VStructuralFeatures__Alternatives ) ) )
            // InternalVmsc.g:117:2: ( ( rule__VStructuralFeatures__Alternatives ) )
            {
            // InternalVmsc.g:117:2: ( ( rule__VStructuralFeatures__Alternatives ) )
            // InternalVmsc.g:118:3: ( rule__VStructuralFeatures__Alternatives )
            {
             before(grammarAccess.getVStructuralFeaturesAccess().getAlternatives()); 
            // InternalVmsc.g:119:3: ( rule__VStructuralFeatures__Alternatives )
            // InternalVmsc.g:119:4: rule__VStructuralFeatures__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VStructuralFeatures__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVStructuralFeaturesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVStructuralFeatures"


    // $ANTLR start "entryRuleVType"
    // InternalVmsc.g:128:1: entryRuleVType : ruleVType EOF ;
    public final void entryRuleVType() throws RecognitionException {
        try {
            // InternalVmsc.g:129:1: ( ruleVType EOF )
            // InternalVmsc.g:130:1: ruleVType EOF
            {
             before(grammarAccess.getVTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleVType();

            state._fsp--;

             after(grammarAccess.getVTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVType"


    // $ANTLR start "ruleVType"
    // InternalVmsc.g:137:1: ruleVType : ( ( rule__VType__Alternatives ) ) ;
    public final void ruleVType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:141:2: ( ( ( rule__VType__Alternatives ) ) )
            // InternalVmsc.g:142:2: ( ( rule__VType__Alternatives ) )
            {
            // InternalVmsc.g:142:2: ( ( rule__VType__Alternatives ) )
            // InternalVmsc.g:143:3: ( rule__VType__Alternatives )
            {
             before(grammarAccess.getVTypeAccess().getAlternatives()); 
            // InternalVmsc.g:144:3: ( rule__VType__Alternatives )
            // InternalVmsc.g:144:4: rule__VType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVType"


    // $ANTLR start "entryRuleEString"
    // InternalVmsc.g:153:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalVmsc.g:154:1: ( ruleEString EOF )
            // InternalVmsc.g:155:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalVmsc.g:162:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:166:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalVmsc.g:167:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalVmsc.g:167:2: ( ( rule__EString__Alternatives ) )
            // InternalVmsc.g:168:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalVmsc.g:169:3: ( rule__EString__Alternatives )
            // InternalVmsc.g:169:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleVEnum"
    // InternalVmsc.g:178:1: entryRuleVEnum : ruleVEnum EOF ;
    public final void entryRuleVEnum() throws RecognitionException {
        try {
            // InternalVmsc.g:179:1: ( ruleVEnum EOF )
            // InternalVmsc.g:180:1: ruleVEnum EOF
            {
             before(grammarAccess.getVEnumRule()); 
            pushFollow(FOLLOW_1);
            ruleVEnum();

            state._fsp--;

             after(grammarAccess.getVEnumRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVEnum"


    // $ANTLR start "ruleVEnum"
    // InternalVmsc.g:187:1: ruleVEnum : ( ( rule__VEnum__Group__0 ) ) ;
    public final void ruleVEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:191:2: ( ( ( rule__VEnum__Group__0 ) ) )
            // InternalVmsc.g:192:2: ( ( rule__VEnum__Group__0 ) )
            {
            // InternalVmsc.g:192:2: ( ( rule__VEnum__Group__0 ) )
            // InternalVmsc.g:193:3: ( rule__VEnum__Group__0 )
            {
             before(grammarAccess.getVEnumAccess().getGroup()); 
            // InternalVmsc.g:194:3: ( rule__VEnum__Group__0 )
            // InternalVmsc.g:194:4: rule__VEnum__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VEnum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVEnumAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVEnum"


    // $ANTLR start "entryRuleVDatatype_Impl"
    // InternalVmsc.g:203:1: entryRuleVDatatype_Impl : ruleVDatatype_Impl EOF ;
    public final void entryRuleVDatatype_Impl() throws RecognitionException {
        try {
            // InternalVmsc.g:204:1: ( ruleVDatatype_Impl EOF )
            // InternalVmsc.g:205:1: ruleVDatatype_Impl EOF
            {
             before(grammarAccess.getVDatatype_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleVDatatype_Impl();

            state._fsp--;

             after(grammarAccess.getVDatatype_ImplRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVDatatype_Impl"


    // $ANTLR start "ruleVDatatype_Impl"
    // InternalVmsc.g:212:1: ruleVDatatype_Impl : ( ( rule__VDatatype_Impl__Group__0 ) ) ;
    public final void ruleVDatatype_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:216:2: ( ( ( rule__VDatatype_Impl__Group__0 ) ) )
            // InternalVmsc.g:217:2: ( ( rule__VDatatype_Impl__Group__0 ) )
            {
            // InternalVmsc.g:217:2: ( ( rule__VDatatype_Impl__Group__0 ) )
            // InternalVmsc.g:218:3: ( rule__VDatatype_Impl__Group__0 )
            {
             before(grammarAccess.getVDatatype_ImplAccess().getGroup()); 
            // InternalVmsc.g:219:3: ( rule__VDatatype_Impl__Group__0 )
            // InternalVmsc.g:219:4: rule__VDatatype_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VDatatype_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVDatatype_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVDatatype_Impl"


    // $ANTLR start "entryRuleVClass"
    // InternalVmsc.g:228:1: entryRuleVClass : ruleVClass EOF ;
    public final void entryRuleVClass() throws RecognitionException {
        try {
            // InternalVmsc.g:229:1: ( ruleVClass EOF )
            // InternalVmsc.g:230:1: ruleVClass EOF
            {
             before(grammarAccess.getVClassRule()); 
            pushFollow(FOLLOW_1);
            ruleVClass();

            state._fsp--;

             after(grammarAccess.getVClassRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVClass"


    // $ANTLR start "ruleVClass"
    // InternalVmsc.g:237:1: ruleVClass : ( ( rule__VClass__Group__0 ) ) ;
    public final void ruleVClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:241:2: ( ( ( rule__VClass__Group__0 ) ) )
            // InternalVmsc.g:242:2: ( ( rule__VClass__Group__0 ) )
            {
            // InternalVmsc.g:242:2: ( ( rule__VClass__Group__0 ) )
            // InternalVmsc.g:243:3: ( rule__VClass__Group__0 )
            {
             before(grammarAccess.getVClassAccess().getGroup()); 
            // InternalVmsc.g:244:3: ( rule__VClass__Group__0 )
            // InternalVmsc.g:244:4: rule__VClass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVClass"


    // $ANTLR start "entryRuleEInt"
    // InternalVmsc.g:253:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalVmsc.g:254:1: ( ruleEInt EOF )
            // InternalVmsc.g:255:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalVmsc.g:262:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:266:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalVmsc.g:267:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalVmsc.g:267:2: ( ( rule__EInt__Group__0 ) )
            // InternalVmsc.g:268:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalVmsc.g:269:3: ( rule__EInt__Group__0 )
            // InternalVmsc.g:269:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleVAttribute"
    // InternalVmsc.g:278:1: entryRuleVAttribute : ruleVAttribute EOF ;
    public final void entryRuleVAttribute() throws RecognitionException {
        try {
            // InternalVmsc.g:279:1: ( ruleVAttribute EOF )
            // InternalVmsc.g:280:1: ruleVAttribute EOF
            {
             before(grammarAccess.getVAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleVAttribute();

            state._fsp--;

             after(grammarAccess.getVAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVAttribute"


    // $ANTLR start "ruleVAttribute"
    // InternalVmsc.g:287:1: ruleVAttribute : ( ( rule__VAttribute__Group__0 ) ) ;
    public final void ruleVAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:291:2: ( ( ( rule__VAttribute__Group__0 ) ) )
            // InternalVmsc.g:292:2: ( ( rule__VAttribute__Group__0 ) )
            {
            // InternalVmsc.g:292:2: ( ( rule__VAttribute__Group__0 ) )
            // InternalVmsc.g:293:3: ( rule__VAttribute__Group__0 )
            {
             before(grammarAccess.getVAttributeAccess().getGroup()); 
            // InternalVmsc.g:294:3: ( rule__VAttribute__Group__0 )
            // InternalVmsc.g:294:4: rule__VAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVAttribute"


    // $ANTLR start "entryRuleVReference"
    // InternalVmsc.g:303:1: entryRuleVReference : ruleVReference EOF ;
    public final void entryRuleVReference() throws RecognitionException {
        try {
            // InternalVmsc.g:304:1: ( ruleVReference EOF )
            // InternalVmsc.g:305:1: ruleVReference EOF
            {
             before(grammarAccess.getVReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleVReference();

            state._fsp--;

             after(grammarAccess.getVReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVReference"


    // $ANTLR start "ruleVReference"
    // InternalVmsc.g:312:1: ruleVReference : ( ( rule__VReference__Group__0 ) ) ;
    public final void ruleVReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:316:2: ( ( ( rule__VReference__Group__0 ) ) )
            // InternalVmsc.g:317:2: ( ( rule__VReference__Group__0 ) )
            {
            // InternalVmsc.g:317:2: ( ( rule__VReference__Group__0 ) )
            // InternalVmsc.g:318:3: ( rule__VReference__Group__0 )
            {
             before(grammarAccess.getVReferenceAccess().getGroup()); 
            // InternalVmsc.g:319:3: ( rule__VReference__Group__0 )
            // InternalVmsc.g:319:4: rule__VReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVReference"


    // $ANTLR start "entryRuleVString"
    // InternalVmsc.g:328:1: entryRuleVString : ruleVString EOF ;
    public final void entryRuleVString() throws RecognitionException {
        try {
            // InternalVmsc.g:329:1: ( ruleVString EOF )
            // InternalVmsc.g:330:1: ruleVString EOF
            {
             before(grammarAccess.getVStringRule()); 
            pushFollow(FOLLOW_1);
            ruleVString();

            state._fsp--;

             after(grammarAccess.getVStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVString"


    // $ANTLR start "ruleVString"
    // InternalVmsc.g:337:1: ruleVString : ( ( rule__VString__Group__0 ) ) ;
    public final void ruleVString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:341:2: ( ( ( rule__VString__Group__0 ) ) )
            // InternalVmsc.g:342:2: ( ( rule__VString__Group__0 ) )
            {
            // InternalVmsc.g:342:2: ( ( rule__VString__Group__0 ) )
            // InternalVmsc.g:343:3: ( rule__VString__Group__0 )
            {
             before(grammarAccess.getVStringAccess().getGroup()); 
            // InternalVmsc.g:344:3: ( rule__VString__Group__0 )
            // InternalVmsc.g:344:4: rule__VString__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VString__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVStringAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVString"


    // $ANTLR start "entryRuleVInt"
    // InternalVmsc.g:353:1: entryRuleVInt : ruleVInt EOF ;
    public final void entryRuleVInt() throws RecognitionException {
        try {
            // InternalVmsc.g:354:1: ( ruleVInt EOF )
            // InternalVmsc.g:355:1: ruleVInt EOF
            {
             before(grammarAccess.getVIntRule()); 
            pushFollow(FOLLOW_1);
            ruleVInt();

            state._fsp--;

             after(grammarAccess.getVIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVInt"


    // $ANTLR start "ruleVInt"
    // InternalVmsc.g:362:1: ruleVInt : ( ( rule__VInt__Group__0 ) ) ;
    public final void ruleVInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:366:2: ( ( ( rule__VInt__Group__0 ) ) )
            // InternalVmsc.g:367:2: ( ( rule__VInt__Group__0 ) )
            {
            // InternalVmsc.g:367:2: ( ( rule__VInt__Group__0 ) )
            // InternalVmsc.g:368:3: ( rule__VInt__Group__0 )
            {
             before(grammarAccess.getVIntAccess().getGroup()); 
            // InternalVmsc.g:369:3: ( rule__VInt__Group__0 )
            // InternalVmsc.g:369:4: rule__VInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVInt"


    // $ANTLR start "entryRuleVFloat"
    // InternalVmsc.g:378:1: entryRuleVFloat : ruleVFloat EOF ;
    public final void entryRuleVFloat() throws RecognitionException {
        try {
            // InternalVmsc.g:379:1: ( ruleVFloat EOF )
            // InternalVmsc.g:380:1: ruleVFloat EOF
            {
             before(grammarAccess.getVFloatRule()); 
            pushFollow(FOLLOW_1);
            ruleVFloat();

            state._fsp--;

             after(grammarAccess.getVFloatRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVFloat"


    // $ANTLR start "ruleVFloat"
    // InternalVmsc.g:387:1: ruleVFloat : ( ( rule__VFloat__Group__0 ) ) ;
    public final void ruleVFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:391:2: ( ( ( rule__VFloat__Group__0 ) ) )
            // InternalVmsc.g:392:2: ( ( rule__VFloat__Group__0 ) )
            {
            // InternalVmsc.g:392:2: ( ( rule__VFloat__Group__0 ) )
            // InternalVmsc.g:393:3: ( rule__VFloat__Group__0 )
            {
             before(grammarAccess.getVFloatAccess().getGroup()); 
            // InternalVmsc.g:394:3: ( rule__VFloat__Group__0 )
            // InternalVmsc.g:394:4: rule__VFloat__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VFloat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVFloatAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVFloat"


    // $ANTLR start "entryRuleEFloat"
    // InternalVmsc.g:403:1: entryRuleEFloat : ruleEFloat EOF ;
    public final void entryRuleEFloat() throws RecognitionException {
        try {
            // InternalVmsc.g:404:1: ( ruleEFloat EOF )
            // InternalVmsc.g:405:1: ruleEFloat EOF
            {
             before(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getEFloatRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalVmsc.g:412:1: ruleEFloat : ( ( rule__EFloat__Group__0 ) ) ;
    public final void ruleEFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:416:2: ( ( ( rule__EFloat__Group__0 ) ) )
            // InternalVmsc.g:417:2: ( ( rule__EFloat__Group__0 ) )
            {
            // InternalVmsc.g:417:2: ( ( rule__EFloat__Group__0 ) )
            // InternalVmsc.g:418:3: ( rule__EFloat__Group__0 )
            {
             before(grammarAccess.getEFloatAccess().getGroup()); 
            // InternalVmsc.g:419:3: ( rule__EFloat__Group__0 )
            // InternalVmsc.g:419:4: rule__EFloat__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "rule__VPackage__Alternatives_7"
    // InternalVmsc.g:427:1: rule__VPackage__Alternatives_7 : ( ( ',' ) | ( '}' ) );
    public final void rule__VPackage__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:431:1: ( ( ',' ) | ( '}' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalVmsc.g:432:2: ( ',' )
                    {
                    // InternalVmsc.g:432:2: ( ',' )
                    // InternalVmsc.g:433:3: ','
                    {
                     before(grammarAccess.getVPackageAccess().getCommaKeyword_7_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getVPackageAccess().getCommaKeyword_7_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVmsc.g:438:2: ( '}' )
                    {
                    // InternalVmsc.g:438:2: ( '}' )
                    // InternalVmsc.g:439:3: '}'
                    {
                     before(grammarAccess.getVPackageAccess().getRightCurlyBracketKeyword_7_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getVPackageAccess().getRightCurlyBracketKeyword_7_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Alternatives_7"


    // $ANTLR start "rule__VStructuralComponent__Alternatives"
    // InternalVmsc.g:448:1: rule__VStructuralComponent__Alternatives : ( ( ruleVEnum ) | ( ruleVDatatype_Impl ) | ( ruleVPackage ) | ( ruleVClass ) );
    public final void rule__VStructuralComponent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:452:1: ( ( ruleVEnum ) | ( ruleVDatatype_Impl ) | ( ruleVPackage ) | ( ruleVClass ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt2=1;
                }
                break;
            case 26:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            case 27:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalVmsc.g:453:2: ( ruleVEnum )
                    {
                    // InternalVmsc.g:453:2: ( ruleVEnum )
                    // InternalVmsc.g:454:3: ruleVEnum
                    {
                     before(grammarAccess.getVStructuralComponentAccess().getVEnumParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVEnum();

                    state._fsp--;

                     after(grammarAccess.getVStructuralComponentAccess().getVEnumParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVmsc.g:459:2: ( ruleVDatatype_Impl )
                    {
                    // InternalVmsc.g:459:2: ( ruleVDatatype_Impl )
                    // InternalVmsc.g:460:3: ruleVDatatype_Impl
                    {
                     before(grammarAccess.getVStructuralComponentAccess().getVDatatype_ImplParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVDatatype_Impl();

                    state._fsp--;

                     after(grammarAccess.getVStructuralComponentAccess().getVDatatype_ImplParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVmsc.g:465:2: ( ruleVPackage )
                    {
                    // InternalVmsc.g:465:2: ( ruleVPackage )
                    // InternalVmsc.g:466:3: ruleVPackage
                    {
                     before(grammarAccess.getVStructuralComponentAccess().getVPackageParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVPackage();

                    state._fsp--;

                     after(grammarAccess.getVStructuralComponentAccess().getVPackageParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVmsc.g:471:2: ( ruleVClass )
                    {
                    // InternalVmsc.g:471:2: ( ruleVClass )
                    // InternalVmsc.g:472:3: ruleVClass
                    {
                     before(grammarAccess.getVStructuralComponentAccess().getVClassParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleVClass();

                    state._fsp--;

                     after(grammarAccess.getVStructuralComponentAccess().getVClassParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VStructuralComponent__Alternatives"


    // $ANTLR start "rule__VStructuralFeatures__Alternatives"
    // InternalVmsc.g:481:1: rule__VStructuralFeatures__Alternatives : ( ( ruleVAttribute ) | ( ruleVReference ) );
    public final void rule__VStructuralFeatures__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:485:1: ( ( ruleVAttribute ) | ( ruleVReference ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==31) ) {
                alt3=1;
            }
            else if ( (LA3_0==35) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalVmsc.g:486:2: ( ruleVAttribute )
                    {
                    // InternalVmsc.g:486:2: ( ruleVAttribute )
                    // InternalVmsc.g:487:3: ruleVAttribute
                    {
                     before(grammarAccess.getVStructuralFeaturesAccess().getVAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVAttribute();

                    state._fsp--;

                     after(grammarAccess.getVStructuralFeaturesAccess().getVAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVmsc.g:492:2: ( ruleVReference )
                    {
                    // InternalVmsc.g:492:2: ( ruleVReference )
                    // InternalVmsc.g:493:3: ruleVReference
                    {
                     before(grammarAccess.getVStructuralFeaturesAccess().getVReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVReference();

                    state._fsp--;

                     after(grammarAccess.getVStructuralFeaturesAccess().getVReferenceParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VStructuralFeatures__Alternatives"


    // $ANTLR start "rule__VType__Alternatives"
    // InternalVmsc.g:502:1: rule__VType__Alternatives : ( ( ruleVString ) | ( ruleVInt ) | ( ruleVFloat ) );
    public final void rule__VType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:506:1: ( ( ruleVString ) | ( ruleVInt ) | ( ruleVFloat ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt4=1;
                }
                break;
            case 38:
                {
                alt4=2;
                }
                break;
            case 39:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalVmsc.g:507:2: ( ruleVString )
                    {
                    // InternalVmsc.g:507:2: ( ruleVString )
                    // InternalVmsc.g:508:3: ruleVString
                    {
                     before(grammarAccess.getVTypeAccess().getVStringParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVString();

                    state._fsp--;

                     after(grammarAccess.getVTypeAccess().getVStringParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVmsc.g:513:2: ( ruleVInt )
                    {
                    // InternalVmsc.g:513:2: ( ruleVInt )
                    // InternalVmsc.g:514:3: ruleVInt
                    {
                     before(grammarAccess.getVTypeAccess().getVIntParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVInt();

                    state._fsp--;

                     after(grammarAccess.getVTypeAccess().getVIntParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVmsc.g:519:2: ( ruleVFloat )
                    {
                    // InternalVmsc.g:519:2: ( ruleVFloat )
                    // InternalVmsc.g:520:3: ruleVFloat
                    {
                     before(grammarAccess.getVTypeAccess().getVFloatParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVFloat();

                    state._fsp--;

                     after(grammarAccess.getVTypeAccess().getVFloatParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VType__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalVmsc.g:529:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:533:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalVmsc.g:534:2: ( RULE_STRING )
                    {
                    // InternalVmsc.g:534:2: ( RULE_STRING )
                    // InternalVmsc.g:535:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVmsc.g:540:2: ( RULE_ID )
                    {
                    // InternalVmsc.g:540:2: ( RULE_ID )
                    // InternalVmsc.g:541:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EFloat__Alternatives_4_0"
    // InternalVmsc.g:550:1: rule__EFloat__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EFloat__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:554:1: ( ( 'E' ) | ( 'e' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalVmsc.g:555:2: ( 'E' )
                    {
                    // InternalVmsc.g:555:2: ( 'E' )
                    // InternalVmsc.g:556:3: 'E'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVmsc.g:561:2: ( 'e' )
                    {
                    // InternalVmsc.g:561:2: ( 'e' )
                    // InternalVmsc.g:562:3: 'e'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Alternatives_4_0"


    // $ANTLR start "rule__VPackage__Group__0"
    // InternalVmsc.g:571:1: rule__VPackage__Group__0 : rule__VPackage__Group__0__Impl rule__VPackage__Group__1 ;
    public final void rule__VPackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:575:1: ( rule__VPackage__Group__0__Impl rule__VPackage__Group__1 )
            // InternalVmsc.g:576:2: rule__VPackage__Group__0__Impl rule__VPackage__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__VPackage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPackage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group__0"


    // $ANTLR start "rule__VPackage__Group__0__Impl"
    // InternalVmsc.g:583:1: rule__VPackage__Group__0__Impl : ( () ) ;
    public final void rule__VPackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:587:1: ( ( () ) )
            // InternalVmsc.g:588:1: ( () )
            {
            // InternalVmsc.g:588:1: ( () )
            // InternalVmsc.g:589:2: ()
            {
             before(grammarAccess.getVPackageAccess().getVPackageAction_0()); 
            // InternalVmsc.g:590:2: ()
            // InternalVmsc.g:590:3: 
            {
            }

             after(grammarAccess.getVPackageAccess().getVPackageAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group__0__Impl"


    // $ANTLR start "rule__VPackage__Group__1"
    // InternalVmsc.g:598:1: rule__VPackage__Group__1 : rule__VPackage__Group__1__Impl rule__VPackage__Group__2 ;
    public final void rule__VPackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:602:1: ( rule__VPackage__Group__1__Impl rule__VPackage__Group__2 )
            // InternalVmsc.g:603:2: rule__VPackage__Group__1__Impl rule__VPackage__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__VPackage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPackage__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group__1"


    // $ANTLR start "rule__VPackage__Group__1__Impl"
    // InternalVmsc.g:610:1: rule__VPackage__Group__1__Impl : ( 'VPackage' ) ;
    public final void rule__VPackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:614:1: ( ( 'VPackage' ) )
            // InternalVmsc.g:615:1: ( 'VPackage' )
            {
            // InternalVmsc.g:615:1: ( 'VPackage' )
            // InternalVmsc.g:616:2: 'VPackage'
            {
             before(grammarAccess.getVPackageAccess().getVPackageKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getVPackageAccess().getVPackageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group__1__Impl"


    // $ANTLR start "rule__VPackage__Group__2"
    // InternalVmsc.g:625:1: rule__VPackage__Group__2 : rule__VPackage__Group__2__Impl rule__VPackage__Group__3 ;
    public final void rule__VPackage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:629:1: ( rule__VPackage__Group__2__Impl rule__VPackage__Group__3 )
            // InternalVmsc.g:630:2: rule__VPackage__Group__2__Impl rule__VPackage__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__VPackage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPackage__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group__2"


    // $ANTLR start "rule__VPackage__Group__2__Impl"
    // InternalVmsc.g:637:1: rule__VPackage__Group__2__Impl : ( ':' ) ;
    public final void rule__VPackage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:641:1: ( ( ':' ) )
            // InternalVmsc.g:642:1: ( ':' )
            {
            // InternalVmsc.g:642:1: ( ':' )
            // InternalVmsc.g:643:2: ':'
            {
             before(grammarAccess.getVPackageAccess().getColonKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVPackageAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group__2__Impl"


    // $ANTLR start "rule__VPackage__Group__3"
    // InternalVmsc.g:652:1: rule__VPackage__Group__3 : rule__VPackage__Group__3__Impl rule__VPackage__Group__4 ;
    public final void rule__VPackage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:656:1: ( rule__VPackage__Group__3__Impl rule__VPackage__Group__4 )
            // InternalVmsc.g:657:2: rule__VPackage__Group__3__Impl rule__VPackage__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__VPackage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPackage__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group__3"


    // $ANTLR start "rule__VPackage__Group__3__Impl"
    // InternalVmsc.g:664:1: rule__VPackage__Group__3__Impl : ( '{' ) ;
    public final void rule__VPackage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:668:1: ( ( '{' ) )
            // InternalVmsc.g:669:1: ( '{' )
            {
            // InternalVmsc.g:669:1: ( '{' )
            // InternalVmsc.g:670:2: '{'
            {
             before(grammarAccess.getVPackageAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getVPackageAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group__3__Impl"


    // $ANTLR start "rule__VPackage__Group__4"
    // InternalVmsc.g:679:1: rule__VPackage__Group__4 : rule__VPackage__Group__4__Impl rule__VPackage__Group__5 ;
    public final void rule__VPackage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:683:1: ( rule__VPackage__Group__4__Impl rule__VPackage__Group__5 )
            // InternalVmsc.g:684:2: rule__VPackage__Group__4__Impl rule__VPackage__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__VPackage__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPackage__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group__4"


    // $ANTLR start "rule__VPackage__Group__4__Impl"
    // InternalVmsc.g:691:1: rule__VPackage__Group__4__Impl : ( 'name' ) ;
    public final void rule__VPackage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:695:1: ( ( 'name' ) )
            // InternalVmsc.g:696:1: ( 'name' )
            {
            // InternalVmsc.g:696:1: ( 'name' )
            // InternalVmsc.g:697:2: 'name'
            {
             before(grammarAccess.getVPackageAccess().getNameKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getVPackageAccess().getNameKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group__4__Impl"


    // $ANTLR start "rule__VPackage__Group__5"
    // InternalVmsc.g:706:1: rule__VPackage__Group__5 : rule__VPackage__Group__5__Impl rule__VPackage__Group__6 ;
    public final void rule__VPackage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:710:1: ( rule__VPackage__Group__5__Impl rule__VPackage__Group__6 )
            // InternalVmsc.g:711:2: rule__VPackage__Group__5__Impl rule__VPackage__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__VPackage__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPackage__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group__5"


    // $ANTLR start "rule__VPackage__Group__5__Impl"
    // InternalVmsc.g:718:1: rule__VPackage__Group__5__Impl : ( ':' ) ;
    public final void rule__VPackage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:722:1: ( ( ':' ) )
            // InternalVmsc.g:723:1: ( ':' )
            {
            // InternalVmsc.g:723:1: ( ':' )
            // InternalVmsc.g:724:2: ':'
            {
             before(grammarAccess.getVPackageAccess().getColonKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVPackageAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group__5__Impl"


    // $ANTLR start "rule__VPackage__Group__6"
    // InternalVmsc.g:733:1: rule__VPackage__Group__6 : rule__VPackage__Group__6__Impl rule__VPackage__Group__7 ;
    public final void rule__VPackage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:737:1: ( rule__VPackage__Group__6__Impl rule__VPackage__Group__7 )
            // InternalVmsc.g:738:2: rule__VPackage__Group__6__Impl rule__VPackage__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__VPackage__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPackage__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group__6"


    // $ANTLR start "rule__VPackage__Group__6__Impl"
    // InternalVmsc.g:745:1: rule__VPackage__Group__6__Impl : ( ( rule__VPackage__NameAssignment_6 ) ) ;
    public final void rule__VPackage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:749:1: ( ( ( rule__VPackage__NameAssignment_6 ) ) )
            // InternalVmsc.g:750:1: ( ( rule__VPackage__NameAssignment_6 ) )
            {
            // InternalVmsc.g:750:1: ( ( rule__VPackage__NameAssignment_6 ) )
            // InternalVmsc.g:751:2: ( rule__VPackage__NameAssignment_6 )
            {
             before(grammarAccess.getVPackageAccess().getNameAssignment_6()); 
            // InternalVmsc.g:752:2: ( rule__VPackage__NameAssignment_6 )
            // InternalVmsc.g:752:3: rule__VPackage__NameAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__VPackage__NameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getVPackageAccess().getNameAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group__6__Impl"


    // $ANTLR start "rule__VPackage__Group__7"
    // InternalVmsc.g:760:1: rule__VPackage__Group__7 : rule__VPackage__Group__7__Impl rule__VPackage__Group__8 ;
    public final void rule__VPackage__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:764:1: ( rule__VPackage__Group__7__Impl rule__VPackage__Group__8 )
            // InternalVmsc.g:765:2: rule__VPackage__Group__7__Impl rule__VPackage__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__VPackage__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPackage__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group__7"


    // $ANTLR start "rule__VPackage__Group__7__Impl"
    // InternalVmsc.g:772:1: rule__VPackage__Group__7__Impl : ( ( rule__VPackage__Alternatives_7 ) ) ;
    public final void rule__VPackage__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:776:1: ( ( ( rule__VPackage__Alternatives_7 ) ) )
            // InternalVmsc.g:777:1: ( ( rule__VPackage__Alternatives_7 ) )
            {
            // InternalVmsc.g:777:1: ( ( rule__VPackage__Alternatives_7 ) )
            // InternalVmsc.g:778:2: ( rule__VPackage__Alternatives_7 )
            {
             before(grammarAccess.getVPackageAccess().getAlternatives_7()); 
            // InternalVmsc.g:779:2: ( rule__VPackage__Alternatives_7 )
            // InternalVmsc.g:779:3: rule__VPackage__Alternatives_7
            {
            pushFollow(FOLLOW_2);
            rule__VPackage__Alternatives_7();

            state._fsp--;


            }

             after(grammarAccess.getVPackageAccess().getAlternatives_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group__7__Impl"


    // $ANTLR start "rule__VPackage__Group__8"
    // InternalVmsc.g:787:1: rule__VPackage__Group__8 : rule__VPackage__Group__8__Impl rule__VPackage__Group__9 ;
    public final void rule__VPackage__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:791:1: ( rule__VPackage__Group__8__Impl rule__VPackage__Group__9 )
            // InternalVmsc.g:792:2: rule__VPackage__Group__8__Impl rule__VPackage__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__VPackage__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPackage__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group__8"


    // $ANTLR start "rule__VPackage__Group__8__Impl"
    // InternalVmsc.g:799:1: rule__VPackage__Group__8__Impl : ( ( rule__VPackage__Group_8__0 ) ) ;
    public final void rule__VPackage__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:803:1: ( ( ( rule__VPackage__Group_8__0 ) ) )
            // InternalVmsc.g:804:1: ( ( rule__VPackage__Group_8__0 ) )
            {
            // InternalVmsc.g:804:1: ( ( rule__VPackage__Group_8__0 ) )
            // InternalVmsc.g:805:2: ( rule__VPackage__Group_8__0 )
            {
             before(grammarAccess.getVPackageAccess().getGroup_8()); 
            // InternalVmsc.g:806:2: ( rule__VPackage__Group_8__0 )
            // InternalVmsc.g:806:3: rule__VPackage__Group_8__0
            {
            pushFollow(FOLLOW_2);
            rule__VPackage__Group_8__0();

            state._fsp--;


            }

             after(grammarAccess.getVPackageAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group__8__Impl"


    // $ANTLR start "rule__VPackage__Group__9"
    // InternalVmsc.g:814:1: rule__VPackage__Group__9 : rule__VPackage__Group__9__Impl rule__VPackage__Group__10 ;
    public final void rule__VPackage__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:818:1: ( rule__VPackage__Group__9__Impl rule__VPackage__Group__10 )
            // InternalVmsc.g:819:2: rule__VPackage__Group__9__Impl rule__VPackage__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__VPackage__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPackage__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group__9"


    // $ANTLR start "rule__VPackage__Group__9__Impl"
    // InternalVmsc.g:826:1: rule__VPackage__Group__9__Impl : ( ( rule__VPackage__Group_9__0 ) ) ;
    public final void rule__VPackage__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:830:1: ( ( ( rule__VPackage__Group_9__0 ) ) )
            // InternalVmsc.g:831:1: ( ( rule__VPackage__Group_9__0 ) )
            {
            // InternalVmsc.g:831:1: ( ( rule__VPackage__Group_9__0 ) )
            // InternalVmsc.g:832:2: ( rule__VPackage__Group_9__0 )
            {
             before(grammarAccess.getVPackageAccess().getGroup_9()); 
            // InternalVmsc.g:833:2: ( rule__VPackage__Group_9__0 )
            // InternalVmsc.g:833:3: rule__VPackage__Group_9__0
            {
            pushFollow(FOLLOW_2);
            rule__VPackage__Group_9__0();

            state._fsp--;


            }

             after(grammarAccess.getVPackageAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group__9__Impl"


    // $ANTLR start "rule__VPackage__Group__10"
    // InternalVmsc.g:841:1: rule__VPackage__Group__10 : rule__VPackage__Group__10__Impl rule__VPackage__Group__11 ;
    public final void rule__VPackage__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:845:1: ( rule__VPackage__Group__10__Impl rule__VPackage__Group__11 )
            // InternalVmsc.g:846:2: rule__VPackage__Group__10__Impl rule__VPackage__Group__11
            {
            pushFollow(FOLLOW_11);
            rule__VPackage__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPackage__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group__10"


    // $ANTLR start "rule__VPackage__Group__10__Impl"
    // InternalVmsc.g:853:1: rule__VPackage__Group__10__Impl : ( ( rule__VPackage__Group_10__0 )? ) ;
    public final void rule__VPackage__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:857:1: ( ( ( rule__VPackage__Group_10__0 )? ) )
            // InternalVmsc.g:858:1: ( ( rule__VPackage__Group_10__0 )? )
            {
            // InternalVmsc.g:858:1: ( ( rule__VPackage__Group_10__0 )? )
            // InternalVmsc.g:859:2: ( rule__VPackage__Group_10__0 )?
            {
             before(grammarAccess.getVPackageAccess().getGroup_10()); 
            // InternalVmsc.g:860:2: ( rule__VPackage__Group_10__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalVmsc.g:860:3: rule__VPackage__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VPackage__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVPackageAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group__10__Impl"


    // $ANTLR start "rule__VPackage__Group__11"
    // InternalVmsc.g:868:1: rule__VPackage__Group__11 : rule__VPackage__Group__11__Impl ;
    public final void rule__VPackage__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:872:1: ( rule__VPackage__Group__11__Impl )
            // InternalVmsc.g:873:2: rule__VPackage__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VPackage__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group__11"


    // $ANTLR start "rule__VPackage__Group__11__Impl"
    // InternalVmsc.g:879:1: rule__VPackage__Group__11__Impl : ( '}' ) ;
    public final void rule__VPackage__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:883:1: ( ( '}' ) )
            // InternalVmsc.g:884:1: ( '}' )
            {
            // InternalVmsc.g:884:1: ( '}' )
            // InternalVmsc.g:885:2: '}'
            {
             before(grammarAccess.getVPackageAccess().getRightCurlyBracketKeyword_11()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getVPackageAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group__11__Impl"


    // $ANTLR start "rule__VPackage__Group_8__0"
    // InternalVmsc.g:895:1: rule__VPackage__Group_8__0 : rule__VPackage__Group_8__0__Impl rule__VPackage__Group_8__1 ;
    public final void rule__VPackage__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:899:1: ( rule__VPackage__Group_8__0__Impl rule__VPackage__Group_8__1 )
            // InternalVmsc.g:900:2: rule__VPackage__Group_8__0__Impl rule__VPackage__Group_8__1
            {
            pushFollow(FOLLOW_4);
            rule__VPackage__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPackage__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group_8__0"


    // $ANTLR start "rule__VPackage__Group_8__0__Impl"
    // InternalVmsc.g:907:1: rule__VPackage__Group_8__0__Impl : ( 'VPrefix' ) ;
    public final void rule__VPackage__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:911:1: ( ( 'VPrefix' ) )
            // InternalVmsc.g:912:1: ( 'VPrefix' )
            {
            // InternalVmsc.g:912:1: ( 'VPrefix' )
            // InternalVmsc.g:913:2: 'VPrefix'
            {
             before(grammarAccess.getVPackageAccess().getVPrefixKeyword_8_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getVPackageAccess().getVPrefixKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group_8__0__Impl"


    // $ANTLR start "rule__VPackage__Group_8__1"
    // InternalVmsc.g:922:1: rule__VPackage__Group_8__1 : rule__VPackage__Group_8__1__Impl rule__VPackage__Group_8__2 ;
    public final void rule__VPackage__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:926:1: ( rule__VPackage__Group_8__1__Impl rule__VPackage__Group_8__2 )
            // InternalVmsc.g:927:2: rule__VPackage__Group_8__1__Impl rule__VPackage__Group_8__2
            {
            pushFollow(FOLLOW_7);
            rule__VPackage__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPackage__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group_8__1"


    // $ANTLR start "rule__VPackage__Group_8__1__Impl"
    // InternalVmsc.g:934:1: rule__VPackage__Group_8__1__Impl : ( ':' ) ;
    public final void rule__VPackage__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:938:1: ( ( ':' ) )
            // InternalVmsc.g:939:1: ( ':' )
            {
            // InternalVmsc.g:939:1: ( ':' )
            // InternalVmsc.g:940:2: ':'
            {
             before(grammarAccess.getVPackageAccess().getColonKeyword_8_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVPackageAccess().getColonKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group_8__1__Impl"


    // $ANTLR start "rule__VPackage__Group_8__2"
    // InternalVmsc.g:949:1: rule__VPackage__Group_8__2 : rule__VPackage__Group_8__2__Impl rule__VPackage__Group_8__3 ;
    public final void rule__VPackage__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:953:1: ( rule__VPackage__Group_8__2__Impl rule__VPackage__Group_8__3 )
            // InternalVmsc.g:954:2: rule__VPackage__Group_8__2__Impl rule__VPackage__Group_8__3
            {
            pushFollow(FOLLOW_12);
            rule__VPackage__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPackage__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group_8__2"


    // $ANTLR start "rule__VPackage__Group_8__2__Impl"
    // InternalVmsc.g:961:1: rule__VPackage__Group_8__2__Impl : ( ( rule__VPackage__VPrefixAssignment_8_2 ) ) ;
    public final void rule__VPackage__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:965:1: ( ( ( rule__VPackage__VPrefixAssignment_8_2 ) ) )
            // InternalVmsc.g:966:1: ( ( rule__VPackage__VPrefixAssignment_8_2 ) )
            {
            // InternalVmsc.g:966:1: ( ( rule__VPackage__VPrefixAssignment_8_2 ) )
            // InternalVmsc.g:967:2: ( rule__VPackage__VPrefixAssignment_8_2 )
            {
             before(grammarAccess.getVPackageAccess().getVPrefixAssignment_8_2()); 
            // InternalVmsc.g:968:2: ( rule__VPackage__VPrefixAssignment_8_2 )
            // InternalVmsc.g:968:3: rule__VPackage__VPrefixAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__VPackage__VPrefixAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getVPackageAccess().getVPrefixAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group_8__2__Impl"


    // $ANTLR start "rule__VPackage__Group_8__3"
    // InternalVmsc.g:976:1: rule__VPackage__Group_8__3 : rule__VPackage__Group_8__3__Impl ;
    public final void rule__VPackage__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:980:1: ( rule__VPackage__Group_8__3__Impl )
            // InternalVmsc.g:981:2: rule__VPackage__Group_8__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VPackage__Group_8__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group_8__3"


    // $ANTLR start "rule__VPackage__Group_8__3__Impl"
    // InternalVmsc.g:987:1: rule__VPackage__Group_8__3__Impl : ( ',' ) ;
    public final void rule__VPackage__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:991:1: ( ( ',' ) )
            // InternalVmsc.g:992:1: ( ',' )
            {
            // InternalVmsc.g:992:1: ( ',' )
            // InternalVmsc.g:993:2: ','
            {
             before(grammarAccess.getVPackageAccess().getCommaKeyword_8_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getVPackageAccess().getCommaKeyword_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group_8__3__Impl"


    // $ANTLR start "rule__VPackage__Group_9__0"
    // InternalVmsc.g:1003:1: rule__VPackage__Group_9__0 : rule__VPackage__Group_9__0__Impl rule__VPackage__Group_9__1 ;
    public final void rule__VPackage__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1007:1: ( rule__VPackage__Group_9__0__Impl rule__VPackage__Group_9__1 )
            // InternalVmsc.g:1008:2: rule__VPackage__Group_9__0__Impl rule__VPackage__Group_9__1
            {
            pushFollow(FOLLOW_4);
            rule__VPackage__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPackage__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group_9__0"


    // $ANTLR start "rule__VPackage__Group_9__0__Impl"
    // InternalVmsc.g:1015:1: rule__VPackage__Group_9__0__Impl : ( 'VUri' ) ;
    public final void rule__VPackage__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1019:1: ( ( 'VUri' ) )
            // InternalVmsc.g:1020:1: ( 'VUri' )
            {
            // InternalVmsc.g:1020:1: ( 'VUri' )
            // InternalVmsc.g:1021:2: 'VUri'
            {
             before(grammarAccess.getVPackageAccess().getVUriKeyword_9_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getVPackageAccess().getVUriKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group_9__0__Impl"


    // $ANTLR start "rule__VPackage__Group_9__1"
    // InternalVmsc.g:1030:1: rule__VPackage__Group_9__1 : rule__VPackage__Group_9__1__Impl rule__VPackage__Group_9__2 ;
    public final void rule__VPackage__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1034:1: ( rule__VPackage__Group_9__1__Impl rule__VPackage__Group_9__2 )
            // InternalVmsc.g:1035:2: rule__VPackage__Group_9__1__Impl rule__VPackage__Group_9__2
            {
            pushFollow(FOLLOW_7);
            rule__VPackage__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPackage__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group_9__1"


    // $ANTLR start "rule__VPackage__Group_9__1__Impl"
    // InternalVmsc.g:1042:1: rule__VPackage__Group_9__1__Impl : ( ':' ) ;
    public final void rule__VPackage__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1046:1: ( ( ':' ) )
            // InternalVmsc.g:1047:1: ( ':' )
            {
            // InternalVmsc.g:1047:1: ( ':' )
            // InternalVmsc.g:1048:2: ':'
            {
             before(grammarAccess.getVPackageAccess().getColonKeyword_9_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVPackageAccess().getColonKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group_9__1__Impl"


    // $ANTLR start "rule__VPackage__Group_9__2"
    // InternalVmsc.g:1057:1: rule__VPackage__Group_9__2 : rule__VPackage__Group_9__2__Impl rule__VPackage__Group_9__3 ;
    public final void rule__VPackage__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1061:1: ( rule__VPackage__Group_9__2__Impl rule__VPackage__Group_9__3 )
            // InternalVmsc.g:1062:2: rule__VPackage__Group_9__2__Impl rule__VPackage__Group_9__3
            {
            pushFollow(FOLLOW_12);
            rule__VPackage__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPackage__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group_9__2"


    // $ANTLR start "rule__VPackage__Group_9__2__Impl"
    // InternalVmsc.g:1069:1: rule__VPackage__Group_9__2__Impl : ( ( rule__VPackage__VUriAssignment_9_2 ) ) ;
    public final void rule__VPackage__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1073:1: ( ( ( rule__VPackage__VUriAssignment_9_2 ) ) )
            // InternalVmsc.g:1074:1: ( ( rule__VPackage__VUriAssignment_9_2 ) )
            {
            // InternalVmsc.g:1074:1: ( ( rule__VPackage__VUriAssignment_9_2 ) )
            // InternalVmsc.g:1075:2: ( rule__VPackage__VUriAssignment_9_2 )
            {
             before(grammarAccess.getVPackageAccess().getVUriAssignment_9_2()); 
            // InternalVmsc.g:1076:2: ( rule__VPackage__VUriAssignment_9_2 )
            // InternalVmsc.g:1076:3: rule__VPackage__VUriAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__VPackage__VUriAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getVPackageAccess().getVUriAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group_9__2__Impl"


    // $ANTLR start "rule__VPackage__Group_9__3"
    // InternalVmsc.g:1084:1: rule__VPackage__Group_9__3 : rule__VPackage__Group_9__3__Impl ;
    public final void rule__VPackage__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1088:1: ( rule__VPackage__Group_9__3__Impl )
            // InternalVmsc.g:1089:2: rule__VPackage__Group_9__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VPackage__Group_9__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group_9__3"


    // $ANTLR start "rule__VPackage__Group_9__3__Impl"
    // InternalVmsc.g:1095:1: rule__VPackage__Group_9__3__Impl : ( ',' ) ;
    public final void rule__VPackage__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1099:1: ( ( ',' ) )
            // InternalVmsc.g:1100:1: ( ',' )
            {
            // InternalVmsc.g:1100:1: ( ',' )
            // InternalVmsc.g:1101:2: ','
            {
             before(grammarAccess.getVPackageAccess().getCommaKeyword_9_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getVPackageAccess().getCommaKeyword_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group_9__3__Impl"


    // $ANTLR start "rule__VPackage__Group_10__0"
    // InternalVmsc.g:1111:1: rule__VPackage__Group_10__0 : rule__VPackage__Group_10__0__Impl rule__VPackage__Group_10__1 ;
    public final void rule__VPackage__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1115:1: ( rule__VPackage__Group_10__0__Impl rule__VPackage__Group_10__1 )
            // InternalVmsc.g:1116:2: rule__VPackage__Group_10__0__Impl rule__VPackage__Group_10__1
            {
            pushFollow(FOLLOW_4);
            rule__VPackage__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPackage__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group_10__0"


    // $ANTLR start "rule__VPackage__Group_10__0__Impl"
    // InternalVmsc.g:1123:1: rule__VPackage__Group_10__0__Impl : ( 'VComponents' ) ;
    public final void rule__VPackage__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1127:1: ( ( 'VComponents' ) )
            // InternalVmsc.g:1128:1: ( 'VComponents' )
            {
            // InternalVmsc.g:1128:1: ( 'VComponents' )
            // InternalVmsc.g:1129:2: 'VComponents'
            {
             before(grammarAccess.getVPackageAccess().getVComponentsKeyword_10_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getVPackageAccess().getVComponentsKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group_10__0__Impl"


    // $ANTLR start "rule__VPackage__Group_10__1"
    // InternalVmsc.g:1138:1: rule__VPackage__Group_10__1 : rule__VPackage__Group_10__1__Impl rule__VPackage__Group_10__2 ;
    public final void rule__VPackage__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1142:1: ( rule__VPackage__Group_10__1__Impl rule__VPackage__Group_10__2 )
            // InternalVmsc.g:1143:2: rule__VPackage__Group_10__1__Impl rule__VPackage__Group_10__2
            {
            pushFollow(FOLLOW_13);
            rule__VPackage__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPackage__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group_10__1"


    // $ANTLR start "rule__VPackage__Group_10__1__Impl"
    // InternalVmsc.g:1150:1: rule__VPackage__Group_10__1__Impl : ( ':' ) ;
    public final void rule__VPackage__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1154:1: ( ( ':' ) )
            // InternalVmsc.g:1155:1: ( ':' )
            {
            // InternalVmsc.g:1155:1: ( ':' )
            // InternalVmsc.g:1156:2: ':'
            {
             before(grammarAccess.getVPackageAccess().getColonKeyword_10_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVPackageAccess().getColonKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group_10__1__Impl"


    // $ANTLR start "rule__VPackage__Group_10__2"
    // InternalVmsc.g:1165:1: rule__VPackage__Group_10__2 : rule__VPackage__Group_10__2__Impl rule__VPackage__Group_10__3 ;
    public final void rule__VPackage__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1169:1: ( rule__VPackage__Group_10__2__Impl rule__VPackage__Group_10__3 )
            // InternalVmsc.g:1170:2: rule__VPackage__Group_10__2__Impl rule__VPackage__Group_10__3
            {
            pushFollow(FOLLOW_5);
            rule__VPackage__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPackage__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group_10__2"


    // $ANTLR start "rule__VPackage__Group_10__2__Impl"
    // InternalVmsc.g:1177:1: rule__VPackage__Group_10__2__Impl : ( '[' ) ;
    public final void rule__VPackage__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1181:1: ( ( '[' ) )
            // InternalVmsc.g:1182:1: ( '[' )
            {
            // InternalVmsc.g:1182:1: ( '[' )
            // InternalVmsc.g:1183:2: '['
            {
             before(grammarAccess.getVPackageAccess().getLeftSquareBracketKeyword_10_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getVPackageAccess().getLeftSquareBracketKeyword_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group_10__2__Impl"


    // $ANTLR start "rule__VPackage__Group_10__3"
    // InternalVmsc.g:1192:1: rule__VPackage__Group_10__3 : rule__VPackage__Group_10__3__Impl rule__VPackage__Group_10__4 ;
    public final void rule__VPackage__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1196:1: ( rule__VPackage__Group_10__3__Impl rule__VPackage__Group_10__4 )
            // InternalVmsc.g:1197:2: rule__VPackage__Group_10__3__Impl rule__VPackage__Group_10__4
            {
            pushFollow(FOLLOW_14);
            rule__VPackage__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPackage__Group_10__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group_10__3"


    // $ANTLR start "rule__VPackage__Group_10__3__Impl"
    // InternalVmsc.g:1204:1: rule__VPackage__Group_10__3__Impl : ( '{' ) ;
    public final void rule__VPackage__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1208:1: ( ( '{' ) )
            // InternalVmsc.g:1209:1: ( '{' )
            {
            // InternalVmsc.g:1209:1: ( '{' )
            // InternalVmsc.g:1210:2: '{'
            {
             before(grammarAccess.getVPackageAccess().getLeftCurlyBracketKeyword_10_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getVPackageAccess().getLeftCurlyBracketKeyword_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group_10__3__Impl"


    // $ANTLR start "rule__VPackage__Group_10__4"
    // InternalVmsc.g:1219:1: rule__VPackage__Group_10__4 : rule__VPackage__Group_10__4__Impl rule__VPackage__Group_10__5 ;
    public final void rule__VPackage__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1223:1: ( rule__VPackage__Group_10__4__Impl rule__VPackage__Group_10__5 )
            // InternalVmsc.g:1224:2: rule__VPackage__Group_10__4__Impl rule__VPackage__Group_10__5
            {
            pushFollow(FOLLOW_15);
            rule__VPackage__Group_10__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPackage__Group_10__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group_10__4"


    // $ANTLR start "rule__VPackage__Group_10__4__Impl"
    // InternalVmsc.g:1231:1: rule__VPackage__Group_10__4__Impl : ( ( rule__VPackage__VComponentsAssignment_10_4 ) ) ;
    public final void rule__VPackage__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1235:1: ( ( ( rule__VPackage__VComponentsAssignment_10_4 ) ) )
            // InternalVmsc.g:1236:1: ( ( rule__VPackage__VComponentsAssignment_10_4 ) )
            {
            // InternalVmsc.g:1236:1: ( ( rule__VPackage__VComponentsAssignment_10_4 ) )
            // InternalVmsc.g:1237:2: ( rule__VPackage__VComponentsAssignment_10_4 )
            {
             before(grammarAccess.getVPackageAccess().getVComponentsAssignment_10_4()); 
            // InternalVmsc.g:1238:2: ( rule__VPackage__VComponentsAssignment_10_4 )
            // InternalVmsc.g:1238:3: rule__VPackage__VComponentsAssignment_10_4
            {
            pushFollow(FOLLOW_2);
            rule__VPackage__VComponentsAssignment_10_4();

            state._fsp--;


            }

             after(grammarAccess.getVPackageAccess().getVComponentsAssignment_10_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group_10__4__Impl"


    // $ANTLR start "rule__VPackage__Group_10__5"
    // InternalVmsc.g:1246:1: rule__VPackage__Group_10__5 : rule__VPackage__Group_10__5__Impl rule__VPackage__Group_10__6 ;
    public final void rule__VPackage__Group_10__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1250:1: ( rule__VPackage__Group_10__5__Impl rule__VPackage__Group_10__6 )
            // InternalVmsc.g:1251:2: rule__VPackage__Group_10__5__Impl rule__VPackage__Group_10__6
            {
            pushFollow(FOLLOW_16);
            rule__VPackage__Group_10__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPackage__Group_10__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group_10__5"


    // $ANTLR start "rule__VPackage__Group_10__5__Impl"
    // InternalVmsc.g:1258:1: rule__VPackage__Group_10__5__Impl : ( '}' ) ;
    public final void rule__VPackage__Group_10__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1262:1: ( ( '}' ) )
            // InternalVmsc.g:1263:1: ( '}' )
            {
            // InternalVmsc.g:1263:1: ( '}' )
            // InternalVmsc.g:1264:2: '}'
            {
             before(grammarAccess.getVPackageAccess().getRightCurlyBracketKeyword_10_5()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getVPackageAccess().getRightCurlyBracketKeyword_10_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group_10__5__Impl"


    // $ANTLR start "rule__VPackage__Group_10__6"
    // InternalVmsc.g:1273:1: rule__VPackage__Group_10__6 : rule__VPackage__Group_10__6__Impl rule__VPackage__Group_10__7 ;
    public final void rule__VPackage__Group_10__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1277:1: ( rule__VPackage__Group_10__6__Impl rule__VPackage__Group_10__7 )
            // InternalVmsc.g:1278:2: rule__VPackage__Group_10__6__Impl rule__VPackage__Group_10__7
            {
            pushFollow(FOLLOW_16);
            rule__VPackage__Group_10__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPackage__Group_10__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group_10__6"


    // $ANTLR start "rule__VPackage__Group_10__6__Impl"
    // InternalVmsc.g:1285:1: rule__VPackage__Group_10__6__Impl : ( ( rule__VPackage__Group_10_6__0 )* ) ;
    public final void rule__VPackage__Group_10__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1289:1: ( ( ( rule__VPackage__Group_10_6__0 )* ) )
            // InternalVmsc.g:1290:1: ( ( rule__VPackage__Group_10_6__0 )* )
            {
            // InternalVmsc.g:1290:1: ( ( rule__VPackage__Group_10_6__0 )* )
            // InternalVmsc.g:1291:2: ( rule__VPackage__Group_10_6__0 )*
            {
             before(grammarAccess.getVPackageAccess().getGroup_10_6()); 
            // InternalVmsc.g:1292:2: ( rule__VPackage__Group_10_6__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==11) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalVmsc.g:1292:3: rule__VPackage__Group_10_6__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__VPackage__Group_10_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getVPackageAccess().getGroup_10_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group_10__6__Impl"


    // $ANTLR start "rule__VPackage__Group_10__7"
    // InternalVmsc.g:1300:1: rule__VPackage__Group_10__7 : rule__VPackage__Group_10__7__Impl ;
    public final void rule__VPackage__Group_10__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1304:1: ( rule__VPackage__Group_10__7__Impl )
            // InternalVmsc.g:1305:2: rule__VPackage__Group_10__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VPackage__Group_10__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group_10__7"


    // $ANTLR start "rule__VPackage__Group_10__7__Impl"
    // InternalVmsc.g:1311:1: rule__VPackage__Group_10__7__Impl : ( ']' ) ;
    public final void rule__VPackage__Group_10__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1315:1: ( ( ']' ) )
            // InternalVmsc.g:1316:1: ( ']' )
            {
            // InternalVmsc.g:1316:1: ( ']' )
            // InternalVmsc.g:1317:2: ']'
            {
             before(grammarAccess.getVPackageAccess().getRightSquareBracketKeyword_10_7()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getVPackageAccess().getRightSquareBracketKeyword_10_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group_10__7__Impl"


    // $ANTLR start "rule__VPackage__Group_10_6__0"
    // InternalVmsc.g:1327:1: rule__VPackage__Group_10_6__0 : rule__VPackage__Group_10_6__0__Impl rule__VPackage__Group_10_6__1 ;
    public final void rule__VPackage__Group_10_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1331:1: ( rule__VPackage__Group_10_6__0__Impl rule__VPackage__Group_10_6__1 )
            // InternalVmsc.g:1332:2: rule__VPackage__Group_10_6__0__Impl rule__VPackage__Group_10_6__1
            {
            pushFollow(FOLLOW_5);
            rule__VPackage__Group_10_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPackage__Group_10_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group_10_6__0"


    // $ANTLR start "rule__VPackage__Group_10_6__0__Impl"
    // InternalVmsc.g:1339:1: rule__VPackage__Group_10_6__0__Impl : ( ',' ) ;
    public final void rule__VPackage__Group_10_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1343:1: ( ( ',' ) )
            // InternalVmsc.g:1344:1: ( ',' )
            {
            // InternalVmsc.g:1344:1: ( ',' )
            // InternalVmsc.g:1345:2: ','
            {
             before(grammarAccess.getVPackageAccess().getCommaKeyword_10_6_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getVPackageAccess().getCommaKeyword_10_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group_10_6__0__Impl"


    // $ANTLR start "rule__VPackage__Group_10_6__1"
    // InternalVmsc.g:1354:1: rule__VPackage__Group_10_6__1 : rule__VPackage__Group_10_6__1__Impl rule__VPackage__Group_10_6__2 ;
    public final void rule__VPackage__Group_10_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1358:1: ( rule__VPackage__Group_10_6__1__Impl rule__VPackage__Group_10_6__2 )
            // InternalVmsc.g:1359:2: rule__VPackage__Group_10_6__1__Impl rule__VPackage__Group_10_6__2
            {
            pushFollow(FOLLOW_14);
            rule__VPackage__Group_10_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPackage__Group_10_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group_10_6__1"


    // $ANTLR start "rule__VPackage__Group_10_6__1__Impl"
    // InternalVmsc.g:1366:1: rule__VPackage__Group_10_6__1__Impl : ( '{' ) ;
    public final void rule__VPackage__Group_10_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1370:1: ( ( '{' ) )
            // InternalVmsc.g:1371:1: ( '{' )
            {
            // InternalVmsc.g:1371:1: ( '{' )
            // InternalVmsc.g:1372:2: '{'
            {
             before(grammarAccess.getVPackageAccess().getLeftCurlyBracketKeyword_10_6_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getVPackageAccess().getLeftCurlyBracketKeyword_10_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group_10_6__1__Impl"


    // $ANTLR start "rule__VPackage__Group_10_6__2"
    // InternalVmsc.g:1381:1: rule__VPackage__Group_10_6__2 : rule__VPackage__Group_10_6__2__Impl rule__VPackage__Group_10_6__3 ;
    public final void rule__VPackage__Group_10_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1385:1: ( rule__VPackage__Group_10_6__2__Impl rule__VPackage__Group_10_6__3 )
            // InternalVmsc.g:1386:2: rule__VPackage__Group_10_6__2__Impl rule__VPackage__Group_10_6__3
            {
            pushFollow(FOLLOW_15);
            rule__VPackage__Group_10_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPackage__Group_10_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group_10_6__2"


    // $ANTLR start "rule__VPackage__Group_10_6__2__Impl"
    // InternalVmsc.g:1393:1: rule__VPackage__Group_10_6__2__Impl : ( ( rule__VPackage__VComponentsAssignment_10_6_2 ) ) ;
    public final void rule__VPackage__Group_10_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1397:1: ( ( ( rule__VPackage__VComponentsAssignment_10_6_2 ) ) )
            // InternalVmsc.g:1398:1: ( ( rule__VPackage__VComponentsAssignment_10_6_2 ) )
            {
            // InternalVmsc.g:1398:1: ( ( rule__VPackage__VComponentsAssignment_10_6_2 ) )
            // InternalVmsc.g:1399:2: ( rule__VPackage__VComponentsAssignment_10_6_2 )
            {
             before(grammarAccess.getVPackageAccess().getVComponentsAssignment_10_6_2()); 
            // InternalVmsc.g:1400:2: ( rule__VPackage__VComponentsAssignment_10_6_2 )
            // InternalVmsc.g:1400:3: rule__VPackage__VComponentsAssignment_10_6_2
            {
            pushFollow(FOLLOW_2);
            rule__VPackage__VComponentsAssignment_10_6_2();

            state._fsp--;


            }

             after(grammarAccess.getVPackageAccess().getVComponentsAssignment_10_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group_10_6__2__Impl"


    // $ANTLR start "rule__VPackage__Group_10_6__3"
    // InternalVmsc.g:1408:1: rule__VPackage__Group_10_6__3 : rule__VPackage__Group_10_6__3__Impl ;
    public final void rule__VPackage__Group_10_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1412:1: ( rule__VPackage__Group_10_6__3__Impl )
            // InternalVmsc.g:1413:2: rule__VPackage__Group_10_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VPackage__Group_10_6__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group_10_6__3"


    // $ANTLR start "rule__VPackage__Group_10_6__3__Impl"
    // InternalVmsc.g:1419:1: rule__VPackage__Group_10_6__3__Impl : ( '}' ) ;
    public final void rule__VPackage__Group_10_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1423:1: ( ( '}' ) )
            // InternalVmsc.g:1424:1: ( '}' )
            {
            // InternalVmsc.g:1424:1: ( '}' )
            // InternalVmsc.g:1425:2: '}'
            {
             before(grammarAccess.getVPackageAccess().getRightCurlyBracketKeyword_10_6_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getVPackageAccess().getRightCurlyBracketKeyword_10_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__Group_10_6__3__Impl"


    // $ANTLR start "rule__VEnum__Group__0"
    // InternalVmsc.g:1435:1: rule__VEnum__Group__0 : rule__VEnum__Group__0__Impl rule__VEnum__Group__1 ;
    public final void rule__VEnum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1439:1: ( rule__VEnum__Group__0__Impl rule__VEnum__Group__1 )
            // InternalVmsc.g:1440:2: rule__VEnum__Group__0__Impl rule__VEnum__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__VEnum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VEnum__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VEnum__Group__0"


    // $ANTLR start "rule__VEnum__Group__0__Impl"
    // InternalVmsc.g:1447:1: rule__VEnum__Group__0__Impl : ( () ) ;
    public final void rule__VEnum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1451:1: ( ( () ) )
            // InternalVmsc.g:1452:1: ( () )
            {
            // InternalVmsc.g:1452:1: ( () )
            // InternalVmsc.g:1453:2: ()
            {
             before(grammarAccess.getVEnumAccess().getVEnumAction_0()); 
            // InternalVmsc.g:1454:2: ()
            // InternalVmsc.g:1454:3: 
            {
            }

             after(grammarAccess.getVEnumAccess().getVEnumAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VEnum__Group__0__Impl"


    // $ANTLR start "rule__VEnum__Group__1"
    // InternalVmsc.g:1462:1: rule__VEnum__Group__1 : rule__VEnum__Group__1__Impl rule__VEnum__Group__2 ;
    public final void rule__VEnum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1466:1: ( rule__VEnum__Group__1__Impl rule__VEnum__Group__2 )
            // InternalVmsc.g:1467:2: rule__VEnum__Group__1__Impl rule__VEnum__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__VEnum__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VEnum__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VEnum__Group__1"


    // $ANTLR start "rule__VEnum__Group__1__Impl"
    // InternalVmsc.g:1474:1: rule__VEnum__Group__1__Impl : ( 'VEnum' ) ;
    public final void rule__VEnum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1478:1: ( ( 'VEnum' ) )
            // InternalVmsc.g:1479:1: ( 'VEnum' )
            {
            // InternalVmsc.g:1479:1: ( 'VEnum' )
            // InternalVmsc.g:1480:2: 'VEnum'
            {
             before(grammarAccess.getVEnumAccess().getVEnumKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getVEnumAccess().getVEnumKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VEnum__Group__1__Impl"


    // $ANTLR start "rule__VEnum__Group__2"
    // InternalVmsc.g:1489:1: rule__VEnum__Group__2 : rule__VEnum__Group__2__Impl rule__VEnum__Group__3 ;
    public final void rule__VEnum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1493:1: ( rule__VEnum__Group__2__Impl rule__VEnum__Group__3 )
            // InternalVmsc.g:1494:2: rule__VEnum__Group__2__Impl rule__VEnum__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__VEnum__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VEnum__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VEnum__Group__2"


    // $ANTLR start "rule__VEnum__Group__2__Impl"
    // InternalVmsc.g:1501:1: rule__VEnum__Group__2__Impl : ( ':' ) ;
    public final void rule__VEnum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1505:1: ( ( ':' ) )
            // InternalVmsc.g:1506:1: ( ':' )
            {
            // InternalVmsc.g:1506:1: ( ':' )
            // InternalVmsc.g:1507:2: ':'
            {
             before(grammarAccess.getVEnumAccess().getColonKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVEnumAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VEnum__Group__2__Impl"


    // $ANTLR start "rule__VEnum__Group__3"
    // InternalVmsc.g:1516:1: rule__VEnum__Group__3 : rule__VEnum__Group__3__Impl rule__VEnum__Group__4 ;
    public final void rule__VEnum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1520:1: ( rule__VEnum__Group__3__Impl rule__VEnum__Group__4 )
            // InternalVmsc.g:1521:2: rule__VEnum__Group__3__Impl rule__VEnum__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__VEnum__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VEnum__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VEnum__Group__3"


    // $ANTLR start "rule__VEnum__Group__3__Impl"
    // InternalVmsc.g:1528:1: rule__VEnum__Group__3__Impl : ( '{' ) ;
    public final void rule__VEnum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1532:1: ( ( '{' ) )
            // InternalVmsc.g:1533:1: ( '{' )
            {
            // InternalVmsc.g:1533:1: ( '{' )
            // InternalVmsc.g:1534:2: '{'
            {
             before(grammarAccess.getVEnumAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getVEnumAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VEnum__Group__3__Impl"


    // $ANTLR start "rule__VEnum__Group__4"
    // InternalVmsc.g:1543:1: rule__VEnum__Group__4 : rule__VEnum__Group__4__Impl rule__VEnum__Group__5 ;
    public final void rule__VEnum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1547:1: ( rule__VEnum__Group__4__Impl rule__VEnum__Group__5 )
            // InternalVmsc.g:1548:2: rule__VEnum__Group__4__Impl rule__VEnum__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__VEnum__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VEnum__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VEnum__Group__4"


    // $ANTLR start "rule__VEnum__Group__4__Impl"
    // InternalVmsc.g:1555:1: rule__VEnum__Group__4__Impl : ( 'name' ) ;
    public final void rule__VEnum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1559:1: ( ( 'name' ) )
            // InternalVmsc.g:1560:1: ( 'name' )
            {
            // InternalVmsc.g:1560:1: ( 'name' )
            // InternalVmsc.g:1561:2: 'name'
            {
             before(grammarAccess.getVEnumAccess().getNameKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getVEnumAccess().getNameKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VEnum__Group__4__Impl"


    // $ANTLR start "rule__VEnum__Group__5"
    // InternalVmsc.g:1570:1: rule__VEnum__Group__5 : rule__VEnum__Group__5__Impl rule__VEnum__Group__6 ;
    public final void rule__VEnum__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1574:1: ( rule__VEnum__Group__5__Impl rule__VEnum__Group__6 )
            // InternalVmsc.g:1575:2: rule__VEnum__Group__5__Impl rule__VEnum__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__VEnum__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VEnum__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VEnum__Group__5"


    // $ANTLR start "rule__VEnum__Group__5__Impl"
    // InternalVmsc.g:1582:1: rule__VEnum__Group__5__Impl : ( ':' ) ;
    public final void rule__VEnum__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1586:1: ( ( ':' ) )
            // InternalVmsc.g:1587:1: ( ':' )
            {
            // InternalVmsc.g:1587:1: ( ':' )
            // InternalVmsc.g:1588:2: ':'
            {
             before(grammarAccess.getVEnumAccess().getColonKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVEnumAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VEnum__Group__5__Impl"


    // $ANTLR start "rule__VEnum__Group__6"
    // InternalVmsc.g:1597:1: rule__VEnum__Group__6 : rule__VEnum__Group__6__Impl rule__VEnum__Group__7 ;
    public final void rule__VEnum__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1601:1: ( rule__VEnum__Group__6__Impl rule__VEnum__Group__7 )
            // InternalVmsc.g:1602:2: rule__VEnum__Group__6__Impl rule__VEnum__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__VEnum__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VEnum__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VEnum__Group__6"


    // $ANTLR start "rule__VEnum__Group__6__Impl"
    // InternalVmsc.g:1609:1: rule__VEnum__Group__6__Impl : ( ( rule__VEnum__NameAssignment_6 ) ) ;
    public final void rule__VEnum__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1613:1: ( ( ( rule__VEnum__NameAssignment_6 ) ) )
            // InternalVmsc.g:1614:1: ( ( rule__VEnum__NameAssignment_6 ) )
            {
            // InternalVmsc.g:1614:1: ( ( rule__VEnum__NameAssignment_6 ) )
            // InternalVmsc.g:1615:2: ( rule__VEnum__NameAssignment_6 )
            {
             before(grammarAccess.getVEnumAccess().getNameAssignment_6()); 
            // InternalVmsc.g:1616:2: ( rule__VEnum__NameAssignment_6 )
            // InternalVmsc.g:1616:3: rule__VEnum__NameAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__VEnum__NameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getVEnumAccess().getNameAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VEnum__Group__6__Impl"


    // $ANTLR start "rule__VEnum__Group__7"
    // InternalVmsc.g:1624:1: rule__VEnum__Group__7 : rule__VEnum__Group__7__Impl rule__VEnum__Group__8 ;
    public final void rule__VEnum__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1628:1: ( rule__VEnum__Group__7__Impl rule__VEnum__Group__8 )
            // InternalVmsc.g:1629:2: rule__VEnum__Group__7__Impl rule__VEnum__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__VEnum__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VEnum__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VEnum__Group__7"


    // $ANTLR start "rule__VEnum__Group__7__Impl"
    // InternalVmsc.g:1636:1: rule__VEnum__Group__7__Impl : ( ',' ) ;
    public final void rule__VEnum__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1640:1: ( ( ',' ) )
            // InternalVmsc.g:1641:1: ( ',' )
            {
            // InternalVmsc.g:1641:1: ( ',' )
            // InternalVmsc.g:1642:2: ','
            {
             before(grammarAccess.getVEnumAccess().getCommaKeyword_7()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getVEnumAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VEnum__Group__7__Impl"


    // $ANTLR start "rule__VEnum__Group__8"
    // InternalVmsc.g:1651:1: rule__VEnum__Group__8 : rule__VEnum__Group__8__Impl rule__VEnum__Group__9 ;
    public final void rule__VEnum__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1655:1: ( rule__VEnum__Group__8__Impl rule__VEnum__Group__9 )
            // InternalVmsc.g:1656:2: rule__VEnum__Group__8__Impl rule__VEnum__Group__9
            {
            pushFollow(FOLLOW_19);
            rule__VEnum__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VEnum__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VEnum__Group__8"


    // $ANTLR start "rule__VEnum__Group__8__Impl"
    // InternalVmsc.g:1663:1: rule__VEnum__Group__8__Impl : ( ( rule__VEnum__Group_8__0 )? ) ;
    public final void rule__VEnum__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1667:1: ( ( ( rule__VEnum__Group_8__0 )? ) )
            // InternalVmsc.g:1668:1: ( ( rule__VEnum__Group_8__0 )? )
            {
            // InternalVmsc.g:1668:1: ( ( rule__VEnum__Group_8__0 )? )
            // InternalVmsc.g:1669:2: ( rule__VEnum__Group_8__0 )?
            {
             before(grammarAccess.getVEnumAccess().getGroup_8()); 
            // InternalVmsc.g:1670:2: ( rule__VEnum__Group_8__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==41) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalVmsc.g:1670:3: rule__VEnum__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VEnum__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVEnumAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VEnum__Group__8__Impl"


    // $ANTLR start "rule__VEnum__Group__9"
    // InternalVmsc.g:1678:1: rule__VEnum__Group__9 : rule__VEnum__Group__9__Impl ;
    public final void rule__VEnum__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1682:1: ( rule__VEnum__Group__9__Impl )
            // InternalVmsc.g:1683:2: rule__VEnum__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VEnum__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VEnum__Group__9"


    // $ANTLR start "rule__VEnum__Group__9__Impl"
    // InternalVmsc.g:1689:1: rule__VEnum__Group__9__Impl : ( '}' ) ;
    public final void rule__VEnum__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1693:1: ( ( '}' ) )
            // InternalVmsc.g:1694:1: ( '}' )
            {
            // InternalVmsc.g:1694:1: ( '}' )
            // InternalVmsc.g:1695:2: '}'
            {
             before(grammarAccess.getVEnumAccess().getRightCurlyBracketKeyword_9()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getVEnumAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VEnum__Group__9__Impl"


    // $ANTLR start "rule__VEnum__Group_8__0"
    // InternalVmsc.g:1705:1: rule__VEnum__Group_8__0 : rule__VEnum__Group_8__0__Impl rule__VEnum__Group_8__1 ;
    public final void rule__VEnum__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1709:1: ( rule__VEnum__Group_8__0__Impl rule__VEnum__Group_8__1 )
            // InternalVmsc.g:1710:2: rule__VEnum__Group_8__0__Impl rule__VEnum__Group_8__1
            {
            pushFollow(FOLLOW_4);
            rule__VEnum__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VEnum__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VEnum__Group_8__0"


    // $ANTLR start "rule__VEnum__Group_8__0__Impl"
    // InternalVmsc.g:1717:1: rule__VEnum__Group_8__0__Impl : ( ( rule__VEnum__IsSerializableAssignment_8_0 ) ) ;
    public final void rule__VEnum__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1721:1: ( ( ( rule__VEnum__IsSerializableAssignment_8_0 ) ) )
            // InternalVmsc.g:1722:1: ( ( rule__VEnum__IsSerializableAssignment_8_0 ) )
            {
            // InternalVmsc.g:1722:1: ( ( rule__VEnum__IsSerializableAssignment_8_0 ) )
            // InternalVmsc.g:1723:2: ( rule__VEnum__IsSerializableAssignment_8_0 )
            {
             before(grammarAccess.getVEnumAccess().getIsSerializableAssignment_8_0()); 
            // InternalVmsc.g:1724:2: ( rule__VEnum__IsSerializableAssignment_8_0 )
            // InternalVmsc.g:1724:3: rule__VEnum__IsSerializableAssignment_8_0
            {
            pushFollow(FOLLOW_2);
            rule__VEnum__IsSerializableAssignment_8_0();

            state._fsp--;


            }

             after(grammarAccess.getVEnumAccess().getIsSerializableAssignment_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VEnum__Group_8__0__Impl"


    // $ANTLR start "rule__VEnum__Group_8__1"
    // InternalVmsc.g:1732:1: rule__VEnum__Group_8__1 : rule__VEnum__Group_8__1__Impl rule__VEnum__Group_8__2 ;
    public final void rule__VEnum__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1736:1: ( rule__VEnum__Group_8__1__Impl rule__VEnum__Group_8__2 )
            // InternalVmsc.g:1737:2: rule__VEnum__Group_8__1__Impl rule__VEnum__Group_8__2
            {
            pushFollow(FOLLOW_20);
            rule__VEnum__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VEnum__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VEnum__Group_8__1"


    // $ANTLR start "rule__VEnum__Group_8__1__Impl"
    // InternalVmsc.g:1744:1: rule__VEnum__Group_8__1__Impl : ( ':' ) ;
    public final void rule__VEnum__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1748:1: ( ( ':' ) )
            // InternalVmsc.g:1749:1: ( ':' )
            {
            // InternalVmsc.g:1749:1: ( ':' )
            // InternalVmsc.g:1750:2: ':'
            {
             before(grammarAccess.getVEnumAccess().getColonKeyword_8_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVEnumAccess().getColonKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VEnum__Group_8__1__Impl"


    // $ANTLR start "rule__VEnum__Group_8__2"
    // InternalVmsc.g:1759:1: rule__VEnum__Group_8__2 : rule__VEnum__Group_8__2__Impl rule__VEnum__Group_8__3 ;
    public final void rule__VEnum__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1763:1: ( rule__VEnum__Group_8__2__Impl rule__VEnum__Group_8__3 )
            // InternalVmsc.g:1764:2: rule__VEnum__Group_8__2__Impl rule__VEnum__Group_8__3
            {
            pushFollow(FOLLOW_12);
            rule__VEnum__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VEnum__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VEnum__Group_8__2"


    // $ANTLR start "rule__VEnum__Group_8__2__Impl"
    // InternalVmsc.g:1771:1: rule__VEnum__Group_8__2__Impl : ( 'True' ) ;
    public final void rule__VEnum__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1775:1: ( ( 'True' ) )
            // InternalVmsc.g:1776:1: ( 'True' )
            {
            // InternalVmsc.g:1776:1: ( 'True' )
            // InternalVmsc.g:1777:2: 'True'
            {
             before(grammarAccess.getVEnumAccess().getTrueKeyword_8_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getVEnumAccess().getTrueKeyword_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VEnum__Group_8__2__Impl"


    // $ANTLR start "rule__VEnum__Group_8__3"
    // InternalVmsc.g:1786:1: rule__VEnum__Group_8__3 : rule__VEnum__Group_8__3__Impl ;
    public final void rule__VEnum__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1790:1: ( rule__VEnum__Group_8__3__Impl )
            // InternalVmsc.g:1791:2: rule__VEnum__Group_8__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VEnum__Group_8__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VEnum__Group_8__3"


    // $ANTLR start "rule__VEnum__Group_8__3__Impl"
    // InternalVmsc.g:1797:1: rule__VEnum__Group_8__3__Impl : ( ',' ) ;
    public final void rule__VEnum__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1801:1: ( ( ',' ) )
            // InternalVmsc.g:1802:1: ( ',' )
            {
            // InternalVmsc.g:1802:1: ( ',' )
            // InternalVmsc.g:1803:2: ','
            {
             before(grammarAccess.getVEnumAccess().getCommaKeyword_8_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getVEnumAccess().getCommaKeyword_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VEnum__Group_8__3__Impl"


    // $ANTLR start "rule__VDatatype_Impl__Group__0"
    // InternalVmsc.g:1813:1: rule__VDatatype_Impl__Group__0 : rule__VDatatype_Impl__Group__0__Impl rule__VDatatype_Impl__Group__1 ;
    public final void rule__VDatatype_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1817:1: ( rule__VDatatype_Impl__Group__0__Impl rule__VDatatype_Impl__Group__1 )
            // InternalVmsc.g:1818:2: rule__VDatatype_Impl__Group__0__Impl rule__VDatatype_Impl__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__VDatatype_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VDatatype_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VDatatype_Impl__Group__0"


    // $ANTLR start "rule__VDatatype_Impl__Group__0__Impl"
    // InternalVmsc.g:1825:1: rule__VDatatype_Impl__Group__0__Impl : ( () ) ;
    public final void rule__VDatatype_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1829:1: ( ( () ) )
            // InternalVmsc.g:1830:1: ( () )
            {
            // InternalVmsc.g:1830:1: ( () )
            // InternalVmsc.g:1831:2: ()
            {
             before(grammarAccess.getVDatatype_ImplAccess().getVDatatypeAction_0()); 
            // InternalVmsc.g:1832:2: ()
            // InternalVmsc.g:1832:3: 
            {
            }

             after(grammarAccess.getVDatatype_ImplAccess().getVDatatypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VDatatype_Impl__Group__0__Impl"


    // $ANTLR start "rule__VDatatype_Impl__Group__1"
    // InternalVmsc.g:1840:1: rule__VDatatype_Impl__Group__1 : rule__VDatatype_Impl__Group__1__Impl rule__VDatatype_Impl__Group__2 ;
    public final void rule__VDatatype_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1844:1: ( rule__VDatatype_Impl__Group__1__Impl rule__VDatatype_Impl__Group__2 )
            // InternalVmsc.g:1845:2: rule__VDatatype_Impl__Group__1__Impl rule__VDatatype_Impl__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__VDatatype_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VDatatype_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VDatatype_Impl__Group__1"


    // $ANTLR start "rule__VDatatype_Impl__Group__1__Impl"
    // InternalVmsc.g:1852:1: rule__VDatatype_Impl__Group__1__Impl : ( 'VDatatype' ) ;
    public final void rule__VDatatype_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1856:1: ( ( 'VDatatype' ) )
            // InternalVmsc.g:1857:1: ( 'VDatatype' )
            {
            // InternalVmsc.g:1857:1: ( 'VDatatype' )
            // InternalVmsc.g:1858:2: 'VDatatype'
            {
             before(grammarAccess.getVDatatype_ImplAccess().getVDatatypeKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getVDatatype_ImplAccess().getVDatatypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VDatatype_Impl__Group__1__Impl"


    // $ANTLR start "rule__VDatatype_Impl__Group__2"
    // InternalVmsc.g:1867:1: rule__VDatatype_Impl__Group__2 : rule__VDatatype_Impl__Group__2__Impl rule__VDatatype_Impl__Group__3 ;
    public final void rule__VDatatype_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1871:1: ( rule__VDatatype_Impl__Group__2__Impl rule__VDatatype_Impl__Group__3 )
            // InternalVmsc.g:1872:2: rule__VDatatype_Impl__Group__2__Impl rule__VDatatype_Impl__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__VDatatype_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VDatatype_Impl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VDatatype_Impl__Group__2"


    // $ANTLR start "rule__VDatatype_Impl__Group__2__Impl"
    // InternalVmsc.g:1879:1: rule__VDatatype_Impl__Group__2__Impl : ( ':' ) ;
    public final void rule__VDatatype_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1883:1: ( ( ':' ) )
            // InternalVmsc.g:1884:1: ( ':' )
            {
            // InternalVmsc.g:1884:1: ( ':' )
            // InternalVmsc.g:1885:2: ':'
            {
             before(grammarAccess.getVDatatype_ImplAccess().getColonKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVDatatype_ImplAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VDatatype_Impl__Group__2__Impl"


    // $ANTLR start "rule__VDatatype_Impl__Group__3"
    // InternalVmsc.g:1894:1: rule__VDatatype_Impl__Group__3 : rule__VDatatype_Impl__Group__3__Impl rule__VDatatype_Impl__Group__4 ;
    public final void rule__VDatatype_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1898:1: ( rule__VDatatype_Impl__Group__3__Impl rule__VDatatype_Impl__Group__4 )
            // InternalVmsc.g:1899:2: rule__VDatatype_Impl__Group__3__Impl rule__VDatatype_Impl__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__VDatatype_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VDatatype_Impl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VDatatype_Impl__Group__3"


    // $ANTLR start "rule__VDatatype_Impl__Group__3__Impl"
    // InternalVmsc.g:1906:1: rule__VDatatype_Impl__Group__3__Impl : ( '{' ) ;
    public final void rule__VDatatype_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1910:1: ( ( '{' ) )
            // InternalVmsc.g:1911:1: ( '{' )
            {
            // InternalVmsc.g:1911:1: ( '{' )
            // InternalVmsc.g:1912:2: '{'
            {
             before(grammarAccess.getVDatatype_ImplAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getVDatatype_ImplAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VDatatype_Impl__Group__3__Impl"


    // $ANTLR start "rule__VDatatype_Impl__Group__4"
    // InternalVmsc.g:1921:1: rule__VDatatype_Impl__Group__4 : rule__VDatatype_Impl__Group__4__Impl rule__VDatatype_Impl__Group__5 ;
    public final void rule__VDatatype_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1925:1: ( rule__VDatatype_Impl__Group__4__Impl rule__VDatatype_Impl__Group__5 )
            // InternalVmsc.g:1926:2: rule__VDatatype_Impl__Group__4__Impl rule__VDatatype_Impl__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__VDatatype_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VDatatype_Impl__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VDatatype_Impl__Group__4"


    // $ANTLR start "rule__VDatatype_Impl__Group__4__Impl"
    // InternalVmsc.g:1933:1: rule__VDatatype_Impl__Group__4__Impl : ( 'name' ) ;
    public final void rule__VDatatype_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1937:1: ( ( 'name' ) )
            // InternalVmsc.g:1938:1: ( 'name' )
            {
            // InternalVmsc.g:1938:1: ( 'name' )
            // InternalVmsc.g:1939:2: 'name'
            {
             before(grammarAccess.getVDatatype_ImplAccess().getNameKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getVDatatype_ImplAccess().getNameKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VDatatype_Impl__Group__4__Impl"


    // $ANTLR start "rule__VDatatype_Impl__Group__5"
    // InternalVmsc.g:1948:1: rule__VDatatype_Impl__Group__5 : rule__VDatatype_Impl__Group__5__Impl rule__VDatatype_Impl__Group__6 ;
    public final void rule__VDatatype_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1952:1: ( rule__VDatatype_Impl__Group__5__Impl rule__VDatatype_Impl__Group__6 )
            // InternalVmsc.g:1953:2: rule__VDatatype_Impl__Group__5__Impl rule__VDatatype_Impl__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__VDatatype_Impl__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VDatatype_Impl__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VDatatype_Impl__Group__5"


    // $ANTLR start "rule__VDatatype_Impl__Group__5__Impl"
    // InternalVmsc.g:1960:1: rule__VDatatype_Impl__Group__5__Impl : ( ':' ) ;
    public final void rule__VDatatype_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1964:1: ( ( ':' ) )
            // InternalVmsc.g:1965:1: ( ':' )
            {
            // InternalVmsc.g:1965:1: ( ':' )
            // InternalVmsc.g:1966:2: ':'
            {
             before(grammarAccess.getVDatatype_ImplAccess().getColonKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVDatatype_ImplAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VDatatype_Impl__Group__5__Impl"


    // $ANTLR start "rule__VDatatype_Impl__Group__6"
    // InternalVmsc.g:1975:1: rule__VDatatype_Impl__Group__6 : rule__VDatatype_Impl__Group__6__Impl rule__VDatatype_Impl__Group__7 ;
    public final void rule__VDatatype_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1979:1: ( rule__VDatatype_Impl__Group__6__Impl rule__VDatatype_Impl__Group__7 )
            // InternalVmsc.g:1980:2: rule__VDatatype_Impl__Group__6__Impl rule__VDatatype_Impl__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__VDatatype_Impl__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VDatatype_Impl__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VDatatype_Impl__Group__6"


    // $ANTLR start "rule__VDatatype_Impl__Group__6__Impl"
    // InternalVmsc.g:1987:1: rule__VDatatype_Impl__Group__6__Impl : ( ( rule__VDatatype_Impl__NameAssignment_6 ) ) ;
    public final void rule__VDatatype_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:1991:1: ( ( ( rule__VDatatype_Impl__NameAssignment_6 ) ) )
            // InternalVmsc.g:1992:1: ( ( rule__VDatatype_Impl__NameAssignment_6 ) )
            {
            // InternalVmsc.g:1992:1: ( ( rule__VDatatype_Impl__NameAssignment_6 ) )
            // InternalVmsc.g:1993:2: ( rule__VDatatype_Impl__NameAssignment_6 )
            {
             before(grammarAccess.getVDatatype_ImplAccess().getNameAssignment_6()); 
            // InternalVmsc.g:1994:2: ( rule__VDatatype_Impl__NameAssignment_6 )
            // InternalVmsc.g:1994:3: rule__VDatatype_Impl__NameAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__VDatatype_Impl__NameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getVDatatype_ImplAccess().getNameAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VDatatype_Impl__Group__6__Impl"


    // $ANTLR start "rule__VDatatype_Impl__Group__7"
    // InternalVmsc.g:2002:1: rule__VDatatype_Impl__Group__7 : rule__VDatatype_Impl__Group__7__Impl rule__VDatatype_Impl__Group__8 ;
    public final void rule__VDatatype_Impl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2006:1: ( rule__VDatatype_Impl__Group__7__Impl rule__VDatatype_Impl__Group__8 )
            // InternalVmsc.g:2007:2: rule__VDatatype_Impl__Group__7__Impl rule__VDatatype_Impl__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__VDatatype_Impl__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VDatatype_Impl__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VDatatype_Impl__Group__7"


    // $ANTLR start "rule__VDatatype_Impl__Group__7__Impl"
    // InternalVmsc.g:2014:1: rule__VDatatype_Impl__Group__7__Impl : ( ',' ) ;
    public final void rule__VDatatype_Impl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2018:1: ( ( ',' ) )
            // InternalVmsc.g:2019:1: ( ',' )
            {
            // InternalVmsc.g:2019:1: ( ',' )
            // InternalVmsc.g:2020:2: ','
            {
             before(grammarAccess.getVDatatype_ImplAccess().getCommaKeyword_7()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getVDatatype_ImplAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VDatatype_Impl__Group__7__Impl"


    // $ANTLR start "rule__VDatatype_Impl__Group__8"
    // InternalVmsc.g:2029:1: rule__VDatatype_Impl__Group__8 : rule__VDatatype_Impl__Group__8__Impl rule__VDatatype_Impl__Group__9 ;
    public final void rule__VDatatype_Impl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2033:1: ( rule__VDatatype_Impl__Group__8__Impl rule__VDatatype_Impl__Group__9 )
            // InternalVmsc.g:2034:2: rule__VDatatype_Impl__Group__8__Impl rule__VDatatype_Impl__Group__9
            {
            pushFollow(FOLLOW_19);
            rule__VDatatype_Impl__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VDatatype_Impl__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VDatatype_Impl__Group__8"


    // $ANTLR start "rule__VDatatype_Impl__Group__8__Impl"
    // InternalVmsc.g:2041:1: rule__VDatatype_Impl__Group__8__Impl : ( ( rule__VDatatype_Impl__Group_8__0 )? ) ;
    public final void rule__VDatatype_Impl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2045:1: ( ( ( rule__VDatatype_Impl__Group_8__0 )? ) )
            // InternalVmsc.g:2046:1: ( ( rule__VDatatype_Impl__Group_8__0 )? )
            {
            // InternalVmsc.g:2046:1: ( ( rule__VDatatype_Impl__Group_8__0 )? )
            // InternalVmsc.g:2047:2: ( rule__VDatatype_Impl__Group_8__0 )?
            {
             before(grammarAccess.getVDatatype_ImplAccess().getGroup_8()); 
            // InternalVmsc.g:2048:2: ( rule__VDatatype_Impl__Group_8__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==41) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalVmsc.g:2048:3: rule__VDatatype_Impl__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VDatatype_Impl__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVDatatype_ImplAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VDatatype_Impl__Group__8__Impl"


    // $ANTLR start "rule__VDatatype_Impl__Group__9"
    // InternalVmsc.g:2056:1: rule__VDatatype_Impl__Group__9 : rule__VDatatype_Impl__Group__9__Impl ;
    public final void rule__VDatatype_Impl__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2060:1: ( rule__VDatatype_Impl__Group__9__Impl )
            // InternalVmsc.g:2061:2: rule__VDatatype_Impl__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VDatatype_Impl__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VDatatype_Impl__Group__9"


    // $ANTLR start "rule__VDatatype_Impl__Group__9__Impl"
    // InternalVmsc.g:2067:1: rule__VDatatype_Impl__Group__9__Impl : ( '}' ) ;
    public final void rule__VDatatype_Impl__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2071:1: ( ( '}' ) )
            // InternalVmsc.g:2072:1: ( '}' )
            {
            // InternalVmsc.g:2072:1: ( '}' )
            // InternalVmsc.g:2073:2: '}'
            {
             before(grammarAccess.getVDatatype_ImplAccess().getRightCurlyBracketKeyword_9()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getVDatatype_ImplAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VDatatype_Impl__Group__9__Impl"


    // $ANTLR start "rule__VDatatype_Impl__Group_8__0"
    // InternalVmsc.g:2083:1: rule__VDatatype_Impl__Group_8__0 : rule__VDatatype_Impl__Group_8__0__Impl rule__VDatatype_Impl__Group_8__1 ;
    public final void rule__VDatatype_Impl__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2087:1: ( rule__VDatatype_Impl__Group_8__0__Impl rule__VDatatype_Impl__Group_8__1 )
            // InternalVmsc.g:2088:2: rule__VDatatype_Impl__Group_8__0__Impl rule__VDatatype_Impl__Group_8__1
            {
            pushFollow(FOLLOW_4);
            rule__VDatatype_Impl__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VDatatype_Impl__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VDatatype_Impl__Group_8__0"


    // $ANTLR start "rule__VDatatype_Impl__Group_8__0__Impl"
    // InternalVmsc.g:2095:1: rule__VDatatype_Impl__Group_8__0__Impl : ( ( rule__VDatatype_Impl__IsSerializableAssignment_8_0 ) ) ;
    public final void rule__VDatatype_Impl__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2099:1: ( ( ( rule__VDatatype_Impl__IsSerializableAssignment_8_0 ) ) )
            // InternalVmsc.g:2100:1: ( ( rule__VDatatype_Impl__IsSerializableAssignment_8_0 ) )
            {
            // InternalVmsc.g:2100:1: ( ( rule__VDatatype_Impl__IsSerializableAssignment_8_0 ) )
            // InternalVmsc.g:2101:2: ( rule__VDatatype_Impl__IsSerializableAssignment_8_0 )
            {
             before(grammarAccess.getVDatatype_ImplAccess().getIsSerializableAssignment_8_0()); 
            // InternalVmsc.g:2102:2: ( rule__VDatatype_Impl__IsSerializableAssignment_8_0 )
            // InternalVmsc.g:2102:3: rule__VDatatype_Impl__IsSerializableAssignment_8_0
            {
            pushFollow(FOLLOW_2);
            rule__VDatatype_Impl__IsSerializableAssignment_8_0();

            state._fsp--;


            }

             after(grammarAccess.getVDatatype_ImplAccess().getIsSerializableAssignment_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VDatatype_Impl__Group_8__0__Impl"


    // $ANTLR start "rule__VDatatype_Impl__Group_8__1"
    // InternalVmsc.g:2110:1: rule__VDatatype_Impl__Group_8__1 : rule__VDatatype_Impl__Group_8__1__Impl rule__VDatatype_Impl__Group_8__2 ;
    public final void rule__VDatatype_Impl__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2114:1: ( rule__VDatatype_Impl__Group_8__1__Impl rule__VDatatype_Impl__Group_8__2 )
            // InternalVmsc.g:2115:2: rule__VDatatype_Impl__Group_8__1__Impl rule__VDatatype_Impl__Group_8__2
            {
            pushFollow(FOLLOW_20);
            rule__VDatatype_Impl__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VDatatype_Impl__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VDatatype_Impl__Group_8__1"


    // $ANTLR start "rule__VDatatype_Impl__Group_8__1__Impl"
    // InternalVmsc.g:2122:1: rule__VDatatype_Impl__Group_8__1__Impl : ( ':' ) ;
    public final void rule__VDatatype_Impl__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2126:1: ( ( ':' ) )
            // InternalVmsc.g:2127:1: ( ':' )
            {
            // InternalVmsc.g:2127:1: ( ':' )
            // InternalVmsc.g:2128:2: ':'
            {
             before(grammarAccess.getVDatatype_ImplAccess().getColonKeyword_8_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVDatatype_ImplAccess().getColonKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VDatatype_Impl__Group_8__1__Impl"


    // $ANTLR start "rule__VDatatype_Impl__Group_8__2"
    // InternalVmsc.g:2137:1: rule__VDatatype_Impl__Group_8__2 : rule__VDatatype_Impl__Group_8__2__Impl rule__VDatatype_Impl__Group_8__3 ;
    public final void rule__VDatatype_Impl__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2141:1: ( rule__VDatatype_Impl__Group_8__2__Impl rule__VDatatype_Impl__Group_8__3 )
            // InternalVmsc.g:2142:2: rule__VDatatype_Impl__Group_8__2__Impl rule__VDatatype_Impl__Group_8__3
            {
            pushFollow(FOLLOW_12);
            rule__VDatatype_Impl__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VDatatype_Impl__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VDatatype_Impl__Group_8__2"


    // $ANTLR start "rule__VDatatype_Impl__Group_8__2__Impl"
    // InternalVmsc.g:2149:1: rule__VDatatype_Impl__Group_8__2__Impl : ( 'True' ) ;
    public final void rule__VDatatype_Impl__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2153:1: ( ( 'True' ) )
            // InternalVmsc.g:2154:1: ( 'True' )
            {
            // InternalVmsc.g:2154:1: ( 'True' )
            // InternalVmsc.g:2155:2: 'True'
            {
             before(grammarAccess.getVDatatype_ImplAccess().getTrueKeyword_8_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getVDatatype_ImplAccess().getTrueKeyword_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VDatatype_Impl__Group_8__2__Impl"


    // $ANTLR start "rule__VDatatype_Impl__Group_8__3"
    // InternalVmsc.g:2164:1: rule__VDatatype_Impl__Group_8__3 : rule__VDatatype_Impl__Group_8__3__Impl ;
    public final void rule__VDatatype_Impl__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2168:1: ( rule__VDatatype_Impl__Group_8__3__Impl )
            // InternalVmsc.g:2169:2: rule__VDatatype_Impl__Group_8__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VDatatype_Impl__Group_8__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VDatatype_Impl__Group_8__3"


    // $ANTLR start "rule__VDatatype_Impl__Group_8__3__Impl"
    // InternalVmsc.g:2175:1: rule__VDatatype_Impl__Group_8__3__Impl : ( ',' ) ;
    public final void rule__VDatatype_Impl__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2179:1: ( ( ',' ) )
            // InternalVmsc.g:2180:1: ( ',' )
            {
            // InternalVmsc.g:2180:1: ( ',' )
            // InternalVmsc.g:2181:2: ','
            {
             before(grammarAccess.getVDatatype_ImplAccess().getCommaKeyword_8_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getVDatatype_ImplAccess().getCommaKeyword_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VDatatype_Impl__Group_8__3__Impl"


    // $ANTLR start "rule__VClass__Group__0"
    // InternalVmsc.g:2191:1: rule__VClass__Group__0 : rule__VClass__Group__0__Impl rule__VClass__Group__1 ;
    public final void rule__VClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2195:1: ( rule__VClass__Group__0__Impl rule__VClass__Group__1 )
            // InternalVmsc.g:2196:2: rule__VClass__Group__0__Impl rule__VClass__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__VClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VClass__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group__0"


    // $ANTLR start "rule__VClass__Group__0__Impl"
    // InternalVmsc.g:2203:1: rule__VClass__Group__0__Impl : ( () ) ;
    public final void rule__VClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2207:1: ( ( () ) )
            // InternalVmsc.g:2208:1: ( () )
            {
            // InternalVmsc.g:2208:1: ( () )
            // InternalVmsc.g:2209:2: ()
            {
             before(grammarAccess.getVClassAccess().getVClassAction_0()); 
            // InternalVmsc.g:2210:2: ()
            // InternalVmsc.g:2210:3: 
            {
            }

             after(grammarAccess.getVClassAccess().getVClassAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group__0__Impl"


    // $ANTLR start "rule__VClass__Group__1"
    // InternalVmsc.g:2218:1: rule__VClass__Group__1 : rule__VClass__Group__1__Impl rule__VClass__Group__2 ;
    public final void rule__VClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2222:1: ( rule__VClass__Group__1__Impl rule__VClass__Group__2 )
            // InternalVmsc.g:2223:2: rule__VClass__Group__1__Impl rule__VClass__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__VClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VClass__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group__1"


    // $ANTLR start "rule__VClass__Group__1__Impl"
    // InternalVmsc.g:2230:1: rule__VClass__Group__1__Impl : ( 'VClass' ) ;
    public final void rule__VClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2234:1: ( ( 'VClass' ) )
            // InternalVmsc.g:2235:1: ( 'VClass' )
            {
            // InternalVmsc.g:2235:1: ( 'VClass' )
            // InternalVmsc.g:2236:2: 'VClass'
            {
             before(grammarAccess.getVClassAccess().getVClassKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getVClassAccess().getVClassKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group__1__Impl"


    // $ANTLR start "rule__VClass__Group__2"
    // InternalVmsc.g:2245:1: rule__VClass__Group__2 : rule__VClass__Group__2__Impl rule__VClass__Group__3 ;
    public final void rule__VClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2249:1: ( rule__VClass__Group__2__Impl rule__VClass__Group__3 )
            // InternalVmsc.g:2250:2: rule__VClass__Group__2__Impl rule__VClass__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__VClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VClass__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group__2"


    // $ANTLR start "rule__VClass__Group__2__Impl"
    // InternalVmsc.g:2257:1: rule__VClass__Group__2__Impl : ( ':' ) ;
    public final void rule__VClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2261:1: ( ( ':' ) )
            // InternalVmsc.g:2262:1: ( ':' )
            {
            // InternalVmsc.g:2262:1: ( ':' )
            // InternalVmsc.g:2263:2: ':'
            {
             before(grammarAccess.getVClassAccess().getColonKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVClassAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group__2__Impl"


    // $ANTLR start "rule__VClass__Group__3"
    // InternalVmsc.g:2272:1: rule__VClass__Group__3 : rule__VClass__Group__3__Impl rule__VClass__Group__4 ;
    public final void rule__VClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2276:1: ( rule__VClass__Group__3__Impl rule__VClass__Group__4 )
            // InternalVmsc.g:2277:2: rule__VClass__Group__3__Impl rule__VClass__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__VClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VClass__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group__3"


    // $ANTLR start "rule__VClass__Group__3__Impl"
    // InternalVmsc.g:2284:1: rule__VClass__Group__3__Impl : ( '{' ) ;
    public final void rule__VClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2288:1: ( ( '{' ) )
            // InternalVmsc.g:2289:1: ( '{' )
            {
            // InternalVmsc.g:2289:1: ( '{' )
            // InternalVmsc.g:2290:2: '{'
            {
             before(grammarAccess.getVClassAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getVClassAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group__3__Impl"


    // $ANTLR start "rule__VClass__Group__4"
    // InternalVmsc.g:2299:1: rule__VClass__Group__4 : rule__VClass__Group__4__Impl rule__VClass__Group__5 ;
    public final void rule__VClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2303:1: ( rule__VClass__Group__4__Impl rule__VClass__Group__5 )
            // InternalVmsc.g:2304:2: rule__VClass__Group__4__Impl rule__VClass__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__VClass__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VClass__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group__4"


    // $ANTLR start "rule__VClass__Group__4__Impl"
    // InternalVmsc.g:2311:1: rule__VClass__Group__4__Impl : ( 'name' ) ;
    public final void rule__VClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2315:1: ( ( 'name' ) )
            // InternalVmsc.g:2316:1: ( 'name' )
            {
            // InternalVmsc.g:2316:1: ( 'name' )
            // InternalVmsc.g:2317:2: 'name'
            {
             before(grammarAccess.getVClassAccess().getNameKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getVClassAccess().getNameKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group__4__Impl"


    // $ANTLR start "rule__VClass__Group__5"
    // InternalVmsc.g:2326:1: rule__VClass__Group__5 : rule__VClass__Group__5__Impl rule__VClass__Group__6 ;
    public final void rule__VClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2330:1: ( rule__VClass__Group__5__Impl rule__VClass__Group__6 )
            // InternalVmsc.g:2331:2: rule__VClass__Group__5__Impl rule__VClass__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__VClass__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VClass__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group__5"


    // $ANTLR start "rule__VClass__Group__5__Impl"
    // InternalVmsc.g:2338:1: rule__VClass__Group__5__Impl : ( ':' ) ;
    public final void rule__VClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2342:1: ( ( ':' ) )
            // InternalVmsc.g:2343:1: ( ':' )
            {
            // InternalVmsc.g:2343:1: ( ':' )
            // InternalVmsc.g:2344:2: ':'
            {
             before(grammarAccess.getVClassAccess().getColonKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVClassAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group__5__Impl"


    // $ANTLR start "rule__VClass__Group__6"
    // InternalVmsc.g:2353:1: rule__VClass__Group__6 : rule__VClass__Group__6__Impl rule__VClass__Group__7 ;
    public final void rule__VClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2357:1: ( rule__VClass__Group__6__Impl rule__VClass__Group__7 )
            // InternalVmsc.g:2358:2: rule__VClass__Group__6__Impl rule__VClass__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__VClass__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VClass__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group__6"


    // $ANTLR start "rule__VClass__Group__6__Impl"
    // InternalVmsc.g:2365:1: rule__VClass__Group__6__Impl : ( ( rule__VClass__NameAssignment_6 ) ) ;
    public final void rule__VClass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2369:1: ( ( ( rule__VClass__NameAssignment_6 ) ) )
            // InternalVmsc.g:2370:1: ( ( rule__VClass__NameAssignment_6 ) )
            {
            // InternalVmsc.g:2370:1: ( ( rule__VClass__NameAssignment_6 ) )
            // InternalVmsc.g:2371:2: ( rule__VClass__NameAssignment_6 )
            {
             before(grammarAccess.getVClassAccess().getNameAssignment_6()); 
            // InternalVmsc.g:2372:2: ( rule__VClass__NameAssignment_6 )
            // InternalVmsc.g:2372:3: rule__VClass__NameAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__VClass__NameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getVClassAccess().getNameAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group__6__Impl"


    // $ANTLR start "rule__VClass__Group__7"
    // InternalVmsc.g:2380:1: rule__VClass__Group__7 : rule__VClass__Group__7__Impl rule__VClass__Group__8 ;
    public final void rule__VClass__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2384:1: ( rule__VClass__Group__7__Impl rule__VClass__Group__8 )
            // InternalVmsc.g:2385:2: rule__VClass__Group__7__Impl rule__VClass__Group__8
            {
            pushFollow(FOLLOW_22);
            rule__VClass__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VClass__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group__7"


    // $ANTLR start "rule__VClass__Group__7__Impl"
    // InternalVmsc.g:2392:1: rule__VClass__Group__7__Impl : ( ',' ) ;
    public final void rule__VClass__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2396:1: ( ( ',' ) )
            // InternalVmsc.g:2397:1: ( ',' )
            {
            // InternalVmsc.g:2397:1: ( ',' )
            // InternalVmsc.g:2398:2: ','
            {
             before(grammarAccess.getVClassAccess().getCommaKeyword_7()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getVClassAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group__7__Impl"


    // $ANTLR start "rule__VClass__Group__8"
    // InternalVmsc.g:2407:1: rule__VClass__Group__8 : rule__VClass__Group__8__Impl rule__VClass__Group__9 ;
    public final void rule__VClass__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2411:1: ( rule__VClass__Group__8__Impl rule__VClass__Group__9 )
            // InternalVmsc.g:2412:2: rule__VClass__Group__8__Impl rule__VClass__Group__9
            {
            pushFollow(FOLLOW_22);
            rule__VClass__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VClass__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group__8"


    // $ANTLR start "rule__VClass__Group__8__Impl"
    // InternalVmsc.g:2419:1: rule__VClass__Group__8__Impl : ( ( rule__VClass__Group_8__0 )? ) ;
    public final void rule__VClass__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2423:1: ( ( ( rule__VClass__Group_8__0 )? ) )
            // InternalVmsc.g:2424:1: ( ( rule__VClass__Group_8__0 )? )
            {
            // InternalVmsc.g:2424:1: ( ( rule__VClass__Group_8__0 )? )
            // InternalVmsc.g:2425:2: ( rule__VClass__Group_8__0 )?
            {
             before(grammarAccess.getVClassAccess().getGroup_8()); 
            // InternalVmsc.g:2426:2: ( rule__VClass__Group_8__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalVmsc.g:2426:3: rule__VClass__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VClass__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVClassAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group__8__Impl"


    // $ANTLR start "rule__VClass__Group__9"
    // InternalVmsc.g:2434:1: rule__VClass__Group__9 : rule__VClass__Group__9__Impl rule__VClass__Group__10 ;
    public final void rule__VClass__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2438:1: ( rule__VClass__Group__9__Impl rule__VClass__Group__10 )
            // InternalVmsc.g:2439:2: rule__VClass__Group__9__Impl rule__VClass__Group__10
            {
            pushFollow(FOLLOW_22);
            rule__VClass__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VClass__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group__9"


    // $ANTLR start "rule__VClass__Group__9__Impl"
    // InternalVmsc.g:2446:1: rule__VClass__Group__9__Impl : ( ( rule__VClass__Group_9__0 )? ) ;
    public final void rule__VClass__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2450:1: ( ( ( rule__VClass__Group_9__0 )? ) )
            // InternalVmsc.g:2451:1: ( ( rule__VClass__Group_9__0 )? )
            {
            // InternalVmsc.g:2451:1: ( ( rule__VClass__Group_9__0 )? )
            // InternalVmsc.g:2452:2: ( rule__VClass__Group_9__0 )?
            {
             before(grammarAccess.getVClassAccess().getGroup_9()); 
            // InternalVmsc.g:2453:2: ( rule__VClass__Group_9__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalVmsc.g:2453:3: rule__VClass__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VClass__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVClassAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group__9__Impl"


    // $ANTLR start "rule__VClass__Group__10"
    // InternalVmsc.g:2461:1: rule__VClass__Group__10 : rule__VClass__Group__10__Impl rule__VClass__Group__11 ;
    public final void rule__VClass__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2465:1: ( rule__VClass__Group__10__Impl rule__VClass__Group__11 )
            // InternalVmsc.g:2466:2: rule__VClass__Group__10__Impl rule__VClass__Group__11
            {
            pushFollow(FOLLOW_22);
            rule__VClass__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VClass__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group__10"


    // $ANTLR start "rule__VClass__Group__10__Impl"
    // InternalVmsc.g:2473:1: rule__VClass__Group__10__Impl : ( ( rule__VClass__Group_10__0 )? ) ;
    public final void rule__VClass__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2477:1: ( ( ( rule__VClass__Group_10__0 )? ) )
            // InternalVmsc.g:2478:1: ( ( rule__VClass__Group_10__0 )? )
            {
            // InternalVmsc.g:2478:1: ( ( rule__VClass__Group_10__0 )? )
            // InternalVmsc.g:2479:2: ( rule__VClass__Group_10__0 )?
            {
             before(grammarAccess.getVClassAccess().getGroup_10()); 
            // InternalVmsc.g:2480:2: ( rule__VClass__Group_10__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==42) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalVmsc.g:2480:3: rule__VClass__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VClass__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVClassAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group__10__Impl"


    // $ANTLR start "rule__VClass__Group__11"
    // InternalVmsc.g:2488:1: rule__VClass__Group__11 : rule__VClass__Group__11__Impl rule__VClass__Group__12 ;
    public final void rule__VClass__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2492:1: ( rule__VClass__Group__11__Impl rule__VClass__Group__12 )
            // InternalVmsc.g:2493:2: rule__VClass__Group__11__Impl rule__VClass__Group__12
            {
            pushFollow(FOLLOW_22);
            rule__VClass__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VClass__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group__11"


    // $ANTLR start "rule__VClass__Group__11__Impl"
    // InternalVmsc.g:2500:1: rule__VClass__Group__11__Impl : ( ( rule__VClass__Group_11__0 )? ) ;
    public final void rule__VClass__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2504:1: ( ( ( rule__VClass__Group_11__0 )? ) )
            // InternalVmsc.g:2505:1: ( ( rule__VClass__Group_11__0 )? )
            {
            // InternalVmsc.g:2505:1: ( ( rule__VClass__Group_11__0 )? )
            // InternalVmsc.g:2506:2: ( rule__VClass__Group_11__0 )?
            {
             before(grammarAccess.getVClassAccess().getGroup_11()); 
            // InternalVmsc.g:2507:2: ( rule__VClass__Group_11__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==43) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalVmsc.g:2507:3: rule__VClass__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VClass__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVClassAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group__11__Impl"


    // $ANTLR start "rule__VClass__Group__12"
    // InternalVmsc.g:2515:1: rule__VClass__Group__12 : rule__VClass__Group__12__Impl ;
    public final void rule__VClass__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2519:1: ( rule__VClass__Group__12__Impl )
            // InternalVmsc.g:2520:2: rule__VClass__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VClass__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group__12"


    // $ANTLR start "rule__VClass__Group__12__Impl"
    // InternalVmsc.g:2526:1: rule__VClass__Group__12__Impl : ( '}' ) ;
    public final void rule__VClass__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2530:1: ( ( '}' ) )
            // InternalVmsc.g:2531:1: ( '}' )
            {
            // InternalVmsc.g:2531:1: ( '}' )
            // InternalVmsc.g:2532:2: '}'
            {
             before(grammarAccess.getVClassAccess().getRightCurlyBracketKeyword_12()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getVClassAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group__12__Impl"


    // $ANTLR start "rule__VClass__Group_8__0"
    // InternalVmsc.g:2542:1: rule__VClass__Group_8__0 : rule__VClass__Group_8__0__Impl rule__VClass__Group_8__1 ;
    public final void rule__VClass__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2546:1: ( rule__VClass__Group_8__0__Impl rule__VClass__Group_8__1 )
            // InternalVmsc.g:2547:2: rule__VClass__Group_8__0__Impl rule__VClass__Group_8__1
            {
            pushFollow(FOLLOW_4);
            rule__VClass__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VClass__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_8__0"


    // $ANTLR start "rule__VClass__Group_8__0__Impl"
    // InternalVmsc.g:2554:1: rule__VClass__Group_8__0__Impl : ( 'VStructuralFeatures' ) ;
    public final void rule__VClass__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2558:1: ( ( 'VStructuralFeatures' ) )
            // InternalVmsc.g:2559:1: ( 'VStructuralFeatures' )
            {
            // InternalVmsc.g:2559:1: ( 'VStructuralFeatures' )
            // InternalVmsc.g:2560:2: 'VStructuralFeatures'
            {
             before(grammarAccess.getVClassAccess().getVStructuralFeaturesKeyword_8_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getVClassAccess().getVStructuralFeaturesKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_8__0__Impl"


    // $ANTLR start "rule__VClass__Group_8__1"
    // InternalVmsc.g:2569:1: rule__VClass__Group_8__1 : rule__VClass__Group_8__1__Impl rule__VClass__Group_8__2 ;
    public final void rule__VClass__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2573:1: ( rule__VClass__Group_8__1__Impl rule__VClass__Group_8__2 )
            // InternalVmsc.g:2574:2: rule__VClass__Group_8__1__Impl rule__VClass__Group_8__2
            {
            pushFollow(FOLLOW_13);
            rule__VClass__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VClass__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_8__1"


    // $ANTLR start "rule__VClass__Group_8__1__Impl"
    // InternalVmsc.g:2581:1: rule__VClass__Group_8__1__Impl : ( ':' ) ;
    public final void rule__VClass__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2585:1: ( ( ':' ) )
            // InternalVmsc.g:2586:1: ( ':' )
            {
            // InternalVmsc.g:2586:1: ( ':' )
            // InternalVmsc.g:2587:2: ':'
            {
             before(grammarAccess.getVClassAccess().getColonKeyword_8_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVClassAccess().getColonKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_8__1__Impl"


    // $ANTLR start "rule__VClass__Group_8__2"
    // InternalVmsc.g:2596:1: rule__VClass__Group_8__2 : rule__VClass__Group_8__2__Impl rule__VClass__Group_8__3 ;
    public final void rule__VClass__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2600:1: ( rule__VClass__Group_8__2__Impl rule__VClass__Group_8__3 )
            // InternalVmsc.g:2601:2: rule__VClass__Group_8__2__Impl rule__VClass__Group_8__3
            {
            pushFollow(FOLLOW_5);
            rule__VClass__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VClass__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_8__2"


    // $ANTLR start "rule__VClass__Group_8__2__Impl"
    // InternalVmsc.g:2608:1: rule__VClass__Group_8__2__Impl : ( '[' ) ;
    public final void rule__VClass__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2612:1: ( ( '[' ) )
            // InternalVmsc.g:2613:1: ( '[' )
            {
            // InternalVmsc.g:2613:1: ( '[' )
            // InternalVmsc.g:2614:2: '['
            {
             before(grammarAccess.getVClassAccess().getLeftSquareBracketKeyword_8_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getVClassAccess().getLeftSquareBracketKeyword_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_8__2__Impl"


    // $ANTLR start "rule__VClass__Group_8__3"
    // InternalVmsc.g:2623:1: rule__VClass__Group_8__3 : rule__VClass__Group_8__3__Impl rule__VClass__Group_8__4 ;
    public final void rule__VClass__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2627:1: ( rule__VClass__Group_8__3__Impl rule__VClass__Group_8__4 )
            // InternalVmsc.g:2628:2: rule__VClass__Group_8__3__Impl rule__VClass__Group_8__4
            {
            pushFollow(FOLLOW_23);
            rule__VClass__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VClass__Group_8__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_8__3"


    // $ANTLR start "rule__VClass__Group_8__3__Impl"
    // InternalVmsc.g:2635:1: rule__VClass__Group_8__3__Impl : ( '{' ) ;
    public final void rule__VClass__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2639:1: ( ( '{' ) )
            // InternalVmsc.g:2640:1: ( '{' )
            {
            // InternalVmsc.g:2640:1: ( '{' )
            // InternalVmsc.g:2641:2: '{'
            {
             before(grammarAccess.getVClassAccess().getLeftCurlyBracketKeyword_8_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getVClassAccess().getLeftCurlyBracketKeyword_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_8__3__Impl"


    // $ANTLR start "rule__VClass__Group_8__4"
    // InternalVmsc.g:2650:1: rule__VClass__Group_8__4 : rule__VClass__Group_8__4__Impl rule__VClass__Group_8__5 ;
    public final void rule__VClass__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2654:1: ( rule__VClass__Group_8__4__Impl rule__VClass__Group_8__5 )
            // InternalVmsc.g:2655:2: rule__VClass__Group_8__4__Impl rule__VClass__Group_8__5
            {
            pushFollow(FOLLOW_15);
            rule__VClass__Group_8__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VClass__Group_8__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_8__4"


    // $ANTLR start "rule__VClass__Group_8__4__Impl"
    // InternalVmsc.g:2662:1: rule__VClass__Group_8__4__Impl : ( ( rule__VClass__VStructural_featuresAssignment_8_4 ) ) ;
    public final void rule__VClass__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2666:1: ( ( ( rule__VClass__VStructural_featuresAssignment_8_4 ) ) )
            // InternalVmsc.g:2667:1: ( ( rule__VClass__VStructural_featuresAssignment_8_4 ) )
            {
            // InternalVmsc.g:2667:1: ( ( rule__VClass__VStructural_featuresAssignment_8_4 ) )
            // InternalVmsc.g:2668:2: ( rule__VClass__VStructural_featuresAssignment_8_4 )
            {
             before(grammarAccess.getVClassAccess().getVStructural_featuresAssignment_8_4()); 
            // InternalVmsc.g:2669:2: ( rule__VClass__VStructural_featuresAssignment_8_4 )
            // InternalVmsc.g:2669:3: rule__VClass__VStructural_featuresAssignment_8_4
            {
            pushFollow(FOLLOW_2);
            rule__VClass__VStructural_featuresAssignment_8_4();

            state._fsp--;


            }

             after(grammarAccess.getVClassAccess().getVStructural_featuresAssignment_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_8__4__Impl"


    // $ANTLR start "rule__VClass__Group_8__5"
    // InternalVmsc.g:2677:1: rule__VClass__Group_8__5 : rule__VClass__Group_8__5__Impl rule__VClass__Group_8__6 ;
    public final void rule__VClass__Group_8__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2681:1: ( rule__VClass__Group_8__5__Impl rule__VClass__Group_8__6 )
            // InternalVmsc.g:2682:2: rule__VClass__Group_8__5__Impl rule__VClass__Group_8__6
            {
            pushFollow(FOLLOW_16);
            rule__VClass__Group_8__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VClass__Group_8__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_8__5"


    // $ANTLR start "rule__VClass__Group_8__5__Impl"
    // InternalVmsc.g:2689:1: rule__VClass__Group_8__5__Impl : ( '}' ) ;
    public final void rule__VClass__Group_8__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2693:1: ( ( '}' ) )
            // InternalVmsc.g:2694:1: ( '}' )
            {
            // InternalVmsc.g:2694:1: ( '}' )
            // InternalVmsc.g:2695:2: '}'
            {
             before(grammarAccess.getVClassAccess().getRightCurlyBracketKeyword_8_5()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getVClassAccess().getRightCurlyBracketKeyword_8_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_8__5__Impl"


    // $ANTLR start "rule__VClass__Group_8__6"
    // InternalVmsc.g:2704:1: rule__VClass__Group_8__6 : rule__VClass__Group_8__6__Impl rule__VClass__Group_8__7 ;
    public final void rule__VClass__Group_8__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2708:1: ( rule__VClass__Group_8__6__Impl rule__VClass__Group_8__7 )
            // InternalVmsc.g:2709:2: rule__VClass__Group_8__6__Impl rule__VClass__Group_8__7
            {
            pushFollow(FOLLOW_16);
            rule__VClass__Group_8__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VClass__Group_8__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_8__6"


    // $ANTLR start "rule__VClass__Group_8__6__Impl"
    // InternalVmsc.g:2716:1: rule__VClass__Group_8__6__Impl : ( ( rule__VClass__Group_8_6__0 )* ) ;
    public final void rule__VClass__Group_8__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2720:1: ( ( ( rule__VClass__Group_8_6__0 )* ) )
            // InternalVmsc.g:2721:1: ( ( rule__VClass__Group_8_6__0 )* )
            {
            // InternalVmsc.g:2721:1: ( ( rule__VClass__Group_8_6__0 )* )
            // InternalVmsc.g:2722:2: ( rule__VClass__Group_8_6__0 )*
            {
             before(grammarAccess.getVClassAccess().getGroup_8_6()); 
            // InternalVmsc.g:2723:2: ( rule__VClass__Group_8_6__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==11) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalVmsc.g:2723:3: rule__VClass__Group_8_6__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__VClass__Group_8_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getVClassAccess().getGroup_8_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_8__6__Impl"


    // $ANTLR start "rule__VClass__Group_8__7"
    // InternalVmsc.g:2731:1: rule__VClass__Group_8__7 : rule__VClass__Group_8__7__Impl rule__VClass__Group_8__8 ;
    public final void rule__VClass__Group_8__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2735:1: ( rule__VClass__Group_8__7__Impl rule__VClass__Group_8__8 )
            // InternalVmsc.g:2736:2: rule__VClass__Group_8__7__Impl rule__VClass__Group_8__8
            {
            pushFollow(FOLLOW_12);
            rule__VClass__Group_8__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VClass__Group_8__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_8__7"


    // $ANTLR start "rule__VClass__Group_8__7__Impl"
    // InternalVmsc.g:2743:1: rule__VClass__Group_8__7__Impl : ( ']' ) ;
    public final void rule__VClass__Group_8__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2747:1: ( ( ']' ) )
            // InternalVmsc.g:2748:1: ( ']' )
            {
            // InternalVmsc.g:2748:1: ( ']' )
            // InternalVmsc.g:2749:2: ']'
            {
             before(grammarAccess.getVClassAccess().getRightSquareBracketKeyword_8_7()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getVClassAccess().getRightSquareBracketKeyword_8_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_8__7__Impl"


    // $ANTLR start "rule__VClass__Group_8__8"
    // InternalVmsc.g:2758:1: rule__VClass__Group_8__8 : rule__VClass__Group_8__8__Impl ;
    public final void rule__VClass__Group_8__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2762:1: ( rule__VClass__Group_8__8__Impl )
            // InternalVmsc.g:2763:2: rule__VClass__Group_8__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VClass__Group_8__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_8__8"


    // $ANTLR start "rule__VClass__Group_8__8__Impl"
    // InternalVmsc.g:2769:1: rule__VClass__Group_8__8__Impl : ( ',' ) ;
    public final void rule__VClass__Group_8__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2773:1: ( ( ',' ) )
            // InternalVmsc.g:2774:1: ( ',' )
            {
            // InternalVmsc.g:2774:1: ( ',' )
            // InternalVmsc.g:2775:2: ','
            {
             before(grammarAccess.getVClassAccess().getCommaKeyword_8_8()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getVClassAccess().getCommaKeyword_8_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_8__8__Impl"


    // $ANTLR start "rule__VClass__Group_8_6__0"
    // InternalVmsc.g:2785:1: rule__VClass__Group_8_6__0 : rule__VClass__Group_8_6__0__Impl rule__VClass__Group_8_6__1 ;
    public final void rule__VClass__Group_8_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2789:1: ( rule__VClass__Group_8_6__0__Impl rule__VClass__Group_8_6__1 )
            // InternalVmsc.g:2790:2: rule__VClass__Group_8_6__0__Impl rule__VClass__Group_8_6__1
            {
            pushFollow(FOLLOW_5);
            rule__VClass__Group_8_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VClass__Group_8_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_8_6__0"


    // $ANTLR start "rule__VClass__Group_8_6__0__Impl"
    // InternalVmsc.g:2797:1: rule__VClass__Group_8_6__0__Impl : ( ',' ) ;
    public final void rule__VClass__Group_8_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2801:1: ( ( ',' ) )
            // InternalVmsc.g:2802:1: ( ',' )
            {
            // InternalVmsc.g:2802:1: ( ',' )
            // InternalVmsc.g:2803:2: ','
            {
             before(grammarAccess.getVClassAccess().getCommaKeyword_8_6_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getVClassAccess().getCommaKeyword_8_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_8_6__0__Impl"


    // $ANTLR start "rule__VClass__Group_8_6__1"
    // InternalVmsc.g:2812:1: rule__VClass__Group_8_6__1 : rule__VClass__Group_8_6__1__Impl rule__VClass__Group_8_6__2 ;
    public final void rule__VClass__Group_8_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2816:1: ( rule__VClass__Group_8_6__1__Impl rule__VClass__Group_8_6__2 )
            // InternalVmsc.g:2817:2: rule__VClass__Group_8_6__1__Impl rule__VClass__Group_8_6__2
            {
            pushFollow(FOLLOW_23);
            rule__VClass__Group_8_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VClass__Group_8_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_8_6__1"


    // $ANTLR start "rule__VClass__Group_8_6__1__Impl"
    // InternalVmsc.g:2824:1: rule__VClass__Group_8_6__1__Impl : ( '{' ) ;
    public final void rule__VClass__Group_8_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2828:1: ( ( '{' ) )
            // InternalVmsc.g:2829:1: ( '{' )
            {
            // InternalVmsc.g:2829:1: ( '{' )
            // InternalVmsc.g:2830:2: '{'
            {
             before(grammarAccess.getVClassAccess().getLeftCurlyBracketKeyword_8_6_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getVClassAccess().getLeftCurlyBracketKeyword_8_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_8_6__1__Impl"


    // $ANTLR start "rule__VClass__Group_8_6__2"
    // InternalVmsc.g:2839:1: rule__VClass__Group_8_6__2 : rule__VClass__Group_8_6__2__Impl rule__VClass__Group_8_6__3 ;
    public final void rule__VClass__Group_8_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2843:1: ( rule__VClass__Group_8_6__2__Impl rule__VClass__Group_8_6__3 )
            // InternalVmsc.g:2844:2: rule__VClass__Group_8_6__2__Impl rule__VClass__Group_8_6__3
            {
            pushFollow(FOLLOW_15);
            rule__VClass__Group_8_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VClass__Group_8_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_8_6__2"


    // $ANTLR start "rule__VClass__Group_8_6__2__Impl"
    // InternalVmsc.g:2851:1: rule__VClass__Group_8_6__2__Impl : ( ( rule__VClass__VStructural_featuresAssignment_8_6_2 ) ) ;
    public final void rule__VClass__Group_8_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2855:1: ( ( ( rule__VClass__VStructural_featuresAssignment_8_6_2 ) ) )
            // InternalVmsc.g:2856:1: ( ( rule__VClass__VStructural_featuresAssignment_8_6_2 ) )
            {
            // InternalVmsc.g:2856:1: ( ( rule__VClass__VStructural_featuresAssignment_8_6_2 ) )
            // InternalVmsc.g:2857:2: ( rule__VClass__VStructural_featuresAssignment_8_6_2 )
            {
             before(grammarAccess.getVClassAccess().getVStructural_featuresAssignment_8_6_2()); 
            // InternalVmsc.g:2858:2: ( rule__VClass__VStructural_featuresAssignment_8_6_2 )
            // InternalVmsc.g:2858:3: rule__VClass__VStructural_featuresAssignment_8_6_2
            {
            pushFollow(FOLLOW_2);
            rule__VClass__VStructural_featuresAssignment_8_6_2();

            state._fsp--;


            }

             after(grammarAccess.getVClassAccess().getVStructural_featuresAssignment_8_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_8_6__2__Impl"


    // $ANTLR start "rule__VClass__Group_8_6__3"
    // InternalVmsc.g:2866:1: rule__VClass__Group_8_6__3 : rule__VClass__Group_8_6__3__Impl ;
    public final void rule__VClass__Group_8_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2870:1: ( rule__VClass__Group_8_6__3__Impl )
            // InternalVmsc.g:2871:2: rule__VClass__Group_8_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VClass__Group_8_6__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_8_6__3"


    // $ANTLR start "rule__VClass__Group_8_6__3__Impl"
    // InternalVmsc.g:2877:1: rule__VClass__Group_8_6__3__Impl : ( '}' ) ;
    public final void rule__VClass__Group_8_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2881:1: ( ( '}' ) )
            // InternalVmsc.g:2882:1: ( '}' )
            {
            // InternalVmsc.g:2882:1: ( '}' )
            // InternalVmsc.g:2883:2: '}'
            {
             before(grammarAccess.getVClassAccess().getRightCurlyBracketKeyword_8_6_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getVClassAccess().getRightCurlyBracketKeyword_8_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_8_6__3__Impl"


    // $ANTLR start "rule__VClass__Group_9__0"
    // InternalVmsc.g:2893:1: rule__VClass__Group_9__0 : rule__VClass__Group_9__0__Impl rule__VClass__Group_9__1 ;
    public final void rule__VClass__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2897:1: ( rule__VClass__Group_9__0__Impl rule__VClass__Group_9__1 )
            // InternalVmsc.g:2898:2: rule__VClass__Group_9__0__Impl rule__VClass__Group_9__1
            {
            pushFollow(FOLLOW_4);
            rule__VClass__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VClass__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_9__0"


    // $ANTLR start "rule__VClass__Group_9__0__Impl"
    // InternalVmsc.g:2905:1: rule__VClass__Group_9__0__Impl : ( 'VSuperType' ) ;
    public final void rule__VClass__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2909:1: ( ( 'VSuperType' ) )
            // InternalVmsc.g:2910:1: ( 'VSuperType' )
            {
            // InternalVmsc.g:2910:1: ( 'VSuperType' )
            // InternalVmsc.g:2911:2: 'VSuperType'
            {
             before(grammarAccess.getVClassAccess().getVSuperTypeKeyword_9_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getVClassAccess().getVSuperTypeKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_9__0__Impl"


    // $ANTLR start "rule__VClass__Group_9__1"
    // InternalVmsc.g:2920:1: rule__VClass__Group_9__1 : rule__VClass__Group_9__1__Impl rule__VClass__Group_9__2 ;
    public final void rule__VClass__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2924:1: ( rule__VClass__Group_9__1__Impl rule__VClass__Group_9__2 )
            // InternalVmsc.g:2925:2: rule__VClass__Group_9__1__Impl rule__VClass__Group_9__2
            {
            pushFollow(FOLLOW_13);
            rule__VClass__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VClass__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_9__1"


    // $ANTLR start "rule__VClass__Group_9__1__Impl"
    // InternalVmsc.g:2932:1: rule__VClass__Group_9__1__Impl : ( ':' ) ;
    public final void rule__VClass__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2936:1: ( ( ':' ) )
            // InternalVmsc.g:2937:1: ( ':' )
            {
            // InternalVmsc.g:2937:1: ( ':' )
            // InternalVmsc.g:2938:2: ':'
            {
             before(grammarAccess.getVClassAccess().getColonKeyword_9_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVClassAccess().getColonKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_9__1__Impl"


    // $ANTLR start "rule__VClass__Group_9__2"
    // InternalVmsc.g:2947:1: rule__VClass__Group_9__2 : rule__VClass__Group_9__2__Impl rule__VClass__Group_9__3 ;
    public final void rule__VClass__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2951:1: ( rule__VClass__Group_9__2__Impl rule__VClass__Group_9__3 )
            // InternalVmsc.g:2952:2: rule__VClass__Group_9__2__Impl rule__VClass__Group_9__3
            {
            pushFollow(FOLLOW_7);
            rule__VClass__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VClass__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_9__2"


    // $ANTLR start "rule__VClass__Group_9__2__Impl"
    // InternalVmsc.g:2959:1: rule__VClass__Group_9__2__Impl : ( '[' ) ;
    public final void rule__VClass__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2963:1: ( ( '[' ) )
            // InternalVmsc.g:2964:1: ( '[' )
            {
            // InternalVmsc.g:2964:1: ( '[' )
            // InternalVmsc.g:2965:2: '['
            {
             before(grammarAccess.getVClassAccess().getLeftSquareBracketKeyword_9_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getVClassAccess().getLeftSquareBracketKeyword_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_9__2__Impl"


    // $ANTLR start "rule__VClass__Group_9__3"
    // InternalVmsc.g:2974:1: rule__VClass__Group_9__3 : rule__VClass__Group_9__3__Impl rule__VClass__Group_9__4 ;
    public final void rule__VClass__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2978:1: ( rule__VClass__Group_9__3__Impl rule__VClass__Group_9__4 )
            // InternalVmsc.g:2979:2: rule__VClass__Group_9__3__Impl rule__VClass__Group_9__4
            {
            pushFollow(FOLLOW_16);
            rule__VClass__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VClass__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_9__3"


    // $ANTLR start "rule__VClass__Group_9__3__Impl"
    // InternalVmsc.g:2986:1: rule__VClass__Group_9__3__Impl : ( ( rule__VClass__VSuperTypeAssignment_9_3 ) ) ;
    public final void rule__VClass__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:2990:1: ( ( ( rule__VClass__VSuperTypeAssignment_9_3 ) ) )
            // InternalVmsc.g:2991:1: ( ( rule__VClass__VSuperTypeAssignment_9_3 ) )
            {
            // InternalVmsc.g:2991:1: ( ( rule__VClass__VSuperTypeAssignment_9_3 ) )
            // InternalVmsc.g:2992:2: ( rule__VClass__VSuperTypeAssignment_9_3 )
            {
             before(grammarAccess.getVClassAccess().getVSuperTypeAssignment_9_3()); 
            // InternalVmsc.g:2993:2: ( rule__VClass__VSuperTypeAssignment_9_3 )
            // InternalVmsc.g:2993:3: rule__VClass__VSuperTypeAssignment_9_3
            {
            pushFollow(FOLLOW_2);
            rule__VClass__VSuperTypeAssignment_9_3();

            state._fsp--;


            }

             after(grammarAccess.getVClassAccess().getVSuperTypeAssignment_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_9__3__Impl"


    // $ANTLR start "rule__VClass__Group_9__4"
    // InternalVmsc.g:3001:1: rule__VClass__Group_9__4 : rule__VClass__Group_9__4__Impl rule__VClass__Group_9__5 ;
    public final void rule__VClass__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3005:1: ( rule__VClass__Group_9__4__Impl rule__VClass__Group_9__5 )
            // InternalVmsc.g:3006:2: rule__VClass__Group_9__4__Impl rule__VClass__Group_9__5
            {
            pushFollow(FOLLOW_16);
            rule__VClass__Group_9__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VClass__Group_9__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_9__4"


    // $ANTLR start "rule__VClass__Group_9__4__Impl"
    // InternalVmsc.g:3013:1: rule__VClass__Group_9__4__Impl : ( ( rule__VClass__Group_9_4__0 )* ) ;
    public final void rule__VClass__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3017:1: ( ( ( rule__VClass__Group_9_4__0 )* ) )
            // InternalVmsc.g:3018:1: ( ( rule__VClass__Group_9_4__0 )* )
            {
            // InternalVmsc.g:3018:1: ( ( rule__VClass__Group_9_4__0 )* )
            // InternalVmsc.g:3019:2: ( rule__VClass__Group_9_4__0 )*
            {
             before(grammarAccess.getVClassAccess().getGroup_9_4()); 
            // InternalVmsc.g:3020:2: ( rule__VClass__Group_9_4__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==11) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalVmsc.g:3020:3: rule__VClass__Group_9_4__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__VClass__Group_9_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getVClassAccess().getGroup_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_9__4__Impl"


    // $ANTLR start "rule__VClass__Group_9__5"
    // InternalVmsc.g:3028:1: rule__VClass__Group_9__5 : rule__VClass__Group_9__5__Impl rule__VClass__Group_9__6 ;
    public final void rule__VClass__Group_9__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3032:1: ( rule__VClass__Group_9__5__Impl rule__VClass__Group_9__6 )
            // InternalVmsc.g:3033:2: rule__VClass__Group_9__5__Impl rule__VClass__Group_9__6
            {
            pushFollow(FOLLOW_12);
            rule__VClass__Group_9__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VClass__Group_9__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_9__5"


    // $ANTLR start "rule__VClass__Group_9__5__Impl"
    // InternalVmsc.g:3040:1: rule__VClass__Group_9__5__Impl : ( ']' ) ;
    public final void rule__VClass__Group_9__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3044:1: ( ( ']' ) )
            // InternalVmsc.g:3045:1: ( ']' )
            {
            // InternalVmsc.g:3045:1: ( ']' )
            // InternalVmsc.g:3046:2: ']'
            {
             before(grammarAccess.getVClassAccess().getRightSquareBracketKeyword_9_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getVClassAccess().getRightSquareBracketKeyword_9_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_9__5__Impl"


    // $ANTLR start "rule__VClass__Group_9__6"
    // InternalVmsc.g:3055:1: rule__VClass__Group_9__6 : rule__VClass__Group_9__6__Impl ;
    public final void rule__VClass__Group_9__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3059:1: ( rule__VClass__Group_9__6__Impl )
            // InternalVmsc.g:3060:2: rule__VClass__Group_9__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VClass__Group_9__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_9__6"


    // $ANTLR start "rule__VClass__Group_9__6__Impl"
    // InternalVmsc.g:3066:1: rule__VClass__Group_9__6__Impl : ( ',' ) ;
    public final void rule__VClass__Group_9__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3070:1: ( ( ',' ) )
            // InternalVmsc.g:3071:1: ( ',' )
            {
            // InternalVmsc.g:3071:1: ( ',' )
            // InternalVmsc.g:3072:2: ','
            {
             before(grammarAccess.getVClassAccess().getCommaKeyword_9_6()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getVClassAccess().getCommaKeyword_9_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_9__6__Impl"


    // $ANTLR start "rule__VClass__Group_9_4__0"
    // InternalVmsc.g:3082:1: rule__VClass__Group_9_4__0 : rule__VClass__Group_9_4__0__Impl rule__VClass__Group_9_4__1 ;
    public final void rule__VClass__Group_9_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3086:1: ( rule__VClass__Group_9_4__0__Impl rule__VClass__Group_9_4__1 )
            // InternalVmsc.g:3087:2: rule__VClass__Group_9_4__0__Impl rule__VClass__Group_9_4__1
            {
            pushFollow(FOLLOW_7);
            rule__VClass__Group_9_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VClass__Group_9_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_9_4__0"


    // $ANTLR start "rule__VClass__Group_9_4__0__Impl"
    // InternalVmsc.g:3094:1: rule__VClass__Group_9_4__0__Impl : ( ',' ) ;
    public final void rule__VClass__Group_9_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3098:1: ( ( ',' ) )
            // InternalVmsc.g:3099:1: ( ',' )
            {
            // InternalVmsc.g:3099:1: ( ',' )
            // InternalVmsc.g:3100:2: ','
            {
             before(grammarAccess.getVClassAccess().getCommaKeyword_9_4_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getVClassAccess().getCommaKeyword_9_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_9_4__0__Impl"


    // $ANTLR start "rule__VClass__Group_9_4__1"
    // InternalVmsc.g:3109:1: rule__VClass__Group_9_4__1 : rule__VClass__Group_9_4__1__Impl ;
    public final void rule__VClass__Group_9_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3113:1: ( rule__VClass__Group_9_4__1__Impl )
            // InternalVmsc.g:3114:2: rule__VClass__Group_9_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VClass__Group_9_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_9_4__1"


    // $ANTLR start "rule__VClass__Group_9_4__1__Impl"
    // InternalVmsc.g:3120:1: rule__VClass__Group_9_4__1__Impl : ( ( rule__VClass__VSuperTypeAssignment_9_4_1 ) ) ;
    public final void rule__VClass__Group_9_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3124:1: ( ( ( rule__VClass__VSuperTypeAssignment_9_4_1 ) ) )
            // InternalVmsc.g:3125:1: ( ( rule__VClass__VSuperTypeAssignment_9_4_1 ) )
            {
            // InternalVmsc.g:3125:1: ( ( rule__VClass__VSuperTypeAssignment_9_4_1 ) )
            // InternalVmsc.g:3126:2: ( rule__VClass__VSuperTypeAssignment_9_4_1 )
            {
             before(grammarAccess.getVClassAccess().getVSuperTypeAssignment_9_4_1()); 
            // InternalVmsc.g:3127:2: ( rule__VClass__VSuperTypeAssignment_9_4_1 )
            // InternalVmsc.g:3127:3: rule__VClass__VSuperTypeAssignment_9_4_1
            {
            pushFollow(FOLLOW_2);
            rule__VClass__VSuperTypeAssignment_9_4_1();

            state._fsp--;


            }

             after(grammarAccess.getVClassAccess().getVSuperTypeAssignment_9_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_9_4__1__Impl"


    // $ANTLR start "rule__VClass__Group_10__0"
    // InternalVmsc.g:3136:1: rule__VClass__Group_10__0 : rule__VClass__Group_10__0__Impl rule__VClass__Group_10__1 ;
    public final void rule__VClass__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3140:1: ( rule__VClass__Group_10__0__Impl rule__VClass__Group_10__1 )
            // InternalVmsc.g:3141:2: rule__VClass__Group_10__0__Impl rule__VClass__Group_10__1
            {
            pushFollow(FOLLOW_4);
            rule__VClass__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VClass__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_10__0"


    // $ANTLR start "rule__VClass__Group_10__0__Impl"
    // InternalVmsc.g:3148:1: rule__VClass__Group_10__0__Impl : ( ( rule__VClass__IsAbstractAssignment_10_0 ) ) ;
    public final void rule__VClass__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3152:1: ( ( ( rule__VClass__IsAbstractAssignment_10_0 ) ) )
            // InternalVmsc.g:3153:1: ( ( rule__VClass__IsAbstractAssignment_10_0 ) )
            {
            // InternalVmsc.g:3153:1: ( ( rule__VClass__IsAbstractAssignment_10_0 ) )
            // InternalVmsc.g:3154:2: ( rule__VClass__IsAbstractAssignment_10_0 )
            {
             before(grammarAccess.getVClassAccess().getIsAbstractAssignment_10_0()); 
            // InternalVmsc.g:3155:2: ( rule__VClass__IsAbstractAssignment_10_0 )
            // InternalVmsc.g:3155:3: rule__VClass__IsAbstractAssignment_10_0
            {
            pushFollow(FOLLOW_2);
            rule__VClass__IsAbstractAssignment_10_0();

            state._fsp--;


            }

             after(grammarAccess.getVClassAccess().getIsAbstractAssignment_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_10__0__Impl"


    // $ANTLR start "rule__VClass__Group_10__1"
    // InternalVmsc.g:3163:1: rule__VClass__Group_10__1 : rule__VClass__Group_10__1__Impl rule__VClass__Group_10__2 ;
    public final void rule__VClass__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3167:1: ( rule__VClass__Group_10__1__Impl rule__VClass__Group_10__2 )
            // InternalVmsc.g:3168:2: rule__VClass__Group_10__1__Impl rule__VClass__Group_10__2
            {
            pushFollow(FOLLOW_20);
            rule__VClass__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VClass__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_10__1"


    // $ANTLR start "rule__VClass__Group_10__1__Impl"
    // InternalVmsc.g:3175:1: rule__VClass__Group_10__1__Impl : ( ':' ) ;
    public final void rule__VClass__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3179:1: ( ( ':' ) )
            // InternalVmsc.g:3180:1: ( ':' )
            {
            // InternalVmsc.g:3180:1: ( ':' )
            // InternalVmsc.g:3181:2: ':'
            {
             before(grammarAccess.getVClassAccess().getColonKeyword_10_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVClassAccess().getColonKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_10__1__Impl"


    // $ANTLR start "rule__VClass__Group_10__2"
    // InternalVmsc.g:3190:1: rule__VClass__Group_10__2 : rule__VClass__Group_10__2__Impl rule__VClass__Group_10__3 ;
    public final void rule__VClass__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3194:1: ( rule__VClass__Group_10__2__Impl rule__VClass__Group_10__3 )
            // InternalVmsc.g:3195:2: rule__VClass__Group_10__2__Impl rule__VClass__Group_10__3
            {
            pushFollow(FOLLOW_12);
            rule__VClass__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VClass__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_10__2"


    // $ANTLR start "rule__VClass__Group_10__2__Impl"
    // InternalVmsc.g:3202:1: rule__VClass__Group_10__2__Impl : ( 'True' ) ;
    public final void rule__VClass__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3206:1: ( ( 'True' ) )
            // InternalVmsc.g:3207:1: ( 'True' )
            {
            // InternalVmsc.g:3207:1: ( 'True' )
            // InternalVmsc.g:3208:2: 'True'
            {
             before(grammarAccess.getVClassAccess().getTrueKeyword_10_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getVClassAccess().getTrueKeyword_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_10__2__Impl"


    // $ANTLR start "rule__VClass__Group_10__3"
    // InternalVmsc.g:3217:1: rule__VClass__Group_10__3 : rule__VClass__Group_10__3__Impl ;
    public final void rule__VClass__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3221:1: ( rule__VClass__Group_10__3__Impl )
            // InternalVmsc.g:3222:2: rule__VClass__Group_10__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VClass__Group_10__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_10__3"


    // $ANTLR start "rule__VClass__Group_10__3__Impl"
    // InternalVmsc.g:3228:1: rule__VClass__Group_10__3__Impl : ( ',' ) ;
    public final void rule__VClass__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3232:1: ( ( ',' ) )
            // InternalVmsc.g:3233:1: ( ',' )
            {
            // InternalVmsc.g:3233:1: ( ',' )
            // InternalVmsc.g:3234:2: ','
            {
             before(grammarAccess.getVClassAccess().getCommaKeyword_10_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getVClassAccess().getCommaKeyword_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_10__3__Impl"


    // $ANTLR start "rule__VClass__Group_11__0"
    // InternalVmsc.g:3244:1: rule__VClass__Group_11__0 : rule__VClass__Group_11__0__Impl rule__VClass__Group_11__1 ;
    public final void rule__VClass__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3248:1: ( rule__VClass__Group_11__0__Impl rule__VClass__Group_11__1 )
            // InternalVmsc.g:3249:2: rule__VClass__Group_11__0__Impl rule__VClass__Group_11__1
            {
            pushFollow(FOLLOW_4);
            rule__VClass__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VClass__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_11__0"


    // $ANTLR start "rule__VClass__Group_11__0__Impl"
    // InternalVmsc.g:3256:1: rule__VClass__Group_11__0__Impl : ( ( rule__VClass__IsInterfaceAssignment_11_0 ) ) ;
    public final void rule__VClass__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3260:1: ( ( ( rule__VClass__IsInterfaceAssignment_11_0 ) ) )
            // InternalVmsc.g:3261:1: ( ( rule__VClass__IsInterfaceAssignment_11_0 ) )
            {
            // InternalVmsc.g:3261:1: ( ( rule__VClass__IsInterfaceAssignment_11_0 ) )
            // InternalVmsc.g:3262:2: ( rule__VClass__IsInterfaceAssignment_11_0 )
            {
             before(grammarAccess.getVClassAccess().getIsInterfaceAssignment_11_0()); 
            // InternalVmsc.g:3263:2: ( rule__VClass__IsInterfaceAssignment_11_0 )
            // InternalVmsc.g:3263:3: rule__VClass__IsInterfaceAssignment_11_0
            {
            pushFollow(FOLLOW_2);
            rule__VClass__IsInterfaceAssignment_11_0();

            state._fsp--;


            }

             after(grammarAccess.getVClassAccess().getIsInterfaceAssignment_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_11__0__Impl"


    // $ANTLR start "rule__VClass__Group_11__1"
    // InternalVmsc.g:3271:1: rule__VClass__Group_11__1 : rule__VClass__Group_11__1__Impl rule__VClass__Group_11__2 ;
    public final void rule__VClass__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3275:1: ( rule__VClass__Group_11__1__Impl rule__VClass__Group_11__2 )
            // InternalVmsc.g:3276:2: rule__VClass__Group_11__1__Impl rule__VClass__Group_11__2
            {
            pushFollow(FOLLOW_20);
            rule__VClass__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VClass__Group_11__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_11__1"


    // $ANTLR start "rule__VClass__Group_11__1__Impl"
    // InternalVmsc.g:3283:1: rule__VClass__Group_11__1__Impl : ( ':' ) ;
    public final void rule__VClass__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3287:1: ( ( ':' ) )
            // InternalVmsc.g:3288:1: ( ':' )
            {
            // InternalVmsc.g:3288:1: ( ':' )
            // InternalVmsc.g:3289:2: ':'
            {
             before(grammarAccess.getVClassAccess().getColonKeyword_11_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVClassAccess().getColonKeyword_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_11__1__Impl"


    // $ANTLR start "rule__VClass__Group_11__2"
    // InternalVmsc.g:3298:1: rule__VClass__Group_11__2 : rule__VClass__Group_11__2__Impl rule__VClass__Group_11__3 ;
    public final void rule__VClass__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3302:1: ( rule__VClass__Group_11__2__Impl rule__VClass__Group_11__3 )
            // InternalVmsc.g:3303:2: rule__VClass__Group_11__2__Impl rule__VClass__Group_11__3
            {
            pushFollow(FOLLOW_12);
            rule__VClass__Group_11__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VClass__Group_11__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_11__2"


    // $ANTLR start "rule__VClass__Group_11__2__Impl"
    // InternalVmsc.g:3310:1: rule__VClass__Group_11__2__Impl : ( 'True' ) ;
    public final void rule__VClass__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3314:1: ( ( 'True' ) )
            // InternalVmsc.g:3315:1: ( 'True' )
            {
            // InternalVmsc.g:3315:1: ( 'True' )
            // InternalVmsc.g:3316:2: 'True'
            {
             before(grammarAccess.getVClassAccess().getTrueKeyword_11_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getVClassAccess().getTrueKeyword_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_11__2__Impl"


    // $ANTLR start "rule__VClass__Group_11__3"
    // InternalVmsc.g:3325:1: rule__VClass__Group_11__3 : rule__VClass__Group_11__3__Impl ;
    public final void rule__VClass__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3329:1: ( rule__VClass__Group_11__3__Impl )
            // InternalVmsc.g:3330:2: rule__VClass__Group_11__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VClass__Group_11__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_11__3"


    // $ANTLR start "rule__VClass__Group_11__3__Impl"
    // InternalVmsc.g:3336:1: rule__VClass__Group_11__3__Impl : ( ',' ) ;
    public final void rule__VClass__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3340:1: ( ( ',' ) )
            // InternalVmsc.g:3341:1: ( ',' )
            {
            // InternalVmsc.g:3341:1: ( ',' )
            // InternalVmsc.g:3342:2: ','
            {
             before(grammarAccess.getVClassAccess().getCommaKeyword_11_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getVClassAccess().getCommaKeyword_11_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__Group_11__3__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalVmsc.g:3352:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3356:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalVmsc.g:3357:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalVmsc.g:3364:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3368:1: ( ( ( '-' )? ) )
            // InternalVmsc.g:3369:1: ( ( '-' )? )
            {
            // InternalVmsc.g:3369:1: ( ( '-' )? )
            // InternalVmsc.g:3370:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalVmsc.g:3371:2: ( '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalVmsc.g:3371:3: '-'
                    {
                    match(input,30,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalVmsc.g:3379:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3383:1: ( rule__EInt__Group__1__Impl )
            // InternalVmsc.g:3384:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalVmsc.g:3390:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3394:1: ( ( RULE_INT ) )
            // InternalVmsc.g:3395:1: ( RULE_INT )
            {
            // InternalVmsc.g:3395:1: ( RULE_INT )
            // InternalVmsc.g:3396:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__VAttribute__Group__0"
    // InternalVmsc.g:3406:1: rule__VAttribute__Group__0 : rule__VAttribute__Group__0__Impl rule__VAttribute__Group__1 ;
    public final void rule__VAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3410:1: ( rule__VAttribute__Group__0__Impl rule__VAttribute__Group__1 )
            // InternalVmsc.g:3411:2: rule__VAttribute__Group__0__Impl rule__VAttribute__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__VAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group__0"


    // $ANTLR start "rule__VAttribute__Group__0__Impl"
    // InternalVmsc.g:3418:1: rule__VAttribute__Group__0__Impl : ( () ) ;
    public final void rule__VAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3422:1: ( ( () ) )
            // InternalVmsc.g:3423:1: ( () )
            {
            // InternalVmsc.g:3423:1: ( () )
            // InternalVmsc.g:3424:2: ()
            {
             before(grammarAccess.getVAttributeAccess().getVAttributeAction_0()); 
            // InternalVmsc.g:3425:2: ()
            // InternalVmsc.g:3425:3: 
            {
            }

             after(grammarAccess.getVAttributeAccess().getVAttributeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group__0__Impl"


    // $ANTLR start "rule__VAttribute__Group__1"
    // InternalVmsc.g:3433:1: rule__VAttribute__Group__1 : rule__VAttribute__Group__1__Impl rule__VAttribute__Group__2 ;
    public final void rule__VAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3437:1: ( rule__VAttribute__Group__1__Impl rule__VAttribute__Group__2 )
            // InternalVmsc.g:3438:2: rule__VAttribute__Group__1__Impl rule__VAttribute__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__VAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group__1"


    // $ANTLR start "rule__VAttribute__Group__1__Impl"
    // InternalVmsc.g:3445:1: rule__VAttribute__Group__1__Impl : ( 'VAttribute' ) ;
    public final void rule__VAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3449:1: ( ( 'VAttribute' ) )
            // InternalVmsc.g:3450:1: ( 'VAttribute' )
            {
            // InternalVmsc.g:3450:1: ( 'VAttribute' )
            // InternalVmsc.g:3451:2: 'VAttribute'
            {
             before(grammarAccess.getVAttributeAccess().getVAttributeKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getVAttributeAccess().getVAttributeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group__1__Impl"


    // $ANTLR start "rule__VAttribute__Group__2"
    // InternalVmsc.g:3460:1: rule__VAttribute__Group__2 : rule__VAttribute__Group__2__Impl rule__VAttribute__Group__3 ;
    public final void rule__VAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3464:1: ( rule__VAttribute__Group__2__Impl rule__VAttribute__Group__3 )
            // InternalVmsc.g:3465:2: rule__VAttribute__Group__2__Impl rule__VAttribute__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__VAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group__2"


    // $ANTLR start "rule__VAttribute__Group__2__Impl"
    // InternalVmsc.g:3472:1: rule__VAttribute__Group__2__Impl : ( ':' ) ;
    public final void rule__VAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3476:1: ( ( ':' ) )
            // InternalVmsc.g:3477:1: ( ':' )
            {
            // InternalVmsc.g:3477:1: ( ':' )
            // InternalVmsc.g:3478:2: ':'
            {
             before(grammarAccess.getVAttributeAccess().getColonKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVAttributeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group__2__Impl"


    // $ANTLR start "rule__VAttribute__Group__3"
    // InternalVmsc.g:3487:1: rule__VAttribute__Group__3 : rule__VAttribute__Group__3__Impl rule__VAttribute__Group__4 ;
    public final void rule__VAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3491:1: ( rule__VAttribute__Group__3__Impl rule__VAttribute__Group__4 )
            // InternalVmsc.g:3492:2: rule__VAttribute__Group__3__Impl rule__VAttribute__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__VAttribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VAttribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group__3"


    // $ANTLR start "rule__VAttribute__Group__3__Impl"
    // InternalVmsc.g:3499:1: rule__VAttribute__Group__3__Impl : ( '{' ) ;
    public final void rule__VAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3503:1: ( ( '{' ) )
            // InternalVmsc.g:3504:1: ( '{' )
            {
            // InternalVmsc.g:3504:1: ( '{' )
            // InternalVmsc.g:3505:2: '{'
            {
             before(grammarAccess.getVAttributeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getVAttributeAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group__3__Impl"


    // $ANTLR start "rule__VAttribute__Group__4"
    // InternalVmsc.g:3514:1: rule__VAttribute__Group__4 : rule__VAttribute__Group__4__Impl rule__VAttribute__Group__5 ;
    public final void rule__VAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3518:1: ( rule__VAttribute__Group__4__Impl rule__VAttribute__Group__5 )
            // InternalVmsc.g:3519:2: rule__VAttribute__Group__4__Impl rule__VAttribute__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__VAttribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VAttribute__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group__4"


    // $ANTLR start "rule__VAttribute__Group__4__Impl"
    // InternalVmsc.g:3526:1: rule__VAttribute__Group__4__Impl : ( 'name' ) ;
    public final void rule__VAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3530:1: ( ( 'name' ) )
            // InternalVmsc.g:3531:1: ( 'name' )
            {
            // InternalVmsc.g:3531:1: ( 'name' )
            // InternalVmsc.g:3532:2: 'name'
            {
             before(grammarAccess.getVAttributeAccess().getNameKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getVAttributeAccess().getNameKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group__4__Impl"


    // $ANTLR start "rule__VAttribute__Group__5"
    // InternalVmsc.g:3541:1: rule__VAttribute__Group__5 : rule__VAttribute__Group__5__Impl rule__VAttribute__Group__6 ;
    public final void rule__VAttribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3545:1: ( rule__VAttribute__Group__5__Impl rule__VAttribute__Group__6 )
            // InternalVmsc.g:3546:2: rule__VAttribute__Group__5__Impl rule__VAttribute__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__VAttribute__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VAttribute__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group__5"


    // $ANTLR start "rule__VAttribute__Group__5__Impl"
    // InternalVmsc.g:3553:1: rule__VAttribute__Group__5__Impl : ( ':' ) ;
    public final void rule__VAttribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3557:1: ( ( ':' ) )
            // InternalVmsc.g:3558:1: ( ':' )
            {
            // InternalVmsc.g:3558:1: ( ':' )
            // InternalVmsc.g:3559:2: ':'
            {
             before(grammarAccess.getVAttributeAccess().getColonKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVAttributeAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group__5__Impl"


    // $ANTLR start "rule__VAttribute__Group__6"
    // InternalVmsc.g:3568:1: rule__VAttribute__Group__6 : rule__VAttribute__Group__6__Impl rule__VAttribute__Group__7 ;
    public final void rule__VAttribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3572:1: ( rule__VAttribute__Group__6__Impl rule__VAttribute__Group__7 )
            // InternalVmsc.g:3573:2: rule__VAttribute__Group__6__Impl rule__VAttribute__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__VAttribute__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VAttribute__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group__6"


    // $ANTLR start "rule__VAttribute__Group__6__Impl"
    // InternalVmsc.g:3580:1: rule__VAttribute__Group__6__Impl : ( ( rule__VAttribute__NameAssignment_6 ) ) ;
    public final void rule__VAttribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3584:1: ( ( ( rule__VAttribute__NameAssignment_6 ) ) )
            // InternalVmsc.g:3585:1: ( ( rule__VAttribute__NameAssignment_6 ) )
            {
            // InternalVmsc.g:3585:1: ( ( rule__VAttribute__NameAssignment_6 ) )
            // InternalVmsc.g:3586:2: ( rule__VAttribute__NameAssignment_6 )
            {
             before(grammarAccess.getVAttributeAccess().getNameAssignment_6()); 
            // InternalVmsc.g:3587:2: ( rule__VAttribute__NameAssignment_6 )
            // InternalVmsc.g:3587:3: rule__VAttribute__NameAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__VAttribute__NameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getVAttributeAccess().getNameAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group__6__Impl"


    // $ANTLR start "rule__VAttribute__Group__7"
    // InternalVmsc.g:3595:1: rule__VAttribute__Group__7 : rule__VAttribute__Group__7__Impl rule__VAttribute__Group__8 ;
    public final void rule__VAttribute__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3599:1: ( rule__VAttribute__Group__7__Impl rule__VAttribute__Group__8 )
            // InternalVmsc.g:3600:2: rule__VAttribute__Group__7__Impl rule__VAttribute__Group__8
            {
            pushFollow(FOLLOW_26);
            rule__VAttribute__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VAttribute__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group__7"


    // $ANTLR start "rule__VAttribute__Group__7__Impl"
    // InternalVmsc.g:3607:1: rule__VAttribute__Group__7__Impl : ( ',' ) ;
    public final void rule__VAttribute__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3611:1: ( ( ',' ) )
            // InternalVmsc.g:3612:1: ( ',' )
            {
            // InternalVmsc.g:3612:1: ( ',' )
            // InternalVmsc.g:3613:2: ','
            {
             before(grammarAccess.getVAttributeAccess().getCommaKeyword_7()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getVAttributeAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group__7__Impl"


    // $ANTLR start "rule__VAttribute__Group__8"
    // InternalVmsc.g:3622:1: rule__VAttribute__Group__8 : rule__VAttribute__Group__8__Impl rule__VAttribute__Group__9 ;
    public final void rule__VAttribute__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3626:1: ( rule__VAttribute__Group__8__Impl rule__VAttribute__Group__9 )
            // InternalVmsc.g:3627:2: rule__VAttribute__Group__8__Impl rule__VAttribute__Group__9
            {
            pushFollow(FOLLOW_26);
            rule__VAttribute__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VAttribute__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group__8"


    // $ANTLR start "rule__VAttribute__Group__8__Impl"
    // InternalVmsc.g:3634:1: rule__VAttribute__Group__8__Impl : ( ( rule__VAttribute__IsChangeableAssignment_8 )? ) ;
    public final void rule__VAttribute__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3638:1: ( ( ( rule__VAttribute__IsChangeableAssignment_8 )? ) )
            // InternalVmsc.g:3639:1: ( ( rule__VAttribute__IsChangeableAssignment_8 )? )
            {
            // InternalVmsc.g:3639:1: ( ( rule__VAttribute__IsChangeableAssignment_8 )? )
            // InternalVmsc.g:3640:2: ( rule__VAttribute__IsChangeableAssignment_8 )?
            {
             before(grammarAccess.getVAttributeAccess().getIsChangeableAssignment_8()); 
            // InternalVmsc.g:3641:2: ( rule__VAttribute__IsChangeableAssignment_8 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==44) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalVmsc.g:3641:3: rule__VAttribute__IsChangeableAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__VAttribute__IsChangeableAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVAttributeAccess().getIsChangeableAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group__8__Impl"


    // $ANTLR start "rule__VAttribute__Group__9"
    // InternalVmsc.g:3649:1: rule__VAttribute__Group__9 : rule__VAttribute__Group__9__Impl rule__VAttribute__Group__10 ;
    public final void rule__VAttribute__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3653:1: ( rule__VAttribute__Group__9__Impl rule__VAttribute__Group__10 )
            // InternalVmsc.g:3654:2: rule__VAttribute__Group__9__Impl rule__VAttribute__Group__10
            {
            pushFollow(FOLLOW_26);
            rule__VAttribute__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VAttribute__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group__9"


    // $ANTLR start "rule__VAttribute__Group__9__Impl"
    // InternalVmsc.g:3661:1: rule__VAttribute__Group__9__Impl : ( ( rule__VAttribute__IsOrderedAssignment_9 )? ) ;
    public final void rule__VAttribute__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3665:1: ( ( ( rule__VAttribute__IsOrderedAssignment_9 )? ) )
            // InternalVmsc.g:3666:1: ( ( rule__VAttribute__IsOrderedAssignment_9 )? )
            {
            // InternalVmsc.g:3666:1: ( ( rule__VAttribute__IsOrderedAssignment_9 )? )
            // InternalVmsc.g:3667:2: ( rule__VAttribute__IsOrderedAssignment_9 )?
            {
             before(grammarAccess.getVAttributeAccess().getIsOrderedAssignment_9()); 
            // InternalVmsc.g:3668:2: ( rule__VAttribute__IsOrderedAssignment_9 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==45) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalVmsc.g:3668:3: rule__VAttribute__IsOrderedAssignment_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__VAttribute__IsOrderedAssignment_9();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVAttributeAccess().getIsOrderedAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group__9__Impl"


    // $ANTLR start "rule__VAttribute__Group__10"
    // InternalVmsc.g:3676:1: rule__VAttribute__Group__10 : rule__VAttribute__Group__10__Impl rule__VAttribute__Group__11 ;
    public final void rule__VAttribute__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3680:1: ( rule__VAttribute__Group__10__Impl rule__VAttribute__Group__11 )
            // InternalVmsc.g:3681:2: rule__VAttribute__Group__10__Impl rule__VAttribute__Group__11
            {
            pushFollow(FOLLOW_26);
            rule__VAttribute__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VAttribute__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group__10"


    // $ANTLR start "rule__VAttribute__Group__10__Impl"
    // InternalVmsc.g:3688:1: rule__VAttribute__Group__10__Impl : ( ( rule__VAttribute__IsTransientAssignment_10 )? ) ;
    public final void rule__VAttribute__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3692:1: ( ( ( rule__VAttribute__IsTransientAssignment_10 )? ) )
            // InternalVmsc.g:3693:1: ( ( rule__VAttribute__IsTransientAssignment_10 )? )
            {
            // InternalVmsc.g:3693:1: ( ( rule__VAttribute__IsTransientAssignment_10 )? )
            // InternalVmsc.g:3694:2: ( rule__VAttribute__IsTransientAssignment_10 )?
            {
             before(grammarAccess.getVAttributeAccess().getIsTransientAssignment_10()); 
            // InternalVmsc.g:3695:2: ( rule__VAttribute__IsTransientAssignment_10 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==46) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalVmsc.g:3695:3: rule__VAttribute__IsTransientAssignment_10
                    {
                    pushFollow(FOLLOW_2);
                    rule__VAttribute__IsTransientAssignment_10();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVAttributeAccess().getIsTransientAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group__10__Impl"


    // $ANTLR start "rule__VAttribute__Group__11"
    // InternalVmsc.g:3703:1: rule__VAttribute__Group__11 : rule__VAttribute__Group__11__Impl rule__VAttribute__Group__12 ;
    public final void rule__VAttribute__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3707:1: ( rule__VAttribute__Group__11__Impl rule__VAttribute__Group__12 )
            // InternalVmsc.g:3708:2: rule__VAttribute__Group__11__Impl rule__VAttribute__Group__12
            {
            pushFollow(FOLLOW_26);
            rule__VAttribute__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VAttribute__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group__11"


    // $ANTLR start "rule__VAttribute__Group__11__Impl"
    // InternalVmsc.g:3715:1: rule__VAttribute__Group__11__Impl : ( ( rule__VAttribute__IsUnsettableAssignment_11 )? ) ;
    public final void rule__VAttribute__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3719:1: ( ( ( rule__VAttribute__IsUnsettableAssignment_11 )? ) )
            // InternalVmsc.g:3720:1: ( ( rule__VAttribute__IsUnsettableAssignment_11 )? )
            {
            // InternalVmsc.g:3720:1: ( ( rule__VAttribute__IsUnsettableAssignment_11 )? )
            // InternalVmsc.g:3721:2: ( rule__VAttribute__IsUnsettableAssignment_11 )?
            {
             before(grammarAccess.getVAttributeAccess().getIsUnsettableAssignment_11()); 
            // InternalVmsc.g:3722:2: ( rule__VAttribute__IsUnsettableAssignment_11 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==47) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalVmsc.g:3722:3: rule__VAttribute__IsUnsettableAssignment_11
                    {
                    pushFollow(FOLLOW_2);
                    rule__VAttribute__IsUnsettableAssignment_11();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVAttributeAccess().getIsUnsettableAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group__11__Impl"


    // $ANTLR start "rule__VAttribute__Group__12"
    // InternalVmsc.g:3730:1: rule__VAttribute__Group__12 : rule__VAttribute__Group__12__Impl rule__VAttribute__Group__13 ;
    public final void rule__VAttribute__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3734:1: ( rule__VAttribute__Group__12__Impl rule__VAttribute__Group__13 )
            // InternalVmsc.g:3735:2: rule__VAttribute__Group__12__Impl rule__VAttribute__Group__13
            {
            pushFollow(FOLLOW_26);
            rule__VAttribute__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VAttribute__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group__12"


    // $ANTLR start "rule__VAttribute__Group__12__Impl"
    // InternalVmsc.g:3742:1: rule__VAttribute__Group__12__Impl : ( ( rule__VAttribute__IsVolatileAssignment_12 )? ) ;
    public final void rule__VAttribute__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3746:1: ( ( ( rule__VAttribute__IsVolatileAssignment_12 )? ) )
            // InternalVmsc.g:3747:1: ( ( rule__VAttribute__IsVolatileAssignment_12 )? )
            {
            // InternalVmsc.g:3747:1: ( ( rule__VAttribute__IsVolatileAssignment_12 )? )
            // InternalVmsc.g:3748:2: ( rule__VAttribute__IsVolatileAssignment_12 )?
            {
             before(grammarAccess.getVAttributeAccess().getIsVolatileAssignment_12()); 
            // InternalVmsc.g:3749:2: ( rule__VAttribute__IsVolatileAssignment_12 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==48) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalVmsc.g:3749:3: rule__VAttribute__IsVolatileAssignment_12
                    {
                    pushFollow(FOLLOW_2);
                    rule__VAttribute__IsVolatileAssignment_12();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVAttributeAccess().getIsVolatileAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group__12__Impl"


    // $ANTLR start "rule__VAttribute__Group__13"
    // InternalVmsc.g:3757:1: rule__VAttribute__Group__13 : rule__VAttribute__Group__13__Impl rule__VAttribute__Group__14 ;
    public final void rule__VAttribute__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3761:1: ( rule__VAttribute__Group__13__Impl rule__VAttribute__Group__14 )
            // InternalVmsc.g:3762:2: rule__VAttribute__Group__13__Impl rule__VAttribute__Group__14
            {
            pushFollow(FOLLOW_26);
            rule__VAttribute__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VAttribute__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group__13"


    // $ANTLR start "rule__VAttribute__Group__13__Impl"
    // InternalVmsc.g:3769:1: rule__VAttribute__Group__13__Impl : ( ( rule__VAttribute__IsDerivedAssignment_13 )? ) ;
    public final void rule__VAttribute__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3773:1: ( ( ( rule__VAttribute__IsDerivedAssignment_13 )? ) )
            // InternalVmsc.g:3774:1: ( ( rule__VAttribute__IsDerivedAssignment_13 )? )
            {
            // InternalVmsc.g:3774:1: ( ( rule__VAttribute__IsDerivedAssignment_13 )? )
            // InternalVmsc.g:3775:2: ( rule__VAttribute__IsDerivedAssignment_13 )?
            {
             before(grammarAccess.getVAttributeAccess().getIsDerivedAssignment_13()); 
            // InternalVmsc.g:3776:2: ( rule__VAttribute__IsDerivedAssignment_13 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==49) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalVmsc.g:3776:3: rule__VAttribute__IsDerivedAssignment_13
                    {
                    pushFollow(FOLLOW_2);
                    rule__VAttribute__IsDerivedAssignment_13();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVAttributeAccess().getIsDerivedAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group__13__Impl"


    // $ANTLR start "rule__VAttribute__Group__14"
    // InternalVmsc.g:3784:1: rule__VAttribute__Group__14 : rule__VAttribute__Group__14__Impl rule__VAttribute__Group__15 ;
    public final void rule__VAttribute__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3788:1: ( rule__VAttribute__Group__14__Impl rule__VAttribute__Group__15 )
            // InternalVmsc.g:3789:2: rule__VAttribute__Group__14__Impl rule__VAttribute__Group__15
            {
            pushFollow(FOLLOW_26);
            rule__VAttribute__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VAttribute__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group__14"


    // $ANTLR start "rule__VAttribute__Group__14__Impl"
    // InternalVmsc.g:3796:1: rule__VAttribute__Group__14__Impl : ( ( rule__VAttribute__IsUniqueAssignment_14 )? ) ;
    public final void rule__VAttribute__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3800:1: ( ( ( rule__VAttribute__IsUniqueAssignment_14 )? ) )
            // InternalVmsc.g:3801:1: ( ( rule__VAttribute__IsUniqueAssignment_14 )? )
            {
            // InternalVmsc.g:3801:1: ( ( rule__VAttribute__IsUniqueAssignment_14 )? )
            // InternalVmsc.g:3802:2: ( rule__VAttribute__IsUniqueAssignment_14 )?
            {
             before(grammarAccess.getVAttributeAccess().getIsUniqueAssignment_14()); 
            // InternalVmsc.g:3803:2: ( rule__VAttribute__IsUniqueAssignment_14 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==50) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalVmsc.g:3803:3: rule__VAttribute__IsUniqueAssignment_14
                    {
                    pushFollow(FOLLOW_2);
                    rule__VAttribute__IsUniqueAssignment_14();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVAttributeAccess().getIsUniqueAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group__14__Impl"


    // $ANTLR start "rule__VAttribute__Group__15"
    // InternalVmsc.g:3811:1: rule__VAttribute__Group__15 : rule__VAttribute__Group__15__Impl rule__VAttribute__Group__16 ;
    public final void rule__VAttribute__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3815:1: ( rule__VAttribute__Group__15__Impl rule__VAttribute__Group__16 )
            // InternalVmsc.g:3816:2: rule__VAttribute__Group__15__Impl rule__VAttribute__Group__16
            {
            pushFollow(FOLLOW_26);
            rule__VAttribute__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VAttribute__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group__15"


    // $ANTLR start "rule__VAttribute__Group__15__Impl"
    // InternalVmsc.g:3823:1: rule__VAttribute__Group__15__Impl : ( ( rule__VAttribute__Group_15__0 )? ) ;
    public final void rule__VAttribute__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3827:1: ( ( ( rule__VAttribute__Group_15__0 )? ) )
            // InternalVmsc.g:3828:1: ( ( rule__VAttribute__Group_15__0 )? )
            {
            // InternalVmsc.g:3828:1: ( ( rule__VAttribute__Group_15__0 )? )
            // InternalVmsc.g:3829:2: ( rule__VAttribute__Group_15__0 )?
            {
             before(grammarAccess.getVAttributeAccess().getGroup_15()); 
            // InternalVmsc.g:3830:2: ( rule__VAttribute__Group_15__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==32) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalVmsc.g:3830:3: rule__VAttribute__Group_15__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VAttribute__Group_15__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVAttributeAccess().getGroup_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group__15__Impl"


    // $ANTLR start "rule__VAttribute__Group__16"
    // InternalVmsc.g:3838:1: rule__VAttribute__Group__16 : rule__VAttribute__Group__16__Impl rule__VAttribute__Group__17 ;
    public final void rule__VAttribute__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3842:1: ( rule__VAttribute__Group__16__Impl rule__VAttribute__Group__17 )
            // InternalVmsc.g:3843:2: rule__VAttribute__Group__16__Impl rule__VAttribute__Group__17
            {
            pushFollow(FOLLOW_26);
            rule__VAttribute__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VAttribute__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group__16"


    // $ANTLR start "rule__VAttribute__Group__16__Impl"
    // InternalVmsc.g:3850:1: rule__VAttribute__Group__16__Impl : ( ( rule__VAttribute__Group_16__0 )? ) ;
    public final void rule__VAttribute__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3854:1: ( ( ( rule__VAttribute__Group_16__0 )? ) )
            // InternalVmsc.g:3855:1: ( ( rule__VAttribute__Group_16__0 )? )
            {
            // InternalVmsc.g:3855:1: ( ( rule__VAttribute__Group_16__0 )? )
            // InternalVmsc.g:3856:2: ( rule__VAttribute__Group_16__0 )?
            {
             before(grammarAccess.getVAttributeAccess().getGroup_16()); 
            // InternalVmsc.g:3857:2: ( rule__VAttribute__Group_16__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==33) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalVmsc.g:3857:3: rule__VAttribute__Group_16__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VAttribute__Group_16__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVAttributeAccess().getGroup_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group__16__Impl"


    // $ANTLR start "rule__VAttribute__Group__17"
    // InternalVmsc.g:3865:1: rule__VAttribute__Group__17 : rule__VAttribute__Group__17__Impl rule__VAttribute__Group__18 ;
    public final void rule__VAttribute__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3869:1: ( rule__VAttribute__Group__17__Impl rule__VAttribute__Group__18 )
            // InternalVmsc.g:3870:2: rule__VAttribute__Group__17__Impl rule__VAttribute__Group__18
            {
            pushFollow(FOLLOW_26);
            rule__VAttribute__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VAttribute__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group__17"


    // $ANTLR start "rule__VAttribute__Group__17__Impl"
    // InternalVmsc.g:3877:1: rule__VAttribute__Group__17__Impl : ( ( rule__VAttribute__Group_17__0 )? ) ;
    public final void rule__VAttribute__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3881:1: ( ( ( rule__VAttribute__Group_17__0 )? ) )
            // InternalVmsc.g:3882:1: ( ( rule__VAttribute__Group_17__0 )? )
            {
            // InternalVmsc.g:3882:1: ( ( rule__VAttribute__Group_17__0 )? )
            // InternalVmsc.g:3883:2: ( rule__VAttribute__Group_17__0 )?
            {
             before(grammarAccess.getVAttributeAccess().getGroup_17()); 
            // InternalVmsc.g:3884:2: ( rule__VAttribute__Group_17__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalVmsc.g:3884:3: rule__VAttribute__Group_17__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VAttribute__Group_17__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVAttributeAccess().getGroup_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group__17__Impl"


    // $ANTLR start "rule__VAttribute__Group__18"
    // InternalVmsc.g:3892:1: rule__VAttribute__Group__18 : rule__VAttribute__Group__18__Impl ;
    public final void rule__VAttribute__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3896:1: ( rule__VAttribute__Group__18__Impl )
            // InternalVmsc.g:3897:2: rule__VAttribute__Group__18__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VAttribute__Group__18__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group__18"


    // $ANTLR start "rule__VAttribute__Group__18__Impl"
    // InternalVmsc.g:3903:1: rule__VAttribute__Group__18__Impl : ( '}' ) ;
    public final void rule__VAttribute__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3907:1: ( ( '}' ) )
            // InternalVmsc.g:3908:1: ( '}' )
            {
            // InternalVmsc.g:3908:1: ( '}' )
            // InternalVmsc.g:3909:2: '}'
            {
             before(grammarAccess.getVAttributeAccess().getRightCurlyBracketKeyword_18()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getVAttributeAccess().getRightCurlyBracketKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group__18__Impl"


    // $ANTLR start "rule__VAttribute__Group_15__0"
    // InternalVmsc.g:3919:1: rule__VAttribute__Group_15__0 : rule__VAttribute__Group_15__0__Impl rule__VAttribute__Group_15__1 ;
    public final void rule__VAttribute__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3923:1: ( rule__VAttribute__Group_15__0__Impl rule__VAttribute__Group_15__1 )
            // InternalVmsc.g:3924:2: rule__VAttribute__Group_15__0__Impl rule__VAttribute__Group_15__1
            {
            pushFollow(FOLLOW_4);
            rule__VAttribute__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VAttribute__Group_15__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group_15__0"


    // $ANTLR start "rule__VAttribute__Group_15__0__Impl"
    // InternalVmsc.g:3931:1: rule__VAttribute__Group_15__0__Impl : ( 'LowerBound' ) ;
    public final void rule__VAttribute__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3935:1: ( ( 'LowerBound' ) )
            // InternalVmsc.g:3936:1: ( 'LowerBound' )
            {
            // InternalVmsc.g:3936:1: ( 'LowerBound' )
            // InternalVmsc.g:3937:2: 'LowerBound'
            {
             before(grammarAccess.getVAttributeAccess().getLowerBoundKeyword_15_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getVAttributeAccess().getLowerBoundKeyword_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group_15__0__Impl"


    // $ANTLR start "rule__VAttribute__Group_15__1"
    // InternalVmsc.g:3946:1: rule__VAttribute__Group_15__1 : rule__VAttribute__Group_15__1__Impl rule__VAttribute__Group_15__2 ;
    public final void rule__VAttribute__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3950:1: ( rule__VAttribute__Group_15__1__Impl rule__VAttribute__Group_15__2 )
            // InternalVmsc.g:3951:2: rule__VAttribute__Group_15__1__Impl rule__VAttribute__Group_15__2
            {
            pushFollow(FOLLOW_27);
            rule__VAttribute__Group_15__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VAttribute__Group_15__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group_15__1"


    // $ANTLR start "rule__VAttribute__Group_15__1__Impl"
    // InternalVmsc.g:3958:1: rule__VAttribute__Group_15__1__Impl : ( ':' ) ;
    public final void rule__VAttribute__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3962:1: ( ( ':' ) )
            // InternalVmsc.g:3963:1: ( ':' )
            {
            // InternalVmsc.g:3963:1: ( ':' )
            // InternalVmsc.g:3964:2: ':'
            {
             before(grammarAccess.getVAttributeAccess().getColonKeyword_15_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVAttributeAccess().getColonKeyword_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group_15__1__Impl"


    // $ANTLR start "rule__VAttribute__Group_15__2"
    // InternalVmsc.g:3973:1: rule__VAttribute__Group_15__2 : rule__VAttribute__Group_15__2__Impl rule__VAttribute__Group_15__3 ;
    public final void rule__VAttribute__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3977:1: ( rule__VAttribute__Group_15__2__Impl rule__VAttribute__Group_15__3 )
            // InternalVmsc.g:3978:2: rule__VAttribute__Group_15__2__Impl rule__VAttribute__Group_15__3
            {
            pushFollow(FOLLOW_12);
            rule__VAttribute__Group_15__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VAttribute__Group_15__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group_15__2"


    // $ANTLR start "rule__VAttribute__Group_15__2__Impl"
    // InternalVmsc.g:3985:1: rule__VAttribute__Group_15__2__Impl : ( ( rule__VAttribute__LowerBoundAssignment_15_2 ) ) ;
    public final void rule__VAttribute__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:3989:1: ( ( ( rule__VAttribute__LowerBoundAssignment_15_2 ) ) )
            // InternalVmsc.g:3990:1: ( ( rule__VAttribute__LowerBoundAssignment_15_2 ) )
            {
            // InternalVmsc.g:3990:1: ( ( rule__VAttribute__LowerBoundAssignment_15_2 ) )
            // InternalVmsc.g:3991:2: ( rule__VAttribute__LowerBoundAssignment_15_2 )
            {
             before(grammarAccess.getVAttributeAccess().getLowerBoundAssignment_15_2()); 
            // InternalVmsc.g:3992:2: ( rule__VAttribute__LowerBoundAssignment_15_2 )
            // InternalVmsc.g:3992:3: rule__VAttribute__LowerBoundAssignment_15_2
            {
            pushFollow(FOLLOW_2);
            rule__VAttribute__LowerBoundAssignment_15_2();

            state._fsp--;


            }

             after(grammarAccess.getVAttributeAccess().getLowerBoundAssignment_15_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group_15__2__Impl"


    // $ANTLR start "rule__VAttribute__Group_15__3"
    // InternalVmsc.g:4000:1: rule__VAttribute__Group_15__3 : rule__VAttribute__Group_15__3__Impl ;
    public final void rule__VAttribute__Group_15__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4004:1: ( rule__VAttribute__Group_15__3__Impl )
            // InternalVmsc.g:4005:2: rule__VAttribute__Group_15__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VAttribute__Group_15__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group_15__3"


    // $ANTLR start "rule__VAttribute__Group_15__3__Impl"
    // InternalVmsc.g:4011:1: rule__VAttribute__Group_15__3__Impl : ( ',' ) ;
    public final void rule__VAttribute__Group_15__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4015:1: ( ( ',' ) )
            // InternalVmsc.g:4016:1: ( ',' )
            {
            // InternalVmsc.g:4016:1: ( ',' )
            // InternalVmsc.g:4017:2: ','
            {
             before(grammarAccess.getVAttributeAccess().getCommaKeyword_15_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getVAttributeAccess().getCommaKeyword_15_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group_15__3__Impl"


    // $ANTLR start "rule__VAttribute__Group_16__0"
    // InternalVmsc.g:4027:1: rule__VAttribute__Group_16__0 : rule__VAttribute__Group_16__0__Impl rule__VAttribute__Group_16__1 ;
    public final void rule__VAttribute__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4031:1: ( rule__VAttribute__Group_16__0__Impl rule__VAttribute__Group_16__1 )
            // InternalVmsc.g:4032:2: rule__VAttribute__Group_16__0__Impl rule__VAttribute__Group_16__1
            {
            pushFollow(FOLLOW_4);
            rule__VAttribute__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VAttribute__Group_16__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group_16__0"


    // $ANTLR start "rule__VAttribute__Group_16__0__Impl"
    // InternalVmsc.g:4039:1: rule__VAttribute__Group_16__0__Impl : ( 'UpperBound' ) ;
    public final void rule__VAttribute__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4043:1: ( ( 'UpperBound' ) )
            // InternalVmsc.g:4044:1: ( 'UpperBound' )
            {
            // InternalVmsc.g:4044:1: ( 'UpperBound' )
            // InternalVmsc.g:4045:2: 'UpperBound'
            {
             before(grammarAccess.getVAttributeAccess().getUpperBoundKeyword_16_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getVAttributeAccess().getUpperBoundKeyword_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group_16__0__Impl"


    // $ANTLR start "rule__VAttribute__Group_16__1"
    // InternalVmsc.g:4054:1: rule__VAttribute__Group_16__1 : rule__VAttribute__Group_16__1__Impl rule__VAttribute__Group_16__2 ;
    public final void rule__VAttribute__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4058:1: ( rule__VAttribute__Group_16__1__Impl rule__VAttribute__Group_16__2 )
            // InternalVmsc.g:4059:2: rule__VAttribute__Group_16__1__Impl rule__VAttribute__Group_16__2
            {
            pushFollow(FOLLOW_27);
            rule__VAttribute__Group_16__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VAttribute__Group_16__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group_16__1"


    // $ANTLR start "rule__VAttribute__Group_16__1__Impl"
    // InternalVmsc.g:4066:1: rule__VAttribute__Group_16__1__Impl : ( ':' ) ;
    public final void rule__VAttribute__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4070:1: ( ( ':' ) )
            // InternalVmsc.g:4071:1: ( ':' )
            {
            // InternalVmsc.g:4071:1: ( ':' )
            // InternalVmsc.g:4072:2: ':'
            {
             before(grammarAccess.getVAttributeAccess().getColonKeyword_16_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVAttributeAccess().getColonKeyword_16_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group_16__1__Impl"


    // $ANTLR start "rule__VAttribute__Group_16__2"
    // InternalVmsc.g:4081:1: rule__VAttribute__Group_16__2 : rule__VAttribute__Group_16__2__Impl rule__VAttribute__Group_16__3 ;
    public final void rule__VAttribute__Group_16__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4085:1: ( rule__VAttribute__Group_16__2__Impl rule__VAttribute__Group_16__3 )
            // InternalVmsc.g:4086:2: rule__VAttribute__Group_16__2__Impl rule__VAttribute__Group_16__3
            {
            pushFollow(FOLLOW_12);
            rule__VAttribute__Group_16__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VAttribute__Group_16__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group_16__2"


    // $ANTLR start "rule__VAttribute__Group_16__2__Impl"
    // InternalVmsc.g:4093:1: rule__VAttribute__Group_16__2__Impl : ( ( rule__VAttribute__UpperBoundAssignment_16_2 ) ) ;
    public final void rule__VAttribute__Group_16__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4097:1: ( ( ( rule__VAttribute__UpperBoundAssignment_16_2 ) ) )
            // InternalVmsc.g:4098:1: ( ( rule__VAttribute__UpperBoundAssignment_16_2 ) )
            {
            // InternalVmsc.g:4098:1: ( ( rule__VAttribute__UpperBoundAssignment_16_2 ) )
            // InternalVmsc.g:4099:2: ( rule__VAttribute__UpperBoundAssignment_16_2 )
            {
             before(grammarAccess.getVAttributeAccess().getUpperBoundAssignment_16_2()); 
            // InternalVmsc.g:4100:2: ( rule__VAttribute__UpperBoundAssignment_16_2 )
            // InternalVmsc.g:4100:3: rule__VAttribute__UpperBoundAssignment_16_2
            {
            pushFollow(FOLLOW_2);
            rule__VAttribute__UpperBoundAssignment_16_2();

            state._fsp--;


            }

             after(grammarAccess.getVAttributeAccess().getUpperBoundAssignment_16_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group_16__2__Impl"


    // $ANTLR start "rule__VAttribute__Group_16__3"
    // InternalVmsc.g:4108:1: rule__VAttribute__Group_16__3 : rule__VAttribute__Group_16__3__Impl ;
    public final void rule__VAttribute__Group_16__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4112:1: ( rule__VAttribute__Group_16__3__Impl )
            // InternalVmsc.g:4113:2: rule__VAttribute__Group_16__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VAttribute__Group_16__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group_16__3"


    // $ANTLR start "rule__VAttribute__Group_16__3__Impl"
    // InternalVmsc.g:4119:1: rule__VAttribute__Group_16__3__Impl : ( ',' ) ;
    public final void rule__VAttribute__Group_16__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4123:1: ( ( ',' ) )
            // InternalVmsc.g:4124:1: ( ',' )
            {
            // InternalVmsc.g:4124:1: ( ',' )
            // InternalVmsc.g:4125:2: ','
            {
             before(grammarAccess.getVAttributeAccess().getCommaKeyword_16_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getVAttributeAccess().getCommaKeyword_16_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group_16__3__Impl"


    // $ANTLR start "rule__VAttribute__Group_17__0"
    // InternalVmsc.g:4135:1: rule__VAttribute__Group_17__0 : rule__VAttribute__Group_17__0__Impl rule__VAttribute__Group_17__1 ;
    public final void rule__VAttribute__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4139:1: ( rule__VAttribute__Group_17__0__Impl rule__VAttribute__Group_17__1 )
            // InternalVmsc.g:4140:2: rule__VAttribute__Group_17__0__Impl rule__VAttribute__Group_17__1
            {
            pushFollow(FOLLOW_4);
            rule__VAttribute__Group_17__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VAttribute__Group_17__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group_17__0"


    // $ANTLR start "rule__VAttribute__Group_17__0__Impl"
    // InternalVmsc.g:4147:1: rule__VAttribute__Group_17__0__Impl : ( 'VType' ) ;
    public final void rule__VAttribute__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4151:1: ( ( 'VType' ) )
            // InternalVmsc.g:4152:1: ( 'VType' )
            {
            // InternalVmsc.g:4152:1: ( 'VType' )
            // InternalVmsc.g:4153:2: 'VType'
            {
             before(grammarAccess.getVAttributeAccess().getVTypeKeyword_17_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getVAttributeAccess().getVTypeKeyword_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group_17__0__Impl"


    // $ANTLR start "rule__VAttribute__Group_17__1"
    // InternalVmsc.g:4162:1: rule__VAttribute__Group_17__1 : rule__VAttribute__Group_17__1__Impl rule__VAttribute__Group_17__2 ;
    public final void rule__VAttribute__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4166:1: ( rule__VAttribute__Group_17__1__Impl rule__VAttribute__Group_17__2 )
            // InternalVmsc.g:4167:2: rule__VAttribute__Group_17__1__Impl rule__VAttribute__Group_17__2
            {
            pushFollow(FOLLOW_28);
            rule__VAttribute__Group_17__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VAttribute__Group_17__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group_17__1"


    // $ANTLR start "rule__VAttribute__Group_17__1__Impl"
    // InternalVmsc.g:4174:1: rule__VAttribute__Group_17__1__Impl : ( ':' ) ;
    public final void rule__VAttribute__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4178:1: ( ( ':' ) )
            // InternalVmsc.g:4179:1: ( ':' )
            {
            // InternalVmsc.g:4179:1: ( ':' )
            // InternalVmsc.g:4180:2: ':'
            {
             before(grammarAccess.getVAttributeAccess().getColonKeyword_17_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVAttributeAccess().getColonKeyword_17_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group_17__1__Impl"


    // $ANTLR start "rule__VAttribute__Group_17__2"
    // InternalVmsc.g:4189:1: rule__VAttribute__Group_17__2 : rule__VAttribute__Group_17__2__Impl ;
    public final void rule__VAttribute__Group_17__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4193:1: ( rule__VAttribute__Group_17__2__Impl )
            // InternalVmsc.g:4194:2: rule__VAttribute__Group_17__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VAttribute__Group_17__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group_17__2"


    // $ANTLR start "rule__VAttribute__Group_17__2__Impl"
    // InternalVmsc.g:4200:1: rule__VAttribute__Group_17__2__Impl : ( ( rule__VAttribute__VTypeAssignment_17_2 ) ) ;
    public final void rule__VAttribute__Group_17__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4204:1: ( ( ( rule__VAttribute__VTypeAssignment_17_2 ) ) )
            // InternalVmsc.g:4205:1: ( ( rule__VAttribute__VTypeAssignment_17_2 ) )
            {
            // InternalVmsc.g:4205:1: ( ( rule__VAttribute__VTypeAssignment_17_2 ) )
            // InternalVmsc.g:4206:2: ( rule__VAttribute__VTypeAssignment_17_2 )
            {
             before(grammarAccess.getVAttributeAccess().getVTypeAssignment_17_2()); 
            // InternalVmsc.g:4207:2: ( rule__VAttribute__VTypeAssignment_17_2 )
            // InternalVmsc.g:4207:3: rule__VAttribute__VTypeAssignment_17_2
            {
            pushFollow(FOLLOW_2);
            rule__VAttribute__VTypeAssignment_17_2();

            state._fsp--;


            }

             after(grammarAccess.getVAttributeAccess().getVTypeAssignment_17_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__Group_17__2__Impl"


    // $ANTLR start "rule__VReference__Group__0"
    // InternalVmsc.g:4216:1: rule__VReference__Group__0 : rule__VReference__Group__0__Impl rule__VReference__Group__1 ;
    public final void rule__VReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4220:1: ( rule__VReference__Group__0__Impl rule__VReference__Group__1 )
            // InternalVmsc.g:4221:2: rule__VReference__Group__0__Impl rule__VReference__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__VReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group__0"


    // $ANTLR start "rule__VReference__Group__0__Impl"
    // InternalVmsc.g:4228:1: rule__VReference__Group__0__Impl : ( () ) ;
    public final void rule__VReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4232:1: ( ( () ) )
            // InternalVmsc.g:4233:1: ( () )
            {
            // InternalVmsc.g:4233:1: ( () )
            // InternalVmsc.g:4234:2: ()
            {
             before(grammarAccess.getVReferenceAccess().getVReferenceAction_0()); 
            // InternalVmsc.g:4235:2: ()
            // InternalVmsc.g:4235:3: 
            {
            }

             after(grammarAccess.getVReferenceAccess().getVReferenceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group__0__Impl"


    // $ANTLR start "rule__VReference__Group__1"
    // InternalVmsc.g:4243:1: rule__VReference__Group__1 : rule__VReference__Group__1__Impl rule__VReference__Group__2 ;
    public final void rule__VReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4247:1: ( rule__VReference__Group__1__Impl rule__VReference__Group__2 )
            // InternalVmsc.g:4248:2: rule__VReference__Group__1__Impl rule__VReference__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__VReference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group__1"


    // $ANTLR start "rule__VReference__Group__1__Impl"
    // InternalVmsc.g:4255:1: rule__VReference__Group__1__Impl : ( 'VReference' ) ;
    public final void rule__VReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4259:1: ( ( 'VReference' ) )
            // InternalVmsc.g:4260:1: ( 'VReference' )
            {
            // InternalVmsc.g:4260:1: ( 'VReference' )
            // InternalVmsc.g:4261:2: 'VReference'
            {
             before(grammarAccess.getVReferenceAccess().getVReferenceKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getVReferenceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group__1__Impl"


    // $ANTLR start "rule__VReference__Group__2"
    // InternalVmsc.g:4270:1: rule__VReference__Group__2 : rule__VReference__Group__2__Impl rule__VReference__Group__3 ;
    public final void rule__VReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4274:1: ( rule__VReference__Group__2__Impl rule__VReference__Group__3 )
            // InternalVmsc.g:4275:2: rule__VReference__Group__2__Impl rule__VReference__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__VReference__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group__2"


    // $ANTLR start "rule__VReference__Group__2__Impl"
    // InternalVmsc.g:4282:1: rule__VReference__Group__2__Impl : ( ':' ) ;
    public final void rule__VReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4286:1: ( ( ':' ) )
            // InternalVmsc.g:4287:1: ( ':' )
            {
            // InternalVmsc.g:4287:1: ( ':' )
            // InternalVmsc.g:4288:2: ':'
            {
             before(grammarAccess.getVReferenceAccess().getColonKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group__2__Impl"


    // $ANTLR start "rule__VReference__Group__3"
    // InternalVmsc.g:4297:1: rule__VReference__Group__3 : rule__VReference__Group__3__Impl rule__VReference__Group__4 ;
    public final void rule__VReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4301:1: ( rule__VReference__Group__3__Impl rule__VReference__Group__4 )
            // InternalVmsc.g:4302:2: rule__VReference__Group__3__Impl rule__VReference__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__VReference__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group__3"


    // $ANTLR start "rule__VReference__Group__3__Impl"
    // InternalVmsc.g:4309:1: rule__VReference__Group__3__Impl : ( '{' ) ;
    public final void rule__VReference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4313:1: ( ( '{' ) )
            // InternalVmsc.g:4314:1: ( '{' )
            {
            // InternalVmsc.g:4314:1: ( '{' )
            // InternalVmsc.g:4315:2: '{'
            {
             before(grammarAccess.getVReferenceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group__3__Impl"


    // $ANTLR start "rule__VReference__Group__4"
    // InternalVmsc.g:4324:1: rule__VReference__Group__4 : rule__VReference__Group__4__Impl rule__VReference__Group__5 ;
    public final void rule__VReference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4328:1: ( rule__VReference__Group__4__Impl rule__VReference__Group__5 )
            // InternalVmsc.g:4329:2: rule__VReference__Group__4__Impl rule__VReference__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__VReference__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group__4"


    // $ANTLR start "rule__VReference__Group__4__Impl"
    // InternalVmsc.g:4336:1: rule__VReference__Group__4__Impl : ( 'name' ) ;
    public final void rule__VReference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4340:1: ( ( 'name' ) )
            // InternalVmsc.g:4341:1: ( 'name' )
            {
            // InternalVmsc.g:4341:1: ( 'name' )
            // InternalVmsc.g:4342:2: 'name'
            {
             before(grammarAccess.getVReferenceAccess().getNameKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getNameKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group__4__Impl"


    // $ANTLR start "rule__VReference__Group__5"
    // InternalVmsc.g:4351:1: rule__VReference__Group__5 : rule__VReference__Group__5__Impl rule__VReference__Group__6 ;
    public final void rule__VReference__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4355:1: ( rule__VReference__Group__5__Impl rule__VReference__Group__6 )
            // InternalVmsc.g:4356:2: rule__VReference__Group__5__Impl rule__VReference__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__VReference__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group__5"


    // $ANTLR start "rule__VReference__Group__5__Impl"
    // InternalVmsc.g:4363:1: rule__VReference__Group__5__Impl : ( ':' ) ;
    public final void rule__VReference__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4367:1: ( ( ':' ) )
            // InternalVmsc.g:4368:1: ( ':' )
            {
            // InternalVmsc.g:4368:1: ( ':' )
            // InternalVmsc.g:4369:2: ':'
            {
             before(grammarAccess.getVReferenceAccess().getColonKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group__5__Impl"


    // $ANTLR start "rule__VReference__Group__6"
    // InternalVmsc.g:4378:1: rule__VReference__Group__6 : rule__VReference__Group__6__Impl rule__VReference__Group__7 ;
    public final void rule__VReference__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4382:1: ( rule__VReference__Group__6__Impl rule__VReference__Group__7 )
            // InternalVmsc.g:4383:2: rule__VReference__Group__6__Impl rule__VReference__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__VReference__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group__6"


    // $ANTLR start "rule__VReference__Group__6__Impl"
    // InternalVmsc.g:4390:1: rule__VReference__Group__6__Impl : ( ( rule__VReference__NameAssignment_6 ) ) ;
    public final void rule__VReference__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4394:1: ( ( ( rule__VReference__NameAssignment_6 ) ) )
            // InternalVmsc.g:4395:1: ( ( rule__VReference__NameAssignment_6 ) )
            {
            // InternalVmsc.g:4395:1: ( ( rule__VReference__NameAssignment_6 ) )
            // InternalVmsc.g:4396:2: ( rule__VReference__NameAssignment_6 )
            {
             before(grammarAccess.getVReferenceAccess().getNameAssignment_6()); 
            // InternalVmsc.g:4397:2: ( rule__VReference__NameAssignment_6 )
            // InternalVmsc.g:4397:3: rule__VReference__NameAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__VReference__NameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getVReferenceAccess().getNameAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group__6__Impl"


    // $ANTLR start "rule__VReference__Group__7"
    // InternalVmsc.g:4405:1: rule__VReference__Group__7 : rule__VReference__Group__7__Impl rule__VReference__Group__8 ;
    public final void rule__VReference__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4409:1: ( rule__VReference__Group__7__Impl rule__VReference__Group__8 )
            // InternalVmsc.g:4410:2: rule__VReference__Group__7__Impl rule__VReference__Group__8
            {
            pushFollow(FOLLOW_29);
            rule__VReference__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group__7"


    // $ANTLR start "rule__VReference__Group__7__Impl"
    // InternalVmsc.g:4417:1: rule__VReference__Group__7__Impl : ( ',' ) ;
    public final void rule__VReference__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4421:1: ( ( ',' ) )
            // InternalVmsc.g:4422:1: ( ',' )
            {
            // InternalVmsc.g:4422:1: ( ',' )
            // InternalVmsc.g:4423:2: ','
            {
             before(grammarAccess.getVReferenceAccess().getCommaKeyword_7()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group__7__Impl"


    // $ANTLR start "rule__VReference__Group__8"
    // InternalVmsc.g:4432:1: rule__VReference__Group__8 : rule__VReference__Group__8__Impl rule__VReference__Group__9 ;
    public final void rule__VReference__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4436:1: ( rule__VReference__Group__8__Impl rule__VReference__Group__9 )
            // InternalVmsc.g:4437:2: rule__VReference__Group__8__Impl rule__VReference__Group__9
            {
            pushFollow(FOLLOW_29);
            rule__VReference__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group__8"


    // $ANTLR start "rule__VReference__Group__8__Impl"
    // InternalVmsc.g:4444:1: rule__VReference__Group__8__Impl : ( ( rule__VReference__Group_8__0 )? ) ;
    public final void rule__VReference__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4448:1: ( ( ( rule__VReference__Group_8__0 )? ) )
            // InternalVmsc.g:4449:1: ( ( rule__VReference__Group_8__0 )? )
            {
            // InternalVmsc.g:4449:1: ( ( rule__VReference__Group_8__0 )? )
            // InternalVmsc.g:4450:2: ( rule__VReference__Group_8__0 )?
            {
             before(grammarAccess.getVReferenceAccess().getGroup_8()); 
            // InternalVmsc.g:4451:2: ( rule__VReference__Group_8__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==44) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalVmsc.g:4451:3: rule__VReference__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VReference__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVReferenceAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group__8__Impl"


    // $ANTLR start "rule__VReference__Group__9"
    // InternalVmsc.g:4459:1: rule__VReference__Group__9 : rule__VReference__Group__9__Impl rule__VReference__Group__10 ;
    public final void rule__VReference__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4463:1: ( rule__VReference__Group__9__Impl rule__VReference__Group__10 )
            // InternalVmsc.g:4464:2: rule__VReference__Group__9__Impl rule__VReference__Group__10
            {
            pushFollow(FOLLOW_29);
            rule__VReference__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group__9"


    // $ANTLR start "rule__VReference__Group__9__Impl"
    // InternalVmsc.g:4471:1: rule__VReference__Group__9__Impl : ( ( rule__VReference__Group_9__0 )? ) ;
    public final void rule__VReference__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4475:1: ( ( ( rule__VReference__Group_9__0 )? ) )
            // InternalVmsc.g:4476:1: ( ( rule__VReference__Group_9__0 )? )
            {
            // InternalVmsc.g:4476:1: ( ( rule__VReference__Group_9__0 )? )
            // InternalVmsc.g:4477:2: ( rule__VReference__Group_9__0 )?
            {
             before(grammarAccess.getVReferenceAccess().getGroup_9()); 
            // InternalVmsc.g:4478:2: ( rule__VReference__Group_9__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==45) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalVmsc.g:4478:3: rule__VReference__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VReference__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVReferenceAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group__9__Impl"


    // $ANTLR start "rule__VReference__Group__10"
    // InternalVmsc.g:4486:1: rule__VReference__Group__10 : rule__VReference__Group__10__Impl rule__VReference__Group__11 ;
    public final void rule__VReference__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4490:1: ( rule__VReference__Group__10__Impl rule__VReference__Group__11 )
            // InternalVmsc.g:4491:2: rule__VReference__Group__10__Impl rule__VReference__Group__11
            {
            pushFollow(FOLLOW_29);
            rule__VReference__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group__10"


    // $ANTLR start "rule__VReference__Group__10__Impl"
    // InternalVmsc.g:4498:1: rule__VReference__Group__10__Impl : ( ( rule__VReference__Group_10__0 )? ) ;
    public final void rule__VReference__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4502:1: ( ( ( rule__VReference__Group_10__0 )? ) )
            // InternalVmsc.g:4503:1: ( ( rule__VReference__Group_10__0 )? )
            {
            // InternalVmsc.g:4503:1: ( ( rule__VReference__Group_10__0 )? )
            // InternalVmsc.g:4504:2: ( rule__VReference__Group_10__0 )?
            {
             before(grammarAccess.getVReferenceAccess().getGroup_10()); 
            // InternalVmsc.g:4505:2: ( rule__VReference__Group_10__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==46) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalVmsc.g:4505:3: rule__VReference__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VReference__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVReferenceAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group__10__Impl"


    // $ANTLR start "rule__VReference__Group__11"
    // InternalVmsc.g:4513:1: rule__VReference__Group__11 : rule__VReference__Group__11__Impl rule__VReference__Group__12 ;
    public final void rule__VReference__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4517:1: ( rule__VReference__Group__11__Impl rule__VReference__Group__12 )
            // InternalVmsc.g:4518:2: rule__VReference__Group__11__Impl rule__VReference__Group__12
            {
            pushFollow(FOLLOW_29);
            rule__VReference__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group__11"


    // $ANTLR start "rule__VReference__Group__11__Impl"
    // InternalVmsc.g:4525:1: rule__VReference__Group__11__Impl : ( ( rule__VReference__Group_11__0 )? ) ;
    public final void rule__VReference__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4529:1: ( ( ( rule__VReference__Group_11__0 )? ) )
            // InternalVmsc.g:4530:1: ( ( rule__VReference__Group_11__0 )? )
            {
            // InternalVmsc.g:4530:1: ( ( rule__VReference__Group_11__0 )? )
            // InternalVmsc.g:4531:2: ( rule__VReference__Group_11__0 )?
            {
             before(grammarAccess.getVReferenceAccess().getGroup_11()); 
            // InternalVmsc.g:4532:2: ( rule__VReference__Group_11__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==47) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalVmsc.g:4532:3: rule__VReference__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VReference__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVReferenceAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group__11__Impl"


    // $ANTLR start "rule__VReference__Group__12"
    // InternalVmsc.g:4540:1: rule__VReference__Group__12 : rule__VReference__Group__12__Impl rule__VReference__Group__13 ;
    public final void rule__VReference__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4544:1: ( rule__VReference__Group__12__Impl rule__VReference__Group__13 )
            // InternalVmsc.g:4545:2: rule__VReference__Group__12__Impl rule__VReference__Group__13
            {
            pushFollow(FOLLOW_29);
            rule__VReference__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group__12"


    // $ANTLR start "rule__VReference__Group__12__Impl"
    // InternalVmsc.g:4552:1: rule__VReference__Group__12__Impl : ( ( rule__VReference__Group_12__0 )? ) ;
    public final void rule__VReference__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4556:1: ( ( ( rule__VReference__Group_12__0 )? ) )
            // InternalVmsc.g:4557:1: ( ( rule__VReference__Group_12__0 )? )
            {
            // InternalVmsc.g:4557:1: ( ( rule__VReference__Group_12__0 )? )
            // InternalVmsc.g:4558:2: ( rule__VReference__Group_12__0 )?
            {
             before(grammarAccess.getVReferenceAccess().getGroup_12()); 
            // InternalVmsc.g:4559:2: ( rule__VReference__Group_12__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==48) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalVmsc.g:4559:3: rule__VReference__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VReference__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVReferenceAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group__12__Impl"


    // $ANTLR start "rule__VReference__Group__13"
    // InternalVmsc.g:4567:1: rule__VReference__Group__13 : rule__VReference__Group__13__Impl rule__VReference__Group__14 ;
    public final void rule__VReference__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4571:1: ( rule__VReference__Group__13__Impl rule__VReference__Group__14 )
            // InternalVmsc.g:4572:2: rule__VReference__Group__13__Impl rule__VReference__Group__14
            {
            pushFollow(FOLLOW_29);
            rule__VReference__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group__13"


    // $ANTLR start "rule__VReference__Group__13__Impl"
    // InternalVmsc.g:4579:1: rule__VReference__Group__13__Impl : ( ( rule__VReference__Group_13__0 )? ) ;
    public final void rule__VReference__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4583:1: ( ( ( rule__VReference__Group_13__0 )? ) )
            // InternalVmsc.g:4584:1: ( ( rule__VReference__Group_13__0 )? )
            {
            // InternalVmsc.g:4584:1: ( ( rule__VReference__Group_13__0 )? )
            // InternalVmsc.g:4585:2: ( rule__VReference__Group_13__0 )?
            {
             before(grammarAccess.getVReferenceAccess().getGroup_13()); 
            // InternalVmsc.g:4586:2: ( rule__VReference__Group_13__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==49) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalVmsc.g:4586:3: rule__VReference__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VReference__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVReferenceAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group__13__Impl"


    // $ANTLR start "rule__VReference__Group__14"
    // InternalVmsc.g:4594:1: rule__VReference__Group__14 : rule__VReference__Group__14__Impl rule__VReference__Group__15 ;
    public final void rule__VReference__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4598:1: ( rule__VReference__Group__14__Impl rule__VReference__Group__15 )
            // InternalVmsc.g:4599:2: rule__VReference__Group__14__Impl rule__VReference__Group__15
            {
            pushFollow(FOLLOW_29);
            rule__VReference__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group__14"


    // $ANTLR start "rule__VReference__Group__14__Impl"
    // InternalVmsc.g:4606:1: rule__VReference__Group__14__Impl : ( ( rule__VReference__Group_14__0 )? ) ;
    public final void rule__VReference__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4610:1: ( ( ( rule__VReference__Group_14__0 )? ) )
            // InternalVmsc.g:4611:1: ( ( rule__VReference__Group_14__0 )? )
            {
            // InternalVmsc.g:4611:1: ( ( rule__VReference__Group_14__0 )? )
            // InternalVmsc.g:4612:2: ( rule__VReference__Group_14__0 )?
            {
             before(grammarAccess.getVReferenceAccess().getGroup_14()); 
            // InternalVmsc.g:4613:2: ( rule__VReference__Group_14__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==50) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalVmsc.g:4613:3: rule__VReference__Group_14__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VReference__Group_14__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVReferenceAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group__14__Impl"


    // $ANTLR start "rule__VReference__Group__15"
    // InternalVmsc.g:4621:1: rule__VReference__Group__15 : rule__VReference__Group__15__Impl rule__VReference__Group__16 ;
    public final void rule__VReference__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4625:1: ( rule__VReference__Group__15__Impl rule__VReference__Group__16 )
            // InternalVmsc.g:4626:2: rule__VReference__Group__15__Impl rule__VReference__Group__16
            {
            pushFollow(FOLLOW_29);
            rule__VReference__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group__15"


    // $ANTLR start "rule__VReference__Group__15__Impl"
    // InternalVmsc.g:4633:1: rule__VReference__Group__15__Impl : ( ( rule__VReference__Group_15__0 )? ) ;
    public final void rule__VReference__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4637:1: ( ( ( rule__VReference__Group_15__0 )? ) )
            // InternalVmsc.g:4638:1: ( ( rule__VReference__Group_15__0 )? )
            {
            // InternalVmsc.g:4638:1: ( ( rule__VReference__Group_15__0 )? )
            // InternalVmsc.g:4639:2: ( rule__VReference__Group_15__0 )?
            {
             before(grammarAccess.getVReferenceAccess().getGroup_15()); 
            // InternalVmsc.g:4640:2: ( rule__VReference__Group_15__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==51) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalVmsc.g:4640:3: rule__VReference__Group_15__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VReference__Group_15__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVReferenceAccess().getGroup_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group__15__Impl"


    // $ANTLR start "rule__VReference__Group__16"
    // InternalVmsc.g:4648:1: rule__VReference__Group__16 : rule__VReference__Group__16__Impl rule__VReference__Group__17 ;
    public final void rule__VReference__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4652:1: ( rule__VReference__Group__16__Impl rule__VReference__Group__17 )
            // InternalVmsc.g:4653:2: rule__VReference__Group__16__Impl rule__VReference__Group__17
            {
            pushFollow(FOLLOW_29);
            rule__VReference__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group__16"


    // $ANTLR start "rule__VReference__Group__16__Impl"
    // InternalVmsc.g:4660:1: rule__VReference__Group__16__Impl : ( ( rule__VReference__Group_16__0 )? ) ;
    public final void rule__VReference__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4664:1: ( ( ( rule__VReference__Group_16__0 )? ) )
            // InternalVmsc.g:4665:1: ( ( rule__VReference__Group_16__0 )? )
            {
            // InternalVmsc.g:4665:1: ( ( rule__VReference__Group_16__0 )? )
            // InternalVmsc.g:4666:2: ( rule__VReference__Group_16__0 )?
            {
             before(grammarAccess.getVReferenceAccess().getGroup_16()); 
            // InternalVmsc.g:4667:2: ( rule__VReference__Group_16__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==52) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalVmsc.g:4667:3: rule__VReference__Group_16__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VReference__Group_16__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVReferenceAccess().getGroup_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group__16__Impl"


    // $ANTLR start "rule__VReference__Group__17"
    // InternalVmsc.g:4675:1: rule__VReference__Group__17 : rule__VReference__Group__17__Impl rule__VReference__Group__18 ;
    public final void rule__VReference__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4679:1: ( rule__VReference__Group__17__Impl rule__VReference__Group__18 )
            // InternalVmsc.g:4680:2: rule__VReference__Group__17__Impl rule__VReference__Group__18
            {
            pushFollow(FOLLOW_29);
            rule__VReference__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group__17"


    // $ANTLR start "rule__VReference__Group__17__Impl"
    // InternalVmsc.g:4687:1: rule__VReference__Group__17__Impl : ( ( rule__VReference__Group_17__0 )? ) ;
    public final void rule__VReference__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4691:1: ( ( ( rule__VReference__Group_17__0 )? ) )
            // InternalVmsc.g:4692:1: ( ( rule__VReference__Group_17__0 )? )
            {
            // InternalVmsc.g:4692:1: ( ( rule__VReference__Group_17__0 )? )
            // InternalVmsc.g:4693:2: ( rule__VReference__Group_17__0 )?
            {
             before(grammarAccess.getVReferenceAccess().getGroup_17()); 
            // InternalVmsc.g:4694:2: ( rule__VReference__Group_17__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==32) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalVmsc.g:4694:3: rule__VReference__Group_17__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VReference__Group_17__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVReferenceAccess().getGroup_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group__17__Impl"


    // $ANTLR start "rule__VReference__Group__18"
    // InternalVmsc.g:4702:1: rule__VReference__Group__18 : rule__VReference__Group__18__Impl rule__VReference__Group__19 ;
    public final void rule__VReference__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4706:1: ( rule__VReference__Group__18__Impl rule__VReference__Group__19 )
            // InternalVmsc.g:4707:2: rule__VReference__Group__18__Impl rule__VReference__Group__19
            {
            pushFollow(FOLLOW_29);
            rule__VReference__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group__18"


    // $ANTLR start "rule__VReference__Group__18__Impl"
    // InternalVmsc.g:4714:1: rule__VReference__Group__18__Impl : ( ( rule__VReference__Group_18__0 )? ) ;
    public final void rule__VReference__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4718:1: ( ( ( rule__VReference__Group_18__0 )? ) )
            // InternalVmsc.g:4719:1: ( ( rule__VReference__Group_18__0 )? )
            {
            // InternalVmsc.g:4719:1: ( ( rule__VReference__Group_18__0 )? )
            // InternalVmsc.g:4720:2: ( rule__VReference__Group_18__0 )?
            {
             before(grammarAccess.getVReferenceAccess().getGroup_18()); 
            // InternalVmsc.g:4721:2: ( rule__VReference__Group_18__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==33) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalVmsc.g:4721:3: rule__VReference__Group_18__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VReference__Group_18__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVReferenceAccess().getGroup_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group__18__Impl"


    // $ANTLR start "rule__VReference__Group__19"
    // InternalVmsc.g:4729:1: rule__VReference__Group__19 : rule__VReference__Group__19__Impl rule__VReference__Group__20 ;
    public final void rule__VReference__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4733:1: ( rule__VReference__Group__19__Impl rule__VReference__Group__20 )
            // InternalVmsc.g:4734:2: rule__VReference__Group__19__Impl rule__VReference__Group__20
            {
            pushFollow(FOLLOW_29);
            rule__VReference__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group__19"


    // $ANTLR start "rule__VReference__Group__19__Impl"
    // InternalVmsc.g:4741:1: rule__VReference__Group__19__Impl : ( ( rule__VReference__Group_19__0 )? ) ;
    public final void rule__VReference__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4745:1: ( ( ( rule__VReference__Group_19__0 )? ) )
            // InternalVmsc.g:4746:1: ( ( rule__VReference__Group_19__0 )? )
            {
            // InternalVmsc.g:4746:1: ( ( rule__VReference__Group_19__0 )? )
            // InternalVmsc.g:4747:2: ( rule__VReference__Group_19__0 )?
            {
             before(grammarAccess.getVReferenceAccess().getGroup_19()); 
            // InternalVmsc.g:4748:2: ( rule__VReference__Group_19__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==34) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalVmsc.g:4748:3: rule__VReference__Group_19__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VReference__Group_19__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVReferenceAccess().getGroup_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group__19__Impl"


    // $ANTLR start "rule__VReference__Group__20"
    // InternalVmsc.g:4756:1: rule__VReference__Group__20 : rule__VReference__Group__20__Impl ;
    public final void rule__VReference__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4760:1: ( rule__VReference__Group__20__Impl )
            // InternalVmsc.g:4761:2: rule__VReference__Group__20__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VReference__Group__20__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group__20"


    // $ANTLR start "rule__VReference__Group__20__Impl"
    // InternalVmsc.g:4767:1: rule__VReference__Group__20__Impl : ( '}' ) ;
    public final void rule__VReference__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4771:1: ( ( '}' ) )
            // InternalVmsc.g:4772:1: ( '}' )
            {
            // InternalVmsc.g:4772:1: ( '}' )
            // InternalVmsc.g:4773:2: '}'
            {
             before(grammarAccess.getVReferenceAccess().getRightCurlyBracketKeyword_20()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getRightCurlyBracketKeyword_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group__20__Impl"


    // $ANTLR start "rule__VReference__Group_8__0"
    // InternalVmsc.g:4783:1: rule__VReference__Group_8__0 : rule__VReference__Group_8__0__Impl rule__VReference__Group_8__1 ;
    public final void rule__VReference__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4787:1: ( rule__VReference__Group_8__0__Impl rule__VReference__Group_8__1 )
            // InternalVmsc.g:4788:2: rule__VReference__Group_8__0__Impl rule__VReference__Group_8__1
            {
            pushFollow(FOLLOW_4);
            rule__VReference__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_8__0"


    // $ANTLR start "rule__VReference__Group_8__0__Impl"
    // InternalVmsc.g:4795:1: rule__VReference__Group_8__0__Impl : ( ( rule__VReference__IsChangeableAssignment_8_0 ) ) ;
    public final void rule__VReference__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4799:1: ( ( ( rule__VReference__IsChangeableAssignment_8_0 ) ) )
            // InternalVmsc.g:4800:1: ( ( rule__VReference__IsChangeableAssignment_8_0 ) )
            {
            // InternalVmsc.g:4800:1: ( ( rule__VReference__IsChangeableAssignment_8_0 ) )
            // InternalVmsc.g:4801:2: ( rule__VReference__IsChangeableAssignment_8_0 )
            {
             before(grammarAccess.getVReferenceAccess().getIsChangeableAssignment_8_0()); 
            // InternalVmsc.g:4802:2: ( rule__VReference__IsChangeableAssignment_8_0 )
            // InternalVmsc.g:4802:3: rule__VReference__IsChangeableAssignment_8_0
            {
            pushFollow(FOLLOW_2);
            rule__VReference__IsChangeableAssignment_8_0();

            state._fsp--;


            }

             after(grammarAccess.getVReferenceAccess().getIsChangeableAssignment_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_8__0__Impl"


    // $ANTLR start "rule__VReference__Group_8__1"
    // InternalVmsc.g:4810:1: rule__VReference__Group_8__1 : rule__VReference__Group_8__1__Impl rule__VReference__Group_8__2 ;
    public final void rule__VReference__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4814:1: ( rule__VReference__Group_8__1__Impl rule__VReference__Group_8__2 )
            // InternalVmsc.g:4815:2: rule__VReference__Group_8__1__Impl rule__VReference__Group_8__2
            {
            pushFollow(FOLLOW_20);
            rule__VReference__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_8__1"


    // $ANTLR start "rule__VReference__Group_8__1__Impl"
    // InternalVmsc.g:4822:1: rule__VReference__Group_8__1__Impl : ( ':' ) ;
    public final void rule__VReference__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4826:1: ( ( ':' ) )
            // InternalVmsc.g:4827:1: ( ':' )
            {
            // InternalVmsc.g:4827:1: ( ':' )
            // InternalVmsc.g:4828:2: ':'
            {
             before(grammarAccess.getVReferenceAccess().getColonKeyword_8_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getColonKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_8__1__Impl"


    // $ANTLR start "rule__VReference__Group_8__2"
    // InternalVmsc.g:4837:1: rule__VReference__Group_8__2 : rule__VReference__Group_8__2__Impl rule__VReference__Group_8__3 ;
    public final void rule__VReference__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4841:1: ( rule__VReference__Group_8__2__Impl rule__VReference__Group_8__3 )
            // InternalVmsc.g:4842:2: rule__VReference__Group_8__2__Impl rule__VReference__Group_8__3
            {
            pushFollow(FOLLOW_12);
            rule__VReference__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_8__2"


    // $ANTLR start "rule__VReference__Group_8__2__Impl"
    // InternalVmsc.g:4849:1: rule__VReference__Group_8__2__Impl : ( 'True' ) ;
    public final void rule__VReference__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4853:1: ( ( 'True' ) )
            // InternalVmsc.g:4854:1: ( 'True' )
            {
            // InternalVmsc.g:4854:1: ( 'True' )
            // InternalVmsc.g:4855:2: 'True'
            {
             before(grammarAccess.getVReferenceAccess().getTrueKeyword_8_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getTrueKeyword_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_8__2__Impl"


    // $ANTLR start "rule__VReference__Group_8__3"
    // InternalVmsc.g:4864:1: rule__VReference__Group_8__3 : rule__VReference__Group_8__3__Impl ;
    public final void rule__VReference__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4868:1: ( rule__VReference__Group_8__3__Impl )
            // InternalVmsc.g:4869:2: rule__VReference__Group_8__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VReference__Group_8__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_8__3"


    // $ANTLR start "rule__VReference__Group_8__3__Impl"
    // InternalVmsc.g:4875:1: rule__VReference__Group_8__3__Impl : ( ',' ) ;
    public final void rule__VReference__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4879:1: ( ( ',' ) )
            // InternalVmsc.g:4880:1: ( ',' )
            {
            // InternalVmsc.g:4880:1: ( ',' )
            // InternalVmsc.g:4881:2: ','
            {
             before(grammarAccess.getVReferenceAccess().getCommaKeyword_8_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getCommaKeyword_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_8__3__Impl"


    // $ANTLR start "rule__VReference__Group_9__0"
    // InternalVmsc.g:4891:1: rule__VReference__Group_9__0 : rule__VReference__Group_9__0__Impl rule__VReference__Group_9__1 ;
    public final void rule__VReference__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4895:1: ( rule__VReference__Group_9__0__Impl rule__VReference__Group_9__1 )
            // InternalVmsc.g:4896:2: rule__VReference__Group_9__0__Impl rule__VReference__Group_9__1
            {
            pushFollow(FOLLOW_4);
            rule__VReference__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_9__0"


    // $ANTLR start "rule__VReference__Group_9__0__Impl"
    // InternalVmsc.g:4903:1: rule__VReference__Group_9__0__Impl : ( ( rule__VReference__IsOrderedAssignment_9_0 ) ) ;
    public final void rule__VReference__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4907:1: ( ( ( rule__VReference__IsOrderedAssignment_9_0 ) ) )
            // InternalVmsc.g:4908:1: ( ( rule__VReference__IsOrderedAssignment_9_0 ) )
            {
            // InternalVmsc.g:4908:1: ( ( rule__VReference__IsOrderedAssignment_9_0 ) )
            // InternalVmsc.g:4909:2: ( rule__VReference__IsOrderedAssignment_9_0 )
            {
             before(grammarAccess.getVReferenceAccess().getIsOrderedAssignment_9_0()); 
            // InternalVmsc.g:4910:2: ( rule__VReference__IsOrderedAssignment_9_0 )
            // InternalVmsc.g:4910:3: rule__VReference__IsOrderedAssignment_9_0
            {
            pushFollow(FOLLOW_2);
            rule__VReference__IsOrderedAssignment_9_0();

            state._fsp--;


            }

             after(grammarAccess.getVReferenceAccess().getIsOrderedAssignment_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_9__0__Impl"


    // $ANTLR start "rule__VReference__Group_9__1"
    // InternalVmsc.g:4918:1: rule__VReference__Group_9__1 : rule__VReference__Group_9__1__Impl rule__VReference__Group_9__2 ;
    public final void rule__VReference__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4922:1: ( rule__VReference__Group_9__1__Impl rule__VReference__Group_9__2 )
            // InternalVmsc.g:4923:2: rule__VReference__Group_9__1__Impl rule__VReference__Group_9__2
            {
            pushFollow(FOLLOW_20);
            rule__VReference__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_9__1"


    // $ANTLR start "rule__VReference__Group_9__1__Impl"
    // InternalVmsc.g:4930:1: rule__VReference__Group_9__1__Impl : ( ':' ) ;
    public final void rule__VReference__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4934:1: ( ( ':' ) )
            // InternalVmsc.g:4935:1: ( ':' )
            {
            // InternalVmsc.g:4935:1: ( ':' )
            // InternalVmsc.g:4936:2: ':'
            {
             before(grammarAccess.getVReferenceAccess().getColonKeyword_9_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getColonKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_9__1__Impl"


    // $ANTLR start "rule__VReference__Group_9__2"
    // InternalVmsc.g:4945:1: rule__VReference__Group_9__2 : rule__VReference__Group_9__2__Impl rule__VReference__Group_9__3 ;
    public final void rule__VReference__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4949:1: ( rule__VReference__Group_9__2__Impl rule__VReference__Group_9__3 )
            // InternalVmsc.g:4950:2: rule__VReference__Group_9__2__Impl rule__VReference__Group_9__3
            {
            pushFollow(FOLLOW_12);
            rule__VReference__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_9__2"


    // $ANTLR start "rule__VReference__Group_9__2__Impl"
    // InternalVmsc.g:4957:1: rule__VReference__Group_9__2__Impl : ( 'True' ) ;
    public final void rule__VReference__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4961:1: ( ( 'True' ) )
            // InternalVmsc.g:4962:1: ( 'True' )
            {
            // InternalVmsc.g:4962:1: ( 'True' )
            // InternalVmsc.g:4963:2: 'True'
            {
             before(grammarAccess.getVReferenceAccess().getTrueKeyword_9_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getTrueKeyword_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_9__2__Impl"


    // $ANTLR start "rule__VReference__Group_9__3"
    // InternalVmsc.g:4972:1: rule__VReference__Group_9__3 : rule__VReference__Group_9__3__Impl ;
    public final void rule__VReference__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4976:1: ( rule__VReference__Group_9__3__Impl )
            // InternalVmsc.g:4977:2: rule__VReference__Group_9__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VReference__Group_9__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_9__3"


    // $ANTLR start "rule__VReference__Group_9__3__Impl"
    // InternalVmsc.g:4983:1: rule__VReference__Group_9__3__Impl : ( ',' ) ;
    public final void rule__VReference__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:4987:1: ( ( ',' ) )
            // InternalVmsc.g:4988:1: ( ',' )
            {
            // InternalVmsc.g:4988:1: ( ',' )
            // InternalVmsc.g:4989:2: ','
            {
             before(grammarAccess.getVReferenceAccess().getCommaKeyword_9_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getCommaKeyword_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_9__3__Impl"


    // $ANTLR start "rule__VReference__Group_10__0"
    // InternalVmsc.g:4999:1: rule__VReference__Group_10__0 : rule__VReference__Group_10__0__Impl rule__VReference__Group_10__1 ;
    public final void rule__VReference__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5003:1: ( rule__VReference__Group_10__0__Impl rule__VReference__Group_10__1 )
            // InternalVmsc.g:5004:2: rule__VReference__Group_10__0__Impl rule__VReference__Group_10__1
            {
            pushFollow(FOLLOW_4);
            rule__VReference__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_10__0"


    // $ANTLR start "rule__VReference__Group_10__0__Impl"
    // InternalVmsc.g:5011:1: rule__VReference__Group_10__0__Impl : ( ( rule__VReference__IsTransientAssignment_10_0 ) ) ;
    public final void rule__VReference__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5015:1: ( ( ( rule__VReference__IsTransientAssignment_10_0 ) ) )
            // InternalVmsc.g:5016:1: ( ( rule__VReference__IsTransientAssignment_10_0 ) )
            {
            // InternalVmsc.g:5016:1: ( ( rule__VReference__IsTransientAssignment_10_0 ) )
            // InternalVmsc.g:5017:2: ( rule__VReference__IsTransientAssignment_10_0 )
            {
             before(grammarAccess.getVReferenceAccess().getIsTransientAssignment_10_0()); 
            // InternalVmsc.g:5018:2: ( rule__VReference__IsTransientAssignment_10_0 )
            // InternalVmsc.g:5018:3: rule__VReference__IsTransientAssignment_10_0
            {
            pushFollow(FOLLOW_2);
            rule__VReference__IsTransientAssignment_10_0();

            state._fsp--;


            }

             after(grammarAccess.getVReferenceAccess().getIsTransientAssignment_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_10__0__Impl"


    // $ANTLR start "rule__VReference__Group_10__1"
    // InternalVmsc.g:5026:1: rule__VReference__Group_10__1 : rule__VReference__Group_10__1__Impl rule__VReference__Group_10__2 ;
    public final void rule__VReference__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5030:1: ( rule__VReference__Group_10__1__Impl rule__VReference__Group_10__2 )
            // InternalVmsc.g:5031:2: rule__VReference__Group_10__1__Impl rule__VReference__Group_10__2
            {
            pushFollow(FOLLOW_20);
            rule__VReference__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_10__1"


    // $ANTLR start "rule__VReference__Group_10__1__Impl"
    // InternalVmsc.g:5038:1: rule__VReference__Group_10__1__Impl : ( ':' ) ;
    public final void rule__VReference__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5042:1: ( ( ':' ) )
            // InternalVmsc.g:5043:1: ( ':' )
            {
            // InternalVmsc.g:5043:1: ( ':' )
            // InternalVmsc.g:5044:2: ':'
            {
             before(grammarAccess.getVReferenceAccess().getColonKeyword_10_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getColonKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_10__1__Impl"


    // $ANTLR start "rule__VReference__Group_10__2"
    // InternalVmsc.g:5053:1: rule__VReference__Group_10__2 : rule__VReference__Group_10__2__Impl rule__VReference__Group_10__3 ;
    public final void rule__VReference__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5057:1: ( rule__VReference__Group_10__2__Impl rule__VReference__Group_10__3 )
            // InternalVmsc.g:5058:2: rule__VReference__Group_10__2__Impl rule__VReference__Group_10__3
            {
            pushFollow(FOLLOW_12);
            rule__VReference__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_10__2"


    // $ANTLR start "rule__VReference__Group_10__2__Impl"
    // InternalVmsc.g:5065:1: rule__VReference__Group_10__2__Impl : ( 'True' ) ;
    public final void rule__VReference__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5069:1: ( ( 'True' ) )
            // InternalVmsc.g:5070:1: ( 'True' )
            {
            // InternalVmsc.g:5070:1: ( 'True' )
            // InternalVmsc.g:5071:2: 'True'
            {
             before(grammarAccess.getVReferenceAccess().getTrueKeyword_10_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getTrueKeyword_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_10__2__Impl"


    // $ANTLR start "rule__VReference__Group_10__3"
    // InternalVmsc.g:5080:1: rule__VReference__Group_10__3 : rule__VReference__Group_10__3__Impl ;
    public final void rule__VReference__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5084:1: ( rule__VReference__Group_10__3__Impl )
            // InternalVmsc.g:5085:2: rule__VReference__Group_10__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VReference__Group_10__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_10__3"


    // $ANTLR start "rule__VReference__Group_10__3__Impl"
    // InternalVmsc.g:5091:1: rule__VReference__Group_10__3__Impl : ( ',' ) ;
    public final void rule__VReference__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5095:1: ( ( ',' ) )
            // InternalVmsc.g:5096:1: ( ',' )
            {
            // InternalVmsc.g:5096:1: ( ',' )
            // InternalVmsc.g:5097:2: ','
            {
             before(grammarAccess.getVReferenceAccess().getCommaKeyword_10_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getCommaKeyword_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_10__3__Impl"


    // $ANTLR start "rule__VReference__Group_11__0"
    // InternalVmsc.g:5107:1: rule__VReference__Group_11__0 : rule__VReference__Group_11__0__Impl rule__VReference__Group_11__1 ;
    public final void rule__VReference__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5111:1: ( rule__VReference__Group_11__0__Impl rule__VReference__Group_11__1 )
            // InternalVmsc.g:5112:2: rule__VReference__Group_11__0__Impl rule__VReference__Group_11__1
            {
            pushFollow(FOLLOW_4);
            rule__VReference__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_11__0"


    // $ANTLR start "rule__VReference__Group_11__0__Impl"
    // InternalVmsc.g:5119:1: rule__VReference__Group_11__0__Impl : ( ( rule__VReference__IsUnsettableAssignment_11_0 ) ) ;
    public final void rule__VReference__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5123:1: ( ( ( rule__VReference__IsUnsettableAssignment_11_0 ) ) )
            // InternalVmsc.g:5124:1: ( ( rule__VReference__IsUnsettableAssignment_11_0 ) )
            {
            // InternalVmsc.g:5124:1: ( ( rule__VReference__IsUnsettableAssignment_11_0 ) )
            // InternalVmsc.g:5125:2: ( rule__VReference__IsUnsettableAssignment_11_0 )
            {
             before(grammarAccess.getVReferenceAccess().getIsUnsettableAssignment_11_0()); 
            // InternalVmsc.g:5126:2: ( rule__VReference__IsUnsettableAssignment_11_0 )
            // InternalVmsc.g:5126:3: rule__VReference__IsUnsettableAssignment_11_0
            {
            pushFollow(FOLLOW_2);
            rule__VReference__IsUnsettableAssignment_11_0();

            state._fsp--;


            }

             after(grammarAccess.getVReferenceAccess().getIsUnsettableAssignment_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_11__0__Impl"


    // $ANTLR start "rule__VReference__Group_11__1"
    // InternalVmsc.g:5134:1: rule__VReference__Group_11__1 : rule__VReference__Group_11__1__Impl rule__VReference__Group_11__2 ;
    public final void rule__VReference__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5138:1: ( rule__VReference__Group_11__1__Impl rule__VReference__Group_11__2 )
            // InternalVmsc.g:5139:2: rule__VReference__Group_11__1__Impl rule__VReference__Group_11__2
            {
            pushFollow(FOLLOW_20);
            rule__VReference__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group_11__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_11__1"


    // $ANTLR start "rule__VReference__Group_11__1__Impl"
    // InternalVmsc.g:5146:1: rule__VReference__Group_11__1__Impl : ( ':' ) ;
    public final void rule__VReference__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5150:1: ( ( ':' ) )
            // InternalVmsc.g:5151:1: ( ':' )
            {
            // InternalVmsc.g:5151:1: ( ':' )
            // InternalVmsc.g:5152:2: ':'
            {
             before(grammarAccess.getVReferenceAccess().getColonKeyword_11_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getColonKeyword_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_11__1__Impl"


    // $ANTLR start "rule__VReference__Group_11__2"
    // InternalVmsc.g:5161:1: rule__VReference__Group_11__2 : rule__VReference__Group_11__2__Impl rule__VReference__Group_11__3 ;
    public final void rule__VReference__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5165:1: ( rule__VReference__Group_11__2__Impl rule__VReference__Group_11__3 )
            // InternalVmsc.g:5166:2: rule__VReference__Group_11__2__Impl rule__VReference__Group_11__3
            {
            pushFollow(FOLLOW_12);
            rule__VReference__Group_11__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group_11__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_11__2"


    // $ANTLR start "rule__VReference__Group_11__2__Impl"
    // InternalVmsc.g:5173:1: rule__VReference__Group_11__2__Impl : ( 'True' ) ;
    public final void rule__VReference__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5177:1: ( ( 'True' ) )
            // InternalVmsc.g:5178:1: ( 'True' )
            {
            // InternalVmsc.g:5178:1: ( 'True' )
            // InternalVmsc.g:5179:2: 'True'
            {
             before(grammarAccess.getVReferenceAccess().getTrueKeyword_11_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getTrueKeyword_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_11__2__Impl"


    // $ANTLR start "rule__VReference__Group_11__3"
    // InternalVmsc.g:5188:1: rule__VReference__Group_11__3 : rule__VReference__Group_11__3__Impl ;
    public final void rule__VReference__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5192:1: ( rule__VReference__Group_11__3__Impl )
            // InternalVmsc.g:5193:2: rule__VReference__Group_11__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VReference__Group_11__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_11__3"


    // $ANTLR start "rule__VReference__Group_11__3__Impl"
    // InternalVmsc.g:5199:1: rule__VReference__Group_11__3__Impl : ( ',' ) ;
    public final void rule__VReference__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5203:1: ( ( ',' ) )
            // InternalVmsc.g:5204:1: ( ',' )
            {
            // InternalVmsc.g:5204:1: ( ',' )
            // InternalVmsc.g:5205:2: ','
            {
             before(grammarAccess.getVReferenceAccess().getCommaKeyword_11_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getCommaKeyword_11_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_11__3__Impl"


    // $ANTLR start "rule__VReference__Group_12__0"
    // InternalVmsc.g:5215:1: rule__VReference__Group_12__0 : rule__VReference__Group_12__0__Impl rule__VReference__Group_12__1 ;
    public final void rule__VReference__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5219:1: ( rule__VReference__Group_12__0__Impl rule__VReference__Group_12__1 )
            // InternalVmsc.g:5220:2: rule__VReference__Group_12__0__Impl rule__VReference__Group_12__1
            {
            pushFollow(FOLLOW_4);
            rule__VReference__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_12__0"


    // $ANTLR start "rule__VReference__Group_12__0__Impl"
    // InternalVmsc.g:5227:1: rule__VReference__Group_12__0__Impl : ( ( rule__VReference__IsVolatileAssignment_12_0 ) ) ;
    public final void rule__VReference__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5231:1: ( ( ( rule__VReference__IsVolatileAssignment_12_0 ) ) )
            // InternalVmsc.g:5232:1: ( ( rule__VReference__IsVolatileAssignment_12_0 ) )
            {
            // InternalVmsc.g:5232:1: ( ( rule__VReference__IsVolatileAssignment_12_0 ) )
            // InternalVmsc.g:5233:2: ( rule__VReference__IsVolatileAssignment_12_0 )
            {
             before(grammarAccess.getVReferenceAccess().getIsVolatileAssignment_12_0()); 
            // InternalVmsc.g:5234:2: ( rule__VReference__IsVolatileAssignment_12_0 )
            // InternalVmsc.g:5234:3: rule__VReference__IsVolatileAssignment_12_0
            {
            pushFollow(FOLLOW_2);
            rule__VReference__IsVolatileAssignment_12_0();

            state._fsp--;


            }

             after(grammarAccess.getVReferenceAccess().getIsVolatileAssignment_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_12__0__Impl"


    // $ANTLR start "rule__VReference__Group_12__1"
    // InternalVmsc.g:5242:1: rule__VReference__Group_12__1 : rule__VReference__Group_12__1__Impl rule__VReference__Group_12__2 ;
    public final void rule__VReference__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5246:1: ( rule__VReference__Group_12__1__Impl rule__VReference__Group_12__2 )
            // InternalVmsc.g:5247:2: rule__VReference__Group_12__1__Impl rule__VReference__Group_12__2
            {
            pushFollow(FOLLOW_20);
            rule__VReference__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group_12__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_12__1"


    // $ANTLR start "rule__VReference__Group_12__1__Impl"
    // InternalVmsc.g:5254:1: rule__VReference__Group_12__1__Impl : ( ':' ) ;
    public final void rule__VReference__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5258:1: ( ( ':' ) )
            // InternalVmsc.g:5259:1: ( ':' )
            {
            // InternalVmsc.g:5259:1: ( ':' )
            // InternalVmsc.g:5260:2: ':'
            {
             before(grammarAccess.getVReferenceAccess().getColonKeyword_12_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getColonKeyword_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_12__1__Impl"


    // $ANTLR start "rule__VReference__Group_12__2"
    // InternalVmsc.g:5269:1: rule__VReference__Group_12__2 : rule__VReference__Group_12__2__Impl rule__VReference__Group_12__3 ;
    public final void rule__VReference__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5273:1: ( rule__VReference__Group_12__2__Impl rule__VReference__Group_12__3 )
            // InternalVmsc.g:5274:2: rule__VReference__Group_12__2__Impl rule__VReference__Group_12__3
            {
            pushFollow(FOLLOW_12);
            rule__VReference__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group_12__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_12__2"


    // $ANTLR start "rule__VReference__Group_12__2__Impl"
    // InternalVmsc.g:5281:1: rule__VReference__Group_12__2__Impl : ( 'True' ) ;
    public final void rule__VReference__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5285:1: ( ( 'True' ) )
            // InternalVmsc.g:5286:1: ( 'True' )
            {
            // InternalVmsc.g:5286:1: ( 'True' )
            // InternalVmsc.g:5287:2: 'True'
            {
             before(grammarAccess.getVReferenceAccess().getTrueKeyword_12_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getTrueKeyword_12_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_12__2__Impl"


    // $ANTLR start "rule__VReference__Group_12__3"
    // InternalVmsc.g:5296:1: rule__VReference__Group_12__3 : rule__VReference__Group_12__3__Impl ;
    public final void rule__VReference__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5300:1: ( rule__VReference__Group_12__3__Impl )
            // InternalVmsc.g:5301:2: rule__VReference__Group_12__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VReference__Group_12__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_12__3"


    // $ANTLR start "rule__VReference__Group_12__3__Impl"
    // InternalVmsc.g:5307:1: rule__VReference__Group_12__3__Impl : ( ',' ) ;
    public final void rule__VReference__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5311:1: ( ( ',' ) )
            // InternalVmsc.g:5312:1: ( ',' )
            {
            // InternalVmsc.g:5312:1: ( ',' )
            // InternalVmsc.g:5313:2: ','
            {
             before(grammarAccess.getVReferenceAccess().getCommaKeyword_12_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getCommaKeyword_12_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_12__3__Impl"


    // $ANTLR start "rule__VReference__Group_13__0"
    // InternalVmsc.g:5323:1: rule__VReference__Group_13__0 : rule__VReference__Group_13__0__Impl rule__VReference__Group_13__1 ;
    public final void rule__VReference__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5327:1: ( rule__VReference__Group_13__0__Impl rule__VReference__Group_13__1 )
            // InternalVmsc.g:5328:2: rule__VReference__Group_13__0__Impl rule__VReference__Group_13__1
            {
            pushFollow(FOLLOW_4);
            rule__VReference__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_13__0"


    // $ANTLR start "rule__VReference__Group_13__0__Impl"
    // InternalVmsc.g:5335:1: rule__VReference__Group_13__0__Impl : ( ( rule__VReference__IsDerivedAssignment_13_0 ) ) ;
    public final void rule__VReference__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5339:1: ( ( ( rule__VReference__IsDerivedAssignment_13_0 ) ) )
            // InternalVmsc.g:5340:1: ( ( rule__VReference__IsDerivedAssignment_13_0 ) )
            {
            // InternalVmsc.g:5340:1: ( ( rule__VReference__IsDerivedAssignment_13_0 ) )
            // InternalVmsc.g:5341:2: ( rule__VReference__IsDerivedAssignment_13_0 )
            {
             before(grammarAccess.getVReferenceAccess().getIsDerivedAssignment_13_0()); 
            // InternalVmsc.g:5342:2: ( rule__VReference__IsDerivedAssignment_13_0 )
            // InternalVmsc.g:5342:3: rule__VReference__IsDerivedAssignment_13_0
            {
            pushFollow(FOLLOW_2);
            rule__VReference__IsDerivedAssignment_13_0();

            state._fsp--;


            }

             after(grammarAccess.getVReferenceAccess().getIsDerivedAssignment_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_13__0__Impl"


    // $ANTLR start "rule__VReference__Group_13__1"
    // InternalVmsc.g:5350:1: rule__VReference__Group_13__1 : rule__VReference__Group_13__1__Impl rule__VReference__Group_13__2 ;
    public final void rule__VReference__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5354:1: ( rule__VReference__Group_13__1__Impl rule__VReference__Group_13__2 )
            // InternalVmsc.g:5355:2: rule__VReference__Group_13__1__Impl rule__VReference__Group_13__2
            {
            pushFollow(FOLLOW_20);
            rule__VReference__Group_13__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group_13__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_13__1"


    // $ANTLR start "rule__VReference__Group_13__1__Impl"
    // InternalVmsc.g:5362:1: rule__VReference__Group_13__1__Impl : ( ':' ) ;
    public final void rule__VReference__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5366:1: ( ( ':' ) )
            // InternalVmsc.g:5367:1: ( ':' )
            {
            // InternalVmsc.g:5367:1: ( ':' )
            // InternalVmsc.g:5368:2: ':'
            {
             before(grammarAccess.getVReferenceAccess().getColonKeyword_13_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getColonKeyword_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_13__1__Impl"


    // $ANTLR start "rule__VReference__Group_13__2"
    // InternalVmsc.g:5377:1: rule__VReference__Group_13__2 : rule__VReference__Group_13__2__Impl rule__VReference__Group_13__3 ;
    public final void rule__VReference__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5381:1: ( rule__VReference__Group_13__2__Impl rule__VReference__Group_13__3 )
            // InternalVmsc.g:5382:2: rule__VReference__Group_13__2__Impl rule__VReference__Group_13__3
            {
            pushFollow(FOLLOW_12);
            rule__VReference__Group_13__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group_13__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_13__2"


    // $ANTLR start "rule__VReference__Group_13__2__Impl"
    // InternalVmsc.g:5389:1: rule__VReference__Group_13__2__Impl : ( 'True' ) ;
    public final void rule__VReference__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5393:1: ( ( 'True' ) )
            // InternalVmsc.g:5394:1: ( 'True' )
            {
            // InternalVmsc.g:5394:1: ( 'True' )
            // InternalVmsc.g:5395:2: 'True'
            {
             before(grammarAccess.getVReferenceAccess().getTrueKeyword_13_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getTrueKeyword_13_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_13__2__Impl"


    // $ANTLR start "rule__VReference__Group_13__3"
    // InternalVmsc.g:5404:1: rule__VReference__Group_13__3 : rule__VReference__Group_13__3__Impl ;
    public final void rule__VReference__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5408:1: ( rule__VReference__Group_13__3__Impl )
            // InternalVmsc.g:5409:2: rule__VReference__Group_13__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VReference__Group_13__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_13__3"


    // $ANTLR start "rule__VReference__Group_13__3__Impl"
    // InternalVmsc.g:5415:1: rule__VReference__Group_13__3__Impl : ( ',' ) ;
    public final void rule__VReference__Group_13__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5419:1: ( ( ',' ) )
            // InternalVmsc.g:5420:1: ( ',' )
            {
            // InternalVmsc.g:5420:1: ( ',' )
            // InternalVmsc.g:5421:2: ','
            {
             before(grammarAccess.getVReferenceAccess().getCommaKeyword_13_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getCommaKeyword_13_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_13__3__Impl"


    // $ANTLR start "rule__VReference__Group_14__0"
    // InternalVmsc.g:5431:1: rule__VReference__Group_14__0 : rule__VReference__Group_14__0__Impl rule__VReference__Group_14__1 ;
    public final void rule__VReference__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5435:1: ( rule__VReference__Group_14__0__Impl rule__VReference__Group_14__1 )
            // InternalVmsc.g:5436:2: rule__VReference__Group_14__0__Impl rule__VReference__Group_14__1
            {
            pushFollow(FOLLOW_4);
            rule__VReference__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_14__0"


    // $ANTLR start "rule__VReference__Group_14__0__Impl"
    // InternalVmsc.g:5443:1: rule__VReference__Group_14__0__Impl : ( ( rule__VReference__IsUniqueAssignment_14_0 ) ) ;
    public final void rule__VReference__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5447:1: ( ( ( rule__VReference__IsUniqueAssignment_14_0 ) ) )
            // InternalVmsc.g:5448:1: ( ( rule__VReference__IsUniqueAssignment_14_0 ) )
            {
            // InternalVmsc.g:5448:1: ( ( rule__VReference__IsUniqueAssignment_14_0 ) )
            // InternalVmsc.g:5449:2: ( rule__VReference__IsUniqueAssignment_14_0 )
            {
             before(grammarAccess.getVReferenceAccess().getIsUniqueAssignment_14_0()); 
            // InternalVmsc.g:5450:2: ( rule__VReference__IsUniqueAssignment_14_0 )
            // InternalVmsc.g:5450:3: rule__VReference__IsUniqueAssignment_14_0
            {
            pushFollow(FOLLOW_2);
            rule__VReference__IsUniqueAssignment_14_0();

            state._fsp--;


            }

             after(grammarAccess.getVReferenceAccess().getIsUniqueAssignment_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_14__0__Impl"


    // $ANTLR start "rule__VReference__Group_14__1"
    // InternalVmsc.g:5458:1: rule__VReference__Group_14__1 : rule__VReference__Group_14__1__Impl rule__VReference__Group_14__2 ;
    public final void rule__VReference__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5462:1: ( rule__VReference__Group_14__1__Impl rule__VReference__Group_14__2 )
            // InternalVmsc.g:5463:2: rule__VReference__Group_14__1__Impl rule__VReference__Group_14__2
            {
            pushFollow(FOLLOW_20);
            rule__VReference__Group_14__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group_14__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_14__1"


    // $ANTLR start "rule__VReference__Group_14__1__Impl"
    // InternalVmsc.g:5470:1: rule__VReference__Group_14__1__Impl : ( ':' ) ;
    public final void rule__VReference__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5474:1: ( ( ':' ) )
            // InternalVmsc.g:5475:1: ( ':' )
            {
            // InternalVmsc.g:5475:1: ( ':' )
            // InternalVmsc.g:5476:2: ':'
            {
             before(grammarAccess.getVReferenceAccess().getColonKeyword_14_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getColonKeyword_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_14__1__Impl"


    // $ANTLR start "rule__VReference__Group_14__2"
    // InternalVmsc.g:5485:1: rule__VReference__Group_14__2 : rule__VReference__Group_14__2__Impl rule__VReference__Group_14__3 ;
    public final void rule__VReference__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5489:1: ( rule__VReference__Group_14__2__Impl rule__VReference__Group_14__3 )
            // InternalVmsc.g:5490:2: rule__VReference__Group_14__2__Impl rule__VReference__Group_14__3
            {
            pushFollow(FOLLOW_12);
            rule__VReference__Group_14__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group_14__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_14__2"


    // $ANTLR start "rule__VReference__Group_14__2__Impl"
    // InternalVmsc.g:5497:1: rule__VReference__Group_14__2__Impl : ( 'True' ) ;
    public final void rule__VReference__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5501:1: ( ( 'True' ) )
            // InternalVmsc.g:5502:1: ( 'True' )
            {
            // InternalVmsc.g:5502:1: ( 'True' )
            // InternalVmsc.g:5503:2: 'True'
            {
             before(grammarAccess.getVReferenceAccess().getTrueKeyword_14_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getTrueKeyword_14_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_14__2__Impl"


    // $ANTLR start "rule__VReference__Group_14__3"
    // InternalVmsc.g:5512:1: rule__VReference__Group_14__3 : rule__VReference__Group_14__3__Impl ;
    public final void rule__VReference__Group_14__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5516:1: ( rule__VReference__Group_14__3__Impl )
            // InternalVmsc.g:5517:2: rule__VReference__Group_14__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VReference__Group_14__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_14__3"


    // $ANTLR start "rule__VReference__Group_14__3__Impl"
    // InternalVmsc.g:5523:1: rule__VReference__Group_14__3__Impl : ( ',' ) ;
    public final void rule__VReference__Group_14__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5527:1: ( ( ',' ) )
            // InternalVmsc.g:5528:1: ( ',' )
            {
            // InternalVmsc.g:5528:1: ( ',' )
            // InternalVmsc.g:5529:2: ','
            {
             before(grammarAccess.getVReferenceAccess().getCommaKeyword_14_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getCommaKeyword_14_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_14__3__Impl"


    // $ANTLR start "rule__VReference__Group_15__0"
    // InternalVmsc.g:5539:1: rule__VReference__Group_15__0 : rule__VReference__Group_15__0__Impl rule__VReference__Group_15__1 ;
    public final void rule__VReference__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5543:1: ( rule__VReference__Group_15__0__Impl rule__VReference__Group_15__1 )
            // InternalVmsc.g:5544:2: rule__VReference__Group_15__0__Impl rule__VReference__Group_15__1
            {
            pushFollow(FOLLOW_4);
            rule__VReference__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group_15__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_15__0"


    // $ANTLR start "rule__VReference__Group_15__0__Impl"
    // InternalVmsc.g:5551:1: rule__VReference__Group_15__0__Impl : ( ( rule__VReference__IsContainerAssignment_15_0 ) ) ;
    public final void rule__VReference__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5555:1: ( ( ( rule__VReference__IsContainerAssignment_15_0 ) ) )
            // InternalVmsc.g:5556:1: ( ( rule__VReference__IsContainerAssignment_15_0 ) )
            {
            // InternalVmsc.g:5556:1: ( ( rule__VReference__IsContainerAssignment_15_0 ) )
            // InternalVmsc.g:5557:2: ( rule__VReference__IsContainerAssignment_15_0 )
            {
             before(grammarAccess.getVReferenceAccess().getIsContainerAssignment_15_0()); 
            // InternalVmsc.g:5558:2: ( rule__VReference__IsContainerAssignment_15_0 )
            // InternalVmsc.g:5558:3: rule__VReference__IsContainerAssignment_15_0
            {
            pushFollow(FOLLOW_2);
            rule__VReference__IsContainerAssignment_15_0();

            state._fsp--;


            }

             after(grammarAccess.getVReferenceAccess().getIsContainerAssignment_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_15__0__Impl"


    // $ANTLR start "rule__VReference__Group_15__1"
    // InternalVmsc.g:5566:1: rule__VReference__Group_15__1 : rule__VReference__Group_15__1__Impl rule__VReference__Group_15__2 ;
    public final void rule__VReference__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5570:1: ( rule__VReference__Group_15__1__Impl rule__VReference__Group_15__2 )
            // InternalVmsc.g:5571:2: rule__VReference__Group_15__1__Impl rule__VReference__Group_15__2
            {
            pushFollow(FOLLOW_20);
            rule__VReference__Group_15__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group_15__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_15__1"


    // $ANTLR start "rule__VReference__Group_15__1__Impl"
    // InternalVmsc.g:5578:1: rule__VReference__Group_15__1__Impl : ( ':' ) ;
    public final void rule__VReference__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5582:1: ( ( ':' ) )
            // InternalVmsc.g:5583:1: ( ':' )
            {
            // InternalVmsc.g:5583:1: ( ':' )
            // InternalVmsc.g:5584:2: ':'
            {
             before(grammarAccess.getVReferenceAccess().getColonKeyword_15_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getColonKeyword_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_15__1__Impl"


    // $ANTLR start "rule__VReference__Group_15__2"
    // InternalVmsc.g:5593:1: rule__VReference__Group_15__2 : rule__VReference__Group_15__2__Impl rule__VReference__Group_15__3 ;
    public final void rule__VReference__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5597:1: ( rule__VReference__Group_15__2__Impl rule__VReference__Group_15__3 )
            // InternalVmsc.g:5598:2: rule__VReference__Group_15__2__Impl rule__VReference__Group_15__3
            {
            pushFollow(FOLLOW_12);
            rule__VReference__Group_15__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group_15__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_15__2"


    // $ANTLR start "rule__VReference__Group_15__2__Impl"
    // InternalVmsc.g:5605:1: rule__VReference__Group_15__2__Impl : ( 'True' ) ;
    public final void rule__VReference__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5609:1: ( ( 'True' ) )
            // InternalVmsc.g:5610:1: ( 'True' )
            {
            // InternalVmsc.g:5610:1: ( 'True' )
            // InternalVmsc.g:5611:2: 'True'
            {
             before(grammarAccess.getVReferenceAccess().getTrueKeyword_15_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getTrueKeyword_15_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_15__2__Impl"


    // $ANTLR start "rule__VReference__Group_15__3"
    // InternalVmsc.g:5620:1: rule__VReference__Group_15__3 : rule__VReference__Group_15__3__Impl ;
    public final void rule__VReference__Group_15__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5624:1: ( rule__VReference__Group_15__3__Impl )
            // InternalVmsc.g:5625:2: rule__VReference__Group_15__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VReference__Group_15__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_15__3"


    // $ANTLR start "rule__VReference__Group_15__3__Impl"
    // InternalVmsc.g:5631:1: rule__VReference__Group_15__3__Impl : ( ',' ) ;
    public final void rule__VReference__Group_15__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5635:1: ( ( ',' ) )
            // InternalVmsc.g:5636:1: ( ',' )
            {
            // InternalVmsc.g:5636:1: ( ',' )
            // InternalVmsc.g:5637:2: ','
            {
             before(grammarAccess.getVReferenceAccess().getCommaKeyword_15_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getCommaKeyword_15_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_15__3__Impl"


    // $ANTLR start "rule__VReference__Group_16__0"
    // InternalVmsc.g:5647:1: rule__VReference__Group_16__0 : rule__VReference__Group_16__0__Impl rule__VReference__Group_16__1 ;
    public final void rule__VReference__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5651:1: ( rule__VReference__Group_16__0__Impl rule__VReference__Group_16__1 )
            // InternalVmsc.g:5652:2: rule__VReference__Group_16__0__Impl rule__VReference__Group_16__1
            {
            pushFollow(FOLLOW_4);
            rule__VReference__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group_16__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_16__0"


    // $ANTLR start "rule__VReference__Group_16__0__Impl"
    // InternalVmsc.g:5659:1: rule__VReference__Group_16__0__Impl : ( ( rule__VReference__IsContainmentAssignment_16_0 ) ) ;
    public final void rule__VReference__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5663:1: ( ( ( rule__VReference__IsContainmentAssignment_16_0 ) ) )
            // InternalVmsc.g:5664:1: ( ( rule__VReference__IsContainmentAssignment_16_0 ) )
            {
            // InternalVmsc.g:5664:1: ( ( rule__VReference__IsContainmentAssignment_16_0 ) )
            // InternalVmsc.g:5665:2: ( rule__VReference__IsContainmentAssignment_16_0 )
            {
             before(grammarAccess.getVReferenceAccess().getIsContainmentAssignment_16_0()); 
            // InternalVmsc.g:5666:2: ( rule__VReference__IsContainmentAssignment_16_0 )
            // InternalVmsc.g:5666:3: rule__VReference__IsContainmentAssignment_16_0
            {
            pushFollow(FOLLOW_2);
            rule__VReference__IsContainmentAssignment_16_0();

            state._fsp--;


            }

             after(grammarAccess.getVReferenceAccess().getIsContainmentAssignment_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_16__0__Impl"


    // $ANTLR start "rule__VReference__Group_16__1"
    // InternalVmsc.g:5674:1: rule__VReference__Group_16__1 : rule__VReference__Group_16__1__Impl rule__VReference__Group_16__2 ;
    public final void rule__VReference__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5678:1: ( rule__VReference__Group_16__1__Impl rule__VReference__Group_16__2 )
            // InternalVmsc.g:5679:2: rule__VReference__Group_16__1__Impl rule__VReference__Group_16__2
            {
            pushFollow(FOLLOW_20);
            rule__VReference__Group_16__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group_16__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_16__1"


    // $ANTLR start "rule__VReference__Group_16__1__Impl"
    // InternalVmsc.g:5686:1: rule__VReference__Group_16__1__Impl : ( ':' ) ;
    public final void rule__VReference__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5690:1: ( ( ':' ) )
            // InternalVmsc.g:5691:1: ( ':' )
            {
            // InternalVmsc.g:5691:1: ( ':' )
            // InternalVmsc.g:5692:2: ':'
            {
             before(grammarAccess.getVReferenceAccess().getColonKeyword_16_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getColonKeyword_16_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_16__1__Impl"


    // $ANTLR start "rule__VReference__Group_16__2"
    // InternalVmsc.g:5701:1: rule__VReference__Group_16__2 : rule__VReference__Group_16__2__Impl rule__VReference__Group_16__3 ;
    public final void rule__VReference__Group_16__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5705:1: ( rule__VReference__Group_16__2__Impl rule__VReference__Group_16__3 )
            // InternalVmsc.g:5706:2: rule__VReference__Group_16__2__Impl rule__VReference__Group_16__3
            {
            pushFollow(FOLLOW_12);
            rule__VReference__Group_16__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group_16__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_16__2"


    // $ANTLR start "rule__VReference__Group_16__2__Impl"
    // InternalVmsc.g:5713:1: rule__VReference__Group_16__2__Impl : ( 'True' ) ;
    public final void rule__VReference__Group_16__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5717:1: ( ( 'True' ) )
            // InternalVmsc.g:5718:1: ( 'True' )
            {
            // InternalVmsc.g:5718:1: ( 'True' )
            // InternalVmsc.g:5719:2: 'True'
            {
             before(grammarAccess.getVReferenceAccess().getTrueKeyword_16_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getTrueKeyword_16_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_16__2__Impl"


    // $ANTLR start "rule__VReference__Group_16__3"
    // InternalVmsc.g:5728:1: rule__VReference__Group_16__3 : rule__VReference__Group_16__3__Impl ;
    public final void rule__VReference__Group_16__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5732:1: ( rule__VReference__Group_16__3__Impl )
            // InternalVmsc.g:5733:2: rule__VReference__Group_16__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VReference__Group_16__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_16__3"


    // $ANTLR start "rule__VReference__Group_16__3__Impl"
    // InternalVmsc.g:5739:1: rule__VReference__Group_16__3__Impl : ( ',' ) ;
    public final void rule__VReference__Group_16__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5743:1: ( ( ',' ) )
            // InternalVmsc.g:5744:1: ( ',' )
            {
            // InternalVmsc.g:5744:1: ( ',' )
            // InternalVmsc.g:5745:2: ','
            {
             before(grammarAccess.getVReferenceAccess().getCommaKeyword_16_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getCommaKeyword_16_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_16__3__Impl"


    // $ANTLR start "rule__VReference__Group_17__0"
    // InternalVmsc.g:5755:1: rule__VReference__Group_17__0 : rule__VReference__Group_17__0__Impl rule__VReference__Group_17__1 ;
    public final void rule__VReference__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5759:1: ( rule__VReference__Group_17__0__Impl rule__VReference__Group_17__1 )
            // InternalVmsc.g:5760:2: rule__VReference__Group_17__0__Impl rule__VReference__Group_17__1
            {
            pushFollow(FOLLOW_4);
            rule__VReference__Group_17__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group_17__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_17__0"


    // $ANTLR start "rule__VReference__Group_17__0__Impl"
    // InternalVmsc.g:5767:1: rule__VReference__Group_17__0__Impl : ( 'LowerBound' ) ;
    public final void rule__VReference__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5771:1: ( ( 'LowerBound' ) )
            // InternalVmsc.g:5772:1: ( 'LowerBound' )
            {
            // InternalVmsc.g:5772:1: ( 'LowerBound' )
            // InternalVmsc.g:5773:2: 'LowerBound'
            {
             before(grammarAccess.getVReferenceAccess().getLowerBoundKeyword_17_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getLowerBoundKeyword_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_17__0__Impl"


    // $ANTLR start "rule__VReference__Group_17__1"
    // InternalVmsc.g:5782:1: rule__VReference__Group_17__1 : rule__VReference__Group_17__1__Impl rule__VReference__Group_17__2 ;
    public final void rule__VReference__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5786:1: ( rule__VReference__Group_17__1__Impl rule__VReference__Group_17__2 )
            // InternalVmsc.g:5787:2: rule__VReference__Group_17__1__Impl rule__VReference__Group_17__2
            {
            pushFollow(FOLLOW_27);
            rule__VReference__Group_17__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group_17__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_17__1"


    // $ANTLR start "rule__VReference__Group_17__1__Impl"
    // InternalVmsc.g:5794:1: rule__VReference__Group_17__1__Impl : ( ':' ) ;
    public final void rule__VReference__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5798:1: ( ( ':' ) )
            // InternalVmsc.g:5799:1: ( ':' )
            {
            // InternalVmsc.g:5799:1: ( ':' )
            // InternalVmsc.g:5800:2: ':'
            {
             before(grammarAccess.getVReferenceAccess().getColonKeyword_17_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getColonKeyword_17_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_17__1__Impl"


    // $ANTLR start "rule__VReference__Group_17__2"
    // InternalVmsc.g:5809:1: rule__VReference__Group_17__2 : rule__VReference__Group_17__2__Impl rule__VReference__Group_17__3 ;
    public final void rule__VReference__Group_17__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5813:1: ( rule__VReference__Group_17__2__Impl rule__VReference__Group_17__3 )
            // InternalVmsc.g:5814:2: rule__VReference__Group_17__2__Impl rule__VReference__Group_17__3
            {
            pushFollow(FOLLOW_12);
            rule__VReference__Group_17__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group_17__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_17__2"


    // $ANTLR start "rule__VReference__Group_17__2__Impl"
    // InternalVmsc.g:5821:1: rule__VReference__Group_17__2__Impl : ( ( rule__VReference__LowerBoundAssignment_17_2 ) ) ;
    public final void rule__VReference__Group_17__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5825:1: ( ( ( rule__VReference__LowerBoundAssignment_17_2 ) ) )
            // InternalVmsc.g:5826:1: ( ( rule__VReference__LowerBoundAssignment_17_2 ) )
            {
            // InternalVmsc.g:5826:1: ( ( rule__VReference__LowerBoundAssignment_17_2 ) )
            // InternalVmsc.g:5827:2: ( rule__VReference__LowerBoundAssignment_17_2 )
            {
             before(grammarAccess.getVReferenceAccess().getLowerBoundAssignment_17_2()); 
            // InternalVmsc.g:5828:2: ( rule__VReference__LowerBoundAssignment_17_2 )
            // InternalVmsc.g:5828:3: rule__VReference__LowerBoundAssignment_17_2
            {
            pushFollow(FOLLOW_2);
            rule__VReference__LowerBoundAssignment_17_2();

            state._fsp--;


            }

             after(grammarAccess.getVReferenceAccess().getLowerBoundAssignment_17_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_17__2__Impl"


    // $ANTLR start "rule__VReference__Group_17__3"
    // InternalVmsc.g:5836:1: rule__VReference__Group_17__3 : rule__VReference__Group_17__3__Impl ;
    public final void rule__VReference__Group_17__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5840:1: ( rule__VReference__Group_17__3__Impl )
            // InternalVmsc.g:5841:2: rule__VReference__Group_17__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VReference__Group_17__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_17__3"


    // $ANTLR start "rule__VReference__Group_17__3__Impl"
    // InternalVmsc.g:5847:1: rule__VReference__Group_17__3__Impl : ( ',' ) ;
    public final void rule__VReference__Group_17__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5851:1: ( ( ',' ) )
            // InternalVmsc.g:5852:1: ( ',' )
            {
            // InternalVmsc.g:5852:1: ( ',' )
            // InternalVmsc.g:5853:2: ','
            {
             before(grammarAccess.getVReferenceAccess().getCommaKeyword_17_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getCommaKeyword_17_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_17__3__Impl"


    // $ANTLR start "rule__VReference__Group_18__0"
    // InternalVmsc.g:5863:1: rule__VReference__Group_18__0 : rule__VReference__Group_18__0__Impl rule__VReference__Group_18__1 ;
    public final void rule__VReference__Group_18__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5867:1: ( rule__VReference__Group_18__0__Impl rule__VReference__Group_18__1 )
            // InternalVmsc.g:5868:2: rule__VReference__Group_18__0__Impl rule__VReference__Group_18__1
            {
            pushFollow(FOLLOW_4);
            rule__VReference__Group_18__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group_18__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_18__0"


    // $ANTLR start "rule__VReference__Group_18__0__Impl"
    // InternalVmsc.g:5875:1: rule__VReference__Group_18__0__Impl : ( 'UpperBound' ) ;
    public final void rule__VReference__Group_18__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5879:1: ( ( 'UpperBound' ) )
            // InternalVmsc.g:5880:1: ( 'UpperBound' )
            {
            // InternalVmsc.g:5880:1: ( 'UpperBound' )
            // InternalVmsc.g:5881:2: 'UpperBound'
            {
             before(grammarAccess.getVReferenceAccess().getUpperBoundKeyword_18_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getUpperBoundKeyword_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_18__0__Impl"


    // $ANTLR start "rule__VReference__Group_18__1"
    // InternalVmsc.g:5890:1: rule__VReference__Group_18__1 : rule__VReference__Group_18__1__Impl rule__VReference__Group_18__2 ;
    public final void rule__VReference__Group_18__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5894:1: ( rule__VReference__Group_18__1__Impl rule__VReference__Group_18__2 )
            // InternalVmsc.g:5895:2: rule__VReference__Group_18__1__Impl rule__VReference__Group_18__2
            {
            pushFollow(FOLLOW_27);
            rule__VReference__Group_18__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group_18__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_18__1"


    // $ANTLR start "rule__VReference__Group_18__1__Impl"
    // InternalVmsc.g:5902:1: rule__VReference__Group_18__1__Impl : ( ':' ) ;
    public final void rule__VReference__Group_18__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5906:1: ( ( ':' ) )
            // InternalVmsc.g:5907:1: ( ':' )
            {
            // InternalVmsc.g:5907:1: ( ':' )
            // InternalVmsc.g:5908:2: ':'
            {
             before(grammarAccess.getVReferenceAccess().getColonKeyword_18_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getColonKeyword_18_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_18__1__Impl"


    // $ANTLR start "rule__VReference__Group_18__2"
    // InternalVmsc.g:5917:1: rule__VReference__Group_18__2 : rule__VReference__Group_18__2__Impl rule__VReference__Group_18__3 ;
    public final void rule__VReference__Group_18__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5921:1: ( rule__VReference__Group_18__2__Impl rule__VReference__Group_18__3 )
            // InternalVmsc.g:5922:2: rule__VReference__Group_18__2__Impl rule__VReference__Group_18__3
            {
            pushFollow(FOLLOW_12);
            rule__VReference__Group_18__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group_18__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_18__2"


    // $ANTLR start "rule__VReference__Group_18__2__Impl"
    // InternalVmsc.g:5929:1: rule__VReference__Group_18__2__Impl : ( ( rule__VReference__UpperBoundAssignment_18_2 ) ) ;
    public final void rule__VReference__Group_18__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5933:1: ( ( ( rule__VReference__UpperBoundAssignment_18_2 ) ) )
            // InternalVmsc.g:5934:1: ( ( rule__VReference__UpperBoundAssignment_18_2 ) )
            {
            // InternalVmsc.g:5934:1: ( ( rule__VReference__UpperBoundAssignment_18_2 ) )
            // InternalVmsc.g:5935:2: ( rule__VReference__UpperBoundAssignment_18_2 )
            {
             before(grammarAccess.getVReferenceAccess().getUpperBoundAssignment_18_2()); 
            // InternalVmsc.g:5936:2: ( rule__VReference__UpperBoundAssignment_18_2 )
            // InternalVmsc.g:5936:3: rule__VReference__UpperBoundAssignment_18_2
            {
            pushFollow(FOLLOW_2);
            rule__VReference__UpperBoundAssignment_18_2();

            state._fsp--;


            }

             after(grammarAccess.getVReferenceAccess().getUpperBoundAssignment_18_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_18__2__Impl"


    // $ANTLR start "rule__VReference__Group_18__3"
    // InternalVmsc.g:5944:1: rule__VReference__Group_18__3 : rule__VReference__Group_18__3__Impl ;
    public final void rule__VReference__Group_18__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5948:1: ( rule__VReference__Group_18__3__Impl )
            // InternalVmsc.g:5949:2: rule__VReference__Group_18__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VReference__Group_18__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_18__3"


    // $ANTLR start "rule__VReference__Group_18__3__Impl"
    // InternalVmsc.g:5955:1: rule__VReference__Group_18__3__Impl : ( ',' ) ;
    public final void rule__VReference__Group_18__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5959:1: ( ( ',' ) )
            // InternalVmsc.g:5960:1: ( ',' )
            {
            // InternalVmsc.g:5960:1: ( ',' )
            // InternalVmsc.g:5961:2: ','
            {
             before(grammarAccess.getVReferenceAccess().getCommaKeyword_18_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getCommaKeyword_18_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_18__3__Impl"


    // $ANTLR start "rule__VReference__Group_19__0"
    // InternalVmsc.g:5971:1: rule__VReference__Group_19__0 : rule__VReference__Group_19__0__Impl rule__VReference__Group_19__1 ;
    public final void rule__VReference__Group_19__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5975:1: ( rule__VReference__Group_19__0__Impl rule__VReference__Group_19__1 )
            // InternalVmsc.g:5976:2: rule__VReference__Group_19__0__Impl rule__VReference__Group_19__1
            {
            pushFollow(FOLLOW_4);
            rule__VReference__Group_19__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group_19__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_19__0"


    // $ANTLR start "rule__VReference__Group_19__0__Impl"
    // InternalVmsc.g:5983:1: rule__VReference__Group_19__0__Impl : ( 'VType' ) ;
    public final void rule__VReference__Group_19__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:5987:1: ( ( 'VType' ) )
            // InternalVmsc.g:5988:1: ( 'VType' )
            {
            // InternalVmsc.g:5988:1: ( 'VType' )
            // InternalVmsc.g:5989:2: 'VType'
            {
             before(grammarAccess.getVReferenceAccess().getVTypeKeyword_19_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getVTypeKeyword_19_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_19__0__Impl"


    // $ANTLR start "rule__VReference__Group_19__1"
    // InternalVmsc.g:5998:1: rule__VReference__Group_19__1 : rule__VReference__Group_19__1__Impl rule__VReference__Group_19__2 ;
    public final void rule__VReference__Group_19__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6002:1: ( rule__VReference__Group_19__1__Impl rule__VReference__Group_19__2 )
            // InternalVmsc.g:6003:2: rule__VReference__Group_19__1__Impl rule__VReference__Group_19__2
            {
            pushFollow(FOLLOW_14);
            rule__VReference__Group_19__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VReference__Group_19__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_19__1"


    // $ANTLR start "rule__VReference__Group_19__1__Impl"
    // InternalVmsc.g:6010:1: rule__VReference__Group_19__1__Impl : ( ':' ) ;
    public final void rule__VReference__Group_19__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6014:1: ( ( ':' ) )
            // InternalVmsc.g:6015:1: ( ':' )
            {
            // InternalVmsc.g:6015:1: ( ':' )
            // InternalVmsc.g:6016:2: ':'
            {
             before(grammarAccess.getVReferenceAccess().getColonKeyword_19_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getColonKeyword_19_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_19__1__Impl"


    // $ANTLR start "rule__VReference__Group_19__2"
    // InternalVmsc.g:6025:1: rule__VReference__Group_19__2 : rule__VReference__Group_19__2__Impl ;
    public final void rule__VReference__Group_19__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6029:1: ( rule__VReference__Group_19__2__Impl )
            // InternalVmsc.g:6030:2: rule__VReference__Group_19__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VReference__Group_19__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_19__2"


    // $ANTLR start "rule__VReference__Group_19__2__Impl"
    // InternalVmsc.g:6036:1: rule__VReference__Group_19__2__Impl : ( ( rule__VReference__VTypeAssignment_19_2 ) ) ;
    public final void rule__VReference__Group_19__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6040:1: ( ( ( rule__VReference__VTypeAssignment_19_2 ) ) )
            // InternalVmsc.g:6041:1: ( ( rule__VReference__VTypeAssignment_19_2 ) )
            {
            // InternalVmsc.g:6041:1: ( ( rule__VReference__VTypeAssignment_19_2 ) )
            // InternalVmsc.g:6042:2: ( rule__VReference__VTypeAssignment_19_2 )
            {
             before(grammarAccess.getVReferenceAccess().getVTypeAssignment_19_2()); 
            // InternalVmsc.g:6043:2: ( rule__VReference__VTypeAssignment_19_2 )
            // InternalVmsc.g:6043:3: rule__VReference__VTypeAssignment_19_2
            {
            pushFollow(FOLLOW_2);
            rule__VReference__VTypeAssignment_19_2();

            state._fsp--;


            }

             after(grammarAccess.getVReferenceAccess().getVTypeAssignment_19_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__Group_19__2__Impl"


    // $ANTLR start "rule__VString__Group__0"
    // InternalVmsc.g:6052:1: rule__VString__Group__0 : rule__VString__Group__0__Impl rule__VString__Group__1 ;
    public final void rule__VString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6056:1: ( rule__VString__Group__0__Impl rule__VString__Group__1 )
            // InternalVmsc.g:6057:2: rule__VString__Group__0__Impl rule__VString__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__VString__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VString__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VString__Group__0"


    // $ANTLR start "rule__VString__Group__0__Impl"
    // InternalVmsc.g:6064:1: rule__VString__Group__0__Impl : ( () ) ;
    public final void rule__VString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6068:1: ( ( () ) )
            // InternalVmsc.g:6069:1: ( () )
            {
            // InternalVmsc.g:6069:1: ( () )
            // InternalVmsc.g:6070:2: ()
            {
             before(grammarAccess.getVStringAccess().getVStringAction_0()); 
            // InternalVmsc.g:6071:2: ()
            // InternalVmsc.g:6071:3: 
            {
            }

             after(grammarAccess.getVStringAccess().getVStringAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VString__Group__0__Impl"


    // $ANTLR start "rule__VString__Group__1"
    // InternalVmsc.g:6079:1: rule__VString__Group__1 : rule__VString__Group__1__Impl rule__VString__Group__2 ;
    public final void rule__VString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6083:1: ( rule__VString__Group__1__Impl rule__VString__Group__2 )
            // InternalVmsc.g:6084:2: rule__VString__Group__1__Impl rule__VString__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__VString__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VString__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VString__Group__1"


    // $ANTLR start "rule__VString__Group__1__Impl"
    // InternalVmsc.g:6091:1: rule__VString__Group__1__Impl : ( 'VString' ) ;
    public final void rule__VString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6095:1: ( ( 'VString' ) )
            // InternalVmsc.g:6096:1: ( 'VString' )
            {
            // InternalVmsc.g:6096:1: ( 'VString' )
            // InternalVmsc.g:6097:2: 'VString'
            {
             before(grammarAccess.getVStringAccess().getVStringKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getVStringAccess().getVStringKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VString__Group__1__Impl"


    // $ANTLR start "rule__VString__Group__2"
    // InternalVmsc.g:6106:1: rule__VString__Group__2 : rule__VString__Group__2__Impl rule__VString__Group__3 ;
    public final void rule__VString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6110:1: ( rule__VString__Group__2__Impl rule__VString__Group__3 )
            // InternalVmsc.g:6111:2: rule__VString__Group__2__Impl rule__VString__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__VString__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VString__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VString__Group__2"


    // $ANTLR start "rule__VString__Group__2__Impl"
    // InternalVmsc.g:6118:1: rule__VString__Group__2__Impl : ( ',' ) ;
    public final void rule__VString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6122:1: ( ( ',' ) )
            // InternalVmsc.g:6123:1: ( ',' )
            {
            // InternalVmsc.g:6123:1: ( ',' )
            // InternalVmsc.g:6124:2: ','
            {
             before(grammarAccess.getVStringAccess().getCommaKeyword_2()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getVStringAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VString__Group__2__Impl"


    // $ANTLR start "rule__VString__Group__3"
    // InternalVmsc.g:6133:1: rule__VString__Group__3 : rule__VString__Group__3__Impl rule__VString__Group__4 ;
    public final void rule__VString__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6137:1: ( rule__VString__Group__3__Impl rule__VString__Group__4 )
            // InternalVmsc.g:6138:2: rule__VString__Group__3__Impl rule__VString__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__VString__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VString__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VString__Group__3"


    // $ANTLR start "rule__VString__Group__3__Impl"
    // InternalVmsc.g:6145:1: rule__VString__Group__3__Impl : ( 'VContent' ) ;
    public final void rule__VString__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6149:1: ( ( 'VContent' ) )
            // InternalVmsc.g:6150:1: ( 'VContent' )
            {
            // InternalVmsc.g:6150:1: ( 'VContent' )
            // InternalVmsc.g:6151:2: 'VContent'
            {
             before(grammarAccess.getVStringAccess().getVContentKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getVStringAccess().getVContentKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VString__Group__3__Impl"


    // $ANTLR start "rule__VString__Group__4"
    // InternalVmsc.g:6160:1: rule__VString__Group__4 : rule__VString__Group__4__Impl rule__VString__Group__5 ;
    public final void rule__VString__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6164:1: ( rule__VString__Group__4__Impl rule__VString__Group__5 )
            // InternalVmsc.g:6165:2: rule__VString__Group__4__Impl rule__VString__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__VString__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VString__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VString__Group__4"


    // $ANTLR start "rule__VString__Group__4__Impl"
    // InternalVmsc.g:6172:1: rule__VString__Group__4__Impl : ( ':' ) ;
    public final void rule__VString__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6176:1: ( ( ':' ) )
            // InternalVmsc.g:6177:1: ( ':' )
            {
            // InternalVmsc.g:6177:1: ( ':' )
            // InternalVmsc.g:6178:2: ':'
            {
             before(grammarAccess.getVStringAccess().getColonKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVStringAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VString__Group__4__Impl"


    // $ANTLR start "rule__VString__Group__5"
    // InternalVmsc.g:6187:1: rule__VString__Group__5 : rule__VString__Group__5__Impl rule__VString__Group__6 ;
    public final void rule__VString__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6191:1: ( rule__VString__Group__5__Impl rule__VString__Group__6 )
            // InternalVmsc.g:6192:2: rule__VString__Group__5__Impl rule__VString__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__VString__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VString__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VString__Group__5"


    // $ANTLR start "rule__VString__Group__5__Impl"
    // InternalVmsc.g:6199:1: rule__VString__Group__5__Impl : ( ( rule__VString__VContentAssignment_5 ) ) ;
    public final void rule__VString__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6203:1: ( ( ( rule__VString__VContentAssignment_5 ) ) )
            // InternalVmsc.g:6204:1: ( ( rule__VString__VContentAssignment_5 ) )
            {
            // InternalVmsc.g:6204:1: ( ( rule__VString__VContentAssignment_5 ) )
            // InternalVmsc.g:6205:2: ( rule__VString__VContentAssignment_5 )
            {
             before(grammarAccess.getVStringAccess().getVContentAssignment_5()); 
            // InternalVmsc.g:6206:2: ( rule__VString__VContentAssignment_5 )
            // InternalVmsc.g:6206:3: rule__VString__VContentAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__VString__VContentAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getVStringAccess().getVContentAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VString__Group__5__Impl"


    // $ANTLR start "rule__VString__Group__6"
    // InternalVmsc.g:6214:1: rule__VString__Group__6 : rule__VString__Group__6__Impl ;
    public final void rule__VString__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6218:1: ( rule__VString__Group__6__Impl )
            // InternalVmsc.g:6219:2: rule__VString__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VString__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VString__Group__6"


    // $ANTLR start "rule__VString__Group__6__Impl"
    // InternalVmsc.g:6225:1: rule__VString__Group__6__Impl : ( ( ',' )? ) ;
    public final void rule__VString__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6229:1: ( ( ( ',' )? ) )
            // InternalVmsc.g:6230:1: ( ( ',' )? )
            {
            // InternalVmsc.g:6230:1: ( ( ',' )? )
            // InternalVmsc.g:6231:2: ( ',' )?
            {
             before(grammarAccess.getVStringAccess().getCommaKeyword_6()); 
            // InternalVmsc.g:6232:2: ( ',' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==11) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalVmsc.g:6232:3: ','
                    {
                    match(input,11,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getVStringAccess().getCommaKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VString__Group__6__Impl"


    // $ANTLR start "rule__VInt__Group__0"
    // InternalVmsc.g:6241:1: rule__VInt__Group__0 : rule__VInt__Group__0__Impl rule__VInt__Group__1 ;
    public final void rule__VInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6245:1: ( rule__VInt__Group__0__Impl rule__VInt__Group__1 )
            // InternalVmsc.g:6246:2: rule__VInt__Group__0__Impl rule__VInt__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__VInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VInt__Group__0"


    // $ANTLR start "rule__VInt__Group__0__Impl"
    // InternalVmsc.g:6253:1: rule__VInt__Group__0__Impl : ( () ) ;
    public final void rule__VInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6257:1: ( ( () ) )
            // InternalVmsc.g:6258:1: ( () )
            {
            // InternalVmsc.g:6258:1: ( () )
            // InternalVmsc.g:6259:2: ()
            {
             before(grammarAccess.getVIntAccess().getVIntAction_0()); 
            // InternalVmsc.g:6260:2: ()
            // InternalVmsc.g:6260:3: 
            {
            }

             after(grammarAccess.getVIntAccess().getVIntAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VInt__Group__0__Impl"


    // $ANTLR start "rule__VInt__Group__1"
    // InternalVmsc.g:6268:1: rule__VInt__Group__1 : rule__VInt__Group__1__Impl rule__VInt__Group__2 ;
    public final void rule__VInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6272:1: ( rule__VInt__Group__1__Impl rule__VInt__Group__2 )
            // InternalVmsc.g:6273:2: rule__VInt__Group__1__Impl rule__VInt__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__VInt__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VInt__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VInt__Group__1"


    // $ANTLR start "rule__VInt__Group__1__Impl"
    // InternalVmsc.g:6280:1: rule__VInt__Group__1__Impl : ( 'VInt' ) ;
    public final void rule__VInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6284:1: ( ( 'VInt' ) )
            // InternalVmsc.g:6285:1: ( 'VInt' )
            {
            // InternalVmsc.g:6285:1: ( 'VInt' )
            // InternalVmsc.g:6286:2: 'VInt'
            {
             before(grammarAccess.getVIntAccess().getVIntKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getVIntAccess().getVIntKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VInt__Group__1__Impl"


    // $ANTLR start "rule__VInt__Group__2"
    // InternalVmsc.g:6295:1: rule__VInt__Group__2 : rule__VInt__Group__2__Impl rule__VInt__Group__3 ;
    public final void rule__VInt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6299:1: ( rule__VInt__Group__2__Impl rule__VInt__Group__3 )
            // InternalVmsc.g:6300:2: rule__VInt__Group__2__Impl rule__VInt__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__VInt__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VInt__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VInt__Group__2"


    // $ANTLR start "rule__VInt__Group__2__Impl"
    // InternalVmsc.g:6307:1: rule__VInt__Group__2__Impl : ( ',' ) ;
    public final void rule__VInt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6311:1: ( ( ',' ) )
            // InternalVmsc.g:6312:1: ( ',' )
            {
            // InternalVmsc.g:6312:1: ( ',' )
            // InternalVmsc.g:6313:2: ','
            {
             before(grammarAccess.getVIntAccess().getCommaKeyword_2()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getVIntAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VInt__Group__2__Impl"


    // $ANTLR start "rule__VInt__Group__3"
    // InternalVmsc.g:6322:1: rule__VInt__Group__3 : rule__VInt__Group__3__Impl rule__VInt__Group__4 ;
    public final void rule__VInt__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6326:1: ( rule__VInt__Group__3__Impl rule__VInt__Group__4 )
            // InternalVmsc.g:6327:2: rule__VInt__Group__3__Impl rule__VInt__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__VInt__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VInt__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VInt__Group__3"


    // $ANTLR start "rule__VInt__Group__3__Impl"
    // InternalVmsc.g:6334:1: rule__VInt__Group__3__Impl : ( 'VContent' ) ;
    public final void rule__VInt__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6338:1: ( ( 'VContent' ) )
            // InternalVmsc.g:6339:1: ( 'VContent' )
            {
            // InternalVmsc.g:6339:1: ( 'VContent' )
            // InternalVmsc.g:6340:2: 'VContent'
            {
             before(grammarAccess.getVIntAccess().getVContentKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getVIntAccess().getVContentKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VInt__Group__3__Impl"


    // $ANTLR start "rule__VInt__Group__4"
    // InternalVmsc.g:6349:1: rule__VInt__Group__4 : rule__VInt__Group__4__Impl rule__VInt__Group__5 ;
    public final void rule__VInt__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6353:1: ( rule__VInt__Group__4__Impl rule__VInt__Group__5 )
            // InternalVmsc.g:6354:2: rule__VInt__Group__4__Impl rule__VInt__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__VInt__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VInt__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VInt__Group__4"


    // $ANTLR start "rule__VInt__Group__4__Impl"
    // InternalVmsc.g:6361:1: rule__VInt__Group__4__Impl : ( ':' ) ;
    public final void rule__VInt__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6365:1: ( ( ':' ) )
            // InternalVmsc.g:6366:1: ( ':' )
            {
            // InternalVmsc.g:6366:1: ( ':' )
            // InternalVmsc.g:6367:2: ':'
            {
             before(grammarAccess.getVIntAccess().getColonKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVIntAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VInt__Group__4__Impl"


    // $ANTLR start "rule__VInt__Group__5"
    // InternalVmsc.g:6376:1: rule__VInt__Group__5 : rule__VInt__Group__5__Impl rule__VInt__Group__6 ;
    public final void rule__VInt__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6380:1: ( rule__VInt__Group__5__Impl rule__VInt__Group__6 )
            // InternalVmsc.g:6381:2: rule__VInt__Group__5__Impl rule__VInt__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__VInt__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VInt__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VInt__Group__5"


    // $ANTLR start "rule__VInt__Group__5__Impl"
    // InternalVmsc.g:6388:1: rule__VInt__Group__5__Impl : ( ( rule__VInt__VContentAssignment_5 ) ) ;
    public final void rule__VInt__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6392:1: ( ( ( rule__VInt__VContentAssignment_5 ) ) )
            // InternalVmsc.g:6393:1: ( ( rule__VInt__VContentAssignment_5 ) )
            {
            // InternalVmsc.g:6393:1: ( ( rule__VInt__VContentAssignment_5 ) )
            // InternalVmsc.g:6394:2: ( rule__VInt__VContentAssignment_5 )
            {
             before(grammarAccess.getVIntAccess().getVContentAssignment_5()); 
            // InternalVmsc.g:6395:2: ( rule__VInt__VContentAssignment_5 )
            // InternalVmsc.g:6395:3: rule__VInt__VContentAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__VInt__VContentAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getVIntAccess().getVContentAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VInt__Group__5__Impl"


    // $ANTLR start "rule__VInt__Group__6"
    // InternalVmsc.g:6403:1: rule__VInt__Group__6 : rule__VInt__Group__6__Impl ;
    public final void rule__VInt__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6407:1: ( rule__VInt__Group__6__Impl )
            // InternalVmsc.g:6408:2: rule__VInt__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VInt__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VInt__Group__6"


    // $ANTLR start "rule__VInt__Group__6__Impl"
    // InternalVmsc.g:6414:1: rule__VInt__Group__6__Impl : ( ( ',' )? ) ;
    public final void rule__VInt__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6418:1: ( ( ( ',' )? ) )
            // InternalVmsc.g:6419:1: ( ( ',' )? )
            {
            // InternalVmsc.g:6419:1: ( ( ',' )? )
            // InternalVmsc.g:6420:2: ( ',' )?
            {
             before(grammarAccess.getVIntAccess().getCommaKeyword_6()); 
            // InternalVmsc.g:6421:2: ( ',' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==11) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalVmsc.g:6421:3: ','
                    {
                    match(input,11,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getVIntAccess().getCommaKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VInt__Group__6__Impl"


    // $ANTLR start "rule__VFloat__Group__0"
    // InternalVmsc.g:6430:1: rule__VFloat__Group__0 : rule__VFloat__Group__0__Impl rule__VFloat__Group__1 ;
    public final void rule__VFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6434:1: ( rule__VFloat__Group__0__Impl rule__VFloat__Group__1 )
            // InternalVmsc.g:6435:2: rule__VFloat__Group__0__Impl rule__VFloat__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__VFloat__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VFloat__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VFloat__Group__0"


    // $ANTLR start "rule__VFloat__Group__0__Impl"
    // InternalVmsc.g:6442:1: rule__VFloat__Group__0__Impl : ( () ) ;
    public final void rule__VFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6446:1: ( ( () ) )
            // InternalVmsc.g:6447:1: ( () )
            {
            // InternalVmsc.g:6447:1: ( () )
            // InternalVmsc.g:6448:2: ()
            {
             before(grammarAccess.getVFloatAccess().getVFloatAction_0()); 
            // InternalVmsc.g:6449:2: ()
            // InternalVmsc.g:6449:3: 
            {
            }

             after(grammarAccess.getVFloatAccess().getVFloatAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VFloat__Group__0__Impl"


    // $ANTLR start "rule__VFloat__Group__1"
    // InternalVmsc.g:6457:1: rule__VFloat__Group__1 : rule__VFloat__Group__1__Impl rule__VFloat__Group__2 ;
    public final void rule__VFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6461:1: ( rule__VFloat__Group__1__Impl rule__VFloat__Group__2 )
            // InternalVmsc.g:6462:2: rule__VFloat__Group__1__Impl rule__VFloat__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__VFloat__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VFloat__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VFloat__Group__1"


    // $ANTLR start "rule__VFloat__Group__1__Impl"
    // InternalVmsc.g:6469:1: rule__VFloat__Group__1__Impl : ( 'VFloat' ) ;
    public final void rule__VFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6473:1: ( ( 'VFloat' ) )
            // InternalVmsc.g:6474:1: ( 'VFloat' )
            {
            // InternalVmsc.g:6474:1: ( 'VFloat' )
            // InternalVmsc.g:6475:2: 'VFloat'
            {
             before(grammarAccess.getVFloatAccess().getVFloatKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getVFloatAccess().getVFloatKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VFloat__Group__1__Impl"


    // $ANTLR start "rule__VFloat__Group__2"
    // InternalVmsc.g:6484:1: rule__VFloat__Group__2 : rule__VFloat__Group__2__Impl rule__VFloat__Group__3 ;
    public final void rule__VFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6488:1: ( rule__VFloat__Group__2__Impl rule__VFloat__Group__3 )
            // InternalVmsc.g:6489:2: rule__VFloat__Group__2__Impl rule__VFloat__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__VFloat__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VFloat__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VFloat__Group__2"


    // $ANTLR start "rule__VFloat__Group__2__Impl"
    // InternalVmsc.g:6496:1: rule__VFloat__Group__2__Impl : ( ',' ) ;
    public final void rule__VFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6500:1: ( ( ',' ) )
            // InternalVmsc.g:6501:1: ( ',' )
            {
            // InternalVmsc.g:6501:1: ( ',' )
            // InternalVmsc.g:6502:2: ','
            {
             before(grammarAccess.getVFloatAccess().getCommaKeyword_2()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getVFloatAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VFloat__Group__2__Impl"


    // $ANTLR start "rule__VFloat__Group__3"
    // InternalVmsc.g:6511:1: rule__VFloat__Group__3 : rule__VFloat__Group__3__Impl rule__VFloat__Group__4 ;
    public final void rule__VFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6515:1: ( rule__VFloat__Group__3__Impl rule__VFloat__Group__4 )
            // InternalVmsc.g:6516:2: rule__VFloat__Group__3__Impl rule__VFloat__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__VFloat__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VFloat__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VFloat__Group__3"


    // $ANTLR start "rule__VFloat__Group__3__Impl"
    // InternalVmsc.g:6523:1: rule__VFloat__Group__3__Impl : ( 'VContent' ) ;
    public final void rule__VFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6527:1: ( ( 'VContent' ) )
            // InternalVmsc.g:6528:1: ( 'VContent' )
            {
            // InternalVmsc.g:6528:1: ( 'VContent' )
            // InternalVmsc.g:6529:2: 'VContent'
            {
             before(grammarAccess.getVFloatAccess().getVContentKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getVFloatAccess().getVContentKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VFloat__Group__3__Impl"


    // $ANTLR start "rule__VFloat__Group__4"
    // InternalVmsc.g:6538:1: rule__VFloat__Group__4 : rule__VFloat__Group__4__Impl rule__VFloat__Group__5 ;
    public final void rule__VFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6542:1: ( rule__VFloat__Group__4__Impl rule__VFloat__Group__5 )
            // InternalVmsc.g:6543:2: rule__VFloat__Group__4__Impl rule__VFloat__Group__5
            {
            pushFollow(FOLLOW_33);
            rule__VFloat__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VFloat__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VFloat__Group__4"


    // $ANTLR start "rule__VFloat__Group__4__Impl"
    // InternalVmsc.g:6550:1: rule__VFloat__Group__4__Impl : ( ':' ) ;
    public final void rule__VFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6554:1: ( ( ':' ) )
            // InternalVmsc.g:6555:1: ( ':' )
            {
            // InternalVmsc.g:6555:1: ( ':' )
            // InternalVmsc.g:6556:2: ':'
            {
             before(grammarAccess.getVFloatAccess().getColonKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVFloatAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VFloat__Group__4__Impl"


    // $ANTLR start "rule__VFloat__Group__5"
    // InternalVmsc.g:6565:1: rule__VFloat__Group__5 : rule__VFloat__Group__5__Impl rule__VFloat__Group__6 ;
    public final void rule__VFloat__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6569:1: ( rule__VFloat__Group__5__Impl rule__VFloat__Group__6 )
            // InternalVmsc.g:6570:2: rule__VFloat__Group__5__Impl rule__VFloat__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__VFloat__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VFloat__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VFloat__Group__5"


    // $ANTLR start "rule__VFloat__Group__5__Impl"
    // InternalVmsc.g:6577:1: rule__VFloat__Group__5__Impl : ( ( rule__VFloat__VContentAssignment_5 ) ) ;
    public final void rule__VFloat__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6581:1: ( ( ( rule__VFloat__VContentAssignment_5 ) ) )
            // InternalVmsc.g:6582:1: ( ( rule__VFloat__VContentAssignment_5 ) )
            {
            // InternalVmsc.g:6582:1: ( ( rule__VFloat__VContentAssignment_5 ) )
            // InternalVmsc.g:6583:2: ( rule__VFloat__VContentAssignment_5 )
            {
             before(grammarAccess.getVFloatAccess().getVContentAssignment_5()); 
            // InternalVmsc.g:6584:2: ( rule__VFloat__VContentAssignment_5 )
            // InternalVmsc.g:6584:3: rule__VFloat__VContentAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__VFloat__VContentAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getVFloatAccess().getVContentAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VFloat__Group__5__Impl"


    // $ANTLR start "rule__VFloat__Group__6"
    // InternalVmsc.g:6592:1: rule__VFloat__Group__6 : rule__VFloat__Group__6__Impl ;
    public final void rule__VFloat__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6596:1: ( rule__VFloat__Group__6__Impl )
            // InternalVmsc.g:6597:2: rule__VFloat__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VFloat__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VFloat__Group__6"


    // $ANTLR start "rule__VFloat__Group__6__Impl"
    // InternalVmsc.g:6603:1: rule__VFloat__Group__6__Impl : ( ( ',' )? ) ;
    public final void rule__VFloat__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6607:1: ( ( ( ',' )? ) )
            // InternalVmsc.g:6608:1: ( ( ',' )? )
            {
            // InternalVmsc.g:6608:1: ( ( ',' )? )
            // InternalVmsc.g:6609:2: ( ',' )?
            {
             before(grammarAccess.getVFloatAccess().getCommaKeyword_6()); 
            // InternalVmsc.g:6610:2: ( ',' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==11) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalVmsc.g:6610:3: ','
                    {
                    match(input,11,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getVFloatAccess().getCommaKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VFloat__Group__6__Impl"


    // $ANTLR start "rule__EFloat__Group__0"
    // InternalVmsc.g:6619:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6623:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // InternalVmsc.g:6624:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__EFloat__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__0"


    // $ANTLR start "rule__EFloat__Group__0__Impl"
    // InternalVmsc.g:6631:1: rule__EFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6635:1: ( ( ( '-' )? ) )
            // InternalVmsc.g:6636:1: ( ( '-' )? )
            {
            // InternalVmsc.g:6636:1: ( ( '-' )? )
            // InternalVmsc.g:6637:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalVmsc.g:6638:2: ( '-' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==30) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalVmsc.g:6638:3: '-'
                    {
                    match(input,30,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__0__Impl"


    // $ANTLR start "rule__EFloat__Group__1"
    // InternalVmsc.g:6646:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6650:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // InternalVmsc.g:6651:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__EFloat__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__1"


    // $ANTLR start "rule__EFloat__Group__1__Impl"
    // InternalVmsc.g:6658:1: rule__EFloat__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6662:1: ( ( ( RULE_INT )? ) )
            // InternalVmsc.g:6663:1: ( ( RULE_INT )? )
            {
            // InternalVmsc.g:6663:1: ( ( RULE_INT )? )
            // InternalVmsc.g:6664:2: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
            // InternalVmsc.g:6665:2: ( RULE_INT )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_INT) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalVmsc.g:6665:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__1__Impl"


    // $ANTLR start "rule__EFloat__Group__2"
    // InternalVmsc.g:6673:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl rule__EFloat__Group__3 ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6677:1: ( rule__EFloat__Group__2__Impl rule__EFloat__Group__3 )
            // InternalVmsc.g:6678:2: rule__EFloat__Group__2__Impl rule__EFloat__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__EFloat__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__2"


    // $ANTLR start "rule__EFloat__Group__2__Impl"
    // InternalVmsc.g:6685:1: rule__EFloat__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6689:1: ( ( '.' ) )
            // InternalVmsc.g:6690:1: ( '.' )
            {
            // InternalVmsc.g:6690:1: ( '.' )
            // InternalVmsc.g:6691:2: '.'
            {
             before(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__2__Impl"


    // $ANTLR start "rule__EFloat__Group__3"
    // InternalVmsc.g:6700:1: rule__EFloat__Group__3 : rule__EFloat__Group__3__Impl rule__EFloat__Group__4 ;
    public final void rule__EFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6704:1: ( rule__EFloat__Group__3__Impl rule__EFloat__Group__4 )
            // InternalVmsc.g:6705:2: rule__EFloat__Group__3__Impl rule__EFloat__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__EFloat__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__3"


    // $ANTLR start "rule__EFloat__Group__3__Impl"
    // InternalVmsc.g:6712:1: rule__EFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6716:1: ( ( RULE_INT ) )
            // InternalVmsc.g:6717:1: ( RULE_INT )
            {
            // InternalVmsc.g:6717:1: ( RULE_INT )
            // InternalVmsc.g:6718:2: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__3__Impl"


    // $ANTLR start "rule__EFloat__Group__4"
    // InternalVmsc.g:6727:1: rule__EFloat__Group__4 : rule__EFloat__Group__4__Impl ;
    public final void rule__EFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6731:1: ( rule__EFloat__Group__4__Impl )
            // InternalVmsc.g:6732:2: rule__EFloat__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__4"


    // $ANTLR start "rule__EFloat__Group__4__Impl"
    // InternalVmsc.g:6738:1: rule__EFloat__Group__4__Impl : ( ( rule__EFloat__Group_4__0 )? ) ;
    public final void rule__EFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6742:1: ( ( ( rule__EFloat__Group_4__0 )? ) )
            // InternalVmsc.g:6743:1: ( ( rule__EFloat__Group_4__0 )? )
            {
            // InternalVmsc.g:6743:1: ( ( rule__EFloat__Group_4__0 )? )
            // InternalVmsc.g:6744:2: ( rule__EFloat__Group_4__0 )?
            {
             before(grammarAccess.getEFloatAccess().getGroup_4()); 
            // InternalVmsc.g:6745:2: ( rule__EFloat__Group_4__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=13 && LA45_0<=14)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalVmsc.g:6745:3: rule__EFloat__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EFloat__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__4__Impl"


    // $ANTLR start "rule__EFloat__Group_4__0"
    // InternalVmsc.g:6754:1: rule__EFloat__Group_4__0 : rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 ;
    public final void rule__EFloat__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6758:1: ( rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 )
            // InternalVmsc.g:6759:2: rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1
            {
            pushFollow(FOLLOW_27);
            rule__EFloat__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__0"


    // $ANTLR start "rule__EFloat__Group_4__0__Impl"
    // InternalVmsc.g:6766:1: rule__EFloat__Group_4__0__Impl : ( ( rule__EFloat__Alternatives_4_0 ) ) ;
    public final void rule__EFloat__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6770:1: ( ( ( rule__EFloat__Alternatives_4_0 ) ) )
            // InternalVmsc.g:6771:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            {
            // InternalVmsc.g:6771:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            // InternalVmsc.g:6772:2: ( rule__EFloat__Alternatives_4_0 )
            {
             before(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 
            // InternalVmsc.g:6773:2: ( rule__EFloat__Alternatives_4_0 )
            // InternalVmsc.g:6773:3: rule__EFloat__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__0__Impl"


    // $ANTLR start "rule__EFloat__Group_4__1"
    // InternalVmsc.g:6781:1: rule__EFloat__Group_4__1 : rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 ;
    public final void rule__EFloat__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6785:1: ( rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 )
            // InternalVmsc.g:6786:2: rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2
            {
            pushFollow(FOLLOW_27);
            rule__EFloat__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__1"


    // $ANTLR start "rule__EFloat__Group_4__1__Impl"
    // InternalVmsc.g:6793:1: rule__EFloat__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6797:1: ( ( ( '-' )? ) )
            // InternalVmsc.g:6798:1: ( ( '-' )? )
            {
            // InternalVmsc.g:6798:1: ( ( '-' )? )
            // InternalVmsc.g:6799:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
            // InternalVmsc.g:6800:2: ( '-' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==30) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalVmsc.g:6800:3: '-'
                    {
                    match(input,30,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__1__Impl"


    // $ANTLR start "rule__EFloat__Group_4__2"
    // InternalVmsc.g:6808:1: rule__EFloat__Group_4__2 : rule__EFloat__Group_4__2__Impl ;
    public final void rule__EFloat__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6812:1: ( rule__EFloat__Group_4__2__Impl )
            // InternalVmsc.g:6813:2: rule__EFloat__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__2"


    // $ANTLR start "rule__EFloat__Group_4__2__Impl"
    // InternalVmsc.g:6819:1: rule__EFloat__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6823:1: ( ( RULE_INT ) )
            // InternalVmsc.g:6824:1: ( RULE_INT )
            {
            // InternalVmsc.g:6824:1: ( RULE_INT )
            // InternalVmsc.g:6825:2: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__2__Impl"


    // $ANTLR start "rule__VPackage__NameAssignment_6"
    // InternalVmsc.g:6835:1: rule__VPackage__NameAssignment_6 : ( ruleEString ) ;
    public final void rule__VPackage__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6839:1: ( ( ruleEString ) )
            // InternalVmsc.g:6840:2: ( ruleEString )
            {
            // InternalVmsc.g:6840:2: ( ruleEString )
            // InternalVmsc.g:6841:3: ruleEString
            {
             before(grammarAccess.getVPackageAccess().getNameEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVPackageAccess().getNameEStringParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__NameAssignment_6"


    // $ANTLR start "rule__VPackage__VPrefixAssignment_8_2"
    // InternalVmsc.g:6850:1: rule__VPackage__VPrefixAssignment_8_2 : ( ruleEString ) ;
    public final void rule__VPackage__VPrefixAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6854:1: ( ( ruleEString ) )
            // InternalVmsc.g:6855:2: ( ruleEString )
            {
            // InternalVmsc.g:6855:2: ( ruleEString )
            // InternalVmsc.g:6856:3: ruleEString
            {
             before(grammarAccess.getVPackageAccess().getVPrefixEStringParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVPackageAccess().getVPrefixEStringParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__VPrefixAssignment_8_2"


    // $ANTLR start "rule__VPackage__VUriAssignment_9_2"
    // InternalVmsc.g:6865:1: rule__VPackage__VUriAssignment_9_2 : ( ruleEString ) ;
    public final void rule__VPackage__VUriAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6869:1: ( ( ruleEString ) )
            // InternalVmsc.g:6870:2: ( ruleEString )
            {
            // InternalVmsc.g:6870:2: ( ruleEString )
            // InternalVmsc.g:6871:3: ruleEString
            {
             before(grammarAccess.getVPackageAccess().getVUriEStringParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVPackageAccess().getVUriEStringParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__VUriAssignment_9_2"


    // $ANTLR start "rule__VPackage__VComponentsAssignment_10_4"
    // InternalVmsc.g:6880:1: rule__VPackage__VComponentsAssignment_10_4 : ( ruleVStructuralComponent ) ;
    public final void rule__VPackage__VComponentsAssignment_10_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6884:1: ( ( ruleVStructuralComponent ) )
            // InternalVmsc.g:6885:2: ( ruleVStructuralComponent )
            {
            // InternalVmsc.g:6885:2: ( ruleVStructuralComponent )
            // InternalVmsc.g:6886:3: ruleVStructuralComponent
            {
             before(grammarAccess.getVPackageAccess().getVComponentsVStructuralComponentParserRuleCall_10_4_0()); 
            pushFollow(FOLLOW_2);
            ruleVStructuralComponent();

            state._fsp--;

             after(grammarAccess.getVPackageAccess().getVComponentsVStructuralComponentParserRuleCall_10_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__VComponentsAssignment_10_4"


    // $ANTLR start "rule__VPackage__VComponentsAssignment_10_6_2"
    // InternalVmsc.g:6895:1: rule__VPackage__VComponentsAssignment_10_6_2 : ( ruleVStructuralComponent ) ;
    public final void rule__VPackage__VComponentsAssignment_10_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6899:1: ( ( ruleVStructuralComponent ) )
            // InternalVmsc.g:6900:2: ( ruleVStructuralComponent )
            {
            // InternalVmsc.g:6900:2: ( ruleVStructuralComponent )
            // InternalVmsc.g:6901:3: ruleVStructuralComponent
            {
             before(grammarAccess.getVPackageAccess().getVComponentsVStructuralComponentParserRuleCall_10_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVStructuralComponent();

            state._fsp--;

             after(grammarAccess.getVPackageAccess().getVComponentsVStructuralComponentParserRuleCall_10_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPackage__VComponentsAssignment_10_6_2"


    // $ANTLR start "rule__VEnum__NameAssignment_6"
    // InternalVmsc.g:6910:1: rule__VEnum__NameAssignment_6 : ( ruleEString ) ;
    public final void rule__VEnum__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6914:1: ( ( ruleEString ) )
            // InternalVmsc.g:6915:2: ( ruleEString )
            {
            // InternalVmsc.g:6915:2: ( ruleEString )
            // InternalVmsc.g:6916:3: ruleEString
            {
             before(grammarAccess.getVEnumAccess().getNameEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVEnumAccess().getNameEStringParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VEnum__NameAssignment_6"


    // $ANTLR start "rule__VEnum__IsSerializableAssignment_8_0"
    // InternalVmsc.g:6925:1: rule__VEnum__IsSerializableAssignment_8_0 : ( ( 'IsSerializable' ) ) ;
    public final void rule__VEnum__IsSerializableAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6929:1: ( ( ( 'IsSerializable' ) ) )
            // InternalVmsc.g:6930:2: ( ( 'IsSerializable' ) )
            {
            // InternalVmsc.g:6930:2: ( ( 'IsSerializable' ) )
            // InternalVmsc.g:6931:3: ( 'IsSerializable' )
            {
             before(grammarAccess.getVEnumAccess().getIsSerializableIsSerializableKeyword_8_0_0()); 
            // InternalVmsc.g:6932:3: ( 'IsSerializable' )
            // InternalVmsc.g:6933:4: 'IsSerializable'
            {
             before(grammarAccess.getVEnumAccess().getIsSerializableIsSerializableKeyword_8_0_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getVEnumAccess().getIsSerializableIsSerializableKeyword_8_0_0()); 

            }

             after(grammarAccess.getVEnumAccess().getIsSerializableIsSerializableKeyword_8_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VEnum__IsSerializableAssignment_8_0"


    // $ANTLR start "rule__VDatatype_Impl__NameAssignment_6"
    // InternalVmsc.g:6944:1: rule__VDatatype_Impl__NameAssignment_6 : ( ruleEString ) ;
    public final void rule__VDatatype_Impl__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6948:1: ( ( ruleEString ) )
            // InternalVmsc.g:6949:2: ( ruleEString )
            {
            // InternalVmsc.g:6949:2: ( ruleEString )
            // InternalVmsc.g:6950:3: ruleEString
            {
             before(grammarAccess.getVDatatype_ImplAccess().getNameEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVDatatype_ImplAccess().getNameEStringParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VDatatype_Impl__NameAssignment_6"


    // $ANTLR start "rule__VDatatype_Impl__IsSerializableAssignment_8_0"
    // InternalVmsc.g:6959:1: rule__VDatatype_Impl__IsSerializableAssignment_8_0 : ( ( 'IsSerializable' ) ) ;
    public final void rule__VDatatype_Impl__IsSerializableAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6963:1: ( ( ( 'IsSerializable' ) ) )
            // InternalVmsc.g:6964:2: ( ( 'IsSerializable' ) )
            {
            // InternalVmsc.g:6964:2: ( ( 'IsSerializable' ) )
            // InternalVmsc.g:6965:3: ( 'IsSerializable' )
            {
             before(grammarAccess.getVDatatype_ImplAccess().getIsSerializableIsSerializableKeyword_8_0_0()); 
            // InternalVmsc.g:6966:3: ( 'IsSerializable' )
            // InternalVmsc.g:6967:4: 'IsSerializable'
            {
             before(grammarAccess.getVDatatype_ImplAccess().getIsSerializableIsSerializableKeyword_8_0_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getVDatatype_ImplAccess().getIsSerializableIsSerializableKeyword_8_0_0()); 

            }

             after(grammarAccess.getVDatatype_ImplAccess().getIsSerializableIsSerializableKeyword_8_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VDatatype_Impl__IsSerializableAssignment_8_0"


    // $ANTLR start "rule__VClass__NameAssignment_6"
    // InternalVmsc.g:6978:1: rule__VClass__NameAssignment_6 : ( ruleEString ) ;
    public final void rule__VClass__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6982:1: ( ( ruleEString ) )
            // InternalVmsc.g:6983:2: ( ruleEString )
            {
            // InternalVmsc.g:6983:2: ( ruleEString )
            // InternalVmsc.g:6984:3: ruleEString
            {
             before(grammarAccess.getVClassAccess().getNameEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVClassAccess().getNameEStringParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__NameAssignment_6"


    // $ANTLR start "rule__VClass__VStructural_featuresAssignment_8_4"
    // InternalVmsc.g:6993:1: rule__VClass__VStructural_featuresAssignment_8_4 : ( ruleVStructuralFeatures ) ;
    public final void rule__VClass__VStructural_featuresAssignment_8_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:6997:1: ( ( ruleVStructuralFeatures ) )
            // InternalVmsc.g:6998:2: ( ruleVStructuralFeatures )
            {
            // InternalVmsc.g:6998:2: ( ruleVStructuralFeatures )
            // InternalVmsc.g:6999:3: ruleVStructuralFeatures
            {
             before(grammarAccess.getVClassAccess().getVStructural_featuresVStructuralFeaturesParserRuleCall_8_4_0()); 
            pushFollow(FOLLOW_2);
            ruleVStructuralFeatures();

            state._fsp--;

             after(grammarAccess.getVClassAccess().getVStructural_featuresVStructuralFeaturesParserRuleCall_8_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__VStructural_featuresAssignment_8_4"


    // $ANTLR start "rule__VClass__VStructural_featuresAssignment_8_6_2"
    // InternalVmsc.g:7008:1: rule__VClass__VStructural_featuresAssignment_8_6_2 : ( ruleVStructuralFeatures ) ;
    public final void rule__VClass__VStructural_featuresAssignment_8_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:7012:1: ( ( ruleVStructuralFeatures ) )
            // InternalVmsc.g:7013:2: ( ruleVStructuralFeatures )
            {
            // InternalVmsc.g:7013:2: ( ruleVStructuralFeatures )
            // InternalVmsc.g:7014:3: ruleVStructuralFeatures
            {
             before(grammarAccess.getVClassAccess().getVStructural_featuresVStructuralFeaturesParserRuleCall_8_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVStructuralFeatures();

            state._fsp--;

             after(grammarAccess.getVClassAccess().getVStructural_featuresVStructuralFeaturesParserRuleCall_8_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__VStructural_featuresAssignment_8_6_2"


    // $ANTLR start "rule__VClass__VSuperTypeAssignment_9_3"
    // InternalVmsc.g:7023:1: rule__VClass__VSuperTypeAssignment_9_3 : ( ( ruleEString ) ) ;
    public final void rule__VClass__VSuperTypeAssignment_9_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:7027:1: ( ( ( ruleEString ) ) )
            // InternalVmsc.g:7028:2: ( ( ruleEString ) )
            {
            // InternalVmsc.g:7028:2: ( ( ruleEString ) )
            // InternalVmsc.g:7029:3: ( ruleEString )
            {
             before(grammarAccess.getVClassAccess().getVSuperTypeVClassCrossReference_9_3_0()); 
            // InternalVmsc.g:7030:3: ( ruleEString )
            // InternalVmsc.g:7031:4: ruleEString
            {
             before(grammarAccess.getVClassAccess().getVSuperTypeVClassEStringParserRuleCall_9_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVClassAccess().getVSuperTypeVClassEStringParserRuleCall_9_3_0_1()); 

            }

             after(grammarAccess.getVClassAccess().getVSuperTypeVClassCrossReference_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__VSuperTypeAssignment_9_3"


    // $ANTLR start "rule__VClass__VSuperTypeAssignment_9_4_1"
    // InternalVmsc.g:7042:1: rule__VClass__VSuperTypeAssignment_9_4_1 : ( ( ruleEString ) ) ;
    public final void rule__VClass__VSuperTypeAssignment_9_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:7046:1: ( ( ( ruleEString ) ) )
            // InternalVmsc.g:7047:2: ( ( ruleEString ) )
            {
            // InternalVmsc.g:7047:2: ( ( ruleEString ) )
            // InternalVmsc.g:7048:3: ( ruleEString )
            {
             before(grammarAccess.getVClassAccess().getVSuperTypeVClassCrossReference_9_4_1_0()); 
            // InternalVmsc.g:7049:3: ( ruleEString )
            // InternalVmsc.g:7050:4: ruleEString
            {
             before(grammarAccess.getVClassAccess().getVSuperTypeVClassEStringParserRuleCall_9_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVClassAccess().getVSuperTypeVClassEStringParserRuleCall_9_4_1_0_1()); 

            }

             after(grammarAccess.getVClassAccess().getVSuperTypeVClassCrossReference_9_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__VSuperTypeAssignment_9_4_1"


    // $ANTLR start "rule__VClass__IsAbstractAssignment_10_0"
    // InternalVmsc.g:7061:1: rule__VClass__IsAbstractAssignment_10_0 : ( ( 'IsAbstract' ) ) ;
    public final void rule__VClass__IsAbstractAssignment_10_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:7065:1: ( ( ( 'IsAbstract' ) ) )
            // InternalVmsc.g:7066:2: ( ( 'IsAbstract' ) )
            {
            // InternalVmsc.g:7066:2: ( ( 'IsAbstract' ) )
            // InternalVmsc.g:7067:3: ( 'IsAbstract' )
            {
             before(grammarAccess.getVClassAccess().getIsAbstractIsAbstractKeyword_10_0_0()); 
            // InternalVmsc.g:7068:3: ( 'IsAbstract' )
            // InternalVmsc.g:7069:4: 'IsAbstract'
            {
             before(grammarAccess.getVClassAccess().getIsAbstractIsAbstractKeyword_10_0_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getVClassAccess().getIsAbstractIsAbstractKeyword_10_0_0()); 

            }

             after(grammarAccess.getVClassAccess().getIsAbstractIsAbstractKeyword_10_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__IsAbstractAssignment_10_0"


    // $ANTLR start "rule__VClass__IsInterfaceAssignment_11_0"
    // InternalVmsc.g:7080:1: rule__VClass__IsInterfaceAssignment_11_0 : ( ( 'IsInterface' ) ) ;
    public final void rule__VClass__IsInterfaceAssignment_11_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:7084:1: ( ( ( 'IsInterface' ) ) )
            // InternalVmsc.g:7085:2: ( ( 'IsInterface' ) )
            {
            // InternalVmsc.g:7085:2: ( ( 'IsInterface' ) )
            // InternalVmsc.g:7086:3: ( 'IsInterface' )
            {
             before(grammarAccess.getVClassAccess().getIsInterfaceIsInterfaceKeyword_11_0_0()); 
            // InternalVmsc.g:7087:3: ( 'IsInterface' )
            // InternalVmsc.g:7088:4: 'IsInterface'
            {
             before(grammarAccess.getVClassAccess().getIsInterfaceIsInterfaceKeyword_11_0_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getVClassAccess().getIsInterfaceIsInterfaceKeyword_11_0_0()); 

            }

             after(grammarAccess.getVClassAccess().getIsInterfaceIsInterfaceKeyword_11_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VClass__IsInterfaceAssignment_11_0"


    // $ANTLR start "rule__VAttribute__NameAssignment_6"
    // InternalVmsc.g:7099:1: rule__VAttribute__NameAssignment_6 : ( ruleEString ) ;
    public final void rule__VAttribute__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:7103:1: ( ( ruleEString ) )
            // InternalVmsc.g:7104:2: ( ruleEString )
            {
            // InternalVmsc.g:7104:2: ( ruleEString )
            // InternalVmsc.g:7105:3: ruleEString
            {
             before(grammarAccess.getVAttributeAccess().getNameEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVAttributeAccess().getNameEStringParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__NameAssignment_6"


    // $ANTLR start "rule__VAttribute__IsChangeableAssignment_8"
    // InternalVmsc.g:7114:1: rule__VAttribute__IsChangeableAssignment_8 : ( ( 'IsChangeable' ) ) ;
    public final void rule__VAttribute__IsChangeableAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:7118:1: ( ( ( 'IsChangeable' ) ) )
            // InternalVmsc.g:7119:2: ( ( 'IsChangeable' ) )
            {
            // InternalVmsc.g:7119:2: ( ( 'IsChangeable' ) )
            // InternalVmsc.g:7120:3: ( 'IsChangeable' )
            {
             before(grammarAccess.getVAttributeAccess().getIsChangeableIsChangeableKeyword_8_0()); 
            // InternalVmsc.g:7121:3: ( 'IsChangeable' )
            // InternalVmsc.g:7122:4: 'IsChangeable'
            {
             before(grammarAccess.getVAttributeAccess().getIsChangeableIsChangeableKeyword_8_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getVAttributeAccess().getIsChangeableIsChangeableKeyword_8_0()); 

            }

             after(grammarAccess.getVAttributeAccess().getIsChangeableIsChangeableKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__IsChangeableAssignment_8"


    // $ANTLR start "rule__VAttribute__IsOrderedAssignment_9"
    // InternalVmsc.g:7133:1: rule__VAttribute__IsOrderedAssignment_9 : ( ( 'IsOrdered' ) ) ;
    public final void rule__VAttribute__IsOrderedAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:7137:1: ( ( ( 'IsOrdered' ) ) )
            // InternalVmsc.g:7138:2: ( ( 'IsOrdered' ) )
            {
            // InternalVmsc.g:7138:2: ( ( 'IsOrdered' ) )
            // InternalVmsc.g:7139:3: ( 'IsOrdered' )
            {
             before(grammarAccess.getVAttributeAccess().getIsOrderedIsOrderedKeyword_9_0()); 
            // InternalVmsc.g:7140:3: ( 'IsOrdered' )
            // InternalVmsc.g:7141:4: 'IsOrdered'
            {
             before(grammarAccess.getVAttributeAccess().getIsOrderedIsOrderedKeyword_9_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getVAttributeAccess().getIsOrderedIsOrderedKeyword_9_0()); 

            }

             after(grammarAccess.getVAttributeAccess().getIsOrderedIsOrderedKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__IsOrderedAssignment_9"


    // $ANTLR start "rule__VAttribute__IsTransientAssignment_10"
    // InternalVmsc.g:7152:1: rule__VAttribute__IsTransientAssignment_10 : ( ( 'IsTransient' ) ) ;
    public final void rule__VAttribute__IsTransientAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:7156:1: ( ( ( 'IsTransient' ) ) )
            // InternalVmsc.g:7157:2: ( ( 'IsTransient' ) )
            {
            // InternalVmsc.g:7157:2: ( ( 'IsTransient' ) )
            // InternalVmsc.g:7158:3: ( 'IsTransient' )
            {
             before(grammarAccess.getVAttributeAccess().getIsTransientIsTransientKeyword_10_0()); 
            // InternalVmsc.g:7159:3: ( 'IsTransient' )
            // InternalVmsc.g:7160:4: 'IsTransient'
            {
             before(grammarAccess.getVAttributeAccess().getIsTransientIsTransientKeyword_10_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getVAttributeAccess().getIsTransientIsTransientKeyword_10_0()); 

            }

             after(grammarAccess.getVAttributeAccess().getIsTransientIsTransientKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__IsTransientAssignment_10"


    // $ANTLR start "rule__VAttribute__IsUnsettableAssignment_11"
    // InternalVmsc.g:7171:1: rule__VAttribute__IsUnsettableAssignment_11 : ( ( 'IsUnsettable' ) ) ;
    public final void rule__VAttribute__IsUnsettableAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:7175:1: ( ( ( 'IsUnsettable' ) ) )
            // InternalVmsc.g:7176:2: ( ( 'IsUnsettable' ) )
            {
            // InternalVmsc.g:7176:2: ( ( 'IsUnsettable' ) )
            // InternalVmsc.g:7177:3: ( 'IsUnsettable' )
            {
             before(grammarAccess.getVAttributeAccess().getIsUnsettableIsUnsettableKeyword_11_0()); 
            // InternalVmsc.g:7178:3: ( 'IsUnsettable' )
            // InternalVmsc.g:7179:4: 'IsUnsettable'
            {
             before(grammarAccess.getVAttributeAccess().getIsUnsettableIsUnsettableKeyword_11_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getVAttributeAccess().getIsUnsettableIsUnsettableKeyword_11_0()); 

            }

             after(grammarAccess.getVAttributeAccess().getIsUnsettableIsUnsettableKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__IsUnsettableAssignment_11"


    // $ANTLR start "rule__VAttribute__IsVolatileAssignment_12"
    // InternalVmsc.g:7190:1: rule__VAttribute__IsVolatileAssignment_12 : ( ( 'IsVolatile' ) ) ;
    public final void rule__VAttribute__IsVolatileAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:7194:1: ( ( ( 'IsVolatile' ) ) )
            // InternalVmsc.g:7195:2: ( ( 'IsVolatile' ) )
            {
            // InternalVmsc.g:7195:2: ( ( 'IsVolatile' ) )
            // InternalVmsc.g:7196:3: ( 'IsVolatile' )
            {
             before(grammarAccess.getVAttributeAccess().getIsVolatileIsVolatileKeyword_12_0()); 
            // InternalVmsc.g:7197:3: ( 'IsVolatile' )
            // InternalVmsc.g:7198:4: 'IsVolatile'
            {
             before(grammarAccess.getVAttributeAccess().getIsVolatileIsVolatileKeyword_12_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getVAttributeAccess().getIsVolatileIsVolatileKeyword_12_0()); 

            }

             after(grammarAccess.getVAttributeAccess().getIsVolatileIsVolatileKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__IsVolatileAssignment_12"


    // $ANTLR start "rule__VAttribute__IsDerivedAssignment_13"
    // InternalVmsc.g:7209:1: rule__VAttribute__IsDerivedAssignment_13 : ( ( 'IsDerived' ) ) ;
    public final void rule__VAttribute__IsDerivedAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:7213:1: ( ( ( 'IsDerived' ) ) )
            // InternalVmsc.g:7214:2: ( ( 'IsDerived' ) )
            {
            // InternalVmsc.g:7214:2: ( ( 'IsDerived' ) )
            // InternalVmsc.g:7215:3: ( 'IsDerived' )
            {
             before(grammarAccess.getVAttributeAccess().getIsDerivedIsDerivedKeyword_13_0()); 
            // InternalVmsc.g:7216:3: ( 'IsDerived' )
            // InternalVmsc.g:7217:4: 'IsDerived'
            {
             before(grammarAccess.getVAttributeAccess().getIsDerivedIsDerivedKeyword_13_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getVAttributeAccess().getIsDerivedIsDerivedKeyword_13_0()); 

            }

             after(grammarAccess.getVAttributeAccess().getIsDerivedIsDerivedKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__IsDerivedAssignment_13"


    // $ANTLR start "rule__VAttribute__IsUniqueAssignment_14"
    // InternalVmsc.g:7228:1: rule__VAttribute__IsUniqueAssignment_14 : ( ( 'IsUnique' ) ) ;
    public final void rule__VAttribute__IsUniqueAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:7232:1: ( ( ( 'IsUnique' ) ) )
            // InternalVmsc.g:7233:2: ( ( 'IsUnique' ) )
            {
            // InternalVmsc.g:7233:2: ( ( 'IsUnique' ) )
            // InternalVmsc.g:7234:3: ( 'IsUnique' )
            {
             before(grammarAccess.getVAttributeAccess().getIsUniqueIsUniqueKeyword_14_0()); 
            // InternalVmsc.g:7235:3: ( 'IsUnique' )
            // InternalVmsc.g:7236:4: 'IsUnique'
            {
             before(grammarAccess.getVAttributeAccess().getIsUniqueIsUniqueKeyword_14_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getVAttributeAccess().getIsUniqueIsUniqueKeyword_14_0()); 

            }

             after(grammarAccess.getVAttributeAccess().getIsUniqueIsUniqueKeyword_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__IsUniqueAssignment_14"


    // $ANTLR start "rule__VAttribute__LowerBoundAssignment_15_2"
    // InternalVmsc.g:7247:1: rule__VAttribute__LowerBoundAssignment_15_2 : ( ruleEInt ) ;
    public final void rule__VAttribute__LowerBoundAssignment_15_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:7251:1: ( ( ruleEInt ) )
            // InternalVmsc.g:7252:2: ( ruleEInt )
            {
            // InternalVmsc.g:7252:2: ( ruleEInt )
            // InternalVmsc.g:7253:3: ruleEInt
            {
             before(grammarAccess.getVAttributeAccess().getLowerBoundEIntParserRuleCall_15_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getVAttributeAccess().getLowerBoundEIntParserRuleCall_15_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__LowerBoundAssignment_15_2"


    // $ANTLR start "rule__VAttribute__UpperBoundAssignment_16_2"
    // InternalVmsc.g:7262:1: rule__VAttribute__UpperBoundAssignment_16_2 : ( ruleEInt ) ;
    public final void rule__VAttribute__UpperBoundAssignment_16_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:7266:1: ( ( ruleEInt ) )
            // InternalVmsc.g:7267:2: ( ruleEInt )
            {
            // InternalVmsc.g:7267:2: ( ruleEInt )
            // InternalVmsc.g:7268:3: ruleEInt
            {
             before(grammarAccess.getVAttributeAccess().getUpperBoundEIntParserRuleCall_16_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getVAttributeAccess().getUpperBoundEIntParserRuleCall_16_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__UpperBoundAssignment_16_2"


    // $ANTLR start "rule__VAttribute__VTypeAssignment_17_2"
    // InternalVmsc.g:7277:1: rule__VAttribute__VTypeAssignment_17_2 : ( ruleVType ) ;
    public final void rule__VAttribute__VTypeAssignment_17_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:7281:1: ( ( ruleVType ) )
            // InternalVmsc.g:7282:2: ( ruleVType )
            {
            // InternalVmsc.g:7282:2: ( ruleVType )
            // InternalVmsc.g:7283:3: ruleVType
            {
             before(grammarAccess.getVAttributeAccess().getVTypeVTypeParserRuleCall_17_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVType();

            state._fsp--;

             after(grammarAccess.getVAttributeAccess().getVTypeVTypeParserRuleCall_17_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAttribute__VTypeAssignment_17_2"


    // $ANTLR start "rule__VReference__NameAssignment_6"
    // InternalVmsc.g:7292:1: rule__VReference__NameAssignment_6 : ( ruleEString ) ;
    public final void rule__VReference__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:7296:1: ( ( ruleEString ) )
            // InternalVmsc.g:7297:2: ( ruleEString )
            {
            // InternalVmsc.g:7297:2: ( ruleEString )
            // InternalVmsc.g:7298:3: ruleEString
            {
             before(grammarAccess.getVReferenceAccess().getNameEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVReferenceAccess().getNameEStringParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__NameAssignment_6"


    // $ANTLR start "rule__VReference__IsChangeableAssignment_8_0"
    // InternalVmsc.g:7307:1: rule__VReference__IsChangeableAssignment_8_0 : ( ( 'IsChangeable' ) ) ;
    public final void rule__VReference__IsChangeableAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:7311:1: ( ( ( 'IsChangeable' ) ) )
            // InternalVmsc.g:7312:2: ( ( 'IsChangeable' ) )
            {
            // InternalVmsc.g:7312:2: ( ( 'IsChangeable' ) )
            // InternalVmsc.g:7313:3: ( 'IsChangeable' )
            {
             before(grammarAccess.getVReferenceAccess().getIsChangeableIsChangeableKeyword_8_0_0()); 
            // InternalVmsc.g:7314:3: ( 'IsChangeable' )
            // InternalVmsc.g:7315:4: 'IsChangeable'
            {
             before(grammarAccess.getVReferenceAccess().getIsChangeableIsChangeableKeyword_8_0_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getIsChangeableIsChangeableKeyword_8_0_0()); 

            }

             after(grammarAccess.getVReferenceAccess().getIsChangeableIsChangeableKeyword_8_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__IsChangeableAssignment_8_0"


    // $ANTLR start "rule__VReference__IsOrderedAssignment_9_0"
    // InternalVmsc.g:7326:1: rule__VReference__IsOrderedAssignment_9_0 : ( ( 'IsOrdered' ) ) ;
    public final void rule__VReference__IsOrderedAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:7330:1: ( ( ( 'IsOrdered' ) ) )
            // InternalVmsc.g:7331:2: ( ( 'IsOrdered' ) )
            {
            // InternalVmsc.g:7331:2: ( ( 'IsOrdered' ) )
            // InternalVmsc.g:7332:3: ( 'IsOrdered' )
            {
             before(grammarAccess.getVReferenceAccess().getIsOrderedIsOrderedKeyword_9_0_0()); 
            // InternalVmsc.g:7333:3: ( 'IsOrdered' )
            // InternalVmsc.g:7334:4: 'IsOrdered'
            {
             before(grammarAccess.getVReferenceAccess().getIsOrderedIsOrderedKeyword_9_0_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getIsOrderedIsOrderedKeyword_9_0_0()); 

            }

             after(grammarAccess.getVReferenceAccess().getIsOrderedIsOrderedKeyword_9_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__IsOrderedAssignment_9_0"


    // $ANTLR start "rule__VReference__IsTransientAssignment_10_0"
    // InternalVmsc.g:7345:1: rule__VReference__IsTransientAssignment_10_0 : ( ( 'IsTransient' ) ) ;
    public final void rule__VReference__IsTransientAssignment_10_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:7349:1: ( ( ( 'IsTransient' ) ) )
            // InternalVmsc.g:7350:2: ( ( 'IsTransient' ) )
            {
            // InternalVmsc.g:7350:2: ( ( 'IsTransient' ) )
            // InternalVmsc.g:7351:3: ( 'IsTransient' )
            {
             before(grammarAccess.getVReferenceAccess().getIsTransientIsTransientKeyword_10_0_0()); 
            // InternalVmsc.g:7352:3: ( 'IsTransient' )
            // InternalVmsc.g:7353:4: 'IsTransient'
            {
             before(grammarAccess.getVReferenceAccess().getIsTransientIsTransientKeyword_10_0_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getIsTransientIsTransientKeyword_10_0_0()); 

            }

             after(grammarAccess.getVReferenceAccess().getIsTransientIsTransientKeyword_10_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__IsTransientAssignment_10_0"


    // $ANTLR start "rule__VReference__IsUnsettableAssignment_11_0"
    // InternalVmsc.g:7364:1: rule__VReference__IsUnsettableAssignment_11_0 : ( ( 'IsUnsettable' ) ) ;
    public final void rule__VReference__IsUnsettableAssignment_11_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:7368:1: ( ( ( 'IsUnsettable' ) ) )
            // InternalVmsc.g:7369:2: ( ( 'IsUnsettable' ) )
            {
            // InternalVmsc.g:7369:2: ( ( 'IsUnsettable' ) )
            // InternalVmsc.g:7370:3: ( 'IsUnsettable' )
            {
             before(grammarAccess.getVReferenceAccess().getIsUnsettableIsUnsettableKeyword_11_0_0()); 
            // InternalVmsc.g:7371:3: ( 'IsUnsettable' )
            // InternalVmsc.g:7372:4: 'IsUnsettable'
            {
             before(grammarAccess.getVReferenceAccess().getIsUnsettableIsUnsettableKeyword_11_0_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getIsUnsettableIsUnsettableKeyword_11_0_0()); 

            }

             after(grammarAccess.getVReferenceAccess().getIsUnsettableIsUnsettableKeyword_11_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__IsUnsettableAssignment_11_0"


    // $ANTLR start "rule__VReference__IsVolatileAssignment_12_0"
    // InternalVmsc.g:7383:1: rule__VReference__IsVolatileAssignment_12_0 : ( ( 'IsVolatile' ) ) ;
    public final void rule__VReference__IsVolatileAssignment_12_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:7387:1: ( ( ( 'IsVolatile' ) ) )
            // InternalVmsc.g:7388:2: ( ( 'IsVolatile' ) )
            {
            // InternalVmsc.g:7388:2: ( ( 'IsVolatile' ) )
            // InternalVmsc.g:7389:3: ( 'IsVolatile' )
            {
             before(grammarAccess.getVReferenceAccess().getIsVolatileIsVolatileKeyword_12_0_0()); 
            // InternalVmsc.g:7390:3: ( 'IsVolatile' )
            // InternalVmsc.g:7391:4: 'IsVolatile'
            {
             before(grammarAccess.getVReferenceAccess().getIsVolatileIsVolatileKeyword_12_0_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getIsVolatileIsVolatileKeyword_12_0_0()); 

            }

             after(grammarAccess.getVReferenceAccess().getIsVolatileIsVolatileKeyword_12_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__IsVolatileAssignment_12_0"


    // $ANTLR start "rule__VReference__IsDerivedAssignment_13_0"
    // InternalVmsc.g:7402:1: rule__VReference__IsDerivedAssignment_13_0 : ( ( 'IsDerived' ) ) ;
    public final void rule__VReference__IsDerivedAssignment_13_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:7406:1: ( ( ( 'IsDerived' ) ) )
            // InternalVmsc.g:7407:2: ( ( 'IsDerived' ) )
            {
            // InternalVmsc.g:7407:2: ( ( 'IsDerived' ) )
            // InternalVmsc.g:7408:3: ( 'IsDerived' )
            {
             before(grammarAccess.getVReferenceAccess().getIsDerivedIsDerivedKeyword_13_0_0()); 
            // InternalVmsc.g:7409:3: ( 'IsDerived' )
            // InternalVmsc.g:7410:4: 'IsDerived'
            {
             before(grammarAccess.getVReferenceAccess().getIsDerivedIsDerivedKeyword_13_0_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getIsDerivedIsDerivedKeyword_13_0_0()); 

            }

             after(grammarAccess.getVReferenceAccess().getIsDerivedIsDerivedKeyword_13_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__IsDerivedAssignment_13_0"


    // $ANTLR start "rule__VReference__IsUniqueAssignment_14_0"
    // InternalVmsc.g:7421:1: rule__VReference__IsUniqueAssignment_14_0 : ( ( 'IsUnique' ) ) ;
    public final void rule__VReference__IsUniqueAssignment_14_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:7425:1: ( ( ( 'IsUnique' ) ) )
            // InternalVmsc.g:7426:2: ( ( 'IsUnique' ) )
            {
            // InternalVmsc.g:7426:2: ( ( 'IsUnique' ) )
            // InternalVmsc.g:7427:3: ( 'IsUnique' )
            {
             before(grammarAccess.getVReferenceAccess().getIsUniqueIsUniqueKeyword_14_0_0()); 
            // InternalVmsc.g:7428:3: ( 'IsUnique' )
            // InternalVmsc.g:7429:4: 'IsUnique'
            {
             before(grammarAccess.getVReferenceAccess().getIsUniqueIsUniqueKeyword_14_0_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getIsUniqueIsUniqueKeyword_14_0_0()); 

            }

             after(grammarAccess.getVReferenceAccess().getIsUniqueIsUniqueKeyword_14_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__IsUniqueAssignment_14_0"


    // $ANTLR start "rule__VReference__IsContainerAssignment_15_0"
    // InternalVmsc.g:7440:1: rule__VReference__IsContainerAssignment_15_0 : ( ( 'IsContainer' ) ) ;
    public final void rule__VReference__IsContainerAssignment_15_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:7444:1: ( ( ( 'IsContainer' ) ) )
            // InternalVmsc.g:7445:2: ( ( 'IsContainer' ) )
            {
            // InternalVmsc.g:7445:2: ( ( 'IsContainer' ) )
            // InternalVmsc.g:7446:3: ( 'IsContainer' )
            {
             before(grammarAccess.getVReferenceAccess().getIsContainerIsContainerKeyword_15_0_0()); 
            // InternalVmsc.g:7447:3: ( 'IsContainer' )
            // InternalVmsc.g:7448:4: 'IsContainer'
            {
             before(grammarAccess.getVReferenceAccess().getIsContainerIsContainerKeyword_15_0_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getIsContainerIsContainerKeyword_15_0_0()); 

            }

             after(grammarAccess.getVReferenceAccess().getIsContainerIsContainerKeyword_15_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__IsContainerAssignment_15_0"


    // $ANTLR start "rule__VReference__IsContainmentAssignment_16_0"
    // InternalVmsc.g:7459:1: rule__VReference__IsContainmentAssignment_16_0 : ( ( 'IsContainment' ) ) ;
    public final void rule__VReference__IsContainmentAssignment_16_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:7463:1: ( ( ( 'IsContainment' ) ) )
            // InternalVmsc.g:7464:2: ( ( 'IsContainment' ) )
            {
            // InternalVmsc.g:7464:2: ( ( 'IsContainment' ) )
            // InternalVmsc.g:7465:3: ( 'IsContainment' )
            {
             before(grammarAccess.getVReferenceAccess().getIsContainmentIsContainmentKeyword_16_0_0()); 
            // InternalVmsc.g:7466:3: ( 'IsContainment' )
            // InternalVmsc.g:7467:4: 'IsContainment'
            {
             before(grammarAccess.getVReferenceAccess().getIsContainmentIsContainmentKeyword_16_0_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getVReferenceAccess().getIsContainmentIsContainmentKeyword_16_0_0()); 

            }

             after(grammarAccess.getVReferenceAccess().getIsContainmentIsContainmentKeyword_16_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__IsContainmentAssignment_16_0"


    // $ANTLR start "rule__VReference__LowerBoundAssignment_17_2"
    // InternalVmsc.g:7478:1: rule__VReference__LowerBoundAssignment_17_2 : ( ruleEInt ) ;
    public final void rule__VReference__LowerBoundAssignment_17_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:7482:1: ( ( ruleEInt ) )
            // InternalVmsc.g:7483:2: ( ruleEInt )
            {
            // InternalVmsc.g:7483:2: ( ruleEInt )
            // InternalVmsc.g:7484:3: ruleEInt
            {
             before(grammarAccess.getVReferenceAccess().getLowerBoundEIntParserRuleCall_17_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getVReferenceAccess().getLowerBoundEIntParserRuleCall_17_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__LowerBoundAssignment_17_2"


    // $ANTLR start "rule__VReference__UpperBoundAssignment_18_2"
    // InternalVmsc.g:7493:1: rule__VReference__UpperBoundAssignment_18_2 : ( ruleEInt ) ;
    public final void rule__VReference__UpperBoundAssignment_18_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:7497:1: ( ( ruleEInt ) )
            // InternalVmsc.g:7498:2: ( ruleEInt )
            {
            // InternalVmsc.g:7498:2: ( ruleEInt )
            // InternalVmsc.g:7499:3: ruleEInt
            {
             before(grammarAccess.getVReferenceAccess().getUpperBoundEIntParserRuleCall_18_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getVReferenceAccess().getUpperBoundEIntParserRuleCall_18_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__UpperBoundAssignment_18_2"


    // $ANTLR start "rule__VReference__VTypeAssignment_19_2"
    // InternalVmsc.g:7508:1: rule__VReference__VTypeAssignment_19_2 : ( ruleVClass ) ;
    public final void rule__VReference__VTypeAssignment_19_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:7512:1: ( ( ruleVClass ) )
            // InternalVmsc.g:7513:2: ( ruleVClass )
            {
            // InternalVmsc.g:7513:2: ( ruleVClass )
            // InternalVmsc.g:7514:3: ruleVClass
            {
             before(grammarAccess.getVReferenceAccess().getVTypeVClassParserRuleCall_19_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVClass();

            state._fsp--;

             after(grammarAccess.getVReferenceAccess().getVTypeVClassParserRuleCall_19_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VReference__VTypeAssignment_19_2"


    // $ANTLR start "rule__VString__VContentAssignment_5"
    // InternalVmsc.g:7523:1: rule__VString__VContentAssignment_5 : ( ruleEString ) ;
    public final void rule__VString__VContentAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:7527:1: ( ( ruleEString ) )
            // InternalVmsc.g:7528:2: ( ruleEString )
            {
            // InternalVmsc.g:7528:2: ( ruleEString )
            // InternalVmsc.g:7529:3: ruleEString
            {
             before(grammarAccess.getVStringAccess().getVContentEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVStringAccess().getVContentEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VString__VContentAssignment_5"


    // $ANTLR start "rule__VInt__VContentAssignment_5"
    // InternalVmsc.g:7538:1: rule__VInt__VContentAssignment_5 : ( ruleEInt ) ;
    public final void rule__VInt__VContentAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:7542:1: ( ( ruleEInt ) )
            // InternalVmsc.g:7543:2: ( ruleEInt )
            {
            // InternalVmsc.g:7543:2: ( ruleEInt )
            // InternalVmsc.g:7544:3: ruleEInt
            {
             before(grammarAccess.getVIntAccess().getVContentEIntParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getVIntAccess().getVContentEIntParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VInt__VContentAssignment_5"


    // $ANTLR start "rule__VFloat__VContentAssignment_5"
    // InternalVmsc.g:7553:1: rule__VFloat__VContentAssignment_5 : ( ruleEFloat ) ;
    public final void rule__VFloat__VContentAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVmsc.g:7557:1: ( ( ruleEFloat ) )
            // InternalVmsc.g:7558:2: ( ruleEFloat )
            {
            // InternalVmsc.g:7558:2: ( ruleEFloat )
            // InternalVmsc.g:7559:3: ruleEFloat
            {
             before(grammarAccess.getVFloatAccess().getVContentEFloatParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getVFloatAccess().getVContentEFloatParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VFloat__VContentAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000201000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000D008000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000020000001000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000C0030001000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000880000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0007F00700001000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000D000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x001FF00700001000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010040000040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000006000L});

}