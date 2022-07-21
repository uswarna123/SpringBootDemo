package com.example.demo.controller;

import com.example.demo.services.StudentCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentCourseController {

    @Autowired
    StudentCourseService studentCourseService;

    @GetMapping("/courseID/{id}")
    public String displayStudent(@PathVariable int id){
       String str=studentCourseService.displayStudentCourse(id);
        return str;
    }
}
