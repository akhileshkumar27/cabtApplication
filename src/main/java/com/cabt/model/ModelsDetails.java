package com.cabt.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ModelsDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-10-18T20:03:09.500Z[GMT]")


public class ModelsDetails   {
  @JsonProperty("conceptId")
  private String conceptId = null;

  @JsonProperty("conceptAlias")
  private String conceptAlias = null;

  @JsonProperty("contextId")
  private String contextId = null;

  public ModelsDetails conceptId(String conceptId) {
    this.conceptId = conceptId;
    return this;
  }

  /**
   * Get conceptId
   * @return conceptId
   **/
  @Schema(example = "uuid", description = "")
  
    public String getConceptId() {
    return conceptId;
  }

  public void setConceptId(String conceptId) {
    this.conceptId = conceptId;
  }

  public ModelsDetails conceptAlias(String conceptAlias) {
    this.conceptAlias = conceptAlias;
    return this;
  }

  /**
   * Get conceptAlias
   * @return conceptAlias
   **/
  @Schema(example = "1", description = "")
  
    public String getConceptAlias() {
    return conceptAlias;
  }

  public void setConceptAlias(String conceptAlias) {
    this.conceptAlias = conceptAlias;
  }

  public ModelsDetails contextId(String contextId) {
    this.contextId = contextId;
    return this;
  }

  /**
   * Get contextId
   * @return contextId
   **/
  @Schema(example = "uuid", description = "")
  
    public String getContextId() {
    return contextId;
  }

  public void setContextId(String contextId) {
    this.contextId = contextId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsDetails modelsDetails = (ModelsDetails) o;
    return Objects.equals(this.conceptId, modelsDetails.conceptId) &&
        Objects.equals(this.conceptAlias, modelsDetails.conceptAlias) &&
        Objects.equals(this.contextId, modelsDetails.contextId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conceptId, conceptAlias, contextId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsDetails {\n");
    
    sb.append("    conceptId: ").append(toIndentedString(conceptId)).append("\n");
    sb.append("    conceptAlias: ").append(toIndentedString(conceptAlias)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
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
