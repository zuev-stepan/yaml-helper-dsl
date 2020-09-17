/**
 * generated by Xtext 2.22.0
 */
package yaml.helper.dsl.yamlGenDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yaml.helper.dsl.yamlGenDsl.Field#isRoot <em>Root</em>}</li>
 *   <li>{@link yaml.helper.dsl.yamlGenDsl.Field#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see yaml.helper.dsl.yamlGenDsl.YamlGenDslPackage#getField()
 * @model
 * @generated
 */
public interface Field extends SourceElement, AnyField
{
  /**
   * Returns the value of the '<em><b>Root</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root</em>' attribute.
   * @see #setRoot(boolean)
   * @see yaml.helper.dsl.yamlGenDsl.YamlGenDslPackage#getField_Root()
   * @model
   * @generated
   */
  boolean isRoot();

  /**
   * Sets the value of the '{@link yaml.helper.dsl.yamlGenDsl.Field#isRoot <em>Root</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Root</em>' attribute.
   * @see #isRoot()
   * @generated
   */
  void setRoot(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see yaml.helper.dsl.yamlGenDsl.YamlGenDslPackage#getField_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link yaml.helper.dsl.yamlGenDsl.Field#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Field
