/*
 * generated by Xtext 2.22.0
 */
package yaml.helper.dsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import yaml.helper.dsl.ide.contentassist.antlr.internal.InternalYamlGenDslParser;
import yaml.helper.dsl.services.YamlGenDslGrammarAccess;

public class YamlGenDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(YamlGenDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, YamlGenDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getSourceElementAccess().getAlternatives(), "rule__SourceElement__Alternatives");
			builder.put(grammarAccess.getBodyElementAccess().getAlternatives(), "rule__BodyElement__Alternatives");
			builder.put(grammarAccess.getPropertyAccess().getAlternatives(), "rule__Property__Alternatives");
			builder.put(grammarAccess.getValuesAccess().getAlternatives(), "rule__Values__Alternatives");
			builder.put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
			builder.put(grammarAccess.getFieldAccess().getGroup(), "rule__Field__Group__0");
			builder.put(grammarAccess.getFieldAccess().getGroup_3(), "rule__Field__Group_3__0");
			builder.put(grammarAccess.getBodyAccess().getGroup(), "rule__Body__Group__0");
			builder.put(grammarAccess.getExtendAccess().getGroup(), "rule__Extend__Group__0");
			builder.put(grammarAccess.getNestedFieldAccess().getGroup(), "rule__NestedField__Group__0");
			builder.put(grammarAccess.getNestedFieldAccess().getGroup_3(), "rule__NestedField__Group_3__0");
			builder.put(grammarAccess.getNestedFieldsAccess().getGroup(), "rule__NestedFields__Group__0");
			builder.put(grammarAccess.getNestedFieldsAccess().getGroup_3(), "rule__NestedFields__Group_3__0");
			builder.put(grammarAccess.getNameAccess().getGroup(), "rule__Name__Group__0");
			builder.put(grammarAccess.getDefaultAccess().getGroup(), "rule__Default__Group__0");
			builder.put(grammarAccess.getHintAccess().getGroup(), "rule__Hint__Group__0");
			builder.put(grammarAccess.getPermittedValuesAccess().getGroup(), "rule__PermittedValues__Group__0");
			builder.put(grammarAccess.getValuesAccess().getGroup_0(), "rule__Values__Group_0__0");
			builder.put(grammarAccess.getSourceAccess().getEntriesAssignment(), "rule__Source__EntriesAssignment");
			builder.put(grammarAccess.getImportAccess().getPathAssignment_1(), "rule__Import__PathAssignment_1");
			builder.put(grammarAccess.getFieldAccess().getHelpAssignment_0(), "rule__Field__HelpAssignment_0");
			builder.put(grammarAccess.getFieldAccess().getRootAssignment_1(), "rule__Field__RootAssignment_1");
			builder.put(grammarAccess.getFieldAccess().getNameAssignment_2(), "rule__Field__NameAssignment_2");
			builder.put(grammarAccess.getFieldAccess().getSuperFieldAssignment_3_1(), "rule__Field__SuperFieldAssignment_3_1");
			builder.put(grammarAccess.getFieldAccess().getBodyAssignment_4(), "rule__Field__BodyAssignment_4");
			builder.put(grammarAccess.getBodyAccess().getElementsAssignment_2(), "rule__Body__ElementsAssignment_2");
			builder.put(grammarAccess.getNestedFieldAccess().getHelpAssignment_0(), "rule__NestedField__HelpAssignment_0");
			builder.put(grammarAccess.getNestedFieldAccess().getMandatoryAssignment_2(), "rule__NestedField__MandatoryAssignment_2");
			builder.put(grammarAccess.getNestedFieldAccess().getFieldAssignment_3_1(), "rule__NestedField__FieldAssignment_3_1");
			builder.put(grammarAccess.getNestedFieldAccess().getBodyAssignment_4(), "rule__NestedField__BodyAssignment_4");
			builder.put(grammarAccess.getNestedFieldsAccess().getHelpAssignment_0(), "rule__NestedFields__HelpAssignment_0");
			builder.put(grammarAccess.getNestedFieldsAccess().getMandatoryAssignment_2(), "rule__NestedFields__MandatoryAssignment_2");
			builder.put(grammarAccess.getNestedFieldsAccess().getFieldAssignment_3_1(), "rule__NestedFields__FieldAssignment_3_1");
			builder.put(grammarAccess.getNestedFieldsAccess().getBodyAssignment_4(), "rule__NestedFields__BodyAssignment_4");
			builder.put(grammarAccess.getNameAccess().getValueAssignment_1(), "rule__Name__ValueAssignment_1");
			builder.put(grammarAccess.getDefaultAccess().getValueAssignment_1(), "rule__Default__ValueAssignment_1");
			builder.put(grammarAccess.getHintAccess().getValueAssignment_1(), "rule__Hint__ValueAssignment_1");
			builder.put(grammarAccess.getPermittedValuesAccess().getValueAssignment_1(), "rule__PermittedValues__ValueAssignment_1");
			builder.put(grammarAccess.getValuesAccess().getValuesAssignment_0_1(), "rule__Values__ValuesAssignment_0_1");
			builder.put(grammarAccess.getValuesAccess().getValuesAssignment_1(), "rule__Values__ValuesAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private YamlGenDslGrammarAccess grammarAccess;

	@Override
	protected InternalYamlGenDslParser createParser() {
		InternalYamlGenDslParser result = new InternalYamlGenDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public YamlGenDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(YamlGenDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
