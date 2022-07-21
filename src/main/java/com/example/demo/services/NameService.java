package com.example.demo.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
//@Component
public class NameService {


    RestTemplate restTemplate=new RestTemplate();

    public String getColorName(String input) {
        String[] colors = {"pink", "yellow", "red"};
        for (int i = 0; i < colors.length; i++)
        {
            if(colors[i].equals(input))
            {
                return "match found color is: "+input;
            }
        }
        return "match not found color is: "+input;
    }
    public String getName(String name)
    {
        final String uri = "https://api.agify.io/?name=meelad";
        String result = restTemplate.getForObject(uri, String.class);
        System.out.println(result);

        return "state is " + result;
    }

}
