package yaml.helper.dsl.ide.contentassist.antlr.internal;

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
import yaml.helper.dsl.services.YamlGenDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalYamlGenDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_HELP_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'key'", "'name'", "'hint'", "'default'", "'values'", "'int'", "'float'", "'string'", "'list'", "'any'", "'import'", "'extends'", "'{'", "'}'", "'extend'", "'field'", "'fields'", "':'", "'('", "')'", "'['", "']'", "'root'", "'mandatory'", "'type'"
    };
    public static final int RULE_HELP_STRING=5;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalYamlGenDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalYamlGenDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalYamlGenDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalYamlGenDsl.g"; }


    	private YamlGenDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(YamlGenDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleSource"
    // InternalYamlGenDsl.g:53:1: entryRuleSource : ruleSource EOF ;
    public final void entryRuleSource() throws RecognitionException {
        try {
            // InternalYamlGenDsl.g:54:1: ( ruleSource EOF )
            // InternalYamlGenDsl.g:55:1: ruleSource EOF
            {
             before(grammarAccess.getSourceRule()); 
            pushFollow(FOLLOW_1);
            ruleSource();

            state._fsp--;

             after(grammarAccess.getSourceRule()); 
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
    // $ANTLR end "entryRuleSource"


    // $ANTLR start "ruleSource"
    // InternalYamlGenDsl.g:62:1: ruleSource : ( ( rule__Source__EntriesAssignment )* ) ;
    public final void ruleSource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:66:2: ( ( ( rule__Source__EntriesAssignment )* ) )
            // InternalYamlGenDsl.g:67:2: ( ( rule__Source__EntriesAssignment )* )
            {
            // InternalYamlGenDsl.g:67:2: ( ( rule__Source__EntriesAssignment )* )
            // InternalYamlGenDsl.g:68:3: ( rule__Source__EntriesAssignment )*
            {
             before(grammarAccess.getSourceAccess().getEntriesAssignment()); 
            // InternalYamlGenDsl.g:69:3: ( rule__Source__EntriesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_HELP_STRING && LA1_0<=RULE_ID)||LA1_0==22||LA1_0==34) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalYamlGenDsl.g:69:4: rule__Source__EntriesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Source__EntriesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getSourceAccess().getEntriesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSource"


    // $ANTLR start "entryRuleSourceElement"
    // InternalYamlGenDsl.g:78:1: entryRuleSourceElement : ruleSourceElement EOF ;
    public final void entryRuleSourceElement() throws RecognitionException {
        try {
            // InternalYamlGenDsl.g:79:1: ( ruleSourceElement EOF )
            // InternalYamlGenDsl.g:80:1: ruleSourceElement EOF
            {
             before(grammarAccess.getSourceElementRule()); 
            pushFollow(FOLLOW_1);
            ruleSourceElement();

            state._fsp--;

             after(grammarAccess.getSourceElementRule()); 
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
    // $ANTLR end "entryRuleSourceElement"


    // $ANTLR start "ruleSourceElement"
    // InternalYamlGenDsl.g:87:1: ruleSourceElement : ( ( rule__SourceElement__Alternatives ) ) ;
    public final void ruleSourceElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:91:2: ( ( ( rule__SourceElement__Alternatives ) ) )
            // InternalYamlGenDsl.g:92:2: ( ( rule__SourceElement__Alternatives ) )
            {
            // InternalYamlGenDsl.g:92:2: ( ( rule__SourceElement__Alternatives ) )
            // InternalYamlGenDsl.g:93:3: ( rule__SourceElement__Alternatives )
            {
             before(grammarAccess.getSourceElementAccess().getAlternatives()); 
            // InternalYamlGenDsl.g:94:3: ( rule__SourceElement__Alternatives )
            // InternalYamlGenDsl.g:94:4: rule__SourceElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SourceElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSourceElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSourceElement"


    // $ANTLR start "entryRuleImport"
    // InternalYamlGenDsl.g:103:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalYamlGenDsl.g:104:1: ( ruleImport EOF )
            // InternalYamlGenDsl.g:105:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalYamlGenDsl.g:112:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:116:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalYamlGenDsl.g:117:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalYamlGenDsl.g:117:2: ( ( rule__Import__Group__0 ) )
            // InternalYamlGenDsl.g:118:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalYamlGenDsl.g:119:3: ( rule__Import__Group__0 )
            // InternalYamlGenDsl.g:119:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleField"
    // InternalYamlGenDsl.g:128:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalYamlGenDsl.g:129:1: ( ruleField EOF )
            // InternalYamlGenDsl.g:130:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalYamlGenDsl.g:137:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:141:2: ( ( ( rule__Field__Group__0 ) ) )
            // InternalYamlGenDsl.g:142:2: ( ( rule__Field__Group__0 ) )
            {
            // InternalYamlGenDsl.g:142:2: ( ( rule__Field__Group__0 ) )
            // InternalYamlGenDsl.g:143:3: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // InternalYamlGenDsl.g:144:3: ( rule__Field__Group__0 )
            // InternalYamlGenDsl.g:144:4: rule__Field__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleBody"
    // InternalYamlGenDsl.g:153:1: entryRuleBody : ruleBody EOF ;
    public final void entryRuleBody() throws RecognitionException {
        try {
            // InternalYamlGenDsl.g:154:1: ( ruleBody EOF )
            // InternalYamlGenDsl.g:155:1: ruleBody EOF
            {
             before(grammarAccess.getBodyRule()); 
            pushFollow(FOLLOW_1);
            ruleBody();

            state._fsp--;

             after(grammarAccess.getBodyRule()); 
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
    // $ANTLR end "entryRuleBody"


    // $ANTLR start "ruleBody"
    // InternalYamlGenDsl.g:162:1: ruleBody : ( ( rule__Body__Group__0 ) ) ;
    public final void ruleBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:166:2: ( ( ( rule__Body__Group__0 ) ) )
            // InternalYamlGenDsl.g:167:2: ( ( rule__Body__Group__0 ) )
            {
            // InternalYamlGenDsl.g:167:2: ( ( rule__Body__Group__0 ) )
            // InternalYamlGenDsl.g:168:3: ( rule__Body__Group__0 )
            {
             before(grammarAccess.getBodyAccess().getGroup()); 
            // InternalYamlGenDsl.g:169:3: ( rule__Body__Group__0 )
            // InternalYamlGenDsl.g:169:4: rule__Body__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Body__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBodyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBody"


    // $ANTLR start "entryRuleBodyElement"
    // InternalYamlGenDsl.g:178:1: entryRuleBodyElement : ruleBodyElement EOF ;
    public final void entryRuleBodyElement() throws RecognitionException {
        try {
            // InternalYamlGenDsl.g:179:1: ( ruleBodyElement EOF )
            // InternalYamlGenDsl.g:180:1: ruleBodyElement EOF
            {
             before(grammarAccess.getBodyElementRule()); 
            pushFollow(FOLLOW_1);
            ruleBodyElement();

            state._fsp--;

             after(grammarAccess.getBodyElementRule()); 
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
    // $ANTLR end "entryRuleBodyElement"


    // $ANTLR start "ruleBodyElement"
    // InternalYamlGenDsl.g:187:1: ruleBodyElement : ( ( rule__BodyElement__Alternatives ) ) ;
    public final void ruleBodyElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:191:2: ( ( ( rule__BodyElement__Alternatives ) ) )
            // InternalYamlGenDsl.g:192:2: ( ( rule__BodyElement__Alternatives ) )
            {
            // InternalYamlGenDsl.g:192:2: ( ( rule__BodyElement__Alternatives ) )
            // InternalYamlGenDsl.g:193:3: ( rule__BodyElement__Alternatives )
            {
             before(grammarAccess.getBodyElementAccess().getAlternatives()); 
            // InternalYamlGenDsl.g:194:3: ( rule__BodyElement__Alternatives )
            // InternalYamlGenDsl.g:194:4: rule__BodyElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BodyElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBodyElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBodyElement"


    // $ANTLR start "entryRuleExtend"
    // InternalYamlGenDsl.g:203:1: entryRuleExtend : ruleExtend EOF ;
    public final void entryRuleExtend() throws RecognitionException {
        try {
            // InternalYamlGenDsl.g:204:1: ( ruleExtend EOF )
            // InternalYamlGenDsl.g:205:1: ruleExtend EOF
            {
             before(grammarAccess.getExtendRule()); 
            pushFollow(FOLLOW_1);
            ruleExtend();

            state._fsp--;

             after(grammarAccess.getExtendRule()); 
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
    // $ANTLR end "entryRuleExtend"


    // $ANTLR start "ruleExtend"
    // InternalYamlGenDsl.g:212:1: ruleExtend : ( ( rule__Extend__Group__0 ) ) ;
    public final void ruleExtend() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:216:2: ( ( ( rule__Extend__Group__0 ) ) )
            // InternalYamlGenDsl.g:217:2: ( ( rule__Extend__Group__0 ) )
            {
            // InternalYamlGenDsl.g:217:2: ( ( rule__Extend__Group__0 ) )
            // InternalYamlGenDsl.g:218:3: ( rule__Extend__Group__0 )
            {
             before(grammarAccess.getExtendAccess().getGroup()); 
            // InternalYamlGenDsl.g:219:3: ( rule__Extend__Group__0 )
            // InternalYamlGenDsl.g:219:4: rule__Extend__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Extend__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExtendAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExtend"


    // $ANTLR start "entryRuleAnyNestedField"
    // InternalYamlGenDsl.g:228:1: entryRuleAnyNestedField : ruleAnyNestedField EOF ;
    public final void entryRuleAnyNestedField() throws RecognitionException {
        try {
            // InternalYamlGenDsl.g:229:1: ( ruleAnyNestedField EOF )
            // InternalYamlGenDsl.g:230:1: ruleAnyNestedField EOF
            {
             before(grammarAccess.getAnyNestedFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleAnyNestedField();

            state._fsp--;

             after(grammarAccess.getAnyNestedFieldRule()); 
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
    // $ANTLR end "entryRuleAnyNestedField"


    // $ANTLR start "ruleAnyNestedField"
    // InternalYamlGenDsl.g:237:1: ruleAnyNestedField : ( ( rule__AnyNestedField__Alternatives ) ) ;
    public final void ruleAnyNestedField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:241:2: ( ( ( rule__AnyNestedField__Alternatives ) ) )
            // InternalYamlGenDsl.g:242:2: ( ( rule__AnyNestedField__Alternatives ) )
            {
            // InternalYamlGenDsl.g:242:2: ( ( rule__AnyNestedField__Alternatives ) )
            // InternalYamlGenDsl.g:243:3: ( rule__AnyNestedField__Alternatives )
            {
             before(grammarAccess.getAnyNestedFieldAccess().getAlternatives()); 
            // InternalYamlGenDsl.g:244:3: ( rule__AnyNestedField__Alternatives )
            // InternalYamlGenDsl.g:244:4: rule__AnyNestedField__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AnyNestedField__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAnyNestedFieldAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnyNestedField"


    // $ANTLR start "entryRuleNestedField"
    // InternalYamlGenDsl.g:253:1: entryRuleNestedField : ruleNestedField EOF ;
    public final void entryRuleNestedField() throws RecognitionException {
        try {
            // InternalYamlGenDsl.g:254:1: ( ruleNestedField EOF )
            // InternalYamlGenDsl.g:255:1: ruleNestedField EOF
            {
             before(grammarAccess.getNestedFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleNestedField();

            state._fsp--;

             after(grammarAccess.getNestedFieldRule()); 
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
    // $ANTLR end "entryRuleNestedField"


    // $ANTLR start "ruleNestedField"
    // InternalYamlGenDsl.g:262:1: ruleNestedField : ( ( rule__NestedField__Group__0 ) ) ;
    public final void ruleNestedField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:266:2: ( ( ( rule__NestedField__Group__0 ) ) )
            // InternalYamlGenDsl.g:267:2: ( ( rule__NestedField__Group__0 ) )
            {
            // InternalYamlGenDsl.g:267:2: ( ( rule__NestedField__Group__0 ) )
            // InternalYamlGenDsl.g:268:3: ( rule__NestedField__Group__0 )
            {
             before(grammarAccess.getNestedFieldAccess().getGroup()); 
            // InternalYamlGenDsl.g:269:3: ( rule__NestedField__Group__0 )
            // InternalYamlGenDsl.g:269:4: rule__NestedField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NestedField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNestedFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNestedField"


    // $ANTLR start "entryRuleNestedFields"
    // InternalYamlGenDsl.g:278:1: entryRuleNestedFields : ruleNestedFields EOF ;
    public final void entryRuleNestedFields() throws RecognitionException {
        try {
            // InternalYamlGenDsl.g:279:1: ( ruleNestedFields EOF )
            // InternalYamlGenDsl.g:280:1: ruleNestedFields EOF
            {
             before(grammarAccess.getNestedFieldsRule()); 
            pushFollow(FOLLOW_1);
            ruleNestedFields();

            state._fsp--;

             after(grammarAccess.getNestedFieldsRule()); 
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
    // $ANTLR end "entryRuleNestedFields"


    // $ANTLR start "ruleNestedFields"
    // InternalYamlGenDsl.g:287:1: ruleNestedFields : ( ( rule__NestedFields__Group__0 ) ) ;
    public final void ruleNestedFields() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:291:2: ( ( ( rule__NestedFields__Group__0 ) ) )
            // InternalYamlGenDsl.g:292:2: ( ( rule__NestedFields__Group__0 ) )
            {
            // InternalYamlGenDsl.g:292:2: ( ( rule__NestedFields__Group__0 ) )
            // InternalYamlGenDsl.g:293:3: ( rule__NestedFields__Group__0 )
            {
             before(grammarAccess.getNestedFieldsAccess().getGroup()); 
            // InternalYamlGenDsl.g:294:3: ( rule__NestedFields__Group__0 )
            // InternalYamlGenDsl.g:294:4: rule__NestedFields__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NestedFields__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNestedFieldsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNestedFields"


    // $ANTLR start "entryRuleProperty"
    // InternalYamlGenDsl.g:303:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalYamlGenDsl.g:304:1: ( ruleProperty EOF )
            // InternalYamlGenDsl.g:305:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalYamlGenDsl.g:312:1: ruleProperty : ( ( rule__Property__Alternatives ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:316:2: ( ( ( rule__Property__Alternatives ) ) )
            // InternalYamlGenDsl.g:317:2: ( ( rule__Property__Alternatives ) )
            {
            // InternalYamlGenDsl.g:317:2: ( ( rule__Property__Alternatives ) )
            // InternalYamlGenDsl.g:318:3: ( rule__Property__Alternatives )
            {
             before(grammarAccess.getPropertyAccess().getAlternatives()); 
            // InternalYamlGenDsl.g:319:3: ( rule__Property__Alternatives )
            // InternalYamlGenDsl.g:319:4: rule__Property__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Property__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleStringProperty"
    // InternalYamlGenDsl.g:328:1: entryRuleStringProperty : ruleStringProperty EOF ;
    public final void entryRuleStringProperty() throws RecognitionException {
        try {
            // InternalYamlGenDsl.g:329:1: ( ruleStringProperty EOF )
            // InternalYamlGenDsl.g:330:1: ruleStringProperty EOF
            {
             before(grammarAccess.getStringPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleStringProperty();

            state._fsp--;

             after(grammarAccess.getStringPropertyRule()); 
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
    // $ANTLR end "entryRuleStringProperty"


    // $ANTLR start "ruleStringProperty"
    // InternalYamlGenDsl.g:337:1: ruleStringProperty : ( ( rule__StringProperty__Group__0 ) ) ;
    public final void ruleStringProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:341:2: ( ( ( rule__StringProperty__Group__0 ) ) )
            // InternalYamlGenDsl.g:342:2: ( ( rule__StringProperty__Group__0 ) )
            {
            // InternalYamlGenDsl.g:342:2: ( ( rule__StringProperty__Group__0 ) )
            // InternalYamlGenDsl.g:343:3: ( rule__StringProperty__Group__0 )
            {
             before(grammarAccess.getStringPropertyAccess().getGroup()); 
            // InternalYamlGenDsl.g:344:3: ( rule__StringProperty__Group__0 )
            // InternalYamlGenDsl.g:344:4: rule__StringProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringProperty"


    // $ANTLR start "entryRuleValuesProperty"
    // InternalYamlGenDsl.g:353:1: entryRuleValuesProperty : ruleValuesProperty EOF ;
    public final void entryRuleValuesProperty() throws RecognitionException {
        try {
            // InternalYamlGenDsl.g:354:1: ( ruleValuesProperty EOF )
            // InternalYamlGenDsl.g:355:1: ruleValuesProperty EOF
            {
             before(grammarAccess.getValuesPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleValuesProperty();

            state._fsp--;

             after(grammarAccess.getValuesPropertyRule()); 
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
    // $ANTLR end "entryRuleValuesProperty"


    // $ANTLR start "ruleValuesProperty"
    // InternalYamlGenDsl.g:362:1: ruleValuesProperty : ( ( rule__ValuesProperty__Group__0 ) ) ;
    public final void ruleValuesProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:366:2: ( ( ( rule__ValuesProperty__Group__0 ) ) )
            // InternalYamlGenDsl.g:367:2: ( ( rule__ValuesProperty__Group__0 ) )
            {
            // InternalYamlGenDsl.g:367:2: ( ( rule__ValuesProperty__Group__0 ) )
            // InternalYamlGenDsl.g:368:3: ( rule__ValuesProperty__Group__0 )
            {
             before(grammarAccess.getValuesPropertyAccess().getGroup()); 
            // InternalYamlGenDsl.g:369:3: ( rule__ValuesProperty__Group__0 )
            // InternalYamlGenDsl.g:369:4: rule__ValuesProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ValuesProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValuesPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValuesProperty"


    // $ANTLR start "entryRuleTypeProperty"
    // InternalYamlGenDsl.g:378:1: entryRuleTypeProperty : ruleTypeProperty EOF ;
    public final void entryRuleTypeProperty() throws RecognitionException {
        try {
            // InternalYamlGenDsl.g:379:1: ( ruleTypeProperty EOF )
            // InternalYamlGenDsl.g:380:1: ruleTypeProperty EOF
            {
             before(grammarAccess.getTypePropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeProperty();

            state._fsp--;

             after(grammarAccess.getTypePropertyRule()); 
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
    // $ANTLR end "entryRuleTypeProperty"


    // $ANTLR start "ruleTypeProperty"
    // InternalYamlGenDsl.g:387:1: ruleTypeProperty : ( ( rule__TypeProperty__Group__0 ) ) ;
    public final void ruleTypeProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:391:2: ( ( ( rule__TypeProperty__Group__0 ) ) )
            // InternalYamlGenDsl.g:392:2: ( ( rule__TypeProperty__Group__0 ) )
            {
            // InternalYamlGenDsl.g:392:2: ( ( rule__TypeProperty__Group__0 ) )
            // InternalYamlGenDsl.g:393:3: ( rule__TypeProperty__Group__0 )
            {
             before(grammarAccess.getTypePropertyAccess().getGroup()); 
            // InternalYamlGenDsl.g:394:3: ( rule__TypeProperty__Group__0 )
            // InternalYamlGenDsl.g:394:4: rule__TypeProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypePropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeProperty"


    // $ANTLR start "entryRuleValues"
    // InternalYamlGenDsl.g:403:1: entryRuleValues : ruleValues EOF ;
    public final void entryRuleValues() throws RecognitionException {
        try {
            // InternalYamlGenDsl.g:404:1: ( ruleValues EOF )
            // InternalYamlGenDsl.g:405:1: ruleValues EOF
            {
             before(grammarAccess.getValuesRule()); 
            pushFollow(FOLLOW_1);
            ruleValues();

            state._fsp--;

             after(grammarAccess.getValuesRule()); 
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
    // $ANTLR end "entryRuleValues"


    // $ANTLR start "ruleValues"
    // InternalYamlGenDsl.g:412:1: ruleValues : ( ( rule__Values__Alternatives ) ) ;
    public final void ruleValues() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:416:2: ( ( ( rule__Values__Alternatives ) ) )
            // InternalYamlGenDsl.g:417:2: ( ( rule__Values__Alternatives ) )
            {
            // InternalYamlGenDsl.g:417:2: ( ( rule__Values__Alternatives ) )
            // InternalYamlGenDsl.g:418:3: ( rule__Values__Alternatives )
            {
             before(grammarAccess.getValuesAccess().getAlternatives()); 
            // InternalYamlGenDsl.g:419:3: ( rule__Values__Alternatives )
            // InternalYamlGenDsl.g:419:4: rule__Values__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Values__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValuesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValues"


    // $ANTLR start "rule__SourceElement__Alternatives"
    // InternalYamlGenDsl.g:427:1: rule__SourceElement__Alternatives : ( ( ruleField ) | ( ruleImport ) );
    public final void rule__SourceElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:431:1: ( ( ruleField ) | ( ruleImport ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_HELP_STRING && LA2_0<=RULE_ID)||LA2_0==34) ) {
                alt2=1;
            }
            else if ( (LA2_0==22) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalYamlGenDsl.g:432:2: ( ruleField )
                    {
                    // InternalYamlGenDsl.g:432:2: ( ruleField )
                    // InternalYamlGenDsl.g:433:3: ruleField
                    {
                     before(grammarAccess.getSourceElementAccess().getFieldParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleField();

                    state._fsp--;

                     after(grammarAccess.getSourceElementAccess().getFieldParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalYamlGenDsl.g:438:2: ( ruleImport )
                    {
                    // InternalYamlGenDsl.g:438:2: ( ruleImport )
                    // InternalYamlGenDsl.g:439:3: ruleImport
                    {
                     before(grammarAccess.getSourceElementAccess().getImportParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleImport();

                    state._fsp--;

                     after(grammarAccess.getSourceElementAccess().getImportParserRuleCall_1()); 

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
    // $ANTLR end "rule__SourceElement__Alternatives"


    // $ANTLR start "rule__BodyElement__Alternatives"
    // InternalYamlGenDsl.g:448:1: rule__BodyElement__Alternatives : ( ( ruleExtend ) | ( ruleAnyNestedField ) | ( ruleProperty ) );
    public final void rule__BodyElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:452:1: ( ( ruleExtend ) | ( ruleAnyNestedField ) | ( ruleProperty ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt3=1;
                }
                break;
            case RULE_HELP_STRING:
            case 27:
            case 28:
                {
                alt3=2;
                }
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 36:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalYamlGenDsl.g:453:2: ( ruleExtend )
                    {
                    // InternalYamlGenDsl.g:453:2: ( ruleExtend )
                    // InternalYamlGenDsl.g:454:3: ruleExtend
                    {
                     before(grammarAccess.getBodyElementAccess().getExtendParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExtend();

                    state._fsp--;

                     after(grammarAccess.getBodyElementAccess().getExtendParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalYamlGenDsl.g:459:2: ( ruleAnyNestedField )
                    {
                    // InternalYamlGenDsl.g:459:2: ( ruleAnyNestedField )
                    // InternalYamlGenDsl.g:460:3: ruleAnyNestedField
                    {
                     before(grammarAccess.getBodyElementAccess().getAnyNestedFieldParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAnyNestedField();

                    state._fsp--;

                     after(grammarAccess.getBodyElementAccess().getAnyNestedFieldParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalYamlGenDsl.g:465:2: ( ruleProperty )
                    {
                    // InternalYamlGenDsl.g:465:2: ( ruleProperty )
                    // InternalYamlGenDsl.g:466:3: ruleProperty
                    {
                     before(grammarAccess.getBodyElementAccess().getPropertyParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleProperty();

                    state._fsp--;

                     after(grammarAccess.getBodyElementAccess().getPropertyParserRuleCall_2()); 

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
    // $ANTLR end "rule__BodyElement__Alternatives"


    // $ANTLR start "rule__AnyNestedField__Alternatives"
    // InternalYamlGenDsl.g:475:1: rule__AnyNestedField__Alternatives : ( ( ruleNestedField ) | ( ruleNestedFields ) );
    public final void rule__AnyNestedField__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:479:1: ( ( ruleNestedField ) | ( ruleNestedFields ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalYamlGenDsl.g:480:2: ( ruleNestedField )
                    {
                    // InternalYamlGenDsl.g:480:2: ( ruleNestedField )
                    // InternalYamlGenDsl.g:481:3: ruleNestedField
                    {
                     before(grammarAccess.getAnyNestedFieldAccess().getNestedFieldParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNestedField();

                    state._fsp--;

                     after(grammarAccess.getAnyNestedFieldAccess().getNestedFieldParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalYamlGenDsl.g:486:2: ( ruleNestedFields )
                    {
                    // InternalYamlGenDsl.g:486:2: ( ruleNestedFields )
                    // InternalYamlGenDsl.g:487:3: ruleNestedFields
                    {
                     before(grammarAccess.getAnyNestedFieldAccess().getNestedFieldsParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNestedFields();

                    state._fsp--;

                     after(grammarAccess.getAnyNestedFieldAccess().getNestedFieldsParserRuleCall_1()); 

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
    // $ANTLR end "rule__AnyNestedField__Alternatives"


    // $ANTLR start "rule__Property__Alternatives"
    // InternalYamlGenDsl.g:496:1: rule__Property__Alternatives : ( ( ruleStringProperty ) | ( ruleValuesProperty ) | ( ruleTypeProperty ) );
    public final void rule__Property__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:500:1: ( ( ruleStringProperty ) | ( ruleValuesProperty ) | ( ruleTypeProperty ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 12:
            case 13:
            case 14:
                {
                alt5=1;
                }
                break;
            case 15:
            case 16:
                {
                alt5=2;
                }
                break;
            case 36:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalYamlGenDsl.g:501:2: ( ruleStringProperty )
                    {
                    // InternalYamlGenDsl.g:501:2: ( ruleStringProperty )
                    // InternalYamlGenDsl.g:502:3: ruleStringProperty
                    {
                     before(grammarAccess.getPropertyAccess().getStringPropertyParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStringProperty();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getStringPropertyParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalYamlGenDsl.g:507:2: ( ruleValuesProperty )
                    {
                    // InternalYamlGenDsl.g:507:2: ( ruleValuesProperty )
                    // InternalYamlGenDsl.g:508:3: ruleValuesProperty
                    {
                     before(grammarAccess.getPropertyAccess().getValuesPropertyParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleValuesProperty();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getValuesPropertyParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalYamlGenDsl.g:513:2: ( ruleTypeProperty )
                    {
                    // InternalYamlGenDsl.g:513:2: ( ruleTypeProperty )
                    // InternalYamlGenDsl.g:514:3: ruleTypeProperty
                    {
                     before(grammarAccess.getPropertyAccess().getTypePropertyParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTypeProperty();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getTypePropertyParserRuleCall_2()); 

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
    // $ANTLR end "rule__Property__Alternatives"


    // $ANTLR start "rule__StringProperty__KeyAlternatives_0_0"
    // InternalYamlGenDsl.g:523:1: rule__StringProperty__KeyAlternatives_0_0 : ( ( 'key' ) | ( 'name' ) | ( 'hint' ) );
    public final void rule__StringProperty__KeyAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:527:1: ( ( 'key' ) | ( 'name' ) | ( 'hint' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt6=1;
                }
                break;
            case 13:
                {
                alt6=2;
                }
                break;
            case 14:
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
                    // InternalYamlGenDsl.g:528:2: ( 'key' )
                    {
                    // InternalYamlGenDsl.g:528:2: ( 'key' )
                    // InternalYamlGenDsl.g:529:3: 'key'
                    {
                     before(grammarAccess.getStringPropertyAccess().getKeyKeyKeyword_0_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getStringPropertyAccess().getKeyKeyKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalYamlGenDsl.g:534:2: ( 'name' )
                    {
                    // InternalYamlGenDsl.g:534:2: ( 'name' )
                    // InternalYamlGenDsl.g:535:3: 'name'
                    {
                     before(grammarAccess.getStringPropertyAccess().getKeyNameKeyword_0_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getStringPropertyAccess().getKeyNameKeyword_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalYamlGenDsl.g:540:2: ( 'hint' )
                    {
                    // InternalYamlGenDsl.g:540:2: ( 'hint' )
                    // InternalYamlGenDsl.g:541:3: 'hint'
                    {
                     before(grammarAccess.getStringPropertyAccess().getKeyHintKeyword_0_0_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getStringPropertyAccess().getKeyHintKeyword_0_0_2()); 

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
    // $ANTLR end "rule__StringProperty__KeyAlternatives_0_0"


    // $ANTLR start "rule__ValuesProperty__KeyAlternatives_0_0"
    // InternalYamlGenDsl.g:550:1: rule__ValuesProperty__KeyAlternatives_0_0 : ( ( 'default' ) | ( 'values' ) );
    public final void rule__ValuesProperty__KeyAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:554:1: ( ( 'default' ) | ( 'values' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            else if ( (LA7_0==16) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalYamlGenDsl.g:555:2: ( 'default' )
                    {
                    // InternalYamlGenDsl.g:555:2: ( 'default' )
                    // InternalYamlGenDsl.g:556:3: 'default'
                    {
                     before(grammarAccess.getValuesPropertyAccess().getKeyDefaultKeyword_0_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getValuesPropertyAccess().getKeyDefaultKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalYamlGenDsl.g:561:2: ( 'values' )
                    {
                    // InternalYamlGenDsl.g:561:2: ( 'values' )
                    // InternalYamlGenDsl.g:562:3: 'values'
                    {
                     before(grammarAccess.getValuesPropertyAccess().getKeyValuesKeyword_0_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getValuesPropertyAccess().getKeyValuesKeyword_0_0_1()); 

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
    // $ANTLR end "rule__ValuesProperty__KeyAlternatives_0_0"


    // $ANTLR start "rule__TypeProperty__ValueAlternatives_2_0"
    // InternalYamlGenDsl.g:571:1: rule__TypeProperty__ValueAlternatives_2_0 : ( ( 'int' ) | ( 'float' ) | ( 'string' ) | ( 'list' ) | ( 'any' ) | ( RULE_STRING ) );
    public final void rule__TypeProperty__ValueAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:575:1: ( ( 'int' ) | ( 'float' ) | ( 'string' ) | ( 'list' ) | ( 'any' ) | ( RULE_STRING ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt8=1;
                }
                break;
            case 18:
                {
                alt8=2;
                }
                break;
            case 19:
                {
                alt8=3;
                }
                break;
            case 20:
                {
                alt8=4;
                }
                break;
            case 21:
                {
                alt8=5;
                }
                break;
            case RULE_STRING:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalYamlGenDsl.g:576:2: ( 'int' )
                    {
                    // InternalYamlGenDsl.g:576:2: ( 'int' )
                    // InternalYamlGenDsl.g:577:3: 'int'
                    {
                     before(grammarAccess.getTypePropertyAccess().getValueIntKeyword_2_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getTypePropertyAccess().getValueIntKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalYamlGenDsl.g:582:2: ( 'float' )
                    {
                    // InternalYamlGenDsl.g:582:2: ( 'float' )
                    // InternalYamlGenDsl.g:583:3: 'float'
                    {
                     before(grammarAccess.getTypePropertyAccess().getValueFloatKeyword_2_0_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getTypePropertyAccess().getValueFloatKeyword_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalYamlGenDsl.g:588:2: ( 'string' )
                    {
                    // InternalYamlGenDsl.g:588:2: ( 'string' )
                    // InternalYamlGenDsl.g:589:3: 'string'
                    {
                     before(grammarAccess.getTypePropertyAccess().getValueStringKeyword_2_0_2()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getTypePropertyAccess().getValueStringKeyword_2_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalYamlGenDsl.g:594:2: ( 'list' )
                    {
                    // InternalYamlGenDsl.g:594:2: ( 'list' )
                    // InternalYamlGenDsl.g:595:3: 'list'
                    {
                     before(grammarAccess.getTypePropertyAccess().getValueListKeyword_2_0_3()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getTypePropertyAccess().getValueListKeyword_2_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalYamlGenDsl.g:600:2: ( 'any' )
                    {
                    // InternalYamlGenDsl.g:600:2: ( 'any' )
                    // InternalYamlGenDsl.g:601:3: 'any'
                    {
                     before(grammarAccess.getTypePropertyAccess().getValueAnyKeyword_2_0_4()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getTypePropertyAccess().getValueAnyKeyword_2_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalYamlGenDsl.g:606:2: ( RULE_STRING )
                    {
                    // InternalYamlGenDsl.g:606:2: ( RULE_STRING )
                    // InternalYamlGenDsl.g:607:3: RULE_STRING
                    {
                     before(grammarAccess.getTypePropertyAccess().getValueSTRINGTerminalRuleCall_2_0_5()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getTypePropertyAccess().getValueSTRINGTerminalRuleCall_2_0_5()); 

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
    // $ANTLR end "rule__TypeProperty__ValueAlternatives_2_0"


    // $ANTLR start "rule__Values__Alternatives"
    // InternalYamlGenDsl.g:616:1: rule__Values__Alternatives : ( ( ( rule__Values__Group_0__0 ) ) | ( ( rule__Values__StringAssignment_1 ) ) );
    public final void rule__Values__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:620:1: ( ( ( rule__Values__Group_0__0 ) ) | ( ( rule__Values__StringAssignment_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==32) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_STRING) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalYamlGenDsl.g:621:2: ( ( rule__Values__Group_0__0 ) )
                    {
                    // InternalYamlGenDsl.g:621:2: ( ( rule__Values__Group_0__0 ) )
                    // InternalYamlGenDsl.g:622:3: ( rule__Values__Group_0__0 )
                    {
                     before(grammarAccess.getValuesAccess().getGroup_0()); 
                    // InternalYamlGenDsl.g:623:3: ( rule__Values__Group_0__0 )
                    // InternalYamlGenDsl.g:623:4: rule__Values__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Values__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValuesAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalYamlGenDsl.g:627:2: ( ( rule__Values__StringAssignment_1 ) )
                    {
                    // InternalYamlGenDsl.g:627:2: ( ( rule__Values__StringAssignment_1 ) )
                    // InternalYamlGenDsl.g:628:3: ( rule__Values__StringAssignment_1 )
                    {
                     before(grammarAccess.getValuesAccess().getStringAssignment_1()); 
                    // InternalYamlGenDsl.g:629:3: ( rule__Values__StringAssignment_1 )
                    // InternalYamlGenDsl.g:629:4: rule__Values__StringAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Values__StringAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getValuesAccess().getStringAssignment_1()); 

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
    // $ANTLR end "rule__Values__Alternatives"


    // $ANTLR start "rule__Import__Group__0"
    // InternalYamlGenDsl.g:637:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:641:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalYamlGenDsl.g:642:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

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
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalYamlGenDsl.g:649:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:653:1: ( ( 'import' ) )
            // InternalYamlGenDsl.g:654:1: ( 'import' )
            {
            // InternalYamlGenDsl.g:654:1: ( 'import' )
            // InternalYamlGenDsl.g:655:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalYamlGenDsl.g:664:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:668:1: ( rule__Import__Group__1__Impl )
            // InternalYamlGenDsl.g:669:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

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
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalYamlGenDsl.g:675:1: rule__Import__Group__1__Impl : ( ( rule__Import__PathAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:679:1: ( ( ( rule__Import__PathAssignment_1 ) ) )
            // InternalYamlGenDsl.g:680:1: ( ( rule__Import__PathAssignment_1 ) )
            {
            // InternalYamlGenDsl.g:680:1: ( ( rule__Import__PathAssignment_1 ) )
            // InternalYamlGenDsl.g:681:2: ( rule__Import__PathAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getPathAssignment_1()); 
            // InternalYamlGenDsl.g:682:2: ( rule__Import__PathAssignment_1 )
            // InternalYamlGenDsl.g:682:3: rule__Import__PathAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__PathAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getPathAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // InternalYamlGenDsl.g:691:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:695:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalYamlGenDsl.g:696:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__1();

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
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // InternalYamlGenDsl.g:703:1: rule__Field__Group__0__Impl : ( ( rule__Field__HelpAssignment_0 )* ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:707:1: ( ( ( rule__Field__HelpAssignment_0 )* ) )
            // InternalYamlGenDsl.g:708:1: ( ( rule__Field__HelpAssignment_0 )* )
            {
            // InternalYamlGenDsl.g:708:1: ( ( rule__Field__HelpAssignment_0 )* )
            // InternalYamlGenDsl.g:709:2: ( rule__Field__HelpAssignment_0 )*
            {
             before(grammarAccess.getFieldAccess().getHelpAssignment_0()); 
            // InternalYamlGenDsl.g:710:2: ( rule__Field__HelpAssignment_0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_HELP_STRING) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalYamlGenDsl.g:710:3: rule__Field__HelpAssignment_0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Field__HelpAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getFieldAccess().getHelpAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // InternalYamlGenDsl.g:718:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:722:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // InternalYamlGenDsl.g:723:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__2();

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
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // InternalYamlGenDsl.g:730:1: rule__Field__Group__1__Impl : ( ( rule__Field__RootAssignment_1 )? ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:734:1: ( ( ( rule__Field__RootAssignment_1 )? ) )
            // InternalYamlGenDsl.g:735:1: ( ( rule__Field__RootAssignment_1 )? )
            {
            // InternalYamlGenDsl.g:735:1: ( ( rule__Field__RootAssignment_1 )? )
            // InternalYamlGenDsl.g:736:2: ( rule__Field__RootAssignment_1 )?
            {
             before(grammarAccess.getFieldAccess().getRootAssignment_1()); 
            // InternalYamlGenDsl.g:737:2: ( rule__Field__RootAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==34) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalYamlGenDsl.g:737:3: rule__Field__RootAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Field__RootAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldAccess().getRootAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__2"
    // InternalYamlGenDsl.g:745:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:749:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // InternalYamlGenDsl.g:750:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Field__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__3();

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
    // $ANTLR end "rule__Field__Group__2"


    // $ANTLR start "rule__Field__Group__2__Impl"
    // InternalYamlGenDsl.g:757:1: rule__Field__Group__2__Impl : ( ( rule__Field__NameAssignment_2 ) ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:761:1: ( ( ( rule__Field__NameAssignment_2 ) ) )
            // InternalYamlGenDsl.g:762:1: ( ( rule__Field__NameAssignment_2 ) )
            {
            // InternalYamlGenDsl.g:762:1: ( ( rule__Field__NameAssignment_2 ) )
            // InternalYamlGenDsl.g:763:2: ( rule__Field__NameAssignment_2 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_2()); 
            // InternalYamlGenDsl.g:764:2: ( rule__Field__NameAssignment_2 )
            // InternalYamlGenDsl.g:764:3: rule__Field__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Field__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2__Impl"


    // $ANTLR start "rule__Field__Group__3"
    // InternalYamlGenDsl.g:772:1: rule__Field__Group__3 : rule__Field__Group__3__Impl rule__Field__Group__4 ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:776:1: ( rule__Field__Group__3__Impl rule__Field__Group__4 )
            // InternalYamlGenDsl.g:777:2: rule__Field__Group__3__Impl rule__Field__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Field__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__4();

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
    // $ANTLR end "rule__Field__Group__3"


    // $ANTLR start "rule__Field__Group__3__Impl"
    // InternalYamlGenDsl.g:784:1: rule__Field__Group__3__Impl : ( ( rule__Field__Group_3__0 )? ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:788:1: ( ( ( rule__Field__Group_3__0 )? ) )
            // InternalYamlGenDsl.g:789:1: ( ( rule__Field__Group_3__0 )? )
            {
            // InternalYamlGenDsl.g:789:1: ( ( rule__Field__Group_3__0 )? )
            // InternalYamlGenDsl.g:790:2: ( rule__Field__Group_3__0 )?
            {
             before(grammarAccess.getFieldAccess().getGroup_3()); 
            // InternalYamlGenDsl.g:791:2: ( rule__Field__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalYamlGenDsl.g:791:3: rule__Field__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Field__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__3__Impl"


    // $ANTLR start "rule__Field__Group__4"
    // InternalYamlGenDsl.g:799:1: rule__Field__Group__4 : rule__Field__Group__4__Impl ;
    public final void rule__Field__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:803:1: ( rule__Field__Group__4__Impl )
            // InternalYamlGenDsl.g:804:2: rule__Field__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__4__Impl();

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
    // $ANTLR end "rule__Field__Group__4"


    // $ANTLR start "rule__Field__Group__4__Impl"
    // InternalYamlGenDsl.g:810:1: rule__Field__Group__4__Impl : ( ( rule__Field__BodyAssignment_4 ) ) ;
    public final void rule__Field__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:814:1: ( ( ( rule__Field__BodyAssignment_4 ) ) )
            // InternalYamlGenDsl.g:815:1: ( ( rule__Field__BodyAssignment_4 ) )
            {
            // InternalYamlGenDsl.g:815:1: ( ( rule__Field__BodyAssignment_4 ) )
            // InternalYamlGenDsl.g:816:2: ( rule__Field__BodyAssignment_4 )
            {
             before(grammarAccess.getFieldAccess().getBodyAssignment_4()); 
            // InternalYamlGenDsl.g:817:2: ( rule__Field__BodyAssignment_4 )
            // InternalYamlGenDsl.g:817:3: rule__Field__BodyAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Field__BodyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getBodyAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__4__Impl"


    // $ANTLR start "rule__Field__Group_3__0"
    // InternalYamlGenDsl.g:826:1: rule__Field__Group_3__0 : rule__Field__Group_3__0__Impl rule__Field__Group_3__1 ;
    public final void rule__Field__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:830:1: ( rule__Field__Group_3__0__Impl rule__Field__Group_3__1 )
            // InternalYamlGenDsl.g:831:2: rule__Field__Group_3__0__Impl rule__Field__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__Field__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group_3__1();

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
    // $ANTLR end "rule__Field__Group_3__0"


    // $ANTLR start "rule__Field__Group_3__0__Impl"
    // InternalYamlGenDsl.g:838:1: rule__Field__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__Field__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:842:1: ( ( 'extends' ) )
            // InternalYamlGenDsl.g:843:1: ( 'extends' )
            {
            // InternalYamlGenDsl.g:843:1: ( 'extends' )
            // InternalYamlGenDsl.g:844:2: 'extends'
            {
             before(grammarAccess.getFieldAccess().getExtendsKeyword_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getExtendsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_3__0__Impl"


    // $ANTLR start "rule__Field__Group_3__1"
    // InternalYamlGenDsl.g:853:1: rule__Field__Group_3__1 : rule__Field__Group_3__1__Impl ;
    public final void rule__Field__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:857:1: ( rule__Field__Group_3__1__Impl )
            // InternalYamlGenDsl.g:858:2: rule__Field__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group_3__1__Impl();

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
    // $ANTLR end "rule__Field__Group_3__1"


    // $ANTLR start "rule__Field__Group_3__1__Impl"
    // InternalYamlGenDsl.g:864:1: rule__Field__Group_3__1__Impl : ( ( rule__Field__SuperFieldAssignment_3_1 ) ) ;
    public final void rule__Field__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:868:1: ( ( ( rule__Field__SuperFieldAssignment_3_1 ) ) )
            // InternalYamlGenDsl.g:869:1: ( ( rule__Field__SuperFieldAssignment_3_1 ) )
            {
            // InternalYamlGenDsl.g:869:1: ( ( rule__Field__SuperFieldAssignment_3_1 ) )
            // InternalYamlGenDsl.g:870:2: ( rule__Field__SuperFieldAssignment_3_1 )
            {
             before(grammarAccess.getFieldAccess().getSuperFieldAssignment_3_1()); 
            // InternalYamlGenDsl.g:871:2: ( rule__Field__SuperFieldAssignment_3_1 )
            // InternalYamlGenDsl.g:871:3: rule__Field__SuperFieldAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Field__SuperFieldAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getSuperFieldAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_3__1__Impl"


    // $ANTLR start "rule__Body__Group__0"
    // InternalYamlGenDsl.g:880:1: rule__Body__Group__0 : rule__Body__Group__0__Impl rule__Body__Group__1 ;
    public final void rule__Body__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:884:1: ( rule__Body__Group__0__Impl rule__Body__Group__1 )
            // InternalYamlGenDsl.g:885:2: rule__Body__Group__0__Impl rule__Body__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Body__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Body__Group__1();

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
    // $ANTLR end "rule__Body__Group__0"


    // $ANTLR start "rule__Body__Group__0__Impl"
    // InternalYamlGenDsl.g:892:1: rule__Body__Group__0__Impl : ( () ) ;
    public final void rule__Body__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:896:1: ( ( () ) )
            // InternalYamlGenDsl.g:897:1: ( () )
            {
            // InternalYamlGenDsl.g:897:1: ( () )
            // InternalYamlGenDsl.g:898:2: ()
            {
             before(grammarAccess.getBodyAccess().getBodyAction_0()); 
            // InternalYamlGenDsl.g:899:2: ()
            // InternalYamlGenDsl.g:899:3: 
            {
            }

             after(grammarAccess.getBodyAccess().getBodyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__0__Impl"


    // $ANTLR start "rule__Body__Group__1"
    // InternalYamlGenDsl.g:907:1: rule__Body__Group__1 : rule__Body__Group__1__Impl rule__Body__Group__2 ;
    public final void rule__Body__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:911:1: ( rule__Body__Group__1__Impl rule__Body__Group__2 )
            // InternalYamlGenDsl.g:912:2: rule__Body__Group__1__Impl rule__Body__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Body__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Body__Group__2();

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
    // $ANTLR end "rule__Body__Group__1"


    // $ANTLR start "rule__Body__Group__1__Impl"
    // InternalYamlGenDsl.g:919:1: rule__Body__Group__1__Impl : ( '{' ) ;
    public final void rule__Body__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:923:1: ( ( '{' ) )
            // InternalYamlGenDsl.g:924:1: ( '{' )
            {
            // InternalYamlGenDsl.g:924:1: ( '{' )
            // InternalYamlGenDsl.g:925:2: '{'
            {
             before(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__1__Impl"


    // $ANTLR start "rule__Body__Group__2"
    // InternalYamlGenDsl.g:934:1: rule__Body__Group__2 : rule__Body__Group__2__Impl rule__Body__Group__3 ;
    public final void rule__Body__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:938:1: ( rule__Body__Group__2__Impl rule__Body__Group__3 )
            // InternalYamlGenDsl.g:939:2: rule__Body__Group__2__Impl rule__Body__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Body__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Body__Group__3();

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
    // $ANTLR end "rule__Body__Group__2"


    // $ANTLR start "rule__Body__Group__2__Impl"
    // InternalYamlGenDsl.g:946:1: rule__Body__Group__2__Impl : ( ( rule__Body__ElementsAssignment_2 )* ) ;
    public final void rule__Body__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:950:1: ( ( ( rule__Body__ElementsAssignment_2 )* ) )
            // InternalYamlGenDsl.g:951:1: ( ( rule__Body__ElementsAssignment_2 )* )
            {
            // InternalYamlGenDsl.g:951:1: ( ( rule__Body__ElementsAssignment_2 )* )
            // InternalYamlGenDsl.g:952:2: ( rule__Body__ElementsAssignment_2 )*
            {
             before(grammarAccess.getBodyAccess().getElementsAssignment_2()); 
            // InternalYamlGenDsl.g:953:2: ( rule__Body__ElementsAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_HELP_STRING||(LA13_0>=12 && LA13_0<=16)||(LA13_0>=26 && LA13_0<=28)||LA13_0==36) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalYamlGenDsl.g:953:3: rule__Body__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Body__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getBodyAccess().getElementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__2__Impl"


    // $ANTLR start "rule__Body__Group__3"
    // InternalYamlGenDsl.g:961:1: rule__Body__Group__3 : rule__Body__Group__3__Impl ;
    public final void rule__Body__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:965:1: ( rule__Body__Group__3__Impl )
            // InternalYamlGenDsl.g:966:2: rule__Body__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Body__Group__3__Impl();

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
    // $ANTLR end "rule__Body__Group__3"


    // $ANTLR start "rule__Body__Group__3__Impl"
    // InternalYamlGenDsl.g:972:1: rule__Body__Group__3__Impl : ( '}' ) ;
    public final void rule__Body__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:976:1: ( ( '}' ) )
            // InternalYamlGenDsl.g:977:1: ( '}' )
            {
            // InternalYamlGenDsl.g:977:1: ( '}' )
            // InternalYamlGenDsl.g:978:2: '}'
            {
             before(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__3__Impl"


    // $ANTLR start "rule__Extend__Group__0"
    // InternalYamlGenDsl.g:988:1: rule__Extend__Group__0 : rule__Extend__Group__0__Impl rule__Extend__Group__1 ;
    public final void rule__Extend__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:992:1: ( rule__Extend__Group__0__Impl rule__Extend__Group__1 )
            // InternalYamlGenDsl.g:993:2: rule__Extend__Group__0__Impl rule__Extend__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Extend__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extend__Group__1();

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
    // $ANTLR end "rule__Extend__Group__0"


    // $ANTLR start "rule__Extend__Group__0__Impl"
    // InternalYamlGenDsl.g:1000:1: rule__Extend__Group__0__Impl : ( 'extend' ) ;
    public final void rule__Extend__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1004:1: ( ( 'extend' ) )
            // InternalYamlGenDsl.g:1005:1: ( 'extend' )
            {
            // InternalYamlGenDsl.g:1005:1: ( 'extend' )
            // InternalYamlGenDsl.g:1006:2: 'extend'
            {
             before(grammarAccess.getExtendAccess().getExtendKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getExtendAccess().getExtendKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extend__Group__0__Impl"


    // $ANTLR start "rule__Extend__Group__1"
    // InternalYamlGenDsl.g:1015:1: rule__Extend__Group__1 : rule__Extend__Group__1__Impl rule__Extend__Group__2 ;
    public final void rule__Extend__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1019:1: ( rule__Extend__Group__1__Impl rule__Extend__Group__2 )
            // InternalYamlGenDsl.g:1020:2: rule__Extend__Group__1__Impl rule__Extend__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Extend__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extend__Group__2();

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
    // $ANTLR end "rule__Extend__Group__1"


    // $ANTLR start "rule__Extend__Group__1__Impl"
    // InternalYamlGenDsl.g:1027:1: rule__Extend__Group__1__Impl : ( ( rule__Extend__ParentSubfieldNameAssignment_1 ) ) ;
    public final void rule__Extend__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1031:1: ( ( ( rule__Extend__ParentSubfieldNameAssignment_1 ) ) )
            // InternalYamlGenDsl.g:1032:1: ( ( rule__Extend__ParentSubfieldNameAssignment_1 ) )
            {
            // InternalYamlGenDsl.g:1032:1: ( ( rule__Extend__ParentSubfieldNameAssignment_1 ) )
            // InternalYamlGenDsl.g:1033:2: ( rule__Extend__ParentSubfieldNameAssignment_1 )
            {
             before(grammarAccess.getExtendAccess().getParentSubfieldNameAssignment_1()); 
            // InternalYamlGenDsl.g:1034:2: ( rule__Extend__ParentSubfieldNameAssignment_1 )
            // InternalYamlGenDsl.g:1034:3: rule__Extend__ParentSubfieldNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Extend__ParentSubfieldNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExtendAccess().getParentSubfieldNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extend__Group__1__Impl"


    // $ANTLR start "rule__Extend__Group__2"
    // InternalYamlGenDsl.g:1042:1: rule__Extend__Group__2 : rule__Extend__Group__2__Impl ;
    public final void rule__Extend__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1046:1: ( rule__Extend__Group__2__Impl )
            // InternalYamlGenDsl.g:1047:2: rule__Extend__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Extend__Group__2__Impl();

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
    // $ANTLR end "rule__Extend__Group__2"


    // $ANTLR start "rule__Extend__Group__2__Impl"
    // InternalYamlGenDsl.g:1053:1: rule__Extend__Group__2__Impl : ( ( rule__Extend__BodyAssignment_2 ) ) ;
    public final void rule__Extend__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1057:1: ( ( ( rule__Extend__BodyAssignment_2 ) ) )
            // InternalYamlGenDsl.g:1058:1: ( ( rule__Extend__BodyAssignment_2 ) )
            {
            // InternalYamlGenDsl.g:1058:1: ( ( rule__Extend__BodyAssignment_2 ) )
            // InternalYamlGenDsl.g:1059:2: ( rule__Extend__BodyAssignment_2 )
            {
             before(grammarAccess.getExtendAccess().getBodyAssignment_2()); 
            // InternalYamlGenDsl.g:1060:2: ( rule__Extend__BodyAssignment_2 )
            // InternalYamlGenDsl.g:1060:3: rule__Extend__BodyAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Extend__BodyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExtendAccess().getBodyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extend__Group__2__Impl"


    // $ANTLR start "rule__NestedField__Group__0"
    // InternalYamlGenDsl.g:1069:1: rule__NestedField__Group__0 : rule__NestedField__Group__0__Impl rule__NestedField__Group__1 ;
    public final void rule__NestedField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1073:1: ( rule__NestedField__Group__0__Impl rule__NestedField__Group__1 )
            // InternalYamlGenDsl.g:1074:2: rule__NestedField__Group__0__Impl rule__NestedField__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__NestedField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedField__Group__1();

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
    // $ANTLR end "rule__NestedField__Group__0"


    // $ANTLR start "rule__NestedField__Group__0__Impl"
    // InternalYamlGenDsl.g:1081:1: rule__NestedField__Group__0__Impl : ( ( rule__NestedField__HelpAssignment_0 )* ) ;
    public final void rule__NestedField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1085:1: ( ( ( rule__NestedField__HelpAssignment_0 )* ) )
            // InternalYamlGenDsl.g:1086:1: ( ( rule__NestedField__HelpAssignment_0 )* )
            {
            // InternalYamlGenDsl.g:1086:1: ( ( rule__NestedField__HelpAssignment_0 )* )
            // InternalYamlGenDsl.g:1087:2: ( rule__NestedField__HelpAssignment_0 )*
            {
             before(grammarAccess.getNestedFieldAccess().getHelpAssignment_0()); 
            // InternalYamlGenDsl.g:1088:2: ( rule__NestedField__HelpAssignment_0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_HELP_STRING) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalYamlGenDsl.g:1088:3: rule__NestedField__HelpAssignment_0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__NestedField__HelpAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getNestedFieldAccess().getHelpAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedField__Group__0__Impl"


    // $ANTLR start "rule__NestedField__Group__1"
    // InternalYamlGenDsl.g:1096:1: rule__NestedField__Group__1 : rule__NestedField__Group__1__Impl rule__NestedField__Group__2 ;
    public final void rule__NestedField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1100:1: ( rule__NestedField__Group__1__Impl rule__NestedField__Group__2 )
            // InternalYamlGenDsl.g:1101:2: rule__NestedField__Group__1__Impl rule__NestedField__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__NestedField__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedField__Group__2();

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
    // $ANTLR end "rule__NestedField__Group__1"


    // $ANTLR start "rule__NestedField__Group__1__Impl"
    // InternalYamlGenDsl.g:1108:1: rule__NestedField__Group__1__Impl : ( 'field' ) ;
    public final void rule__NestedField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1112:1: ( ( 'field' ) )
            // InternalYamlGenDsl.g:1113:1: ( 'field' )
            {
            // InternalYamlGenDsl.g:1113:1: ( 'field' )
            // InternalYamlGenDsl.g:1114:2: 'field'
            {
             before(grammarAccess.getNestedFieldAccess().getFieldKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getNestedFieldAccess().getFieldKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedField__Group__1__Impl"


    // $ANTLR start "rule__NestedField__Group__2"
    // InternalYamlGenDsl.g:1123:1: rule__NestedField__Group__2 : rule__NestedField__Group__2__Impl rule__NestedField__Group__3 ;
    public final void rule__NestedField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1127:1: ( rule__NestedField__Group__2__Impl rule__NestedField__Group__3 )
            // InternalYamlGenDsl.g:1128:2: rule__NestedField__Group__2__Impl rule__NestedField__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__NestedField__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedField__Group__3();

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
    // $ANTLR end "rule__NestedField__Group__2"


    // $ANTLR start "rule__NestedField__Group__2__Impl"
    // InternalYamlGenDsl.g:1135:1: rule__NestedField__Group__2__Impl : ( ( rule__NestedField__MandatoryAssignment_2 )? ) ;
    public final void rule__NestedField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1139:1: ( ( ( rule__NestedField__MandatoryAssignment_2 )? ) )
            // InternalYamlGenDsl.g:1140:1: ( ( rule__NestedField__MandatoryAssignment_2 )? )
            {
            // InternalYamlGenDsl.g:1140:1: ( ( rule__NestedField__MandatoryAssignment_2 )? )
            // InternalYamlGenDsl.g:1141:2: ( rule__NestedField__MandatoryAssignment_2 )?
            {
             before(grammarAccess.getNestedFieldAccess().getMandatoryAssignment_2()); 
            // InternalYamlGenDsl.g:1142:2: ( rule__NestedField__MandatoryAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalYamlGenDsl.g:1142:3: rule__NestedField__MandatoryAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__NestedField__MandatoryAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNestedFieldAccess().getMandatoryAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedField__Group__2__Impl"


    // $ANTLR start "rule__NestedField__Group__3"
    // InternalYamlGenDsl.g:1150:1: rule__NestedField__Group__3 : rule__NestedField__Group__3__Impl rule__NestedField__Group__4 ;
    public final void rule__NestedField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1154:1: ( rule__NestedField__Group__3__Impl rule__NestedField__Group__4 )
            // InternalYamlGenDsl.g:1155:2: rule__NestedField__Group__3__Impl rule__NestedField__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__NestedField__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedField__Group__4();

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
    // $ANTLR end "rule__NestedField__Group__3"


    // $ANTLR start "rule__NestedField__Group__3__Impl"
    // InternalYamlGenDsl.g:1162:1: rule__NestedField__Group__3__Impl : ( ( rule__NestedField__DefaultAssignment_3 )? ) ;
    public final void rule__NestedField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1166:1: ( ( ( rule__NestedField__DefaultAssignment_3 )? ) )
            // InternalYamlGenDsl.g:1167:1: ( ( rule__NestedField__DefaultAssignment_3 )? )
            {
            // InternalYamlGenDsl.g:1167:1: ( ( rule__NestedField__DefaultAssignment_3 )? )
            // InternalYamlGenDsl.g:1168:2: ( rule__NestedField__DefaultAssignment_3 )?
            {
             before(grammarAccess.getNestedFieldAccess().getDefaultAssignment_3()); 
            // InternalYamlGenDsl.g:1169:2: ( rule__NestedField__DefaultAssignment_3 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==15) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalYamlGenDsl.g:1169:3: rule__NestedField__DefaultAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__NestedField__DefaultAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNestedFieldAccess().getDefaultAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedField__Group__3__Impl"


    // $ANTLR start "rule__NestedField__Group__4"
    // InternalYamlGenDsl.g:1177:1: rule__NestedField__Group__4 : rule__NestedField__Group__4__Impl rule__NestedField__Group__5 ;
    public final void rule__NestedField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1181:1: ( rule__NestedField__Group__4__Impl rule__NestedField__Group__5 )
            // InternalYamlGenDsl.g:1182:2: rule__NestedField__Group__4__Impl rule__NestedField__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__NestedField__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedField__Group__5();

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
    // $ANTLR end "rule__NestedField__Group__4"


    // $ANTLR start "rule__NestedField__Group__4__Impl"
    // InternalYamlGenDsl.g:1189:1: rule__NestedField__Group__4__Impl : ( ( rule__NestedField__Group_4__0 )? ) ;
    public final void rule__NestedField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1193:1: ( ( ( rule__NestedField__Group_4__0 )? ) )
            // InternalYamlGenDsl.g:1194:1: ( ( rule__NestedField__Group_4__0 )? )
            {
            // InternalYamlGenDsl.g:1194:1: ( ( rule__NestedField__Group_4__0 )? )
            // InternalYamlGenDsl.g:1195:2: ( rule__NestedField__Group_4__0 )?
            {
             before(grammarAccess.getNestedFieldAccess().getGroup_4()); 
            // InternalYamlGenDsl.g:1196:2: ( rule__NestedField__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalYamlGenDsl.g:1196:3: rule__NestedField__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NestedField__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNestedFieldAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedField__Group__4__Impl"


    // $ANTLR start "rule__NestedField__Group__5"
    // InternalYamlGenDsl.g:1204:1: rule__NestedField__Group__5 : rule__NestedField__Group__5__Impl ;
    public final void rule__NestedField__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1208:1: ( rule__NestedField__Group__5__Impl )
            // InternalYamlGenDsl.g:1209:2: rule__NestedField__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NestedField__Group__5__Impl();

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
    // $ANTLR end "rule__NestedField__Group__5"


    // $ANTLR start "rule__NestedField__Group__5__Impl"
    // InternalYamlGenDsl.g:1215:1: rule__NestedField__Group__5__Impl : ( ( rule__NestedField__BodyAssignment_5 ) ) ;
    public final void rule__NestedField__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1219:1: ( ( ( rule__NestedField__BodyAssignment_5 ) ) )
            // InternalYamlGenDsl.g:1220:1: ( ( rule__NestedField__BodyAssignment_5 ) )
            {
            // InternalYamlGenDsl.g:1220:1: ( ( rule__NestedField__BodyAssignment_5 ) )
            // InternalYamlGenDsl.g:1221:2: ( rule__NestedField__BodyAssignment_5 )
            {
             before(grammarAccess.getNestedFieldAccess().getBodyAssignment_5()); 
            // InternalYamlGenDsl.g:1222:2: ( rule__NestedField__BodyAssignment_5 )
            // InternalYamlGenDsl.g:1222:3: rule__NestedField__BodyAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__NestedField__BodyAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getNestedFieldAccess().getBodyAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedField__Group__5__Impl"


    // $ANTLR start "rule__NestedField__Group_4__0"
    // InternalYamlGenDsl.g:1231:1: rule__NestedField__Group_4__0 : rule__NestedField__Group_4__0__Impl rule__NestedField__Group_4__1 ;
    public final void rule__NestedField__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1235:1: ( rule__NestedField__Group_4__0__Impl rule__NestedField__Group_4__1 )
            // InternalYamlGenDsl.g:1236:2: rule__NestedField__Group_4__0__Impl rule__NestedField__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__NestedField__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedField__Group_4__1();

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
    // $ANTLR end "rule__NestedField__Group_4__0"


    // $ANTLR start "rule__NestedField__Group_4__0__Impl"
    // InternalYamlGenDsl.g:1243:1: rule__NestedField__Group_4__0__Impl : ( 'extends' ) ;
    public final void rule__NestedField__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1247:1: ( ( 'extends' ) )
            // InternalYamlGenDsl.g:1248:1: ( 'extends' )
            {
            // InternalYamlGenDsl.g:1248:1: ( 'extends' )
            // InternalYamlGenDsl.g:1249:2: 'extends'
            {
             before(grammarAccess.getNestedFieldAccess().getExtendsKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getNestedFieldAccess().getExtendsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedField__Group_4__0__Impl"


    // $ANTLR start "rule__NestedField__Group_4__1"
    // InternalYamlGenDsl.g:1258:1: rule__NestedField__Group_4__1 : rule__NestedField__Group_4__1__Impl ;
    public final void rule__NestedField__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1262:1: ( rule__NestedField__Group_4__1__Impl )
            // InternalYamlGenDsl.g:1263:2: rule__NestedField__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NestedField__Group_4__1__Impl();

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
    // $ANTLR end "rule__NestedField__Group_4__1"


    // $ANTLR start "rule__NestedField__Group_4__1__Impl"
    // InternalYamlGenDsl.g:1269:1: rule__NestedField__Group_4__1__Impl : ( ( rule__NestedField__SuperFieldAssignment_4_1 ) ) ;
    public final void rule__NestedField__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1273:1: ( ( ( rule__NestedField__SuperFieldAssignment_4_1 ) ) )
            // InternalYamlGenDsl.g:1274:1: ( ( rule__NestedField__SuperFieldAssignment_4_1 ) )
            {
            // InternalYamlGenDsl.g:1274:1: ( ( rule__NestedField__SuperFieldAssignment_4_1 ) )
            // InternalYamlGenDsl.g:1275:2: ( rule__NestedField__SuperFieldAssignment_4_1 )
            {
             before(grammarAccess.getNestedFieldAccess().getSuperFieldAssignment_4_1()); 
            // InternalYamlGenDsl.g:1276:2: ( rule__NestedField__SuperFieldAssignment_4_1 )
            // InternalYamlGenDsl.g:1276:3: rule__NestedField__SuperFieldAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__NestedField__SuperFieldAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getNestedFieldAccess().getSuperFieldAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedField__Group_4__1__Impl"


    // $ANTLR start "rule__NestedFields__Group__0"
    // InternalYamlGenDsl.g:1285:1: rule__NestedFields__Group__0 : rule__NestedFields__Group__0__Impl rule__NestedFields__Group__1 ;
    public final void rule__NestedFields__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1289:1: ( rule__NestedFields__Group__0__Impl rule__NestedFields__Group__1 )
            // InternalYamlGenDsl.g:1290:2: rule__NestedFields__Group__0__Impl rule__NestedFields__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__NestedFields__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedFields__Group__1();

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
    // $ANTLR end "rule__NestedFields__Group__0"


    // $ANTLR start "rule__NestedFields__Group__0__Impl"
    // InternalYamlGenDsl.g:1297:1: rule__NestedFields__Group__0__Impl : ( ( rule__NestedFields__HelpAssignment_0 )* ) ;
    public final void rule__NestedFields__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1301:1: ( ( ( rule__NestedFields__HelpAssignment_0 )* ) )
            // InternalYamlGenDsl.g:1302:1: ( ( rule__NestedFields__HelpAssignment_0 )* )
            {
            // InternalYamlGenDsl.g:1302:1: ( ( rule__NestedFields__HelpAssignment_0 )* )
            // InternalYamlGenDsl.g:1303:2: ( rule__NestedFields__HelpAssignment_0 )*
            {
             before(grammarAccess.getNestedFieldsAccess().getHelpAssignment_0()); 
            // InternalYamlGenDsl.g:1304:2: ( rule__NestedFields__HelpAssignment_0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_HELP_STRING) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalYamlGenDsl.g:1304:3: rule__NestedFields__HelpAssignment_0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__NestedFields__HelpAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getNestedFieldsAccess().getHelpAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedFields__Group__0__Impl"


    // $ANTLR start "rule__NestedFields__Group__1"
    // InternalYamlGenDsl.g:1312:1: rule__NestedFields__Group__1 : rule__NestedFields__Group__1__Impl rule__NestedFields__Group__2 ;
    public final void rule__NestedFields__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1316:1: ( rule__NestedFields__Group__1__Impl rule__NestedFields__Group__2 )
            // InternalYamlGenDsl.g:1317:2: rule__NestedFields__Group__1__Impl rule__NestedFields__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__NestedFields__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedFields__Group__2();

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
    // $ANTLR end "rule__NestedFields__Group__1"


    // $ANTLR start "rule__NestedFields__Group__1__Impl"
    // InternalYamlGenDsl.g:1324:1: rule__NestedFields__Group__1__Impl : ( 'fields' ) ;
    public final void rule__NestedFields__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1328:1: ( ( 'fields' ) )
            // InternalYamlGenDsl.g:1329:1: ( 'fields' )
            {
            // InternalYamlGenDsl.g:1329:1: ( 'fields' )
            // InternalYamlGenDsl.g:1330:2: 'fields'
            {
             before(grammarAccess.getNestedFieldsAccess().getFieldsKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getNestedFieldsAccess().getFieldsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedFields__Group__1__Impl"


    // $ANTLR start "rule__NestedFields__Group__2"
    // InternalYamlGenDsl.g:1339:1: rule__NestedFields__Group__2 : rule__NestedFields__Group__2__Impl rule__NestedFields__Group__3 ;
    public final void rule__NestedFields__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1343:1: ( rule__NestedFields__Group__2__Impl rule__NestedFields__Group__3 )
            // InternalYamlGenDsl.g:1344:2: rule__NestedFields__Group__2__Impl rule__NestedFields__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__NestedFields__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedFields__Group__3();

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
    // $ANTLR end "rule__NestedFields__Group__2"


    // $ANTLR start "rule__NestedFields__Group__2__Impl"
    // InternalYamlGenDsl.g:1351:1: rule__NestedFields__Group__2__Impl : ( ( rule__NestedFields__Group_2__0 )? ) ;
    public final void rule__NestedFields__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1355:1: ( ( ( rule__NestedFields__Group_2__0 )? ) )
            // InternalYamlGenDsl.g:1356:1: ( ( rule__NestedFields__Group_2__0 )? )
            {
            // InternalYamlGenDsl.g:1356:1: ( ( rule__NestedFields__Group_2__0 )? )
            // InternalYamlGenDsl.g:1357:2: ( rule__NestedFields__Group_2__0 )?
            {
             before(grammarAccess.getNestedFieldsAccess().getGroup_2()); 
            // InternalYamlGenDsl.g:1358:2: ( rule__NestedFields__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalYamlGenDsl.g:1358:3: rule__NestedFields__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NestedFields__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNestedFieldsAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedFields__Group__2__Impl"


    // $ANTLR start "rule__NestedFields__Group__3"
    // InternalYamlGenDsl.g:1366:1: rule__NestedFields__Group__3 : rule__NestedFields__Group__3__Impl ;
    public final void rule__NestedFields__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1370:1: ( rule__NestedFields__Group__3__Impl )
            // InternalYamlGenDsl.g:1371:2: rule__NestedFields__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NestedFields__Group__3__Impl();

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
    // $ANTLR end "rule__NestedFields__Group__3"


    // $ANTLR start "rule__NestedFields__Group__3__Impl"
    // InternalYamlGenDsl.g:1377:1: rule__NestedFields__Group__3__Impl : ( ( rule__NestedFields__BodyAssignment_3 ) ) ;
    public final void rule__NestedFields__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1381:1: ( ( ( rule__NestedFields__BodyAssignment_3 ) ) )
            // InternalYamlGenDsl.g:1382:1: ( ( rule__NestedFields__BodyAssignment_3 ) )
            {
            // InternalYamlGenDsl.g:1382:1: ( ( rule__NestedFields__BodyAssignment_3 ) )
            // InternalYamlGenDsl.g:1383:2: ( rule__NestedFields__BodyAssignment_3 )
            {
             before(grammarAccess.getNestedFieldsAccess().getBodyAssignment_3()); 
            // InternalYamlGenDsl.g:1384:2: ( rule__NestedFields__BodyAssignment_3 )
            // InternalYamlGenDsl.g:1384:3: rule__NestedFields__BodyAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__NestedFields__BodyAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNestedFieldsAccess().getBodyAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedFields__Group__3__Impl"


    // $ANTLR start "rule__NestedFields__Group_2__0"
    // InternalYamlGenDsl.g:1393:1: rule__NestedFields__Group_2__0 : rule__NestedFields__Group_2__0__Impl rule__NestedFields__Group_2__1 ;
    public final void rule__NestedFields__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1397:1: ( rule__NestedFields__Group_2__0__Impl rule__NestedFields__Group_2__1 )
            // InternalYamlGenDsl.g:1398:2: rule__NestedFields__Group_2__0__Impl rule__NestedFields__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__NestedFields__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedFields__Group_2__1();

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
    // $ANTLR end "rule__NestedFields__Group_2__0"


    // $ANTLR start "rule__NestedFields__Group_2__0__Impl"
    // InternalYamlGenDsl.g:1405:1: rule__NestedFields__Group_2__0__Impl : ( 'extend' ) ;
    public final void rule__NestedFields__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1409:1: ( ( 'extend' ) )
            // InternalYamlGenDsl.g:1410:1: ( 'extend' )
            {
            // InternalYamlGenDsl.g:1410:1: ( 'extend' )
            // InternalYamlGenDsl.g:1411:2: 'extend'
            {
             before(grammarAccess.getNestedFieldsAccess().getExtendKeyword_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getNestedFieldsAccess().getExtendKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedFields__Group_2__0__Impl"


    // $ANTLR start "rule__NestedFields__Group_2__1"
    // InternalYamlGenDsl.g:1420:1: rule__NestedFields__Group_2__1 : rule__NestedFields__Group_2__1__Impl ;
    public final void rule__NestedFields__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1424:1: ( rule__NestedFields__Group_2__1__Impl )
            // InternalYamlGenDsl.g:1425:2: rule__NestedFields__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NestedFields__Group_2__1__Impl();

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
    // $ANTLR end "rule__NestedFields__Group_2__1"


    // $ANTLR start "rule__NestedFields__Group_2__1__Impl"
    // InternalYamlGenDsl.g:1431:1: rule__NestedFields__Group_2__1__Impl : ( ( rule__NestedFields__SuperFieldAssignment_2_1 ) ) ;
    public final void rule__NestedFields__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1435:1: ( ( ( rule__NestedFields__SuperFieldAssignment_2_1 ) ) )
            // InternalYamlGenDsl.g:1436:1: ( ( rule__NestedFields__SuperFieldAssignment_2_1 ) )
            {
            // InternalYamlGenDsl.g:1436:1: ( ( rule__NestedFields__SuperFieldAssignment_2_1 ) )
            // InternalYamlGenDsl.g:1437:2: ( rule__NestedFields__SuperFieldAssignment_2_1 )
            {
             before(grammarAccess.getNestedFieldsAccess().getSuperFieldAssignment_2_1()); 
            // InternalYamlGenDsl.g:1438:2: ( rule__NestedFields__SuperFieldAssignment_2_1 )
            // InternalYamlGenDsl.g:1438:3: rule__NestedFields__SuperFieldAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__NestedFields__SuperFieldAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getNestedFieldsAccess().getSuperFieldAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedFields__Group_2__1__Impl"


    // $ANTLR start "rule__StringProperty__Group__0"
    // InternalYamlGenDsl.g:1447:1: rule__StringProperty__Group__0 : rule__StringProperty__Group__0__Impl rule__StringProperty__Group__1 ;
    public final void rule__StringProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1451:1: ( rule__StringProperty__Group__0__Impl rule__StringProperty__Group__1 )
            // InternalYamlGenDsl.g:1452:2: rule__StringProperty__Group__0__Impl rule__StringProperty__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__StringProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringProperty__Group__1();

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
    // $ANTLR end "rule__StringProperty__Group__0"


    // $ANTLR start "rule__StringProperty__Group__0__Impl"
    // InternalYamlGenDsl.g:1459:1: rule__StringProperty__Group__0__Impl : ( ( rule__StringProperty__KeyAssignment_0 ) ) ;
    public final void rule__StringProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1463:1: ( ( ( rule__StringProperty__KeyAssignment_0 ) ) )
            // InternalYamlGenDsl.g:1464:1: ( ( rule__StringProperty__KeyAssignment_0 ) )
            {
            // InternalYamlGenDsl.g:1464:1: ( ( rule__StringProperty__KeyAssignment_0 ) )
            // InternalYamlGenDsl.g:1465:2: ( rule__StringProperty__KeyAssignment_0 )
            {
             before(grammarAccess.getStringPropertyAccess().getKeyAssignment_0()); 
            // InternalYamlGenDsl.g:1466:2: ( rule__StringProperty__KeyAssignment_0 )
            // InternalYamlGenDsl.g:1466:3: rule__StringProperty__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__StringProperty__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStringPropertyAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringProperty__Group__0__Impl"


    // $ANTLR start "rule__StringProperty__Group__1"
    // InternalYamlGenDsl.g:1474:1: rule__StringProperty__Group__1 : rule__StringProperty__Group__1__Impl rule__StringProperty__Group__2 ;
    public final void rule__StringProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1478:1: ( rule__StringProperty__Group__1__Impl rule__StringProperty__Group__2 )
            // InternalYamlGenDsl.g:1479:2: rule__StringProperty__Group__1__Impl rule__StringProperty__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__StringProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringProperty__Group__2();

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
    // $ANTLR end "rule__StringProperty__Group__1"


    // $ANTLR start "rule__StringProperty__Group__1__Impl"
    // InternalYamlGenDsl.g:1486:1: rule__StringProperty__Group__1__Impl : ( ':' ) ;
    public final void rule__StringProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1490:1: ( ( ':' ) )
            // InternalYamlGenDsl.g:1491:1: ( ':' )
            {
            // InternalYamlGenDsl.g:1491:1: ( ':' )
            // InternalYamlGenDsl.g:1492:2: ':'
            {
             before(grammarAccess.getStringPropertyAccess().getColonKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getStringPropertyAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringProperty__Group__1__Impl"


    // $ANTLR start "rule__StringProperty__Group__2"
    // InternalYamlGenDsl.g:1501:1: rule__StringProperty__Group__2 : rule__StringProperty__Group__2__Impl ;
    public final void rule__StringProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1505:1: ( rule__StringProperty__Group__2__Impl )
            // InternalYamlGenDsl.g:1506:2: rule__StringProperty__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringProperty__Group__2__Impl();

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
    // $ANTLR end "rule__StringProperty__Group__2"


    // $ANTLR start "rule__StringProperty__Group__2__Impl"
    // InternalYamlGenDsl.g:1512:1: rule__StringProperty__Group__2__Impl : ( ( rule__StringProperty__ValueAssignment_2 ) ) ;
    public final void rule__StringProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1516:1: ( ( ( rule__StringProperty__ValueAssignment_2 ) ) )
            // InternalYamlGenDsl.g:1517:1: ( ( rule__StringProperty__ValueAssignment_2 ) )
            {
            // InternalYamlGenDsl.g:1517:1: ( ( rule__StringProperty__ValueAssignment_2 ) )
            // InternalYamlGenDsl.g:1518:2: ( rule__StringProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getStringPropertyAccess().getValueAssignment_2()); 
            // InternalYamlGenDsl.g:1519:2: ( rule__StringProperty__ValueAssignment_2 )
            // InternalYamlGenDsl.g:1519:3: rule__StringProperty__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StringProperty__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStringPropertyAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringProperty__Group__2__Impl"


    // $ANTLR start "rule__ValuesProperty__Group__0"
    // InternalYamlGenDsl.g:1528:1: rule__ValuesProperty__Group__0 : rule__ValuesProperty__Group__0__Impl rule__ValuesProperty__Group__1 ;
    public final void rule__ValuesProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1532:1: ( rule__ValuesProperty__Group__0__Impl rule__ValuesProperty__Group__1 )
            // InternalYamlGenDsl.g:1533:2: rule__ValuesProperty__Group__0__Impl rule__ValuesProperty__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__ValuesProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValuesProperty__Group__1();

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
    // $ANTLR end "rule__ValuesProperty__Group__0"


    // $ANTLR start "rule__ValuesProperty__Group__0__Impl"
    // InternalYamlGenDsl.g:1540:1: rule__ValuesProperty__Group__0__Impl : ( ( rule__ValuesProperty__KeyAssignment_0 ) ) ;
    public final void rule__ValuesProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1544:1: ( ( ( rule__ValuesProperty__KeyAssignment_0 ) ) )
            // InternalYamlGenDsl.g:1545:1: ( ( rule__ValuesProperty__KeyAssignment_0 ) )
            {
            // InternalYamlGenDsl.g:1545:1: ( ( rule__ValuesProperty__KeyAssignment_0 ) )
            // InternalYamlGenDsl.g:1546:2: ( rule__ValuesProperty__KeyAssignment_0 )
            {
             before(grammarAccess.getValuesPropertyAccess().getKeyAssignment_0()); 
            // InternalYamlGenDsl.g:1547:2: ( rule__ValuesProperty__KeyAssignment_0 )
            // InternalYamlGenDsl.g:1547:3: rule__ValuesProperty__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ValuesProperty__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getValuesPropertyAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValuesProperty__Group__0__Impl"


    // $ANTLR start "rule__ValuesProperty__Group__1"
    // InternalYamlGenDsl.g:1555:1: rule__ValuesProperty__Group__1 : rule__ValuesProperty__Group__1__Impl rule__ValuesProperty__Group__2 ;
    public final void rule__ValuesProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1559:1: ( rule__ValuesProperty__Group__1__Impl rule__ValuesProperty__Group__2 )
            // InternalYamlGenDsl.g:1560:2: rule__ValuesProperty__Group__1__Impl rule__ValuesProperty__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__ValuesProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValuesProperty__Group__2();

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
    // $ANTLR end "rule__ValuesProperty__Group__1"


    // $ANTLR start "rule__ValuesProperty__Group__1__Impl"
    // InternalYamlGenDsl.g:1567:1: rule__ValuesProperty__Group__1__Impl : ( ':' ) ;
    public final void rule__ValuesProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1571:1: ( ( ':' ) )
            // InternalYamlGenDsl.g:1572:1: ( ':' )
            {
            // InternalYamlGenDsl.g:1572:1: ( ':' )
            // InternalYamlGenDsl.g:1573:2: ':'
            {
             before(grammarAccess.getValuesPropertyAccess().getColonKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getValuesPropertyAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValuesProperty__Group__1__Impl"


    // $ANTLR start "rule__ValuesProperty__Group__2"
    // InternalYamlGenDsl.g:1582:1: rule__ValuesProperty__Group__2 : rule__ValuesProperty__Group__2__Impl ;
    public final void rule__ValuesProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1586:1: ( rule__ValuesProperty__Group__2__Impl )
            // InternalYamlGenDsl.g:1587:2: rule__ValuesProperty__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValuesProperty__Group__2__Impl();

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
    // $ANTLR end "rule__ValuesProperty__Group__2"


    // $ANTLR start "rule__ValuesProperty__Group__2__Impl"
    // InternalYamlGenDsl.g:1593:1: rule__ValuesProperty__Group__2__Impl : ( ( rule__ValuesProperty__ValueAssignment_2 ) ) ;
    public final void rule__ValuesProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1597:1: ( ( ( rule__ValuesProperty__ValueAssignment_2 ) ) )
            // InternalYamlGenDsl.g:1598:1: ( ( rule__ValuesProperty__ValueAssignment_2 ) )
            {
            // InternalYamlGenDsl.g:1598:1: ( ( rule__ValuesProperty__ValueAssignment_2 ) )
            // InternalYamlGenDsl.g:1599:2: ( rule__ValuesProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getValuesPropertyAccess().getValueAssignment_2()); 
            // InternalYamlGenDsl.g:1600:2: ( rule__ValuesProperty__ValueAssignment_2 )
            // InternalYamlGenDsl.g:1600:3: rule__ValuesProperty__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ValuesProperty__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getValuesPropertyAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValuesProperty__Group__2__Impl"


    // $ANTLR start "rule__TypeProperty__Group__0"
    // InternalYamlGenDsl.g:1609:1: rule__TypeProperty__Group__0 : rule__TypeProperty__Group__0__Impl rule__TypeProperty__Group__1 ;
    public final void rule__TypeProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1613:1: ( rule__TypeProperty__Group__0__Impl rule__TypeProperty__Group__1 )
            // InternalYamlGenDsl.g:1614:2: rule__TypeProperty__Group__0__Impl rule__TypeProperty__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__TypeProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeProperty__Group__1();

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
    // $ANTLR end "rule__TypeProperty__Group__0"


    // $ANTLR start "rule__TypeProperty__Group__0__Impl"
    // InternalYamlGenDsl.g:1621:1: rule__TypeProperty__Group__0__Impl : ( ( rule__TypeProperty__KeyAssignment_0 ) ) ;
    public final void rule__TypeProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1625:1: ( ( ( rule__TypeProperty__KeyAssignment_0 ) ) )
            // InternalYamlGenDsl.g:1626:1: ( ( rule__TypeProperty__KeyAssignment_0 ) )
            {
            // InternalYamlGenDsl.g:1626:1: ( ( rule__TypeProperty__KeyAssignment_0 ) )
            // InternalYamlGenDsl.g:1627:2: ( rule__TypeProperty__KeyAssignment_0 )
            {
             before(grammarAccess.getTypePropertyAccess().getKeyAssignment_0()); 
            // InternalYamlGenDsl.g:1628:2: ( rule__TypeProperty__KeyAssignment_0 )
            // InternalYamlGenDsl.g:1628:3: rule__TypeProperty__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TypeProperty__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTypePropertyAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeProperty__Group__0__Impl"


    // $ANTLR start "rule__TypeProperty__Group__1"
    // InternalYamlGenDsl.g:1636:1: rule__TypeProperty__Group__1 : rule__TypeProperty__Group__1__Impl rule__TypeProperty__Group__2 ;
    public final void rule__TypeProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1640:1: ( rule__TypeProperty__Group__1__Impl rule__TypeProperty__Group__2 )
            // InternalYamlGenDsl.g:1641:2: rule__TypeProperty__Group__1__Impl rule__TypeProperty__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__TypeProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeProperty__Group__2();

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
    // $ANTLR end "rule__TypeProperty__Group__1"


    // $ANTLR start "rule__TypeProperty__Group__1__Impl"
    // InternalYamlGenDsl.g:1648:1: rule__TypeProperty__Group__1__Impl : ( ':' ) ;
    public final void rule__TypeProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1652:1: ( ( ':' ) )
            // InternalYamlGenDsl.g:1653:1: ( ':' )
            {
            // InternalYamlGenDsl.g:1653:1: ( ':' )
            // InternalYamlGenDsl.g:1654:2: ':'
            {
             before(grammarAccess.getTypePropertyAccess().getColonKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTypePropertyAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeProperty__Group__1__Impl"


    // $ANTLR start "rule__TypeProperty__Group__2"
    // InternalYamlGenDsl.g:1663:1: rule__TypeProperty__Group__2 : rule__TypeProperty__Group__2__Impl rule__TypeProperty__Group__3 ;
    public final void rule__TypeProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1667:1: ( rule__TypeProperty__Group__2__Impl rule__TypeProperty__Group__3 )
            // InternalYamlGenDsl.g:1668:2: rule__TypeProperty__Group__2__Impl rule__TypeProperty__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__TypeProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeProperty__Group__3();

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
    // $ANTLR end "rule__TypeProperty__Group__2"


    // $ANTLR start "rule__TypeProperty__Group__2__Impl"
    // InternalYamlGenDsl.g:1675:1: rule__TypeProperty__Group__2__Impl : ( ( rule__TypeProperty__ValueAssignment_2 ) ) ;
    public final void rule__TypeProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1679:1: ( ( ( rule__TypeProperty__ValueAssignment_2 ) ) )
            // InternalYamlGenDsl.g:1680:1: ( ( rule__TypeProperty__ValueAssignment_2 ) )
            {
            // InternalYamlGenDsl.g:1680:1: ( ( rule__TypeProperty__ValueAssignment_2 ) )
            // InternalYamlGenDsl.g:1681:2: ( rule__TypeProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getTypePropertyAccess().getValueAssignment_2()); 
            // InternalYamlGenDsl.g:1682:2: ( rule__TypeProperty__ValueAssignment_2 )
            // InternalYamlGenDsl.g:1682:3: rule__TypeProperty__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TypeProperty__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTypePropertyAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeProperty__Group__2__Impl"


    // $ANTLR start "rule__TypeProperty__Group__3"
    // InternalYamlGenDsl.g:1690:1: rule__TypeProperty__Group__3 : rule__TypeProperty__Group__3__Impl ;
    public final void rule__TypeProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1694:1: ( rule__TypeProperty__Group__3__Impl )
            // InternalYamlGenDsl.g:1695:2: rule__TypeProperty__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeProperty__Group__3__Impl();

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
    // $ANTLR end "rule__TypeProperty__Group__3"


    // $ANTLR start "rule__TypeProperty__Group__3__Impl"
    // InternalYamlGenDsl.g:1701:1: rule__TypeProperty__Group__3__Impl : ( ( rule__TypeProperty__Group_3__0 )? ) ;
    public final void rule__TypeProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1705:1: ( ( ( rule__TypeProperty__Group_3__0 )? ) )
            // InternalYamlGenDsl.g:1706:1: ( ( rule__TypeProperty__Group_3__0 )? )
            {
            // InternalYamlGenDsl.g:1706:1: ( ( rule__TypeProperty__Group_3__0 )? )
            // InternalYamlGenDsl.g:1707:2: ( rule__TypeProperty__Group_3__0 )?
            {
             before(grammarAccess.getTypePropertyAccess().getGroup_3()); 
            // InternalYamlGenDsl.g:1708:2: ( rule__TypeProperty__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalYamlGenDsl.g:1708:3: rule__TypeProperty__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypeProperty__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypePropertyAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeProperty__Group__3__Impl"


    // $ANTLR start "rule__TypeProperty__Group_3__0"
    // InternalYamlGenDsl.g:1717:1: rule__TypeProperty__Group_3__0 : rule__TypeProperty__Group_3__0__Impl rule__TypeProperty__Group_3__1 ;
    public final void rule__TypeProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1721:1: ( rule__TypeProperty__Group_3__0__Impl rule__TypeProperty__Group_3__1 )
            // InternalYamlGenDsl.g:1722:2: rule__TypeProperty__Group_3__0__Impl rule__TypeProperty__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__TypeProperty__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeProperty__Group_3__1();

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
    // $ANTLR end "rule__TypeProperty__Group_3__0"


    // $ANTLR start "rule__TypeProperty__Group_3__0__Impl"
    // InternalYamlGenDsl.g:1729:1: rule__TypeProperty__Group_3__0__Impl : ( '(' ) ;
    public final void rule__TypeProperty__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1733:1: ( ( '(' ) )
            // InternalYamlGenDsl.g:1734:1: ( '(' )
            {
            // InternalYamlGenDsl.g:1734:1: ( '(' )
            // InternalYamlGenDsl.g:1735:2: '('
            {
             before(grammarAccess.getTypePropertyAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTypePropertyAccess().getLeftParenthesisKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeProperty__Group_3__0__Impl"


    // $ANTLR start "rule__TypeProperty__Group_3__1"
    // InternalYamlGenDsl.g:1744:1: rule__TypeProperty__Group_3__1 : rule__TypeProperty__Group_3__1__Impl rule__TypeProperty__Group_3__2 ;
    public final void rule__TypeProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1748:1: ( rule__TypeProperty__Group_3__1__Impl rule__TypeProperty__Group_3__2 )
            // InternalYamlGenDsl.g:1749:2: rule__TypeProperty__Group_3__1__Impl rule__TypeProperty__Group_3__2
            {
            pushFollow(FOLLOW_19);
            rule__TypeProperty__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeProperty__Group_3__2();

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
    // $ANTLR end "rule__TypeProperty__Group_3__1"


    // $ANTLR start "rule__TypeProperty__Group_3__1__Impl"
    // InternalYamlGenDsl.g:1756:1: rule__TypeProperty__Group_3__1__Impl : ( ( rule__TypeProperty__HelpAssignment_3_1 ) ) ;
    public final void rule__TypeProperty__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1760:1: ( ( ( rule__TypeProperty__HelpAssignment_3_1 ) ) )
            // InternalYamlGenDsl.g:1761:1: ( ( rule__TypeProperty__HelpAssignment_3_1 ) )
            {
            // InternalYamlGenDsl.g:1761:1: ( ( rule__TypeProperty__HelpAssignment_3_1 ) )
            // InternalYamlGenDsl.g:1762:2: ( rule__TypeProperty__HelpAssignment_3_1 )
            {
             before(grammarAccess.getTypePropertyAccess().getHelpAssignment_3_1()); 
            // InternalYamlGenDsl.g:1763:2: ( rule__TypeProperty__HelpAssignment_3_1 )
            // InternalYamlGenDsl.g:1763:3: rule__TypeProperty__HelpAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeProperty__HelpAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTypePropertyAccess().getHelpAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeProperty__Group_3__1__Impl"


    // $ANTLR start "rule__TypeProperty__Group_3__2"
    // InternalYamlGenDsl.g:1771:1: rule__TypeProperty__Group_3__2 : rule__TypeProperty__Group_3__2__Impl ;
    public final void rule__TypeProperty__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1775:1: ( rule__TypeProperty__Group_3__2__Impl )
            // InternalYamlGenDsl.g:1776:2: rule__TypeProperty__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeProperty__Group_3__2__Impl();

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
    // $ANTLR end "rule__TypeProperty__Group_3__2"


    // $ANTLR start "rule__TypeProperty__Group_3__2__Impl"
    // InternalYamlGenDsl.g:1782:1: rule__TypeProperty__Group_3__2__Impl : ( ')' ) ;
    public final void rule__TypeProperty__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1786:1: ( ( ')' ) )
            // InternalYamlGenDsl.g:1787:1: ( ')' )
            {
            // InternalYamlGenDsl.g:1787:1: ( ')' )
            // InternalYamlGenDsl.g:1788:2: ')'
            {
             before(grammarAccess.getTypePropertyAccess().getRightParenthesisKeyword_3_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTypePropertyAccess().getRightParenthesisKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeProperty__Group_3__2__Impl"


    // $ANTLR start "rule__Values__Group_0__0"
    // InternalYamlGenDsl.g:1798:1: rule__Values__Group_0__0 : rule__Values__Group_0__0__Impl rule__Values__Group_0__1 ;
    public final void rule__Values__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1802:1: ( rule__Values__Group_0__0__Impl rule__Values__Group_0__1 )
            // InternalYamlGenDsl.g:1803:2: rule__Values__Group_0__0__Impl rule__Values__Group_0__1
            {
            pushFollow(FOLLOW_16);
            rule__Values__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Values__Group_0__1();

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
    // $ANTLR end "rule__Values__Group_0__0"


    // $ANTLR start "rule__Values__Group_0__0__Impl"
    // InternalYamlGenDsl.g:1810:1: rule__Values__Group_0__0__Impl : ( '[' ) ;
    public final void rule__Values__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1814:1: ( ( '[' ) )
            // InternalYamlGenDsl.g:1815:1: ( '[' )
            {
            // InternalYamlGenDsl.g:1815:1: ( '[' )
            // InternalYamlGenDsl.g:1816:2: '['
            {
             before(grammarAccess.getValuesAccess().getLeftSquareBracketKeyword_0_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getValuesAccess().getLeftSquareBracketKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group_0__0__Impl"


    // $ANTLR start "rule__Values__Group_0__1"
    // InternalYamlGenDsl.g:1825:1: rule__Values__Group_0__1 : rule__Values__Group_0__1__Impl rule__Values__Group_0__2 ;
    public final void rule__Values__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1829:1: ( rule__Values__Group_0__1__Impl rule__Values__Group_0__2 )
            // InternalYamlGenDsl.g:1830:2: rule__Values__Group_0__1__Impl rule__Values__Group_0__2
            {
            pushFollow(FOLLOW_20);
            rule__Values__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Values__Group_0__2();

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
    // $ANTLR end "rule__Values__Group_0__1"


    // $ANTLR start "rule__Values__Group_0__1__Impl"
    // InternalYamlGenDsl.g:1837:1: rule__Values__Group_0__1__Impl : ( ( ( rule__Values__ValuesAssignment_0_1 ) ) ( ( rule__Values__ValuesAssignment_0_1 )* ) ) ;
    public final void rule__Values__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1841:1: ( ( ( ( rule__Values__ValuesAssignment_0_1 ) ) ( ( rule__Values__ValuesAssignment_0_1 )* ) ) )
            // InternalYamlGenDsl.g:1842:1: ( ( ( rule__Values__ValuesAssignment_0_1 ) ) ( ( rule__Values__ValuesAssignment_0_1 )* ) )
            {
            // InternalYamlGenDsl.g:1842:1: ( ( ( rule__Values__ValuesAssignment_0_1 ) ) ( ( rule__Values__ValuesAssignment_0_1 )* ) )
            // InternalYamlGenDsl.g:1843:2: ( ( rule__Values__ValuesAssignment_0_1 ) ) ( ( rule__Values__ValuesAssignment_0_1 )* )
            {
            // InternalYamlGenDsl.g:1843:2: ( ( rule__Values__ValuesAssignment_0_1 ) )
            // InternalYamlGenDsl.g:1844:3: ( rule__Values__ValuesAssignment_0_1 )
            {
             before(grammarAccess.getValuesAccess().getValuesAssignment_0_1()); 
            // InternalYamlGenDsl.g:1845:3: ( rule__Values__ValuesAssignment_0_1 )
            // InternalYamlGenDsl.g:1845:4: rule__Values__ValuesAssignment_0_1
            {
            pushFollow(FOLLOW_21);
            rule__Values__ValuesAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getValuesAccess().getValuesAssignment_0_1()); 

            }

            // InternalYamlGenDsl.g:1848:2: ( ( rule__Values__ValuesAssignment_0_1 )* )
            // InternalYamlGenDsl.g:1849:3: ( rule__Values__ValuesAssignment_0_1 )*
            {
             before(grammarAccess.getValuesAccess().getValuesAssignment_0_1()); 
            // InternalYamlGenDsl.g:1850:3: ( rule__Values__ValuesAssignment_0_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_STRING||LA21_0==32) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalYamlGenDsl.g:1850:4: rule__Values__ValuesAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Values__ValuesAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getValuesAccess().getValuesAssignment_0_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group_0__1__Impl"


    // $ANTLR start "rule__Values__Group_0__2"
    // InternalYamlGenDsl.g:1859:1: rule__Values__Group_0__2 : rule__Values__Group_0__2__Impl ;
    public final void rule__Values__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1863:1: ( rule__Values__Group_0__2__Impl )
            // InternalYamlGenDsl.g:1864:2: rule__Values__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Values__Group_0__2__Impl();

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
    // $ANTLR end "rule__Values__Group_0__2"


    // $ANTLR start "rule__Values__Group_0__2__Impl"
    // InternalYamlGenDsl.g:1870:1: rule__Values__Group_0__2__Impl : ( ']' ) ;
    public final void rule__Values__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1874:1: ( ( ']' ) )
            // InternalYamlGenDsl.g:1875:1: ( ']' )
            {
            // InternalYamlGenDsl.g:1875:1: ( ']' )
            // InternalYamlGenDsl.g:1876:2: ']'
            {
             before(grammarAccess.getValuesAccess().getRightSquareBracketKeyword_0_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getValuesAccess().getRightSquareBracketKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group_0__2__Impl"


    // $ANTLR start "rule__Source__EntriesAssignment"
    // InternalYamlGenDsl.g:1886:1: rule__Source__EntriesAssignment : ( ruleSourceElement ) ;
    public final void rule__Source__EntriesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1890:1: ( ( ruleSourceElement ) )
            // InternalYamlGenDsl.g:1891:2: ( ruleSourceElement )
            {
            // InternalYamlGenDsl.g:1891:2: ( ruleSourceElement )
            // InternalYamlGenDsl.g:1892:3: ruleSourceElement
            {
             before(grammarAccess.getSourceAccess().getEntriesSourceElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleSourceElement();

            state._fsp--;

             after(grammarAccess.getSourceAccess().getEntriesSourceElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__EntriesAssignment"


    // $ANTLR start "rule__Import__PathAssignment_1"
    // InternalYamlGenDsl.g:1901:1: rule__Import__PathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1905:1: ( ( RULE_STRING ) )
            // InternalYamlGenDsl.g:1906:2: ( RULE_STRING )
            {
            // InternalYamlGenDsl.g:1906:2: ( RULE_STRING )
            // InternalYamlGenDsl.g:1907:3: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getPathSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getPathSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__PathAssignment_1"


    // $ANTLR start "rule__Field__HelpAssignment_0"
    // InternalYamlGenDsl.g:1916:1: rule__Field__HelpAssignment_0 : ( RULE_HELP_STRING ) ;
    public final void rule__Field__HelpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1920:1: ( ( RULE_HELP_STRING ) )
            // InternalYamlGenDsl.g:1921:2: ( RULE_HELP_STRING )
            {
            // InternalYamlGenDsl.g:1921:2: ( RULE_HELP_STRING )
            // InternalYamlGenDsl.g:1922:3: RULE_HELP_STRING
            {
             before(grammarAccess.getFieldAccess().getHelpHELP_STRINGTerminalRuleCall_0_0()); 
            match(input,RULE_HELP_STRING,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getHelpHELP_STRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__HelpAssignment_0"


    // $ANTLR start "rule__Field__RootAssignment_1"
    // InternalYamlGenDsl.g:1931:1: rule__Field__RootAssignment_1 : ( ( 'root' ) ) ;
    public final void rule__Field__RootAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1935:1: ( ( ( 'root' ) ) )
            // InternalYamlGenDsl.g:1936:2: ( ( 'root' ) )
            {
            // InternalYamlGenDsl.g:1936:2: ( ( 'root' ) )
            // InternalYamlGenDsl.g:1937:3: ( 'root' )
            {
             before(grammarAccess.getFieldAccess().getRootRootKeyword_1_0()); 
            // InternalYamlGenDsl.g:1938:3: ( 'root' )
            // InternalYamlGenDsl.g:1939:4: 'root'
            {
             before(grammarAccess.getFieldAccess().getRootRootKeyword_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getRootRootKeyword_1_0()); 

            }

             after(grammarAccess.getFieldAccess().getRootRootKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__RootAssignment_1"


    // $ANTLR start "rule__Field__NameAssignment_2"
    // InternalYamlGenDsl.g:1950:1: rule__Field__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1954:1: ( ( RULE_ID ) )
            // InternalYamlGenDsl.g:1955:2: ( RULE_ID )
            {
            // InternalYamlGenDsl.g:1955:2: ( RULE_ID )
            // InternalYamlGenDsl.g:1956:3: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__NameAssignment_2"


    // $ANTLR start "rule__Field__SuperFieldAssignment_3_1"
    // InternalYamlGenDsl.g:1965:1: rule__Field__SuperFieldAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Field__SuperFieldAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1969:1: ( ( ( RULE_ID ) ) )
            // InternalYamlGenDsl.g:1970:2: ( ( RULE_ID ) )
            {
            // InternalYamlGenDsl.g:1970:2: ( ( RULE_ID ) )
            // InternalYamlGenDsl.g:1971:3: ( RULE_ID )
            {
             before(grammarAccess.getFieldAccess().getSuperFieldFieldCrossReference_3_1_0()); 
            // InternalYamlGenDsl.g:1972:3: ( RULE_ID )
            // InternalYamlGenDsl.g:1973:4: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getSuperFieldFieldIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getSuperFieldFieldIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getFieldAccess().getSuperFieldFieldCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__SuperFieldAssignment_3_1"


    // $ANTLR start "rule__Field__BodyAssignment_4"
    // InternalYamlGenDsl.g:1984:1: rule__Field__BodyAssignment_4 : ( ruleBody ) ;
    public final void rule__Field__BodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:1988:1: ( ( ruleBody ) )
            // InternalYamlGenDsl.g:1989:2: ( ruleBody )
            {
            // InternalYamlGenDsl.g:1989:2: ( ruleBody )
            // InternalYamlGenDsl.g:1990:3: ruleBody
            {
             before(grammarAccess.getFieldAccess().getBodyBodyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleBody();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getBodyBodyParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__BodyAssignment_4"


    // $ANTLR start "rule__Body__ElementsAssignment_2"
    // InternalYamlGenDsl.g:1999:1: rule__Body__ElementsAssignment_2 : ( ruleBodyElement ) ;
    public final void rule__Body__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:2003:1: ( ( ruleBodyElement ) )
            // InternalYamlGenDsl.g:2004:2: ( ruleBodyElement )
            {
            // InternalYamlGenDsl.g:2004:2: ( ruleBodyElement )
            // InternalYamlGenDsl.g:2005:3: ruleBodyElement
            {
             before(grammarAccess.getBodyAccess().getElementsBodyElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBodyElement();

            state._fsp--;

             after(grammarAccess.getBodyAccess().getElementsBodyElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__ElementsAssignment_2"


    // $ANTLR start "rule__Extend__ParentSubfieldNameAssignment_1"
    // InternalYamlGenDsl.g:2014:1: rule__Extend__ParentSubfieldNameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Extend__ParentSubfieldNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:2018:1: ( ( RULE_STRING ) )
            // InternalYamlGenDsl.g:2019:2: ( RULE_STRING )
            {
            // InternalYamlGenDsl.g:2019:2: ( RULE_STRING )
            // InternalYamlGenDsl.g:2020:3: RULE_STRING
            {
             before(grammarAccess.getExtendAccess().getParentSubfieldNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getExtendAccess().getParentSubfieldNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extend__ParentSubfieldNameAssignment_1"


    // $ANTLR start "rule__Extend__BodyAssignment_2"
    // InternalYamlGenDsl.g:2029:1: rule__Extend__BodyAssignment_2 : ( ruleBody ) ;
    public final void rule__Extend__BodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:2033:1: ( ( ruleBody ) )
            // InternalYamlGenDsl.g:2034:2: ( ruleBody )
            {
            // InternalYamlGenDsl.g:2034:2: ( ruleBody )
            // InternalYamlGenDsl.g:2035:3: ruleBody
            {
             before(grammarAccess.getExtendAccess().getBodyBodyParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBody();

            state._fsp--;

             after(grammarAccess.getExtendAccess().getBodyBodyParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extend__BodyAssignment_2"


    // $ANTLR start "rule__NestedField__HelpAssignment_0"
    // InternalYamlGenDsl.g:2044:1: rule__NestedField__HelpAssignment_0 : ( RULE_HELP_STRING ) ;
    public final void rule__NestedField__HelpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:2048:1: ( ( RULE_HELP_STRING ) )
            // InternalYamlGenDsl.g:2049:2: ( RULE_HELP_STRING )
            {
            // InternalYamlGenDsl.g:2049:2: ( RULE_HELP_STRING )
            // InternalYamlGenDsl.g:2050:3: RULE_HELP_STRING
            {
             before(grammarAccess.getNestedFieldAccess().getHelpHELP_STRINGTerminalRuleCall_0_0()); 
            match(input,RULE_HELP_STRING,FOLLOW_2); 
             after(grammarAccess.getNestedFieldAccess().getHelpHELP_STRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedField__HelpAssignment_0"


    // $ANTLR start "rule__NestedField__MandatoryAssignment_2"
    // InternalYamlGenDsl.g:2059:1: rule__NestedField__MandatoryAssignment_2 : ( ( 'mandatory' ) ) ;
    public final void rule__NestedField__MandatoryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:2063:1: ( ( ( 'mandatory' ) ) )
            // InternalYamlGenDsl.g:2064:2: ( ( 'mandatory' ) )
            {
            // InternalYamlGenDsl.g:2064:2: ( ( 'mandatory' ) )
            // InternalYamlGenDsl.g:2065:3: ( 'mandatory' )
            {
             before(grammarAccess.getNestedFieldAccess().getMandatoryMandatoryKeyword_2_0()); 
            // InternalYamlGenDsl.g:2066:3: ( 'mandatory' )
            // InternalYamlGenDsl.g:2067:4: 'mandatory'
            {
             before(grammarAccess.getNestedFieldAccess().getMandatoryMandatoryKeyword_2_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getNestedFieldAccess().getMandatoryMandatoryKeyword_2_0()); 

            }

             after(grammarAccess.getNestedFieldAccess().getMandatoryMandatoryKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedField__MandatoryAssignment_2"


    // $ANTLR start "rule__NestedField__DefaultAssignment_3"
    // InternalYamlGenDsl.g:2078:1: rule__NestedField__DefaultAssignment_3 : ( ( 'default' ) ) ;
    public final void rule__NestedField__DefaultAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:2082:1: ( ( ( 'default' ) ) )
            // InternalYamlGenDsl.g:2083:2: ( ( 'default' ) )
            {
            // InternalYamlGenDsl.g:2083:2: ( ( 'default' ) )
            // InternalYamlGenDsl.g:2084:3: ( 'default' )
            {
             before(grammarAccess.getNestedFieldAccess().getDefaultDefaultKeyword_3_0()); 
            // InternalYamlGenDsl.g:2085:3: ( 'default' )
            // InternalYamlGenDsl.g:2086:4: 'default'
            {
             before(grammarAccess.getNestedFieldAccess().getDefaultDefaultKeyword_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getNestedFieldAccess().getDefaultDefaultKeyword_3_0()); 

            }

             after(grammarAccess.getNestedFieldAccess().getDefaultDefaultKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedField__DefaultAssignment_3"


    // $ANTLR start "rule__NestedField__SuperFieldAssignment_4_1"
    // InternalYamlGenDsl.g:2097:1: rule__NestedField__SuperFieldAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__NestedField__SuperFieldAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:2101:1: ( ( ( RULE_ID ) ) )
            // InternalYamlGenDsl.g:2102:2: ( ( RULE_ID ) )
            {
            // InternalYamlGenDsl.g:2102:2: ( ( RULE_ID ) )
            // InternalYamlGenDsl.g:2103:3: ( RULE_ID )
            {
             before(grammarAccess.getNestedFieldAccess().getSuperFieldFieldCrossReference_4_1_0()); 
            // InternalYamlGenDsl.g:2104:3: ( RULE_ID )
            // InternalYamlGenDsl.g:2105:4: RULE_ID
            {
             before(grammarAccess.getNestedFieldAccess().getSuperFieldFieldIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNestedFieldAccess().getSuperFieldFieldIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getNestedFieldAccess().getSuperFieldFieldCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedField__SuperFieldAssignment_4_1"


    // $ANTLR start "rule__NestedField__BodyAssignment_5"
    // InternalYamlGenDsl.g:2116:1: rule__NestedField__BodyAssignment_5 : ( ruleBody ) ;
    public final void rule__NestedField__BodyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:2120:1: ( ( ruleBody ) )
            // InternalYamlGenDsl.g:2121:2: ( ruleBody )
            {
            // InternalYamlGenDsl.g:2121:2: ( ruleBody )
            // InternalYamlGenDsl.g:2122:3: ruleBody
            {
             before(grammarAccess.getNestedFieldAccess().getBodyBodyParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleBody();

            state._fsp--;

             after(grammarAccess.getNestedFieldAccess().getBodyBodyParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedField__BodyAssignment_5"


    // $ANTLR start "rule__NestedFields__HelpAssignment_0"
    // InternalYamlGenDsl.g:2131:1: rule__NestedFields__HelpAssignment_0 : ( RULE_HELP_STRING ) ;
    public final void rule__NestedFields__HelpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:2135:1: ( ( RULE_HELP_STRING ) )
            // InternalYamlGenDsl.g:2136:2: ( RULE_HELP_STRING )
            {
            // InternalYamlGenDsl.g:2136:2: ( RULE_HELP_STRING )
            // InternalYamlGenDsl.g:2137:3: RULE_HELP_STRING
            {
             before(grammarAccess.getNestedFieldsAccess().getHelpHELP_STRINGTerminalRuleCall_0_0()); 
            match(input,RULE_HELP_STRING,FOLLOW_2); 
             after(grammarAccess.getNestedFieldsAccess().getHelpHELP_STRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedFields__HelpAssignment_0"


    // $ANTLR start "rule__NestedFields__SuperFieldAssignment_2_1"
    // InternalYamlGenDsl.g:2146:1: rule__NestedFields__SuperFieldAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__NestedFields__SuperFieldAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:2150:1: ( ( ( RULE_ID ) ) )
            // InternalYamlGenDsl.g:2151:2: ( ( RULE_ID ) )
            {
            // InternalYamlGenDsl.g:2151:2: ( ( RULE_ID ) )
            // InternalYamlGenDsl.g:2152:3: ( RULE_ID )
            {
             before(grammarAccess.getNestedFieldsAccess().getSuperFieldFieldCrossReference_2_1_0()); 
            // InternalYamlGenDsl.g:2153:3: ( RULE_ID )
            // InternalYamlGenDsl.g:2154:4: RULE_ID
            {
             before(grammarAccess.getNestedFieldsAccess().getSuperFieldFieldIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNestedFieldsAccess().getSuperFieldFieldIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getNestedFieldsAccess().getSuperFieldFieldCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedFields__SuperFieldAssignment_2_1"


    // $ANTLR start "rule__NestedFields__BodyAssignment_3"
    // InternalYamlGenDsl.g:2165:1: rule__NestedFields__BodyAssignment_3 : ( ruleBody ) ;
    public final void rule__NestedFields__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:2169:1: ( ( ruleBody ) )
            // InternalYamlGenDsl.g:2170:2: ( ruleBody )
            {
            // InternalYamlGenDsl.g:2170:2: ( ruleBody )
            // InternalYamlGenDsl.g:2171:3: ruleBody
            {
             before(grammarAccess.getNestedFieldsAccess().getBodyBodyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBody();

            state._fsp--;

             after(grammarAccess.getNestedFieldsAccess().getBodyBodyParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedFields__BodyAssignment_3"


    // $ANTLR start "rule__StringProperty__KeyAssignment_0"
    // InternalYamlGenDsl.g:2180:1: rule__StringProperty__KeyAssignment_0 : ( ( rule__StringProperty__KeyAlternatives_0_0 ) ) ;
    public final void rule__StringProperty__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:2184:1: ( ( ( rule__StringProperty__KeyAlternatives_0_0 ) ) )
            // InternalYamlGenDsl.g:2185:2: ( ( rule__StringProperty__KeyAlternatives_0_0 ) )
            {
            // InternalYamlGenDsl.g:2185:2: ( ( rule__StringProperty__KeyAlternatives_0_0 ) )
            // InternalYamlGenDsl.g:2186:3: ( rule__StringProperty__KeyAlternatives_0_0 )
            {
             before(grammarAccess.getStringPropertyAccess().getKeyAlternatives_0_0()); 
            // InternalYamlGenDsl.g:2187:3: ( rule__StringProperty__KeyAlternatives_0_0 )
            // InternalYamlGenDsl.g:2187:4: rule__StringProperty__KeyAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__StringProperty__KeyAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getStringPropertyAccess().getKeyAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringProperty__KeyAssignment_0"


    // $ANTLR start "rule__StringProperty__ValueAssignment_2"
    // InternalYamlGenDsl.g:2195:1: rule__StringProperty__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__StringProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:2199:1: ( ( RULE_STRING ) )
            // InternalYamlGenDsl.g:2200:2: ( RULE_STRING )
            {
            // InternalYamlGenDsl.g:2200:2: ( RULE_STRING )
            // InternalYamlGenDsl.g:2201:3: RULE_STRING
            {
             before(grammarAccess.getStringPropertyAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringPropertyAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringProperty__ValueAssignment_2"


    // $ANTLR start "rule__ValuesProperty__KeyAssignment_0"
    // InternalYamlGenDsl.g:2210:1: rule__ValuesProperty__KeyAssignment_0 : ( ( rule__ValuesProperty__KeyAlternatives_0_0 ) ) ;
    public final void rule__ValuesProperty__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:2214:1: ( ( ( rule__ValuesProperty__KeyAlternatives_0_0 ) ) )
            // InternalYamlGenDsl.g:2215:2: ( ( rule__ValuesProperty__KeyAlternatives_0_0 ) )
            {
            // InternalYamlGenDsl.g:2215:2: ( ( rule__ValuesProperty__KeyAlternatives_0_0 ) )
            // InternalYamlGenDsl.g:2216:3: ( rule__ValuesProperty__KeyAlternatives_0_0 )
            {
             before(grammarAccess.getValuesPropertyAccess().getKeyAlternatives_0_0()); 
            // InternalYamlGenDsl.g:2217:3: ( rule__ValuesProperty__KeyAlternatives_0_0 )
            // InternalYamlGenDsl.g:2217:4: rule__ValuesProperty__KeyAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ValuesProperty__KeyAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getValuesPropertyAccess().getKeyAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValuesProperty__KeyAssignment_0"


    // $ANTLR start "rule__ValuesProperty__ValueAssignment_2"
    // InternalYamlGenDsl.g:2225:1: rule__ValuesProperty__ValueAssignment_2 : ( ruleValues ) ;
    public final void rule__ValuesProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:2229:1: ( ( ruleValues ) )
            // InternalYamlGenDsl.g:2230:2: ( ruleValues )
            {
            // InternalYamlGenDsl.g:2230:2: ( ruleValues )
            // InternalYamlGenDsl.g:2231:3: ruleValues
            {
             before(grammarAccess.getValuesPropertyAccess().getValueValuesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValues();

            state._fsp--;

             after(grammarAccess.getValuesPropertyAccess().getValueValuesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValuesProperty__ValueAssignment_2"


    // $ANTLR start "rule__TypeProperty__KeyAssignment_0"
    // InternalYamlGenDsl.g:2240:1: rule__TypeProperty__KeyAssignment_0 : ( ( 'type' ) ) ;
    public final void rule__TypeProperty__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:2244:1: ( ( ( 'type' ) ) )
            // InternalYamlGenDsl.g:2245:2: ( ( 'type' ) )
            {
            // InternalYamlGenDsl.g:2245:2: ( ( 'type' ) )
            // InternalYamlGenDsl.g:2246:3: ( 'type' )
            {
             before(grammarAccess.getTypePropertyAccess().getKeyTypeKeyword_0_0()); 
            // InternalYamlGenDsl.g:2247:3: ( 'type' )
            // InternalYamlGenDsl.g:2248:4: 'type'
            {
             before(grammarAccess.getTypePropertyAccess().getKeyTypeKeyword_0_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTypePropertyAccess().getKeyTypeKeyword_0_0()); 

            }

             after(grammarAccess.getTypePropertyAccess().getKeyTypeKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeProperty__KeyAssignment_0"


    // $ANTLR start "rule__TypeProperty__ValueAssignment_2"
    // InternalYamlGenDsl.g:2259:1: rule__TypeProperty__ValueAssignment_2 : ( ( rule__TypeProperty__ValueAlternatives_2_0 ) ) ;
    public final void rule__TypeProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:2263:1: ( ( ( rule__TypeProperty__ValueAlternatives_2_0 ) ) )
            // InternalYamlGenDsl.g:2264:2: ( ( rule__TypeProperty__ValueAlternatives_2_0 ) )
            {
            // InternalYamlGenDsl.g:2264:2: ( ( rule__TypeProperty__ValueAlternatives_2_0 ) )
            // InternalYamlGenDsl.g:2265:3: ( rule__TypeProperty__ValueAlternatives_2_0 )
            {
             before(grammarAccess.getTypePropertyAccess().getValueAlternatives_2_0()); 
            // InternalYamlGenDsl.g:2266:3: ( rule__TypeProperty__ValueAlternatives_2_0 )
            // InternalYamlGenDsl.g:2266:4: rule__TypeProperty__ValueAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__TypeProperty__ValueAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getTypePropertyAccess().getValueAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeProperty__ValueAssignment_2"


    // $ANTLR start "rule__TypeProperty__HelpAssignment_3_1"
    // InternalYamlGenDsl.g:2274:1: rule__TypeProperty__HelpAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__TypeProperty__HelpAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:2278:1: ( ( RULE_STRING ) )
            // InternalYamlGenDsl.g:2279:2: ( RULE_STRING )
            {
            // InternalYamlGenDsl.g:2279:2: ( RULE_STRING )
            // InternalYamlGenDsl.g:2280:3: RULE_STRING
            {
             before(grammarAccess.getTypePropertyAccess().getHelpSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTypePropertyAccess().getHelpSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeProperty__HelpAssignment_3_1"


    // $ANTLR start "rule__Values__ValuesAssignment_0_1"
    // InternalYamlGenDsl.g:2289:1: rule__Values__ValuesAssignment_0_1 : ( ruleValues ) ;
    public final void rule__Values__ValuesAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:2293:1: ( ( ruleValues ) )
            // InternalYamlGenDsl.g:2294:2: ( ruleValues )
            {
            // InternalYamlGenDsl.g:2294:2: ( ruleValues )
            // InternalYamlGenDsl.g:2295:3: ruleValues
            {
             before(grammarAccess.getValuesAccess().getValuesValuesParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValues();

            state._fsp--;

             after(grammarAccess.getValuesAccess().getValuesValuesParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__ValuesAssignment_0_1"


    // $ANTLR start "rule__Values__StringAssignment_1"
    // InternalYamlGenDsl.g:2304:1: rule__Values__StringAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Values__StringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYamlGenDsl.g:2308:1: ( ( RULE_STRING ) )
            // InternalYamlGenDsl.g:2309:2: ( RULE_STRING )
            {
            // InternalYamlGenDsl.g:2309:2: ( RULE_STRING )
            // InternalYamlGenDsl.g:2310:3: RULE_STRING
            {
             before(grammarAccess.getValuesAccess().getStringSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getValuesAccess().getStringSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__StringAssignment_1"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\4\uffff";
    static final String dfa_2s = "\2\5\2\uffff";
    static final String dfa_3s = "\2\34\2\uffff";
    static final String dfa_4s = "\2\uffff\1\1\1\2";
    static final String dfa_5s = "\4\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\25\uffff\1\2\1\3",
            "\1\1\25\uffff\1\2\1\3",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "475:1: rule__AnyNestedField__Alternatives : ( ( ruleNestedField ) | ( ruleNestedFields ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000400400062L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000400000060L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000101E01F020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000101C01F022L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000801808000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000018000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000005800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000003E0010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000012L});

}