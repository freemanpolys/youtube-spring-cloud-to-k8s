package com.mygglo.countrylangpopulation.controller;

import com.mygglo.countrylangpopulation.domain.ApiResponse;
import com.mygglo.countrylangpopulation.domain.dto.PopulationDTO;
import com.mygglo.countrylangpopulation.feign.Flag;
import com.mygglo.countrylangpopulation.service.CountryFlagService;
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
    private final CountryFlagService countryFlagService;

    public PopulationController(PopulationService populationService, CountryFlagService countryFlagService) {
        this.populationService = populationService;
        this.countryFlagService = countryFlagService;
    }

    @GetMapping("/population")
    public ResponseEntity<ApiResponse<PopulationDTO>> getPopulation() {
        Flag flag = this.countryFlagService.fetchFlag(country);
        ApiResponse<PopulationDTO> response = new ApiResponse<>(this.populationService.getPopulationByCountry(country),flag.getFlagBase64());
        return ResponseEntity.ok().body(response);
    }
}
