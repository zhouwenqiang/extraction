package com.example.extraction.entity;

import com.example.common.utils.DateUtils;

import java.util.Date;

public class Canmileage {
    private int id ;
    /**手机号*/
    private String phone;
    /**原数据生成时间*/
    private String time;
    /**OBD里程*/
    private String mileageObd;
    /**里程*/
    private String mileage;
    /**油耗*/
    private String oilWear;
    /**抽取数据时间*/
    private String createtime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMileageObd() {
        return mileageObd;
    }

    public void setMileageObd(String mileageObd) {
        this.mileageObd = mileageObd;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public String getOilWear() {
        return oilWear;
    }

    public void setOilWear(String oilWear) {
        this.oilWear = oilWear;
    }

    public String getCreatetime() {
        if(null != createtime){
            return createtime;
        }else{
            return DateUtils.format(new Date());
        }
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }
}
