/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.3).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package uk.gov.ons.fwmt.census.tm.mock.tm.comet.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import uk.gov.ons.fwmt.census.tm.mock.tm.comet.model.FetchResponseCase;
import uk.gov.ons.fwmt.census.tm.mock.tm.comet.model.ModelCase;

import javax.validation.Valid;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-07T11:49:58.389925Z[Europe/London]")

@Api(value = "cases", description = "the cases API")
public interface CasesApi {

  @ApiOperation(value = "Get Case by Id", nickname = "casesByIdGet", notes = "Gets the Case with matching id", response = ModelCase.class, tags = {
      "Cases",})
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "Case was returned", response = ModelCase.class),
      @ApiResponse(code = 400, message = "Error(s) found in include criteria"),
      @ApiResponse(code = 404, message = "Case was not found")})
  @RequestMapping(value = "/cases/{id}",
      produces = {"application/json"},
      method = RequestMethod.GET)
  ResponseEntity<ModelCase> casesByIdGet(
      @ApiParam(value = "Unique Id for Visit", required = true) @PathVariable("id") String id);

  @ApiOperation(value = "Post the specified id and caseObject.", nickname = "casesByIdPost", notes = "", tags = {
      "Cases",})
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "Success")})
  @RequestMapping(value = "/cases/{id}",
      consumes = {"application/json-patch+json", "application/json", "text/json", "application/_*+json"},
      method = RequestMethod.POST)
  ResponseEntity<Void> casesByIdPost(@ApiParam(value = "Identifier.", required = true) @PathVariable("id") String id,
      @ApiParam(value = "Case object.") @Valid @RequestBody ModelCase body);

  @ApiOperation(value = "Get the Cases", nickname = "casesGet", notes = "Get a paginated List of Cases", response = FetchResponseCase.class, tags = {
      "Cases",})
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "List of Cases was returned", response = FetchResponseCase.class),
      @ApiResponse(code = 400, message = "Error(s) found in fetch criteria")})
  @RequestMapping(value = "/cases",
      produces = {"application/json"},
      method = RequestMethod.GET)
  ResponseEntity<FetchResponseCase> casesGet(
      @ApiParam(value = "Specify any filter criteria to limit the results returned. Each filter is a name:value pair separated by the :: delimiter.</br>           By default no filtering is applied to the results.           The supported filters are - Id, Reference, CaseType, State, Category, EstabType, CoordCode, Contact, Address, Location, Htc, Priority, Description, SpecialInstructions, HoldUntil.         ")
      @Valid @RequestParam(value = "filter", required = false) String filter,
      @ApiParam(value = "Specify the zero based page number to be returned. If not specified the first page is returned.")
      @Valid @RequestParam(value = "pageNo", required = false) Integer pageNo,
      @ApiParam(value = "Specify the maximum number of results to return per request.")
      @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize);

}
