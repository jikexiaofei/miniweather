package com.miniweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * @author Jason
 *
 * @time 2017/6/9  10:05
 *
 * @desc 记录County的信息
 *
 */

public class County extends DataSupport {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    private String countyName;
    private String weatherId;
    private int cityId;

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
