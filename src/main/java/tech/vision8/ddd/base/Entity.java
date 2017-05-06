package tech.vision8.ddd.base;

/**
 * Entity is one of the main DDD building blocks.<br/>
 * Any concrete entity as part of your specific domain model should extend this class.
 *
 * @param <Tid> The identifier's type.
 * @author vision8.tech
 */
public abstract class Entity<Tid> {
	
	protected Tid id;
	
	String name = "";
	
	/** Get the identifier of this entity. */
	public Tid id() {
		return id;
	}
	
	/** Get the name of this entity. */
	public String name() {
		return name;
	}
	
}
