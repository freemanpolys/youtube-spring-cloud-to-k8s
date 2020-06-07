package com.mygglo.countrycontinentflag.controller;

import com.mygglo.countrycontinentflag.domain.ApiResponse;
import com.mygglo.countrycontinentflag.domain.Flag;
import com.mygglo.countrycontinentflag.domain.dto.CountryDTO;
import com.mygglo.countrycontinentflag.service.CountryService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by James Kokou GAGLO on 30/04/2020.
 */
@RestController
@RequestMapping("/srvcfla")
public class CountryController {
    @Value("${country}")
    private String country;

    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/country")
    ResponseEntity<ApiResponse<CountryDTO>> getCountry() {
        ApiResponse<CountryDTO> response = new ApiResponse(this.countryService.findByCountryName(country));
        return ResponseEntity.ok(response);
    }

    @GetMapping("/flag/{country}")
    ResponseEntity<ApiResponse<Flag>> getFlag(@PathVariable  String country) {
        ApiResponse<Flag> response = new ApiResponse(this.countryService.getCountryFlag(country));
        return ResponseEntity.ok(response);
    }
}
