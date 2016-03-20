package org.cbioportal.cgds.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-20T14:48:37.396+05:30")
public class DBPatient   {
  
  private String id = null;
  private String studyId = null;

  
  /**
   **/
  public DBPatient id(String id) {
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
  public DBPatient studyId(String studyId) {
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
    DBPatient dBPatient = (DBPatient) o;
    return Objects.equals(this.id, dBPatient.id) &&
        Objects.equals(this.studyId, dBPatient.studyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, studyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DBPatient {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

