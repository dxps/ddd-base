package tech.vision8.ddd.base;

import java.io.Serializable;


/**
 * A value type is the typed value that is used as part of a value object.<br/>
 *
 * @param <T> The type of value it holds.
 * @author vision8.tech
 */
public class ValueType<T extends Serializable> implements Serializable {
	
	private static final long serialVersionUID = 1013L;
	
	private final T value;
	
	/** Create a new value type. */
	public ValueType(T value) {
		if (value == null) {
			throw new IllegalArgumentException("A value must be provided");
		}
		this.value = value;
	}
	
	/** Get the value it holds (as being a ValueType). */
	public T value() {
		return value;
	}
	
	@Override
	/**
	 * Tell if this ValueType is the same as the provided object<br/>
	 * (which should also be a ValueType instance). */
	public boolean equals(Object o) {
		
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ValueType<?> valueType = (ValueType<?>) o;
		if (!value.equals(valueType.value)) return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		return value.hashCode();
	}
	
	@Override
	public String toString() {
		return value.toString();
	}
	
}
