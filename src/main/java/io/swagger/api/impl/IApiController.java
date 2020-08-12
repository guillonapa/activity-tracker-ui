package io.swagger.api.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * <p>
 * An interface for all API Controller Implementations to implement.
 * </p>
 * 
 * @author Guillermo Narvaez
 */
public interface IApiController<GetType, DeleteType, PostType, PutType> {

	public default ResponseEntity<GetType> get(Object... args) {
		return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
	}

	public default ResponseEntity<DeleteType> delete(Object... args) {
		return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
	}

	public default ResponseEntity<PostType> post(Object... args) {
		return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
	}

	public default ResponseEntity<PutType> put(Object... args) {
		return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
	}
}
