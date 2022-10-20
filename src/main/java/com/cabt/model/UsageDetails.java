package com.cabt.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * UsageDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-10-18T20:03:09.500Z[GMT]")


public class UsageDetails   {
  @JsonProperty("dependentStatements")
  private String dependentStatements = null;

  public UsageDetails dependentStatements(String dependentStatements) {
    this.dependentStatements = dependentStatements;
    return this;
  }

  /**
   * Get dependentStatements
   * @return dependentStatements
   **/
  @Schema(example = "dependentStatements", description = "")
  
    public String getDependentStatements() {
    return dependentStatements;
  }

  public void setDependentStatements(String dependentStatements) {
    this.dependentStatements = dependentStatements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageDetails usageDetails = (UsageDetails) o;
    return Objects.equals(this.dependentStatements, usageDetails.dependentStatements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dependentStatements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageDetails {\n");
    
    sb.append("    dependentStatements: ").append(toIndentedString(dependentStatements)).append("\n");
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
