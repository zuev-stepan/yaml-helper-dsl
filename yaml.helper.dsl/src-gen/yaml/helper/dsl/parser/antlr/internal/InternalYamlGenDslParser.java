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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_SL_COMMENT", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'root'", "'extends'", "'{'", "'}'", "'extend'", "'field'", "'mandatory'", "'default'", "'fields'", "'key:'", "'name:'", "'default:'", "'hint:'", "'values:'", "'['", "']'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=5;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=7;
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

                if ( ((LA1_0>=RULE_SL_COMMENT && LA1_0<=RULE_ID)||(LA1_0>=11 && LA1_0<=12)) ) {
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

            if ( ((LA2_0>=RULE_SL_COMMENT && LA2_0<=RULE_ID)||LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==11) ) {
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
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

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
    // InternalYamlGenDsl.g:184:1: ruleField returns [EObject current=null] : ( ( (lv_help_0_0= RULE_SL_COMMENT ) )* ( (lv_root_1_0= 'root' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_body_5_0= ruleBody ) ) ) ;
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
            // InternalYamlGenDsl.g:190:2: ( ( ( (lv_help_0_0= RULE_SL_COMMENT ) )* ( (lv_root_1_0= 'root' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_body_5_0= ruleBody ) ) ) )
            // InternalYamlGenDsl.g:191:2: ( ( (lv_help_0_0= RULE_SL_COMMENT ) )* ( (lv_root_1_0= 'root' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_body_5_0= ruleBody ) ) )
            {
            // InternalYamlGenDsl.g:191:2: ( ( (lv_help_0_0= RULE_SL_COMMENT ) )* ( (lv_root_1_0= 'root' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_body_5_0= ruleBody ) ) )
            // InternalYamlGenDsl.g:192:3: ( (lv_help_0_0= RULE_SL_COMMENT ) )* ( (lv_root_1_0= 'root' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_body_5_0= ruleBody ) )
            {
            // InternalYamlGenDsl.g:192:3: ( (lv_help_0_0= RULE_SL_COMMENT ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_SL_COMMENT) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalYamlGenDsl.g:193:4: (lv_help_0_0= RULE_SL_COMMENT )
            	    {
            	    // InternalYamlGenDsl.g:193:4: (lv_help_0_0= RULE_SL_COMMENT )
            	    // InternalYamlGenDsl.g:194:5: lv_help_0_0= RULE_SL_COMMENT
            	    {
            	    lv_help_0_0=(Token)match(input,RULE_SL_COMMENT,FOLLOW_5); 

            	    					newLeafNode(lv_help_0_0, grammarAccess.getFieldAccess().getHelpSL_COMMENTTerminalRuleCall_0_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getFieldRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"help",
            	    						lv_help_0_0,
            	    						"org.eclipse.xtext.common.Terminals.SL_COMMENT");
            	    				

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

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalYamlGenDsl.g:211:4: (lv_root_1_0= 'root' )
                    {
                    // InternalYamlGenDsl.g:211:4: (lv_root_1_0= 'root' )
                    // InternalYamlGenDsl.g:212:5: lv_root_1_0= 'root'
                    {
                    lv_root_1_0=(Token)match(input,12,FOLLOW_6); 

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

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalYamlGenDsl.g:243:4: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_6); 

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

            otherlv_1=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalYamlGenDsl.g:310:3: ( (lv_elements_2_0= ruleBodyElement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_SL_COMMENT||(LA6_0>=16 && LA6_0<=17)||(LA6_0>=20 && LA6_0<=25)) ) {
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

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

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
    // InternalYamlGenDsl.g:344:1: ruleBodyElement returns [EObject current=null] : (this_Extend_0= ruleExtend | this_NestedField_1= ruleNestedField | this_NestedFields_2= ruleNestedFields | this_Property_3= ruleProperty ) ;
    public final EObject ruleBodyElement() throws RecognitionException {
        EObject current = null;

        EObject this_Extend_0 = null;

        EObject this_NestedField_1 = null;

        EObject this_NestedFields_2 = null;

        EObject this_Property_3 = null;



        	enterRule();

        try {
            // InternalYamlGenDsl.g:350:2: ( (this_Extend_0= ruleExtend | this_NestedField_1= ruleNestedField | this_NestedFields_2= ruleNestedFields | this_Property_3= ruleProperty ) )
            // InternalYamlGenDsl.g:351:2: (this_Extend_0= ruleExtend | this_NestedField_1= ruleNestedField | this_NestedFields_2= ruleNestedFields | this_Property_3= ruleProperty )
            {
            // InternalYamlGenDsl.g:351:2: (this_Extend_0= ruleExtend | this_NestedField_1= ruleNestedField | this_NestedFields_2= ruleNestedFields | this_Property_3= ruleProperty )
            int alt7=4;
            alt7 = dfa7.predict(input);
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
                    // InternalYamlGenDsl.g:361:3: this_NestedField_1= ruleNestedField
                    {

                    			newCompositeNode(grammarAccess.getBodyElementAccess().getNestedFieldParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NestedField_1=ruleNestedField();

                    state._fsp--;


                    			current = this_NestedField_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalYamlGenDsl.g:370:3: this_NestedFields_2= ruleNestedFields
                    {

                    			newCompositeNode(grammarAccess.getBodyElementAccess().getNestedFieldsParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_NestedFields_2=ruleNestedFields();

                    state._fsp--;


                    			current = this_NestedFields_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalYamlGenDsl.g:379:3: this_Property_3= ruleProperty
                    {

                    			newCompositeNode(grammarAccess.getBodyElementAccess().getPropertyParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Property_3=ruleProperty();

                    state._fsp--;


                    			current = this_Property_3;
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
    // InternalYamlGenDsl.g:391:1: entryRuleExtend returns [EObject current=null] : iv_ruleExtend= ruleExtend EOF ;
    public final EObject entryRuleExtend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtend = null;


        try {
            // InternalYamlGenDsl.g:391:47: (iv_ruleExtend= ruleExtend EOF )
            // InternalYamlGenDsl.g:392:2: iv_ruleExtend= ruleExtend EOF
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
    // InternalYamlGenDsl.g:398:1: ruleExtend returns [EObject current=null] : (otherlv_0= 'extend' ( (lv_name_property_1_0= RULE_STRING ) ) ( (lv_body_2_0= ruleBody ) ) ) ;
    public final EObject ruleExtend() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_property_1_0=null;
        EObject lv_body_2_0 = null;



        	enterRule();

        try {
            // InternalYamlGenDsl.g:404:2: ( (otherlv_0= 'extend' ( (lv_name_property_1_0= RULE_STRING ) ) ( (lv_body_2_0= ruleBody ) ) ) )
            // InternalYamlGenDsl.g:405:2: (otherlv_0= 'extend' ( (lv_name_property_1_0= RULE_STRING ) ) ( (lv_body_2_0= ruleBody ) ) )
            {
            // InternalYamlGenDsl.g:405:2: (otherlv_0= 'extend' ( (lv_name_property_1_0= RULE_STRING ) ) ( (lv_body_2_0= ruleBody ) ) )
            // InternalYamlGenDsl.g:406:3: otherlv_0= 'extend' ( (lv_name_property_1_0= RULE_STRING ) ) ( (lv_body_2_0= ruleBody ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getExtendAccess().getExtendKeyword_0());
            		
            // InternalYamlGenDsl.g:410:3: ( (lv_name_property_1_0= RULE_STRING ) )
            // InternalYamlGenDsl.g:411:4: (lv_name_property_1_0= RULE_STRING )
            {
            // InternalYamlGenDsl.g:411:4: (lv_name_property_1_0= RULE_STRING )
            // InternalYamlGenDsl.g:412:5: lv_name_property_1_0= RULE_STRING
            {
            lv_name_property_1_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_name_property_1_0, grammarAccess.getExtendAccess().getName_propertySTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtendRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name_property",
            						lv_name_property_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalYamlGenDsl.g:428:3: ( (lv_body_2_0= ruleBody ) )
            // InternalYamlGenDsl.g:429:4: (lv_body_2_0= ruleBody )
            {
            // InternalYamlGenDsl.g:429:4: (lv_body_2_0= ruleBody )
            // InternalYamlGenDsl.g:430:5: lv_body_2_0= ruleBody
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


    // $ANTLR start "entryRuleNestedField"
    // InternalYamlGenDsl.g:451:1: entryRuleNestedField returns [EObject current=null] : iv_ruleNestedField= ruleNestedField EOF ;
    public final EObject entryRuleNestedField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedField = null;


        try {
            // InternalYamlGenDsl.g:451:52: (iv_ruleNestedField= ruleNestedField EOF )
            // InternalYamlGenDsl.g:452:2: iv_ruleNestedField= ruleNestedField EOF
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
    // InternalYamlGenDsl.g:458:1: ruleNestedField returns [EObject current=null] : ( ( (lv_help_0_0= RULE_SL_COMMENT ) )* otherlv_1= 'field' ( (lv_mandatory_2_0= 'mandatory' ) )? ( (lv_default_3_0= 'default' ) )? (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? ( (lv_body_6_0= ruleBody ) ) ) ;
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
            // InternalYamlGenDsl.g:464:2: ( ( ( (lv_help_0_0= RULE_SL_COMMENT ) )* otherlv_1= 'field' ( (lv_mandatory_2_0= 'mandatory' ) )? ( (lv_default_3_0= 'default' ) )? (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? ( (lv_body_6_0= ruleBody ) ) ) )
            // InternalYamlGenDsl.g:465:2: ( ( (lv_help_0_0= RULE_SL_COMMENT ) )* otherlv_1= 'field' ( (lv_mandatory_2_0= 'mandatory' ) )? ( (lv_default_3_0= 'default' ) )? (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? ( (lv_body_6_0= ruleBody ) ) )
            {
            // InternalYamlGenDsl.g:465:2: ( ( (lv_help_0_0= RULE_SL_COMMENT ) )* otherlv_1= 'field' ( (lv_mandatory_2_0= 'mandatory' ) )? ( (lv_default_3_0= 'default' ) )? (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? ( (lv_body_6_0= ruleBody ) ) )
            // InternalYamlGenDsl.g:466:3: ( (lv_help_0_0= RULE_SL_COMMENT ) )* otherlv_1= 'field' ( (lv_mandatory_2_0= 'mandatory' ) )? ( (lv_default_3_0= 'default' ) )? (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? ( (lv_body_6_0= ruleBody ) )
            {
            // InternalYamlGenDsl.g:466:3: ( (lv_help_0_0= RULE_SL_COMMENT ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_SL_COMMENT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalYamlGenDsl.g:467:4: (lv_help_0_0= RULE_SL_COMMENT )
            	    {
            	    // InternalYamlGenDsl.g:467:4: (lv_help_0_0= RULE_SL_COMMENT )
            	    // InternalYamlGenDsl.g:468:5: lv_help_0_0= RULE_SL_COMMENT
            	    {
            	    lv_help_0_0=(Token)match(input,RULE_SL_COMMENT,FOLLOW_9); 

            	    					newLeafNode(lv_help_0_0, grammarAccess.getNestedFieldAccess().getHelpSL_COMMENTTerminalRuleCall_0_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getNestedFieldRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"help",
            	    						lv_help_0_0,
            	    						"org.eclipse.xtext.common.Terminals.SL_COMMENT");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_1=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getNestedFieldAccess().getFieldKeyword_1());
            		
            // InternalYamlGenDsl.g:488:3: ( (lv_mandatory_2_0= 'mandatory' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalYamlGenDsl.g:489:4: (lv_mandatory_2_0= 'mandatory' )
                    {
                    // InternalYamlGenDsl.g:489:4: (lv_mandatory_2_0= 'mandatory' )
                    // InternalYamlGenDsl.g:490:5: lv_mandatory_2_0= 'mandatory'
                    {
                    lv_mandatory_2_0=(Token)match(input,18,FOLLOW_11); 

                    					newLeafNode(lv_mandatory_2_0, grammarAccess.getNestedFieldAccess().getMandatoryMandatoryKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNestedFieldRule());
                    					}
                    					setWithLastConsumed(current, "mandatory", lv_mandatory_2_0 != null, "mandatory");
                    				

                    }


                    }
                    break;

            }

            // InternalYamlGenDsl.g:502:3: ( (lv_default_3_0= 'default' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalYamlGenDsl.g:503:4: (lv_default_3_0= 'default' )
                    {
                    // InternalYamlGenDsl.g:503:4: (lv_default_3_0= 'default' )
                    // InternalYamlGenDsl.g:504:5: lv_default_3_0= 'default'
                    {
                    lv_default_3_0=(Token)match(input,19,FOLLOW_7); 

                    					newLeafNode(lv_default_3_0, grammarAccess.getNestedFieldAccess().getDefaultDefaultKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNestedFieldRule());
                    					}
                    					setWithLastConsumed(current, "default", lv_default_3_0 != null, "default");
                    				

                    }


                    }
                    break;

            }

            // InternalYamlGenDsl.g:516:3: (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==13) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalYamlGenDsl.g:517:4: otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getNestedFieldAccess().getExtendsKeyword_4_0());
                    			
                    // InternalYamlGenDsl.g:521:4: ( (otherlv_5= RULE_ID ) )
                    // InternalYamlGenDsl.g:522:5: (otherlv_5= RULE_ID )
                    {
                    // InternalYamlGenDsl.g:522:5: (otherlv_5= RULE_ID )
                    // InternalYamlGenDsl.g:523:6: otherlv_5= RULE_ID
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

            // InternalYamlGenDsl.g:535:3: ( (lv_body_6_0= ruleBody ) )
            // InternalYamlGenDsl.g:536:4: (lv_body_6_0= ruleBody )
            {
            // InternalYamlGenDsl.g:536:4: (lv_body_6_0= ruleBody )
            // InternalYamlGenDsl.g:537:5: lv_body_6_0= ruleBody
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
    // InternalYamlGenDsl.g:558:1: entryRuleNestedFields returns [EObject current=null] : iv_ruleNestedFields= ruleNestedFields EOF ;
    public final EObject entryRuleNestedFields() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedFields = null;


        try {
            // InternalYamlGenDsl.g:558:53: (iv_ruleNestedFields= ruleNestedFields EOF )
            // InternalYamlGenDsl.g:559:2: iv_ruleNestedFields= ruleNestedFields EOF
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
    // InternalYamlGenDsl.g:565:1: ruleNestedFields returns [EObject current=null] : ( ( (lv_help_0_0= RULE_SL_COMMENT ) )* otherlv_1= 'fields' (otherlv_2= 'extend' ( (otherlv_3= RULE_ID ) ) )? ( (lv_body_4_0= ruleBody ) ) ) ;
    public final EObject ruleNestedFields() throws RecognitionException {
        EObject current = null;

        Token lv_help_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_body_4_0 = null;



        	enterRule();

        try {
            // InternalYamlGenDsl.g:571:2: ( ( ( (lv_help_0_0= RULE_SL_COMMENT ) )* otherlv_1= 'fields' (otherlv_2= 'extend' ( (otherlv_3= RULE_ID ) ) )? ( (lv_body_4_0= ruleBody ) ) ) )
            // InternalYamlGenDsl.g:572:2: ( ( (lv_help_0_0= RULE_SL_COMMENT ) )* otherlv_1= 'fields' (otherlv_2= 'extend' ( (otherlv_3= RULE_ID ) ) )? ( (lv_body_4_0= ruleBody ) ) )
            {
            // InternalYamlGenDsl.g:572:2: ( ( (lv_help_0_0= RULE_SL_COMMENT ) )* otherlv_1= 'fields' (otherlv_2= 'extend' ( (otherlv_3= RULE_ID ) ) )? ( (lv_body_4_0= ruleBody ) ) )
            // InternalYamlGenDsl.g:573:3: ( (lv_help_0_0= RULE_SL_COMMENT ) )* otherlv_1= 'fields' (otherlv_2= 'extend' ( (otherlv_3= RULE_ID ) ) )? ( (lv_body_4_0= ruleBody ) )
            {
            // InternalYamlGenDsl.g:573:3: ( (lv_help_0_0= RULE_SL_COMMENT ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_SL_COMMENT) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalYamlGenDsl.g:574:4: (lv_help_0_0= RULE_SL_COMMENT )
            	    {
            	    // InternalYamlGenDsl.g:574:4: (lv_help_0_0= RULE_SL_COMMENT )
            	    // InternalYamlGenDsl.g:575:5: lv_help_0_0= RULE_SL_COMMENT
            	    {
            	    lv_help_0_0=(Token)match(input,RULE_SL_COMMENT,FOLLOW_12); 

            	    					newLeafNode(lv_help_0_0, grammarAccess.getNestedFieldsAccess().getHelpSL_COMMENTTerminalRuleCall_0_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getNestedFieldsRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"help",
            	    						lv_help_0_0,
            	    						"org.eclipse.xtext.common.Terminals.SL_COMMENT");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_1=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getNestedFieldsAccess().getFieldsKeyword_1());
            		
            // InternalYamlGenDsl.g:595:3: (otherlv_2= 'extend' ( (otherlv_3= RULE_ID ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==16) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalYamlGenDsl.g:596:4: otherlv_2= 'extend' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getNestedFieldsAccess().getExtendKeyword_2_0());
                    			
                    // InternalYamlGenDsl.g:600:4: ( (otherlv_3= RULE_ID ) )
                    // InternalYamlGenDsl.g:601:5: (otherlv_3= RULE_ID )
                    {
                    // InternalYamlGenDsl.g:601:5: (otherlv_3= RULE_ID )
                    // InternalYamlGenDsl.g:602:6: otherlv_3= RULE_ID
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

            // InternalYamlGenDsl.g:614:3: ( (lv_body_4_0= ruleBody ) )
            // InternalYamlGenDsl.g:615:4: (lv_body_4_0= ruleBody )
            {
            // InternalYamlGenDsl.g:615:4: (lv_body_4_0= ruleBody )
            // InternalYamlGenDsl.g:616:5: lv_body_4_0= ruleBody
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
    // InternalYamlGenDsl.g:637:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalYamlGenDsl.g:637:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalYamlGenDsl.g:638:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalYamlGenDsl.g:644:1: ruleProperty returns [EObject current=null] : (this_Name_0= ruleName | this_Key_1= ruleKey | this_Default_2= ruleDefault | this_Hint_3= ruleHint | this_PermittedValues_4= rulePermittedValues ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_Name_0 = null;

        EObject this_Key_1 = null;

        EObject this_Default_2 = null;

        EObject this_Hint_3 = null;

        EObject this_PermittedValues_4 = null;



        	enterRule();

        try {
            // InternalYamlGenDsl.g:650:2: ( (this_Name_0= ruleName | this_Key_1= ruleKey | this_Default_2= ruleDefault | this_Hint_3= ruleHint | this_PermittedValues_4= rulePermittedValues ) )
            // InternalYamlGenDsl.g:651:2: (this_Name_0= ruleName | this_Key_1= ruleKey | this_Default_2= ruleDefault | this_Hint_3= ruleHint | this_PermittedValues_4= rulePermittedValues )
            {
            // InternalYamlGenDsl.g:651:2: (this_Name_0= ruleName | this_Key_1= ruleKey | this_Default_2= ruleDefault | this_Hint_3= ruleHint | this_PermittedValues_4= rulePermittedValues )
            int alt14=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt14=1;
                }
                break;
            case 21:
                {
                alt14=2;
                }
                break;
            case 23:
                {
                alt14=3;
                }
                break;
            case 24:
                {
                alt14=4;
                }
                break;
            case 25:
                {
                alt14=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalYamlGenDsl.g:652:3: this_Name_0= ruleName
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getNameParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Name_0=ruleName();

                    state._fsp--;


                    			current = this_Name_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalYamlGenDsl.g:661:3: this_Key_1= ruleKey
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getKeyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Key_1=ruleKey();

                    state._fsp--;


                    			current = this_Key_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalYamlGenDsl.g:670:3: this_Default_2= ruleDefault
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getDefaultParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Default_2=ruleDefault();

                    state._fsp--;


                    			current = this_Default_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalYamlGenDsl.g:679:3: this_Hint_3= ruleHint
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getHintParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Hint_3=ruleHint();

                    state._fsp--;


                    			current = this_Hint_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalYamlGenDsl.g:688:3: this_PermittedValues_4= rulePermittedValues
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getPermittedValuesParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_PermittedValues_4=rulePermittedValues();

                    state._fsp--;


                    			current = this_PermittedValues_4;
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


    // $ANTLR start "entryRuleKey"
    // InternalYamlGenDsl.g:700:1: entryRuleKey returns [EObject current=null] : iv_ruleKey= ruleKey EOF ;
    public final EObject entryRuleKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKey = null;


        try {
            // InternalYamlGenDsl.g:700:44: (iv_ruleKey= ruleKey EOF )
            // InternalYamlGenDsl.g:701:2: iv_ruleKey= ruleKey EOF
            {
             newCompositeNode(grammarAccess.getKeyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKey=ruleKey();

            state._fsp--;

             current =iv_ruleKey; 
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
    // $ANTLR end "entryRuleKey"


    // $ANTLR start "ruleKey"
    // InternalYamlGenDsl.g:707:1: ruleKey returns [EObject current=null] : (otherlv_0= 'key:' ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleKey() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalYamlGenDsl.g:713:2: ( (otherlv_0= 'key:' ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalYamlGenDsl.g:714:2: (otherlv_0= 'key:' ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalYamlGenDsl.g:714:2: (otherlv_0= 'key:' ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalYamlGenDsl.g:715:3: otherlv_0= 'key:' ( (lv_value_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getKeyAccess().getKeyKeyword_0());
            		
            // InternalYamlGenDsl.g:719:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalYamlGenDsl.g:720:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalYamlGenDsl.g:720:4: (lv_value_1_0= RULE_STRING )
            // InternalYamlGenDsl.g:721:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getKeyAccess().getValueSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKeyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
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
    // $ANTLR end "ruleKey"


    // $ANTLR start "entryRuleName"
    // InternalYamlGenDsl.g:741:1: entryRuleName returns [EObject current=null] : iv_ruleName= ruleName EOF ;
    public final EObject entryRuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleName = null;


        try {
            // InternalYamlGenDsl.g:741:45: (iv_ruleName= ruleName EOF )
            // InternalYamlGenDsl.g:742:2: iv_ruleName= ruleName EOF
            {
             newCompositeNode(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleName=ruleName();

            state._fsp--;

             current =iv_ruleName; 
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
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // InternalYamlGenDsl.g:748:1: ruleName returns [EObject current=null] : (otherlv_0= 'name:' ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalYamlGenDsl.g:754:2: ( (otherlv_0= 'name:' ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalYamlGenDsl.g:755:2: (otherlv_0= 'name:' ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalYamlGenDsl.g:755:2: (otherlv_0= 'name:' ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalYamlGenDsl.g:756:3: otherlv_0= 'name:' ( (lv_value_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getNameAccess().getNameKeyword_0());
            		
            // InternalYamlGenDsl.g:760:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalYamlGenDsl.g:761:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalYamlGenDsl.g:761:4: (lv_value_1_0= RULE_STRING )
            // InternalYamlGenDsl.g:762:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getNameAccess().getValueSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
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
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleDefault"
    // InternalYamlGenDsl.g:782:1: entryRuleDefault returns [EObject current=null] : iv_ruleDefault= ruleDefault EOF ;
    public final EObject entryRuleDefault() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefault = null;


        try {
            // InternalYamlGenDsl.g:782:48: (iv_ruleDefault= ruleDefault EOF )
            // InternalYamlGenDsl.g:783:2: iv_ruleDefault= ruleDefault EOF
            {
             newCompositeNode(grammarAccess.getDefaultRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefault=ruleDefault();

            state._fsp--;

             current =iv_ruleDefault; 
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
    // $ANTLR end "entryRuleDefault"


    // $ANTLR start "ruleDefault"
    // InternalYamlGenDsl.g:789:1: ruleDefault returns [EObject current=null] : (otherlv_0= 'default:' ( (lv_value_1_0= ruleValues ) ) ) ;
    public final EObject ruleDefault() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalYamlGenDsl.g:795:2: ( (otherlv_0= 'default:' ( (lv_value_1_0= ruleValues ) ) ) )
            // InternalYamlGenDsl.g:796:2: (otherlv_0= 'default:' ( (lv_value_1_0= ruleValues ) ) )
            {
            // InternalYamlGenDsl.g:796:2: (otherlv_0= 'default:' ( (lv_value_1_0= ruleValues ) ) )
            // InternalYamlGenDsl.g:797:3: otherlv_0= 'default:' ( (lv_value_1_0= ruleValues ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getDefaultAccess().getDefaultKeyword_0());
            		
            // InternalYamlGenDsl.g:801:3: ( (lv_value_1_0= ruleValues ) )
            // InternalYamlGenDsl.g:802:4: (lv_value_1_0= ruleValues )
            {
            // InternalYamlGenDsl.g:802:4: (lv_value_1_0= ruleValues )
            // InternalYamlGenDsl.g:803:5: lv_value_1_0= ruleValues
            {

            					newCompositeNode(grammarAccess.getDefaultAccess().getValueValuesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleValues();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefaultRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
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
    // $ANTLR end "ruleDefault"


    // $ANTLR start "entryRuleHint"
    // InternalYamlGenDsl.g:824:1: entryRuleHint returns [EObject current=null] : iv_ruleHint= ruleHint EOF ;
    public final EObject entryRuleHint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHint = null;


        try {
            // InternalYamlGenDsl.g:824:45: (iv_ruleHint= ruleHint EOF )
            // InternalYamlGenDsl.g:825:2: iv_ruleHint= ruleHint EOF
            {
             newCompositeNode(grammarAccess.getHintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHint=ruleHint();

            state._fsp--;

             current =iv_ruleHint; 
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
    // $ANTLR end "entryRuleHint"


    // $ANTLR start "ruleHint"
    // InternalYamlGenDsl.g:831:1: ruleHint returns [EObject current=null] : (otherlv_0= 'hint:' ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleHint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalYamlGenDsl.g:837:2: ( (otherlv_0= 'hint:' ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalYamlGenDsl.g:838:2: (otherlv_0= 'hint:' ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalYamlGenDsl.g:838:2: (otherlv_0= 'hint:' ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalYamlGenDsl.g:839:3: otherlv_0= 'hint:' ( (lv_value_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getHintAccess().getHintKeyword_0());
            		
            // InternalYamlGenDsl.g:843:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalYamlGenDsl.g:844:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalYamlGenDsl.g:844:4: (lv_value_1_0= RULE_STRING )
            // InternalYamlGenDsl.g:845:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getHintAccess().getValueSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
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
    // $ANTLR end "ruleHint"


    // $ANTLR start "entryRulePermittedValues"
    // InternalYamlGenDsl.g:865:1: entryRulePermittedValues returns [EObject current=null] : iv_rulePermittedValues= rulePermittedValues EOF ;
    public final EObject entryRulePermittedValues() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermittedValues = null;


        try {
            // InternalYamlGenDsl.g:865:56: (iv_rulePermittedValues= rulePermittedValues EOF )
            // InternalYamlGenDsl.g:866:2: iv_rulePermittedValues= rulePermittedValues EOF
            {
             newCompositeNode(grammarAccess.getPermittedValuesRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePermittedValues=rulePermittedValues();

            state._fsp--;

             current =iv_rulePermittedValues; 
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
    // $ANTLR end "entryRulePermittedValues"


    // $ANTLR start "rulePermittedValues"
    // InternalYamlGenDsl.g:872:1: rulePermittedValues returns [EObject current=null] : (otherlv_0= 'values:' ( (lv_value_1_0= ruleValues ) ) ) ;
    public final EObject rulePermittedValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalYamlGenDsl.g:878:2: ( (otherlv_0= 'values:' ( (lv_value_1_0= ruleValues ) ) ) )
            // InternalYamlGenDsl.g:879:2: (otherlv_0= 'values:' ( (lv_value_1_0= ruleValues ) ) )
            {
            // InternalYamlGenDsl.g:879:2: (otherlv_0= 'values:' ( (lv_value_1_0= ruleValues ) ) )
            // InternalYamlGenDsl.g:880:3: otherlv_0= 'values:' ( (lv_value_1_0= ruleValues ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getPermittedValuesAccess().getValuesKeyword_0());
            		
            // InternalYamlGenDsl.g:884:3: ( (lv_value_1_0= ruleValues ) )
            // InternalYamlGenDsl.g:885:4: (lv_value_1_0= ruleValues )
            {
            // InternalYamlGenDsl.g:885:4: (lv_value_1_0= ruleValues )
            // InternalYamlGenDsl.g:886:5: lv_value_1_0= ruleValues
            {

            					newCompositeNode(grammarAccess.getPermittedValuesAccess().getValueValuesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleValues();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPermittedValuesRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
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
    // $ANTLR end "rulePermittedValues"


    // $ANTLR start "entryRuleValues"
    // InternalYamlGenDsl.g:907:1: entryRuleValues returns [EObject current=null] : iv_ruleValues= ruleValues EOF ;
    public final EObject entryRuleValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValues = null;


        try {
            // InternalYamlGenDsl.g:907:47: (iv_ruleValues= ruleValues EOF )
            // InternalYamlGenDsl.g:908:2: iv_ruleValues= ruleValues EOF
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
    // InternalYamlGenDsl.g:914:1: ruleValues returns [EObject current=null] : ( (otherlv_0= '[' ( (lv_values_1_0= ruleValues ) )+ otherlv_2= ']' ) | ( (lv_string_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_string_3_0=null;
        EObject lv_values_1_0 = null;



        	enterRule();

        try {
            // InternalYamlGenDsl.g:920:2: ( ( (otherlv_0= '[' ( (lv_values_1_0= ruleValues ) )+ otherlv_2= ']' ) | ( (lv_string_3_0= RULE_STRING ) ) ) )
            // InternalYamlGenDsl.g:921:2: ( (otherlv_0= '[' ( (lv_values_1_0= ruleValues ) )+ otherlv_2= ']' ) | ( (lv_string_3_0= RULE_STRING ) ) )
            {
            // InternalYamlGenDsl.g:921:2: ( (otherlv_0= '[' ( (lv_values_1_0= ruleValues ) )+ otherlv_2= ']' ) | ( (lv_string_3_0= RULE_STRING ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_STRING) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalYamlGenDsl.g:922:3: (otherlv_0= '[' ( (lv_values_1_0= ruleValues ) )+ otherlv_2= ']' )
                    {
                    // InternalYamlGenDsl.g:922:3: (otherlv_0= '[' ( (lv_values_1_0= ruleValues ) )+ otherlv_2= ']' )
                    // InternalYamlGenDsl.g:923:4: otherlv_0= '[' ( (lv_values_1_0= ruleValues ) )+ otherlv_2= ']'
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_14); 

                    				newLeafNode(otherlv_0, grammarAccess.getValuesAccess().getLeftSquareBracketKeyword_0_0());
                    			
                    // InternalYamlGenDsl.g:927:4: ( (lv_values_1_0= ruleValues ) )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_STRING||LA15_0==26) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalYamlGenDsl.g:928:5: (lv_values_1_0= ruleValues )
                    	    {
                    	    // InternalYamlGenDsl.g:928:5: (lv_values_1_0= ruleValues )
                    	    // InternalYamlGenDsl.g:929:6: lv_values_1_0= ruleValues
                    	    {

                    	    						newCompositeNode(grammarAccess.getValuesAccess().getValuesValuesParserRuleCall_0_1_0());
                    	    					
                    	    pushFollow(FOLLOW_15);
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
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);

                    otherlv_2=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getValuesAccess().getRightSquareBracketKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalYamlGenDsl.g:952:3: ( (lv_string_3_0= RULE_STRING ) )
                    {
                    // InternalYamlGenDsl.g:952:3: ( (lv_string_3_0= RULE_STRING ) )
                    // InternalYamlGenDsl.g:953:4: (lv_string_3_0= RULE_STRING )
                    {
                    // InternalYamlGenDsl.g:953:4: (lv_string_3_0= RULE_STRING )
                    // InternalYamlGenDsl.g:954:5: lv_string_3_0= RULE_STRING
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


    protected DFA7 dfa7 = new DFA7(this);
    static final String dfa_1s = "\6\uffff";
    static final String dfa_2s = "\1\5\1\uffff\1\5\3\uffff";
    static final String dfa_3s = "\1\31\1\uffff\1\24\3\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\2\1\3\1\4";
    static final String dfa_5s = "\6\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\12\uffff\1\1\1\3\2\uffff\1\4\5\5",
            "",
            "\1\2\13\uffff\1\3\2\uffff\1\4",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "351:2: (this_Extend_0= ruleExtend | this_NestedField_1= ruleNestedField | this_NestedFields_2= ruleNestedFields | this_Property_3= ruleProperty )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001862L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001060L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000003F38020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C6000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000086000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000016000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000C000010L});

}