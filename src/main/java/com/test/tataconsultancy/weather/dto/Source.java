
package com.test.tataconsultancy.weather.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Source {

    @JsonProperty("crawl_rate")
    private Long mCrawlRate;
    @JsonProperty("slug")
    private String mSlug;
    @JsonProperty("title")
    private String mTitle;
    @JsonProperty("url")
    private String mUrl;

    public Long getCrawlRate() {
        return mCrawlRate;
    }

    public void setCrawlRate(Long crawlRate) {
        mCrawlRate = crawlRate;
    }

    public String getSlug() {
        return mSlug;
    }

    public void setSlug(String slug) {
        mSlug = slug;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

}
