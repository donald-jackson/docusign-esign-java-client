
package com.docusign.esign.api;

import javax.ws.rs.core.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.model.*;
import com.docusign.esign.client.Pair;



public class NotaryApi {
  private ApiClient apiClient;

  public NotaryApi() {
    this(Configuration.getDefaultApiClient());
  }

  public NotaryApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /// <summary>
  /// Get notary jurisdictions for a user 
  /// </summary>
  public class ListNotaryJournalsOptions
  {
  private String count = null;
  private String searchText = null;
  private String startPosition = null;
  /*
   * 
   */
  public void setCount(String count) {
    this.count = count;
  }

  public String getCount() {
    return this.count;
  }
  /*
   * 
   */
  public void setSearchText(String searchText) {
    this.searchText = searchText;
  }

  public String getSearchText() {
    return this.searchText;
  }
  /*
   * 
   */
  public void setStartPosition(String startPosition) {
    this.startPosition = startPosition;
  }

  public String getStartPosition() {
    return this.startPosition;
  }
  }

   /**
   * Get notary jurisdictions for a user
   * 
   * @return NotaryJournalList
   */ 
  public NotaryJournalList listNotaryJournals() throws ApiException {
    return listNotaryJournals(null);
  }

  /**
   * Get notary jurisdictions for a user
   * 
   * @param options for modifying the method behavior.
   * @return NotaryJournalList
   * @throws ApiException if fails to make API call
   */
  public NotaryJournalList listNotaryJournals(NotaryApi.ListNotaryJournalsOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // create path and map variables
    String localVarPath = "/v2/current_user/notary/journals";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("count", options.count));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("search_text", options.searchText));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("start_position", options.startPosition));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<NotaryJournalList> localVarReturnType = new GenericType<NotaryJournalList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
