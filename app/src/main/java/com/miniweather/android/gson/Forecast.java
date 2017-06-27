package com.miniweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author Jason
 * @time 2017/6/27  21:19
 * @desc ${TODD}
 */
public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;
    public class Temperature {
        public String max;
        public  String min;
    }
    public class More{
        @SerializedName("tx_d")
        public String info;
    }
}
