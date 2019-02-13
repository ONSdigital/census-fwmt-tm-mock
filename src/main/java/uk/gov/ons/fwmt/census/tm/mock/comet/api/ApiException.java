package uk.gov.ons.fwmt.census.tm.mock.comet.api;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-07T11:49:58.389925Z[Europe/London]")

public class ApiException extends Exception {
  public ApiException(int code, String msg) {
    super(Integer.toString(code) + ": " + msg);
  }
}
