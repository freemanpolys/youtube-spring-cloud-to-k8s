package com.mygglo.countrylangpopulation.service;

import com.mygglo.countrylangpopulation.domain.dto.PopulationDTO;
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

    public PopulationDTO getPopulationByCountry(String country) {
        log.info("== fetch country {} population ==",country);
        PopulationDTO populationDTO = new PopulationDTO("");
        this.populationRepository
                .findFirstByCountry(country)
                .ifPresent(population -> populationDTO.setPopulation(population.getPopulation()));
        return populationDTO;
    }
}
