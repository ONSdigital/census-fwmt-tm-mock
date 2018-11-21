package uk.gov.ons.fwmt.service_mocks.comet.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import uk.gov.ons.fwmt.service_mocks.comet.model.Body;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-11-21T14:54:52.766Z")
@Controller
public class CasesApiController implements CasesApi {

  private static final Logger log = LoggerFactory.getLogger(CasesApiController.class);

  private final ObjectMapper objectMapper;

  private final HttpServletRequest request;

  @org.springframework.beans.factory.annotation.Autowired
  public CasesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
    this.objectMapper = objectMapper;
    this.request = request;
  }

  public ResponseEntity<Void> getCases(
      @ApiParam(value = "Specifies the filters to be applied to the search") @Valid @RequestParam(value = "filter", required = false) String filter,
      @ApiParam(value = "The page to be returned.") @Valid @RequestParam(value = "pageNo", required = false) Integer pageNo,
      @ApiParam(value = "The size of the page to be returned") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize) {
    String accept = request.getHeader("Accept");
    return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
  }

  public ResponseEntity<Void> createOrAmendCase(
      @ApiParam(value = "The case id", required = true) @PathVariable("id") String id,
      @ApiParam(value = "") @Valid @RequestBody Body body) {
    String accept = request.getHeader("Accept");
    return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
  }

  public ResponseEntity<Void> getCase(
      @ApiParam(value = "The case identifier", required = true) @PathVariable("id") String id) {
    String accept = request.getHeader("Accept");
    return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
  }

}
