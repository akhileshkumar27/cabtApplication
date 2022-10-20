package com.cabt.model;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Models
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-10-18T20:03:09.500Z[GMT]")


public class Models   {
  @JsonProperty("model")
  private String model = null;

  @JsonProperty("primaryConcepts")
  private ModelsDetails primaryConcepts = null;

  @JsonProperty("modifierConcepts")
  private ModelsDetails modifierConcepts = null;

  @JsonProperty("negateModifier")
  private Boolean negateModifier = null;

  @JsonProperty("invalidStatusConcepts")
  private ModelsDetails invalidStatusConcepts = null;

  @JsonProperty("problemConcepts")
  private ModelsDetails problemConcepts = null;

  @JsonProperty("primaryDiagnosisConcepts")
  private Boolean primaryDiagnosisConcepts = null;

  public Models model(String model) {
    this.model = model;
    return this;
  }

  /**
   * Get model
   * @return model
   **/
  @Schema(example = "1", description = "")
  
    public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public Models primaryConcepts(ModelsDetails primaryConcepts) {
    this.primaryConcepts = primaryConcepts;
    return this;
  }

  /**
   * Get primaryConcepts
   * @return primaryConcepts
   **/
  @Schema(description = "")
  
    @Valid
    public ModelsDetails getPrimaryConcepts() {
    return primaryConcepts;
  }

  public void setPrimaryConcepts(ModelsDetails primaryConcepts) {
    this.primaryConcepts = primaryConcepts;
  }

  public Models modifierConcepts(ModelsDetails modifierConcepts) {
    this.modifierConcepts = modifierConcepts;
    return this;
  }

  /**
   * Get modifierConcepts
   * @return modifierConcepts
   **/
  @Schema(description = "")
  
    @Valid
    public ModelsDetails getModifierConcepts() {
    return modifierConcepts;
  }

  public void setModifierConcepts(ModelsDetails modifierConcepts) {
    this.modifierConcepts = modifierConcepts;
  }

  public Models negateModifier(Boolean negateModifier) {
    this.negateModifier = negateModifier;
    return this;
  }

  /**
   * Get negateModifier
   * @return negateModifier
   **/
  @Schema(example = "true", description = "")
  
    public Boolean isNegateModifier() {
    return negateModifier;
  }

  public void setNegateModifier(Boolean negateModifier) {
    this.negateModifier = negateModifier;
  }

  public Models invalidStatusConcepts(ModelsDetails invalidStatusConcepts) {
    this.invalidStatusConcepts = invalidStatusConcepts;
    return this;
  }

  /**
   * Get invalidStatusConcepts
   * @return invalidStatusConcepts
   **/
  @Schema(description = "")
  
    @Valid
    public ModelsDetails getInvalidStatusConcepts() {
    return invalidStatusConcepts;
  }

  public void setInvalidStatusConcepts(ModelsDetails invalidStatusConcepts) {
    this.invalidStatusConcepts = invalidStatusConcepts;
  }

  public Models problemConcepts(ModelsDetails problemConcepts) {
    this.problemConcepts = problemConcepts;
    return this;
  }

  /**
   * Get problemConcepts
   * @return problemConcepts
   **/
  @Schema(description = "")
  
    @Valid
    public ModelsDetails getProblemConcepts() {
    return problemConcepts;
  }

  public void setProblemConcepts(ModelsDetails problemConcepts) {
    this.problemConcepts = problemConcepts;
  }

  public Models primaryDiagnosisConcepts(Boolean primaryDiagnosisConcepts) {
    this.primaryDiagnosisConcepts = primaryDiagnosisConcepts;
    return this;
  }

  /**
   * Get primaryDiagnosisConcepts
   * @return primaryDiagnosisConcepts
   **/
  @Schema(example = "true", description = "")
  
    public Boolean isPrimaryDiagnosisConcepts() {
    return primaryDiagnosisConcepts;
  }

  public void setPrimaryDiagnosisConcepts(Boolean primaryDiagnosisConcepts) {
    this.primaryDiagnosisConcepts = primaryDiagnosisConcepts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Models models = (Models) o;
    return Objects.equals(this.model, models.model) &&
        Objects.equals(this.primaryConcepts, models.primaryConcepts) &&
        Objects.equals(this.modifierConcepts, models.modifierConcepts) &&
        Objects.equals(this.negateModifier, models.negateModifier) &&
        Objects.equals(this.invalidStatusConcepts, models.invalidStatusConcepts) &&
        Objects.equals(this.problemConcepts, models.problemConcepts) &&
        Objects.equals(this.primaryDiagnosisConcepts, models.primaryDiagnosisConcepts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, primaryConcepts, modifierConcepts, negateModifier, invalidStatusConcepts, problemConcepts, primaryDiagnosisConcepts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Models {\n");
    
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    primaryConcepts: ").append(toIndentedString(primaryConcepts)).append("\n");
    sb.append("    modifierConcepts: ").append(toIndentedString(modifierConcepts)).append("\n");
    sb.append("    negateModifier: ").append(toIndentedString(negateModifier)).append("\n");
    sb.append("    invalidStatusConcepts: ").append(toIndentedString(invalidStatusConcepts)).append("\n");
    sb.append("    problemConcepts: ").append(toIndentedString(problemConcepts)).append("\n");
    sb.append("    primaryDiagnosisConcepts: ").append(toIndentedString(primaryDiagnosisConcepts)).append("\n");
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
