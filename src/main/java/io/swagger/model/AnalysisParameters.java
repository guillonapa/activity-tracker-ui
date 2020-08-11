package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ActivityType;
import io.swagger.model.Timespan;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AnalysisParameters
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-08-11T15:52:03.807Z[GMT]")
public class AnalysisParameters   {
  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("activityType")
  private ActivityType activityType = null;

  @JsonProperty("timespan")
  private Timespan timespan = null;

  public AnalysisParameters userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public AnalysisParameters activityType(ActivityType activityType) {
    this.activityType = activityType;
    return this;
  }

  /**
   * Get activityType
   * @return activityType
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public ActivityType getActivityType() {
    return activityType;
  }

  public void setActivityType(ActivityType activityType) {
    this.activityType = activityType;
  }

  public AnalysisParameters timespan(Timespan timespan) {
    this.timespan = timespan;
    return this;
  }

  /**
   * Get timespan
   * @return timespan
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public Timespan getTimespan() {
    return timespan;
  }

  public void setTimespan(Timespan timespan) {
    this.timespan = timespan;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalysisParameters analysisParameters = (AnalysisParameters) o;
    return Objects.equals(this.userId, analysisParameters.userId) &&
        Objects.equals(this.activityType, analysisParameters.activityType) &&
        Objects.equals(this.timespan, analysisParameters.timespan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, activityType, timespan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalysisParameters {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    activityType: ").append(toIndentedString(activityType)).append("\n");
    sb.append("    timespan: ").append(toIndentedString(timespan)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
