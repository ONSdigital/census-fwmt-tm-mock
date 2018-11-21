package uk.gov.ons.fwmt.service_mocks.comet.api;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-11-21T14:54:52.766Z")
public class ApiException extends Exception {
  private int code;

  public ApiException(int code, String msg) {
    super(msg);
    this.code = code;
  }
}
