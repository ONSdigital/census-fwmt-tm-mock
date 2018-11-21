package uk.gov.ons.fwmt.service_mocks.comet.client.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.util.UriComponentsBuilder;
import uk.gov.ons.fwmt.service_mocks.comet.client.invoker.ApiClient;
import uk.gov.ons.fwmt.service_mocks.comet.client.model.Body;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-21T13:45:29.173Z")
@Component()
public class CasesApi {
  private ApiClient apiClient;

  public CasesApi() {
    this(new ApiClient());
  }

  @Autowired
  public CasesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get Cases
   * Gets the list of cases that match the specified criteria
   * <p><b>200</b> - The cases that match the specified criteria
   *
   * @param filter   Specifies the filters to be applied to the search
   * @param pageNo   The page to be returned.
   * @param pageSize The size of the page to be returned
   * @throws RestClientException if an error occurs while attempting to invoke the API
   */
  public void getCase(String filter, Integer pageNo, Integer pageSize) throws RestClientException {
    Object postBody = null;

    String path = UriComponentsBuilder.fromPath("/cases").build().toUriString();

    final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
    final HttpHeaders headerParams = new HttpHeaders();
    final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

    queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter", filter));
    queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageNo", pageNo));
    queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageSize", pageSize));

    final String[] accepts = {
        "application/json"
    };
    final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
    final String[] contentTypes = {};
    final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"apiKeyHeader", "apiKeyQuery", "oauth2ons-dev-web-app-oauth2-service"};

    ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {
    };
    apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType,
        authNames, returnType);
  }

  /**
   * Create or Amend Case
   * Creates or amends the case identified by the id.
   * <p><b>200</b> - The specified case was successfully updated
   * <p><b>201</b> - A new case was created with the specified id
   *
   * @param id   The case id
   * @param body The body parameter
   * @throws RestClientException if an error occurs while attempting to invoke the API
   */
  public void createOrAmendCase(String id, Body body) throws RestClientException {
    Object postBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
          "Missing the required parameter 'id' when calling createOrAmendCase");
    }

    // create path and map variables
    final Map<String, Object> uriVariables = new HashMap<String, Object>();
    uriVariables.put("id", id);
    String path = UriComponentsBuilder.fromPath("/cases/{id}").buildAndExpand(uriVariables).toUriString();

    final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
    final HttpHeaders headerParams = new HttpHeaders();
    final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

    final String[] accepts = {
        "application/json"
    };
    final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
    final String[] contentTypes = {
        "application/json"
    };
    final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"apiKeyHeader", "apiKeyQuery", "oauth2ons-dev-web-app-oauth2-service"};

    ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {
    };
    apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType,
        authNames, returnType);
  }

  /**
   * Get Case
   * Gets a case identified by its case id
   * <p><b>200</b> - The case identified by the id
   * <p><b>404</b> - The requested case does not exist
   *
   * @param id The case identifier
   * @throws RestClientException if an error occurs while attempting to invoke the API
   */
  public void getCase(String id) throws RestClientException {
    Object postBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
          "Missing the required parameter 'id' when calling getCase");
    }

    // create path and map variables
    final Map<String, Object> uriVariables = new HashMap<String, Object>();
    uriVariables.put("id", id);
    String path = UriComponentsBuilder.fromPath("/cases/{id}").buildAndExpand(uriVariables).toUriString();

    final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
    final HttpHeaders headerParams = new HttpHeaders();
    final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

    final String[] accepts = {
        "application/json"
    };
    final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
    final String[] contentTypes = {};
    final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"apiKeyHeader", "apiKeyQuery", "oauth2ons-dev-web-app-oauth2-service"};

    ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {
    };
    apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType,
        authNames, returnType);
  }
}
