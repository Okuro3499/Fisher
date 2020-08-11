
package com.jade.fisher.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ImageGallery {

    @SerializedName("src")
    @Expose
    private String src;
    @SerializedName("alt")
    @Expose
    private String alt;
    @SerializedName("title")
    @Expose
    private String title;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ImageGallery() {
    }

    /**
     * 
     * @param src
     * @param alt
     * @param title
     */
    public ImageGallery(String src, String alt, String title) {
        super();
        this.src = src;
        this.alt = alt;
        this.title = title;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
