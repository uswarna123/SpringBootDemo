package com.example.demo.dao;

import com.example.demo.model.Course;
import com.example.demo.model.StudentOne;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentCourseDao implements StudentCourseDaoInterface {

    StudentOne studentOne;
    Course course;


    public List<StudentOne> setStudent() {
       final  List<StudentOne> studentList = new ArrayList<>();
        for (int student = 1; student < 4; student++) {
            studentOne = new StudentOne();
            studentOne.setStudentid(student);
            studentOne.setStudentname("Rose" + student);
            studentOne.setStudentcourseid(student);
            studentList.add(studentOne);

            //System.out.println("Student List"+studentList);

        }
        return studentList;
    }

    public List<Course> setCourse() {

        final List<Course> courseList = new ArrayList<>();
        for (int j = 1; j < 4; j++) {
            course = new Course();
            course.setCourseID(j);
            course.setCourseName("MS" + j);
            course.setDuration(j + "month(s)");
            courseList.add(course);
            // System.out.println("Student List"+courseList);

        }

        return courseList;

    }
}