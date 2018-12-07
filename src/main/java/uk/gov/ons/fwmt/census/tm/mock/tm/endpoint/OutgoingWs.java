package uk.gov.ons.fwmt.census.tm.mock.tm.endpoint;

import com.consiliumtechnologies.schemas.mobile._2008._10.locationmessages.SubmitLocationRequest;
import com.consiliumtechnologies.schemas.mobile._2009._03.commonmessages.SubmitDocumentRequest;
import com.consiliumtechnologies.schemas.mobile._2009._03.visitsmessages.CompleteVisitRequest;
import com.consiliumtechnologies.schemas.mobile._2009._03.visitsmessages.RequestVisitRequest;
import com.consiliumtechnologies.schemas.mobile._2009._03.visitsmessages.UpdateVisitStatusRequest;
import com.consiliumtechnologies.schemas.mobile._2009._07.formsmessages.SubmitFormResultRequest;
import com.consiliumtechnologies.schemas.mobile._2009._09.compositemessages.CompositeVisitRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import uk.gov.ons.fwmt.census.tm.mock.logging.MockLogger;

import javax.xml.bind.JAXBElement;

@Slf4j
@Endpoint
public class OutgoingWs {
  private static final String NAMESPACE_URI = "http://schemas.consiliumtechnologies.com/services/mobile/2009/03/messaging";

  @Autowired
  MockLogger mockLogger;

  @PayloadRoot(namespace = NAMESPACE_URI, localPart = "updateVisitStatusRequest")
  @ResponsePayload
  public void sendUpdateVisitStatusRequestOutput(
      @RequestPayload JAXBElement<UpdateVisitStatusRequest> request) {
    mockLogger.logEndpoint("OutgoingWs", "sendMessage");
    mockLogger.logParsedRequest(request.getValue());
    mockLogger.logParsedResponse(null);
  }

  @PayloadRoot(namespace = NAMESPACE_URI, localPart = "completeVisitRequest")
  @ResponsePayload
  // TODO find a way to do this without returning the input
  // http://forum.spring.io/forum/spring-projects/web-services/42740-responding-with-an-empty-soap-body
  public void sendCompleteVisitStatusRequestOutputLowercase(
      @RequestPayload JAXBElement<CompleteVisitRequest> request) {
    mockLogger.logEndpoint("OutgoingWs", "sendCompleteVisitStatusRequestOutput");
    mockLogger.logParsedRequest(request);
    mockLogger.logParsedResponse(null);
  }

  @PayloadRoot(namespace = NAMESPACE_URI, localPart = "requestVisitRequest")
  @ResponsePayload
  public void sendRequestVisitRequestOutput(
      @RequestPayload JAXBElement<RequestVisitRequest> request) {
    mockLogger.logEndpoint("OutgoingWs", "sendRequestVisitRequestOutput");
    mockLogger.logParsedRequest(request);
    mockLogger.logParsedResponse(null);
  }

  @PayloadRoot(namespace = NAMESPACE_URI, localPart = "submitDocumentRequest")
  @ResponsePayload
  public void sendSubmitDocumentRequestOutput(
      @RequestPayload JAXBElement<SubmitDocumentRequest> request) {
    mockLogger.logEndpoint("OutgoingWs", "sendSubmitDocumentRequestOutput");
    mockLogger.logParsedRequest(request);
    mockLogger.logParsedResponse(null);
  }

  @PayloadRoot(namespace = NAMESPACE_URI, localPart = "compositeVisitRequest")
  @ResponsePayload
  public void sendCompositeVisitRequestOutput(
      @RequestPayload JAXBElement<CompositeVisitRequest> request) {
    mockLogger.logEndpoint("OutgoingWs", "sendCompositeVisitRequestOutput");
    mockLogger.logParsedRequest(request);
    mockLogger.logParsedResponse(null);
  }

  @PayloadRoot(namespace = NAMESPACE_URI, localPart = "submitFormResultRequest")
  @ResponsePayload
  public void sendSubmitFormResultRequestOutput(
      @RequestPayload JAXBElement<SubmitFormResultRequest> request) {
    mockLogger.logEndpoint("OutgoingWs", "sendSubmitFormResultRequestOutput");
    mockLogger.logParsedRequest(request);
    mockLogger.logParsedResponse(null);
  }

  @PayloadRoot(namespace = NAMESPACE_URI, localPart = "submitLocationRequest")
  @ResponsePayload
  public void sendSubmitLocationRequestOutput(
      @RequestPayload JAXBElement<SubmitLocationRequest> request) {
    mockLogger.logEndpoint("OutgoingWs", "sendSubmitLocationRequestOutput");
    mockLogger.logParsedRequest(request);
    mockLogger.logParsedResponse(null);
  }
}
