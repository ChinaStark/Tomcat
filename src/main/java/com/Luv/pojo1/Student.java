package com.Luv.pojo1;


public class Student {
    private  Integer    student_id ;
    private  String     sname;
    private  Integer    sage;
    private  Integer    grade;
    private  Integer    id  ;

    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", sname='" + sname + '\'' +
                ", sage=" + sage +
                ", grade=" + grade +
                ", id=" + id +
                '}';
    }
}
