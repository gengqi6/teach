package com.tt.teach.pojo;

import java.io.Serializable;
import java.util.Date;

/**
*@作者：gengqi
*@时间：2018/12/19 14:31
*@描述：
*/
public class Student implements Serializable{
   private Integer studentNo;
   private String loginPwd;
   private String studentName;
   private String sex;
   private Integer gradeId;
   private String phone;
   private String address;
   private Date bornDate;
   private String email;
   private String identityCard;
   private String gradeName;

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public Integer getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(Integer studentNo) {
        this.studentNo = studentNo;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public Student() {
    }

    public Student(Integer studentNo, String loginPwd, String studentName, String sex, Integer gradeId, String phone, String address, Date bornDate, String email, String identityCard) {
        this.studentNo = studentNo;
        this.loginPwd = loginPwd;
        this.studentName = studentName;
        this.sex = sex;
        this.gradeId = gradeId;
        this.phone = phone;
        this.address = address;
        this.bornDate = bornDate;
        this.email = email;
        this.identityCard = identityCard;
    }
}
