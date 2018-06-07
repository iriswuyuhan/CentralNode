package com.integrated.center.model;

public class StudentModel {
    private String sId;
    private String sName;
    private String gender;
    private String major;
    private String password;

    public StudentModel() {
    }

    public StudentModel(String sId, String sName, String gender, String major, String password) {
        this.sId = sId;
        this.sName = sName;
        this.gender = gender;
        this.major = major;
        this.password = password;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
