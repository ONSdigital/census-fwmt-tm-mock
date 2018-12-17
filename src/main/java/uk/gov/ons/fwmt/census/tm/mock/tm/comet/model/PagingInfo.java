package uk.gov.ons.fwmt.census.tm.mock.tm.comet.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * PagingInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-07T11:49:58.389925Z[Europe/London]")

public class PagingInfo {
  @JsonProperty("pageNo")
  private Integer pageNo = null;

  @JsonProperty("pageSize")
  private Integer pageSize = null;

  @JsonProperty("pageCount")
  private Integer pageCount = null;

  @JsonProperty("totalCount")
  private Integer totalCount = null;

  @JsonProperty("previous")
  private String previous = null;

  @JsonProperty("next")
  private String next = null;

  public PagingInfo pageNo(Integer pageNo) {
    this.pageNo = pageNo;
    return this;
  }

  /**
   * Get pageNo
   *
   * @return pageNo
   **/
  @ApiModelProperty(value = "")

  public Integer getPageNo() {
    return pageNo;
  }

  public void setPageNo(Integer pageNo) {
    this.pageNo = pageNo;
  }

  public PagingInfo pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Get pageSize
   *
   * @return pageSize
   **/
  @ApiModelProperty(value = "")

  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public PagingInfo pageCount(Integer pageCount) {
    this.pageCount = pageCount;
    return this;
  }

  /**
   * Get pageCount
   *
   * @return pageCount
   **/
  @ApiModelProperty(value = "")

  public Integer getPageCount() {
    return pageCount;
  }

  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }

  public PagingInfo totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * Get totalCount
   *
   * @return totalCount
   **/
  @ApiModelProperty(value = "")

  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public PagingInfo previous(String previous) {
    this.previous = previous;
    return this;
  }

  /**
   * Get previous
   *
   * @return previous
   **/
  @ApiModelProperty(value = "")

  public String getPrevious() {
    return previous;
  }

  public void setPrevious(String previous) {
    this.previous = previous;
  }

  public PagingInfo next(String next) {
    this.next = next;
    return this;
  }

  /**
   * Get next
   *
   * @return next
   **/
  @ApiModelProperty(value = "")

  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagingInfo pagingInfo = (PagingInfo) o;
    return Objects.equals(this.pageNo, pagingInfo.pageNo) &&
        Objects.equals(this.pageSize, pagingInfo.pageSize) &&
        Objects.equals(this.pageCount, pagingInfo.pageCount) &&
        Objects.equals(this.totalCount, pagingInfo.totalCount) &&
        Objects.equals(this.previous, pagingInfo.previous) &&
        Objects.equals(this.next, pagingInfo.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNo, pageSize, pageCount, totalCount, previous, next);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagingInfo {\n");

    sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
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

