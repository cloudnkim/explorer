package com.ksjcloud.explorer.data;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class DefsInfo {
    @SerializedName("currentCount")
    int currentCount;
    @SerializedName("matchCount")
    int matchCount;
    @SerializedName("totalCount")
    int totalCount;
    @SerializedName("data")
    ArrayList<DefsInfoDetail> dataList;

    public int getCurrentCount() {
        return currentCount;
    }

    public int getMatchCount() {
        return matchCount;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public ArrayList<DefsInfoDetail> getDataList() {
        return dataList;
    }
}
