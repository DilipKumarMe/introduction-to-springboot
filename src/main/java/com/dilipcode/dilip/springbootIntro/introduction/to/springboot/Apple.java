package com.dilipcode.dilip.springbootIntro.introduction.to.springboot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Apple {

    public void eatApple(){
        System.out.println("let's eat apple");


    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("it will run before destroying the beans, usually udes for clean up");
    }

    @PostConstruct
    public void PostDestroy(){
        System.out.println("it will run once bean is created");
    }
}
