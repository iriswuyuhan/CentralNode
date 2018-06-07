package com.integrated.center.model;

public class Account {
    private String name;//账户名
    private String password;
    private Integer level;//级别
    private String sId;//客体，学生id外键

    public Account() {
    }

    public Account(String name, String password, Integer level, String sId) {
        this.name = name;
        this.password = password;
        this.level = level;
        this.sId = sId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }
}
