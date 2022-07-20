package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
//@Component
public class GetColorNameService {

    public String getColorName(String input) {
        String[] colors = {"pink", "yellow", "red"};
        for (int i = 0; i < colors.length; i++)
        {
            //System.out.println("Colors: " + colors[i]);
            if(colors[i].equals(input))
            {
                return "match found color is: "+input;
            }
        }
        return "match not found color is: "+input;
    }
}