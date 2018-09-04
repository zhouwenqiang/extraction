package com.example.extraction.entity;

import com.example.common.utils.DateUtils;

import java.util.Date;

public class Truckingorder {
    private int id;
    /**表单ID*/
    private String fromid;
    /**申请日期*/
    private String sqtime;
    /**所属分公司*/
    private String ssfgs;
    /**申请部门*/
    private String sqbm;
    /**申请人*/
    private String sqr;
    /**出车类型*/
    private String cclx;
    /**是否后补*/
    private String sfhb;
    /**申请事由*/
    private String sqsy;
    /**起始时间*/
    private String qstime;
    /**结束时间*/
    private String jstime;
    /**出发地点*/
    private String cfdd;
    /**目的地点*/
    private String mddd;
    /**随车负责人*/
    private String scfzr;
    /**随车负责人手机号*/
    private String scfzrphone;
    /**其他随车人员*/
    private String qtscry;
    /**审批人*/
    private String spr;
    /**派遣车辆*/
    private String pqcl;
    /**车型*/
    private String cx;
    /**派遣驾驶员*/
    private String pqjsy;
    /**驾驶员手机号*/
    private String jsyphone;
    /**出车公里数*/
    private String ccgls;
    /**回车公里数*/
    private String hcgls;
    /**本次公里数*/
    private String bcgls;
    /**本次耗油量*/
    private String bchyl;
    /**超速*/
    private String cs;
    /**疲劳驾驶*/
    private String pljs;
    /**急转弯*/
    private String jzw;
    /**急加速*/
    private String jjs;
    /**急刹车*/
    private String jsc;
    /**驾驶员评价*/
    private String jsypj;
    /**点击出发时间*/
    private String timebegin;
    /**点击到达时间*/
    private String timeend;

    /**创建时间*/
    private String createtime;
    /**查询条件  开始时间*/
    private String starttime;
    /**查询条件 结束时间*/
    private String endtime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFromid() {
        return fromid;
    }

    public void setFromid(String fromid) {
        this.fromid = fromid;
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

    public String getSsfgs() {
        return ssfgs;
    }

    public void setSsfgs(String ssfgs) {
        this.ssfgs = ssfgs;
    }

    public String getSqbm() {
        return sqbm;
    }

    public void setSqbm(String sqbm) {
        this.sqbm = sqbm;
    }

    public String getSqr() {
        return sqr;
    }

    public void setSqr(String sqr) {
        this.sqr = sqr;
    }

    public String getCclx() {
        return cclx;
    }

    public void setCclx(String cclx) {
        this.cclx = cclx;
    }

    public String getSfhb() {
        if("1".equals(sfhb)){
            sfhb="是";
        }else if("0".equals(sfhb)){
            sfhb="否";
        }else{

        }

        return sfhb;
    }

    public void setSfhb(String sfhb) {
        this.sfhb = sfhb;
    }

    public String getSqsy() {
        return sqsy;
    }

    public void setSqsy(String sqsy) {
        this.sqsy = sqsy;
    }

    public String getQstime() {
        if(qstime!=null && qstime.indexOf(".0")>0){
            return qstime.replace(".0","");
        }
        else{
            return qstime;
        }
    }

    public void setQstime(String qstime) {
        this.qstime = qstime;
    }

    public String getJstime() {
        if(jstime!=null && jstime.indexOf(".0")>0){
            return jstime.replace(".0","");
        }else{
            return jstime;
        }
    }

    public void setJstime(String jstime) {
        this.jstime = jstime;
    }

    public String getCfdd() {
        return cfdd;
    }

    public void setCfdd(String cfdd) {
        this.cfdd = cfdd;
    }

    public String getMddd() {
        return mddd;
    }

    public void setMddd(String mddd) {
        this.mddd = mddd;
    }

    public String getScfzr() {
        return scfzr;
    }

    public void setScfzr(String scfzr) {
        this.scfzr = scfzr;
    }

    public String getScfzrphone() {
        return scfzrphone;
    }

    public void setScfzrphone(String scfzrphone) {
        this.scfzrphone = scfzrphone;
    }

    public String getQtscry() {
        return qtscry;
    }

    public void setQtscry(String qtscry) {
        this.qtscry = qtscry;
    }

    public String getSpr() {
        return spr;
    }

    public void setSpr(String spr) {
        this.spr = spr;
    }

    public String getPqcl() {
        return pqcl;
    }

    public void setPqcl(String pqcl) {
        this.pqcl = pqcl;
    }

    public String getCx() {
        return cx;
    }

    public void setCx(String cx) {
        this.cx = cx;
    }

    public String getPqjsy() {
        return pqjsy;
    }

    public void setPqjsy(String pqjsy) {
        this.pqjsy = pqjsy;
    }

    public String getJsyphone() {
        return jsyphone;
    }

    public void setJsyphone(String jsyphone) {
        this.jsyphone = jsyphone;
    }

    public String getCcgls() {
        return ccgls;
    }

    public void setCcgls(String ccgls) {
        this.ccgls = ccgls;
    }

    public String getHcgls() {
        return hcgls;
    }

    public void setHcgls(String hcgls) {
        this.hcgls = hcgls;
    }

    public String getBcgls() {
        return bcgls;
    }

    public void setBcgls(String bcgls) {
        this.bcgls = bcgls;
    }

    public String getBchyl() {
        return bchyl;
    }

    public void setBchyl(String bchyl) {
        this.bchyl = bchyl;
    }

    public String getCs() {
        return cs;
    }

    public void setCs(String cs) {
        this.cs = cs;
    }

    public String getPljs() {
        return pljs;
    }

    public void setPljs(String pljs) {
        this.pljs = pljs;
    }

    public String getJzw() {
        return jzw;
    }

    public void setJzw(String jzw) {
        this.jzw = jzw;
    }

    public String getJjs() {
        return jjs;
    }

    public void setJjs(String jjs) {
        this.jjs = jjs;
    }

    public String getJsc() {
        return jsc;
    }

    public void setJsc(String jsc) {
        this.jsc = jsc;
    }

    public String getJsypj() {
        if("0".equals(jsypj)){
            jsypj="未评价";
        }else if("1".equals(jsypj)){
            jsypj="满意";
        }else if("2".equals(jsypj)){
            jsypj="一般";
        }else if("5".equals(jsypj)){
            jsypj="不满意";
        }else{

        }
        return jsypj;
    }

    public void setJsypj(String jsypj) {
        this.jsypj = jsypj;
    }

    public String getTimebegin() {
        if(timebegin!=null && timebegin.indexOf(".0")>0){
            return timebegin.replace(".0","");
        }else{
            return timebegin;
        }
    }

    public void setTimebegin(String timebegin) {
        this.timebegin = timebegin;
    }

    public String getTimeend() {
        if(timeend!=null && timeend.indexOf(".0")>0){
            return timeend.replace(".0","");
        }else{
            return timeend;
        }
    }

    public void setTimeend(String timeend) {
        this.timeend = timeend;
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
