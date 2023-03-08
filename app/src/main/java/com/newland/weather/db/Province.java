package com.newland.weather.db;

import org.litepal.crud.DataSupport;

//db存放数据库模型
public class Province extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getProvinceName(){
        return cityName;
    }
    public void setProvinceName(String cityName){
        this.cityName=cityName;
    }
    public int getProvinceCode(){
        return cityCode;
    }
    public void setProvinceCode(int cityCode){
        this.cityCode=cityCode;
    }

}
