/*
 * generated by Xtext 2.22.0
 */
package yaml.helper.dsl.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import yaml.helper.dsl.yamlGenDsl.Source
import yaml.helper.dsl.yamlGenDsl.YamlGenDslPackage
import yaml.helper.dsl.validation.YamlGenDslValidator

@ExtendWith(InjectionExtension)
@InjectWith(YamlGenDslInjectorProvider)
class YamlGenDslParsingTest {
	@Inject ParseHelper<Source> parseHelper
	@Inject ValidationTestHelper validationTestHelper
	
	
	@Test
	def void simpleTest() {
		val result = parseHelper.parse('''
			import "asd"
			TestField1 {}
			
			TestField2 extends TestField1 {
				
			}
			root TestField3{}
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		validationTestHelper.assertNoErrors(result)
	}
	
	@Test
	def void bodyTest() {
		val result = parseHelper.parse('''
			TestField1 {
				name: "test-field"
				default: "asd"
				hint: "asd"
				values: "asd"
			}
			TestField2 extends TestField1 {
				values: ["asd" "aaa"]
				field mandatory {
					name: "inline-field"
					hint: "test"
				}
				field extends TestField1 {
					name: "inline-child-field"
					hint: "test"
				}
			}
			TestField3 extends TestField2 {
				extend "inline-field" {
					hint: "test1"
				}
			}
			
			TestField4 {
				fields {
				}
			}
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		validationTestHelper.assertNoErrors(result)
	}
	
	@Test
	def void nameTest() {
		var result = parseHelper.parse('''
			TestField1 {
				field mandatory {
					name: "inline-field"
					hint: "test"
				}
			}
		''')
		Assertions.assertNotNull(result)
		var errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		validationTestHelper.assertNoErrors(result)
		
		result = parseHelper.parse('''
			TestField1 {
				field mandatory {
					key: "inline-field"
					hint: "test"
				}
			}
		''')
		Assertions.assertNotNull(result)
		errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		validationTestHelper.assertNoErrors(result)
		
		result = parseHelper.parse('''
			TestField1 {
				field mandatory {
					hint: "test"
				}
			}
		''')
		Assertions.assertNotNull(result)
		errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		validationTestHelper.assertError(result,
			YamlGenDslPackage.Literals.NESTED_FIELD,
			YamlGenDslValidator.UNNAMED_NESTED_FIELD,
			YamlGenDslValidator.UNNAMED_NESTED_FIELD
		)
		
		result = parseHelper.parse('''
			TestField1 {
				name: "tf1"
			}
			TestField2 {
				field mandatory extends TestField1 {
					hint: "test"
				}
			}
		''')
		Assertions.assertNotNull(result)
		errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		validationTestHelper.assertNoErrors(result)
		
		result = parseHelper.parse('''
			TestField1 {
				key: "tf1"
			}
			TestField2 {
				field mandatory extends TestField1 {
					hint: "test"
				}
			}
		''')
		Assertions.assertNotNull(result)
		errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		validationTestHelper.assertNoErrors(result)
		
		result = parseHelper.parse('''
			TestField1 {
				name: "tf1"
			}
			TestField2 extends TestField1 {}
			TestField3 {
				field mandatory extends TestField2 {
					hint: "test"
				}
			}
		''')
		Assertions.assertNotNull(result)
		errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		validationTestHelper.assertNoErrors(result)
		
		result = parseHelper.parse('''
			TestField1 {
				key: "tf1"
			}
			TestField2 extends TestField1 {}
			TestField3 {
				field mandatory extends TestField2 {
					hint: "test"
				}
			}
		''')
		Assertions.assertNotNull(result)
		errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		validationTestHelper.assertNoErrors(result)
		
		result = parseHelper.parse('''
			TestField1 {
				key: "tf1"
				name: "tf1"
			}
		''')
		Assertions.assertNotNull(result)
		errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		validationTestHelper.assertError(result,
			YamlGenDslPackage.Literals.STRING_PROPERTY,
			YamlGenDslValidator.DUPLICATE_KEY_NAME_PROPERTY,
			YamlGenDslValidator.DUPLICATE_KEY_NAME_PROPERTY
		)
		
		result = parseHelper.parse('''
			TestField1 {
				name: "tf1"
				key: "tf1"
			}
		''')
		Assertions.assertNotNull(result)
		errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		validationTestHelper.assertError(result,
			YamlGenDslPackage.Literals.STRING_PROPERTY,
			YamlGenDslValidator.DUPLICATE_KEY_NAME_PROPERTY,
			YamlGenDslValidator.DUPLICATE_KEY_NAME_PROPERTY
		)
		
		result = parseHelper.parse('''
			TestField1 {
				key: "tf1"
			}
			TestField2 extends TestField1 {
				name: "tf2"
			}
		''')
		Assertions.assertNotNull(result)
		errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		validationTestHelper.assertNoErrors(result)
	}
	
	@Test
	def void duplicatePropertyTest() {
		var result = parseHelper.parse('''
			TestField1 {
				key: "test-field"
				key: "asd"
			}
		''')
		Assertions.assertNotNull(result)
		var errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		validationTestHelper.assertError(result,
			YamlGenDslPackage.Literals.STRING_PROPERTY,
			YamlGenDslValidator.DUPLICATE_PROPERTY,
			YamlGenDslValidator.DUPLICATE_PROPERTY
		)
		
		result = parseHelper.parse('''
			TestField1 {
				name: "test-field"
				name: "asd"
			}
		''')
		Assertions.assertNotNull(result)
		errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		validationTestHelper.assertError(result,
			YamlGenDslPackage.Literals.STRING_PROPERTY,
			YamlGenDslValidator.DUPLICATE_PROPERTY,
			YamlGenDslValidator.DUPLICATE_PROPERTY
		)
		
		result = parseHelper.parse('''
			TestField1 {
				hint: "test-field"
				hint: "asd"
			}
		''')
		Assertions.assertNotNull(result)
		errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		validationTestHelper.assertError(result,
			YamlGenDslPackage.Literals.STRING_PROPERTY,
			YamlGenDslValidator.DUPLICATE_PROPERTY,
			YamlGenDslValidator.DUPLICATE_PROPERTY
		)
		
		result = parseHelper.parse('''
			TestField1 {
				default: "test-field"
				default: "asd"
			}
		''')
		Assertions.assertNotNull(result)
		errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		validationTestHelper.assertError(result,
			YamlGenDslPackage.Literals.VALUES_PROPERTY,
			YamlGenDslValidator.DUPLICATE_PROPERTY,
			YamlGenDslValidator.DUPLICATE_PROPERTY
		)
		
		result = parseHelper.parse('''
			TestField1 {
				values: "test-field"
				values: "asd"
			}
		''')
		Assertions.assertNotNull(result)
		errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		validationTestHelper.assertError(result,
			YamlGenDslPackage.Literals.VALUES_PROPERTY,
			YamlGenDslValidator.DUPLICATE_PROPERTY,
			YamlGenDslValidator.DUPLICATE_PROPERTY
		)
	}
	
	@Test
	def void extendTest() {
		var result = parseHelper.parse('''
			TestField1 {
				extend "asd" {
					key: "asdd"
				}
			}
		''')
		Assertions.assertNotNull(result)
		var errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		validationTestHelper.assertError(result,
			YamlGenDslPackage.Literals.EXTEND,
			YamlGenDslValidator.EXTEND_FIELD_NOT_FOUND,
			YamlGenDslValidator.EXTEND_FIELD_NOT_FOUND
		)
		
		result = parseHelper.parse('''
			TestField1 {
				field {
					key: "asd"
				}
			}
			TestField2 extends TestField1 {
				extend "asd" {
					key: "asdd"
				}
			}
		''')
		Assertions.assertNotNull(result)
		errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		validationTestHelper.assertNoErrors(result)
		
		result = parseHelper.parse('''
			TestField1 {
				field {
					key: "asd"
				}
			}
			TestField2 extends TestField1 {
				extend "asdf" {
					key: "asdd"
				}
			}
		''')
		Assertions.assertNotNull(result)
		errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		validationTestHelper.assertError(result,
			YamlGenDslPackage.Literals.EXTEND,
			YamlGenDslValidator.EXTEND_FIELD_NOT_FOUND,
			YamlGenDslValidator.EXTEND_FIELD_NOT_FOUND
		)
		
		result = parseHelper.parse('''
			TestField1 {
				field {
					key: "asd"
					field {
						key: "dsa"
					}
				}
			}
			TestField2 extends TestField1 {
				extend "asd" {
					extend "dsa" {
						key: "asdfsdg"
					}
				}
			}
		''')
		Assertions.assertNotNull(result)
		errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		validationTestHelper.assertNoErrors(result)
		
		result = parseHelper.parse('''
			TestField1 {
				field {
					key: "asd"
					field {
						key: "dsa"
					}
				}
			}
			TestField2 extends TestField1 {
				extend "dsa" {
					extend "dsa" {
						key: "asdfsdg"
					}
				}
			}
		''')
		Assertions.assertNotNull(result)
		errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		validationTestHelper.assertError(result,
			YamlGenDslPackage.Literals.EXTEND,
			YamlGenDslValidator.EXTEND_FIELD_NOT_FOUND,
			YamlGenDslValidator.EXTEND_FIELD_NOT_FOUND
		)
		
		result = parseHelper.parse('''
			TestField1 {
				field {
					key: "asd"
					field {
						key: "dsa"
					}
				}
			}
			TestField2 extends TestField1 {
				extend "asd" {
					extend "asd" {
						key: "asdfsdg"
					}
				}
			}
		''')
		Assertions.assertNotNull(result)
		errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		validationTestHelper.assertError(result,
			YamlGenDslPackage.Literals.EXTEND,
			YamlGenDslValidator.EXTEND_FIELD_NOT_FOUND,
			YamlGenDslValidator.EXTEND_FIELD_NOT_FOUND
		)
		
		result = parseHelper.parse('''
			TestField1 {
				field {
					key: "asd"
					field {
						key: "dsa"
					}
				}
			}
			TestField2 extends TestField1 {
				extend "asd" {
					extend "dsa" {
						key: "asd"
					}
				}
			}
			TestField3 extends TestField1 {
				extend "asd" {
					extend "dsa" {
						key: "asdfsdg"
					}
				}
			}
			TestField4 extends TestField2 {
				extend "asd" {
					extend "asd" {
						key: "asdfsdg"
					}
				}
			}
		''')
		Assertions.assertNotNull(result)
		errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		validationTestHelper.assertNoErrors(result)
		
		result = parseHelper.parse('''
			TestField1 {
				field {
					key: "asd"
				}
				field {
					key: "dsa"
				}
			}
			TestField2 extends TestField1 {
				extend "asd" {
					key: "dsa"
				}
			}
		''')
		Assertions.assertNotNull(result)
		errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		validationTestHelper.assertError(result,
			YamlGenDslPackage.Literals.STRING_PROPERTY,
			YamlGenDslValidator.DUPLICATE_NESTED_FIELD_NAME,
			YamlGenDslValidator.DUPLICATE_NESTED_FIELD_NAME
		)
		
		result = parseHelper.parse('''
			TestField1 {
				field {
					key: "asd"
				}
				field {
					key: "dsa"
				}
			}
			TestField2 extends TestField1 {
				extend "asd" {
					key: "dsa"
				}
				extend "dsa" {
					key: "asd"
				}
			}
		''')
		Assertions.assertNotNull(result)
		errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		validationTestHelper.assertNoErrors(result)
	}
}
