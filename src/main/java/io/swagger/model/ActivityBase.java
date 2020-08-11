package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ActivityDuration;
import io.swagger.model.ActivityType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ActivityBase
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-08-11T15:52:03.807Z[GMT]")
public class ActivityBase   {
  @JsonProperty("date")
  private String date = null;

  @JsonProperty("activityType")
  private ActivityType activityType = null;

  @JsonProperty("duration")
  private ActivityDuration duration = null;

  @JsonProperty("repetitions")
  private Integer repetitions = null;

  public ActivityBase date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public ActivityBase activityType(ActivityType activityType) {
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

  public ActivityBase duration(ActivityDuration duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Get duration
   * @return duration
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public ActivityDuration getDuration() {
    return duration;
  }

  public void setDuration(ActivityDuration duration) {
    this.duration = duration;
  }

  public ActivityBase repetitions(Integer repetitions) {
    this.repetitions = repetitions;
    return this;
  }

  /**
   * Get repetitions
   * @return repetitions
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public Integer getRepetitions() {
    return repetitions;
  }

  public void setRepetitions(Integer repetitions) {
    this.repetitions = repetitions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityBase activityBase = (ActivityBase) o;
    return Objects.equals(this.date, activityBase.date) &&
        Objects.equals(this.activityType, activityBase.activityType) &&
        Objects.equals(this.duration, activityBase.duration) &&
        Objects.equals(this.repetitions, activityBase.repetitions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, activityType, duration, repetitions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityBase {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    activityType: ").append(toIndentedString(activityType)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    repetitions: ").append(toIndentedString(repetitions)).append("\n");
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
