package com.integrated.center.model;

public class SubjectModel {
    private String id;
    private String name;
    private String time;
    private String score;
    private String teacher;
    private String location;
    private char share;//课程是否共享

    public SubjectModel() {
    }

    public SubjectModel(String id, String name, String time, String score, String teacher, String location, char share) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.score = score;
        this.teacher = teacher;
        this.location = location;
        this.share = share;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
