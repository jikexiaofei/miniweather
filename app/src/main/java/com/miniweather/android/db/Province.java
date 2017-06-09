package com.miniweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by zhanghu on 2017/6/9.
 */

/**
 * province记录省份的信息
 */
public class Province extends DataSupport {
    private  int id;

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    private  String provinceName;
    private  int provinceId;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
