package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class HelloService  {

    public String displayName(String name)
    {
        return "Greeting from SpringBootDemo Application..."+name;
    }

    public String babyName(String babyName)
    {
        return "baby name is : "+babyName;
    }
    public String babyAge(int age)
    {
        return "baby age is: " +age;
    }
    public int addition(int a, int b)
    {
        int add=a+b;
        return add;
    }



}
