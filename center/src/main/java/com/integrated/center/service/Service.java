package com.integrated.center.service;

import com.integrated.center.model.Choices;
import com.integrated.center.model.Courses;
import com.integrated.center.model.Students;

public interface Service {
    public Boolean login(String name, String password);

    public Courses getShareCourses();

    public Courses getAllCourses();

    public Students getAllStudents();

    public Choices getAllChoices();

    public Boolean chooseCourse(String sId, String cId);

    public Boolean quitSubject(String sId, String cId);
}
