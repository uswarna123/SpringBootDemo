package com.example.demo.dao;


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ZipcodeDao {

    static RestTemplate restTemplate = new RestTemplate();
    public String getCountry() {

        final String uri = "https://api.zippopotam.us/us/90210";

        String result = restTemplate.getForObject(uri, String.class);

        System.out.println(result);


        return "state is " + result;
    }


}


