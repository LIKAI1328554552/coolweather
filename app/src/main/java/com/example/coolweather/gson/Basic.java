package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 李凯 on 2017/5/25.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;


    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
