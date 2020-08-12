package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TimespanUnits;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Timespan
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-08-11T15:52:03.807Z[GMT]")
public class Timespan {
	@JsonProperty("amount")
	private Integer amount = null;

	@JsonProperty("units")
	private TimespanUnits units = null;

	public Timespan amount(Integer amount) {
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

	public Timespan units(TimespanUnits units) {
		this.units = units;
		return this;
	}

	/**
	 * Get units
	 * 
	 * @return units
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull

	@Valid
	public TimespanUnits getUnits() {
		return units;
	}

	public void setUnits(TimespanUnits units) {
		this.units = units;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Timespan timespan = (Timespan) o;
		return Objects.equals(this.amount, timespan.amount) && Objects.equals(this.units, timespan.units);
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, units);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Timespan {\n");

		sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
		sb.append("    units: ").append(toIndentedString(units)).append("\n");
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
