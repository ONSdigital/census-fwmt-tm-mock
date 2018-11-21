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
public class OfficersApi {
  private ApiClient apiClient;

  public OfficersApi() {
    this(new ApiClient());
  }

  @Autowired
  public OfficersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create or Amend Officer
   * Create or Amend Officer
   * <p><b>200</b> - The specified officer was updated
   * <p><b>201</b> - A new officer was created with the specified ID
   *
   * @param id   The officer ID
   * @param body The body parameter
   * @throws RestClientException if an error occurs while attempting to invoke the API
   */
  public void createOrAmendOfficer(String id, Body body) throws RestClientException {
    Object postBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
          "Missing the required parameter 'id' when calling createOrAmendOfficer");
    }

    // create path and map variables
    final Map<String, Object> uriVariables = new HashMap<String, Object>();
    uriVariables.put("id", id);
    String path = UriComponentsBuilder.fromPath("/officers/{id}").buildAndExpand(uriVariables).toUriString();

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
   * Get Officer
   * Gets an officer identified by the supplied ID
   * <p><b>200</b> - The officer for the given ID
   * <p><b>404</b> - No officer with the given ID exists
   *
   * @param id The officer ID
   * @throws RestClientException if an error occurs while attempting to invoke the API
   */
  public void getOfficer(String id) throws RestClientException {
    Object postBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
          "Missing the required parameter 'id' when calling getOfficer");
    }

    // create path and map variables
    final Map<String, Object> uriVariables = new HashMap<String, Object>();
    uriVariables.put("id", id);
    String path = UriComponentsBuilder.fromPath("/officers/{id}").buildAndExpand(uriVariables).toUriString();

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

  /**
   * Get Officers
   * Get Officers
   * <p><b>200</b> - List of officers that match the specified criteria
   *
   * @param filter   Specifies filters to apply to the result set
   * @param pageNo   Page number to be returned
   * @param pageSize Number of results to be returned
   * @throws RestClientException if an error occurs while attempting to invoke the API
   */
  public void getOfficers(String filter, Integer pageNo, Integer pageSize) throws RestClientException {
    Object postBody = null;

    String path = UriComponentsBuilder.fromPath("/officers").build().toUriString();

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
}
