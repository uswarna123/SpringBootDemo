package com.example.demo.controller;

import com.example.demo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/student/{id}")
    public String displayStudent(@PathVariable int id)
    {
       // System.out.println("StudentController id "+id);
        String str=studentService.displayStudentDetails(id);
        return str;
    }

}
