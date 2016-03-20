package org.cbioportal.cgds.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-20T14:48:37.396+05:30")
public class DBSample   {
  
  private String id = null;
  private String internalId = null;
  private String patientId = null;
  private String sampleType = null;
  private String studyId = null;

  
  /**
   **/
  public DBSample id(String id) {
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
  public DBSample internalId(String internalId) {
    this.internalId = internalId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("internal_id")
  public String getInternalId() {
    return internalId;
  }
  public void setInternalId(String internalId) {
    this.internalId = internalId;
  }

  
  /**
   **/
  public DBSample patientId(String patientId) {
    this.patientId = patientId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("patient_id")
  public String getPatientId() {
    return patientId;
  }
  public void setPatientId(String patientId) {
    this.patientId = patientId;
  }

  
  /**
   **/
  public DBSample sampleType(String sampleType) {
    this.sampleType = sampleType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sample_type")
  public String getSampleType() {
    return sampleType;
  }
  public void setSampleType(String sampleType) {
    this.sampleType = sampleType;
  }

  
  /**
   **/
  public DBSample studyId(String studyId) {
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
    DBSample dBSample = (DBSample) o;
    return Objects.equals(this.id, dBSample.id) &&
        Objects.equals(this.internalId, dBSample.internalId) &&
        Objects.equals(this.patientId, dBSample.patientId) &&
        Objects.equals(this.sampleType, dBSample.sampleType) &&
        Objects.equals(this.studyId, dBSample.studyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, internalId, patientId, sampleType, studyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DBSample {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    internalId: ").append(toIndentedString(internalId)).append("\n");
    sb.append("    patientId: ").append(toIndentedString(patientId)).append("\n");
    sb.append("    sampleType: ").append(toIndentedString(sampleType)).append("\n");
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

