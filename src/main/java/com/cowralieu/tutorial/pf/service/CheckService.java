package com.cowralieu.tutorial.pf.service;

import com.cowralieu.tutorial.pf.entity.Check;
import com.cowralieu.tutorial.pf.repository.CheckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckService {

    @Autowired
    private CheckRepository checkRepository;

    public List<Check> findAll() {
        return checkRepository.findAll();
    }

    public void save(Check check) {
        checkRepository.save(check);
    }

    public void remove(Check check) {
        checkRepository.delete(check);
    }
}
