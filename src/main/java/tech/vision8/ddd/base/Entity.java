package tech.vision8.ddd.base;

/**
 * Entity is one of the main DDD building blocks.<br/>
 * Any concrete entity - part of your domain - should implement this interface.
 *
 * @param <Tid> The identifier's type.
 * @author vision8.tech
 */
public interface Entity<Tid> {
	
	/** Get the identifier of this entity. */
	Tid id();
	
	/** Get the name of this entity. */
	String name();
	
}
