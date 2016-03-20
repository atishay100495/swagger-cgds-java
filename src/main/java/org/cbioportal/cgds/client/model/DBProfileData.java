package org.cbioportal.cgds.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-20T14:48:37.396+05:30")
public class DBProfileData   {
  
  private String entrezGeneId = null;
  private String geneticProfileId = null;
  private String hugoGeneSymbol = null;
  private String sampleId = null;
  private String sampleListId = null;
  private String studyId = null;

  
  /**
   **/
  public DBProfileData entrezGeneId(String entrezGeneId) {
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
  public DBProfileData geneticProfileId(String geneticProfileId) {
    this.geneticProfileId = geneticProfileId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("genetic_profile_id")
  public String getGeneticProfileId() {
    return geneticProfileId;
  }
  public void setGeneticProfileId(String geneticProfileId) {
    this.geneticProfileId = geneticProfileId;
  }

  
  /**
   **/
  public DBProfileData hugoGeneSymbol(String hugoGeneSymbol) {
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

  
  /**
   **/
  public DBProfileData sampleId(String sampleId) {
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
  public DBProfileData sampleListId(String sampleListId) {
    this.sampleListId = sampleListId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sample_list_id")
  public String getSampleListId() {
    return sampleListId;
  }
  public void setSampleListId(String sampleListId) {
    this.sampleListId = sampleListId;
  }

  
  /**
   **/
  public DBProfileData studyId(String studyId) {
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
    DBProfileData dBProfileData = (DBProfileData) o;
    return Objects.equals(this.entrezGeneId, dBProfileData.entrezGeneId) &&
        Objects.equals(this.geneticProfileId, dBProfileData.geneticProfileId) &&
        Objects.equals(this.hugoGeneSymbol, dBProfileData.hugoGeneSymbol) &&
        Objects.equals(this.sampleId, dBProfileData.sampleId) &&
        Objects.equals(this.sampleListId, dBProfileData.sampleListId) &&
        Objects.equals(this.studyId, dBProfileData.studyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entrezGeneId, geneticProfileId, hugoGeneSymbol, sampleId, sampleListId, studyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DBProfileData {\n");
    
    sb.append("    entrezGeneId: ").append(toIndentedString(entrezGeneId)).append("\n");
    sb.append("    geneticProfileId: ").append(toIndentedString(geneticProfileId)).append("\n");
    sb.append("    hugoGeneSymbol: ").append(toIndentedString(hugoGeneSymbol)).append("\n");
    sb.append("    sampleId: ").append(toIndentedString(sampleId)).append("\n");
    sb.append("    sampleListId: ").append(toIndentedString(sampleListId)).append("\n");
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

