package com.example.extraction.entity;

import com.example.common.utils.DateUtils;

import java.util.Date;

public class Maintenanceorder {
    private Integer id;

    private String bdid;

    private String companyname;

    private String sqtime;

    private String sqbmid;

    private String sqbmname;

    private String squserid;

    private String squsername;

    private String cphmid;

    private String cphmname;

    private String wxid;

    private String wxname;

    private String jsyid;

    private String jsyname;

    private String jsyphone;

    private String scgls;

    private String mqgls;

    private String xlcid;

    private String xlcname;

    private String yjwxkssj;

    private String yjwxjssj;

    private String sjwxkssj;

    private String sjwxjssj;

    private String gzsm;

    private String createtime;
    /**查询条件  开始时间*/
    private String starttime;
    /**查询条件 结束时间*/
    private String endtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBdid() {
        return bdid;
    }

    public void setBdid(String bdid) {
        this.bdid = bdid == null ? null : bdid.trim();
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getSqtime() {
        if(sqtime!=null && sqtime.indexOf(".0")>0){
            return sqtime.replace(".0","");
        }else{
            return sqtime;
        }
    }

    public void setSqtime(String sqtime) {
        this.sqtime = sqtime;
    }

    public String getSqbmid() {
        return sqbmid;
    }

    public void setSqbmid(String sqbmid) {
        this.sqbmid = sqbmid;
    }

    public String getSqbmname() {
        return sqbmname;
    }

    public void setSqbmname(String sqbmname) {
        this.sqbmname = sqbmname == null ? null : sqbmname.trim();
    }

    public String getSquserid() {
        return squserid;
    }

    public void setSquserid(String squserid) {
        this.squserid = squserid;
    }

    public String getSqusername() {
        return squsername;
    }

    public void setSqusername(String squsername) {
        this.squsername = squsername == null ? null : squsername.trim();
    }

    public String getCphmid() {
        return cphmid;
    }

    public void setCphmid(String cphmid) {
        this.cphmid = cphmid;
    }

    public String getCphmname() {
        return cphmname;
    }

    public void setCphmname(String cphmname) {
        this.cphmname = cphmname == null ? null : cphmname.trim();
    }

    public String getWxid() {
        return wxid;
    }

    public void setWxid(String wxid) {
        this.wxid = wxid;
    }

    public String getWxname() {
        return wxname;
    }

    public void setWxname(String wxname) {
        this.wxname = wxname == null ? null : wxname.trim();
    }

    public String getJsyid() {
        return jsyid;
    }

    public void setJsyid(String jsyid) {
        this.jsyid = jsyid;
    }

    public String getJsyname() {
        return jsyname;
    }

    public void setJsyname(String jsyname) {
        this.jsyname = jsyname == null ? null : jsyname.trim();
    }

    public String getJsyphone() {
        return jsyphone;
    }

    public void setJsyphone(String jsyphone) {
        this.jsyphone = jsyphone == null ? null : jsyphone.trim();
    }

    public String getScgls() {
        return scgls;
    }

    public void setScgls(String scgls) {
        this.scgls = scgls;
    }

    public String getMqgls() {
        return mqgls;
    }

    public void setMqgls(String mqgls) {
        this.mqgls = mqgls;
    }

    public String getXlcid() {
        return xlcid;
    }

    public void setXlcid(String xlcid) {
        this.xlcid = xlcid;
    }

    public String getXlcname() {
        return xlcname;
    }

    public void setXlcname(String xlcname) {
        this.xlcname = xlcname == null ? null : xlcname.trim();
    }

    public String getYjwxkssj() {
        return yjwxkssj;
    }

    public void setYjwxkssj(String yjwxkssj) {
        this.yjwxkssj = yjwxkssj;
    }

    public String getYjwxjssj() {
        return yjwxjssj;
    }

    public void setYjwxjssj(String yjwxjssj) {
        this.yjwxjssj = yjwxjssj;
    }

    public String getSjwxkssj() {
        return sjwxkssj;
    }

    public void setSjwxkssj(String sjwxkssj) {
        this.sjwxkssj = sjwxkssj;
    }

    public String getSjwxjssj() {
        return sjwxjssj;
    }

    public void setSjwxjssj(String sjwxjssj) {
        this.sjwxjssj = sjwxjssj;
    }

    public String getGzsm() {
        return gzsm;
    }

    public void setGzsm(String gzsm) {
        this.gzsm = gzsm == null ? null : gzsm.trim();
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

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }
}