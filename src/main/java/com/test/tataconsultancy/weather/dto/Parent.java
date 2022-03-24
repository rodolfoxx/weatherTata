
package com.test.tataconsultancy.weather.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Parent {

    @JsonProperty("latt_long")
    private String mLattLong;
    @JsonProperty("location_type")
    private String mLocationType;
    @JsonProperty("title")
    private String mTitle;
    @JsonProperty("woeid")
    private Long mWoeid;

    public String getLattLong() {
        return mLattLong;
    }

    public void setLattLong(String lattLong) {
        mLattLong = lattLong;
    }

    public String getLocationType() {
        return mLocationType;
    }

    public void setLocationType(String locationType) {
        mLocationType = locationType;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Long getWoeid() {
        return mWoeid;
    }

    public void setWoeid(Long woeid) {
        mWoeid = woeid;
    }

}
