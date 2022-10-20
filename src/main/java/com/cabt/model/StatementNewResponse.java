package com.cabt.model;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;
import org.threeten.bp.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * StatementNewResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-10-18T20:47:36.391Z[GMT]")


public class StatementNewResponse   {
  @JsonProperty("statementId")
  private String statementId = null;

  @JsonProperty("scope")
  private String scope = null;

  @JsonProperty("statementAlias")
  private String statementAlias = null;

  @JsonProperty("statementDisplay")
  private String statementDisplay = null;

  @JsonProperty("createdAt")
  private OffsetDateTime createdAt = null;

  @JsonProperty("createdBy")
  private String createdBy = null;

  public StatementNewResponse statementId(String statementId) {
    this.statementId = statementId;
    return this;
  }

  /**
   * Get statementId
   * @return statementId
   **/
  @Schema(example = "10", required = true, description = "")
      @NotNull

    public String getStatementId() {
    return statementId;
  }

  public void setStatementId(String statementId) {
    this.statementId = statementId;
  }

  public StatementNewResponse scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Get scope
   * @return scope
   **/
  @Schema(example = "10", required = true, description = "")
      @NotNull

    public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public StatementNewResponse statementAlias(String statementAlias) {
    this.statementAlias = statementAlias;
    return this;
  }

  /**
   * Get statementAlias
   * @return statementAlias
   **/
  @Schema(example = "statementAlias", description = "")
  
    public String getStatementAlias() {
    return statementAlias;
  }

  public void setStatementAlias(String statementAlias) {
    this.statementAlias = statementAlias;
  }

  public StatementNewResponse statementDisplay(String statementDisplay) {
    this.statementDisplay = statementDisplay;
    return this;
  }

  /**
   * Get statementDisplay
   * @return statementDisplay
   **/
  @Schema(example = "statementDisplay", description = "")
  
    public String getStatementDisplay() {
    return statementDisplay;
  }

  public void setStatementDisplay(String statementDisplay) {
    this.statementDisplay = statementDisplay;
  }

  public StatementNewResponse createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   **/
  @Schema(description = "")
  
    @Valid
    public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public StatementNewResponse createdBy(String createdBy) {
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
    StatementNewResponse statementNewResponse = (StatementNewResponse) o;
    return Objects.equals(this.statementId, statementNewResponse.statementId) &&
        Objects.equals(this.scope, statementNewResponse.scope) &&
        Objects.equals(this.statementAlias, statementNewResponse.statementAlias) &&
        Objects.equals(this.statementDisplay, statementNewResponse.statementDisplay) &&
        Objects.equals(this.createdAt, statementNewResponse.createdAt) &&
        Objects.equals(this.createdBy, statementNewResponse.createdBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statementId, scope, statementAlias, statementDisplay, createdAt, createdBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatementNewResponse {\n");
    
    sb.append("    statementId: ").append(toIndentedString(statementId)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    statementAlias: ").append(toIndentedString(statementAlias)).append("\n");
    sb.append("    statementDisplay: ").append(toIndentedString(statementDisplay)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
