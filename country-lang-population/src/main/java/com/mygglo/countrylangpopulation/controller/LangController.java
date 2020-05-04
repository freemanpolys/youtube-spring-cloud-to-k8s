package com.mygglo.countrylangpopulation.controller;

import com.mygglo.countrylangpopulation.domain.ApiResponse;
import com.mygglo.countrylangpopulation.domain.Language;
import com.mygglo.countrylangpopulation.domain.dto.LanguageDTO;
import com.mygglo.countrylangpopulation.feign.Flag;
import com.mygglo.countrylangpopulation.service.CountryFlagService;
import com.mygglo.countrylangpopulation.service.LangService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by James Kokou GAGLO on 03/05/2020.
 */
@RestController
@RequestMapping("/srvlapo")
@RefreshScope
public class LangController {
    @Value("${country}")
    private String country;
    private final LangService langService;
    private final CountryFlagService countryFlagService;

    public LangController(LangService langService, CountryFlagService countryFlagService) {
        this.langService = langService;
        this.countryFlagService = countryFlagService;
    }

    @GetMapping("/lang")
    public ResponseEntity<ApiResponse<List<LanguageDTO>>> getLang() {
        Flag flag = this.countryFlagService.fetchFlag(country);
        ApiResponse<List<LanguageDTO>> response = new ApiResponse<>(this.langService.getLangByCountry(country),flag.getFlagBase64());
        return ResponseEntity.ok().body(response);
    }
}
