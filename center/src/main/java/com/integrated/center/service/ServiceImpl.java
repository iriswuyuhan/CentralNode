package com.integrated.center.service;

import com.integrated.center.model.Choices;
import com.integrated.center.model.Courses;
import com.integrated.center.model.Students;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service{
    @Override
    public Boolean login(String name, String password) {
        return null;
    }

    @Override
    public Courses getShareCourses() {
        return null;
    }

    @Override
    public Courses getAllCourses() {
        return null;
    }

    @Override
    public Students getAllStudents() {
        return null;
    }

    @Override
    public Choices getAllChoices() {
        return null;
    }

    @Override
    public Boolean chooseCourse(String sId, String cId) {
        return null;
    }

    @Override
    public Boolean quitSubject(String sId, String cId) {
        return null;
    }
}
