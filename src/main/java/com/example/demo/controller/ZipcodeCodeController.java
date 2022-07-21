package com.example.demo.controller;

import com.example.demo.services.ZipcodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZipcodeCodeController {

    @Autowired
    ZipcodeService zipcodeService;

    @GetMapping("/us/{zipcode}")
   final public String getCountry(@PathVariable int zipcode){
     String str=zipcodeService.getStateByZipcode(zipcode);
        return str;
    }

}
