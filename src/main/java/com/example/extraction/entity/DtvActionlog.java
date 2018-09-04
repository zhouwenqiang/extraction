package com.example.extraction.entity;

import java.util.Date;

public class DtvActionlog {
    private Integer id;

    private String corpname;

    private String extractobject;

    private Integer extractnumber;

    private Double extracttime;

    private Integer insertnumber;

    private Double inserttime;

    private String updateobject;

    private Integer updatenumber;

    private Double updatetime;

    private Integer deletenumber;

    private Double deletetime;

    private Date deletedate;

    private Date createtime;

    private Integer state;

    private String remark;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCorpname() {
        return corpname;
    }

    public void setCorpname(String corpname) {
        this.corpname = corpname == null ? null : corpname.trim();
    }

    public String getExtractobject() {
        return extractobject;
    }

    public void setExtractobject(String extractobject) {
        this.extractobject = extractobject == null ? null : extractobject.trim();
    }

    public Integer getExtractnumber() {
        return extractnumber;
    }

    public void setExtractnumber(Integer extractnumber) {
        this.extractnumber = extractnumber;
    }

    public Double getExtracttime() {
        return extracttime;
    }

    public void setExtracttime(Double extracttime) {
        this.extracttime = extracttime;
    }

    public Integer getInsertnumber() {
        return insertnumber;
    }

    public void setInsertnumber(Integer insertnumber) {
        this.insertnumber = insertnumber;
    }

    public Double getInserttime() {
        return inserttime;
    }

    public void setInserttime(Double inserttime) {
        this.inserttime = inserttime;
    }

    public Integer getDeletenumber() {
        return deletenumber;
    }

    public void setDeletenumber(Integer deletenumber) {
        this.deletenumber = deletenumber;
    }

    public Double getDeletetime() {
        return deletetime;
    }

    public void setDeletetime(Double deletetime) {
        this.deletetime = deletetime;
    }

    public Date getDeletedate() {
        return deletedate;
    }

    public void setDeletedate(Date deletedate) {
        this.deletedate = deletedate;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
    public Integer getUpdatenumber() {
        return updatenumber;
    }

    public void setUpdatenumber(Integer updatenumber) {
        this.updatenumber = updatenumber;
    }

    public Double getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Double updatetime) {
        this.updatetime = updatetime;
    }

    public String getUpdateobject() {
        return updateobject;
    }

    public void setUpdateobject(String updateobject) {
        this.updateobject = updateobject;
    }
}