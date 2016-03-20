package org.cbioportal.cgds.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-20T14:48:37.396+05:30")
public class DBClinicalSampleData   {
  
  private String attrId = null;
  private String attrVal = null;
  private String sampleId = null;
  private String studyId = null;

  
  /**
   **/
  public DBClinicalSampleData attrId(String attrId) {
    this.attrId = attrId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("attr_id")
  public String getAttrId() {
    return attrId;
  }
  public void setAttrId(String attrId) {
    this.attrId = attrId;
  }

  
  /**
   **/
  public DBClinicalSampleData attrVal(String attrVal) {
    this.attrVal = attrVal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("attr_val")
  public String getAttrVal() {
    return attrVal;
  }
  public void setAttrVal(String attrVal) {
    this.attrVal = attrVal;
  }

  
  /**
   **/
  public DBClinicalSampleData sampleId(String sampleId) {
    this.sampleId = sampleId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sample_id")
  public String getSampleId() {
    return sampleId;
  }
  public void setSampleId(String sampleId) {
    this.sampleId = sampleId;
  }

  
  /**
   **/
  public DBClinicalSampleData studyId(String studyId) {
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
    DBClinicalSampleData dBClinicalSampleData = (DBClinicalSampleData) o;
    return Objects.equals(this.attrId, dBClinicalSampleData.attrId) &&
        Objects.equals(this.attrVal, dBClinicalSampleData.attrVal) &&
        Objects.equals(this.sampleId, dBClinicalSampleData.sampleId) &&
        Objects.equals(this.studyId, dBClinicalSampleData.studyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attrId, attrVal, sampleId, studyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DBClinicalSampleData {\n");
    
    sb.append("    attrId: ").append(toIndentedString(attrId)).append("\n");
    sb.append("    attrVal: ").append(toIndentedString(attrVal)).append("\n");
    sb.append("    sampleId: ").append(toIndentedString(sampleId)).append("\n");
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

