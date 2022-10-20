package com.cabt.model;

import java.util.Date;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * StatementDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-10-08T12:16:03.593Z[GMT]")


public class StatementDetails   {
  @JsonProperty("statementGroupId")
  private String statementGroupId = null;

  @JsonProperty("scope")
  private Scope scope = null;

  @JsonProperty("statementGroupAlias")
  private String statementGroupAlias = null;

  @JsonProperty("statementGroupSummary")
  private String statementGroupSummary = null;

  @JsonProperty("statementGroupDisplay")
  private String statementGroupDisplay = null;

  @JsonProperty("statementGroupOperation")
  private Arguments statementGroupOperation = null;

  /**
   * Status
   */
  public enum StatusEnum {
    DRAFT("Draft"),
    
    PUBLISHED("Published"),
    
    HISTORY("History"),
    
    INVALID("Invalid");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("author")
  private String author = null;

  @JsonProperty("createdAt")
  private Date createdAt = null;

  @JsonProperty("createdBy")
  private String createdBy = null;

  @JsonProperty("updatedAt")
  private Date updatedAt = null;

  @JsonProperty("updatedBy")
  private String updatedBy = null;

  public StatementDetails statementGroupId(String statementGroupId) {
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

  public StatementDetails scope(Scope scope) {
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

  public StatementDetails statementGroupAlias(String statementGroupAlias) {
    this.statementGroupAlias = statementGroupAlias;
    return this;
  }

  /**
   * Get statementGroupAlias
   * @return statementGroupAlias
   **/
  @Schema(example = "GroupAlias", description = "")
  
    public String getStatementGroupAlias() {
    return statementGroupAlias;
  }

  public void setStatementGroupAlias(String statementGroupAlias) {
    this.statementGroupAlias = statementGroupAlias;
  }

  public StatementDetails statementGroupSummary(String statementGroupSummary) {
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

  public StatementDetails statementGroupDisplay(String statementGroupDisplay) {
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

  public StatementDetails statementGroupOperation(Arguments statementGroupOperation) {
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

  public StatementDetails status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Status
   * @return status
   **/
  @Schema(example = "Draft", description = "Status")
  
    public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public StatementDetails version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   **/
  @Schema(example = "v1", description = "")
  
    public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public StatementDetails author(String author) {
    this.author = author;
    return this;
  }

  /**
   * Get author
   * @return author
   **/
  @Schema(example = "auther", description = "")
  
    public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public StatementDetails createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   **/
  @Schema(description = "")
  
    @Valid
    public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public StatementDetails createdBy(String createdBy) {
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

  public StatementDetails updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
   **/
  @Schema(description = "")
  
    @Valid
    public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  public StatementDetails updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  /**
   * Get updatedBy
   * @return updatedBy
   **/
  @Schema(example = "uuid", description = "")
  
    public String getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatementDetails statementDetails = (StatementDetails) o;
    return Objects.equals(this.statementGroupId, statementDetails.statementGroupId) &&
        Objects.equals(this.scope, statementDetails.scope) &&
        Objects.equals(this.statementGroupAlias, statementDetails.statementGroupAlias) &&
        Objects.equals(this.statementGroupSummary, statementDetails.statementGroupSummary) &&
        Objects.equals(this.statementGroupDisplay, statementDetails.statementGroupDisplay) &&
        Objects.equals(this.statementGroupOperation, statementDetails.statementGroupOperation) &&
        Objects.equals(this.status, statementDetails.status) &&
        Objects.equals(this.version, statementDetails.version) &&
        Objects.equals(this.author, statementDetails.author) &&
        Objects.equals(this.createdAt, statementDetails.createdAt) &&
        Objects.equals(this.createdBy, statementDetails.createdBy) &&
        Objects.equals(this.updatedAt, statementDetails.updatedAt) &&
        Objects.equals(this.updatedBy, statementDetails.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statementGroupId, scope, statementGroupAlias, statementGroupSummary, statementGroupDisplay, statementGroupOperation, status, version, author, createdAt, createdBy, updatedAt, updatedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatementDetails {\n");
    
    sb.append("    statementGroupId: ").append(toIndentedString(statementGroupId)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    statementGroupAlias: ").append(toIndentedString(statementGroupAlias)).append("\n");
    sb.append("    statementGroupSummary: ").append(toIndentedString(statementGroupSummary)).append("\n");
    sb.append("    statementGroupDisplay: ").append(toIndentedString(statementGroupDisplay)).append("\n");
    sb.append("    statementGroupOperation: ").append(toIndentedString(statementGroupOperation)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
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
