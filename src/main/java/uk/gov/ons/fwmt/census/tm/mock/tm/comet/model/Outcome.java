package uk.gov.ons.fwmt.census.tm.mock.tm.comet.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import org.threeten.bp.OffsetDateTime;

import javax.validation.Valid;
import java.util.Objects;
import java.util.UUID;

/**
 * Outcome
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-13T11:28:39.081413Z[Europe/London]")

public class Outcome {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("result")
  private Integer result = null;

  @JsonProperty("dateCreated")
  private OffsetDateTime dateCreated = null;

  public Outcome id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   *
   * @return id
   **/
  @ApiModelProperty(value = "")

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Outcome result(Integer result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   *
   * @return result
   **/
  @ApiModelProperty(value = "")

  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }

  public Outcome dateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

  /**
   * Get dateCreated
   *
   * @return dateCreated
   **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Outcome outcome = (Outcome) o;
    return Objects.equals(this.id, outcome.id) &&
        Objects.equals(this.result, outcome.result) &&
        Objects.equals(this.dateCreated, outcome.dateCreated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, result, dateCreated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Outcome {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
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

