package uk.gov.ons.census.fwmt.tm.mock.comet.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;
import io.swagger.annotations.AuthorizationScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uk.gov.ons.census.fwmt.common.data.modelcase.CasePause;
import uk.gov.ons.census.fwmt.common.data.modelcase.CaseRequest;
import uk.gov.ons.census.fwmt.common.data.modelcase.ModelCase;

import javax.validation.Valid;

@Api(value = "cases", description = "the cases API")
public interface CasesApi {

  @ApiOperation(value = "Get a Case.", nickname = "casesByIdGet", notes = "", response = ModelCase.class, authorizations = {
      @Authorization(value = "Client Credentials", scopes = {
          @AuthorizationScope(scope = "", description = ""),
      }),
      @Authorization(value = "Implicit", scopes = {
          @AuthorizationScope(scope = "", description = "")})}, tags = {})
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "Case returned", response = ModelCase.class),
      @ApiResponse(code = 404, message = "The Case does not exist.")})
  @RequestMapping(value = "/cases/{id}",
      produces = {"application/json"},
      method = RequestMethod.GET)
  ResponseEntity<CaseRequest> casesByIdGet(
      @ApiParam(value = "The Case identifier", required = true) @PathVariable("id") String id);

  @ApiOperation(value = "Remove the pause from a Case.", nickname = "casesByIdPauseDelete", notes = "", authorizations = {
      @Authorization(value = "Client Credentials", scopes = {
          @AuthorizationScope(scope = "", description = ""),
      }),
      @Authorization(value = "Implicit", scopes = {
          @AuthorizationScope(scope = "", description = "")})}, tags = {})
  @ApiResponses(value = {
      @ApiResponse(code = 204, message = "Pause removed")})
  @RequestMapping(value = "/cases/{id}/pause",
      method = RequestMethod.DELETE)
  ResponseEntity<Void> casesByIdPauseDelete(
      @ApiParam(value = "The Case identifier", required = true) @PathVariable("id") String id);

  @ApiOperation(value = "Get the pause for a Case.", nickname = "casesByIdPauseGet", notes = "", response = CasePause.class, authorizations = {
      @Authorization(value = "Client Credentials", scopes = {
          @AuthorizationScope(scope = "", description = ""),
      }),
      @Authorization(value = "Implicit", scopes = {
          @AuthorizationScope(scope = "", description = "")})}, tags = {})
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "Pause returned", response = CasePause.class)})
  @RequestMapping(value = "/cases/{id}/pause",
      produces = {"application/json"},
      method = RequestMethod.GET)
  ResponseEntity<CasePause> casesByIdPauseGet(
      @ApiParam(value = "The Case identifier", required = true) @PathVariable("id") String id);

  @ApiOperation(value = "Create or update a pause on a Case.", nickname = "casesByIdPausePut", notes = "", response = CasePause.class, authorizations = {
      @Authorization(value = "Client Credentials", scopes = {
          @AuthorizationScope(scope = "", description = ""),
      }),
      @Authorization(value = "Implicit", scopes = {
          @AuthorizationScope(scope = "", description = "")})}, tags = {})
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "Pause created or updated.", response = CasePause.class)})
  @RequestMapping(value = "/cases/{id}/pause",
      produces = {"application/json"},
      consumes = {"application/json-patch+json", "application/json", "text/json", "application/_*+json"},
      method = RequestMethod.PUT)
  ResponseEntity<CasePause> casesByIdPausePut(
      @ApiParam(value = "The Case identifier.", required = true) @PathVariable("id") String id,
      @ApiParam(value = "Pause to apply to the Case.") @Valid @RequestBody Object body);

  @ApiOperation(value = "Create or update a Case.", nickname = "casesByIdPut", notes = "", response = ModelCase.class, authorizations = {
      @Authorization(value = "Client Credentials", scopes = {
          @AuthorizationScope(scope = "", description = ""),
      }),
      @Authorization(value = "Implicit", scopes = {
          @AuthorizationScope(scope = "", description = "")})}, tags = {})
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "Case updated", response = ModelCase.class),
      @ApiResponse(code = 201, message = "Case created", response = ModelCase.class),
      @ApiResponse(code = 400, message = "Case has missing/invalid values")})
  @RequestMapping(value = "/cases/{id}",
      produces = {"application/json"},
      consumes = {"application/json-patch+json", "application/json", "text/json", "application/_*+json"},
      method = RequestMethod.PUT)
  ResponseEntity<ModelCase> casesByIdPut(
      @ApiParam(value = "The Case identifier", required = true) @PathVariable("id") String id,
      @ApiParam(value = "Case") @Valid @RequestBody CaseRequest body);
}
