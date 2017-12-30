package com.cowralieu.tutorial.pf.repository;

import com.cowralieu.tutorial.pf.entity.Check;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckRepository extends JpaRepository<Check, Long> {
}
