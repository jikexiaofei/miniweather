package com.miniweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author Jason
 * @time 2017/6/27  21:09
 * @desc ${TODD}
 */
public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public CarWash carWash;
    public Sport sport;

    public class Comfort{
        @SerializedName("txt")
        public String info;
    }
    public class CarWash{
        @SerializedName("txt")
        public String info;
    }
    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}
