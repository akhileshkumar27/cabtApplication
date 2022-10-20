package com.cabt.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ArgumentsDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-10-08T12:16:03.593Z[GMT]")


public class ArgumentsDetails   {
  @JsonProperty("statementUId")
  private String statementUId = null;

  /**
   * Oerator
   */
  public enum OperatorEnum {
    AND("AND"),
    
    OR("OR"),
    
    AND_NOT("AND NOT");

    private String value;

    OperatorEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OperatorEnum fromValue(String text) {
      for (OperatorEnum b : OperatorEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("operator")
  private OperatorEnum operator = null;

  public ArgumentsDetails statementUId(String statementUId) {
    this.statementUId = statementUId;
    return this;
  }

  /**
   * Get statementUId
   * @return statementUId
   **/
  @Schema(example = "1", description = "")
  
    public String getStatementUId() {
    return statementUId;
  }

  public void setStatementUId(String statementUId) {
    this.statementUId = statementUId;
  }

  public ArgumentsDetails operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }

  /**
   * Oerator
   * @return operator
   **/
  @Schema(example = "AND", description = "Oerator")
  
    public OperatorEnum getOperator() {
    return operator;
  }

  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArgumentsDetails argumentsDetails = (ArgumentsDetails) o;
    return Objects.equals(this.statementUId, argumentsDetails.statementUId) &&
        Objects.equals(this.operator, argumentsDetails.operator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statementUId, operator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArgumentsDetails {\n");
    
    sb.append("    statementUId: ").append(toIndentedString(statementUId)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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
