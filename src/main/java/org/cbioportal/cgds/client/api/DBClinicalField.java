package org.cbioportal.cgds.client.api;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-20T14:16:09.932+05:30")
public class DBClinicalField   {
  
  private String attrId = null;
  private String datatype = null;
  private String description = null;
  private String displayName = null;
  private String isPatientAttribute = null;
  private String priority = null;

  
  /**
   **/
  public DBClinicalField attrId(String attrId) {
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
  public DBClinicalField datatype(String datatype) {
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
  public DBClinicalField description(String description) {
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
  public DBClinicalField displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("display_name")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  
  /**
   **/
  public DBClinicalField isPatientAttribute(String isPatientAttribute) {
    this.isPatientAttribute = isPatientAttribute;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("is_patient_attribute")
  public String getIsPatientAttribute() {
    return isPatientAttribute;
  }
  public void setIsPatientAttribute(String isPatientAttribute) {
    this.isPatientAttribute = isPatientAttribute;
  }

  
  /**
   **/
  public DBClinicalField priority(String priority) {
    this.priority = priority;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("priority")
  public String getPriority() {
    return priority;
  }
  public void setPriority(String priority) {
    this.priority = priority;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DBClinicalField dBClinicalField = (DBClinicalField) o;
    return Objects.equals(this.attrId, dBClinicalField.attrId) &&
        Objects.equals(this.datatype, dBClinicalField.datatype) &&
        Objects.equals(this.description, dBClinicalField.description) &&
        Objects.equals(this.displayName, dBClinicalField.displayName) &&
        Objects.equals(this.isPatientAttribute, dBClinicalField.isPatientAttribute) &&
        Objects.equals(this.priority, dBClinicalField.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attrId, datatype, description, displayName, isPatientAttribute, priority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DBClinicalField {\n");
    
    sb.append("    attrId: ").append(toIndentedString(attrId)).append("\n");
    sb.append("    datatype: ").append(toIndentedString(datatype)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    isPatientAttribute: ").append(toIndentedString(isPatientAttribute)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

