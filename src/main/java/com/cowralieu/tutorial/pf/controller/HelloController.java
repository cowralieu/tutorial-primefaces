package com.cowralieu.tutorial.pf.controller;

import com.cowralieu.tutorial.pf.service.HelloSpringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("request")
@Component
public class HelloController {

    @Autowired
    @Qualifier("hss")
    private HelloSpringService helloSpringService;

    public String showHello() {
        return helloSpringService.sayHello();
    }

}
