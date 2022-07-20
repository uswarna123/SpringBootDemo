package com.example.demo.controller;

import com.example.demo.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BabyNameController {

@Autowired
HelloService helloService;

//Read value from properties
@Value("${babyWeight: baby weight not found}")
String babyWeight;

@GetMapping("/babyname/{name}")
public String babyName(@PathVariable String name)
{

    String babyName=helloService.babyName(name);
    return babyName+", weight is: "+babyWeight;
}
@GetMapping("/babyage/{age}")
public String babyAge(@PathVariable int age)
{
   String str=helloService.babyAge(age);
    return str;
}


}

