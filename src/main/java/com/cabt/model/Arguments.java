package com.cabt.model;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Arguments
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-10-08T12:16:03.593Z[GMT]")


public class Arguments   {
  @JsonProperty("arguments")
  private ArgumentsDetails arguments = null;

  public Arguments arguments(ArgumentsDetails arguments) {
    this.arguments = arguments;
    return this;
  }

  /**
   * Get arguments
   * @return arguments
   **/
  @Schema(description = "")
  
    @Valid
    public ArgumentsDetails getArguments() {
    return arguments;
  }

  public void setArguments(ArgumentsDetails arguments) {
    this.arguments = arguments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Arguments arguments = (Arguments) o;
    return Objects.equals(this.arguments, arguments.arguments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arguments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Arguments {\n");
    
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
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
