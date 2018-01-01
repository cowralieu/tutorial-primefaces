package com.cowralieu.tutorial.pf.controller;

import com.cowralieu.tutorial.pf.entity.Check;
import com.cowralieu.tutorial.pf.service.CheckService;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.List;

@ViewScoped
@ManagedBean
public class CheckListController implements Serializable {

    @ManagedProperty("#{checkService}")
    private CheckService checkService;

    private List<Check> checks;

    private Check check = new Check();

    @PostConstruct
    public void loadChecks() {
        checks = checkService.findAll();
    }

    public List<Check> getChecks() {
        return checks;
    }

    public void setCheckService(CheckService checkService) {
        this.checkService = checkService;
    }

    public Check getCheck() {
        return check;
    }

    public void setCheck(Check check) {
        this.check = check;
    }

    public void save() {
        checkService.save(check);
        check = new Check();
        checks = checkService.findAll();
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Check saved!", null));
    }

    public void remove(Check check) {
        checkService.remove(check);
        checks = checkService.findAll();
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Check removed!", null));
    }
}
