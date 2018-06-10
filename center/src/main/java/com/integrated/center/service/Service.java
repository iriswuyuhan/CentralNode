package com.integrated.center.service;

public interface Service {
    public Boolean login(String name, String password);

    public String getShareCourses();

    public String getAllCourses();

    public String getAllStudents();

    public String getAllChoices();

    public Boolean chooseCourse(String sId, String cId);

    public Boolean quitSubject(String sId, String cId);
}
