/*
 * generated by Xtext 2.22.0
 */
grammar InternalYamlGenDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package yaml.helper.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleSource
entryRuleSource returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSourceRule()); }
	iv_ruleSource=ruleSource
	{ $current=$iv_ruleSource.current; }
	EOF;

// Rule Source
ruleSource returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getSourceAccess().getEntriesSourceElementParserRuleCall_0());
			}
			lv_entries_0_0=ruleSourceElement
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getSourceRule());
				}
				add(
					$current,
					"entries",
					lv_entries_0_0,
					"yaml.helper.dsl.YamlGenDsl.SourceElement");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleSourceElement
entryRuleSourceElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSourceElementRule()); }
	iv_ruleSourceElement=ruleSourceElement
	{ $current=$iv_ruleSourceElement.current; }
	EOF;

// Rule SourceElement
ruleSourceElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getSourceElementAccess().getFieldParserRuleCall_0());
		}
		this_Field_0=ruleField
		{
			$current = $this_Field_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getSourceElementAccess().getImportParserRuleCall_1());
		}
		this_Import_1=ruleImport
		{
			$current = $this_Import_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleImport
entryRuleImport returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getImportRule()); }
	iv_ruleImport=ruleImport
	{ $current=$iv_ruleImport.current; }
	EOF;

// Rule Import
ruleImport returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='import'
		{
			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
		}
		(
			(
				lv_path_1_0=RULE_STRING
				{
					newLeafNode(lv_path_1_0, grammarAccess.getImportAccess().getPathSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getImportRule());
					}
					setWithLastConsumed(
						$current,
						"path",
						lv_path_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleField
entryRuleField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFieldRule()); }
	iv_ruleField=ruleField
	{ $current=$iv_ruleField.current; }
	EOF;

// Rule Field
ruleField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_help_0_0=RULE_HELP_STRING
				{
					newLeafNode(lv_help_0_0, grammarAccess.getFieldAccess().getHelpHELP_STRINGTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFieldRule());
					}
					addWithLastConsumed(
						$current,
						"help",
						lv_help_0_0,
						"yaml.helper.dsl.YamlGenDsl.HELP_STRING");
				}
			)
		)*
		(
			(
				lv_root_1_0='root'
				{
					newLeafNode(lv_root_1_0, grammarAccess.getFieldAccess().getRootRootKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFieldRule());
					}
					setWithLastConsumed($current, "root", lv_root_1_0 != null, "root");
				}
			)
		)?
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFieldRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_3='extends'
			{
				newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getExtendsKeyword_3_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getFieldRule());
						}
					}
					otherlv_4=RULE_ID
					{
						newLeafNode(otherlv_4, grammarAccess.getFieldAccess().getSuperFieldFieldCrossReference_3_1_0());
					}
				)
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getFieldAccess().getBodyBodyParserRuleCall_4_0());
				}
				lv_body_5_0=ruleBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFieldRule());
					}
					set(
						$current,
						"body",
						lv_body_5_0,
						"yaml.helper.dsl.YamlGenDsl.Body");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleBody
entryRuleBody returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBodyRule()); }
	iv_ruleBody=ruleBody
	{ $current=$iv_ruleBody.current; }
	EOF;

// Rule Body
ruleBody returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getBodyAccess().getBodyAction_0(),
					$current);
			}
		)
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getBodyAccess().getElementsBodyElementParserRuleCall_2_0());
				}
				lv_elements_2_0=ruleBodyElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBodyRule());
					}
					add(
						$current,
						"elements",
						lv_elements_2_0,
						"yaml.helper.dsl.YamlGenDsl.BodyElement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleBodyElement
entryRuleBodyElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBodyElementRule()); }
	iv_ruleBodyElement=ruleBodyElement
	{ $current=$iv_ruleBodyElement.current; }
	EOF;

// Rule BodyElement
ruleBodyElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getBodyElementAccess().getExtendParserRuleCall_0());
		}
		this_Extend_0=ruleExtend
		{
			$current = $this_Extend_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getBodyElementAccess().getNestedFieldParserRuleCall_1());
		}
		this_NestedField_1=ruleNestedField
		{
			$current = $this_NestedField_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getBodyElementAccess().getNestedFieldsParserRuleCall_2());
		}
		this_NestedFields_2=ruleNestedFields
		{
			$current = $this_NestedFields_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getBodyElementAccess().getPropertyParserRuleCall_3());
		}
		this_Property_3=ruleProperty
		{
			$current = $this_Property_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleExtend
entryRuleExtend returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExtendRule()); }
	iv_ruleExtend=ruleExtend
	{ $current=$iv_ruleExtend.current; }
	EOF;

// Rule Extend
ruleExtend returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='extend'
		{
			newLeafNode(otherlv_0, grammarAccess.getExtendAccess().getExtendKeyword_0());
		}
		(
			(
				lv_name_property_1_0=RULE_STRING
				{
					newLeafNode(lv_name_property_1_0, grammarAccess.getExtendAccess().getName_propertySTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExtendRule());
					}
					setWithLastConsumed(
						$current,
						"name_property",
						lv_name_property_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getExtendAccess().getBodyBodyParserRuleCall_2_0());
				}
				lv_body_2_0=ruleBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExtendRule());
					}
					set(
						$current,
						"body",
						lv_body_2_0,
						"yaml.helper.dsl.YamlGenDsl.Body");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleNestedField
entryRuleNestedField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNestedFieldRule()); }
	iv_ruleNestedField=ruleNestedField
	{ $current=$iv_ruleNestedField.current; }
	EOF;

// Rule NestedField
ruleNestedField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_help_0_0=RULE_HELP_STRING
				{
					newLeafNode(lv_help_0_0, grammarAccess.getNestedFieldAccess().getHelpHELP_STRINGTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNestedFieldRule());
					}
					addWithLastConsumed(
						$current,
						"help",
						lv_help_0_0,
						"yaml.helper.dsl.YamlGenDsl.HELP_STRING");
				}
			)
		)*
		otherlv_1='field'
		{
			newLeafNode(otherlv_1, grammarAccess.getNestedFieldAccess().getFieldKeyword_1());
		}
		(
			(
				lv_mandatory_2_0='mandatory'
				{
					newLeafNode(lv_mandatory_2_0, grammarAccess.getNestedFieldAccess().getMandatoryMandatoryKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNestedFieldRule());
					}
					setWithLastConsumed($current, "mandatory", lv_mandatory_2_0 != null, "mandatory");
				}
			)
		)?
		(
			(
				lv_default_3_0='default'
				{
					newLeafNode(lv_default_3_0, grammarAccess.getNestedFieldAccess().getDefaultDefaultKeyword_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNestedFieldRule());
					}
					setWithLastConsumed($current, "default", lv_default_3_0 != null, "default");
				}
			)
		)?
		(
			otherlv_4='extends'
			{
				newLeafNode(otherlv_4, grammarAccess.getNestedFieldAccess().getExtendsKeyword_4_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNestedFieldRule());
						}
					}
					otherlv_5=RULE_ID
					{
						newLeafNode(otherlv_5, grammarAccess.getNestedFieldAccess().getSuperFieldFieldCrossReference_4_1_0());
					}
				)
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getNestedFieldAccess().getBodyBodyParserRuleCall_5_0());
				}
				lv_body_6_0=ruleBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNestedFieldRule());
					}
					set(
						$current,
						"body",
						lv_body_6_0,
						"yaml.helper.dsl.YamlGenDsl.Body");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleNestedFields
entryRuleNestedFields returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNestedFieldsRule()); }
	iv_ruleNestedFields=ruleNestedFields
	{ $current=$iv_ruleNestedFields.current; }
	EOF;

// Rule NestedFields
ruleNestedFields returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_help_0_0=RULE_HELP_STRING
				{
					newLeafNode(lv_help_0_0, grammarAccess.getNestedFieldsAccess().getHelpHELP_STRINGTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNestedFieldsRule());
					}
					addWithLastConsumed(
						$current,
						"help",
						lv_help_0_0,
						"yaml.helper.dsl.YamlGenDsl.HELP_STRING");
				}
			)
		)*
		otherlv_1='fields'
		{
			newLeafNode(otherlv_1, grammarAccess.getNestedFieldsAccess().getFieldsKeyword_1());
		}
		(
			otherlv_2='extend'
			{
				newLeafNode(otherlv_2, grammarAccess.getNestedFieldsAccess().getExtendKeyword_2_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNestedFieldsRule());
						}
					}
					otherlv_3=RULE_ID
					{
						newLeafNode(otherlv_3, grammarAccess.getNestedFieldsAccess().getSuperFieldFieldCrossReference_2_1_0());
					}
				)
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getNestedFieldsAccess().getBodyBodyParserRuleCall_3_0());
				}
				lv_body_4_0=ruleBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNestedFieldsRule());
					}
					set(
						$current,
						"body",
						lv_body_4_0,
						"yaml.helper.dsl.YamlGenDsl.Body");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleProperty
entryRuleProperty returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPropertyRule()); }
	iv_ruleProperty=ruleProperty
	{ $current=$iv_ruleProperty.current; }
	EOF;

// Rule Property
ruleProperty returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPropertyAccess().getNameParserRuleCall_0());
		}
		this_Name_0=ruleName
		{
			$current = $this_Name_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPropertyAccess().getKeyParserRuleCall_1());
		}
		this_Key_1=ruleKey
		{
			$current = $this_Key_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPropertyAccess().getDefaultParserRuleCall_2());
		}
		this_Default_2=ruleDefault
		{
			$current = $this_Default_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPropertyAccess().getHintParserRuleCall_3());
		}
		this_Hint_3=ruleHint
		{
			$current = $this_Hint_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPropertyAccess().getPermittedValuesParserRuleCall_4());
		}
		this_PermittedValues_4=rulePermittedValues
		{
			$current = $this_PermittedValues_4.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleKey
entryRuleKey returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getKeyRule()); }
	iv_ruleKey=ruleKey
	{ $current=$iv_ruleKey.current; }
	EOF;

// Rule Key
ruleKey returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='key:'
		{
			newLeafNode(otherlv_0, grammarAccess.getKeyAccess().getKeyKeyword_0());
		}
		(
			(
				lv_value_1_0=RULE_STRING
				{
					newLeafNode(lv_value_1_0, grammarAccess.getKeyAccess().getValueSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getKeyRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleName
entryRuleName returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNameRule()); }
	iv_ruleName=ruleName
	{ $current=$iv_ruleName.current; }
	EOF;

// Rule Name
ruleName returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='name:'
		{
			newLeafNode(otherlv_0, grammarAccess.getNameAccess().getNameKeyword_0());
		}
		(
			(
				lv_value_1_0=RULE_STRING
				{
					newLeafNode(lv_value_1_0, grammarAccess.getNameAccess().getValueSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNameRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleDefault
entryRuleDefault returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDefaultRule()); }
	iv_ruleDefault=ruleDefault
	{ $current=$iv_ruleDefault.current; }
	EOF;

// Rule Default
ruleDefault returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='default:'
		{
			newLeafNode(otherlv_0, grammarAccess.getDefaultAccess().getDefaultKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDefaultAccess().getValueValuesParserRuleCall_1_0());
				}
				lv_value_1_0=ruleValues
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDefaultRule());
					}
					set(
						$current,
						"value",
						lv_value_1_0,
						"yaml.helper.dsl.YamlGenDsl.Values");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleHint
entryRuleHint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHintRule()); }
	iv_ruleHint=ruleHint
	{ $current=$iv_ruleHint.current; }
	EOF;

// Rule Hint
ruleHint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='hint:'
		{
			newLeafNode(otherlv_0, grammarAccess.getHintAccess().getHintKeyword_0());
		}
		(
			(
				lv_value_1_0=RULE_STRING
				{
					newLeafNode(lv_value_1_0, grammarAccess.getHintAccess().getValueSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getHintRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRulePermittedValues
entryRulePermittedValues returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPermittedValuesRule()); }
	iv_rulePermittedValues=rulePermittedValues
	{ $current=$iv_rulePermittedValues.current; }
	EOF;

// Rule PermittedValues
rulePermittedValues returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='values:'
		{
			newLeafNode(otherlv_0, grammarAccess.getPermittedValuesAccess().getValuesKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPermittedValuesAccess().getValueValuesParserRuleCall_1_0());
				}
				lv_value_1_0=ruleValues
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPermittedValuesRule());
					}
					set(
						$current,
						"value",
						lv_value_1_0,
						"yaml.helper.dsl.YamlGenDsl.Values");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleValues
entryRuleValues returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getValuesRule()); }
	iv_ruleValues=ruleValues
	{ $current=$iv_ruleValues.current; }
	EOF;

// Rule Values
ruleValues returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='['
			{
				newLeafNode(otherlv_0, grammarAccess.getValuesAccess().getLeftSquareBracketKeyword_0_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getValuesAccess().getValuesValuesParserRuleCall_0_1_0());
					}
					lv_values_1_0=ruleValues
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getValuesRule());
						}
						add(
							$current,
							"values",
							lv_values_1_0,
							"yaml.helper.dsl.YamlGenDsl.Values");
						afterParserOrEnumRuleCall();
					}
				)
			)+
			otherlv_2=']'
			{
				newLeafNode(otherlv_2, grammarAccess.getValuesAccess().getRightSquareBracketKeyword_0_2());
			}
		)
		    |
		(
			(
				lv_string_3_0=RULE_STRING
				{
					newLeafNode(lv_string_3_0, grammarAccess.getValuesAccess().getStringSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getValuesRule());
					}
					setWithLastConsumed(
						$current,
						"string",
						lv_string_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

RULE_HELP_STRING : '@' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
