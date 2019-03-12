package uk.gov.ons.census.fwmt.tm.mock.comet.api;

import org.springframework.stereotype.Component;
import uk.gov.ons.census.fwmt.common.data.modelcase.ModelCase;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class CaseManager {
  private Map<String, ModelCase> caseDirectory = new ConcurrentHashMap<>();

  public void addCase(ModelCase modelCase) {
    caseDirectory.put(String.valueOf(modelCase.getId()), modelCase);
  }

  public ModelCase getCase(String id) {
    return caseDirectory.get(id);
  }

  public void reset() {
    caseDirectory.clear();
  }
}
