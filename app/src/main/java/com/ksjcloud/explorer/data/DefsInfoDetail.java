package com.ksjcloud.explorer.data;

import com.google.gson.annotations.SerializedName;

public class DefsInfoDetail {
    @SerializedName("가격")
    String price;
    @SerializedName("경도")
    String longtiude;
    @SerializedName("데이터기준일")
    String date;
    @SerializedName("명칭")
    String name;
    @SerializedName("위도")
    String Latitude;
    @SerializedName("재고량")
    String count;
    @SerializedName("전화번호")
    String phone;
    @SerializedName("주소")
    String address;
    @SerializedName("코드")
    String code;

    public String getPrice() {
        return price;
    }

    public String getLongtiude() {
        return longtiude;
    }

    public String getDate() {
        return date;
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
}
