package uk.gov.ons.census.fwmt.tm.mock.tm.comet.api;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import uk.gov.ons.census.fwmt.common.data.modelcase.CasePause;
import uk.gov.ons.census.fwmt.common.data.modelcase.CasePauseRequest;
import uk.gov.ons.census.fwmt.common.data.modelcase.CaseCreateRequest;
import uk.gov.ons.census.fwmt.common.data.modelcase.ModelCase;
import uk.gov.ons.census.fwmt.tm.mock.comet.api.CasesApi;

import static org.junit.Assert.assertEquals;

@Ignore
@RunWith(SpringRunner.class)
@SpringBootTest
public class CasesApiControllerIntegrationTest {

  @Autowired
  private CasesApi casesApi;

  @Test
  public void casesByIdGetTest() {
    String id = "id_example";
    ResponseEntity<ModelCase> responseEntity = casesApi.casesByIdGet(id);
    assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
  }

  @Test
  public void casesByIdPostTest() {
    String id = "id_example";
    CaseCreateRequest body = new CaseCreateRequest();
    ResponseEntity<ModelCase> responseEntity = casesApi.casesByIdPut(id, body);
    assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
  }

  @Test
  public void casesByIdPauseDeleteTest() {
    String id = "id_example";
    ResponseEntity<Void> responseEntity = casesApi.casesByIdPauseDelete(id);
    assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
  }

  @Test
  public void casesByIdPauseGetTest() {
    String id = "id_example";
    ResponseEntity<CasePause> responseEntity = casesApi.casesByIdPauseGet(id);
    assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
  }

  @Test
  public void casesByIdPausePutTest() {
    String id = "id_example";
    CasePauseRequest body = new CasePauseRequest();
    ResponseEntity<CasePause> responseEntity = casesApi.casesByIdPausePut(id, body);
    assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
  }

  @Test
  public void casesByIdPutTest() {
    String id = "id_example";
    CaseCreateRequest body = new CaseCreateRequest();
    ResponseEntity<ModelCase> responseEntity = casesApi.casesByIdPut(id, body);
    assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
  }
}
