package com.tt.teach.pojo;

import java.io.Serializable;

public class Admins implements Serializable{

    private Integer adminNo;
    private String loginPwd;
    private String adminName;
    private String sex;

    public Integer getAdminNo() {
        return adminNo;
    }

    public void setAdminNo(Integer adminNo) {
        this.adminNo = adminNo;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Admins() {
    }

    public Admins(Integer adminNo, String loginPwd, String adminName, String sex) {
        this.adminNo = adminNo;
        this.loginPwd = loginPwd;
        this.adminName = adminName;
        this.sex = sex;
    }
}
