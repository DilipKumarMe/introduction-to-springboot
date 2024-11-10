package com.dilipcode.dilip.springbootIntro.introduction.to.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DbService {

    @Autowired
    private DB db;

    public String getData() {

        return db.getData();
    }
}
