package io.swagger.api;

import io.swagger.model.ActivityBase;
import io.swagger.model.ActivityBaseReqBody;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

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
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ActivityBase> activityGet(
            @NotNull @ApiParam(value = "unique user identifier", required = true) @Valid @RequestParam(value = "userId", required = true) String userId,
            @NotNull @ApiParam(value = "unique activity identifier", required = true) @Valid @RequestParam(value = "activityId", required = true) String activityId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ActivityBase>(objectMapper.readValue(
                        "{\n  \"date\" : \"date\",\n  \"duration\" : {\n    \"amount\" : 0,\n    \"unit\" : \"minutes\"\n  },\n  \"activityType\" : {\n    \"timebased\" : true,\n    \"name\" : \"Running\"\n  },\n  \"repetitions\" : 6\n}",
                        ActivityBase.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ActivityBase>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ActivityBase>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> activityPost(
            @ApiParam(value = "activity to record") @Valid @RequestBody ActivityBaseReqBody body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> activityPut(
            @ApiParam(value = "activity details to update") @Valid @RequestBody ActivityBaseReqBody body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
