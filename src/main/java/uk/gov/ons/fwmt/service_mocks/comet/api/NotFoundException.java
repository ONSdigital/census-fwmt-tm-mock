package uk.gov.ons.fwmt.service_mocks.comet.api;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-11-21T14:54:52.766Z")
public class NotFoundException extends ApiException {
  private int code;

  public NotFoundException(int code, String msg) {
    super(code, msg);
    this.code = code;
  }
}
