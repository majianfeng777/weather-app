package com.newland.weather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

//存放gson模型
public class Weather {

    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecasts;
}
