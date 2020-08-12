package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets TimespanUnits
 */
public enum TimespanUnits {
	DAYS("days"), WEEKS("weeks"), MONTHS("months"), YEARS("years");

	private String value;

	TimespanUnits(String value) {
		this.value = value;
	}

	@Override
	@JsonValue
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static TimespanUnits fromValue(String text) {
		for (TimespanUnits b : TimespanUnits.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}
}
