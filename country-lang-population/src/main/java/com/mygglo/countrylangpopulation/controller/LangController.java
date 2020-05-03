package com.mygglo.countrylangpopulation.controller;

import com.mygglo.countrylangpopulation.domain.ApiResponse;
import com.mygglo.countrylangpopulation.domain.Lang;
import com.mygglo.countrylangpopulation.service.LangService;
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
public class LangController {
    @Value("${country}")
    private String country;
    private final LangService langService;

    public LangController(LangService langService) {
        this.langService = langService;
    }

    @GetMapping("/lang")
    public ResponseEntity<ApiResponse<Lang>> getLang() {
        ApiResponse<Lang> response = new ApiResponse<>(this.langService.getLangByCountry(country));
        return ResponseEntity.ok().body(response);
    }
}
