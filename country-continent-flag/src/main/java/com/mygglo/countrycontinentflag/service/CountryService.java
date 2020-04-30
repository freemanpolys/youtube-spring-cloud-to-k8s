package com.mygglo.countrycontinentflag.service;

import com.mygglo.countrycontinentflag.domain.Continent;
import com.mygglo.countrycontinentflag.domain.Flag;
import com.mygglo.countrycontinentflag.domain.dto.Country;
import com.mygglo.countrycontinentflag.domain.mapper.ContinentFlagToCountry;
import com.mygglo.countrycontinentflag.repository.ContinentRepository;
import com.mygglo.countrycontinentflag.repository.FlagRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by James Kokou GAGLO on 30/04/2020.
 */
@Service
public class CountryService {

    private final static Logger log = LoggerFactory.getLogger(CountryService.class);
    private final ContinentRepository continentRepository;
    private final FlagRepository flagRepository;
    private final ContinentFlagToCountry continentFlagToCountry;

    public CountryService(ContinentRepository continentRepository, FlagRepository flagRepository, ContinentFlagToCountry continentFlagToCountry) {
        this.continentRepository = continentRepository;
        this.flagRepository = flagRepository;
        this.continentFlagToCountry = continentFlagToCountry;
    }

    public Country findByCountryName(String country) {
        log.info("== fetch country {} ==",country);
        Continent continent = continentRepository.findFirstByCountry(country).orElse(new Continent());
        log.info("== fetch continent {} ==",continent);

        Flag flag = flagRepository.findFirstByCountry(country).orElse( new Flag());
        log.info("== fetch flag {} ==",flag);

        return continentFlagToCountry.apply(continent,flag);
    }
}
