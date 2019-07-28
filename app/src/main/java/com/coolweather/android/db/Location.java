package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

public class Location extends DataSupport {
    private int id;
    private String LocationName;
    private int LocationCode;
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLocationCode() {
        return LocationCode;
    }

    public void setLocationCode(int locationCode) {
        this.LocationCode = locationCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public String getLocationName() {
        return LocationName;
    }

    public void setLocationName(String LocationName) {
        this.LocationName = LocationName;
    }
}
