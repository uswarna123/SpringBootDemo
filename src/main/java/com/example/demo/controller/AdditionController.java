package com.example.demo.controller;

import com.example.demo.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdditionController {

  @Autowired
  HelloService helloService;

    @GetMapping("/addition/{a}/{b}")
    public String displayAddition(@PathVariable int a, @PathVariable int b) {
        int val =helloService.addition(a,b);
            return "Addition of "+a+" and "+b+" is = "+val;
    }


}



