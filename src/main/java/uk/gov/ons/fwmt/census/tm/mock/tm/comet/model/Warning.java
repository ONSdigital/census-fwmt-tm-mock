package uk.gov.ons.fwmt.census.tm.mock.tm.comet.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import org.threeten.bp.OffsetDateTime;

import javax.validation.Valid;
import java.util.Objects;
import java.util.UUID;

/**
 * Warning
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-13T11:28:39.081413Z[Europe/London]")

public class Warning {
  @JsonProperty("outcomeId")
  private UUID outcomeId = null;

  @JsonProperty("warningId")
  private UUID warningId = null;

  @JsonProperty("warningContent")
  private String warningContent = null;

  @JsonProperty("dateCreated")
  private OffsetDateTime dateCreated = null;

  public Warning outcomeId(UUID outcomeId) {
    this.outcomeId = outcomeId;
    return this;
  }

  /**
   * Get outcomeId
   *
   * @return outcomeId
   **/
  @ApiModelProperty(value = "")

  @Valid

  public UUID getOutcomeId() {
    return outcomeId;
  }

  public void setOutcomeId(UUID outcomeId) {
    this.outcomeId = outcomeId;
  }

  public Warning warningId(UUID warningId) {
    this.warningId = warningId;
    return this;
  }

  /**
   * Get warningId
   *
   * @return warningId
   **/
  @ApiModelProperty(value = "")

  @Valid

  public UUID getWarningId() {
    return warningId;
  }

  public void setWarningId(UUID warningId) {
    this.warningId = warningId;
  }

  public Warning warningContent(String warningContent) {
    this.warningContent = warningContent;
    return this;
  }

  /**
   * Get warningContent
   *
   * @return warningContent
   **/
  @ApiModelProperty(value = "")

  public String getWarningContent() {
    return warningContent;
  }

  public void setWarningContent(String warningContent) {
    this.warningContent = warningContent;
  }

  public Warning dateCreated(OffsetDateTime dateCreated) {
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
    Warning warning = (Warning) o;
    return Objects.equals(this.outcomeId, warning.outcomeId) &&
        Objects.equals(this.warningId, warning.warningId) &&
        Objects.equals(this.warningContent, warning.warningContent) &&
        Objects.equals(this.dateCreated, warning.dateCreated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outcomeId, warningId, warningContent, dateCreated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Warning {\n");

    sb.append("    outcomeId: ").append(toIndentedString(outcomeId)).append("\n");
    sb.append("    warningId: ").append(toIndentedString(warningId)).append("\n");
    sb.append("    warningContent: ").append(toIndentedString(warningContent)).append("\n");
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

