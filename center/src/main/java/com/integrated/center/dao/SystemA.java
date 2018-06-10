package com.integrated.center.dao;

import com.integrated.center.util.CallInterface;

import static com.integrated.center.util.DataConstant.A_URL;

public class SystemA {
    public String getAllCourses(){
        return CallInterface.interfaceUtil(A_URL + "/course/getAll/", "");
    }

    public String getAllStudents(){
        return CallInterface.interfaceUtil(A_URL + "/student/getAll/", "");
    }

    public String getAllChoices(){
        return CallInterface.interfaceUtil(A_URL + "/getAllElectives", "");
    }

    public String chooseCourse(String sId, String cId){
        return CallInterface.interfaceUtil(A_URL + "/course/select?sid="+sId+"&cid="+cId+"", "");
    }

    public String quitCourse(String sId, String cId){
        return CallInterface.interfaceUtil(A_URL + "/course/drop?sid="+sId+"&cid="+cId+"", "");
    }

    /**
     *
     * @param student 待增加学生信息的 xml
     * @return
     */
    public String addStudent(String student){
        return CallInterface.interfaceUtil(A_URL + "/addStudent", student);
    }
}
