package com.example.aishnaagrawal.ardemo.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by aishnaagrawal on 11/17/17.
 */

public class LocationTime {

    @SerializedName("data")
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


}
