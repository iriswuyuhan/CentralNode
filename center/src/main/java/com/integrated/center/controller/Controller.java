package com.integrated.center.controller;

import com.integrated.center.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
        return service.getShareCourses();
    }

    @GetMapping("/getAllCourses")
    public String getAllCourses(){
        return service.getAllCourses();
    }

    @GetMapping("/getAllStudents")
    public String getAllStudents(){
        return service.getAllStudents();
    }

    @GetMapping("/getAllChoices")
    public String getAllChoices(){
        return service.getAllChoices();
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
