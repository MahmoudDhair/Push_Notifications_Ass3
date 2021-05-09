package com.mahmoud.ass3.Api.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GlobalModel {
    @SerializedName("status")
    @Expose
    public Boolean status;
    @SerializedName("statusCode")
    @Expose
    public Integer statusCode;
    @SerializedName("msg")
    @Expose
    public String msg;
//    @SerializedName("data")
//    @Expose
//    public Data data;
}
