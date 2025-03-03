
package com.example.messagingstompwebsocket.pojos;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "nhits", "parameters", "records", "facet_groups" })
public class RecupData {

  @JsonProperty("nhits")
  private Integer nhits;
  @JsonProperty("parameters")
  private Parameters parameters;
  @JsonProperty("records")
  private List<Record> records = null;
  @JsonProperty("facet_groups")
  private List<FacetGroup> facetGroups = null;
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  @JsonProperty("nhits")
  public Integer getNhits() {
    return nhits;
  }

  @JsonProperty("nhits")
  public void setNhits(Integer nhits) {
    this.nhits = nhits;
  }

  @JsonProperty("parameters")
  public Parameters getParameters() {
    return parameters;
  }

  @JsonProperty("parameters")
  public void setParameters(Parameters parameters) {
    this.parameters = parameters;
  }

  @JsonProperty("records")
  public List<Record> getRecords() {
    return records;
  }

  @JsonProperty("records")
  public void setRecords(List<Record> records) {
    this.records = records;
  }

  @JsonProperty("facet_groups")
  public List<FacetGroup> getFacetGroups() {
    return facetGroups;
  }

  @JsonProperty("facet_groups")
  public void setFacetGroups(List<FacetGroup> facetGroups) {
    this.facetGroups = facetGroups;
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
