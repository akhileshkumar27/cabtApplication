package com.cabt.model;

import java.math.BigDecimal;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * StatementMinified
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-10-18T20:03:09.500Z[GMT]")


public class StatementMinified   {
  @JsonProperty("statementId")
  private String statementId = null;

  @JsonProperty("scope")
  private StatementScope scope = null;

  @JsonProperty("statementGroupDisplay")
  private String statementGroupDisplay = null;

  @JsonProperty("totalResults")
  private BigDecimal totalResults = null;

  @JsonProperty("firstLink")
  private String firstLink = null;

  @JsonProperty("lastLink")
  private String lastLink = null;

  @JsonProperty("prevLink")
  private String prevLink = null;

  @JsonProperty("nextLink")
  private String nextLink = null;

  public StatementMinified statementId(String statementId) {
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

  public StatementMinified scope(StatementScope scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Get scope
   * @return scope
   **/
  @Schema(description = "")
  
    @Valid
    public StatementScope getScope() {
    return scope;
  }

  public void setScope(StatementScope scope) {
    this.scope = scope;
  }

  public StatementMinified statementGroupDisplay(String statementGroupDisplay) {
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

  public StatementMinified totalResults(BigDecimal totalResults) {
    this.totalResults = totalResults;
    return this;
  }

  /**
   * Get totalResults
   * @return totalResults
   **/
  @Schema(example = "200", description = "")
  
    @Valid
    public BigDecimal getTotalResults() {
    return totalResults;
  }

  public void setTotalResults(BigDecimal totalResults) {
    this.totalResults = totalResults;
  }

  public StatementMinified firstLink(String firstLink) {
    this.firstLink = firstLink;
    return this;
  }

  /**
   * Get firstLink
   * @return firstLink
   **/
  @Schema(example = "https://localhost:3000/statement?offset=0&limit=20", description = "")
  
    public String getFirstLink() {
    return firstLink;
  }

  public void setFirstLink(String firstLink) {
    this.firstLink = firstLink;
  }

  public StatementMinified lastLink(String lastLink) {
    this.lastLink = lastLink;
    return this;
  }

  /**
   * Get lastLink
   * @return lastLink
   **/
  @Schema(example = "https://localhost:3000/statement?offset=41&limit=20", description = "")
  
    public String getLastLink() {
    return lastLink;
  }

  public void setLastLink(String lastLink) {
    this.lastLink = lastLink;
  }

  public StatementMinified prevLink(String prevLink) {
    this.prevLink = prevLink;
    return this;
  }

  /**
   * Get prevLink
   * @return prevLink
   **/
  @Schema(example = "https://localhost:3000/statement?offset=0&limit=20", description = "")
  
    public String getPrevLink() {
    return prevLink;
  }

  public void setPrevLink(String prevLink) {
    this.prevLink = prevLink;
  }

  public StatementMinified nextLink(String nextLink) {
    this.nextLink = nextLink;
    return this;
  }

  /**
   * Get nextLink
   * @return nextLink
   **/
  @Schema(example = "https://localhost:3000/statement?offset=181&limit=20", description = "")
  
    public String getNextLink() {
    return nextLink;
  }

  public void setNextLink(String nextLink) {
    this.nextLink = nextLink;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatementMinified statementMinified = (StatementMinified) o;
    return Objects.equals(this.statementId, statementMinified.statementId) &&
        Objects.equals(this.scope, statementMinified.scope) &&
        Objects.equals(this.statementGroupDisplay, statementMinified.statementGroupDisplay) &&
        Objects.equals(this.totalResults, statementMinified.totalResults) &&
        Objects.equals(this.firstLink, statementMinified.firstLink) &&
        Objects.equals(this.lastLink, statementMinified.lastLink) &&
        Objects.equals(this.prevLink, statementMinified.prevLink) &&
        Objects.equals(this.nextLink, statementMinified.nextLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statementId, scope, statementGroupDisplay, totalResults, firstLink, lastLink, prevLink, nextLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatementMinified {\n");
    
    sb.append("    statementId: ").append(toIndentedString(statementId)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    statementGroupDisplay: ").append(toIndentedString(statementGroupDisplay)).append("\n");
    sb.append("    totalResults: ").append(toIndentedString(totalResults)).append("\n");
    sb.append("    firstLink: ").append(toIndentedString(firstLink)).append("\n");
    sb.append("    lastLink: ").append(toIndentedString(lastLink)).append("\n");
    sb.append("    prevLink: ").append(toIndentedString(prevLink)).append("\n");
    sb.append("    nextLink: ").append(toIndentedString(nextLink)).append("\n");
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
