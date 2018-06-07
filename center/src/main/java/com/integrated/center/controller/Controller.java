package com.integrated.center.controller;

import com.integrated.center.model.Choices;
import com.integrated.center.model.Courses;
import com.integrated.center.model.Student;
import com.integrated.center.model.Students;
import com.integrated.center.service.Service;
import com.integrated.center.util.BeanToXml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.JAXBException;

@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    private Service service;

    @GetMapping("/login")
    public Boolean login(String name, String password){
        return service.login(name, password);
    }

    @GetMapping("/getShareCourses")
    public String getShareCourses(){
        Courses courses = service.getShareCourses();
        String res = "";
        try {
            res = BeanToXml.beanToXml(courses, Courses.class);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return res;
    }

    @GetMapping("/getAllCourses")
    public String getAllCourses(){
        Courses courses = service.getAllCourses();
        String res = "";
        try {
            res = BeanToXml.beanToXml(courses, Courses.class);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return res;
    }

    @GetMapping("/getAllStudents")
    public String getAllStudents(){
        Students students = service.getAllStudents();
        String res = "";
        try {
            res = BeanToXml.beanToXml(students, Students.class);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return res;
    }

    @GetMapping("/getAllChoices")
    public String getAllChoices(){
        Choices choices = service.getAllChoices();
        String res = "";
        try {
            res = BeanToXml.beanToXml(choices, Choices.class);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return res;
    }

    @GetMapping("/chooseCourse")
    public Boolean chooseCourse(String sId, String cId){
        return service.chooseCourse(sId, cId);
    }

    @GetMapping("/quitSubject")
    public Boolean quitSubject(String sId, String cId){
        return service.quitSubject(sId, cId);
    }
}
