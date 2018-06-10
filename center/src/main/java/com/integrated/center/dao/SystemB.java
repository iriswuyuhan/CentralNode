package com.integrated.center.dao;

import com.integrated.center.util.CallInterface;

import static com.integrated.center.util.DataConstant.B_URL;

public class SystemB {
    public String getAllCourses(){
        return CallInterface.interfaceUtil(B_URL + "/B_Subject", "");
    }

    public String getAllStudents(){
        return CallInterface.interfaceUtil(B_URL + "/student", "");
    }

    public String getAllChoices(){
        return CallInterface.interfaceUtil(B_URL + "/choice", "");
    }

    public String chooseCourse(String sId, String cId){
        return CallInterface.interfaceUtil(B_URL + "/chooseSubject?s_id="+sId+"&c_id="+cId+"","");
    }

    public String quitCourse(String sId, String cId){
        return CallInterface.interfaceUtil(B_URL + "/deleteSubject?s_id="+sId+"&c_id="+cId+"", "");
    }

    /**
     *
     * @param student 待增加学生信息的 xml
     * @return
     */
    public String addStudent(String student){
        return CallInterface.interfaceUtil(B_URL + "/addStudent", student);
    }

    /**
     * test
     * @param args
     */
    public static void main(String[] args){
        SystemB systemB = new SystemB();
        systemB.getAllCourses();
    }
}
