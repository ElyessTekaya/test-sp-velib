
package com.example.messagingstompwebsocket.pojos;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "ebike", "capacity", "name", "nom_arrondissement_communes", "numbikesavailable", "is_installed",
        "is_renting", "mechanical", "stationcode", "dist", "coordonnees_geo", "numdocksavailable", "duedate",
        "is_returning" })
public class Station {

    @JsonProperty("ebike")
    private Integer ebike;
    @JsonProperty("capacity")
    private Integer capacity;
    @JsonProperty("name")
    private String name;
    @JsonProperty("nom_arrondissement_communes")
    private String nomArrondissementCommunes;
    @JsonProperty("numbikesavailable")
    private Integer numbikesavailable;
    @JsonProperty("is_installed")
    private String isInstalled;
    @JsonProperty("is_renting")
    private String isRenting;
    @JsonProperty("mechanical")
    private Integer mechanical;
    @JsonProperty("stationcode")
    private String stationcode;
    @JsonProperty("dist")
    private String dist;
    @JsonProperty("coordonnees_geo")
    private List<Double> coordonneesGeo = null;
    @JsonProperty("numdocksavailable")
    private Integer numdocksavailable;
    @JsonProperty("duedate")
    private String duedate;
    @JsonProperty("is_returning")
    private String isReturning;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ebike")
    public Integer getEbike() {
        return ebike;
    }

    @JsonProperty("ebike")
    public void setEbike(Integer ebike) {
        this.ebike = ebike;
    }

    @JsonProperty("capacity")
    public Integer getCapacity() {
        return capacity;
    }

    @JsonProperty("capacity")
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("nom_arrondissement_communes")
    public String getNomArrondissementCommunes() {
        return nomArrondissementCommunes;
    }

    @JsonProperty("nom_arrondissement_communes")
    public void setNomArrondissementCommunes(String nomArrondissementCommunes) {
        this.nomArrondissementCommunes = nomArrondissementCommunes;
    }

    @JsonProperty("numbikesavailable")
    public Integer getNumbikesavailable() {
        return numbikesavailable;
    }

    @JsonProperty("numbikesavailable")
    public void setNumbikesavailable(Integer numbikesavailable) {
        this.numbikesavailable = numbikesavailable;
    }

    @JsonProperty("is_installed")
    public String getIsInstalled() {
        return isInstalled;
    }

    @JsonProperty("is_installed")
    public void setIsInstalled(String isInstalled) {
        this.isInstalled = isInstalled;
    }

    @JsonProperty("is_renting")
    public String getIsRenting() {
        return isRenting;
    }

    @JsonProperty("is_renting")
    public void setIsRenting(String isRenting) {
        this.isRenting = isRenting;
    }

    @JsonProperty("mechanical")
    public Integer getMechanical() {
        return mechanical;
    }

    @JsonProperty("mechanical")
    public void setMechanical(Integer mechanical) {
        this.mechanical = mechanical;
    }

    @JsonProperty("stationcode")
    public String getStationcode() {
        return stationcode;
    }

    @JsonProperty("stationcode")
    public void setStationcode(String stationcode) {
        this.stationcode = stationcode;
    }

    @JsonProperty("dist")
    public String getDist() {
        return dist;
    }

    @JsonProperty("dist")
    public void setDist(String dist) {
        this.dist = dist;
    }

    @JsonProperty("coordonnees_geo")
    public List<Double> getCoordonneesGeo() {
        return coordonneesGeo;
    }

    @JsonProperty("coordonnees_geo")
    public void setCoordonneesGeo(List<Double> coordonneesGeo) {
        this.coordonneesGeo = coordonneesGeo;
    }

    @JsonProperty("numdocksavailable")
    public Integer getNumdocksavailable() {
        return numdocksavailable;
    }

    @JsonProperty("numdocksavailable")
    public void setNumdocksavailable(Integer numdocksavailable) {
        this.numdocksavailable = numdocksavailable;
    }

    @JsonProperty("duedate")
    public String getDuedate() {
        return duedate;
    }

    @JsonProperty("duedate")
    public void setDuedate(String duedate) {
        this.duedate = duedate;
    }

    @JsonProperty("is_returning")
    public String getIsReturning() {
        return isReturning;
    }

    @JsonProperty("is_returning")
    public void setIsReturning(String isReturning) {
        this.isReturning = isReturning;
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
