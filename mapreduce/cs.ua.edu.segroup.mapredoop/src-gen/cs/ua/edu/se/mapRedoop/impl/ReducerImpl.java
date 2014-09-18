/**
 * <copyright>
 * </copyright>
 *
 */
package cs.ua.edu.se.mapRedoop.impl;

import cs.ua.edu.se.mapRedoop.Argument;
import cs.ua.edu.se.mapRedoop.MapRedoopPackage;
import cs.ua.edu.se.mapRedoop.Reducer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reducer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cs.ua.edu.se.mapRedoop.impl.ReducerImpl#getOutkey <em>Outkey</em>}</li>
 *   <li>{@link cs.ua.edu.se.mapRedoop.impl.ReducerImpl#getOutvalue <em>Outvalue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReducerImpl extends MinimalEObjectImpl.Container implements Reducer
{
  /**
   * The cached value of the '{@link #getOutkey() <em>Outkey</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutkey()
   * @generated
   * @ordered
   */
  protected Argument outkey;

  /**
   * The cached value of the '{@link #getOutvalue() <em>Outvalue</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutvalue()
   * @generated
   * @ordered
   */
  protected Argument outvalue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReducerImpl()
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
    return MapRedoopPackage.Literals.REDUCER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Argument getOutkey()
  {
    return outkey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOutkey(Argument newOutkey, NotificationChain msgs)
  {
    Argument oldOutkey = outkey;
    outkey = newOutkey;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapRedoopPackage.REDUCER__OUTKEY, oldOutkey, newOutkey);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutkey(Argument newOutkey)
  {
    if (newOutkey != outkey)
    {
      NotificationChain msgs = null;
      if (outkey != null)
        msgs = ((InternalEObject)outkey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MapRedoopPackage.REDUCER__OUTKEY, null, msgs);
      if (newOutkey != null)
        msgs = ((InternalEObject)newOutkey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MapRedoopPackage.REDUCER__OUTKEY, null, msgs);
      msgs = basicSetOutkey(newOutkey, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapRedoopPackage.REDUCER__OUTKEY, newOutkey, newOutkey));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Argument getOutvalue()
  {
    return outvalue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOutvalue(Argument newOutvalue, NotificationChain msgs)
  {
    Argument oldOutvalue = outvalue;
    outvalue = newOutvalue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapRedoopPackage.REDUCER__OUTVALUE, oldOutvalue, newOutvalue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutvalue(Argument newOutvalue)
  {
    if (newOutvalue != outvalue)
    {
      NotificationChain msgs = null;
      if (outvalue != null)
        msgs = ((InternalEObject)outvalue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MapRedoopPackage.REDUCER__OUTVALUE, null, msgs);
      if (newOutvalue != null)
        msgs = ((InternalEObject)newOutvalue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MapRedoopPackage.REDUCER__OUTVALUE, null, msgs);
      msgs = basicSetOutvalue(newOutvalue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapRedoopPackage.REDUCER__OUTVALUE, newOutvalue, newOutvalue));
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
      case MapRedoopPackage.REDUCER__OUTKEY:
        return basicSetOutkey(null, msgs);
      case MapRedoopPackage.REDUCER__OUTVALUE:
        return basicSetOutvalue(null, msgs);
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
      case MapRedoopPackage.REDUCER__OUTKEY:
        return getOutkey();
      case MapRedoopPackage.REDUCER__OUTVALUE:
        return getOutvalue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MapRedoopPackage.REDUCER__OUTKEY:
        setOutkey((Argument)newValue);
        return;
      case MapRedoopPackage.REDUCER__OUTVALUE:
        setOutvalue((Argument)newValue);
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
      case MapRedoopPackage.REDUCER__OUTKEY:
        setOutkey((Argument)null);
        return;
      case MapRedoopPackage.REDUCER__OUTVALUE:
        setOutvalue((Argument)null);
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
      case MapRedoopPackage.REDUCER__OUTKEY:
        return outkey != null;
      case MapRedoopPackage.REDUCER__OUTVALUE:
        return outvalue != null;
    }
    return super.eIsSet(featureID);
  }

} //ReducerImpl
