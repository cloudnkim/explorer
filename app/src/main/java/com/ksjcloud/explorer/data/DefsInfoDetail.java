package com.ksjcloud.explorer.data;

import com.google.gson.annotations.SerializedName;

public class DefsInfoDetail {
    @SerializedName("price")
    String price;
    @SerializedName("lng")
    String longtiude;
    @SerializedName("regDt")
    String regdate;
    @SerializedName("name")
    String name;
    @SerializedName("lat")
    String Latitude;
    @SerializedName("inventory")
    String count;
    @SerializedName("tel")
    String phone;
    @SerializedName("addr")
    String address;
    @SerializedName("code")
    String code;
    @SerializedName("openTime")
    String openTime;
    @SerializedName("color")
    String color;

    public String getPrice() {
        return price;
    }

    public String getLongtiude() {
        return longtiude;
    }

    public String getRegDt() {
        return regdate;
    }

    public String getName() {
        return name;
    }

    public String getLatitude() {
        return Latitude;
    }

    public String getCount() {
        return count;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getCode() {
        return code;
    }

    public String getOpenTime() {
        return openTime;
    }

    public String getColor() {
        return color;
    }
}
