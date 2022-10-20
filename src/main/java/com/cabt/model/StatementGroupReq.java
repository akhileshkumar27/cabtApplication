package com.cabt.model;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * StatementGroup
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-10-08T12:16:03.593Z[GMT]")


public class StatementGroupReq   {
  @JsonProperty("scope")
  private Scope scope = null;

  @JsonProperty("statementGroupId")
  private String statementGroupId = null;
  
  @JsonProperty("statementGroupSummary")
  private String statementGroupSummary = null;

  @JsonProperty("statementGroupAlias")
  private String statementGroupAlias = null;

  @JsonProperty("statementGroupDisplay")
  private String statementGroupDisplay = null;

  @JsonProperty("statementGroupOperation")
  private Arguments statementGroupOperation = null;

  @JsonProperty("createdBy")
  private String createdBy = null;

  public StatementGroupReq scope(Scope scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Get scope
   * @return scope
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public Scope getScope() {
    return scope;
  }

  public void setScope(Scope scope) {
    this.scope = scope;
  }

  public StatementGroupReq statementGroupId(String statementGroupId) {
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

  public StatementGroupReq statementGroupSummary(String statementGroupSummary) {
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

  public StatementGroupReq statementGroupDisplay(String statementGroupDisplay) {
	    this.statementGroupDisplay = statementGroupDisplay;
	    return this;
  }
  
  public StatementGroupReq statementGroupAlias(String statementGroupAlias) {
    this.statementGroupAlias = statementGroupAlias;
    return this;
  }
  
  public String getStatementGroupAlias() {
    return statementGroupAlias;
  }

  public void setStatementGroupAlias(String statementGroupAlias) {
    this.statementGroupAlias = statementGroupAlias;
  }

  /**
   * Get statementGroupDisplay
   * @return statementGroupDisplay
   **/
  @Schema(example = "groupDisplay", required = true, description = "")
      @NotNull

    public String getStatementGroupDisplay() {
    return statementGroupDisplay;
  }

  public void setStatementGroupDisplay(String statementGroupDisplay) {
    this.statementGroupDisplay = statementGroupDisplay;
  }

  public StatementGroupReq statementGroupOperation(Arguments statementGroupOperation) {
    this.statementGroupOperation = statementGroupOperation;
    return this;
  }

  /**
   * Get statementGroupOperation
   * @return statementGroupOperation
   **/
  @Schema(description = "")
  
    @Valid
    public Arguments getStatementGroupOperation() {
    return statementGroupOperation;
  }

  public void setStatementGroupOperation(Arguments statementGroupOperation) {
    this.statementGroupOperation = statementGroupOperation;
  }

  public StatementGroupReq createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   * @return createdBy
   **/
  @Schema(example = "uuid", description = "")
  
    public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatementGroupReq statementGroup = (StatementGroupReq) o;
    return Objects.equals(this.scope, statementGroup.scope) &&
        Objects.equals(this.statementGroupId, statementGroup.statementGroupId) && 
        Objects.equals(this.statementGroupAlias, statementGroup.statementGroupAlias) &&        
        Objects.equals(this.statementGroupSummary, statementGroup.statementGroupSummary) &&
        Objects.equals(this.statementGroupDisplay, statementGroup.statementGroupDisplay) &&
        Objects.equals(this.statementGroupOperation, statementGroup.statementGroupOperation) &&
        Objects.equals(this.createdBy, statementGroup.createdBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scope, statementGroupId, statementGroupAlias, statementGroupSummary, statementGroupDisplay, statementGroupOperation, createdBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatementGroup {\n");
    
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    statementGroupId: ").append(toIndentedString(statementGroupId)).append("\n");
    sb.append("    statementGroupAlias: ").append(toIndentedString(statementGroupAlias)).append("\n");
    sb.append("    statementGroupSummary: ").append(toIndentedString(statementGroupSummary)).append("\n");
    sb.append("    statementGroupDisplay: ").append(toIndentedString(statementGroupDisplay)).append("\n");
    sb.append("    statementGroupOperation: ").append(toIndentedString(statementGroupOperation)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
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
