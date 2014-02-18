/**
 */
package Engine;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Task State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Engine.EnginePackage#getTaskState()
 * @model
 * @generated
 */
public enum TaskState implements Enumerator {
	/**
	 * The '<em><b>NOT PROCESSED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_PROCESSED_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_PROCESSED(0, "NOT_PROCESSED", "NOT_PROCESSED"),

	/**
	 * The '<em><b>PROCESSING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCESSING_VALUE
	 * @generated
	 * @ordered
	 */
	PROCESSING(1, "PROCESSING", "PROCESSING"),

	/**
	 * The '<em><b>PROCESSED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCESSED_VALUE
	 * @generated
	 * @ordered
	 */
	PROCESSED(2, "PROCESSED", "PROCESSED");

	/**
	 * The '<em><b>NOT PROCESSED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOT PROCESSED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_PROCESSED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOT_PROCESSED_VALUE = 0;

	/**
	 * The '<em><b>PROCESSING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROCESSING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROCESSING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROCESSING_VALUE = 1;

	/**
	 * The '<em><b>PROCESSED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROCESSED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROCESSED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROCESSED_VALUE = 2;

	/**
	 * An array of all the '<em><b>Task State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TaskState[] VALUES_ARRAY =
		new TaskState[] {
			NOT_PROCESSED,
			PROCESSING,
			PROCESSED,
		};

	/**
	 * A public read-only list of all the '<em><b>Task State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TaskState> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Task State</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TaskState get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TaskState result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Task State</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TaskState getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TaskState result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Task State</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TaskState get(int value) {
		switch (value) {
			case NOT_PROCESSED_VALUE: return NOT_PROCESSED;
			case PROCESSING_VALUE: return PROCESSING;
			case PROCESSED_VALUE: return PROCESSED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TaskState(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TaskState
