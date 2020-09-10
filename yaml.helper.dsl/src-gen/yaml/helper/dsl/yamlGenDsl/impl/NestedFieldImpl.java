/**
 * generated by Xtext 2.22.0
 */
package yaml.helper.dsl.yamlGenDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import yaml.helper.dsl.yamlGenDsl.Body;
import yaml.helper.dsl.yamlGenDsl.Field;
import yaml.helper.dsl.yamlGenDsl.NestedField;
import yaml.helper.dsl.yamlGenDsl.YamlGenDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nested Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link yaml.helper.dsl.yamlGenDsl.impl.NestedFieldImpl#getHelp <em>Help</em>}</li>
 *   <li>{@link yaml.helper.dsl.yamlGenDsl.impl.NestedFieldImpl#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link yaml.helper.dsl.yamlGenDsl.impl.NestedFieldImpl#isDefault <em>Default</em>}</li>
 *   <li>{@link yaml.helper.dsl.yamlGenDsl.impl.NestedFieldImpl#getSuperField <em>Super Field</em>}</li>
 *   <li>{@link yaml.helper.dsl.yamlGenDsl.impl.NestedFieldImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NestedFieldImpl extends BodyElementImpl implements NestedField
{
  /**
   * The cached value of the '{@link #getHelp() <em>Help</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHelp()
   * @generated
   * @ordered
   */
  protected EList<String> help;

  /**
   * The default value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMandatory()
   * @generated
   * @ordered
   */
  protected static final boolean MANDATORY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMandatory()
   * @generated
   * @ordered
   */
  protected boolean mandatory = MANDATORY_EDEFAULT;

  /**
   * The default value of the '{@link #isDefault() <em>Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDefault()
   * @generated
   * @ordered
   */
  protected static final boolean DEFAULT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDefault() <em>Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDefault()
   * @generated
   * @ordered
   */
  protected boolean default_ = DEFAULT_EDEFAULT;

  /**
   * The cached value of the '{@link #getSuperField() <em>Super Field</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperField()
   * @generated
   * @ordered
   */
  protected Field superField;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected Body body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NestedFieldImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return YamlGenDslPackage.Literals.NESTED_FIELD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getHelp()
  {
    if (help == null)
    {
      help = new EDataTypeEList<String>(String.class, this, YamlGenDslPackage.NESTED_FIELD__HELP);
    }
    return help;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isMandatory()
  {
    return mandatory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMandatory(boolean newMandatory)
  {
    boolean oldMandatory = mandatory;
    mandatory = newMandatory;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, YamlGenDslPackage.NESTED_FIELD__MANDATORY, oldMandatory, mandatory));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isDefault()
  {
    return default_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDefault(boolean newDefault)
  {
    boolean oldDefault = default_;
    default_ = newDefault;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, YamlGenDslPackage.NESTED_FIELD__DEFAULT, oldDefault, default_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Field getSuperField()
  {
    if (superField != null && superField.eIsProxy())
    {
      InternalEObject oldSuperField = (InternalEObject)superField;
      superField = (Field)eResolveProxy(oldSuperField);
      if (superField != oldSuperField)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, YamlGenDslPackage.NESTED_FIELD__SUPER_FIELD, oldSuperField, superField));
      }
    }
    return superField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field basicGetSuperField()
  {
    return superField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSuperField(Field newSuperField)
  {
    Field oldSuperField = superField;
    superField = newSuperField;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, YamlGenDslPackage.NESTED_FIELD__SUPER_FIELD, oldSuperField, superField));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Body getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(Body newBody, NotificationChain msgs)
  {
    Body oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YamlGenDslPackage.NESTED_FIELD__BODY, oldBody, newBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBody(Body newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - YamlGenDslPackage.NESTED_FIELD__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - YamlGenDslPackage.NESTED_FIELD__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, YamlGenDslPackage.NESTED_FIELD__BODY, newBody, newBody));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case YamlGenDslPackage.NESTED_FIELD__BODY:
        return basicSetBody(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case YamlGenDslPackage.NESTED_FIELD__HELP:
        return getHelp();
      case YamlGenDslPackage.NESTED_FIELD__MANDATORY:
        return isMandatory();
      case YamlGenDslPackage.NESTED_FIELD__DEFAULT:
        return isDefault();
      case YamlGenDslPackage.NESTED_FIELD__SUPER_FIELD:
        if (resolve) return getSuperField();
        return basicGetSuperField();
      case YamlGenDslPackage.NESTED_FIELD__BODY:
        return getBody();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case YamlGenDslPackage.NESTED_FIELD__HELP:
        getHelp().clear();
        getHelp().addAll((Collection<? extends String>)newValue);
        return;
      case YamlGenDslPackage.NESTED_FIELD__MANDATORY:
        setMandatory((Boolean)newValue);
        return;
      case YamlGenDslPackage.NESTED_FIELD__DEFAULT:
        setDefault((Boolean)newValue);
        return;
      case YamlGenDslPackage.NESTED_FIELD__SUPER_FIELD:
        setSuperField((Field)newValue);
        return;
      case YamlGenDslPackage.NESTED_FIELD__BODY:
        setBody((Body)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case YamlGenDslPackage.NESTED_FIELD__HELP:
        getHelp().clear();
        return;
      case YamlGenDslPackage.NESTED_FIELD__MANDATORY:
        setMandatory(MANDATORY_EDEFAULT);
        return;
      case YamlGenDslPackage.NESTED_FIELD__DEFAULT:
        setDefault(DEFAULT_EDEFAULT);
        return;
      case YamlGenDslPackage.NESTED_FIELD__SUPER_FIELD:
        setSuperField((Field)null);
        return;
      case YamlGenDslPackage.NESTED_FIELD__BODY:
        setBody((Body)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case YamlGenDslPackage.NESTED_FIELD__HELP:
        return help != null && !help.isEmpty();
      case YamlGenDslPackage.NESTED_FIELD__MANDATORY:
        return mandatory != MANDATORY_EDEFAULT;
      case YamlGenDslPackage.NESTED_FIELD__DEFAULT:
        return default_ != DEFAULT_EDEFAULT;
      case YamlGenDslPackage.NESTED_FIELD__SUPER_FIELD:
        return superField != null;
      case YamlGenDslPackage.NESTED_FIELD__BODY:
        return body != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (help: ");
    result.append(help);
    result.append(", mandatory: ");
    result.append(mandatory);
    result.append(", default: ");
    result.append(default_);
    result.append(')');
    return result.toString();
  }

} //NestedFieldImpl
