package com.cabt.model;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;
import org.threeten.bp.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * StatementNew
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-10-18T20:47:36.391Z[GMT]")


public class StatementNew   {
  @JsonProperty("scope")
  private String scope = null;

  @JsonProperty("recordName")
  private String recordName = null;

  @JsonProperty("statementAlias")
  private String statementAlias = null;

  @JsonProperty("statementDisplay")
  private String statementDisplay = null;

  @JsonProperty("statementText")
  private String statementText = null;

  @JsonProperty("statementDependencyAlias")
  private String statementDependencyAlias = null;

  @JsonProperty("models")
  private Models models = null;

  @JsonProperty("recordOperations")
  private UsageDetails recordOperations = null;

  @JsonProperty("dateOperations")
  private UsageDetails dateOperations = null;

  @JsonProperty("requiredOperations")
  private UsageDetails requiredOperations = null;

  @JsonProperty("selector")
  private String selector = null;

  @JsonProperty("cardinality")
  private Integer cardinality = null;

  @JsonProperty("withDistinct")
  private String withDistinct = null;

  @JsonProperty("negateStatement")
  private Boolean negateStatement = null;

  @JsonProperty("usage")
  private UsageDetails usage = null;

  @JsonProperty("frequency")
  private FrequencyType frequency = null;

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

  @JsonProperty("baseVersion")
  private String baseVersion = null;

  @JsonProperty("author")
  private String author = null;

  @JsonProperty("createdAt")
  private OffsetDateTime createdAt = null;

  @JsonProperty("createdBy")
  private String createdBy = null;

  @JsonProperty("updatedAt")
  private OffsetDateTime updatedAt = null;

  @JsonProperty("updatedBy")
  private String updatedBy = null;

  public StatementNew scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Get scope
   * @return scope
   **/
  @Schema(example = "scope", description = "")
  
    public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public StatementNew recordName(String recordName) {
    this.recordName = recordName;
    return this;
  }

  /**
   * Get recordName
   * @return recordName
   **/
  @Schema(example = "recordName", description = "")
  
    public String getRecordName() {
    return recordName;
  }

  public void setRecordName(String recordName) {
    this.recordName = recordName;
  }

  public StatementNew statementAlias(String statementAlias) {
    this.statementAlias = statementAlias;
    return this;
  }

  /**
   * Get statementAlias
   * @return statementAlias
   **/
  @Schema(example = "Alias", description = "")
  
    public String getStatementAlias() {
    return statementAlias;
  }

  public void setStatementAlias(String statementAlias) {
    this.statementAlias = statementAlias;
  }

  public StatementNew statementDisplay(String statementDisplay) {
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

  public StatementNew statementText(String statementText) {
    this.statementText = statementText;
    return this;
  }

  /**
   * Get statementText
   * @return statementText
   **/
  @Schema(example = "statementText", description = "")
  
    public String getStatementText() {
    return statementText;
  }

  public void setStatementText(String statementText) {
    this.statementText = statementText;
  }

  public StatementNew statementDependencyAlias(String statementDependencyAlias) {
    this.statementDependencyAlias = statementDependencyAlias;
    return this;
  }

  /**
   * Get statementDependencyAlias
   * @return statementDependencyAlias
   **/
  @Schema(example = "statementDependencyAlias", description = "")
  
    public String getStatementDependencyAlias() {
    return statementDependencyAlias;
  }

  public void setStatementDependencyAlias(String statementDependencyAlias) {
    this.statementDependencyAlias = statementDependencyAlias;
  }

  public StatementNew models(Models models) {
    this.models = models;
    return this;
  }

  /**
   * Get models
   * @return models
   **/
  @Schema(description = "")
  
    @Valid
    public Models getModels() {
    return models;
  }

  public void setModels(Models models) {
    this.models = models;
  }

  public StatementNew recordOperations(UsageDetails recordOperations) {
    this.recordOperations = recordOperations;
    return this;
  }

  /**
   * Get recordOperations
   * @return recordOperations
   **/
  @Schema(description = "")
  
    @Valid
    public UsageDetails getRecordOperations() {
    return recordOperations;
  }

  public void setRecordOperations(UsageDetails recordOperations) {
    this.recordOperations = recordOperations;
  }

  public StatementNew dateOperations(UsageDetails dateOperations) {
    this.dateOperations = dateOperations;
    return this;
  }

  /**
   * Get dateOperations
   * @return dateOperations
   **/
  @Schema(description = "")
  
    @Valid
    public UsageDetails getDateOperations() {
    return dateOperations;
  }

  public void setDateOperations(UsageDetails dateOperations) {
    this.dateOperations = dateOperations;
  }

  public StatementNew requiredOperations(UsageDetails requiredOperations) {
    this.requiredOperations = requiredOperations;
    return this;
  }

  /**
   * Get requiredOperations
   * @return requiredOperations
   **/
  @Schema(description = "")
  
    @Valid
    public UsageDetails getRequiredOperations() {
    return requiredOperations;
  }

  public void setRequiredOperations(UsageDetails requiredOperations) {
    this.requiredOperations = requiredOperations;
  }

  public StatementNew selector(String selector) {
    this.selector = selector;
    return this;
  }

  /**
   * Get selector
   * @return selector
   **/
  @Schema(description = "")
  
    public String getSelector() {
    return selector;
  }

  public void setSelector(String selector) {
    this.selector = selector;
  }

  public StatementNew cardinality(Integer cardinality) {
    this.cardinality = cardinality;
    return this;
  }

  /**
   * Get cardinality
   * @return cardinality
   **/
  @Schema(description = "")
  
    public Integer getCardinality() {
    return cardinality;
  }

  public void setCardinality(Integer cardinality) {
    this.cardinality = cardinality;
  }

  public StatementNew withDistinct(String withDistinct) {
    this.withDistinct = withDistinct;
    return this;
  }

  /**
   * Get withDistinct
   * @return withDistinct
   **/
  @Schema(description = "")
  
    public String getWithDistinct() {
    return withDistinct;
  }

  public void setWithDistinct(String withDistinct) {
    this.withDistinct = withDistinct;
  }

  public StatementNew negateStatement(Boolean negateStatement) {
    this.negateStatement = negateStatement;
    return this;
  }

  /**
   * Get negateStatement
   * @return negateStatement
   **/
  @Schema(description = "")
  
    public Boolean isNegateStatement() {
    return negateStatement;
  }

  public void setNegateStatement(Boolean negateStatement) {
    this.negateStatement = negateStatement;
  }

  public StatementNew usage(UsageDetails usage) {
    this.usage = usage;
    return this;
  }

  /**
   * Get usage
   * @return usage
   **/
  @Schema(description = "")
  
    @Valid
    public UsageDetails getUsage() {
    return usage;
  }

  public void setUsage(UsageDetails usage) {
    this.usage = usage;
  }

  public StatementNew frequency(FrequencyType frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Get frequency
   * @return frequency
   **/
  @Schema(description = "")
  
    @Valid
    public FrequencyType getFrequency() {
    return frequency;
  }

  public void setFrequency(FrequencyType frequency) {
    this.frequency = frequency;
  }

  public StatementNew status(StatusEnum status) {
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

  public StatementNew version(String version) {
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

  public StatementNew baseVersion(String baseVersion) {
    this.baseVersion = baseVersion;
    return this;
  }

  /**
   * Get baseVersion
   * @return baseVersion
   **/
  @Schema(example = "v1", description = "")
  
    public String getBaseVersion() {
    return baseVersion;
  }

  public void setBaseVersion(String baseVersion) {
    this.baseVersion = baseVersion;
  }

  public StatementNew author(String author) {
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

  public StatementNew createdAt(OffsetDateTime createdAt) {
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

  public StatementNew createdBy(String createdBy) {
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

  public StatementNew updatedAt(OffsetDateTime updatedAt) {
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

  public StatementNew updatedBy(String updatedBy) {
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
    StatementNew statementNew = (StatementNew) o;
    return Objects.equals(this.scope, statementNew.scope) &&
        Objects.equals(this.recordName, statementNew.recordName) &&
        Objects.equals(this.statementAlias, statementNew.statementAlias) &&
        Objects.equals(this.statementDisplay, statementNew.statementDisplay) &&
        Objects.equals(this.statementText, statementNew.statementText) &&
        Objects.equals(this.statementDependencyAlias, statementNew.statementDependencyAlias) &&
        Objects.equals(this.models, statementNew.models) &&
        Objects.equals(this.recordOperations, statementNew.recordOperations) &&
        Objects.equals(this.dateOperations, statementNew.dateOperations) &&
        Objects.equals(this.requiredOperations, statementNew.requiredOperations) &&
        Objects.equals(this.selector, statementNew.selector) &&
        Objects.equals(this.cardinality, statementNew.cardinality) &&
        Objects.equals(this.withDistinct, statementNew.withDistinct) &&
        Objects.equals(this.negateStatement, statementNew.negateStatement) &&
        Objects.equals(this.usage, statementNew.usage) &&
        Objects.equals(this.frequency, statementNew.frequency) &&
        Objects.equals(this.status, statementNew.status) &&
        Objects.equals(this.version, statementNew.version) &&
        Objects.equals(this.baseVersion, statementNew.baseVersion) &&
        Objects.equals(this.author, statementNew.author) &&
        Objects.equals(this.createdAt, statementNew.createdAt) &&
        Objects.equals(this.createdBy, statementNew.createdBy) &&
        Objects.equals(this.updatedAt, statementNew.updatedAt) &&
        Objects.equals(this.updatedBy, statementNew.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scope, recordName, statementAlias, statementDisplay, statementText, statementDependencyAlias, models, recordOperations, dateOperations, requiredOperations, selector, cardinality, withDistinct, negateStatement, usage, frequency, status, version, baseVersion, author, createdAt, createdBy, updatedAt, updatedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatementNew {\n");
    
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    recordName: ").append(toIndentedString(recordName)).append("\n");
    sb.append("    statementAlias: ").append(toIndentedString(statementAlias)).append("\n");
    sb.append("    statementDisplay: ").append(toIndentedString(statementDisplay)).append("\n");
    sb.append("    statementText: ").append(toIndentedString(statementText)).append("\n");
    sb.append("    statementDependencyAlias: ").append(toIndentedString(statementDependencyAlias)).append("\n");
    sb.append("    models: ").append(toIndentedString(models)).append("\n");
    sb.append("    recordOperations: ").append(toIndentedString(recordOperations)).append("\n");
    sb.append("    dateOperations: ").append(toIndentedString(dateOperations)).append("\n");
    sb.append("    requiredOperations: ").append(toIndentedString(requiredOperations)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    cardinality: ").append(toIndentedString(cardinality)).append("\n");
    sb.append("    withDistinct: ").append(toIndentedString(withDistinct)).append("\n");
    sb.append("    negateStatement: ").append(toIndentedString(negateStatement)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    baseVersion: ").append(toIndentedString(baseVersion)).append("\n");
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
