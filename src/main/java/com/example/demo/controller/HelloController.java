package com.example.demo.controller;

import com.example.demo.services.ArrayInput;
import com.example.demo.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
   HelloService helloService;
    @Autowired
    ArrayInput arrayInput;

    @GetMapping("/arrayInput/{input}")
    public String getArrayInput(@PathVariable String input)
    {
        String str=arrayInput.arrayInput(input);

        return str;
    }

    @GetMapping("/print/{name}")
    public String print(@PathVariable String name)
    {
        String str=helloService.displayName(name);
        return str;

    }

}
