package uk.gov.ons.fwmt.census.tm.mock.tm.comet.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import org.threeten.bp.OffsetDateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ModelCase
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-13T11:28:39.081413Z[Europe/London]")

public class ModelCase {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("reference")
  private String reference = null;

  @JsonProperty("caseType")
  private String caseType = null;

  @JsonProperty("outcomes")
  @Valid
  private List<Outcome> outcomes = null;

  @JsonProperty("state")
  private StateEnum state = null;

  @JsonProperty("category")
  private String category = null;

  @JsonProperty("estabType")
  private String estabType = null;

  @JsonProperty("coordCode")
  private String coordCode = null;
  @JsonProperty("warnings")
  @Valid
  private List<Warning> warnings = null;
  @JsonProperty("notes")
  @Valid
  private List<Note> notes = null;
  @JsonProperty("visitCount")
  private Integer visitCount = null;

  @JsonProperty("contact")
  private Contact contact = null;

  @JsonProperty("address")
  private Address address = null;

  @JsonProperty("location")
  private LatLong location = null;

  @JsonProperty("htc")
  private Integer htc = null;

  @JsonProperty("priority")
  private Integer priority = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("specialInstructions")
  private String specialInstructions = null;

  @JsonProperty("holdUntil")
  private OffsetDateTime holdUntil = null;

  /**
   * Get id
   *
   * @return id
   **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  public String getId() {
    return id;
  }

  @JsonProperty("_links")
  @Valid
  private List<Link> _links = null;

  public ModelCase id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get reference
   * @return reference
   **/
  @ApiModelProperty(value = "")

  public String getReference() {
    return reference;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ModelCase reference(String reference) {
    this.reference = reference;
    return this;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  /**
   * Get caseType
   * @return caseType
   **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getCaseType() {
    return caseType;
  }

  public void setCaseType(String caseType) {
    this.caseType = caseType;
  }

  public ModelCase caseType(String caseType) {
    this.caseType = caseType;
    return this;
  }

  /**
   * Get state
   * @return state
   **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public ModelCase state(StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * Get category
   * @return category
   **/
  @ApiModelProperty(value = "")


  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public ModelCase category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Get estabType
   * @return estabType
   **/
  @ApiModelProperty(value = "")


  public String getEstabType() {
    return estabType;
  }

  public void setEstabType(String estabType) {
    this.estabType = estabType;
  }

  public ModelCase estabType(String estabType) {
    this.estabType = estabType;
    return this;
  }

  /**
   * Get coordCode
   * @return coordCode
   **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  public String getCoordCode() {
    return coordCode;
  }

  public ModelCase coordCode(String coordCode) {
    this.coordCode = coordCode;
    return this;
  }

  public ModelCase outcomes(List<Outcome> outcomes) {
    this.outcomes = outcomes;
    return this;
  }

  public void setCoordCode(String coordCode) {
    this.coordCode = coordCode;
  }

  public ModelCase addOutcomesItem(Outcome outcomesItem) {
    if (this.outcomes == null) {
      this.outcomes = new ArrayList<Outcome>();
    }
    this.outcomes.add(outcomesItem);
    return this;
  }

  /**
   * Get outcomes
   *
   * @return outcomes
   **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Outcome> getOutcomes() {
    return outcomes;
  }

  public void setOutcomes(List<Outcome> outcomes) {
    this.outcomes = outcomes;
  }

  public ModelCase warnings(List<Warning> warnings) {
    this.warnings = warnings;
    return this;
  }

  public ModelCase addWarningsItem(Warning warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<Warning>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

  /**
   * Get warnings
   *
   * @return warnings
   **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Warning> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<Warning> warnings) {
    this.warnings = warnings;
  }

  public ModelCase notes(List<Note> notes) {
    this.notes = notes;
    return this;
  }

  public ModelCase addNotesItem(Note notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<Note>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Get notes
   *
   * @return notes
   **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Note> getNotes() {
    return notes;
  }

  public void setNotes(List<Note> notes) {
    this.notes = notes;
  }

  /**
   * Get htc
   *
   * @return htc
   **/
  @ApiModelProperty(value = "")

  public Integer getHtc() {
    return htc;
  }

  public ModelCase contact(Contact contact) {
    this.contact = contact;
    return this;
  }

  /**
   * Get contact
   * @return contact
   **/
  @ApiModelProperty(value = "")

  @Valid

  public Contact getContact() {
    return contact;
  }

  public void setContact(Contact contact) {
    this.contact = contact;
  }

  public ModelCase address(Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   **/
  @ApiModelProperty(value = "")

  @Valid

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public ModelCase location(LatLong location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   **/
  @ApiModelProperty(value = "")

  @Valid

  public LatLong getLocation() {
    return location;
  }

  public void setLocation(LatLong location) {
    this.location = location;
  }

  public ModelCase htc(Integer htc) {
    this.htc = htc;
    return this;
  }

  /**
   * Get priority
   * @return priority
   **/
  @ApiModelProperty(value = "")

  public Integer getPriority() {
    return priority;
  }

  public void setHtc(Integer htc) {
    this.htc = htc;
  }

  public ModelCase priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get description
   * @return description
   **/
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public ModelCase description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get specialInstructions
   * @return specialInstructions
   **/
  @ApiModelProperty(value = "")

  public String getSpecialInstructions() {
    return specialInstructions;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ModelCase specialInstructions(String specialInstructions) {
    this.specialInstructions = specialInstructions;
    return this;
  }

  /**
   * Get holdUntil
   * @return holdUntil
   **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getHoldUntil() {
    return holdUntil;
  }

  public void setSpecialInstructions(String specialInstructions) {
    this.specialInstructions = specialInstructions;
  }

  public ModelCase holdUntil(OffsetDateTime holdUntil) {
    this.holdUntil = holdUntil;
    return this;
  }

  public ModelCase visitCount(Integer visitCount) {
    this.visitCount = visitCount;
    return this;
  }

  public void setHoldUntil(OffsetDateTime holdUntil) {
    this.holdUntil = holdUntil;
  }

  /**
   * Get visitCount
   * @return visitCount
   **/
  @ApiModelProperty(value = "")

  public Integer getVisitCount() {
    return visitCount;
  }

  public void setVisitCount(Integer visitCount) {
    this.visitCount = visitCount;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelCase _case = (ModelCase) o;
    return Objects.equals(this.id, _case.id) &&
        Objects.equals(this.reference, _case.reference) &&
        Objects.equals(this.caseType, _case.caseType) &&
        Objects.equals(this.state, _case.state) &&
        Objects.equals(this.category, _case.category) &&
        Objects.equals(this.estabType, _case.estabType) &&
        Objects.equals(this.coordCode, _case.coordCode) &&
        Objects.equals(this.outcomes, _case.outcomes) &&
        Objects.equals(this.warnings, _case.warnings) &&
        Objects.equals(this.notes, _case.notes) &&
        Objects.equals(this.contact, _case.contact) &&
        Objects.equals(this.address, _case.address) &&
        Objects.equals(this.location, _case.location) &&
        Objects.equals(this.htc, _case.htc) &&
        Objects.equals(this.priority, _case.priority) &&
        Objects.equals(this.description, _case.description) &&
        Objects.equals(this.specialInstructions, _case.specialInstructions) &&
        Objects.equals(this.holdUntil, _case.holdUntil) &&
        Objects.equals(this.visitCount, _case.visitCount) &&
        Objects.equals(this._links, _case._links);
  }

  public ModelCase _links(List<Link> _links) {
    this._links = _links;
    return this;
  }

  public ModelCase addLinksItem(Link _linksItem) {
    if (this._links == null) {
      this._links = new ArrayList<Link>();
    }
    this._links.add(_linksItem);
    return this;
  }

  /**
   * Get _links
   *
   * @return _links
   **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Link> getLinks() {
    return _links;
  }

  public void setLinks(List<Link> _links) {
    this._links = _links;
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(id, reference, caseType, state, category, estabType, coordCode, outcomes, warnings, notes, contact,
            address, location, htc, priority, description, specialInstructions, holdUntil, visitCount, _links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelCase {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    caseType: ").append(toIndentedString(caseType)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    estabType: ").append(toIndentedString(estabType)).append("\n");
    sb.append("    coordCode: ").append(toIndentedString(coordCode)).append("\n");
    sb.append("    outcomes: ").append(toIndentedString(outcomes)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    htc: ").append(toIndentedString(htc)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    specialInstructions: ").append(toIndentedString(specialInstructions)).append("\n");
    sb.append("    holdUntil: ").append(toIndentedString(holdUntil)).append("\n");
    sb.append("    visitCount: ").append(toIndentedString(visitCount)).append("\n");
    sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
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

  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    OPEN("open"),

    CLOSED("closed");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
}

