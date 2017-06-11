package com.miniweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by zhanghu on 2017/6/9.
 */

/**
 * city记录城市的信息
 */

public class City extends DataSupport {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    private String cityName;

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    private int cityCode;

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    private int provinceId;

}
