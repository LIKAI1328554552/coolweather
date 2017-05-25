package com.example.coolweather.gson;

/**
 * Created by 李凯 on 2017/5/25.
 */

public class AQI {
    public AQICity city;

    public class AQICity{

        public String aqi;

        public String pm25;
    }
}
