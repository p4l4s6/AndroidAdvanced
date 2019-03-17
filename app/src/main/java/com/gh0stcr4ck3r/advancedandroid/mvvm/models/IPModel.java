package com.gh0stcr4ck3r.advancedandroid.mvvm.models;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by cr4ck3r
 * Date: 3/17/19
 * Owner: Raisul Islam
 * Copyright (c) 2019 . All rights reserved.
 */
@Entity(tableName = "ip_table")
public class IPModel {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    private Integer id;
    @SerializedName("ip")
    @Expose
    private String ip;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("region")
    @Expose
    private String region;
    @SerializedName("region_code")
    @Expose
    private String regionCode;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("country_name")
    @Expose
    private String countryName;
    @SerializedName("continent_code")
    @Expose
    private String continentCode;
    @SerializedName("in_eu")
    @Expose
    private Boolean inEu;
    @SerializedName("postal")
    @Expose
    private String postal;
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("longitude")
    @Expose
    private Double longitude;
    @SerializedName("timezone")
    @Expose
    private String timezone;
    @SerializedName("utc_offset")
    @Expose
    private String utcOffset;
    @SerializedName("country_calling_code")
    @Expose
    private String countryCallingCode;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("languages")
    @Expose
    private String languages;
    @SerializedName("asn")
    @Expose
    private String asn;
    @SerializedName("org")
    @Expose
    private String org;

    @NonNull
    public Integer getId() {
        return id;
    }

    public void setId(@NonNull Integer id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getContinentCode() {
        return continentCode;
    }

    public void setContinentCode(String continentCode) {
        this.continentCode = continentCode;
    }

    public Boolean getInEu() {
        return inEu;
    }

    public void setInEu(Boolean inEu) {
        this.inEu = inEu;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getUtcOffset() {
        return utcOffset;
    }

    public void setUtcOffset(String utcOffset) {
        this.utcOffset = utcOffset;
    }

    public String getCountryCallingCode() {
        return countryCallingCode;
    }

    public void setCountryCallingCode(String countryCallingCode) {
        this.countryCallingCode = countryCallingCode;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getAsn() {
        return asn;
    }

    public void setAsn(String asn) {
        this.asn = asn;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }
}
