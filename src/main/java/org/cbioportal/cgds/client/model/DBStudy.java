package org.cbioportal.cgds.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-20T14:48:37.396+05:30")
public class DBStudy   {
  
  private String citation = null;
  private String description = null;
  private String groups = null;
  private String id = null;
  private String name = null;
  private Long pmid = null;
  private String shortName = null;
  private String typeOfCancer = null;

  
  /**
   **/
  public DBStudy citation(String citation) {
    this.citation = citation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("citation")
  public String getCitation() {
    return citation;
  }
  public void setCitation(String citation) {
    this.citation = citation;
  }

  
  /**
   **/
  public DBStudy description(String description) {
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
  public DBStudy groups(String groups) {
    this.groups = groups;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("groups")
  public String getGroups() {
    return groups;
  }
  public void setGroups(String groups) {
    this.groups = groups;
  }

  
  /**
   **/
  public DBStudy id(String id) {
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
  public DBStudy name(String name) {
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
  public DBStudy pmid(Long pmid) {
    this.pmid = pmid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pmid")
  public Long getPmid() {
    return pmid;
  }
  public void setPmid(Long pmid) {
    this.pmid = pmid;
  }

  
  /**
   **/
  public DBStudy shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("short_name")
  public String getShortName() {
    return shortName;
  }
  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  
  /**
   **/
  public DBStudy typeOfCancer(String typeOfCancer) {
    this.typeOfCancer = typeOfCancer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type_of_cancer")
  public String getTypeOfCancer() {
    return typeOfCancer;
  }
  public void setTypeOfCancer(String typeOfCancer) {
    this.typeOfCancer = typeOfCancer;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DBStudy dBStudy = (DBStudy) o;
    return Objects.equals(this.citation, dBStudy.citation) &&
        Objects.equals(this.description, dBStudy.description) &&
        Objects.equals(this.groups, dBStudy.groups) &&
        Objects.equals(this.id, dBStudy.id) &&
        Objects.equals(this.name, dBStudy.name) &&
        Objects.equals(this.pmid, dBStudy.pmid) &&
        Objects.equals(this.shortName, dBStudy.shortName) &&
        Objects.equals(this.typeOfCancer, dBStudy.typeOfCancer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(citation, description, groups, id, name, pmid, shortName, typeOfCancer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DBStudy {\n");
    
    sb.append("    citation: ").append(toIndentedString(citation)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pmid: ").append(toIndentedString(pmid)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    typeOfCancer: ").append(toIndentedString(typeOfCancer)).append("\n");
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

