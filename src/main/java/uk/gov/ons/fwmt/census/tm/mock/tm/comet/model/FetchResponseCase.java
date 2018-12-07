package uk.gov.ons.fwmt.census.tm.mock.tm.comet.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * FetchResponseCase
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-07T11:49:58.389925Z[Europe/London]")

public class FetchResponseCase {
  @JsonProperty("results")
  @Valid
  private List<ModelCase> results = new ArrayList<ModelCase>();

  @JsonProperty("paging")
  private PagingInfo paging = null;

  @JsonProperty("criteria")
  private FetchCriteria criteria = null;

  public FetchResponseCase results(List<ModelCase> results) {
    this.results = results;
    return this;
  }

  public FetchResponseCase addResultsItem(ModelCase resultsItem) {
    this.results.add(resultsItem);
    return this;
  }

  /**
   * Get results
   *
   * @return results
   **/
  @ApiModelProperty(required = true, readOnly = true, value = "")
  @NotNull

  @Valid

  public List<ModelCase> getResults() {
    return results;
  }

  public void setResults(List<ModelCase> results) {
    this.results = results;
  }

  public FetchResponseCase paging(PagingInfo paging) {
    this.paging = paging;
    return this;
  }

  /**
   * Get paging
   *
   * @return paging
   **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public PagingInfo getPaging() {
    return paging;
  }

  public void setPaging(PagingInfo paging) {
    this.paging = paging;
  }

  public FetchResponseCase criteria(FetchCriteria criteria) {
    this.criteria = criteria;
    return this;
  }

  /**
   * Get criteria
   *
   * @return criteria
   **/
  @ApiModelProperty(value = "")

  @Valid

  public FetchCriteria getCriteria() {
    return criteria;
  }

  public void setCriteria(FetchCriteria criteria) {
    this.criteria = criteria;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FetchResponseCase fetchResponseCase = (FetchResponseCase) o;
    return Objects.equals(this.results, fetchResponseCase.results) &&
        Objects.equals(this.paging, fetchResponseCase.paging) &&
        Objects.equals(this.criteria, fetchResponseCase.criteria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, paging, criteria);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FetchResponseCase {\n");

    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
    sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
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

