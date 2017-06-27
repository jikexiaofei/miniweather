package com.miniweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author Jason
 * @time 2017/6/27  20:49
 * @desc ${TODD}
 */
public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
