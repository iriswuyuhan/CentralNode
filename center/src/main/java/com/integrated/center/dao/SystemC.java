package com.integrated.center.dao;

import com.integrated.center.util.CallInterface;

import static com.integrated.center.util.DataConstant.C_URL;

public class SystemC {
    public String getAllCourses(){
        return CallInterface.interfaceUtil(C_URL + "/getAllCourses", "");
    }

    public String getAllStudents(){
        return CallInterface.interfaceUtil(C_URL + "/getAllStudents", "");
    }

    public String getAllChoices(){
        return CallInterface.interfaceUtil(C_URL + "/getAllElectives", "");
    }

    public String chooseCourse(String sId, String cId){
        return CallInterface.interfaceUtil(C_URL + "/addCourse?Sno="+sId+"&Cno="+cId+"", "");
    }

    public String quitCourse(String sId, String cId){
        return CallInterface.interfaceUtil(C_URL + "/quitCourse?Sno="+sId+"&Cno="+cId+"", "");
    }

    /**
     *
     * @param student 待增加学生信息的 xml
     * @return
     */
    public String addStudent(String student){
        return CallInterface.interfaceUtil(C_URL + "/addStudent", student);
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
