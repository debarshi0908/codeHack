/**
 * <copyright>
 * </copyright>
 *
 */
package cs.ua.edu.se.mapRedoop.impl;

import cs.ua.edu.se.mapRedoop.Argument;
import cs.ua.edu.se.mapRedoop.MapRedoopPackage;
import cs.ua.edu.se.mapRedoop.Mapper;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cs.ua.edu.se.mapRedoop.impl.MapperImpl#getInkey <em>Inkey</em>}</li>
 *   <li>{@link cs.ua.edu.se.mapRedoop.impl.MapperImpl#getInvalue <em>Invalue</em>}</li>
 *   <li>{@link cs.ua.edu.se.mapRedoop.impl.MapperImpl#getOutkey <em>Outkey</em>}</li>
 *   <li>{@link cs.ua.edu.se.mapRedoop.impl.MapperImpl#getOutvalue <em>Outvalue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MapperImpl extends MinimalEObjectImpl.Container implements Mapper
{
  /**
   * The cached value of the '{@link #getInkey() <em>Inkey</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInkey()
   * @generated
   * @ordered
   */
  protected Argument inkey;

  /**
   * The cached value of the '{@link #getInvalue() <em>Invalue</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInvalue()
   * @generated
   * @ordered
   */
  protected Argument invalue;

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
  protected MapperImpl()
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
    return MapRedoopPackage.Literals.MAPPER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Argument getInkey()
  {
    return inkey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInkey(Argument newInkey, NotificationChain msgs)
  {
    Argument oldInkey = inkey;
    inkey = newInkey;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapRedoopPackage.MAPPER__INKEY, oldInkey, newInkey);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInkey(Argument newInkey)
  {
    if (newInkey != inkey)
    {
      NotificationChain msgs = null;
      if (inkey != null)
        msgs = ((InternalEObject)inkey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MapRedoopPackage.MAPPER__INKEY, null, msgs);
      if (newInkey != null)
        msgs = ((InternalEObject)newInkey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MapRedoopPackage.MAPPER__INKEY, null, msgs);
      msgs = basicSetInkey(newInkey, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapRedoopPackage.MAPPER__INKEY, newInkey, newInkey));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Argument getInvalue()
  {
    return invalue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInvalue(Argument newInvalue, NotificationChain msgs)
  {
    Argument oldInvalue = invalue;
    invalue = newInvalue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapRedoopPackage.MAPPER__INVALUE, oldInvalue, newInvalue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInvalue(Argument newInvalue)
  {
    if (newInvalue != invalue)
    {
      NotificationChain msgs = null;
      if (invalue != null)
        msgs = ((InternalEObject)invalue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MapRedoopPackage.MAPPER__INVALUE, null, msgs);
      if (newInvalue != null)
        msgs = ((InternalEObject)newInvalue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MapRedoopPackage.MAPPER__INVALUE, null, msgs);
      msgs = basicSetInvalue(newInvalue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapRedoopPackage.MAPPER__INVALUE, newInvalue, newInvalue));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapRedoopPackage.MAPPER__OUTKEY, oldOutkey, newOutkey);
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
        msgs = ((InternalEObject)outkey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MapRedoopPackage.MAPPER__OUTKEY, null, msgs);
      if (newOutkey != null)
        msgs = ((InternalEObject)newOutkey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MapRedoopPackage.MAPPER__OUTKEY, null, msgs);
      msgs = basicSetOutkey(newOutkey, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapRedoopPackage.MAPPER__OUTKEY, newOutkey, newOutkey));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapRedoopPackage.MAPPER__OUTVALUE, oldOutvalue, newOutvalue);
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
        msgs = ((InternalEObject)outvalue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MapRedoopPackage.MAPPER__OUTVALUE, null, msgs);
      if (newOutvalue != null)
        msgs = ((InternalEObject)newOutvalue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MapRedoopPackage.MAPPER__OUTVALUE, null, msgs);
      msgs = basicSetOutvalue(newOutvalue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapRedoopPackage.MAPPER__OUTVALUE, newOutvalue, newOutvalue));
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
      case MapRedoopPackage.MAPPER__INKEY:
        return basicSetInkey(null, msgs);
      case MapRedoopPackage.MAPPER__INVALUE:
        return basicSetInvalue(null, msgs);
      case MapRedoopPackage.MAPPER__OUTKEY:
        return basicSetOutkey(null, msgs);
      case MapRedoopPackage.MAPPER__OUTVALUE:
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
      case MapRedoopPackage.MAPPER__INKEY:
        return getInkey();
      case MapRedoopPackage.MAPPER__INVALUE:
        return getInvalue();
      case MapRedoopPackage.MAPPER__OUTKEY:
        return getOutkey();
      case MapRedoopPackage.MAPPER__OUTVALUE:
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
      case MapRedoopPackage.MAPPER__INKEY:
        setInkey((Argument)newValue);
        return;
      case MapRedoopPackage.MAPPER__INVALUE:
        setInvalue((Argument)newValue);
        return;
      case MapRedoopPackage.MAPPER__OUTKEY:
        setOutkey((Argument)newValue);
        return;
      case MapRedoopPackage.MAPPER__OUTVALUE:
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
      case MapRedoopPackage.MAPPER__INKEY:
        setInkey((Argument)null);
        return;
      case MapRedoopPackage.MAPPER__INVALUE:
        setInvalue((Argument)null);
        return;
      case MapRedoopPackage.MAPPER__OUTKEY:
        setOutkey((Argument)null);
        return;
      case MapRedoopPackage.MAPPER__OUTVALUE:
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
      case MapRedoopPackage.MAPPER__INKEY:
        return inkey != null;
      case MapRedoopPackage.MAPPER__INVALUE:
        return invalue != null;
      case MapRedoopPackage.MAPPER__OUTKEY:
        return outkey != null;
      case MapRedoopPackage.MAPPER__OUTVALUE:
        return outvalue != null;
    }
    return super.eIsSet(featureID);
  }

} //MapperImpl
