package com.example.demo.services;

import com.example.demo.Model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {


    public String displayStudentDetails(int sid)
    {
        //System.out.println("StudentService studentId "+studentId);
        List<Student> list=new ArrayList<>();
        Student std1=new Student();
        std1.setStudentId(1);
        std1.setStudentName("Tom");
        std1.setStudentAge(25);
        std1.setStudentCourse("Masters");

        Student std2=new Student();
        std2.setStudentId(2);
        std2.setStudentName("Jon");
        std2.setStudentAge(15);
        std2.setStudentCourse("Bachelors");

        Student std3=new Student();
        std3.setStudentId(3);
        std3.setStudentName("Depp");
        std3.setStudentAge(26);
        std3.setStudentCourse("MBA");

        list.add(std1);
        list.add(std2);
        list.add(std3);
        
        System.out.println("STUDENT OBJECT: "+list);


        for (Student student:list) {

            System.out.println("for each loop: " +student);
            if (student.getStudentId() == sid){
                return "FOUND"+ sid + "STUDENT Object "+student;
            }
        }

        return "STUDENT ID "+sid +" NOT FOUND";
    }
}
