package com.example.demo.services;

import com.example.demo.dao.ZipcodeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ZipcodeService {

    @Autowired
    ZipcodeDao zipcodeDao;
    final public String getStateByZipcode(int zipcode){

        String list = zipcodeDao.getCountry();

        return "zipcode  "+list;
    }
}

