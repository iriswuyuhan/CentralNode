package com.integrated.center.model;

import java.util.List;

public class Courses {
    private List<Course> courses;

    public Courses() {
    }

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
