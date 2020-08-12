package io.swagger.api.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;

/**
 * 
 * @author Guillermo Narvaez
 */
public class AnalyzeApiControllerImpl implements IApiController<Void, Void, Void, Void> {
	
	private static final Logger log = LoggerFactory.getLogger(AnalyzeApiControllerImpl.class);
	
	private static AnalyzeApiControllerImpl controller;
	
	public static AnalyzeApiControllerImpl getInstance() {
		if (controller == null) {
			controller = new AnalyzeApiControllerImpl();
		}
		return controller;
	}
	
	@Override
	public ResponseEntity<Void> post(Object... args) {
		// TODO Auto-generated method stub
		return IApiController.super.post(args);
	}

}
