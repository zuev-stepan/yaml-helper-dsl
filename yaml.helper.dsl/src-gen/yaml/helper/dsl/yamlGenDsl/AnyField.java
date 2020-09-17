/**
 * generated by Xtext 2.22.0
 */
package yaml.helper.dsl.yamlGenDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Any Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yaml.helper.dsl.yamlGenDsl.AnyField#getHelp <em>Help</em>}</li>
 *   <li>{@link yaml.helper.dsl.yamlGenDsl.AnyField#getSuperField <em>Super Field</em>}</li>
 *   <li>{@link yaml.helper.dsl.yamlGenDsl.AnyField#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see yaml.helper.dsl.yamlGenDsl.YamlGenDslPackage#getAnyField()
 * @model
 * @generated
 */
public interface AnyField extends EObject
{
  /**
   * Returns the value of the '<em><b>Help</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Help</em>' attribute list.
   * @see yaml.helper.dsl.yamlGenDsl.YamlGenDslPackage#getAnyField_Help()
   * @model unique="false"
   * @generated
   */
  EList<String> getHelp();

  /**
   * Returns the value of the '<em><b>Super Field</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Field</em>' reference.
   * @see #setSuperField(Field)
   * @see yaml.helper.dsl.yamlGenDsl.YamlGenDslPackage#getAnyField_SuperField()
   * @model
   * @generated
   */
  Field getSuperField();

  /**
   * Sets the value of the '{@link yaml.helper.dsl.yamlGenDsl.AnyField#getSuperField <em>Super Field</em>}' reference.
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
   * @see yaml.helper.dsl.yamlGenDsl.YamlGenDslPackage#getAnyField_Body()
   * @model containment="true"
   * @generated
   */
  Body getBody();

  /**
   * Sets the value of the '{@link yaml.helper.dsl.yamlGenDsl.AnyField#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(Body value);

} // AnyField
