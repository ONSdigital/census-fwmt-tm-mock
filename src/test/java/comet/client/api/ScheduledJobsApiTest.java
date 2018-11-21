/*
 * Census Operations Mobile Engine API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package comet.client.api;

import org.junit.Ignore;
import org.junit.Test;
import uk.gov.ons.fwmt.service_mocks.comet.client.api.ScheduledJobsApi;

/**
 * API tests for ScheduledJobsApi
 */
@Ignore
public class ScheduledJobsApiTest {

  private final ScheduledJobsApi api = new ScheduledJobsApi();

  /**
   * Get Scheduled Jobs
   * <p>
   * Gets all scheduled jobs for the specified officer
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getScheduledJobsTest() {
    String officerId = null;
    api.getScheduledJobs(officerId);

    // TODO: test validations
  }

}
