package org.cbioportal.cgds.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-20T14:48:37.396+05:30")
public class DBGeneticProfile   {
  
  private String datatype = null;
  private String description = null;
  private String geneticAlterationType = null;
  private String id = null;
  private String name = null;
  private String showProfileInAnalysisTab = null;
  private String studyId = null;

  
  /**
   **/
  public DBGeneticProfile datatype(String datatype) {
    this.datatype = datatype;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("datatype")
  public String getDatatype() {
    return datatype;
  }
  public void setDatatype(String datatype) {
    this.datatype = datatype;
  }

  
  /**
   **/
  public DBGeneticProfile description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  public DBGeneticProfile geneticAlterationType(String geneticAlterationType) {
    this.geneticAlterationType = geneticAlterationType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("genetic_alteration_type")
  public String getGeneticAlterationType() {
    return geneticAlterationType;
  }
  public void setGeneticAlterationType(String geneticAlterationType) {
    this.geneticAlterationType = geneticAlterationType;
  }

  
  /**
   **/
  public DBGeneticProfile id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public DBGeneticProfile name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public DBGeneticProfile showProfileInAnalysisTab(String showProfileInAnalysisTab) {
    this.showProfileInAnalysisTab = showProfileInAnalysisTab;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("show_profile_in_analysis_tab")
  public String getShowProfileInAnalysisTab() {
    return showProfileInAnalysisTab;
  }
  public void setShowProfileInAnalysisTab(String showProfileInAnalysisTab) {
    this.showProfileInAnalysisTab = showProfileInAnalysisTab;
  }

  
  /**
   **/
  public DBGeneticProfile studyId(String studyId) {
    this.studyId = studyId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("study_id")
  public String getStudyId() {
    return studyId;
  }
  public void setStudyId(String studyId) {
    this.studyId = studyId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DBGeneticProfile dBGeneticProfile = (DBGeneticProfile) o;
    return Objects.equals(this.datatype, dBGeneticProfile.datatype) &&
        Objects.equals(this.description, dBGeneticProfile.description) &&
        Objects.equals(this.geneticAlterationType, dBGeneticProfile.geneticAlterationType) &&
        Objects.equals(this.id, dBGeneticProfile.id) &&
        Objects.equals(this.name, dBGeneticProfile.name) &&
        Objects.equals(this.showProfileInAnalysisTab, dBGeneticProfile.showProfileInAnalysisTab) &&
        Objects.equals(this.studyId, dBGeneticProfile.studyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datatype, description, geneticAlterationType, id, name, showProfileInAnalysisTab, studyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DBGeneticProfile {\n");
    
    sb.append("    datatype: ").append(toIndentedString(datatype)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    geneticAlterationType: ").append(toIndentedString(geneticAlterationType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    showProfileInAnalysisTab: ").append(toIndentedString(showProfileInAnalysisTab)).append("\n");
    sb.append("    studyId: ").append(toIndentedString(studyId)).append("\n");
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

