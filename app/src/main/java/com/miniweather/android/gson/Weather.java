package com.miniweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Jason
 * @time 2017/6/27  21:29
 * @desc ${TODD}
 */
public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
