package com.cowralieu.tutorial.pf.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class HelloController {

    public String showHello() {
        return "Hello from managed bean";
    }

}
