package com.mygglo.countrylangpopulation.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by James Kokou GAGLO on 03/05/2020.
 */
@FeignClient(url="http://continent-flag-service:8082",name = "continent-flag")
public interface ContinentFlagClient {
    @GetMapping("/srvcfla/flag/{country}")
    ResponseEntity<ContinetFlagApiResponse<Flag>> getFlag(@PathVariable String country);
}
