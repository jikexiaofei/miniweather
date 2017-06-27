package com.miniweather.android.gson;

/**
 * @author Jason
 * @time 2017/6/27  20:44
 * @desc ${TODD}
 */
public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
