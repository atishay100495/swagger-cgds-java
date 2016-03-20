package org.cbioportal.cgds.client.model;

import com.sun.jersey.api.client.GenericType;

import org.cbioportal.cgds.client.ApiException;
import org.cbioportal.cgds.client.ApiClient;
import org.cbioportal.cgds.client.Configuration;
import org.cbioportal.cgds.client.Pair;

import org.cbioportal.cgds.client.api.DBCancerType;
import org.cbioportal.cgds.client.api.DBGene;
import org.cbioportal.cgds.client.api.DBProfileData;
import org.cbioportal.cgds.client.api.DBGeneticProfile;
import org.cbioportal.cgds.client.api.DBClinicalField;
import org.cbioportal.cgds.client.api.DBClinicalPatientData;
import org.cbioportal.cgds.client.api.DBPatient;
import org.cbioportal.cgds.client.api.DBClinicalSampleData;
import org.cbioportal.cgds.client.api.DBSampleList;
import org.cbioportal.cgds.client.api.DBSample;
import org.cbioportal.cgds.client.api.DBStudy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-20T14:16:09.932+05:30")
public class ApicontrollerApi {
  private ApiClient apiClient;

  public ApicontrollerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ApicontrollerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Get cancer types with meta data
   * 
   * @param cancerTypeIds List of cancer type identifiers (example: cll,brca,coad). Unrecognized ids are silently ignored. Empty string returns all. (optional)
   * @return List<DBCancerType>
   * @throws ApiException if fails to make API call
   */
  public List<DBCancerType> getCancerTypes(List<String> cancerTypeIds) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/cancertypes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "cancer_type_ids", cancerTypeIds));
    

    

    

    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<DBCancerType>> localVarReturnType = new GenericType<List<DBCancerType>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get cancer types with meta data
   * 
   * @param cancerTypeIds List of cancer type identifiers (example: cll,brca,coad). Unrecognized ids are silently ignored. Empty string returns all. (optional)
   * @return List<DBCancerType>
   * @throws ApiException if fails to make API call
   */
  public List<DBCancerType> getCancerTypes1(List<String> cancerTypeIds) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/cancertypes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "cancer_type_ids", cancerTypeIds));
    

    

    

    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<DBCancerType>> localVarReturnType = new GenericType<List<DBCancerType>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get gene meta data by hugo gene symbol lookup
   * 
   * @param hugoGeneSymbols List of hugo gene symbols. Unrecognized genes are silently ignored. Empty string returns all genes. (optional)
   * @return List<DBGene>
   * @throws ApiException if fails to make API call
   */
  public List<DBGene> getGenes(List<String> hugoGeneSymbols) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/genes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "hugo_gene_symbols", hugoGeneSymbols));
    

    

    

    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<DBGene>> localVarReturnType = new GenericType<List<DBGene>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get gene meta data by hugo gene symbol lookup
   * 
   * @param hugoGeneSymbols List of hugo gene symbols. Unrecognized genes are silently ignored. Empty string returns all genes. (optional)
   * @return List<DBGene>
   * @throws ApiException if fails to make API call
   */
  public List<DBGene> getGenes1(List<String> hugoGeneSymbols) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/genes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "hugo_gene_symbols", hugoGeneSymbols));
    

    

    

    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<DBGene>> localVarReturnType = new GenericType<List<DBGene>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get genetic profile data across samples for given genes, and filtered by sample id or sample list id
   * 
   * @param geneticProfileIds List of genetic_profile_ids such as those returned by /api/geneticprofiles. (example: brca_tcga_pub_mutations). Unrecognized genetic profile ids are silently ignored. Profile data is only returned for matching ids. (required)
   * @param genes List of hugo gene symbols. (example: AKT1,CASP8,TGFBR1) Unrecognized gene ids are silently ignored. Profile data is only returned for matching genes. (required)
   * @param sampleIds List of sample identifiers such as those returned by /api/samples. Empty string returns all. Must be empty to query by sample list ids. (optional)
   * @param sampleListId A single sample list ids such as those returned by /api/samplelists. (example: brca_tcga_idc,brca_tcga_lobular). Empty string returns all. If sample_ids argument was provided, this argument will be ignored. (optional)
   * @return List<DBProfileData>
   * @throws ApiException if fails to make API call
   */
  public List<DBProfileData> getGeneticProfileData(List<String> geneticProfileIds, List<String> genes, List<String> sampleIds, String sampleListId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'geneticProfileIds' is set
    if (geneticProfileIds == null) {
      throw new ApiException(400, "Missing the required parameter 'geneticProfileIds' when calling getGeneticProfileData");
    }
    
    // verify the required parameter 'genes' is set
    if (genes == null) {
      throw new ApiException(400, "Missing the required parameter 'genes' when calling getGeneticProfileData");
    }
    
    // create path and map variables
    String localVarPath = "/api/geneticprofiledata".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "genetic_profile_ids", geneticProfileIds));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "genes", genes));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sample_ids", sampleIds));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sample_list_id", sampleListId));
    

    

    

    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<DBProfileData>> localVarReturnType = new GenericType<List<DBProfileData>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get genetic profile data across samples for given genes, and filtered by sample id or sample list id
   * 
   * @param geneticProfileIds List of genetic_profile_ids such as those returned by /api/geneticprofiles. (example: brca_tcga_pub_mutations). Unrecognized genetic profile ids are silently ignored. Profile data is only returned for matching ids. (required)
   * @param genes List of hugo gene symbols. (example: AKT1,CASP8,TGFBR1) Unrecognized gene ids are silently ignored. Profile data is only returned for matching genes. (required)
   * @param sampleIds List of sample identifiers such as those returned by /api/samples. Empty string returns all. Must be empty to query by sample list ids. (optional)
   * @param sampleListId A single sample list ids such as those returned by /api/samplelists. (example: brca_tcga_idc,brca_tcga_lobular). Empty string returns all. If sample_ids argument was provided, this argument will be ignored. (optional)
   * @return List<DBProfileData>
   * @throws ApiException if fails to make API call
   */
  public List<DBProfileData> getGeneticProfileData1(List<String> geneticProfileIds, List<String> genes, List<String> sampleIds, String sampleListId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'geneticProfileIds' is set
    if (geneticProfileIds == null) {
      throw new ApiException(400, "Missing the required parameter 'geneticProfileIds' when calling getGeneticProfileData1");
    }
    
    // verify the required parameter 'genes' is set
    if (genes == null) {
      throw new ApiException(400, "Missing the required parameter 'genes' when calling getGeneticProfileData1");
    }
    
    // create path and map variables
    String localVarPath = "/api/geneticprofiledata".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "genetic_profile_ids", geneticProfileIds));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "genes", genes));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sample_ids", sampleIds));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sample_list_id", sampleListId));
    

    

    

    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<DBProfileData>> localVarReturnType = new GenericType<List<DBProfileData>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get list of genetic profile identifiers by study
   * 
   * @param studyId A single study id, such as those returned by /api/studies. (example: brca_tcga). Must be empty to query by genetic profile ids (across all studies). (optional)
   * @param geneticProfileIds List of genetic_profile_ids. (example: brca_tcga_pub_mutations). Empty string returns all genetic profiles. If study_id argument was provided, this argument will be ignored. (optional)
   * @return List<DBGeneticProfile>
   * @throws ApiException if fails to make API call
   */
  public List<DBGeneticProfile> getGeneticProfiles(String studyId, List<String> geneticProfileIds) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/geneticprofiles".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "study_id", studyId));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "genetic_profile_ids", geneticProfileIds));
    

    

    

    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<DBGeneticProfile>> localVarReturnType = new GenericType<List<DBGeneticProfile>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get list of genetic profile identifiers by study
   * 
   * @param studyId A single study id, such as those returned by /api/studies. (example: brca_tcga). Must be empty to query by genetic profile ids (across all studies). (optional)
   * @param geneticProfileIds List of genetic_profile_ids. (example: brca_tcga_pub_mutations). Empty string returns all genetic profiles. If study_id argument was provided, this argument will be ignored. (optional)
   * @return List<DBGeneticProfile>
   * @throws ApiException if fails to make API call
   */
  public List<DBGeneticProfile> getGeneticProfiles1(String studyId, List<String> geneticProfileIds) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/geneticprofiles".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "study_id", studyId));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "genetic_profile_ids", geneticProfileIds));
    

    

    

    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<DBGeneticProfile>> localVarReturnType = new GenericType<List<DBGeneticProfile>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get clinical attribute identifiers, filtered by patient
   * 
   * @param studyId A single study id, such as those returned by /api/studies. (example: brca_tcga). Empty string returns clinical attributes across all studies. (optional)
   * @param patientIds List of patient_ids. If provided, returned clinical attributes will be those which appear in any listed patient. Empty string returns clinical attributes across all patients. (optional)
   * @return List<DBClinicalField>
   * @throws ApiException if fails to make API call
   */
  public List<DBClinicalField> getPatientClinicalAttributes(String studyId, List<String> patientIds) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/clinicalattributes/patients".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "study_id", studyId));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "patient_ids", patientIds));
    

    

    

    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<DBClinicalField>> localVarReturnType = new GenericType<List<DBClinicalField>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get clinical attribute identifiers, filtered by patient
   * 
   * @param studyId A single study id, such as those returned by /api/studies. (example: brca_tcga). Empty string returns clinical attributes across all studies. (optional)
   * @param patientIds List of patient_ids. If provided, returned clinical attributes will be those which appear in any listed patient. Empty string returns clinical attributes across all patients. (optional)
   * @return List<DBClinicalField>
   * @throws ApiException if fails to make API call
   */
  public List<DBClinicalField> getPatientClinicalAttributes1(String studyId, List<String> patientIds) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/clinicalattributes/patients".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "study_id", studyId));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "patient_ids", patientIds));
    

    

    

    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<DBClinicalField>> localVarReturnType = new GenericType<List<DBClinicalField>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get clinical data records filtered by patient ids
   * 
   * @param studyId A single study id, such as those returned by /api/studies. (example: brca_tcga) (required)
   * @param attributeIds List of attribute ids, such as those returned by /api/clinicalattributes/patients. (example: PATIENT_ID,DFS_STATUS) (required)
   * @param patientIds List of patient identifiers such as those returned by /api/patients. Unrecognized ids are silently ignored. Empty string returns all. (optional)
   * @return List<DBClinicalPatientData>
   * @throws ApiException if fails to make API call
   */
  public List<DBClinicalPatientData> getPatientClinicalData(String studyId, List<String> attributeIds, List<String> patientIds) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'studyId' is set
    if (studyId == null) {
      throw new ApiException(400, "Missing the required parameter 'studyId' when calling getPatientClinicalData");
    }
    
    // verify the required parameter 'attributeIds' is set
    if (attributeIds == null) {
      throw new ApiException(400, "Missing the required parameter 'attributeIds' when calling getPatientClinicalData");
    }
    
    // create path and map variables
    String localVarPath = "/api/clinicaldata/patients".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "study_id", studyId));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "attribute_ids", attributeIds));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "patient_ids", patientIds));
    

    

    

    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<DBClinicalPatientData>> localVarReturnType = new GenericType<List<DBClinicalPatientData>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get clinical data records filtered by patient ids
   * 
   * @param studyId A single study id, such as those returned by /api/studies. (example: brca_tcga) (required)
   * @param attributeIds List of attribute ids, such as those returned by /api/clinicalattributes/patients. (example: PATIENT_ID,DFS_STATUS) (required)
   * @param patientIds List of patient identifiers such as those returned by /api/patients. Unrecognized ids are silently ignored. Empty string returns all. (optional)
   * @return List<DBClinicalPatientData>
   * @throws ApiException if fails to make API call
   */
  public List<DBClinicalPatientData> getPatientClinicalData1(String studyId, List<String> attributeIds, List<String> patientIds) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'studyId' is set
    if (studyId == null) {
      throw new ApiException(400, "Missing the required parameter 'studyId' when calling getPatientClinicalData1");
    }
    
    // verify the required parameter 'attributeIds' is set
    if (attributeIds == null) {
      throw new ApiException(400, "Missing the required parameter 'attributeIds' when calling getPatientClinicalData1");
    }
    
    // create path and map variables
    String localVarPath = "/api/clinicaldata/patients".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "study_id", studyId));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "attribute_ids", attributeIds));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "patient_ids", patientIds));
    

    

    

    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<DBClinicalPatientData>> localVarReturnType = new GenericType<List<DBClinicalPatientData>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get patient id list by study or by sample id
   * 
   * @param studyId A single study id, such as those returned by /api/studies. (example: brca_tcga) (required)
   * @param patientIds List of patient ids such as those returned by /api/patients. Empty string returns all. Must be empty to query by sample ids. (optional)
   * @param sampleIds List of sample identifiers. Empty string returns all. If patient_ids argument was provided, this argument will be ignored. (optional)
   * @return List<DBPatient>
   * @throws ApiException if fails to make API call
   */
  public List<DBPatient> getPatients(String studyId, List<String> patientIds, List<String> sampleIds) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'studyId' is set
    if (studyId == null) {
      throw new ApiException(400, "Missing the required parameter 'studyId' when calling getPatients");
    }
    
    // create path and map variables
    String localVarPath = "/api/patients".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "study_id", studyId));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "patient_ids", patientIds));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sample_ids", sampleIds));
    

    

    

    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<DBPatient>> localVarReturnType = new GenericType<List<DBPatient>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get patient id list by study or by sample id
   * 
   * @param studyId A single study id, such as those returned by /api/studies. (example: brca_tcga) (required)
   * @param patientIds List of patient ids such as those returned by /api/patients. Empty string returns all. Must be empty to query by sample ids. (optional)
   * @param sampleIds List of sample identifiers. Empty string returns all. If patient_ids argument was provided, this argument will be ignored. (optional)
   * @return List<DBPatient>
   * @throws ApiException if fails to make API call
   */
  public List<DBPatient> getPatients1(String studyId, List<String> patientIds, List<String> sampleIds) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'studyId' is set
    if (studyId == null) {
      throw new ApiException(400, "Missing the required parameter 'studyId' when calling getPatients1");
    }
    
    // create path and map variables
    String localVarPath = "/api/patients".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "study_id", studyId));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "patient_ids", patientIds));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sample_ids", sampleIds));
    

    

    

    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<DBPatient>> localVarReturnType = new GenericType<List<DBPatient>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get clinical attribute identifiers, filtered by sample
   * 
   * @param studyId A single study id, such as those returned by /api/studies. (example: brca_tcga). Empty string returns clinical attributes across all studies. (optional)
   * @param sampleIds List of sample_ids. If provided, returned clinical attributes will be those which appear in any listed sample. Empty string returns clinical attributes across all samples. (optional)
   * @return List<DBClinicalField>
   * @throws ApiException if fails to make API call
   */
  public List<DBClinicalField> getSampleClinicalAttributes(String studyId, List<String> sampleIds) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/clinicalattributes/samples".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "study_id", studyId));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sample_ids", sampleIds));
    

    

    

    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<DBClinicalField>> localVarReturnType = new GenericType<List<DBClinicalField>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get clinical attribute identifiers, filtered by sample
   * 
   * @param studyId A single study id, such as those returned by /api/studies. (example: brca_tcga). Empty string returns clinical attributes across all studies. (optional)
   * @param sampleIds List of sample_ids. If provided, returned clinical attributes will be those which appear in any listed sample. Empty string returns clinical attributes across all samples. (optional)
   * @return List<DBClinicalField>
   * @throws ApiException if fails to make API call
   */
  public List<DBClinicalField> getSampleClinicalAttributes1(String studyId, List<String> sampleIds) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/clinicalattributes/samples".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "study_id", studyId));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sample_ids", sampleIds));
    

    

    

    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<DBClinicalField>> localVarReturnType = new GenericType<List<DBClinicalField>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get clinical data records, filtered by sample ids
   * 
   * @param studyId A single study id, such as those returned by /api/studies. (example: brca_tcga) (required)
   * @param attributeIds List of attribute ids, such as those returned by /api/clinicalattributes/samples. (example: SAMPLE_TYPE,IS_FFPE) (required)
   * @param sampleIds List of sample identifiers. Unrecognized ids are silently ignored. Empty string returns all. (optional)
   * @return List<DBClinicalSampleData>
   * @throws ApiException if fails to make API call
   */
  public List<DBClinicalSampleData> getSampleClinicalData(String studyId, List<String> attributeIds, List<String> sampleIds) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'studyId' is set
    if (studyId == null) {
      throw new ApiException(400, "Missing the required parameter 'studyId' when calling getSampleClinicalData");
    }
    
    // verify the required parameter 'attributeIds' is set
    if (attributeIds == null) {
      throw new ApiException(400, "Missing the required parameter 'attributeIds' when calling getSampleClinicalData");
    }
    
    // create path and map variables
    String localVarPath = "/api/clinicaldata/samples".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "study_id", studyId));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "attribute_ids", attributeIds));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sample_ids", sampleIds));
    

    

    

    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<DBClinicalSampleData>> localVarReturnType = new GenericType<List<DBClinicalSampleData>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get clinical data records, filtered by sample ids
   * 
   * @param studyId A single study id, such as those returned by /api/studies. (example: brca_tcga) (required)
   * @param attributeIds List of attribute ids, such as those returned by /api/clinicalattributes/samples. (example: SAMPLE_TYPE,IS_FFPE) (required)
   * @param sampleIds List of sample identifiers. Unrecognized ids are silently ignored. Empty string returns all. (optional)
   * @return List<DBClinicalSampleData>
   * @throws ApiException if fails to make API call
   */
  public List<DBClinicalSampleData> getSampleClinicalData1(String studyId, List<String> attributeIds, List<String> sampleIds) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'studyId' is set
    if (studyId == null) {
      throw new ApiException(400, "Missing the required parameter 'studyId' when calling getSampleClinicalData1");
    }
    
    // verify the required parameter 'attributeIds' is set
    if (attributeIds == null) {
      throw new ApiException(400, "Missing the required parameter 'attributeIds' when calling getSampleClinicalData1");
    }
    
    // create path and map variables
    String localVarPath = "/api/clinicaldata/samples".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "study_id", studyId));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "attribute_ids", attributeIds));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sample_ids", sampleIds));
    

    

    

    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<DBClinicalSampleData>> localVarReturnType = new GenericType<List<DBClinicalSampleData>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get list of sample lists (list name and sample id list) by study
   * 
   * @param studyId A single study id, such as those returned by /api/studies. (example: brca_tcga). Must be empty to query by sample list ids (across all studies). (optional)
   * @param sampleListIds List of sample list ids. (example: brca_tcga_idc,brca_tcga_lobular). Empty string returns all genetic profiles. If study_id argument was provided, this argument will be ignored. (optional)
   * @return List<DBSampleList>
   * @throws ApiException if fails to make API call
   */
  public List<DBSampleList> getSampleLists(String studyId, List<String> sampleListIds) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/samplelists".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "study_id", studyId));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sample_list_ids", sampleListIds));
    

    

    

    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<DBSampleList>> localVarReturnType = new GenericType<List<DBSampleList>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get list of sample lists (list name and sample id list) by study
   * 
   * @param studyId A single study id, such as those returned by /api/studies. (example: brca_tcga). Must be empty to query by sample list ids (across all studies). (optional)
   * @param sampleListIds List of sample list ids. (example: brca_tcga_idc,brca_tcga_lobular). Empty string returns all genetic profiles. If study_id argument was provided, this argument will be ignored. (optional)
   * @return List<DBSampleList>
   * @throws ApiException if fails to make API call
   */
  public List<DBSampleList> getSampleLists1(String studyId, List<String> sampleListIds) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/samplelists".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "study_id", studyId));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sample_list_ids", sampleListIds));
    

    

    

    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<DBSampleList>> localVarReturnType = new GenericType<List<DBSampleList>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get list of samples ids with meta data by study, filtered by sample ids or patient ids
   * 
   * @param studyId A single study id, such as those returned by /api/studies. (example: brca_tcga) (required)
   * @param sampleIds List of sample identifiers. Unrecognized ids are silently ignored. Empty string returns all. Must be empty to query by patient_ids. (optional)
   * @param patientIds List of patient identifiers such as those returned by /api/patients. Unrecognized ids are silently ignored. Empty string returns all. If sample_ids argument was provided, this arument will be ignored. (optional)
   * @return List<DBSample>
   * @throws ApiException if fails to make API call
   */
  public List<DBSample> getSamples(String studyId, List<String> sampleIds, List<String> patientIds) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'studyId' is set
    if (studyId == null) {
      throw new ApiException(400, "Missing the required parameter 'studyId' when calling getSamples");
    }
    
    // create path and map variables
    String localVarPath = "/api/samples".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "study_id", studyId));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sample_ids", sampleIds));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "patient_ids", patientIds));
    

    

    

    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<DBSample>> localVarReturnType = new GenericType<List<DBSample>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get list of samples ids with meta data by study, filtered by sample ids or patient ids
   * 
   * @param studyId A single study id, such as those returned by /api/studies. (example: brca_tcga) (required)
   * @param sampleIds List of sample identifiers. Unrecognized ids are silently ignored. Empty string returns all. Must be empty to query by patient_ids. (optional)
   * @param patientIds List of patient identifiers such as those returned by /api/patients. Unrecognized ids are silently ignored. Empty string returns all. If sample_ids argument was provided, this arument will be ignored. (optional)
   * @return List<DBSample>
   * @throws ApiException if fails to make API call
   */
  public List<DBSample> getSamples1(String studyId, List<String> sampleIds, List<String> patientIds) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'studyId' is set
    if (studyId == null) {
      throw new ApiException(400, "Missing the required parameter 'studyId' when calling getSamples1");
    }
    
    // create path and map variables
    String localVarPath = "/api/samples".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "study_id", studyId));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sample_ids", sampleIds));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "patient_ids", patientIds));
    

    

    

    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<DBSample>> localVarReturnType = new GenericType<List<DBSample>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get studies
   * 
   * @param studyIds List of study_ids. Unrecognized ids are silently ignored. Empty string returns all. (optional)
   * @return List<DBStudy>
   * @throws ApiException if fails to make API call
   */
  public List<DBStudy> getStudies(List<String> studyIds) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/studies".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "study_ids", studyIds));
    

    

    

    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<DBStudy>> localVarReturnType = new GenericType<List<DBStudy>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get studies
   * 
   * @param studyIds List of study_ids. Unrecognized ids are silently ignored. Empty string returns all. (optional)
   * @return List<DBStudy>
   * @throws ApiException if fails to make API call
   */
  public List<DBStudy> getStudies1(List<String> studyIds) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/studies".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "study_ids", studyIds));
    

    

    

    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<DBStudy>> localVarReturnType = new GenericType<List<DBStudy>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
