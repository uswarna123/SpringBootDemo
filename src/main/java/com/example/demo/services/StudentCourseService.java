package com.example.demo.services;

import com.example.demo.Model.Course;
import com.example.demo.Model.StudentOne;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentCourseService {

    StudentOne studentOne;
    Course course;
    List<StudentOne> studentList;
    List<Course> courseList;

    public String displayStudentCourse(int id) {
        setCourse();
        setStudent();
        for (StudentOne students : studentList) {
            for (Course courses : courseList) {
                if (students.getStudentcourseid() == id && courses.getCourseID() == id) {
                    //System.out.println("Student Details: " + students);
                    return "Student Details Found with this course id:" + id + ", " + students;
                }
            }

        }
        return "No Student Details Found with this Course id: " + id;
    }

    public List<StudentOne> setStudent() {
        studentList = new ArrayList<>();
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
        courseList = new ArrayList<>();
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
