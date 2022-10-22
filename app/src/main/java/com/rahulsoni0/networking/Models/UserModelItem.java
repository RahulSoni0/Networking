package com.rahulsoni0.networking.Models;

import com.google.gson.annotations.SerializedName;

public class UserModelItem {

    Address address;
    @SerializedName("company")
    Company Company;
    String email;
    int id;
    String name;
    String phone;
    String username;
    String website;

    public UserModelItem(Address address, com.rahulsoni0.networking.Models.Company company, String email, int id, String name, String phone, String username, String website) {
        this.address = address;
        Company = company;
        this.email = email;
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.username = username;
        this.website = website;
    }

    @Override
    public String toString() {
        return "UserModelItem{" +
                "address=" + address +
                ", Company=" + Company +
                ", email='" + email + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", username='" + username + '\'' +
                ", website='" + website + '\'' +
                '}';
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public com.rahulsoni0.networking.Models.Company getCompany() {
        return Company;
    }

    public void setCompany(com.rahulsoni0.networking.Models.Company company) {
        Company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
