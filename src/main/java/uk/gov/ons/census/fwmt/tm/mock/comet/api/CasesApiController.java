package uk.gov.ons.census.fwmt.tm.mock.comet.api;

import io.swagger.annotations.ApiParam;
import ma.glasnost.orika.MapperFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import uk.gov.ons.census.fwmt.common.data.modelcase.CasePause;
import uk.gov.ons.census.fwmt.common.data.modelcase.CaseRequest;
import uk.gov.ons.census.fwmt.common.data.modelcase.ModelCase;
import uk.gov.ons.census.fwmt.tm.mock.logging.MockMessageLogger;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.UUID;

@Controller
public class CasesApiController implements CasesApi {

  private static final Logger log = LoggerFactory.getLogger(CasesApiController.class);

  @Autowired
  private MockMessageLogger mockLogger;

  @Autowired
  private HttpServletRequest request;

  @Autowired
  private CaseManager caseManager;

  @Autowired
  private MapperFacade mapperFacade;

  public ResponseEntity<ModelCase> casesByIdGet(
      @ApiParam(value = "The Case identifier", required = true) @PathVariable("id") String id) {
    mockLogger.logEndpoint("CasesApiController", "casesByIdGet");
    ModelCase caseRequest = caseManager.getCase(id);
    if (caseRequest != null) {
      return new ResponseEntity<>(caseRequest, HttpStatus.ACCEPTED);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  public ResponseEntity<Void> casesByIdPauseDelete(
      @ApiParam(value = "The Case identifier", required = true) @PathVariable("id") String id) {
    String accept = request.getHeader("Accept");
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

  public ResponseEntity<CasePause> casesByIdPauseGet(
      @ApiParam(value = "The Case identifier", required = true) @PathVariable("id") String id) {
    String accept = request.getHeader("Accept");
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

  public ResponseEntity<CasePause> casesByIdPausePut(
      @ApiParam(value = "The Case identifier.", required = true) @PathVariable("id") String id,
      @ApiParam(value = "Pause to apply to the Case.") @Valid @RequestBody Object body) {
    String accept = request.getHeader("Accept");
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

  public ResponseEntity<ModelCase> casesByIdPut(
      @ApiParam(value = "The Case identifier", required = true) @PathVariable("id") String id,
      @ApiParam(value = "Case") @Valid @RequestBody CaseRequest body) {
    mockLogger.logEndpoint("CasesApiController", "casesByIdPost");
    String accept = request.getHeader("Accept");
    log.info("Job Recreived: " + body.getReference(), " with accept: " + accept);
    ModelCase mc = mapperFacade.map(body, ModelCase.class);
    mc.setId(UUID.fromString(id));
    caseManager.addCase(mc);
    return new ResponseEntity<>(HttpStatus.OK);
  }
}
