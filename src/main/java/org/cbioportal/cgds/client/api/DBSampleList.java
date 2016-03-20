package org.cbioportal.cgds.client.api;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-20T14:16:09.932+05:30")
public class DBSampleList   {
  
  private String description = null;
  private String id = null;
  private String name = null;
  private List<String> sampleIds = new ArrayList<String>();
  private String studyId = null;

  
  /**
   **/
  public DBSampleList description(String description) {
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
  public DBSampleList id(String id) {
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
  public DBSampleList name(String name) {
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
  public DBSampleList sampleIds(List<String> sampleIds) {
    this.sampleIds = sampleIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sample_ids")
  public List<String> getSampleIds() {
    return sampleIds;
  }
  public void setSampleIds(List<String> sampleIds) {
    this.sampleIds = sampleIds;
  }

  
  /**
   **/
  public DBSampleList studyId(String studyId) {
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
    DBSampleList dBSampleList = (DBSampleList) o;
    return Objects.equals(this.description, dBSampleList.description) &&
        Objects.equals(this.id, dBSampleList.id) &&
        Objects.equals(this.name, dBSampleList.name) &&
        Objects.equals(this.sampleIds, dBSampleList.sampleIds) &&
        Objects.equals(this.studyId, dBSampleList.studyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, name, sampleIds, studyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DBSampleList {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sampleIds: ").append(toIndentedString(sampleIds)).append("\n");
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

