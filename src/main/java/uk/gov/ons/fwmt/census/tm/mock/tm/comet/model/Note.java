package uk.gov.ons.fwmt.census.tm.mock.tm.comet.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import org.threeten.bp.OffsetDateTime;

import javax.validation.Valid;
import java.util.Objects;
import java.util.UUID;

/**
 * Note
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-13T11:28:39.081413Z[Europe/London]")

public class Note {
  @JsonProperty("outcomeId")
  private UUID outcomeId = null;

  @JsonProperty("noteId")
  private UUID noteId = null;

  @JsonProperty("noteContent")
  private String noteContent = null;

  @JsonProperty("dateCreated")
  private OffsetDateTime dateCreated = null;

  public Note outcomeId(UUID outcomeId) {
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

  public Note noteId(UUID noteId) {
    this.noteId = noteId;
    return this;
  }

  /**
   * Get noteId
   *
   * @return noteId
   **/
  @ApiModelProperty(value = "")

  @Valid

  public UUID getNoteId() {
    return noteId;
  }

  public void setNoteId(UUID noteId) {
    this.noteId = noteId;
  }

  public Note noteContent(String noteContent) {
    this.noteContent = noteContent;
    return this;
  }

  /**
   * Get noteContent
   *
   * @return noteContent
   **/
  @ApiModelProperty(value = "")

  public String getNoteContent() {
    return noteContent;
  }

  public void setNoteContent(String noteContent) {
    this.noteContent = noteContent;
  }

  public Note dateCreated(OffsetDateTime dateCreated) {
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
    Note note = (Note) o;
    return Objects.equals(this.outcomeId, note.outcomeId) &&
        Objects.equals(this.noteId, note.noteId) &&
        Objects.equals(this.noteContent, note.noteContent) &&
        Objects.equals(this.dateCreated, note.dateCreated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outcomeId, noteId, noteContent, dateCreated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Note {\n");

    sb.append("    outcomeId: ").append(toIndentedString(outcomeId)).append("\n");
    sb.append("    noteId: ").append(toIndentedString(noteId)).append("\n");
    sb.append("    noteContent: ").append(toIndentedString(noteContent)).append("\n");
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

