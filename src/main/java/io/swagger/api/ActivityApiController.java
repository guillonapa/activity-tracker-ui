package io.swagger.api;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.ApiParam;
import io.swagger.api.impl.ActivityApiControllerImpl;
import io.swagger.model.ActivityBase;
import io.swagger.model.ActivityBaseReqBody;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-08-11T15:52:03.807Z[GMT]")
@Controller
public class ActivityApiController implements ActivityApi {

	private static final Logger log = LoggerFactory.getLogger(ActivityApiController.class);

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	@org.springframework.beans.factory.annotation.Autowired
	public ActivityApiController(ObjectMapper objectMapper, HttpServletRequest request) {
		this.objectMapper = objectMapper;
		this.request = request;
	}

	public ResponseEntity<Void> activityDelete(
			@NotNull @ApiParam(value = "unique activity identifier", required = true) @Valid @RequestParam(value = "activityId", required = true) String activityId) {
		String accept = request.getHeader("Accept");
		return ActivityApiControllerImpl.getInstance().delete();
	}

	public ResponseEntity<ActivityBase> activityGet(
			@NotNull @ApiParam(value = "unique user identifier", required = true) @Valid @RequestParam(value = "userId", required = true) String userId,
			@NotNull @ApiParam(value = "unique activity identifier", required = true) @Valid @RequestParam(value = "activityId", required = true) String activityId) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			return ActivityApiControllerImpl.getInstance().get(objectMapper);
		}

		return new ResponseEntity<ActivityBase>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<Void> activityPost(
			@ApiParam(value = "activity to record") @Valid @RequestBody ActivityBaseReqBody body) {
		String accept = request.getHeader("Accept");
		return ActivityApiControllerImpl.getInstance().post();
	}

	public ResponseEntity<Void> activityPut(
			@ApiParam(value = "activity details to update") @Valid @RequestBody ActivityBaseReqBody body) {
		String accept = request.getHeader("Accept");
		return ActivityApiControllerImpl.getInstance().put();
	}

}
