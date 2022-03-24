
package com.test.tataconsultancy.weather.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

@SuppressWarnings("unused")
public class ConsolidatedWeather {

    @JsonProperty("air_pressure")
    private Double mAirPressure;
    @JsonProperty("applicable_date")
    private String mApplicableDate;
    @JsonProperty("created")
    private String mCreated;
    @JsonProperty("humidity")
    private Long mHumidity;
    @JsonProperty("id")
    private Long mId;
    @JsonProperty("max_temp")
    private Double mMaxTemp;
    @JsonProperty("min_temp")
    private Double mMinTemp;
    @JsonProperty("predictability")
    private Long mPredictability;
    @JsonProperty("the_temp")
    private Double mTheTemp;
    @JsonProperty("visibility")
    private Double mVisibility;
    @JsonProperty("weather_state_abbr")
    private String mWeatherStateAbbr;
    @JsonProperty("weather_state_name")
    private String mWeatherStateName;
    @JsonProperty("wind_direction")
    private Double mWindDirection;
    private String mWindDirectionCompass;
    @JsonProperty("wind_speed")
    private Double mWindSpeed;

    public Double getAirPressure() {
        return mAirPressure;
    }

    public void setAirPressure(Double airPressure) {
        mAirPressure = airPressure;
    }

    public String getApplicableDate() {
        return mApplicableDate;
    }

    public void setApplicableDate(String applicableDate) {
        mApplicableDate = applicableDate;
    }

    public String getCreated() {
        return mCreated;
    }

    public void setCreated(String created) {
        mCreated = created;
    }

    public Long getHumidity() {
        return mHumidity;
    }

    public void setHumidity(Long humidity) {
        mHumidity = humidity;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public Double getMaxTemp() {
        return mMaxTemp;
    }

    public void setMaxTemp(Double maxTemp) {
        mMaxTemp = maxTemp;
    }

    public Double getMinTemp() {
        return mMinTemp;
    }

    public void setMinTemp(Double minTemp) {
        mMinTemp = minTemp;
    }

    public Long getPredictability() {
        return mPredictability;
    }

    public void setPredictability(Long predictability) {
        mPredictability = predictability;
    }

    public Double getTheTemp() {
        return mTheTemp;
    }

    public void setTheTemp(Double theTemp) {
        mTheTemp = theTemp;
    }

    public Double getVisibility() {
        return mVisibility;
    }

    public void setVisibility(Double visibility) {
        mVisibility = visibility;
    }

    public String getWeatherStateAbbr() {
        return mWeatherStateAbbr;
    }

    public void setWeatherStateAbbr(String weatherStateAbbr) {
        mWeatherStateAbbr = weatherStateAbbr;
    }

    public String getWeatherStateName() {
        return mWeatherStateName;
    }

    public void setWeatherStateName(String weatherStateName) {
        mWeatherStateName = weatherStateName;
    }

    public Double getWindDirection() {
        return mWindDirection;
    }

    public void setWindDirection(Double windDirection) {
        mWindDirection = windDirection;
    }

    public String getWindDirectionCompass() {
        return mWindDirectionCompass;
    }

    public void setWindDirectionCompass(String windDirectionCompass) {
        mWindDirectionCompass = windDirectionCompass;
    }

    public Double getWindSpeed() {
        return mWindSpeed;
    }

    public void setWindSpeed(Double windSpeed) {
        mWindSpeed = windSpeed;
    }

}
