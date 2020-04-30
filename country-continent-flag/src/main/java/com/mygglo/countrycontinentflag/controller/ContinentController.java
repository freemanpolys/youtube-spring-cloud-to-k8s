package com.mygglo.countrycontinentflag.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by James Kokou GAGLO on 30/04/2020.
 */
@RestController
@RequestMapping("/conflag")
@RefreshScope
public class ContinentController {
    @Value("${country}")
    private String country;

    @GetMapping("/continent")
    ResponseEntity<String> getContinent() {
        return ResponseEntity.ok(this.country);
    }
}
