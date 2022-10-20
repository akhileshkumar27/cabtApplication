package com.cabt.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * FrequencyType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-10-18T20:03:09.500Z[GMT]")


public class FrequencyType   {
  @JsonProperty("frequencyType")
  private String frequencyType = null;

  @JsonProperty("frequencyValue")
  private String frequencyValue = null;

  public FrequencyType frequencyType(String frequencyType) {
    this.frequencyType = frequencyType;
    return this;
  }

  /**
   * Get frequencyType
   * @return frequencyType
   **/
  @Schema(example = "fnName", description = "")
  
    public String getFrequencyType() {
    return frequencyType;
  }

  public void setFrequencyType(String frequencyType) {
    this.frequencyType = frequencyType;
  }

  public FrequencyType frequencyValue(String frequencyValue) {
    this.frequencyValue = frequencyValue;
    return this;
  }

  /**
   * Get frequencyValue
   * @return frequencyValue
   **/
  @Schema(example = "1", description = "")
  
    public String getFrequencyValue() {
    return frequencyValue;
  }

  public void setFrequencyValue(String frequencyValue) {
    this.frequencyValue = frequencyValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FrequencyType frequencyType = (FrequencyType) o;
    return Objects.equals(this.frequencyType, frequencyType.frequencyType) &&
        Objects.equals(this.frequencyValue, frequencyType.frequencyValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frequencyType, frequencyValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FrequencyType {\n");
    
    sb.append("    frequencyType: ").append(toIndentedString(frequencyType)).append("\n");
    sb.append("    frequencyValue: ").append(toIndentedString(frequencyValue)).append("\n");
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
