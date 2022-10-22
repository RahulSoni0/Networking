package com.rahulsoni0.networking.Models;

import com.google.gson.annotations.SerializedName;

public class PicModelItem {
    @SerializedName("albumId")
    int albumId;

    @SerializedName("id")
    int id;

    @SerializedName("thumbnailUrl")
    String thumbnailUrl;

    @SerializedName("title")
    String title;

    @SerializedName("url")
    String url;

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public PicModelItem(int albumId, int id, String thumbnailUrl, String title, String url) {
        this.albumId = albumId;
        this.id = id;
        this.thumbnailUrl = thumbnailUrl;
        this.title = title;
        this.url = url;
    }

    @Override
    public String toString() {
        return "PicModelItem{" +
                "albumId=" + albumId +
                ", id=" + id +
                ", thumbnailUrl='" + thumbnailUrl + '\'' +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
