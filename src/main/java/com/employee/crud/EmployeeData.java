package com.employee.crud;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData {
    public static List<Employee> userdata(){
        List<Employee> list=new ArrayList<>();
        Employee userone=new Employee(0, "小明",20,"男");
        Employee usertwo=new Employee(1, "小红",19,"女");
        Employee userthree=new Employee(2, "小智",15,"男");
        Employee userfour=new Employee(3,"小刚",16,"女");
        Employee userfive=new Employee(4,"小夏",15,"女");
        list.add(userone);
        list.add(usertwo);
        list.add(userthree);
        list.add(userfour);
        list.add(userfive);
        return list;
    }
}
