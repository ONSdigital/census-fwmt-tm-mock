package uk.gov.ons.fwmt.census.tm.mock.logging;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.util.HtmlUtils;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

@Component
public class MockLogger {
  private ThreadLocal<MockMessage> currentMessage = new ThreadLocal<>();

  private List<MockMessage> messages = new Vector<>();

  private int count = 0;
  @Value("${customisation.logging.logFlagType.logAllMessages}")
  private boolean logAllMessages;

  // methods for mock logging

  private void setupCurrentMessage() {
    if (currentMessage.get() == null) {
      MockMessage message = new MockMessage();
      currentMessage.set(message);

      if (logAllMessages) {
        messages.add(message);
      }
      count++;
    }
  }

  public void logEndpoint(String endpoint, String method) {
    setupCurrentMessage();
    currentMessage.get().endpoint = endpoint;
    currentMessage.get().method = method;
  }

  public void logRawRequest(String rawHeaders, String rawHtml) {
    setupCurrentMessage();
    currentMessage.get().requestTimestamp = LocalDateTime.now().toString();
    if (rawHeaders != null) {
      currentMessage.get().requestRawHeaders = rawHeaders;
    }
    if (rawHtml != null) {
      currentMessage.get().requestRawHtml = HtmlUtils.htmlEscape(rawHtml);
    }
  }

  public <R> void logParsedRequest(R request) {
    setupCurrentMessage();
    currentMessage.get().requestMessageParsed = request;
  }

  public void logRawResponse(String rawHeaders, String rawHtml) {
    setupCurrentMessage();
    currentMessage.get().responseTimestamp = LocalDateTime.now().toString();
    currentMessage.get().isFault = false;
    getCurrentMessage(rawHeaders, rawHtml);
  }

  public <R> void logParsedResponse(R response) {
    setupCurrentMessage();
    currentMessage.get().responseMessageParsed = response;
  }

  public void logRawFault(String rawHeaders, String rawHtml) {
    setupCurrentMessage();
    currentMessage.get().responseTimestamp = LocalDateTime.now().toString();
    currentMessage.get().isFault = true;
    getCurrentMessage(rawHeaders, rawHtml);
  }

  private void getCurrentMessage(String rawHeaders, String rawHtml) {
    if (rawHeaders != null) {
      currentMessage.get().responseRawHeaders = rawHeaders;
    }
    if (rawHtml != null) {
      currentMessage.get().responseRawHtml = HtmlUtils.htmlEscape(rawHtml);
    }
  }

  public void finalise() {
    currentMessage.remove();
  }

  // methods for retrieving

  public List<MockMessage> getAllMessages() {
    if (!logAllMessages) {
      MockMessage messageCountResult = new MockMessage();
      messageCountResult.setRequestMessageParsed("Messages received by mock: " + count);
      messages.add(messageCountResult);
      return Collections.unmodifiableList(messages);
    }
    return Collections.unmodifiableList(messages);
  }

  public int getFaultCount() {
    return (int) (messages.stream().filter(MockMessage::isFault).count());
  }

  public void reset() {
    messages.clear();
    count = 0;
  }
}
