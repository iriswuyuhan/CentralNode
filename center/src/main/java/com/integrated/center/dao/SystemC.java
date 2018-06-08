package com.integrated.center.dao;

import com.integrated.center.model.Choices;
import com.integrated.center.model.Courses;
import com.integrated.center.model.Students;
import com.integrated.center.util.CallInterface;

import static com.integrated.center.util.DataConstant.C_URL;

public class SystemC {
    public Courses getAllCourses(){
        String courses = CallInterface.interfaceUtil(C_URL + "/getAllCourses", "");
        return null;
    }

    public Students getAllStudents(){
        String students = CallInterface.interfaceUtil(C_URL + "/getAllStudents", "");
        return null;
    }

    public Choices getAllChoices(){
        String choices = CallInterface.interfaceUtil(C_URL + "/getAllElectives", "");
        return null;
    }

    public Boolean chooseCourse(String sId, String cId){
        String res = CallInterface.interfaceUtil(C_URL + "/addCourse", "");
        return null;
    }

    public Boolean quitCourse(String sId, String cId){
        String res = CallInterface.interfaceUtil(C_URL + "/quitCourse", "");
        return null;
    }

    /**
     *
     * @param student 待增加学生信息的 xml
     * @return
     */
    public Boolean addStudent(String student){
        String res = CallInterface.interfaceUtil(C_URL + "/addStudent", student);
        return null;
    }

    /**
     * test
     * @param args
     */
    public static void main(String[] args){
        SystemC systemC = new SystemC();
        systemC.getAllCourses();
    }
}
