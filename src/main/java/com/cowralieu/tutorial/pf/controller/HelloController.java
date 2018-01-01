package com.cowralieu.tutorial.pf.controller;

import com.cowralieu.tutorial.pf.service.HelloSpringService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import java.io.Serializable;

@ManagedBean
public class HelloController implements Serializable {

    @ManagedProperty("#{hss}")
    private HelloSpringService helloSpringService;

    public String showHello() {
        return helloSpringService.sayHello();
    }

    public void setHelloSpringService(HelloSpringService helloSpringService) {
        this.helloSpringService = helloSpringService;
    }
}
