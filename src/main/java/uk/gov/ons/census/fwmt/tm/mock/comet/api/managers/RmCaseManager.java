package uk.gov.ons.census.fwmt.tm.mock.comet.api.managers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import uk.gov.ons.census.fwmt.common.data.nc.CaseDetailsDTO;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class RmCaseManager {
  private Map<String, CaseDetailsDTO> rmRefusalCaseDirectory = new ConcurrentHashMap<>();

  @Value("${customisation.logging.logFlagType.logAllMessages}")
  private boolean logAllMessages;

  public void enableCaseManager() {
    logAllMessages = true;
  }

  public void disableCaseManager() {
    logAllMessages = false;
  }

  public void addCase(CaseDetailsDTO modelCase) {
    if (logAllMessages) {
      rmRefusalCaseDirectory.put(String.valueOf(modelCase.getCaseId()), modelCase);
    }
  }

  public CaseDetailsDTO getRmRefusalCases(String id) {
    return rmRefusalCaseDirectory.get(id);
  }

  public void reset() {
    rmRefusalCaseDirectory.clear();
  }
}
