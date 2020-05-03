package com.mygglo.countrylangpopulation.service;

import com.mygglo.countrylangpopulation.domain.Language;
import com.mygglo.countrylangpopulation.repository.LanguageRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by James Kokou GAGLO on 03/05/2020.
 */
@Service
public class LangService {
    private final static Logger log = LoggerFactory.getLogger(LangService.class);
    private final LanguageRepository languageRepository;

    public LangService(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    public List<Language> getLangByCountry(String country) {
        log.info("== fetch country {} lang ==",country);
        return this.languageRepository
               .findAllByCountry(country);
        //return this.langRepository.findAll();
    }

}
