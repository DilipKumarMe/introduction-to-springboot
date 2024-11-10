package com.dilipcode.dilip.springbootIntro.introduction.to.springboot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name ="deploy.env" ,havingValue="prod")
public class ProdDb  implements DB {

    public String getData() {
        return "getting ProdData";
    }
}
