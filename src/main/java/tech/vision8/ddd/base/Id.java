package tech.vision8.ddd.base;

import java.util.UUID;

/**
 * A standard identifier based on UUID.<br/>
 *
 * @author vision8.tech
 */
public class Id extends ValueType<String> {
	
	private static final long serialVersionUID = 1000L;
	
	/** Construct a new Id. */
	public Id(String value) {
		super(value);
	}
	
	/** Generate a new Id. */
	public static Id generate() {
		return new Id(UUID.randomUUID().toString());
	}

}
