package com.mygglo.countrylangpopulation.controller;

import com.mygglo.countrylangpopulation.domain.ApiResponse;
import com.mygglo.countrylangpopulation.domain.Population;
import com.mygglo.countrylangpopulation.service.PopulationService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by James Kokou GAGLO on 03/05/2020.
 */
@RestController
@RequestMapping("/srvlapo")
@RefreshScope
public class PopulationController {
    @Value("${country}")
    private String country;
    private final PopulationService populationService;


    public PopulationController(PopulationService populationService) {
        this.populationService = populationService;
    }

    @GetMapping("/population")
    public ResponseEntity<ApiResponse<Population>> getPopulation() {
        ApiResponse<Population> response = new ApiResponse<>(this.populationService.getPopulationByCountry(country));
        return ResponseEntity.ok().body(response);
    }
}
