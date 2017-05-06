package tech.vision8.ddd.base;

/**
 * Repository is one of the main DDD building blocks.<br/>
 *
 * @param <Te>  The entity type.
 * @param <Tid> The identifier's type of the entity..
 * @author vision8.tech
 */
public interface Repository<Te, Tid> {

	/** Add a new entity to the repository. */
	Te add(Te entity);
	
	/** Get an entity from repository by id. */
	Te get(Tid entityId);
	
	/** Update an existing entity to the repository. */
	void update(Te entity);
	
	/** Remove an existing entity from the repository. */
	void remove(Tid entityId);

}
