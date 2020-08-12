package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.UserBaseReqBody;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserUpdateReqBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-08-11T15:52:03.807Z[GMT]")
public class UserUpdateReqBody extends UserBaseReqBody {
	@JsonProperty("oldPw")
	private String oldPw = null;

	@JsonProperty("newPw")
	private String newPw = null;

	public UserUpdateReqBody oldPw(String oldPw) {
		this.oldPw = oldPw;
		return this;
	}

	/**
	 * Get oldPw
	 * 
	 * @return oldPw
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull

	@Size(min = 6, max = 20)
	public String getOldPw() {
		return oldPw;
	}

	public void setOldPw(String oldPw) {
		this.oldPw = oldPw;
	}

	public UserUpdateReqBody newPw(String newPw) {
		this.newPw = newPw;
		return this;
	}

	/**
	 * Get newPw
	 * 
	 * @return newPw
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull

	@Size(min = 6, max = 20)
	public String getNewPw() {
		return newPw;
	}

	public void setNewPw(String newPw) {
		this.newPw = newPw;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		UserUpdateReqBody userUpdateReqBody = (UserUpdateReqBody) o;
		return Objects.equals(this.oldPw, userUpdateReqBody.oldPw)
				&& Objects.equals(this.newPw, userUpdateReqBody.newPw) && super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(oldPw, newPw, super.hashCode());
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class UserUpdateReqBody {\n");
		sb.append("    ").append(toIndentedString(super.toString())).append("\n");
		sb.append("    oldPw: ").append(toIndentedString(oldPw)).append("\n");
		sb.append("    newPw: ").append(toIndentedString(newPw)).append("\n");
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
