package com.example.demo.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
//@Component
public class ArrayInput {

    public String arrayInput(String input) {
        String[] colors = {"pink", "yellow", "red"};
        for (int i = 0; i < colors.length; i++)
        {
            System.out.println("Colors: " + colors[i]);
            if(colors[i].equals(input))
            {
                System.out.println("Matching color found " + colors[i]);
                return "color is: "+input;
            }


        }
        return "color is: "+input;
    }
}