package tech.vision8.ddd.base;

/**
 * A value object is one of the main DDD building blocks.<br/>
 * TODO: short description of the purpose
 *
 * @author vision8.tech
 */
public interface ValueObject {
	
	/** Get the contents of this value object. */
	ValueType<?> contents();
	
}
