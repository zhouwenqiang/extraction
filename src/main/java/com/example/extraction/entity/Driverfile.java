package com.example.extraction.entity;

import com.example.common.utils.DateUtils;

import java.util.Date;

public class Driverfile {

    private int id;
    /**驾驶员*/
    private String jsy;
    /**工龄*/
    private String age;
    /**所属分公司     */
    private String ssfgs;
    /**所属部门*/
    private String ssbm;
    /**驾驶证号*/
    private String jszh;
    /**驾驶证级别*/
    private String jszjb;
    /**初次领证时间*/
    private String cclztime;
    /**性别*/
    private String sex;
    /**手机号*/
    private String phone;
    /**手机短号**/
    private String sjdh;
    /**创建时间*/
    private String createtime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJsy() {
        return jsy;
    }

    public void setJsy(String jsy) {
        this.jsy = jsy;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSsfgs() {
        return ssfgs;
    }

    public void setSsfgs(String ssfgs) {
        this.ssfgs = ssfgs;
    }

    public String getSsbm() {
        return ssbm;
    }

    public void setSsbm(String ssbm) {
        this.ssbm = ssbm;
    }

    public String getJszh() {
        return jszh;
    }

    public void setJszh(String jszh) {
        this.jszh = jszh;
    }

    public String getJszjb() {
        return jszjb;
    }

    public void setJszjb(String jszjb) {
        this.jszjb = jszjb;
    }

    public String getCclztime() {
        return cclztime;
    }

    public void setCclztime(String cclztime) {
        this.cclztime = cclztime;
    }

    public String getSex() {
        if("1".equals(sex)){
            sex="男";
        }else if("0".equals(sex)){
            sex="女";
        }else{

        }
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSjdh() {
        return sjdh;
    }

    public void setSjdh(String sjdh) {
        this.sjdh = sjdh;
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