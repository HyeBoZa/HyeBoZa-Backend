package com.example.hyebozabackend.domain.benefit.domain;

import com.example.hyebozabackend.domain.benefit.domain.type.BenefitCategory;
import com.example.hyebozabackend.domain.benefit.domain.type.UserCategory;
import lombok.*;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
@Builder
@Table(name = "tbl_benefit")
public class Benefit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "VARCHAR(50)")
    private String title;

    @Column(columnDefinition = "VARCHAR(200)")
    private String content;

    @Column(columnDefinition = "VARCHAR(200)")
    private String control;

    @Column
    @Enumerated(EnumType.STRING)
    private UserCategory userCategory;

    @Column
    @Enumerated(EnumType.STRING)
    private BenefitCategory benefitCategory;

}
