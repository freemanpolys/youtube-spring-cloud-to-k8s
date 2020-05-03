package com.mygglo.countrylangpopulation.service;

import com.mygglo.countrylangpopulation.feign.ContinentFlagClient;
import com.mygglo.countrylangpopulation.feign.Flag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by James Kokou GAGLO on 03/05/2020.
 */
@Service
public class CountryFlagService {
    private final static Logger log = LoggerFactory.getLogger(CountryFlagService.class);
    private final ContinentFlagClient continentFlagClient;

    public CountryFlagService(ContinentFlagClient continentFlagClient) {
        this.continentFlagClient = continentFlagClient;
    }

    public Flag fetchFlag(String country) {
        log.info("=== fetch flag for {} ==",country);
        Flag flag = this.continentFlagClient.getFlag(country)
                .getBody()
                .getResult();
        log.info("==flag found {}", flag);
        return flag;
    }
}
