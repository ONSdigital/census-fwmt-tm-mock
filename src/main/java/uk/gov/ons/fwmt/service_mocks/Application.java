/*
 * Copyright.. etc
 */

package uk.gov.ons.fwmt.service_mocks;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import uk.gov.ons.fwmt.service_mocks.comet.client.api.CasesApi;
import uk.gov.ons.fwmt.service_mocks.comet.client.api.DefaultApi;
import uk.gov.ons.fwmt.service_mocks.comet.client.api.OfficersApi;
import uk.gov.ons.fwmt.service_mocks.comet.client.api.ScheduledJobsApi;

@Slf4j
@SpringBootApplication
public class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @Bean
  public RestTemplate restTemplate() {
    return new RestTemplate();
  }

  @Bean
  public CasesApi casesApi() {
    return new CasesApi();
  }

  @Bean
  public DefaultApi defaultApi() {
    return new DefaultApi();
  }

  @Bean
  public OfficersApi officersApi() {
    return new OfficersApi();
  }

  @Bean
  public ScheduledJobsApi scheduledJobsApi() {
    return new ScheduledJobsApi();
  }
}
