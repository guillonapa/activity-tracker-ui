package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ActivityType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-08-11T15:52:03.807Z[GMT]")
public class ActivityType {
	@JsonProperty("name")
	private String name = null;

	@JsonProperty("timebased")
	private Boolean timebased = null;

	public ActivityType name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get name
	 * 
	 * @return name
	 **/
	@ApiModelProperty(example = "Running", required = true, value = "")
	@NotNull

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ActivityType timebased(Boolean timebased) {
		this.timebased = timebased;
		return this;
	}

	/**
	 * Get timebased
	 * 
	 * @return timebased
	 **/
	@ApiModelProperty(example = "true", required = true, value = "")
	@NotNull

	public Boolean isTimebased() {
		return timebased;
	}

	public void setTimebased(Boolean timebased) {
		this.timebased = timebased;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ActivityType activityType = (ActivityType) o;
		return Objects.equals(this.name, activityType.name) && Objects.equals(this.timebased, activityType.timebased);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, timebased);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ActivityType {\n");

		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    timebased: ").append(toIndentedString(timebased)).append("\n");
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
