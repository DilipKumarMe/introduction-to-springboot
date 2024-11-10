package com.dilipcode.dilip.springbootIntro.introduction.to.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroductionToSpringbootApplication implements CommandLineRunner {

    @Autowired
    Apple apple1;

    @Autowired
    Apple apple2;

	@Autowired
	DbService dbService;


    public static void main(String[] args) {
        SpringApplication.run(IntroductionToSpringbootApplication.class, args);

    }


    @Override
    public void run(String... args) throws Exception {
        apple1.eatApple();
        // object will be singleton so hascode will be same until bean scope is defualt that is singleton ,
        //  if we make it prototype it will create different objects
        apple1.hashCode();
        apple2.hashCode();
		System.out.println(dbService.getData());
    }
}

