package com.mygglo.countrycontinentflag.controller;

import com.mygglo.countrycontinentflag.domain.ApiResponse;
import com.mygglo.countrycontinentflag.domain.Continent;
import com.mygglo.countrycontinentflag.domain.Flag;
import com.mygglo.countrycontinentflag.domain.dto.Country;
import com.mygglo.countrycontinentflag.service.CountryService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by James Kokou GAGLO on 30/04/2020.
 */
@RestController
@RequestMapping("/srvcfla")
@RefreshScope
public class CountryController {
    @Value("${country}")
    private String country;

    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/country")
    ResponseEntity<ApiResponse<Country>> getCountry() {
        ApiResponse<Country> response = new ApiResponse(this.countryService.findByCountryName(country));
        return ResponseEntity.ok(response);
    }

    @GetMapping("/flag")
    ResponseEntity<ApiResponse<Flag>> getFlag() {
        ApiResponse<Flag> response = new ApiResponse(this.countryService.getCountryFlag(country));
        return ResponseEntity.ok(response);
    }
}
