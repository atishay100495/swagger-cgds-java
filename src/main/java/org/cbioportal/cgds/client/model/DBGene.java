package org.cbioportal.cgds.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-20T14:48:37.396+05:30")
public class DBGene   {
  
  private String entrezGeneId = null;
  private String hugoGeneSymbol = null;

  
  /**
   **/
  public DBGene entrezGeneId(String entrezGeneId) {
    this.entrezGeneId = entrezGeneId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entrez_gene_id")
  public String getEntrezGeneId() {
    return entrezGeneId;
  }
  public void setEntrezGeneId(String entrezGeneId) {
    this.entrezGeneId = entrezGeneId;
  }

  
  /**
   **/
  public DBGene hugoGeneSymbol(String hugoGeneSymbol) {
    this.hugoGeneSymbol = hugoGeneSymbol;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("hugo_gene_symbol")
  public String getHugoGeneSymbol() {
    return hugoGeneSymbol;
  }
  public void setHugoGeneSymbol(String hugoGeneSymbol) {
    this.hugoGeneSymbol = hugoGeneSymbol;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DBGene dBGene = (DBGene) o;
    return Objects.equals(this.entrezGeneId, dBGene.entrezGeneId) &&
        Objects.equals(this.hugoGeneSymbol, dBGene.hugoGeneSymbol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entrezGeneId, hugoGeneSymbol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DBGene {\n");
    
    sb.append("    entrezGeneId: ").append(toIndentedString(entrezGeneId)).append("\n");
    sb.append("    hugoGeneSymbol: ").append(toIndentedString(hugoGeneSymbol)).append("\n");
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

