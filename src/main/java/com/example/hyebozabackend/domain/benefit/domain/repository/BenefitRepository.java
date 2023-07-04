package com.example.hyebozabackend.domain.benefit.domain.repository;

import com.example.hyebozabackend.domain.benefit.domain.Benefit;
import com.example.hyebozabackend.domain.benefit.domain.type.BenefitCategory;
import com.example.hyebozabackend.domain.benefit.domain.type.UserCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BenefitRepository extends CrudRepository<Benefit, Long>, BenefitCustom {

    Optional<Benefit> findBenefitById(Long id);

    List<Benefit> findAllByTitleContains(String title);

    List<Benefit> findAllByUserCategoryAndBenefitCategoryAndTitleContains(UserCategory userCategory, BenefitCategory benefitCategory, String title);

    List<Benefit> findAllByUserCategoryAndTitleContains(UserCategory userCategory, String title);

    List<Benefit> findAllByBenefitCategoryAndTitleContains(BenefitCategory benefitCategory, String title);

}
