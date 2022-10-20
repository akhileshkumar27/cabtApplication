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
import lombok.Builder;

/**
 * StatementGroupNew
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-10-08T12:16:03.593Z[GMT]")

@Builder
public class StatementGroupNew   {
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

  @JsonProperty("createdAt")
  private Date createdAt = null;

  @JsonProperty("createdBy")
  private String createdBy = null;

  public StatementGroupNew statementGroupId(String statementGroupId) {
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

  public StatementGroupNew scope(Scope scope) {
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

  public StatementGroupNew statementGroupSummary(String statementGroupSummary) {
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

  public StatementGroupNew statementGroupDisplay(String statementGroupDisplay) {
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

  public StatementGroupNew status(StatusEnum status) {
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

  public StatementGroupNew version(String version) {
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

  public StatementGroupNew author(String author) {
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

  public StatementGroupNew createdAt(Date createdAt) {
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

  public StatementGroupNew createdBy(String createdBy) {
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
    StatementGroupNew statementGroupNew = (StatementGroupNew) o;
    return Objects.equals(this.statementGroupId, statementGroupNew.statementGroupId) &&
        Objects.equals(this.scope, statementGroupNew.scope) &&
        Objects.equals(this.statementGroupSummary, statementGroupNew.statementGroupSummary) &&
        Objects.equals(this.statementGroupDisplay, statementGroupNew.statementGroupDisplay) &&
        Objects.equals(this.status, statementGroupNew.status) &&
        Objects.equals(this.version, statementGroupNew.version) &&
        Objects.equals(this.author, statementGroupNew.author) &&
        Objects.equals(this.createdAt, statementGroupNew.createdAt) &&
        Objects.equals(this.createdBy, statementGroupNew.createdBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statementGroupId, scope, statementGroupSummary, statementGroupDisplay, status, version, author, createdAt, createdBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatementGroupNew {\n");
    
    sb.append("    statementGroupId: ").append(toIndentedString(statementGroupId)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    statementGroupSummary: ").append(toIndentedString(statementGroupSummary)).append("\n");
    sb.append("    statementGroupDisplay: ").append(toIndentedString(statementGroupDisplay)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
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
