package com.example.extraction.entity;

import com.example.common.utils.DateUtils;

import java.util.Date;

public class Vehiclefile {
    private int id;
    /**车牌号*/
    private String cph;
    /**所属公司*/
    private String ssfgs;
    /**使用部门*/
    private String sybm;
    /**车辆性质*/
    private String clxz;
    /**车辆类型*/
    private String cllx;
    /**车型*/
    private String cx;
    /**购入时间*/
    private String grtime;
    /**排量*/
    private String pl;
    /**理论百公里油耗*/
    private String llbglhy;
    /**核定百公里油耗*/
    private String hdbglyh;
    /**停放位置*/
    private String thwz;
    /**颜色*/
    private String ys;
    /**载人数*/
    private String zrs;
    /**SIM卡号*/
    private String simkh;
    /**油卡分卡号*/
    private String ykfkh;
    /**绑定驾驶员*/
    private String bdjsy;
    /**车辆固定资产编码*/
    private String clgdzcbm;
    /**ETC号码*/
    private String etchm;
    /**创建时间*/
    private String createtime;
    /**远程字段 油耗*/
    private String fuel;
    /**远程字段 里程 OR 插拔报警次数*/
    private String mileage="0";
    /**远程字段 仪表盘里程(公里)*/
    private String mileageobd="0";

    /**远程字段 拔出报警时间 OR 急减速*/
    private String bctime;
    /**远程字段 拔出报警地点 OR 急转弯*/
    private String bcads;
    /**远程字段 拔出时里程  OR 急刹车*/
    private String bclc;
    /**远程字段 拔出里程统计时间  OR 急加速 */
    private String bcTJtime;
    /**远程字段 插入报警时间  OR 四急合计 */
    private String crtime;
    /**远程字段 插入报警地点 OR  四急发生地点*/
    private String crads;
    /**远程字段 插入后里程 OR 四急发生时间 */
    private String crlc;
    /**远程字段 插入里程统计时间  OR 四急类型*/
    private String crTJtime;
    /**远程字段 里程差*/
    private String lcc;


    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCph() {
        return cph;
    }

    public void setCph(String cph) {
        this.cph = cph;
    }

    public String getSsfgs() {
        return ssfgs;
    }

    public void setSsfgs(String ssfgs) {
        this.ssfgs = ssfgs;
    }

    public String getSybm() {
        return sybm;
    }

    public void setSybm(String sybm) {
        this.sybm = sybm;
    }

    public String getClxz() {
        return clxz;
    }

    public void setClxz(String clxz) {
        this.clxz = clxz;
    }

    public String getCllx() {
        return cllx;
    }

    public void setCllx(String cllx) {
        this.cllx = cllx;
    }

    public String getCx() {
        return cx;
    }

    public void setCx(String cx) {
        this.cx = cx;
    }

    public String getGrtime() {
        return grtime;
    }

    public void setGrtime(String grtime) {
        this.grtime = grtime;
    }

    public String getPl() {
        return pl;
    }

    public void setPl(String pl) {
        this.pl = pl;
    }

    public String getLlbglhy() {
        return llbglhy;
    }

    public void setLlbglhy(String llbglhy) {
        this.llbglhy = llbglhy;
    }

    public String getHdbglyh() {
        return hdbglyh;
    }

    public void setHdbglyh(String hdbglyh) {
        this.hdbglyh = hdbglyh;
    }

    public String getThwz() {
        return thwz;
    }

    public void setThwz(String thwz) {
        this.thwz = thwz;
    }

    public String getYs() {
        return ys;
    }

    public void setYs(String ys) {
        this.ys = ys;
    }

    public String getZrs() {
        return zrs;
    }

    public void setZrs(String zrs) {
        this.zrs = zrs;
    }

    public String getSimkh() {
        return simkh;
    }

    public void setSimkh(String simkh) {
        this.simkh = simkh;
    }

    public String getYkfkh() {
        return ykfkh;
    }

    public void setYkfkh(String ykfkh) {
        this.ykfkh = ykfkh;
    }

    public String getBdjsy() {
        return bdjsy;
    }

    public void setBdjsy(String bdjsy) {
        this.bdjsy = bdjsy;
    }

    public String getClgdzcbm() {
        return clgdzcbm;
    }

    public void setClgdzcbm(String clgdzcbm) {
        this.clgdzcbm = clgdzcbm;
    }

    public String getEtchm() {
        return etchm;
    }

    public void setEtchm(String etchm) {
        this.etchm = etchm;
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

    public String getBctime() {
        return bctime;
    }

    public void setBctime(String bctime) {
        this.bctime = bctime;
    }

    public String getBcads() {
        return bcads;
    }

    public void setBcads(String bcads) {
        this.bcads = bcads;
    }

    public String getBclc() {
        return bclc;
    }

    public void setBclc(String bclc) {
        this.bclc = bclc;
    }

    public String getBcTJtime() {
        return bcTJtime;
    }

    public void setBcTJtime(String bcTJtime) {
        this.bcTJtime = bcTJtime;
    }

    public String getCrtime() {
        return crtime;
    }

    public void setCrtime(String crtime) {
        this.crtime = crtime;
    }

    public String getCrads() {
        return crads;
    }

    public void setCrads(String crads) {
        this.crads = crads;
    }

    public String getCrlc() {
        return crlc;
    }

    public void setCrlc(String crlc) {
        this.crlc = crlc;
    }

    public String getCrTJtime() {
        return crTJtime;
    }

    public void setCrTJtime(String crTJtime) {
        this.crTJtime = crTJtime;
    }

    public String getLcc() {
        return lcc;
    }

    public void setLcc(String lcc) {
        this.lcc = lcc;
    }
    public String getMileageobd() {
        return mileageobd;
    }

    public void setMileageobd(String mileageobd) {
        this.mileageobd = mileageobd;
    }


}
