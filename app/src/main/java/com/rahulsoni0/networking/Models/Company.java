package com.rahulsoni0.networking.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Company {

    @Expose
    @SerializedName("bs")
    String bs;

    @Expose
    @SerializedName("catchPhrase")
    String catchPhrase;

    @Expose
    @SerializedName("name")
    String name;


    public String getBs() {
        return bs;
    }

    public void setBs(String bs) {
        this.bs = bs;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public void setCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company(String bs, String catchPhrase, String name) {
        this.bs = bs;
        this.catchPhrase = catchPhrase;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Company{" +
                "bs='" + bs + '\'' +
                ", catchPhrase='" + catchPhrase + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
