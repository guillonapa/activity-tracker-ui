package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.DurationUnits;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ActivityDuration
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-08-11T15:52:03.807Z[GMT]")
public class ActivityDuration {
	@JsonProperty("amount")
	private Integer amount = null;

	@JsonProperty("unit")
	private DurationUnits unit = null;

	public ActivityDuration amount(Integer amount) {
		this.amount = amount;
		return this;
	}

	/**
	 * Get amount
	 * 
	 * @return amount
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public ActivityDuration unit(DurationUnits unit) {
		this.unit = unit;
		return this;
	}

	/**
	 * Get unit
	 * 
	 * @return unit
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull

	@Valid
	public DurationUnits getUnit() {
		return unit;
	}

	public void setUnit(DurationUnits unit) {
		this.unit = unit;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ActivityDuration activityDuration = (ActivityDuration) o;
		return Objects.equals(this.amount, activityDuration.amount) && Objects.equals(this.unit, activityDuration.unit);
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, unit);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ActivityDuration {\n");

		sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
		sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
