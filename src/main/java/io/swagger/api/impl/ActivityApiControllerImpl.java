package io.swagger.api.impl;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.model.ActivityBase;

/**
 * 
 * @author Guillermo Narvaez
 */
public class ActivityApiControllerImpl implements IApiController<ActivityBase, Void, Void, Void> {
	
	private static final Logger log = LoggerFactory.getLogger(ActivityApiControllerImpl.class);

	private static ActivityApiControllerImpl controller;

	public static ActivityApiControllerImpl getInstance() {
		if (controller == null) {
			controller = new ActivityApiControllerImpl();
		}
		return controller;
	}
	
	@Override
	public ResponseEntity<ActivityBase> get(Object... args) {
		assert args.length == 1 && args[0] instanceof ObjectMapper : "An ObjectMapper instance is required as the only argument to the call";
		ObjectMapper objectMapper = (ObjectMapper) args[0];
		// TODO
		try {
			return new ResponseEntity<ActivityBase>(objectMapper.readValue(
					"{\n  \"date\" : \"date\",\n  \"duration\" : {\n    \"amount\" : 0,\n    \"unit\" : \"minutes\"\n  },\n  \"activityType\" : {\n    \"timebased\" : true,\n    \"name\" : \"Running\"\n  },\n  \"repetitions\" : 6\n}",
					ActivityBase.class), HttpStatus.NOT_IMPLEMENTED);
		} catch (IOException e) {
			log.error("Couldn't serialize response for content type application/json", e);
			return new ResponseEntity<ActivityBase>(HttpStatus.INTERNAL_SERVER_ERROR);
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
