package com.example.demo.controller;

import com.example.demo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController
 {
     @Autowired
     EmployeeService employeeService;

     @GetMapping("/Employee/{EmpId}")
     public String displayEmp(@PathVariable int EmpId)
     {
      String str=employeeService.displayEmployee(EmpId);
         return str;
     }


}
