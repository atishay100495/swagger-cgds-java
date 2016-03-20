package org.cbioportal.cgds.client.api;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-20T14:16:09.932+05:30")
public class DBClinicalPatientData   {
  
  private String attrId = null;
  private String attrVal = null;
  private String patientId = null;
  private String studyId = null;

  
  /**
   **/
  public DBClinicalPatientData attrId(String attrId) {
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
  public DBClinicalPatientData attrVal(String attrVal) {
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
  public DBClinicalPatientData patientId(String patientId) {
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
  public DBClinicalPatientData studyId(String studyId) {
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
    DBClinicalPatientData dBClinicalPatientData = (DBClinicalPatientData) o;
    return Objects.equals(this.attrId, dBClinicalPatientData.attrId) &&
        Objects.equals(this.attrVal, dBClinicalPatientData.attrVal) &&
        Objects.equals(this.patientId, dBClinicalPatientData.patientId) &&
        Objects.equals(this.studyId, dBClinicalPatientData.studyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attrId, attrVal, patientId, studyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DBClinicalPatientData {\n");
    
    sb.append("    attrId: ").append(toIndentedString(attrId)).append("\n");
    sb.append("    attrVal: ").append(toIndentedString(attrVal)).append("\n");
    sb.append("    patientId: ").append(toIndentedString(patientId)).append("\n");
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

