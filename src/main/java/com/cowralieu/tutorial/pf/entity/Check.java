package com.cowralieu.tutorial.pf.entity;

import org.hibernate.validator.constraints.URL;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Check {

    @Id
    @GeneratedValue
    private long id;

    @Size(min = 1, message = "Name cannot be empty")
    private String name;

    @Size(min = 1, message = "URL cannot be empty")
    @URL(message = "Invalid url!")
    private String url;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
