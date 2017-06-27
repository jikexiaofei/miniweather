package com.miniweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author Jason
 * @time 2017/6/27  20:17
 * @desc ${TODD}
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
