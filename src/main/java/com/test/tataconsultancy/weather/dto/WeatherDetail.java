
package com.test.tataconsultancy.weather.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherDetail {

    @JsonProperty("consolidated_weather")
    private List<ConsolidatedWeather> mConsolidatedWeather;
    @JsonProperty("latt_long")
    private String mLattLong;
    @JsonProperty("location_type")
    private String mLocationType;
    @JsonProperty("parent")
    private Parent mParent;
    @JsonProperty("sources")
    private List<Source> mSources;
    @JsonProperty("sun_rise")
    private String mSunRise;
    @JsonProperty("sun_set")
    private String mSunSet;
    @JsonProperty("time")
    private String mTime;
    @JsonProperty("timezone")
    private String mTimezone;
    @JsonProperty("timezone_name")
    private String mTimezoneName;
    @JsonProperty("title")
    private String mTitle;
    @JsonProperty("woeid")
    private Long mWoeid;

    public List<ConsolidatedWeather> getConsolidatedWeather() {
        return mConsolidatedWeather;
    }

    public void setConsolidatedWeather(List<ConsolidatedWeather> consolidatedWeather) {
        mConsolidatedWeather = consolidatedWeather;
    }

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

    public Parent getParent() {
        return mParent;
    }

    public void setParent(Parent parent) {
        mParent = parent;
    }

    public List<Source> getSources() {
        return mSources;
    }

    public void setSources(List<Source> sources) {
        mSources = sources;
    }

    public String getSunRise() {
        return mSunRise;
    }

    public void setSunRise(String sunRise) {
        mSunRise = sunRise;
    }

    public String getSunSet() {
        return mSunSet;
    }

    public void setSunSet(String sunSet) {
        mSunSet = sunSet;
    }

    public String getTime() {
        return mTime;
    }

    public void setTime(String time) {
        mTime = time;
    }

    public String getTimezone() {
        return mTimezone;
    }

    public void setTimezone(String timezone) {
        mTimezone = timezone;
    }

    public String getTimezoneName() {
        return mTimezoneName;
    }

    public void setTimezoneName(String timezoneName) {
        mTimezoneName = timezoneName;
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
