/*
 * generated by Xtext 2.22.0
 */
grammar InternalYamlGenDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package yaml.helper.dsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleSource
entryRuleSource
:
{ before(grammarAccess.getSourceRule()); }
	 ruleSource
{ after(grammarAccess.getSourceRule()); } 
	 EOF 
;

// Rule Source
ruleSource 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSourceAccess().getEntriesAssignment()); }
		(rule__Source__EntriesAssignment)*
		{ after(grammarAccess.getSourceAccess().getEntriesAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSourceElement
entryRuleSourceElement
:
{ before(grammarAccess.getSourceElementRule()); }
	 ruleSourceElement
{ after(grammarAccess.getSourceElementRule()); } 
	 EOF 
;

// Rule SourceElement
ruleSourceElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSourceElementAccess().getAlternatives()); }
		(rule__SourceElement__Alternatives)
		{ after(grammarAccess.getSourceElementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleImport
entryRuleImport
:
{ before(grammarAccess.getImportRule()); }
	 ruleImport
{ after(grammarAccess.getImportRule()); } 
	 EOF 
;

// Rule Import
ruleImport 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getImportAccess().getGroup()); }
		(rule__Import__Group__0)
		{ after(grammarAccess.getImportAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleField
entryRuleField
:
{ before(grammarAccess.getFieldRule()); }
	 ruleField
{ after(grammarAccess.getFieldRule()); } 
	 EOF 
;

// Rule Field
ruleField 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFieldAccess().getGroup()); }
		(rule__Field__Group__0)
		{ after(grammarAccess.getFieldAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBody
entryRuleBody
:
{ before(grammarAccess.getBodyRule()); }
	 ruleBody
{ after(grammarAccess.getBodyRule()); } 
	 EOF 
;

// Rule Body
ruleBody 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBodyAccess().getGroup()); }
		(rule__Body__Group__0)
		{ after(grammarAccess.getBodyAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBodyElement
entryRuleBodyElement
:
{ before(grammarAccess.getBodyElementRule()); }
	 ruleBodyElement
{ after(grammarAccess.getBodyElementRule()); } 
	 EOF 
;

// Rule BodyElement
ruleBodyElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBodyElementAccess().getAlternatives()); }
		(rule__BodyElement__Alternatives)
		{ after(grammarAccess.getBodyElementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExtend
entryRuleExtend
:
{ before(grammarAccess.getExtendRule()); }
	 ruleExtend
{ after(grammarAccess.getExtendRule()); } 
	 EOF 
;

// Rule Extend
ruleExtend 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExtendAccess().getGroup()); }
		(rule__Extend__Group__0)
		{ after(grammarAccess.getExtendAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNestedField
entryRuleNestedField
:
{ before(grammarAccess.getNestedFieldRule()); }
	 ruleNestedField
{ after(grammarAccess.getNestedFieldRule()); } 
	 EOF 
;

// Rule NestedField
ruleNestedField 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNestedFieldAccess().getGroup()); }
		(rule__NestedField__Group__0)
		{ after(grammarAccess.getNestedFieldAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNestedFields
entryRuleNestedFields
:
{ before(grammarAccess.getNestedFieldsRule()); }
	 ruleNestedFields
{ after(grammarAccess.getNestedFieldsRule()); } 
	 EOF 
;

// Rule NestedFields
ruleNestedFields 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNestedFieldsAccess().getGroup()); }
		(rule__NestedFields__Group__0)
		{ after(grammarAccess.getNestedFieldsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleProperty
entryRuleProperty
:
{ before(grammarAccess.getPropertyRule()); }
	 ruleProperty
{ after(grammarAccess.getPropertyRule()); } 
	 EOF 
;

// Rule Property
ruleProperty 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPropertyAccess().getAlternatives()); }
		(rule__Property__Alternatives)
		{ after(grammarAccess.getPropertyAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleName
entryRuleName
:
{ before(grammarAccess.getNameRule()); }
	 ruleName
{ after(grammarAccess.getNameRule()); } 
	 EOF 
;

// Rule Name
ruleName 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNameAccess().getGroup()); }
		(rule__Name__Group__0)
		{ after(grammarAccess.getNameAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDefault
entryRuleDefault
:
{ before(grammarAccess.getDefaultRule()); }
	 ruleDefault
{ after(grammarAccess.getDefaultRule()); } 
	 EOF 
;

// Rule Default
ruleDefault 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDefaultAccess().getGroup()); }
		(rule__Default__Group__0)
		{ after(grammarAccess.getDefaultAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleHint
entryRuleHint
:
{ before(grammarAccess.getHintRule()); }
	 ruleHint
{ after(grammarAccess.getHintRule()); } 
	 EOF 
;

// Rule Hint
ruleHint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getHintAccess().getGroup()); }
		(rule__Hint__Group__0)
		{ after(grammarAccess.getHintAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePermittedValues
entryRulePermittedValues
:
{ before(grammarAccess.getPermittedValuesRule()); }
	 rulePermittedValues
{ after(grammarAccess.getPermittedValuesRule()); } 
	 EOF 
;

// Rule PermittedValues
rulePermittedValues 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPermittedValuesAccess().getGroup()); }
		(rule__PermittedValues__Group__0)
		{ after(grammarAccess.getPermittedValuesAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleValues
entryRuleValues
:
{ before(grammarAccess.getValuesRule()); }
	 ruleValues
{ after(grammarAccess.getValuesRule()); } 
	 EOF 
;

// Rule Values
ruleValues 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getValuesAccess().getAlternatives()); }
		(rule__Values__Alternatives)
		{ after(grammarAccess.getValuesAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SourceElement__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSourceElementAccess().getFieldParserRuleCall_0()); }
		ruleField
		{ after(grammarAccess.getSourceElementAccess().getFieldParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getSourceElementAccess().getImportParserRuleCall_1()); }
		ruleImport
		{ after(grammarAccess.getSourceElementAccess().getImportParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BodyElement__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBodyElementAccess().getExtendParserRuleCall_0()); }
		ruleExtend
		{ after(grammarAccess.getBodyElementAccess().getExtendParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getBodyElementAccess().getNestedFieldParserRuleCall_1()); }
		ruleNestedField
		{ after(grammarAccess.getBodyElementAccess().getNestedFieldParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getBodyElementAccess().getNestedFieldsParserRuleCall_2()); }
		ruleNestedFields
		{ after(grammarAccess.getBodyElementAccess().getNestedFieldsParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getBodyElementAccess().getPropertyParserRuleCall_3()); }
		ruleProperty
		{ after(grammarAccess.getBodyElementAccess().getPropertyParserRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyAccess().getNameParserRuleCall_0()); }
		ruleName
		{ after(grammarAccess.getPropertyAccess().getNameParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyAccess().getDefaultParserRuleCall_1()); }
		ruleDefault
		{ after(grammarAccess.getPropertyAccess().getDefaultParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyAccess().getHintParserRuleCall_2()); }
		ruleHint
		{ after(grammarAccess.getPropertyAccess().getHintParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyAccess().getPermittedValuesParserRuleCall_3()); }
		rulePermittedValues
		{ after(grammarAccess.getPropertyAccess().getPermittedValuesParserRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Values__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getValuesAccess().getGroup_0()); }
		(rule__Values__Group_0__0)
		{ after(grammarAccess.getValuesAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getValuesAccess().getValuesAssignment_1()); }
		(rule__Values__ValuesAssignment_1)
		{ after(grammarAccess.getValuesAccess().getValuesAssignment_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Import__Group__0__Impl
	rule__Import__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImportAccess().getImportKeyword_0()); }
	'import'
	{ after(grammarAccess.getImportAccess().getImportKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Import__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImportAccess().getPathAssignment_1()); }
	(rule__Import__PathAssignment_1)
	{ after(grammarAccess.getImportAccess().getPathAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Field__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Field__Group__0__Impl
	rule__Field__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFieldAccess().getHelpAssignment_0()); }
	(rule__Field__HelpAssignment_0)*
	{ after(grammarAccess.getFieldAccess().getHelpAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Field__Group__1__Impl
	rule__Field__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFieldAccess().getRootAssignment_1()); }
	(rule__Field__RootAssignment_1)?
	{ after(grammarAccess.getFieldAccess().getRootAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Field__Group__2__Impl
	rule__Field__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFieldAccess().getNameAssignment_2()); }
	(rule__Field__NameAssignment_2)
	{ after(grammarAccess.getFieldAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Field__Group__3__Impl
	rule__Field__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFieldAccess().getGroup_3()); }
	(rule__Field__Group_3__0)?
	{ after(grammarAccess.getFieldAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Field__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFieldAccess().getBodyAssignment_4()); }
	(rule__Field__BodyAssignment_4)
	{ after(grammarAccess.getFieldAccess().getBodyAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Field__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Field__Group_3__0__Impl
	rule__Field__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFieldAccess().getExtendsKeyword_3_0()); }
	'extends'
	{ after(grammarAccess.getFieldAccess().getExtendsKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Field__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFieldAccess().getSuperFieldAssignment_3_1()); }
	(rule__Field__SuperFieldAssignment_3_1)
	{ after(grammarAccess.getFieldAccess().getSuperFieldAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Body__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Body__Group__0__Impl
	rule__Body__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Body__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBodyAccess().getBodyAction_0()); }
	()
	{ after(grammarAccess.getBodyAccess().getBodyAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Body__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Body__Group__1__Impl
	rule__Body__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Body__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Body__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Body__Group__2__Impl
	rule__Body__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Body__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBodyAccess().getElementsAssignment_2()); }
	(rule__Body__ElementsAssignment_2)*
	{ after(grammarAccess.getBodyAccess().getElementsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Body__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Body__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Body__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Extend__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Extend__Group__0__Impl
	rule__Extend__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Extend__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExtendAccess().getExtendKeyword_0()); }
	'extend'
	{ after(grammarAccess.getExtendAccess().getExtendKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Extend__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Extend__Group__1__Impl
	rule__Extend__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Extend__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExtendAccess().getSTRINGTerminalRuleCall_1()); }
	RULE_STRING
	{ after(grammarAccess.getExtendAccess().getSTRINGTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Extend__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Extend__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Extend__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExtendAccess().getBodyParserRuleCall_2()); }
	ruleBody
	{ after(grammarAccess.getExtendAccess().getBodyParserRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NestedField__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedField__Group__0__Impl
	rule__NestedField__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedField__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedFieldAccess().getHelpAssignment_0()); }
	(rule__NestedField__HelpAssignment_0)*
	{ after(grammarAccess.getNestedFieldAccess().getHelpAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedField__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedField__Group__1__Impl
	rule__NestedField__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedField__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedFieldAccess().getFieldKeyword_1()); }
	'field'
	{ after(grammarAccess.getNestedFieldAccess().getFieldKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedField__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedField__Group__2__Impl
	rule__NestedField__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedField__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedFieldAccess().getMandatoryAssignment_2()); }
	(rule__NestedField__MandatoryAssignment_2)?
	{ after(grammarAccess.getNestedFieldAccess().getMandatoryAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedField__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedField__Group__3__Impl
	rule__NestedField__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedField__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedFieldAccess().getGroup_3()); }
	(rule__NestedField__Group_3__0)?
	{ after(grammarAccess.getNestedFieldAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedField__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedField__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedField__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedFieldAccess().getBodyAssignment_4()); }
	(rule__NestedField__BodyAssignment_4)
	{ after(grammarAccess.getNestedFieldAccess().getBodyAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NestedField__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedField__Group_3__0__Impl
	rule__NestedField__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedField__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedFieldAccess().getExtendsKeyword_3_0()); }
	'extends'
	{ after(grammarAccess.getNestedFieldAccess().getExtendsKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedField__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedField__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedField__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedFieldAccess().getFieldAssignment_3_1()); }
	(rule__NestedField__FieldAssignment_3_1)
	{ after(grammarAccess.getNestedFieldAccess().getFieldAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NestedFields__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedFields__Group__0__Impl
	rule__NestedFields__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedFields__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedFieldsAccess().getHelpAssignment_0()); }
	(rule__NestedFields__HelpAssignment_0)*
	{ after(grammarAccess.getNestedFieldsAccess().getHelpAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedFields__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedFields__Group__1__Impl
	rule__NestedFields__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedFields__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedFieldsAccess().getFieldsKeyword_1()); }
	'fields'
	{ after(grammarAccess.getNestedFieldsAccess().getFieldsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedFields__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedFields__Group__2__Impl
	rule__NestedFields__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedFields__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedFieldsAccess().getMandatoryAssignment_2()); }
	(rule__NestedFields__MandatoryAssignment_2)?
	{ after(grammarAccess.getNestedFieldsAccess().getMandatoryAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedFields__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedFields__Group__3__Impl
	rule__NestedFields__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedFields__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedFieldsAccess().getGroup_3()); }
	(rule__NestedFields__Group_3__0)?
	{ after(grammarAccess.getNestedFieldsAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedFields__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedFields__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedFields__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedFieldsAccess().getBodyAssignment_4()); }
	(rule__NestedFields__BodyAssignment_4)
	{ after(grammarAccess.getNestedFieldsAccess().getBodyAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NestedFields__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedFields__Group_3__0__Impl
	rule__NestedFields__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedFields__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedFieldsAccess().getExtendsKeyword_3_0()); }
	'extends'
	{ after(grammarAccess.getNestedFieldsAccess().getExtendsKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedFields__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedFields__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedFields__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedFieldsAccess().getFieldAssignment_3_1()); }
	(rule__NestedFields__FieldAssignment_3_1)
	{ after(grammarAccess.getNestedFieldsAccess().getFieldAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Name__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Name__Group__0__Impl
	rule__Name__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Name__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNameAccess().getNameKeyword_0()); }
	'name:'
	{ after(grammarAccess.getNameAccess().getNameKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Name__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Name__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Name__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNameAccess().getValueAssignment_1()); }
	(rule__Name__ValueAssignment_1)
	{ after(grammarAccess.getNameAccess().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Default__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Default__Group__0__Impl
	rule__Default__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Default__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefaultAccess().getDefaultKeyword_0()); }
	'default:'
	{ after(grammarAccess.getDefaultAccess().getDefaultKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Default__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Default__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Default__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefaultAccess().getValueAssignment_1()); }
	(rule__Default__ValueAssignment_1)
	{ after(grammarAccess.getDefaultAccess().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Hint__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Hint__Group__0__Impl
	rule__Hint__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Hint__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHintAccess().getHintKeyword_0()); }
	'hint:'
	{ after(grammarAccess.getHintAccess().getHintKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Hint__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Hint__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Hint__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHintAccess().getValueAssignment_1()); }
	(rule__Hint__ValueAssignment_1)
	{ after(grammarAccess.getHintAccess().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PermittedValues__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PermittedValues__Group__0__Impl
	rule__PermittedValues__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PermittedValues__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPermittedValuesAccess().getValuesKeyword_0()); }
	'values:'
	{ after(grammarAccess.getPermittedValuesAccess().getValuesKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PermittedValues__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PermittedValues__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PermittedValues__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPermittedValuesAccess().getValueAssignment_1()); }
	(rule__PermittedValues__ValueAssignment_1)
	{ after(grammarAccess.getPermittedValuesAccess().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Values__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Values__Group_0__0__Impl
	rule__Values__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Values__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getValuesAccess().getLeftSquareBracketKeyword_0_0()); }
	'['
	{ after(grammarAccess.getValuesAccess().getLeftSquareBracketKeyword_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Values__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Values__Group_0__1__Impl
	rule__Values__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Values__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getValuesAccess().getValuesAssignment_0_1()); }
		(rule__Values__ValuesAssignment_0_1)
		{ after(grammarAccess.getValuesAccess().getValuesAssignment_0_1()); }
	)
	(
		{ before(grammarAccess.getValuesAccess().getValuesAssignment_0_1()); }
		(rule__Values__ValuesAssignment_0_1)*
		{ after(grammarAccess.getValuesAccess().getValuesAssignment_0_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Values__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Values__Group_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Values__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getValuesAccess().getRightSquareBracketKeyword_0_2()); }
	']'
	{ after(grammarAccess.getValuesAccess().getRightSquareBracketKeyword_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Source__EntriesAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSourceAccess().getEntriesSourceElementParserRuleCall_0()); }
		ruleSourceElement
		{ after(grammarAccess.getSourceAccess().getEntriesSourceElementParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__PathAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImportAccess().getPathSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getImportAccess().getPathSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__HelpAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFieldAccess().getHelpSL_COMMENTTerminalRuleCall_0_0()); }
		RULE_SL_COMMENT
		{ after(grammarAccess.getFieldAccess().getHelpSL_COMMENTTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__RootAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFieldAccess().getRootRootKeyword_1_0()); }
		(
			{ before(grammarAccess.getFieldAccess().getRootRootKeyword_1_0()); }
			'root'
			{ after(grammarAccess.getFieldAccess().getRootRootKeyword_1_0()); }
		)
		{ after(grammarAccess.getFieldAccess().getRootRootKeyword_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__SuperFieldAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFieldAccess().getSuperFieldFieldCrossReference_3_1_0()); }
		(
			{ before(grammarAccess.getFieldAccess().getSuperFieldFieldIDTerminalRuleCall_3_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getFieldAccess().getSuperFieldFieldIDTerminalRuleCall_3_1_0_1()); }
		)
		{ after(grammarAccess.getFieldAccess().getSuperFieldFieldCrossReference_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__BodyAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFieldAccess().getBodyBodyParserRuleCall_4_0()); }
		ruleBody
		{ after(grammarAccess.getFieldAccess().getBodyBodyParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Body__ElementsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBodyAccess().getElementsBodyElementParserRuleCall_2_0()); }
		ruleBodyElement
		{ after(grammarAccess.getBodyAccess().getElementsBodyElementParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedField__HelpAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNestedFieldAccess().getHelpSL_COMMENTTerminalRuleCall_0_0()); }
		RULE_SL_COMMENT
		{ after(grammarAccess.getNestedFieldAccess().getHelpSL_COMMENTTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedField__MandatoryAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNestedFieldAccess().getMandatoryMandatoryKeyword_2_0()); }
		(
			{ before(grammarAccess.getNestedFieldAccess().getMandatoryMandatoryKeyword_2_0()); }
			'mandatory'
			{ after(grammarAccess.getNestedFieldAccess().getMandatoryMandatoryKeyword_2_0()); }
		)
		{ after(grammarAccess.getNestedFieldAccess().getMandatoryMandatoryKeyword_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedField__FieldAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNestedFieldAccess().getFieldFieldCrossReference_3_1_0()); }
		(
			{ before(grammarAccess.getNestedFieldAccess().getFieldFieldIDTerminalRuleCall_3_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getNestedFieldAccess().getFieldFieldIDTerminalRuleCall_3_1_0_1()); }
		)
		{ after(grammarAccess.getNestedFieldAccess().getFieldFieldCrossReference_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedField__BodyAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNestedFieldAccess().getBodyBodyParserRuleCall_4_0()); }
		ruleBody
		{ after(grammarAccess.getNestedFieldAccess().getBodyBodyParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedFields__HelpAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNestedFieldsAccess().getHelpSL_COMMENTTerminalRuleCall_0_0()); }
		RULE_SL_COMMENT
		{ after(grammarAccess.getNestedFieldsAccess().getHelpSL_COMMENTTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedFields__MandatoryAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNestedFieldsAccess().getMandatoryMandatoryKeyword_2_0()); }
		(
			{ before(grammarAccess.getNestedFieldsAccess().getMandatoryMandatoryKeyword_2_0()); }
			'mandatory'
			{ after(grammarAccess.getNestedFieldsAccess().getMandatoryMandatoryKeyword_2_0()); }
		)
		{ after(grammarAccess.getNestedFieldsAccess().getMandatoryMandatoryKeyword_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedFields__FieldAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNestedFieldsAccess().getFieldFieldCrossReference_3_1_0()); }
		(
			{ before(grammarAccess.getNestedFieldsAccess().getFieldFieldIDTerminalRuleCall_3_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getNestedFieldsAccess().getFieldFieldIDTerminalRuleCall_3_1_0_1()); }
		)
		{ after(grammarAccess.getNestedFieldsAccess().getFieldFieldCrossReference_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedFields__BodyAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNestedFieldsAccess().getBodyBodyParserRuleCall_4_0()); }
		ruleBody
		{ after(grammarAccess.getNestedFieldsAccess().getBodyBodyParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Name__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNameAccess().getValueSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getNameAccess().getValueSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Default__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefaultAccess().getValueValuesParserRuleCall_1_0()); }
		ruleValues
		{ after(grammarAccess.getDefaultAccess().getValueValuesParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Hint__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHintAccess().getValueSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getHintAccess().getValueSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PermittedValues__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPermittedValuesAccess().getValueValuesParserRuleCall_1_0()); }
		ruleValues
		{ after(grammarAccess.getPermittedValuesAccess().getValueValuesParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Values__ValuesAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getValuesAccess().getValuesSTRINGTerminalRuleCall_0_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getValuesAccess().getValuesSTRINGTerminalRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Values__ValuesAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getValuesAccess().getValuesSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getValuesAccess().getValuesSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;