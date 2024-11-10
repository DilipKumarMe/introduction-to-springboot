package com.dilipcode.dilip.springbootIntro.introduction.to.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    Apple appleBean(){
        return new Apple();
    }
}
