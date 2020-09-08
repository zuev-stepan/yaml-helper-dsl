/**
 * generated by Xtext 2.22.0
 */
package yaml.helper.dsl.yamlGenDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yaml.helper.dsl.yamlGenDsl.Field#getHelp <em>Help</em>}</li>
 *   <li>{@link yaml.helper.dsl.yamlGenDsl.Field#isRoot <em>Root</em>}</li>
 *   <li>{@link yaml.helper.dsl.yamlGenDsl.Field#getName <em>Name</em>}</li>
 *   <li>{@link yaml.helper.dsl.yamlGenDsl.Field#getSuperField <em>Super Field</em>}</li>
 *   <li>{@link yaml.helper.dsl.yamlGenDsl.Field#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see yaml.helper.dsl.yamlGenDsl.YamlGenDslPackage#getField()
 * @model
 * @generated
 */
public interface Field extends SourceElement
{
  /**
   * Returns the value of the '<em><b>Help</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Help</em>' attribute list.
   * @see yaml.helper.dsl.yamlGenDsl.YamlGenDslPackage#getField_Help()
   * @model unique="false"
   * @generated
   */
  EList<String> getHelp();

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

  /**
   * Returns the value of the '<em><b>Super Field</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Field</em>' reference.
   * @see #setSuperField(Field)
   * @see yaml.helper.dsl.yamlGenDsl.YamlGenDslPackage#getField_SuperField()
   * @model
   * @generated
   */
  Field getSuperField();

  /**
   * Sets the value of the '{@link yaml.helper.dsl.yamlGenDsl.Field#getSuperField <em>Super Field</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Field</em>' reference.
   * @see #getSuperField()
   * @generated
   */
  void setSuperField(Field value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(Body)
   * @see yaml.helper.dsl.yamlGenDsl.YamlGenDslPackage#getField_Body()
   * @model containment="true"
   * @generated
   */
  Body getBody();

  /**
   * Sets the value of the '{@link yaml.helper.dsl.yamlGenDsl.Field#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(Body value);

} // Field