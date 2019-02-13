package uk.gov.ons.fwmt.census.tm.mock.comet.api;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Component;

import uk.gov.ons.fwmt.census.common.data.modelcase.ModelCase;

@Component
public class CaseManager {
  private Map<String, ModelCase> caseDirectory = new ConcurrentHashMap<>();
  
  public void addCase(ModelCase kase) {
    caseDirectory.put(kase.getId(), kase);
  }
  
  public ModelCase getCase(String id) {
    return caseDirectory.get(id);
  }

  public void reset() {
    caseDirectory.clear();
  }
}
