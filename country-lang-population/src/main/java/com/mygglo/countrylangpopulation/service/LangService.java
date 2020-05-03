package com.mygglo.countrylangpopulation.service;

import com.mygglo.countrylangpopulation.domain.Lang;
import com.mygglo.countrylangpopulation.repository.LangRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by James Kokou GAGLO on 03/05/2020.
 */
@Service
public class LangService {
    private final static Logger log = LoggerFactory.getLogger(LangService.class);
    private final LangRepository langRepository;

    public LangService(LangRepository langRepository) {
        this.langRepository = langRepository;
    }

    public Lang getLangByCountry(String country) {
        return this.langRepository
                .findFirstByCountry(country)
                .orElse(new Lang());
    }

}
