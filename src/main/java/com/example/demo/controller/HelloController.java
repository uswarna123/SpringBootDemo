package com.example.demo.controller;

import com.example.demo.services.HelloInterface;
import com.example.demo.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
   HelloService helloService;


    @GetMapping("/print/{name}")
    public String print(@PathVariable String name){
        String str=helloService.displayName(name);
        return str;

    }

}
