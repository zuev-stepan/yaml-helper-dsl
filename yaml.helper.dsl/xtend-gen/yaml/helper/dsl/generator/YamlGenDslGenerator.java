/**
 * generated by Xtext 2.22.0
 */
package yaml.helper.dsl.generator;

import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import yaml.helper.dsl.yamlGenDsl.Body;
import yaml.helper.dsl.yamlGenDsl.Default;
import yaml.helper.dsl.yamlGenDsl.Extend;
import yaml.helper.dsl.yamlGenDsl.Field;
import yaml.helper.dsl.yamlGenDsl.Hint;
import yaml.helper.dsl.yamlGenDsl.Import;
import yaml.helper.dsl.yamlGenDsl.Key;
import yaml.helper.dsl.yamlGenDsl.Name;
import yaml.helper.dsl.yamlGenDsl.NestedField;
import yaml.helper.dsl.yamlGenDsl.NestedFields;
import yaml.helper.dsl.yamlGenDsl.PermittedValues;
import yaml.helper.dsl.yamlGenDsl.Values;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class YamlGenDslGenerator extends AbstractGenerator {
  private String fix_path(final String path) {
    int _length = path.length();
    int _length_1 = ".yamlgen".length();
    int _minus = (_length - _length_1);
    String res = path.substring(0, _minus);
    res = res.replace("dot", "ddot");
    res = res.replace(".", "dot");
    return ("yamlgen_" + res);
  }
  
  private String python_bool(final boolean value) {
    String _xifexpression = null;
    if (value) {
      _xifexpression = "True";
    } else {
      _xifexpression = "False";
    }
    return _xifexpression;
  }
  
  private String python_string(final String value) {
    String res = value.replace("\\", "\\\\");
    res = res.replace("\b", "\\b");
    res = res.replace("\t", "\\t");
    res = res.replace("\n", "\\n");
    res = res.replace("\f", "\\f");
    res = res.replace("\r", "\\r");
    res = res.replace("\"", "\\\"");
    res = res.replace("\'", "\\\'");
    return (("\"" + res) + "\"");
  }
  
  private Object python_values(final Values values) {
    String _string = values.getString();
    boolean _tripleNotEquals = (_string != null);
    if (_tripleNotEquals) {
      return this.python_string(values.getString());
    } else {
      String res = "[";
      EList<Values> _values = values.getValues();
      for (final Values nestedValues : _values) {
        String _res = res;
        Object _python_values = this.python_values(nestedValues);
        String _plus = (_python_values + ",");
        res = (_res + _plus);
      }
      return (res + "]");
    }
  }
  
  private String field_name(final Field field) {
    String _xifexpression = null;
    boolean _isRoot = field.isRoot();
    if (_isRoot) {
      _xifexpression = "root";
    } else {
      _xifexpression = field.getName();
    }
    return _xifexpression;
  }
  
  private String field_create(final Field field) {
    Field _superField = field.getSuperField();
    boolean _tripleNotEquals = (_superField != null);
    if (_tripleNotEquals) {
      String _name = field.getSuperField().getName();
      String _plus = ("extend_field(" + _name);
      return (_plus + ", False, False)");
    } else {
      return "new_field(False, False)";
    }
  }
  
  private String field_create(final NestedField nestedField) {
    String _xblockexpression = null;
    {
      String res = "";
      Field _superField = nestedField.getSuperField();
      boolean _tripleNotEquals = (_superField != null);
      if (_tripleNotEquals) {
        String _res = res;
        String _name = nestedField.getSuperField().getName();
        String _plus = ("extend_field(" + _name);
        String _plus_1 = (_plus + ", ");
        res = (_res + _plus_1);
      } else {
        String _res_1 = res;
        res = (_res_1 + "new_field(");
      }
      String _res_2 = res;
      String _python_bool = this.python_bool(nestedField.isMandatory());
      String _plus_2 = (_python_bool + ", ");
      String _python_bool_1 = this.python_bool(nestedField.isDefault());
      String _plus_3 = (_plus_2 + _python_bool_1);
      String _plus_4 = (_plus_3 + ")");
      _xblockexpression = res = (_res_2 + _plus_4);
    }
    return _xblockexpression;
  }
  
  private String fields_create(final NestedFields nestedFields) {
    String res = "";
    Field _superField = nestedFields.getSuperField();
    boolean _tripleNotEquals = (_superField != null);
    if (_tripleNotEquals) {
      String _name = nestedFields.getSuperField().getName();
      String _plus = ("extend_field(" + _name);
      return (_plus + ", False, False)");
    } else {
      return "new_field(False, False)";
    }
  }
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    String filePath = IterableExtensions.join(((List<String>)Conversions.doWrapArray(resource.getURI().segments())).subList(3, ((List<String>)Conversions.doWrapArray(resource.getURI().segments())).size()), "/");
    String _fix_path = this.fix_path(filePath);
    String file = (_fix_path + ".py");
    StringConcatenation _builder = new StringConcatenation();
    {
      Iterable<Import> _iterable = IteratorExtensions.<Import>toIterable(Iterators.<Import>filter(resource.getAllContents(), Import.class));
      for(final Import importStatement : _iterable) {
        String _replace = this.fix_path(importStatement.getPath()).replace("/", ".");
        String _plus = ("from " + _replace);
        String _plus_1 = (_plus + " import *");
        _builder.append(_plus_1);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      Iterable<Field> _iterable_1 = IteratorExtensions.<Field>toIterable(Iterators.<Field>filter(resource.getAllContents(), Field.class));
      for(final Field field : _iterable_1) {
        CharSequence _compile = this.compile(field);
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
        _builder.newLine();
      }
    }
    fsa.generateFile(file, _builder);
  }
  
  private CharSequence compile(final Field field) {
    StringConcatenation _builder = new StringConcatenation();
    String _field_name = this.field_name(field);
    _builder.append(_field_name);
    _builder.append(" = wrap(");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _field_create = this.field_create(field);
    _builder.append(_field_create, "\t");
    _builder.newLineIfNotEmpty();
    {
      EList<String> _help = field.getHelp();
      for(final String help : _help) {
        _builder.append("\t");
        _builder.append(".add_help(");
        _builder.append(help, "\t");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    CharSequence _compile = this.compile(field.getBody());
    _builder.append(_compile, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append(")");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence compile(final NestedField nestedField) {
    StringConcatenation _builder = new StringConcatenation();
    String _field_create = this.field_create(nestedField);
    _builder.append(_field_create);
    _builder.newLineIfNotEmpty();
    {
      EList<String> _help = nestedField.getHelp();
      for(final String help : _help) {
        _builder.append(".add_help(");
        _builder.append(help);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    Object _compile = this.compile(nestedField.getBody());
    _builder.append(_compile);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private CharSequence compile(final NestedFields nestedFields) {
    StringConcatenation _builder = new StringConcatenation();
    String _fields_create = this.fields_create(nestedFields);
    _builder.append(_fields_create);
    _builder.newLineIfNotEmpty();
    {
      EList<String> _help = nestedFields.getHelp();
      for(final String help : _help) {
        _builder.append(".add_help(");
        _builder.append(help);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    Object _compile = this.compile(nestedFields.getBody());
    _builder.append(_compile);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private CharSequence compile(final Body body) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Iterable<Key> _filter = Iterables.<Key>filter(body.getElements(), Key.class);
      for(final Key t : _filter) {
        _builder.append(".set_property(\"key\", ");
        String _python_string = this.python_string(t.getValue());
        _builder.append(_python_string);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Iterable<Name> _filter_1 = Iterables.<Name>filter(body.getElements(), Name.class);
      for(final Name t_1 : _filter_1) {
        _builder.append(".set_property(\"name\", ");
        String _python_string_1 = this.python_string(t_1.getValue());
        _builder.append(_python_string_1);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Iterable<Default> _filter_2 = Iterables.<Default>filter(body.getElements(), Default.class);
      for(final Default t_2 : _filter_2) {
        _builder.append(".set_property(\"default\", ");
        Object _python_values = this.python_values(t_2.getValue());
        _builder.append(_python_values);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Iterable<Hint> _filter_3 = Iterables.<Hint>filter(body.getElements(), Hint.class);
      for(final Hint t_3 : _filter_3) {
        _builder.append(".set_property(\"hint\", ");
        String _python_string_2 = this.python_string(t_3.getValue());
        _builder.append(_python_string_2);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Iterable<PermittedValues> _filter_4 = Iterables.<PermittedValues>filter(body.getElements(), PermittedValues.class);
      for(final PermittedValues t_4 : _filter_4) {
        _builder.append(".set_property(\"values\", ");
        Object _python_values_1 = this.python_values(t_4.getValue());
        _builder.append(_python_values_1);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Iterable<Extend> _filter_5 = Iterables.<Extend>filter(body.getElements(), Extend.class);
      for(final Extend t_5 : _filter_5) {
        CharSequence _compile = this.compile(t_5);
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Iterable<NestedField> _filter_6 = Iterables.<NestedField>filter(body.getElements(), NestedField.class);
      for(final NestedField t_6 : _filter_6) {
        _builder.append(".add_field(");
        _builder.newLine();
        _builder.append("\t");
        CharSequence _compile_1 = this.compile(t_6);
        _builder.append(_compile_1, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append(")");
        _builder.newLine();
      }
    }
    {
      Iterable<NestedFields> _filter_7 = Iterables.<NestedFields>filter(body.getElements(), NestedFields.class);
      for(final NestedFields t_7 : _filter_7) {
        _builder.append(".add_field_generator(");
        _builder.newLine();
        _builder.append("\t");
        CharSequence _compile_2 = this.compile(t_7);
        _builder.append(_compile_2, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append(")");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  private CharSequence compile(final Extend extend) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(".extend(");
    String _python_string = this.python_string(extend.getName_property());
    _builder.append(_python_string);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    Object _compile = this.compile(extend.getBody());
    _builder.append(_compile, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append(".end_extend()");
    _builder.newLine();
    return _builder;
  }
}
