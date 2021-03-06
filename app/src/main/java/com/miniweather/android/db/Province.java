package com.miniweather.android.db;

import org.litepal.crud.DataSupport;
/**
 * @author Jason
 *
 * @time 2017/6/9  10:03
 *
 * @desc 记录provice的信息
 *
 */

public class Province extends DataSupport {
    private  int id;

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }


    private  String provinceName;

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    private  int provinceCode;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
