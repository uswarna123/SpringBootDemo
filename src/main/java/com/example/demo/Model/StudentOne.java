package com.example.demo.Model;

public class StudentOne {

    private int studentid;
    private String studentname;
    private int studentcourseid;

    public StudentOne() {
    }

    @Override
    public String toString() {
        return "StudentOne{" +
                "studentid=" + studentid +
                ", studentname='" + studentname + '\'' +
                ", studentcourseid=" + studentcourseid +
                '}';
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public int getStudentcourseid() {
        return studentcourseid;
    }

    public void setStudentcourseid(int studentcourseid) {
        this.studentcourseid = studentcourseid;
    }
}
