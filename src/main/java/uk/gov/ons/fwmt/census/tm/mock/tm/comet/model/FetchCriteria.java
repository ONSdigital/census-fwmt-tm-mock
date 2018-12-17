package uk.gov.ons.fwmt.census.tm.mock.tm.comet.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * FetchCriteria
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-07T11:49:58.389925Z[Europe/London]")

public class FetchCriteria {
  @JsonProperty("filter")
  private String filter = null;

  @JsonProperty("order")
  private String order = null;

  @JsonProperty("include")
  private String include = null;

  public FetchCriteria filter(String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Get filter
   *
   * @return filter
   **/
  @ApiModelProperty(value = "")

  public String getFilter() {
    return filter;
  }

  public void setFilter(String filter) {
    this.filter = filter;
  }

  public FetchCriteria order(String order) {
    this.order = order;
    return this;
  }

  /**
   * Get order
   *
   * @return order
   **/
  @ApiModelProperty(value = "")

  public String getOrder() {
    return order;
  }

  public void setOrder(String order) {
    this.order = order;
  }

  public FetchCriteria include(String include) {
    this.include = include;
    return this;
  }

  /**
   * Get include
   *
   * @return include
   **/
  @ApiModelProperty(value = "")

  public String getInclude() {
    return include;
  }

  public void setInclude(String include) {
    this.include = include;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FetchCriteria fetchCriteria = (FetchCriteria) o;
    return Objects.equals(this.filter, fetchCriteria.filter) &&
        Objects.equals(this.order, fetchCriteria.order) &&
        Objects.equals(this.include, fetchCriteria.include);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, order, include);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FetchCriteria {\n");

    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

