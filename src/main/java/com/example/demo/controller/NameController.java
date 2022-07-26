package com.example.demo.controller;

import com.example.demo.services.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    @Autowired
    NameService nameService;
    @GetMapping("/arrayInput/{input}")
    public String getColorName(@PathVariable String input)
    {
       String str=nameService.getColorName(input);

        return str;
    }

    @GetMapping("/print/{name}")
    public String print(@PathVariable String name)
    {
       String str=nameService.getName(name);
        return str;

    }
    @GetMapping("/?name={name}")
    public String displayPersonByName(@PathVariable String name){
       String str=nameService.getName(name);
        return str;
    }

}
