package io.swagger.api.impl;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.model.UserBaseReqBody;

/**
 * 
 * @author Guillermo Narvaez
 */
public class UserApiControllerImpl implements IApiController<UserBaseReqBody, Void, Void, Void> {
	
	private static final Logger log = LoggerFactory.getLogger(UserApiControllerImpl.class);
	
	private static UserApiControllerImpl controller;
	
	public static UserApiControllerImpl getInstance() {
		if (controller == null) {
			controller = new UserApiControllerImpl();
		}
		return controller;
	}
	
	@Override
	public ResponseEntity<UserBaseReqBody> get(Object... args) {
		assert args.length == 1 && args[0] instanceof ObjectMapper : "An ObjectMapper instance is required as the only argument to the call";
		ObjectMapper objectMapper = (ObjectMapper) args[0];
		// TODO Auto-generated method stub
		try {
			return new ResponseEntity<UserBaseReqBody>(objectMapper.readValue(
					"{\n  \"name\" : \"Foo Bar\",\n  \"id\" : \"id\",\n  \"email\" : \"foo@email.com\"\n}",
					UserBaseReqBody.class), HttpStatus.OK);
		} catch (IOException e) {
			log.error("Couldn't serialize response for content type application/json", e);
			return new ResponseEntity<UserBaseReqBody>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@Override
	public ResponseEntity<Void> delete(Object... args) {
		// TODO Auto-generated method stub
		return IApiController.super.delete(args);
	}
	
	@Override
	public ResponseEntity<Void> post(Object... args) {
		// TODO Auto-generated method stub
		return IApiController.super.post(args);
	}
	
	@Override
	public ResponseEntity<Void> put(Object... args) {
		// TODO Auto-generated method stub
		return IApiController.super.put(args);
	}

}
