package com.cowralieu.tutorial.pf.controller;

import com.cowralieu.tutorial.pf.service.HelloSpringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

//@ManagedBean
@Scope("request")
@Component
public class HelloController {

//    @ManagedProperty("#{hss}")
    @Autowired
    @Qualifier("hss")
    private HelloSpringService helloSpringService;

    public String showHello() {
        return helloSpringService.sayHello();
    }

    /*
    public void setHelloSpringService(HelloSpringService helloSpringService) {
        this.helloSpringService = helloSpringService;
    }
    */
}
