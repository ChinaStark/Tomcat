package com.Luv.util;

import com.Luv.pojo1.Student;
import com.alibaba.fastjson.JSON;

public class transfer {
<<<<<<< HEAD
    public  void JsonToPojo() {
=======
    public static void main(String[] args) {
>>>>>>> origin/main
        Student student = new Student();
        student.setStudent_id(1);
        student.setGrade(2);
        student.setId(202001);
        student.setSname("wzx");
        student.setSage(20);
        String s = JSON.toJSONString(student);
        System.out.println(s);
    }
}
