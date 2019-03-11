package uk.gov.ons.census.fwmt.tm.mock.comet.api;

import org.springframework.stereotype.Component;
import uk.gov.ons.census.fwmt.common.data.modelcase.CaseRequest;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class CaseManager {
  private Map<String, CaseRequest> caseDirectory = new ConcurrentHashMap<>();

  public void addCase(CaseRequest caseRequest) {
    caseDirectory.put(caseRequest.getReference(), caseRequest);
  }

  public CaseRequest getCase(String id) {
    return caseDirectory.get(id);
  }

  public void reset() {
    caseDirectory.clear();
  }
}
