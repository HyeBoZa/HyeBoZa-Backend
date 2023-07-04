package com.example.hyebozabackend.domain.benefit.domain.repository;

import com.example.hyebozabackend.domain.benefit.domain.Benefit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BenefitRepository extends CrudRepository<Benefit, Long> {

    List<Benefit> findAll();

}
