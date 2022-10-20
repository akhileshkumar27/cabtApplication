package com.cabt.model;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Statements
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-10-08T12:16:03.593Z[GMT]")


public class Statements   {
  @JsonProperty("statementGroupId")
  private String statementGroupId = null;

  @JsonProperty("scope")
  private Scope scope = null;

  @JsonProperty("statementGroupSummary")
  private String statementGroupSummary = null;

  @JsonProperty("statementGroupDisplay")
  private String statementGroupDisplay = null;

  

  public Statements statementGroupId(String statementGroupId) {
    this.statementGroupId = statementGroupId;
    return this;
  }

  /**
   * Get statementGroupId
   * @return statementGroupId
   **/
  @Schema(example = "10", required = true, description = "")
      @NotNull

    public String getStatementGroupId() {
    return statementGroupId;
  }

  public void setStatementGroupId(String statementGroupId) {
    this.statementGroupId = statementGroupId;
  }

  public Statements scope(Scope scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Get scope
   * @return scope
   **/
  @Schema(description = "")
  
    @Valid
    public Scope getScope() {
    return scope;
  }

  public void setScope(Scope scope) {
    this.scope = scope;
  }

  public Statements statementGroupSummary(String statementGroupSummary) {
    this.statementGroupSummary = statementGroupSummary;
    return this;
  }

  /**
   * Get statementGroupSummary
   * @return statementGroupSummary
   **/
  @Schema(example = "groupSummary", required = true, description = "")
      @NotNull

    public String getStatementGroupSummary() {
    return statementGroupSummary;
  }

  public void setStatementGroupSummary(String statementGroupSummary) {
    this.statementGroupSummary = statementGroupSummary;
  }

  public Statements statementGroupDisplay(String statementGroupDisplay) {
    this.statementGroupDisplay = statementGroupDisplay;
    return this;
  }

  /**
   * Get statementGroupDisplay
   * @return statementGroupDisplay
   **/
  @Schema(example = "groupDisplay", description = "")
  
    public String getStatementGroupDisplay() {
    return statementGroupDisplay;
  }

  public void setStatementGroupDisplay(String statementGroupDisplay) {
    this.statementGroupDisplay = statementGroupDisplay;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Statements statements = (Statements) o;
    return Objects.equals(this.statementGroupId, statements.statementGroupId) &&
        Objects.equals(this.scope, statements.scope) &&
        Objects.equals(this.statementGroupSummary, statements.statementGroupSummary) &&
        Objects.equals(this.statementGroupDisplay, statements.statementGroupDisplay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statementGroupId, scope, statementGroupSummary, statementGroupDisplay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Statements {\n");
    
    sb.append("    statementGroupId: ").append(toIndentedString(statementGroupId)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    statementGroupSummary: ").append(toIndentedString(statementGroupSummary)).append("\n");
    sb.append("    statementGroupDisplay: ").append(toIndentedString(statementGroupDisplay)).append("\n");   
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
