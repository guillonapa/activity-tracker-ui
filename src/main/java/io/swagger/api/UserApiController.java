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
import io.swagger.api.impl.UserApiControllerImpl;
import io.swagger.model.UserBaseReqBody;
import io.swagger.model.UserUpdateReqBody;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-08-11T15:52:03.807Z[GMT]")
@Controller
public class UserApiController implements UserApi {

	private static final Logger log = LoggerFactory.getLogger(UserApiController.class);

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	@org.springframework.beans.factory.annotation.Autowired
	public UserApiController(ObjectMapper objectMapper, HttpServletRequest request) {
		this.objectMapper = objectMapper;
		this.request = request;
	}

	public ResponseEntity<Void> userDelete(
			@ApiParam(value = "unique user identifier") @Valid @RequestParam(value = "userId", required = false) String userId) {
		String accept = request.getHeader("Accept");
		return UserApiControllerImpl.getInstance().delete();
	}

	public ResponseEntity<UserBaseReqBody> userGet(
			@NotNull @ApiParam(value = "unique user identifier", required = true) @Valid @RequestParam(value = "userId", required = true) String userId) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			return UserApiControllerImpl.getInstance().get(objectMapper);
		}

		return new ResponseEntity<UserBaseReqBody>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<Void> userPost(
			@ApiParam(value = "user account details") @Valid @RequestBody UserBaseReqBody body) {
		String accept = request.getHeader("Accept");
		return UserApiControllerImpl.getInstance().post();
	}

	public ResponseEntity<Void> userPut(
			@ApiParam(value = "user account details to update") @Valid @RequestBody UserUpdateReqBody body) {
		String accept = request.getHeader("Accept");
		return UserApiControllerImpl.getInstance().put();
	}

}
