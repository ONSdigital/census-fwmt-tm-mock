/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package uk.gov.ons.fwmt.service_mocks.comet.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-11-21T14:54:52.766Z")
@Api(value = "officer-availability", description = "the officer-availability API")
public interface OfficerAvailabilityApi {

  @ApiOperation(value = "Get Officer Availability", nickname = "roster", notes = "Gets the roster for the currently logged in co-ordinator", authorizations = {
      @Authorization(value = "apiKeyHeader"),
      @Authorization(value = "apiKeyQuery"),
      @Authorization(value = "oauth2ons-dev-web-app-oauth2-service", scopes = {

      })
  }, tags = {})
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "The availability of all officers of the currently logged in co-ordinator")})
  @RequestMapping(value = "/officer-availability",
      produces = {"application/json"},
      method = RequestMethod.GET)
  ResponseEntity<Void> roster(
      @ApiParam(value = "") @Valid @RequestParam(value = "startDate", required = false) String startDate,
      @ApiParam(value = "") @Valid @RequestParam(value = "endDate", required = false) String endDate);

}