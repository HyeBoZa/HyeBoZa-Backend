package com.example.hyebozabackend.domain.benefit.present;

import com.example.hyebozabackend.domain.benefit.present.dto.BenefitListResponse;
import com.example.hyebozabackend.domain.benefit.present.dto.CreateBenefitRequest;
import com.example.hyebozabackend.domain.benefit.service.CreateBenefitService;
import com.example.hyebozabackend.domain.benefit.service.ReadAllBenefitService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/benefit")
public class BenefitController {

    private final CreateBenefitService createBenefitService;
    private final ReadAllBenefitService readAllBenefitService;

    @PostMapping
    public void save(@RequestBody CreateBenefitRequest request) {
        createBenefitService.execute(request);
    }

    @GetMapping
    public BenefitListResponse read() {
        return readAllBenefitService.execute();
    }

}
