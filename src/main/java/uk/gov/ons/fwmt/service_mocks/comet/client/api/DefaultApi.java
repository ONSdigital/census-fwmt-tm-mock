package uk.gov.ons.fwmt.service_mocks.comet.client.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.util.UriComponentsBuilder;
import uk.gov.ons.fwmt.service_mocks.comet.client.invoker.ApiClient;

import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-21T13:45:29.173Z")
@Component()
public class DefaultApi {
  private ApiClient apiClient;

  public DefaultApi() {
    this(new ApiClient());
  }

  @Autowired
  public DefaultApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get Officer Availability
   * Gets the roster for the currently logged in co-ordinator
   * <p><b>200</b> - The availability of all officers of the currently logged in co-ordinator
   *
   * @param startDate The startDate parameter
   * @param endDate   The endDate parameter
   * @throws RestClientException if an error occurs while attempting to invoke the API
   */
  public void roster(String startDate, String endDate) throws RestClientException {
    Object postBody = null;

    String path = UriComponentsBuilder.fromPath("/officer-availability").build().toUriString();

    final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
    final HttpHeaders headerParams = new HttpHeaders();
    final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

    queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startDate", startDate));
    queryParams.putAll(apiClient.parameterToMultiValueMap(null, "endDate", endDate));

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
