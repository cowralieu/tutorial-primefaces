package com.cowralieu.tutorial.pf.controller;

import com.cowralieu.tutorial.pf.service.HelloSpringService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean
public class HelloController {

    @ManagedProperty("#{hss}")
    private HelloSpringService helloSpringService;

    public String showHello() {
        return helloSpringService.sayHello();
    }

    public void setHelloSpringService(HelloSpringService helloSpringService) {
        this.helloSpringService = helloSpringService;
    }
}
