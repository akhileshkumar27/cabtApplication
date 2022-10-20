package com.cabt.model;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;
import org.threeten.bp.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * StatementGroupUpdate
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-10-08T12:16:03.593Z[GMT]")


public class StatementGroupUpdate   {
  @JsonProperty("statementGroupId")
  private String statementGroupId = null;

  @JsonProperty("scope")
  private Scope scope = null;

  @JsonProperty("statementGroupSummary")
  private String statementGroupSummary = null;

  @JsonProperty("statementGroupDisplay")
  private String statementGroupDisplay = null;

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

  @JsonProperty("updatedAt")
  private OffsetDateTime updatedAt = null;

  @JsonProperty("updatedBy")
  private String updatedBy = null;

  public StatementGroupUpdate statementGroupId(String statementGroupId) {
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

  public StatementGroupUpdate scope(Scope scope) {
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

  public StatementGroupUpdate statementGroupSummary(String statementGroupSummary) {
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

  public StatementGroupUpdate statementGroupDisplay(String statementGroupDisplay) {
    this.statementGroupDisplay = statementGroupDisplay;
    return this;
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

  public StatementGroupUpdate status(StatusEnum status) {
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

  public StatementGroupUpdate version(String version) {
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

  public StatementGroupUpdate author(String author) {
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

  public StatementGroupUpdate updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
   **/
  @Schema(description = "")
  
    @Valid
    public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public StatementGroupUpdate updatedBy(String updatedBy) {
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
    StatementGroupUpdate statementGroupUpdate = (StatementGroupUpdate) o;
    return Objects.equals(this.statementGroupId, statementGroupUpdate.statementGroupId) &&
        Objects.equals(this.scope, statementGroupUpdate.scope) &&
        Objects.equals(this.statementGroupSummary, statementGroupUpdate.statementGroupSummary) &&
        Objects.equals(this.statementGroupDisplay, statementGroupUpdate.statementGroupDisplay) &&
        Objects.equals(this.status, statementGroupUpdate.status) &&
        Objects.equals(this.version, statementGroupUpdate.version) &&
        Objects.equals(this.author, statementGroupUpdate.author) &&
        Objects.equals(this.updatedAt, statementGroupUpdate.updatedAt) &&
        Objects.equals(this.updatedBy, statementGroupUpdate.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statementGroupId, scope, statementGroupSummary, statementGroupDisplay, status, version, author, updatedAt, updatedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatementGroupUpdate {\n");
    
    sb.append("    statementGroupId: ").append(toIndentedString(statementGroupId)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    statementGroupSummary: ").append(toIndentedString(statementGroupSummary)).append("\n");
    sb.append("    statementGroupDisplay: ").append(toIndentedString(statementGroupDisplay)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
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
