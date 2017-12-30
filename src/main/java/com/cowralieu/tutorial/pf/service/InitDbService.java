package com.cowralieu.tutorial.pf.service;

import com.cowralieu.tutorial.pf.entity.Check;
import com.cowralieu.tutorial.pf.repository.CheckRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class InitDbService {

    private static Logger log = LoggerFactory.getLogger(InitDbService.class);

    @Autowired
    private CheckRepository checkRepository;

    @PostConstruct
    public void init() {
        log.info("*** INIT DATABASE START ***");
        {
            Check check = new Check();
            check.setName("example");
            check.setUrl("http://www.example.com");
            checkRepository.save(check);
        }
        {
            Check check = new Check();
            check.setName("sitemonitoring");
            check.setUrl("http://sitemonitoring.sourceforge.net");
            checkRepository.save(check);
        }
        {
            Check check = new Check();
            check.setName("javavids");
            check.setUrl("http://www.javavids.com");
            checkRepository.save(check);
        }
        log.info("*** INIT DATABASE FINISH ***");
    }

}
