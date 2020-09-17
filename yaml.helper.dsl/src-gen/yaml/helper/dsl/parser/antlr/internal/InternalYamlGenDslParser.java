package yaml.helper.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import yaml.helper.dsl.services.YamlGenDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalYamlGenDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_HELP_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'root'", "'extends'", "'{'", "'}'", "'extend'", "'field'", "'mandatory'", "'default'", "'fields'", "'key'", "'name'", "'hint'", "':'", "'values'", "'type'", "'int'", "'float'", "'string'", "'list'", "'any'", "'('", "')'", "'['", "']'"
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

        public InternalYamlGenDslParser(TokenStream input, YamlGenDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Source";
       	}

       	@Override
       	protected YamlGenDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSource"
    // InternalYamlGenDsl.g:64:1: entryRuleSource returns [EObject current=null] : iv_ruleSource= ruleSource EOF ;
    public final EObject entryRuleSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSource = null;


        try {
            // InternalYamlGenDsl.g:64:47: (iv_ruleSource= ruleSource EOF )
            // InternalYamlGenDsl.g:65:2: iv_ruleSource= ruleSource EOF
            {
             newCompositeNode(grammarAccess.getSourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSource=ruleSource();

            state._fsp--;

             current =iv_ruleSource; 
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
    // $ANTLR end "entryRuleSource"


    // $ANTLR start "ruleSource"
    // InternalYamlGenDsl.g:71:1: ruleSource returns [EObject current=null] : ( (lv_entries_0_0= ruleSourceElement ) )* ;
    public final EObject ruleSource() throws RecognitionException {
        EObject current = null;

        EObject lv_entries_0_0 = null;



        	enterRule();

        try {
            // InternalYamlGenDsl.g:77:2: ( ( (lv_entries_0_0= ruleSourceElement ) )* )
            // InternalYamlGenDsl.g:78:2: ( (lv_entries_0_0= ruleSourceElement ) )*
            {
            // InternalYamlGenDsl.g:78:2: ( (lv_entries_0_0= ruleSourceElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_HELP_STRING && LA1_0<=RULE_ID)||(LA1_0>=12 && LA1_0<=13)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalYamlGenDsl.g:79:3: (lv_entries_0_0= ruleSourceElement )
            	    {
            	    // InternalYamlGenDsl.g:79:3: (lv_entries_0_0= ruleSourceElement )
            	    // InternalYamlGenDsl.g:80:4: lv_entries_0_0= ruleSourceElement
            	    {

            	    				newCompositeNode(grammarAccess.getSourceAccess().getEntriesSourceElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_entries_0_0=ruleSourceElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getSourceRule());
            	    				}
            	    				add(
            	    					current,
            	    					"entries",
            	    					lv_entries_0_0,
            	    					"yaml.helper.dsl.YamlGenDsl.SourceElement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleSource"


    // $ANTLR start "entryRuleSourceElement"
    // InternalYamlGenDsl.g:100:1: entryRuleSourceElement returns [EObject current=null] : iv_ruleSourceElement= ruleSourceElement EOF ;
    public final EObject entryRuleSourceElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceElement = null;


        try {
            // InternalYamlGenDsl.g:100:54: (iv_ruleSourceElement= ruleSourceElement EOF )
            // InternalYamlGenDsl.g:101:2: iv_ruleSourceElement= ruleSourceElement EOF
            {
             newCompositeNode(grammarAccess.getSourceElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSourceElement=ruleSourceElement();

            state._fsp--;

             current =iv_ruleSourceElement; 
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
    // $ANTLR end "entryRuleSourceElement"


    // $ANTLR start "ruleSourceElement"
    // InternalYamlGenDsl.g:107:1: ruleSourceElement returns [EObject current=null] : (this_Field_0= ruleField | this_Import_1= ruleImport ) ;
    public final EObject ruleSourceElement() throws RecognitionException {
        EObject current = null;

        EObject this_Field_0 = null;

        EObject this_Import_1 = null;



        	enterRule();

        try {
            // InternalYamlGenDsl.g:113:2: ( (this_Field_0= ruleField | this_Import_1= ruleImport ) )
            // InternalYamlGenDsl.g:114:2: (this_Field_0= ruleField | this_Import_1= ruleImport )
            {
            // InternalYamlGenDsl.g:114:2: (this_Field_0= ruleField | this_Import_1= ruleImport )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_HELP_STRING && LA2_0<=RULE_ID)||LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalYamlGenDsl.g:115:3: this_Field_0= ruleField
                    {

                    			newCompositeNode(grammarAccess.getSourceElementAccess().getFieldParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Field_0=ruleField();

                    state._fsp--;


                    			current = this_Field_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalYamlGenDsl.g:124:3: this_Import_1= ruleImport
                    {

                    			newCompositeNode(grammarAccess.getSourceElementAccess().getImportParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Import_1=ruleImport();

                    state._fsp--;


                    			current = this_Import_1;
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
    // $ANTLR end "ruleSourceElement"


    // $ANTLR start "entryRuleImport"
    // InternalYamlGenDsl.g:136:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalYamlGenDsl.g:136:47: (iv_ruleImport= ruleImport EOF )
            // InternalYamlGenDsl.g:137:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalYamlGenDsl.g:143:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_path_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_path_1_0=null;


        	enterRule();

        try {
            // InternalYamlGenDsl.g:149:2: ( (otherlv_0= 'import' ( (lv_path_1_0= RULE_STRING ) ) ) )
            // InternalYamlGenDsl.g:150:2: (otherlv_0= 'import' ( (lv_path_1_0= RULE_STRING ) ) )
            {
            // InternalYamlGenDsl.g:150:2: (otherlv_0= 'import' ( (lv_path_1_0= RULE_STRING ) ) )
            // InternalYamlGenDsl.g:151:3: otherlv_0= 'import' ( (lv_path_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalYamlGenDsl.g:155:3: ( (lv_path_1_0= RULE_STRING ) )
            // InternalYamlGenDsl.g:156:4: (lv_path_1_0= RULE_STRING )
            {
            // InternalYamlGenDsl.g:156:4: (lv_path_1_0= RULE_STRING )
            // InternalYamlGenDsl.g:157:5: lv_path_1_0= RULE_STRING
            {
            lv_path_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_path_1_0, grammarAccess.getImportAccess().getPathSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleField"
    // InternalYamlGenDsl.g:177:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalYamlGenDsl.g:177:46: (iv_ruleField= ruleField EOF )
            // InternalYamlGenDsl.g:178:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalYamlGenDsl.g:184:1: ruleField returns [EObject current=null] : ( ( (lv_help_0_0= RULE_HELP_STRING ) )* ( (lv_root_1_0= 'root' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_body_5_0= ruleBody ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_help_0_0=null;
        Token lv_root_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_body_5_0 = null;



        	enterRule();

        try {
            // InternalYamlGenDsl.g:190:2: ( ( ( (lv_help_0_0= RULE_HELP_STRING ) )* ( (lv_root_1_0= 'root' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_body_5_0= ruleBody ) ) ) )
            // InternalYamlGenDsl.g:191:2: ( ( (lv_help_0_0= RULE_HELP_STRING ) )* ( (lv_root_1_0= 'root' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_body_5_0= ruleBody ) ) )
            {
            // InternalYamlGenDsl.g:191:2: ( ( (lv_help_0_0= RULE_HELP_STRING ) )* ( (lv_root_1_0= 'root' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_body_5_0= ruleBody ) ) )
            // InternalYamlGenDsl.g:192:3: ( (lv_help_0_0= RULE_HELP_STRING ) )* ( (lv_root_1_0= 'root' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_body_5_0= ruleBody ) )
            {
            // InternalYamlGenDsl.g:192:3: ( (lv_help_0_0= RULE_HELP_STRING ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_HELP_STRING) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalYamlGenDsl.g:193:4: (lv_help_0_0= RULE_HELP_STRING )
            	    {
            	    // InternalYamlGenDsl.g:193:4: (lv_help_0_0= RULE_HELP_STRING )
            	    // InternalYamlGenDsl.g:194:5: lv_help_0_0= RULE_HELP_STRING
            	    {
            	    lv_help_0_0=(Token)match(input,RULE_HELP_STRING,FOLLOW_5); 

            	    					newLeafNode(lv_help_0_0, grammarAccess.getFieldAccess().getHelpHELP_STRINGTerminalRuleCall_0_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getFieldRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"help",
            	    						lv_help_0_0,
            	    						"yaml.helper.dsl.YamlGenDsl.HELP_STRING");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalYamlGenDsl.g:210:3: ( (lv_root_1_0= 'root' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalYamlGenDsl.g:211:4: (lv_root_1_0= 'root' )
                    {
                    // InternalYamlGenDsl.g:211:4: (lv_root_1_0= 'root' )
                    // InternalYamlGenDsl.g:212:5: lv_root_1_0= 'root'
                    {
                    lv_root_1_0=(Token)match(input,13,FOLLOW_6); 

                    					newLeafNode(lv_root_1_0, grammarAccess.getFieldAccess().getRootRootKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFieldRule());
                    					}
                    					setWithLastConsumed(current, "root", lv_root_1_0 != null, "root");
                    				

                    }


                    }
                    break;

            }

            // InternalYamlGenDsl.g:224:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalYamlGenDsl.g:225:4: (lv_name_2_0= RULE_ID )
            {
            // InternalYamlGenDsl.g:225:4: (lv_name_2_0= RULE_ID )
            // InternalYamlGenDsl.g:226:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_2_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalYamlGenDsl.g:242:3: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalYamlGenDsl.g:243:4: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getExtendsKeyword_3_0());
                    			
                    // InternalYamlGenDsl.g:247:4: ( (otherlv_4= RULE_ID ) )
                    // InternalYamlGenDsl.g:248:5: (otherlv_4= RULE_ID )
                    {
                    // InternalYamlGenDsl.g:248:5: (otherlv_4= RULE_ID )
                    // InternalYamlGenDsl.g:249:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFieldRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(otherlv_4, grammarAccess.getFieldAccess().getSuperFieldFieldCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalYamlGenDsl.g:261:3: ( (lv_body_5_0= ruleBody ) )
            // InternalYamlGenDsl.g:262:4: (lv_body_5_0= ruleBody )
            {
            // InternalYamlGenDsl.g:262:4: (lv_body_5_0= ruleBody )
            // InternalYamlGenDsl.g:263:5: lv_body_5_0= ruleBody
            {

            					newCompositeNode(grammarAccess.getFieldAccess().getBodyBodyParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_5_0=ruleBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_5_0,
            						"yaml.helper.dsl.YamlGenDsl.Body");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleBody"
    // InternalYamlGenDsl.g:284:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // InternalYamlGenDsl.g:284:45: (iv_ruleBody= ruleBody EOF )
            // InternalYamlGenDsl.g:285:2: iv_ruleBody= ruleBody EOF
            {
             newCompositeNode(grammarAccess.getBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBody=ruleBody();

            state._fsp--;

             current =iv_ruleBody; 
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
    // $ANTLR end "entryRuleBody"


    // $ANTLR start "ruleBody"
    // InternalYamlGenDsl.g:291:1: ruleBody returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_elements_2_0= ruleBodyElement ) )* otherlv_3= '}' ) ;
    public final EObject ruleBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalYamlGenDsl.g:297:2: ( ( () otherlv_1= '{' ( (lv_elements_2_0= ruleBodyElement ) )* otherlv_3= '}' ) )
            // InternalYamlGenDsl.g:298:2: ( () otherlv_1= '{' ( (lv_elements_2_0= ruleBodyElement ) )* otherlv_3= '}' )
            {
            // InternalYamlGenDsl.g:298:2: ( () otherlv_1= '{' ( (lv_elements_2_0= ruleBodyElement ) )* otherlv_3= '}' )
            // InternalYamlGenDsl.g:299:3: () otherlv_1= '{' ( (lv_elements_2_0= ruleBodyElement ) )* otherlv_3= '}'
            {
            // InternalYamlGenDsl.g:299:3: ()
            // InternalYamlGenDsl.g:300:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBodyAccess().getBodyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalYamlGenDsl.g:310:3: ( (lv_elements_2_0= ruleBodyElement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_HELP_STRING||(LA6_0>=17 && LA6_0<=18)||(LA6_0>=20 && LA6_0<=24)||(LA6_0>=26 && LA6_0<=27)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalYamlGenDsl.g:311:4: (lv_elements_2_0= ruleBodyElement )
            	    {
            	    // InternalYamlGenDsl.g:311:4: (lv_elements_2_0= ruleBodyElement )
            	    // InternalYamlGenDsl.g:312:5: lv_elements_2_0= ruleBodyElement
            	    {

            	    					newCompositeNode(grammarAccess.getBodyAccess().getElementsBodyElementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_elements_2_0=ruleBodyElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBodyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"yaml.helper.dsl.YamlGenDsl.BodyElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleBody"


    // $ANTLR start "entryRuleBodyElement"
    // InternalYamlGenDsl.g:337:1: entryRuleBodyElement returns [EObject current=null] : iv_ruleBodyElement= ruleBodyElement EOF ;
    public final EObject entryRuleBodyElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyElement = null;


        try {
            // InternalYamlGenDsl.g:337:52: (iv_ruleBodyElement= ruleBodyElement EOF )
            // InternalYamlGenDsl.g:338:2: iv_ruleBodyElement= ruleBodyElement EOF
            {
             newCompositeNode(grammarAccess.getBodyElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBodyElement=ruleBodyElement();

            state._fsp--;

             current =iv_ruleBodyElement; 
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
    // $ANTLR end "entryRuleBodyElement"


    // $ANTLR start "ruleBodyElement"
    // InternalYamlGenDsl.g:344:1: ruleBodyElement returns [EObject current=null] : (this_Extend_0= ruleExtend | this_AnyNestedField_1= ruleAnyNestedField | this_Property_2= ruleProperty ) ;
    public final EObject ruleBodyElement() throws RecognitionException {
        EObject current = null;

        EObject this_Extend_0 = null;

        EObject this_AnyNestedField_1 = null;

        EObject this_Property_2 = null;



        	enterRule();

        try {
            // InternalYamlGenDsl.g:350:2: ( (this_Extend_0= ruleExtend | this_AnyNestedField_1= ruleAnyNestedField | this_Property_2= ruleProperty ) )
            // InternalYamlGenDsl.g:351:2: (this_Extend_0= ruleExtend | this_AnyNestedField_1= ruleAnyNestedField | this_Property_2= ruleProperty )
            {
            // InternalYamlGenDsl.g:351:2: (this_Extend_0= ruleExtend | this_AnyNestedField_1= ruleAnyNestedField | this_Property_2= ruleProperty )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt7=1;
                }
                break;
            case RULE_HELP_STRING:
            case 18:
            case 21:
                {
                alt7=2;
                }
                break;
            case 20:
            case 22:
            case 23:
            case 24:
            case 26:
            case 27:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalYamlGenDsl.g:352:3: this_Extend_0= ruleExtend
                    {

                    			newCompositeNode(grammarAccess.getBodyElementAccess().getExtendParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Extend_0=ruleExtend();

                    state._fsp--;


                    			current = this_Extend_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalYamlGenDsl.g:361:3: this_AnyNestedField_1= ruleAnyNestedField
                    {

                    			newCompositeNode(grammarAccess.getBodyElementAccess().getAnyNestedFieldParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AnyNestedField_1=ruleAnyNestedField();

                    state._fsp--;


                    			current = this_AnyNestedField_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalYamlGenDsl.g:370:3: this_Property_2= ruleProperty
                    {

                    			newCompositeNode(grammarAccess.getBodyElementAccess().getPropertyParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Property_2=ruleProperty();

                    state._fsp--;


                    			current = this_Property_2;
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
    // $ANTLR end "ruleBodyElement"


    // $ANTLR start "entryRuleExtend"
    // InternalYamlGenDsl.g:382:1: entryRuleExtend returns [EObject current=null] : iv_ruleExtend= ruleExtend EOF ;
    public final EObject entryRuleExtend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtend = null;


        try {
            // InternalYamlGenDsl.g:382:47: (iv_ruleExtend= ruleExtend EOF )
            // InternalYamlGenDsl.g:383:2: iv_ruleExtend= ruleExtend EOF
            {
             newCompositeNode(grammarAccess.getExtendRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExtend=ruleExtend();

            state._fsp--;

             current =iv_ruleExtend; 
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
    // $ANTLR end "entryRuleExtend"


    // $ANTLR start "ruleExtend"
    // InternalYamlGenDsl.g:389:1: ruleExtend returns [EObject current=null] : (otherlv_0= 'extend' ( (lv_parentSubfieldName_1_0= RULE_STRING ) ) ( (lv_body_2_0= ruleBody ) ) ) ;
    public final EObject ruleExtend() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_parentSubfieldName_1_0=null;
        EObject lv_body_2_0 = null;



        	enterRule();

        try {
            // InternalYamlGenDsl.g:395:2: ( (otherlv_0= 'extend' ( (lv_parentSubfieldName_1_0= RULE_STRING ) ) ( (lv_body_2_0= ruleBody ) ) ) )
            // InternalYamlGenDsl.g:396:2: (otherlv_0= 'extend' ( (lv_parentSubfieldName_1_0= RULE_STRING ) ) ( (lv_body_2_0= ruleBody ) ) )
            {
            // InternalYamlGenDsl.g:396:2: (otherlv_0= 'extend' ( (lv_parentSubfieldName_1_0= RULE_STRING ) ) ( (lv_body_2_0= ruleBody ) ) )
            // InternalYamlGenDsl.g:397:3: otherlv_0= 'extend' ( (lv_parentSubfieldName_1_0= RULE_STRING ) ) ( (lv_body_2_0= ruleBody ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getExtendAccess().getExtendKeyword_0());
            		
            // InternalYamlGenDsl.g:401:3: ( (lv_parentSubfieldName_1_0= RULE_STRING ) )
            // InternalYamlGenDsl.g:402:4: (lv_parentSubfieldName_1_0= RULE_STRING )
            {
            // InternalYamlGenDsl.g:402:4: (lv_parentSubfieldName_1_0= RULE_STRING )
            // InternalYamlGenDsl.g:403:5: lv_parentSubfieldName_1_0= RULE_STRING
            {
            lv_parentSubfieldName_1_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_parentSubfieldName_1_0, grammarAccess.getExtendAccess().getParentSubfieldNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtendRule());
            					}
            					setWithLastConsumed(
            						current,
            						"parentSubfieldName",
            						lv_parentSubfieldName_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalYamlGenDsl.g:419:3: ( (lv_body_2_0= ruleBody ) )
            // InternalYamlGenDsl.g:420:4: (lv_body_2_0= ruleBody )
            {
            // InternalYamlGenDsl.g:420:4: (lv_body_2_0= ruleBody )
            // InternalYamlGenDsl.g:421:5: lv_body_2_0= ruleBody
            {

            					newCompositeNode(grammarAccess.getExtendAccess().getBodyBodyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_2_0=ruleBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExtendRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_2_0,
            						"yaml.helper.dsl.YamlGenDsl.Body");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleExtend"


    // $ANTLR start "entryRuleAnyNestedField"
    // InternalYamlGenDsl.g:442:1: entryRuleAnyNestedField returns [EObject current=null] : iv_ruleAnyNestedField= ruleAnyNestedField EOF ;
    public final EObject entryRuleAnyNestedField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyNestedField = null;


        try {
            // InternalYamlGenDsl.g:442:55: (iv_ruleAnyNestedField= ruleAnyNestedField EOF )
            // InternalYamlGenDsl.g:443:2: iv_ruleAnyNestedField= ruleAnyNestedField EOF
            {
             newCompositeNode(grammarAccess.getAnyNestedFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnyNestedField=ruleAnyNestedField();

            state._fsp--;

             current =iv_ruleAnyNestedField; 
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
    // $ANTLR end "entryRuleAnyNestedField"


    // $ANTLR start "ruleAnyNestedField"
    // InternalYamlGenDsl.g:449:1: ruleAnyNestedField returns [EObject current=null] : (this_NestedField_0= ruleNestedField | this_NestedFields_1= ruleNestedFields ) ;
    public final EObject ruleAnyNestedField() throws RecognitionException {
        EObject current = null;

        EObject this_NestedField_0 = null;

        EObject this_NestedFields_1 = null;



        	enterRule();

        try {
            // InternalYamlGenDsl.g:455:2: ( (this_NestedField_0= ruleNestedField | this_NestedFields_1= ruleNestedFields ) )
            // InternalYamlGenDsl.g:456:2: (this_NestedField_0= ruleNestedField | this_NestedFields_1= ruleNestedFields )
            {
            // InternalYamlGenDsl.g:456:2: (this_NestedField_0= ruleNestedField | this_NestedFields_1= ruleNestedFields )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalYamlGenDsl.g:457:3: this_NestedField_0= ruleNestedField
                    {

                    			newCompositeNode(grammarAccess.getAnyNestedFieldAccess().getNestedFieldParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NestedField_0=ruleNestedField();

                    state._fsp--;


                    			current = this_NestedField_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalYamlGenDsl.g:466:3: this_NestedFields_1= ruleNestedFields
                    {

                    			newCompositeNode(grammarAccess.getAnyNestedFieldAccess().getNestedFieldsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NestedFields_1=ruleNestedFields();

                    state._fsp--;


                    			current = this_NestedFields_1;
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
    // $ANTLR end "ruleAnyNestedField"


    // $ANTLR start "entryRuleNestedField"
    // InternalYamlGenDsl.g:478:1: entryRuleNestedField returns [EObject current=null] : iv_ruleNestedField= ruleNestedField EOF ;
    public final EObject entryRuleNestedField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedField = null;


        try {
            // InternalYamlGenDsl.g:478:52: (iv_ruleNestedField= ruleNestedField EOF )
            // InternalYamlGenDsl.g:479:2: iv_ruleNestedField= ruleNestedField EOF
            {
             newCompositeNode(grammarAccess.getNestedFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNestedField=ruleNestedField();

            state._fsp--;

             current =iv_ruleNestedField; 
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
    // $ANTLR end "entryRuleNestedField"


    // $ANTLR start "ruleNestedField"
    // InternalYamlGenDsl.g:485:1: ruleNestedField returns [EObject current=null] : ( ( (lv_help_0_0= RULE_HELP_STRING ) )* otherlv_1= 'field' ( (lv_mandatory_2_0= 'mandatory' ) )? ( (lv_default_3_0= 'default' ) )? (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? ( (lv_body_6_0= ruleBody ) ) ) ;
    public final EObject ruleNestedField() throws RecognitionException {
        EObject current = null;

        Token lv_help_0_0=null;
        Token otherlv_1=null;
        Token lv_mandatory_2_0=null;
        Token lv_default_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalYamlGenDsl.g:491:2: ( ( ( (lv_help_0_0= RULE_HELP_STRING ) )* otherlv_1= 'field' ( (lv_mandatory_2_0= 'mandatory' ) )? ( (lv_default_3_0= 'default' ) )? (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? ( (lv_body_6_0= ruleBody ) ) ) )
            // InternalYamlGenDsl.g:492:2: ( ( (lv_help_0_0= RULE_HELP_STRING ) )* otherlv_1= 'field' ( (lv_mandatory_2_0= 'mandatory' ) )? ( (lv_default_3_0= 'default' ) )? (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? ( (lv_body_6_0= ruleBody ) ) )
            {
            // InternalYamlGenDsl.g:492:2: ( ( (lv_help_0_0= RULE_HELP_STRING ) )* otherlv_1= 'field' ( (lv_mandatory_2_0= 'mandatory' ) )? ( (lv_default_3_0= 'default' ) )? (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? ( (lv_body_6_0= ruleBody ) ) )
            // InternalYamlGenDsl.g:493:3: ( (lv_help_0_0= RULE_HELP_STRING ) )* otherlv_1= 'field' ( (lv_mandatory_2_0= 'mandatory' ) )? ( (lv_default_3_0= 'default' ) )? (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? ( (lv_body_6_0= ruleBody ) )
            {
            // InternalYamlGenDsl.g:493:3: ( (lv_help_0_0= RULE_HELP_STRING ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_HELP_STRING) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalYamlGenDsl.g:494:4: (lv_help_0_0= RULE_HELP_STRING )
            	    {
            	    // InternalYamlGenDsl.g:494:4: (lv_help_0_0= RULE_HELP_STRING )
            	    // InternalYamlGenDsl.g:495:5: lv_help_0_0= RULE_HELP_STRING
            	    {
            	    lv_help_0_0=(Token)match(input,RULE_HELP_STRING,FOLLOW_9); 

            	    					newLeafNode(lv_help_0_0, grammarAccess.getNestedFieldAccess().getHelpHELP_STRINGTerminalRuleCall_0_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getNestedFieldRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"help",
            	    						lv_help_0_0,
            	    						"yaml.helper.dsl.YamlGenDsl.HELP_STRING");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_1=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getNestedFieldAccess().getFieldKeyword_1());
            		
            // InternalYamlGenDsl.g:515:3: ( (lv_mandatory_2_0= 'mandatory' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalYamlGenDsl.g:516:4: (lv_mandatory_2_0= 'mandatory' )
                    {
                    // InternalYamlGenDsl.g:516:4: (lv_mandatory_2_0= 'mandatory' )
                    // InternalYamlGenDsl.g:517:5: lv_mandatory_2_0= 'mandatory'
                    {
                    lv_mandatory_2_0=(Token)match(input,19,FOLLOW_11); 

                    					newLeafNode(lv_mandatory_2_0, grammarAccess.getNestedFieldAccess().getMandatoryMandatoryKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNestedFieldRule());
                    					}
                    					setWithLastConsumed(current, "mandatory", lv_mandatory_2_0 != null, "mandatory");
                    				

                    }


                    }
                    break;

            }

            // InternalYamlGenDsl.g:529:3: ( (lv_default_3_0= 'default' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalYamlGenDsl.g:530:4: (lv_default_3_0= 'default' )
                    {
                    // InternalYamlGenDsl.g:530:4: (lv_default_3_0= 'default' )
                    // InternalYamlGenDsl.g:531:5: lv_default_3_0= 'default'
                    {
                    lv_default_3_0=(Token)match(input,20,FOLLOW_7); 

                    					newLeafNode(lv_default_3_0, grammarAccess.getNestedFieldAccess().getDefaultDefaultKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNestedFieldRule());
                    					}
                    					setWithLastConsumed(current, "default", lv_default_3_0 != null, "default");
                    				

                    }


                    }
                    break;

            }

            // InternalYamlGenDsl.g:543:3: (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==14) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalYamlGenDsl.g:544:4: otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getNestedFieldAccess().getExtendsKeyword_4_0());
                    			
                    // InternalYamlGenDsl.g:548:4: ( (otherlv_5= RULE_ID ) )
                    // InternalYamlGenDsl.g:549:5: (otherlv_5= RULE_ID )
                    {
                    // InternalYamlGenDsl.g:549:5: (otherlv_5= RULE_ID )
                    // InternalYamlGenDsl.g:550:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNestedFieldRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(otherlv_5, grammarAccess.getNestedFieldAccess().getSuperFieldFieldCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalYamlGenDsl.g:562:3: ( (lv_body_6_0= ruleBody ) )
            // InternalYamlGenDsl.g:563:4: (lv_body_6_0= ruleBody )
            {
            // InternalYamlGenDsl.g:563:4: (lv_body_6_0= ruleBody )
            // InternalYamlGenDsl.g:564:5: lv_body_6_0= ruleBody
            {

            					newCompositeNode(grammarAccess.getNestedFieldAccess().getBodyBodyParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_6_0=ruleBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNestedFieldRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_6_0,
            						"yaml.helper.dsl.YamlGenDsl.Body");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleNestedField"


    // $ANTLR start "entryRuleNestedFields"
    // InternalYamlGenDsl.g:585:1: entryRuleNestedFields returns [EObject current=null] : iv_ruleNestedFields= ruleNestedFields EOF ;
    public final EObject entryRuleNestedFields() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedFields = null;


        try {
            // InternalYamlGenDsl.g:585:53: (iv_ruleNestedFields= ruleNestedFields EOF )
            // InternalYamlGenDsl.g:586:2: iv_ruleNestedFields= ruleNestedFields EOF
            {
             newCompositeNode(grammarAccess.getNestedFieldsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNestedFields=ruleNestedFields();

            state._fsp--;

             current =iv_ruleNestedFields; 
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
    // $ANTLR end "entryRuleNestedFields"


    // $ANTLR start "ruleNestedFields"
    // InternalYamlGenDsl.g:592:1: ruleNestedFields returns [EObject current=null] : ( ( (lv_help_0_0= RULE_HELP_STRING ) )* otherlv_1= 'fields' (otherlv_2= 'extend' ( (otherlv_3= RULE_ID ) ) )? ( (lv_body_4_0= ruleBody ) ) ) ;
    public final EObject ruleNestedFields() throws RecognitionException {
        EObject current = null;

        Token lv_help_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_body_4_0 = null;



        	enterRule();

        try {
            // InternalYamlGenDsl.g:598:2: ( ( ( (lv_help_0_0= RULE_HELP_STRING ) )* otherlv_1= 'fields' (otherlv_2= 'extend' ( (otherlv_3= RULE_ID ) ) )? ( (lv_body_4_0= ruleBody ) ) ) )
            // InternalYamlGenDsl.g:599:2: ( ( (lv_help_0_0= RULE_HELP_STRING ) )* otherlv_1= 'fields' (otherlv_2= 'extend' ( (otherlv_3= RULE_ID ) ) )? ( (lv_body_4_0= ruleBody ) ) )
            {
            // InternalYamlGenDsl.g:599:2: ( ( (lv_help_0_0= RULE_HELP_STRING ) )* otherlv_1= 'fields' (otherlv_2= 'extend' ( (otherlv_3= RULE_ID ) ) )? ( (lv_body_4_0= ruleBody ) ) )
            // InternalYamlGenDsl.g:600:3: ( (lv_help_0_0= RULE_HELP_STRING ) )* otherlv_1= 'fields' (otherlv_2= 'extend' ( (otherlv_3= RULE_ID ) ) )? ( (lv_body_4_0= ruleBody ) )
            {
            // InternalYamlGenDsl.g:600:3: ( (lv_help_0_0= RULE_HELP_STRING ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_HELP_STRING) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalYamlGenDsl.g:601:4: (lv_help_0_0= RULE_HELP_STRING )
            	    {
            	    // InternalYamlGenDsl.g:601:4: (lv_help_0_0= RULE_HELP_STRING )
            	    // InternalYamlGenDsl.g:602:5: lv_help_0_0= RULE_HELP_STRING
            	    {
            	    lv_help_0_0=(Token)match(input,RULE_HELP_STRING,FOLLOW_12); 

            	    					newLeafNode(lv_help_0_0, grammarAccess.getNestedFieldsAccess().getHelpHELP_STRINGTerminalRuleCall_0_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getNestedFieldsRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"help",
            	    						lv_help_0_0,
            	    						"yaml.helper.dsl.YamlGenDsl.HELP_STRING");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_1=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getNestedFieldsAccess().getFieldsKeyword_1());
            		
            // InternalYamlGenDsl.g:622:3: (otherlv_2= 'extend' ( (otherlv_3= RULE_ID ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==17) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalYamlGenDsl.g:623:4: otherlv_2= 'extend' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getNestedFieldsAccess().getExtendKeyword_2_0());
                    			
                    // InternalYamlGenDsl.g:627:4: ( (otherlv_3= RULE_ID ) )
                    // InternalYamlGenDsl.g:628:5: (otherlv_3= RULE_ID )
                    {
                    // InternalYamlGenDsl.g:628:5: (otherlv_3= RULE_ID )
                    // InternalYamlGenDsl.g:629:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNestedFieldsRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(otherlv_3, grammarAccess.getNestedFieldsAccess().getSuperFieldFieldCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalYamlGenDsl.g:641:3: ( (lv_body_4_0= ruleBody ) )
            // InternalYamlGenDsl.g:642:4: (lv_body_4_0= ruleBody )
            {
            // InternalYamlGenDsl.g:642:4: (lv_body_4_0= ruleBody )
            // InternalYamlGenDsl.g:643:5: lv_body_4_0= ruleBody
            {

            					newCompositeNode(grammarAccess.getNestedFieldsAccess().getBodyBodyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_4_0=ruleBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNestedFieldsRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_4_0,
            						"yaml.helper.dsl.YamlGenDsl.Body");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleNestedFields"


    // $ANTLR start "entryRuleProperty"
    // InternalYamlGenDsl.g:664:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalYamlGenDsl.g:664:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalYamlGenDsl.g:665:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalYamlGenDsl.g:671:1: ruleProperty returns [EObject current=null] : (this_StringProperty_0= ruleStringProperty | this_ValuesProperty_1= ruleValuesProperty | this_TypeProperty_2= ruleTypeProperty ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_StringProperty_0 = null;

        EObject this_ValuesProperty_1 = null;

        EObject this_TypeProperty_2 = null;



        	enterRule();

        try {
            // InternalYamlGenDsl.g:677:2: ( (this_StringProperty_0= ruleStringProperty | this_ValuesProperty_1= ruleValuesProperty | this_TypeProperty_2= ruleTypeProperty ) )
            // InternalYamlGenDsl.g:678:2: (this_StringProperty_0= ruleStringProperty | this_ValuesProperty_1= ruleValuesProperty | this_TypeProperty_2= ruleTypeProperty )
            {
            // InternalYamlGenDsl.g:678:2: (this_StringProperty_0= ruleStringProperty | this_ValuesProperty_1= ruleValuesProperty | this_TypeProperty_2= ruleTypeProperty )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 22:
            case 23:
            case 24:
                {
                alt15=1;
                }
                break;
            case 20:
            case 26:
                {
                alt15=2;
                }
                break;
            case 27:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalYamlGenDsl.g:679:3: this_StringProperty_0= ruleStringProperty
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getStringPropertyParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringProperty_0=ruleStringProperty();

                    state._fsp--;


                    			current = this_StringProperty_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalYamlGenDsl.g:688:3: this_ValuesProperty_1= ruleValuesProperty
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getValuesPropertyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ValuesProperty_1=ruleValuesProperty();

                    state._fsp--;


                    			current = this_ValuesProperty_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalYamlGenDsl.g:697:3: this_TypeProperty_2= ruleTypeProperty
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getTypePropertyParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypeProperty_2=ruleTypeProperty();

                    state._fsp--;


                    			current = this_TypeProperty_2;
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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleStringProperty"
    // InternalYamlGenDsl.g:709:1: entryRuleStringProperty returns [EObject current=null] : iv_ruleStringProperty= ruleStringProperty EOF ;
    public final EObject entryRuleStringProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringProperty = null;


        try {
            // InternalYamlGenDsl.g:709:55: (iv_ruleStringProperty= ruleStringProperty EOF )
            // InternalYamlGenDsl.g:710:2: iv_ruleStringProperty= ruleStringProperty EOF
            {
             newCompositeNode(grammarAccess.getStringPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringProperty=ruleStringProperty();

            state._fsp--;

             current =iv_ruleStringProperty; 
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
    // $ANTLR end "entryRuleStringProperty"


    // $ANTLR start "ruleStringProperty"
    // InternalYamlGenDsl.g:716:1: ruleStringProperty returns [EObject current=null] : ( ( ( (lv_key_0_1= 'key' | lv_key_0_2= 'name' | lv_key_0_3= 'hint' ) ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringProperty() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_1=null;
        Token lv_key_0_2=null;
        Token lv_key_0_3=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalYamlGenDsl.g:722:2: ( ( ( ( (lv_key_0_1= 'key' | lv_key_0_2= 'name' | lv_key_0_3= 'hint' ) ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalYamlGenDsl.g:723:2: ( ( ( (lv_key_0_1= 'key' | lv_key_0_2= 'name' | lv_key_0_3= 'hint' ) ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalYamlGenDsl.g:723:2: ( ( ( (lv_key_0_1= 'key' | lv_key_0_2= 'name' | lv_key_0_3= 'hint' ) ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalYamlGenDsl.g:724:3: ( ( (lv_key_0_1= 'key' | lv_key_0_2= 'name' | lv_key_0_3= 'hint' ) ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalYamlGenDsl.g:724:3: ( ( (lv_key_0_1= 'key' | lv_key_0_2= 'name' | lv_key_0_3= 'hint' ) ) )
            // InternalYamlGenDsl.g:725:4: ( (lv_key_0_1= 'key' | lv_key_0_2= 'name' | lv_key_0_3= 'hint' ) )
            {
            // InternalYamlGenDsl.g:725:4: ( (lv_key_0_1= 'key' | lv_key_0_2= 'name' | lv_key_0_3= 'hint' ) )
            // InternalYamlGenDsl.g:726:5: (lv_key_0_1= 'key' | lv_key_0_2= 'name' | lv_key_0_3= 'hint' )
            {
            // InternalYamlGenDsl.g:726:5: (lv_key_0_1= 'key' | lv_key_0_2= 'name' | lv_key_0_3= 'hint' )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt16=1;
                }
                break;
            case 23:
                {
                alt16=2;
                }
                break;
            case 24:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalYamlGenDsl.g:727:6: lv_key_0_1= 'key'
                    {
                    lv_key_0_1=(Token)match(input,22,FOLLOW_14); 

                    						newLeafNode(lv_key_0_1, grammarAccess.getStringPropertyAccess().getKeyKeyKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStringPropertyRule());
                    						}
                    						setWithLastConsumed(current, "key", lv_key_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalYamlGenDsl.g:738:6: lv_key_0_2= 'name'
                    {
                    lv_key_0_2=(Token)match(input,23,FOLLOW_14); 

                    						newLeafNode(lv_key_0_2, grammarAccess.getStringPropertyAccess().getKeyNameKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStringPropertyRule());
                    						}
                    						setWithLastConsumed(current, "key", lv_key_0_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalYamlGenDsl.g:749:6: lv_key_0_3= 'hint'
                    {
                    lv_key_0_3=(Token)match(input,24,FOLLOW_14); 

                    						newLeafNode(lv_key_0_3, grammarAccess.getStringPropertyAccess().getKeyHintKeyword_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStringPropertyRule());
                    						}
                    						setWithLastConsumed(current, "key", lv_key_0_3, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getStringPropertyAccess().getColonKeyword_1());
            		
            // InternalYamlGenDsl.g:766:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalYamlGenDsl.g:767:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalYamlGenDsl.g:767:4: (lv_value_2_0= RULE_STRING )
            // InternalYamlGenDsl.g:768:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getStringPropertyAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


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
    // $ANTLR end "ruleStringProperty"


    // $ANTLR start "entryRuleValuesProperty"
    // InternalYamlGenDsl.g:788:1: entryRuleValuesProperty returns [EObject current=null] : iv_ruleValuesProperty= ruleValuesProperty EOF ;
    public final EObject entryRuleValuesProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuesProperty = null;


        try {
            // InternalYamlGenDsl.g:788:55: (iv_ruleValuesProperty= ruleValuesProperty EOF )
            // InternalYamlGenDsl.g:789:2: iv_ruleValuesProperty= ruleValuesProperty EOF
            {
             newCompositeNode(grammarAccess.getValuesPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValuesProperty=ruleValuesProperty();

            state._fsp--;

             current =iv_ruleValuesProperty; 
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
    // $ANTLR end "entryRuleValuesProperty"


    // $ANTLR start "ruleValuesProperty"
    // InternalYamlGenDsl.g:795:1: ruleValuesProperty returns [EObject current=null] : ( ( ( (lv_key_0_1= 'default' | lv_key_0_2= 'values' ) ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValues ) ) ) ;
    public final EObject ruleValuesProperty() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_1=null;
        Token lv_key_0_2=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalYamlGenDsl.g:801:2: ( ( ( ( (lv_key_0_1= 'default' | lv_key_0_2= 'values' ) ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValues ) ) ) )
            // InternalYamlGenDsl.g:802:2: ( ( ( (lv_key_0_1= 'default' | lv_key_0_2= 'values' ) ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValues ) ) )
            {
            // InternalYamlGenDsl.g:802:2: ( ( ( (lv_key_0_1= 'default' | lv_key_0_2= 'values' ) ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValues ) ) )
            // InternalYamlGenDsl.g:803:3: ( ( (lv_key_0_1= 'default' | lv_key_0_2= 'values' ) ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValues ) )
            {
            // InternalYamlGenDsl.g:803:3: ( ( (lv_key_0_1= 'default' | lv_key_0_2= 'values' ) ) )
            // InternalYamlGenDsl.g:804:4: ( (lv_key_0_1= 'default' | lv_key_0_2= 'values' ) )
            {
            // InternalYamlGenDsl.g:804:4: ( (lv_key_0_1= 'default' | lv_key_0_2= 'values' ) )
            // InternalYamlGenDsl.g:805:5: (lv_key_0_1= 'default' | lv_key_0_2= 'values' )
            {
            // InternalYamlGenDsl.g:805:5: (lv_key_0_1= 'default' | lv_key_0_2= 'values' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==20) ) {
                alt17=1;
            }
            else if ( (LA17_0==26) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalYamlGenDsl.g:806:6: lv_key_0_1= 'default'
                    {
                    lv_key_0_1=(Token)match(input,20,FOLLOW_14); 

                    						newLeafNode(lv_key_0_1, grammarAccess.getValuesPropertyAccess().getKeyDefaultKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getValuesPropertyRule());
                    						}
                    						setWithLastConsumed(current, "key", lv_key_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalYamlGenDsl.g:817:6: lv_key_0_2= 'values'
                    {
                    lv_key_0_2=(Token)match(input,26,FOLLOW_14); 

                    						newLeafNode(lv_key_0_2, grammarAccess.getValuesPropertyAccess().getKeyValuesKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getValuesPropertyRule());
                    						}
                    						setWithLastConsumed(current, "key", lv_key_0_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getValuesPropertyAccess().getColonKeyword_1());
            		
            // InternalYamlGenDsl.g:834:3: ( (lv_value_2_0= ruleValues ) )
            // InternalYamlGenDsl.g:835:4: (lv_value_2_0= ruleValues )
            {
            // InternalYamlGenDsl.g:835:4: (lv_value_2_0= ruleValues )
            // InternalYamlGenDsl.g:836:5: lv_value_2_0= ruleValues
            {

            					newCompositeNode(grammarAccess.getValuesPropertyAccess().getValueValuesParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleValues();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValuesPropertyRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"yaml.helper.dsl.YamlGenDsl.Values");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleValuesProperty"


    // $ANTLR start "entryRuleTypeProperty"
    // InternalYamlGenDsl.g:857:1: entryRuleTypeProperty returns [EObject current=null] : iv_ruleTypeProperty= ruleTypeProperty EOF ;
    public final EObject entryRuleTypeProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeProperty = null;


        try {
            // InternalYamlGenDsl.g:857:53: (iv_ruleTypeProperty= ruleTypeProperty EOF )
            // InternalYamlGenDsl.g:858:2: iv_ruleTypeProperty= ruleTypeProperty EOF
            {
             newCompositeNode(grammarAccess.getTypePropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeProperty=ruleTypeProperty();

            state._fsp--;

             current =iv_ruleTypeProperty; 
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
    // $ANTLR end "entryRuleTypeProperty"


    // $ANTLR start "ruleTypeProperty"
    // InternalYamlGenDsl.g:864:1: ruleTypeProperty returns [EObject current=null] : ( ( (lv_key_0_0= 'type' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'int' | lv_value_2_2= 'float' | lv_value_2_3= 'string' | lv_value_2_4= 'list' | lv_value_2_5= 'any' | lv_value_2_6= RULE_STRING ) ) ) (otherlv_3= '(' ( (lv_help_4_0= RULE_STRING ) ) otherlv_5= ')' )? ) ;
    public final EObject ruleTypeProperty() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_1=null;
        Token lv_value_2_2=null;
        Token lv_value_2_3=null;
        Token lv_value_2_4=null;
        Token lv_value_2_5=null;
        Token lv_value_2_6=null;
        Token otherlv_3=null;
        Token lv_help_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalYamlGenDsl.g:870:2: ( ( ( (lv_key_0_0= 'type' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'int' | lv_value_2_2= 'float' | lv_value_2_3= 'string' | lv_value_2_4= 'list' | lv_value_2_5= 'any' | lv_value_2_6= RULE_STRING ) ) ) (otherlv_3= '(' ( (lv_help_4_0= RULE_STRING ) ) otherlv_5= ')' )? ) )
            // InternalYamlGenDsl.g:871:2: ( ( (lv_key_0_0= 'type' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'int' | lv_value_2_2= 'float' | lv_value_2_3= 'string' | lv_value_2_4= 'list' | lv_value_2_5= 'any' | lv_value_2_6= RULE_STRING ) ) ) (otherlv_3= '(' ( (lv_help_4_0= RULE_STRING ) ) otherlv_5= ')' )? )
            {
            // InternalYamlGenDsl.g:871:2: ( ( (lv_key_0_0= 'type' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'int' | lv_value_2_2= 'float' | lv_value_2_3= 'string' | lv_value_2_4= 'list' | lv_value_2_5= 'any' | lv_value_2_6= RULE_STRING ) ) ) (otherlv_3= '(' ( (lv_help_4_0= RULE_STRING ) ) otherlv_5= ')' )? )
            // InternalYamlGenDsl.g:872:3: ( (lv_key_0_0= 'type' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'int' | lv_value_2_2= 'float' | lv_value_2_3= 'string' | lv_value_2_4= 'list' | lv_value_2_5= 'any' | lv_value_2_6= RULE_STRING ) ) ) (otherlv_3= '(' ( (lv_help_4_0= RULE_STRING ) ) otherlv_5= ')' )?
            {
            // InternalYamlGenDsl.g:872:3: ( (lv_key_0_0= 'type' ) )
            // InternalYamlGenDsl.g:873:4: (lv_key_0_0= 'type' )
            {
            // InternalYamlGenDsl.g:873:4: (lv_key_0_0= 'type' )
            // InternalYamlGenDsl.g:874:5: lv_key_0_0= 'type'
            {
            lv_key_0_0=(Token)match(input,27,FOLLOW_14); 

            					newLeafNode(lv_key_0_0, grammarAccess.getTypePropertyAccess().getKeyTypeKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypePropertyRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "type");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getTypePropertyAccess().getColonKeyword_1());
            		
            // InternalYamlGenDsl.g:890:3: ( ( (lv_value_2_1= 'int' | lv_value_2_2= 'float' | lv_value_2_3= 'string' | lv_value_2_4= 'list' | lv_value_2_5= 'any' | lv_value_2_6= RULE_STRING ) ) )
            // InternalYamlGenDsl.g:891:4: ( (lv_value_2_1= 'int' | lv_value_2_2= 'float' | lv_value_2_3= 'string' | lv_value_2_4= 'list' | lv_value_2_5= 'any' | lv_value_2_6= RULE_STRING ) )
            {
            // InternalYamlGenDsl.g:891:4: ( (lv_value_2_1= 'int' | lv_value_2_2= 'float' | lv_value_2_3= 'string' | lv_value_2_4= 'list' | lv_value_2_5= 'any' | lv_value_2_6= RULE_STRING ) )
            // InternalYamlGenDsl.g:892:5: (lv_value_2_1= 'int' | lv_value_2_2= 'float' | lv_value_2_3= 'string' | lv_value_2_4= 'list' | lv_value_2_5= 'any' | lv_value_2_6= RULE_STRING )
            {
            // InternalYamlGenDsl.g:892:5: (lv_value_2_1= 'int' | lv_value_2_2= 'float' | lv_value_2_3= 'string' | lv_value_2_4= 'list' | lv_value_2_5= 'any' | lv_value_2_6= RULE_STRING )
            int alt18=6;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt18=1;
                }
                break;
            case 29:
                {
                alt18=2;
                }
                break;
            case 30:
                {
                alt18=3;
                }
                break;
            case 31:
                {
                alt18=4;
                }
                break;
            case 32:
                {
                alt18=5;
                }
                break;
            case RULE_STRING:
                {
                alt18=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalYamlGenDsl.g:893:6: lv_value_2_1= 'int'
                    {
                    lv_value_2_1=(Token)match(input,28,FOLLOW_17); 

                    						newLeafNode(lv_value_2_1, grammarAccess.getTypePropertyAccess().getValueIntKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypePropertyRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalYamlGenDsl.g:904:6: lv_value_2_2= 'float'
                    {
                    lv_value_2_2=(Token)match(input,29,FOLLOW_17); 

                    						newLeafNode(lv_value_2_2, grammarAccess.getTypePropertyAccess().getValueFloatKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypePropertyRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalYamlGenDsl.g:915:6: lv_value_2_3= 'string'
                    {
                    lv_value_2_3=(Token)match(input,30,FOLLOW_17); 

                    						newLeafNode(lv_value_2_3, grammarAccess.getTypePropertyAccess().getValueStringKeyword_2_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypePropertyRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalYamlGenDsl.g:926:6: lv_value_2_4= 'list'
                    {
                    lv_value_2_4=(Token)match(input,31,FOLLOW_17); 

                    						newLeafNode(lv_value_2_4, grammarAccess.getTypePropertyAccess().getValueListKeyword_2_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypePropertyRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalYamlGenDsl.g:937:6: lv_value_2_5= 'any'
                    {
                    lv_value_2_5=(Token)match(input,32,FOLLOW_17); 

                    						newLeafNode(lv_value_2_5, grammarAccess.getTypePropertyAccess().getValueAnyKeyword_2_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypePropertyRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_5, null);
                    					

                    }
                    break;
                case 6 :
                    // InternalYamlGenDsl.g:948:6: lv_value_2_6= RULE_STRING
                    {
                    lv_value_2_6=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    						newLeafNode(lv_value_2_6, grammarAccess.getTypePropertyAccess().getValueSTRINGTerminalRuleCall_2_0_5());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypePropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_2_6,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }
                    break;

            }


            }


            }

            // InternalYamlGenDsl.g:965:3: (otherlv_3= '(' ( (lv_help_4_0= RULE_STRING ) ) otherlv_5= ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalYamlGenDsl.g:966:4: otherlv_3= '(' ( (lv_help_4_0= RULE_STRING ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getTypePropertyAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalYamlGenDsl.g:970:4: ( (lv_help_4_0= RULE_STRING ) )
                    // InternalYamlGenDsl.g:971:5: (lv_help_4_0= RULE_STRING )
                    {
                    // InternalYamlGenDsl.g:971:5: (lv_help_4_0= RULE_STRING )
                    // InternalYamlGenDsl.g:972:6: lv_help_4_0= RULE_STRING
                    {
                    lv_help_4_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

                    						newLeafNode(lv_help_4_0, grammarAccess.getTypePropertyAccess().getHelpSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypePropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"help",
                    							lv_help_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,34,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getTypePropertyAccess().getRightParenthesisKeyword_3_2());
                    			

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
    // $ANTLR end "ruleTypeProperty"


    // $ANTLR start "entryRuleValues"
    // InternalYamlGenDsl.g:997:1: entryRuleValues returns [EObject current=null] : iv_ruleValues= ruleValues EOF ;
    public final EObject entryRuleValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValues = null;


        try {
            // InternalYamlGenDsl.g:997:47: (iv_ruleValues= ruleValues EOF )
            // InternalYamlGenDsl.g:998:2: iv_ruleValues= ruleValues EOF
            {
             newCompositeNode(grammarAccess.getValuesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValues=ruleValues();

            state._fsp--;

             current =iv_ruleValues; 
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
    // $ANTLR end "entryRuleValues"


    // $ANTLR start "ruleValues"
    // InternalYamlGenDsl.g:1004:1: ruleValues returns [EObject current=null] : ( (otherlv_0= '[' ( (lv_values_1_0= ruleValues ) )+ otherlv_2= ']' ) | ( (lv_string_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_string_3_0=null;
        EObject lv_values_1_0 = null;



        	enterRule();

        try {
            // InternalYamlGenDsl.g:1010:2: ( ( (otherlv_0= '[' ( (lv_values_1_0= ruleValues ) )+ otherlv_2= ']' ) | ( (lv_string_3_0= RULE_STRING ) ) ) )
            // InternalYamlGenDsl.g:1011:2: ( (otherlv_0= '[' ( (lv_values_1_0= ruleValues ) )+ otherlv_2= ']' ) | ( (lv_string_3_0= RULE_STRING ) ) )
            {
            // InternalYamlGenDsl.g:1011:2: ( (otherlv_0= '[' ( (lv_values_1_0= ruleValues ) )+ otherlv_2= ']' ) | ( (lv_string_3_0= RULE_STRING ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_STRING) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalYamlGenDsl.g:1012:3: (otherlv_0= '[' ( (lv_values_1_0= ruleValues ) )+ otherlv_2= ']' )
                    {
                    // InternalYamlGenDsl.g:1012:3: (otherlv_0= '[' ( (lv_values_1_0= ruleValues ) )+ otherlv_2= ']' )
                    // InternalYamlGenDsl.g:1013:4: otherlv_0= '[' ( (lv_values_1_0= ruleValues ) )+ otherlv_2= ']'
                    {
                    otherlv_0=(Token)match(input,35,FOLLOW_15); 

                    				newLeafNode(otherlv_0, grammarAccess.getValuesAccess().getLeftSquareBracketKeyword_0_0());
                    			
                    // InternalYamlGenDsl.g:1017:4: ( (lv_values_1_0= ruleValues ) )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==RULE_STRING||LA20_0==35) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalYamlGenDsl.g:1018:5: (lv_values_1_0= ruleValues )
                    	    {
                    	    // InternalYamlGenDsl.g:1018:5: (lv_values_1_0= ruleValues )
                    	    // InternalYamlGenDsl.g:1019:6: lv_values_1_0= ruleValues
                    	    {

                    	    						newCompositeNode(grammarAccess.getValuesAccess().getValuesValuesParserRuleCall_0_1_0());
                    	    					
                    	    pushFollow(FOLLOW_19);
                    	    lv_values_1_0=ruleValues();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getValuesRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"values",
                    	    							lv_values_1_0,
                    	    							"yaml.helper.dsl.YamlGenDsl.Values");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt20 >= 1 ) break loop20;
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
                    } while (true);

                    otherlv_2=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getValuesAccess().getRightSquareBracketKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalYamlGenDsl.g:1042:3: ( (lv_string_3_0= RULE_STRING ) )
                    {
                    // InternalYamlGenDsl.g:1042:3: ( (lv_string_3_0= RULE_STRING ) )
                    // InternalYamlGenDsl.g:1043:4: (lv_string_3_0= RULE_STRING )
                    {
                    // InternalYamlGenDsl.g:1043:4: (lv_string_3_0= RULE_STRING )
                    // InternalYamlGenDsl.g:1044:5: lv_string_3_0= RULE_STRING
                    {
                    lv_string_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_string_3_0, grammarAccess.getValuesAccess().getStringSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getValuesRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"string",
                    						lv_string_3_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


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
    // $ANTLR end "ruleValues"

    // Delegated rules


    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\4\uffff";
    static final String dfa_2s = "\2\5\2\uffff";
    static final String dfa_3s = "\2\25\2\uffff";
    static final String dfa_4s = "\2\uffff\1\1\1\2";
    static final String dfa_5s = "\4\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\14\uffff\1\2\2\uffff\1\3",
            "\1\1\14\uffff\1\2\2\uffff\1\3",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "456:2: (this_NestedField_0= ruleNestedField | this_NestedFields_1= ruleNestedFields )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000003062L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002060L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000DF70020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000018C000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000010C000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000002C000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000001F0000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001800000010L});

}