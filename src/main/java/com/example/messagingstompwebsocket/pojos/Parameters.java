
package com.example.messagingstompwebsocket.pojos;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "dataset", "timezone", "rows", "start", "format", "geofilter.distance", "facet" })
public class Parameters {

  @JsonProperty("dataset")
  private String dataset;
  @JsonProperty("timezone")
  private String timezone;
  @JsonProperty("rows")
  private Integer rows;
  @JsonProperty("start")
  private Integer start;
  @JsonProperty("format")
  private String format;
  @JsonProperty("geofilter.distance")
  private List<String> geofilterDistance = null;
  @JsonProperty("facet")
  private List<String> facet = null;
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  @JsonProperty("dataset")
  public String getDataset() {
    return dataset;
  }

  @JsonProperty("dataset")
  public void setDataset(String dataset) {
    this.dataset = dataset;
  }

  @JsonProperty("timezone")
  public String getTimezone() {
    return timezone;
  }

  @JsonProperty("timezone")
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  @JsonProperty("rows")
  public Integer getRows() {
    return rows;
  }

  @JsonProperty("rows")
  public void setRows(Integer rows) {
    this.rows = rows;
  }

  @JsonProperty("start")
  public Integer getStart() {
    return start;
  }

  @JsonProperty("start")
  public void setStart(Integer start) {
    this.start = start;
  }

  @JsonProperty("format")
  public String getFormat() {
    return format;
  }

  @JsonProperty("format")
  public void setFormat(String format) {
    this.format = format;
  }

  @JsonProperty("geofilter.distance")
  public List<String> getGeofilterDistance() {
    return geofilterDistance;
  }

  @JsonProperty("geofilter.distance")
  public void setGeofilterDistance(List<String> geofilterDistance) {
    this.geofilterDistance = geofilterDistance;
  }

  @JsonProperty("facet")
  public List<String> getFacet() {
    return facet;
  }

  @JsonProperty("facet")
  public void setFacet(List<String> facet) {
    this.facet = facet;
  }

  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }

  @JsonAnySetter
  public void setAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
  }

}
