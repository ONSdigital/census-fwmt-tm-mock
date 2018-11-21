package uk.gov.ons.fwmt.service_mocks.comet.client.invoker.auth;

import org.springframework.http.HttpHeaders;
import org.springframework.util.MultiValueMap;

public interface Authentication {
  /**
   * Apply authentication settings to header and / or query parameters.
   *
   * @param queryParams  The query parameters for the request
   * @param headerParams The header parameters for the request
   */
  void applyToParams(MultiValueMap<String, String> queryParams, HttpHeaders headerParams);
}
