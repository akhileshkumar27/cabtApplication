package com.cabt.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * StatementScope
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-10-18T20:03:09.500Z[GMT]")


public class StatementScope   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("statementAlias")
  private String statementAlias = null;

  public StatementScope id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(example = "1", description = "")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public StatementScope name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(example = "Test", description = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StatementScope statementAlias(String statementAlias) {
    this.statementAlias = statementAlias;
    return this;
  }

  /**
   * Get statementAlias
   * @return statementAlias
   **/
  @Schema(example = "TestAlias", description = "")
  
    public String getStatementAlias() {
    return statementAlias;
  }

  public void setStatementAlias(String statementAlias) {
    this.statementAlias = statementAlias;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatementScope statementScope = (StatementScope) o;
    return Objects.equals(this.id, statementScope.id) &&
        Objects.equals(this.name, statementScope.name) &&
        Objects.equals(this.statementAlias, statementScope.statementAlias);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, statementAlias);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatementScope {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    statementAlias: ").append(toIndentedString(statementAlias)).append("\n");
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
