package org.cbioportal.cgds.client.api;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-20T14:16:09.932+05:30")
public class DBCancerType   {
  
  private String color = null;
  private String id = null;
  private String name = null;

  
  /**
   **/
  public DBCancerType color(String color) {
    this.color = color;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("color")
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }

  
  /**
   **/
  public DBCancerType id(String id) {
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
  public DBCancerType name(String name) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DBCancerType dBCancerType = (DBCancerType) o;
    return Objects.equals(this.color, dBCancerType.color) &&
        Objects.equals(this.id, dBCancerType.id) &&
        Objects.equals(this.name, dBCancerType.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DBCancerType {\n");
    
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

