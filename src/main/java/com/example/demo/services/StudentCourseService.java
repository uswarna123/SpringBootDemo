package com.example.demo.services;

import com.example.demo.dao.StudentCourseDao;
import com.example.demo.model.Course;
import com.example.demo.model.Student;
import com.example.demo.model.StudentOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class StudentCourseService {

    @Autowired
    StudentCourseDao daoClass;


    public String displayStudentCourse(final int id) {
        List<Course> courseList = daoClass.setCourse();
        List<StudentOne> studentList = daoClass.setStudent();
        for (StudentOne students : studentList) {
            for (Course courses : courseList) {
                if (students.getStudentcourseid() == courses.getCourseID()
                        && courses.getCourseID() == id) {
                    //System.out.println("Student Details: " + students);
                    return "Student Details Found with this course id:" + id + ", " + students;
                }
            }

        }

        return "No Student Details Found with this Course id: " + id;


    }
}



