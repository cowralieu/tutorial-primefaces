package com.cowralieu.tutorial.pf.service;

import org.springframework.stereotype.Service;

@Service("hss")
public class HelloSpringService {

    public String sayHello() {
        return "hello from spring service";
    }
}
