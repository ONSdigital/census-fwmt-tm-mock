package uk.gov.ons.fwmt.census.tm.mock.tm.comet.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * LatLong
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-07T11:49:58.389925Z[Europe/London]")

public class LatLong {
  @JsonProperty("lat")
  private Double lat = null;

  @JsonProperty("long")
  private Double lon = null;

  public LatLong lat(Double lat) {
    this.lat = lat;
    return this;
  }

  /**
   * Latitude
   *
   * @return lat
   **/
  @ApiModelProperty(required = true, value = "Latitude")
  @NotNull

  public Double getLat() {
    return lat;
  }

  public void setLat(Double lat) {
    this.lat = lat;
  }

  public LatLong lon(Double lon) {
    this.lon = lon;
    return this;
  }

  /**
   * Longitude
   *
   * @return _long
   **/
  @ApiModelProperty(required = true, value = "Longitude")
  @NotNull

  public Double getLong() {
    return lon;
  }

  public void setLong(Double lon) {
    this.lon = lon;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LatLong latLong = (LatLong) o;
    return Objects.equals(this.lat, latLong.lat) &&
        Objects.equals(this.lon, latLong.lon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lat, lon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LatLong {\n");

    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    _long: ").append(toIndentedString(lon)).append("\n");
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

