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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-21T13:45:29.173Z")
@Component()
public class ScheduledJobsApi {
  private ApiClient apiClient;

  public ScheduledJobsApi() {
    this(new ApiClient());
  }

  @Autowired
  public ScheduledJobsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get Scheduled Jobs
   * Gets all scheduled jobs for the specified officer
   * <p><b>200</b> - The scheduled jobs for the given officer
   *
   * @param officerId Officer ID to query scheduled jobs for
   * @throws RestClientException if an error occurs while attempting to invoke the API
   */
  public void getScheduledJobs(String officerId) throws RestClientException {
    Object postBody = null;

    // verify the required parameter 'officerId' is set
    if (officerId == null) {
      throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
          "Missing the required parameter 'officerId' when calling getScheduledJobs");
    }

    // create path and map variables
    final Map<String, Object> uriVariables = new HashMap<String, Object>();
    uriVariables.put("officerId", officerId);
    String path = UriComponentsBuilder.fromPath("/scheduled-jobs/{officerId}").buildAndExpand(uriVariables)
        .toUriString();

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
