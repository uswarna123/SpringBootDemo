package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private int studentId;
    private String studentName;
    private int studentAge;
    private String studentCourse;

    public Student() {
    }

    public Student(int studentId, String studentName, int studentAge, String studentCourse) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentCourse = studentCourse;
    }

    public  int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(String studentCourse) {
        this.studentCourse = studentCourse;
    }

    @Override
    public String toString() {
        return "StudentDetails{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAge=" + studentAge +
                ", studentCourse='" + studentCourse + '\'' +
                '}';
    }
}
