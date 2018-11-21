package uk.gov.ons.fwmt.service_mocks.comet.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-11-21T14:54:52.766Z")
@Controller
public class OfficerAvailabilityApiController implements OfficerAvailabilityApi {

  private static final Logger log = LoggerFactory.getLogger(OfficerAvailabilityApiController.class);

  private final ObjectMapper objectMapper;

  private final HttpServletRequest request;

  @org.springframework.beans.factory.annotation.Autowired
  public OfficerAvailabilityApiController(ObjectMapper objectMapper, HttpServletRequest request) {
    this.objectMapper = objectMapper;
    this.request = request;
  }

  public ResponseEntity<Void> roster(
      @ApiParam(value = "") @Valid @RequestParam(value = "startDate", required = false) String startDate,
      @ApiParam(value = "") @Valid @RequestParam(value = "endDate", required = false) String endDate) {
    String accept = request.getHeader("Accept");
    return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
  }

}
