package com.mygglo.countrylangpopulation.service;

import com.mygglo.countrylangpopulation.domain.Population;
import com.mygglo.countrylangpopulation.repository.PopulationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by James Kokou GAGLO on 03/05/2020.
 */
@Service
public class PopulationService {
    private final static Logger log = LoggerFactory.getLogger(PopulationService.class);
    private final PopulationRepository populationRepository;

    public PopulationService(PopulationRepository populationRepository) {
        this.populationRepository = populationRepository;
    }

    public Population getPopulationByCountry(String country) {
        log.info("== fetch country {} population ==",country);
        return this.populationRepository
                .findFirstByCountry(country)
                .orElse(new Population());
    }
}
