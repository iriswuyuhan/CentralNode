package com.integrated.center.model;

public class Course {
    private String cId;
    private String name;
    private String time;
    private String score;
    private String teacher;
    private String location;
    private char share;//课程是否共享

    public Course() {
    }

    public Course(String cId, String name, String time, String score, String teacher, String location, char share) {
        this.cId = cId;
        this.name = name;
        this.time = time;
        this.score = score;
        this.teacher = teacher;
        this.location = location;
        this.share = share;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public char getShare() {
        return share;
    }

    public void setShare(char share) {
        this.share = share;
    }
}
