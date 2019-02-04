package uk.gov.ons.fwmt.census.tm.mock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.gov.ons.fwmt.census.tm.mock.logging.MockLogger;
import uk.gov.ons.fwmt.census.tm.mock.logging.MockMessage;

import java.util.List;

@RestController
@RequestMapping("logger")
public class MockLoggerController {
  private MockLogger mockLogger;

  @Autowired
  public MockLoggerController(MockLogger mockLogger) {
    this.mockLogger = mockLogger;
  }

  @GetMapping(value = "allMessages", produces = "application/json")
  public ResponseEntity<List<MockMessage>> getAllMessages() {
    List<MockMessage> messages = mockLogger.getAllMessages();
    if (messages == null) {
      return new ResponseEntity<>(HttpStatus.SERVICE_UNAVAILABLE);
    } else {
      return new ResponseEntity<>(messages, HttpStatus.OK);
    }
  }

  @GetMapping(value = "getCount", produces = "application/json")
  public int getJobCount() {
    return mockLogger.getJobCount();
  }

  @GetMapping(value = "faultCount", produces = "application/json")
  public int getFaultCount() {
    return mockLogger.getFaultCount();
  }

  @GetMapping(value = "reset")
  public void reset() {
    mockLogger.reset();
  }
}
