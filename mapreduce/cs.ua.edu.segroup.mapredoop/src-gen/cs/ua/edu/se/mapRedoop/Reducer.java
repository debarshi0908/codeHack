/**
 * <copyright>
 * </copyright>
 *
 */
package cs.ua.edu.se.mapRedoop;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reducer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cs.ua.edu.se.mapRedoop.Reducer#getOutkey <em>Outkey</em>}</li>
 *   <li>{@link cs.ua.edu.se.mapRedoop.Reducer#getOutvalue <em>Outvalue</em>}</li>
 * </ul>
 * </p>
 *
 * @see cs.ua.edu.se.mapRedoop.MapRedoopPackage#getReducer()
 * @model
 * @generated
 */
public interface Reducer extends EObject
{
  /**
   * Returns the value of the '<em><b>Outkey</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outkey</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outkey</em>' containment reference.
   * @see #setOutkey(Argument)
   * @see cs.ua.edu.se.mapRedoop.MapRedoopPackage#getReducer_Outkey()
   * @model containment="true"
   * @generated
   */
  Argument getOutkey();

  /**
   * Sets the value of the '{@link cs.ua.edu.se.mapRedoop.Reducer#getOutkey <em>Outkey</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Outkey</em>' containment reference.
   * @see #getOutkey()
   * @generated
   */
  void setOutkey(Argument value);

  /**
   * Returns the value of the '<em><b>Outvalue</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outvalue</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outvalue</em>' containment reference.
   * @see #setOutvalue(Argument)
   * @see cs.ua.edu.se.mapRedoop.MapRedoopPackage#getReducer_Outvalue()
   * @model containment="true"
   * @generated
   */
  Argument getOutvalue();

  /**
   * Sets the value of the '{@link cs.ua.edu.se.mapRedoop.Reducer#getOutvalue <em>Outvalue</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Outvalue</em>' containment reference.
   * @see #getOutvalue()
   * @generated
   */
  void setOutvalue(Argument value);

} // Reducer
