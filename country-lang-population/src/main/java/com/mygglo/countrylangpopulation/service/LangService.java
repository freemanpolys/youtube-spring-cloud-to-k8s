package com.mygglo.countrylangpopulation.service;

import com.mygglo.countrylangpopulation.domain.dto.LanguageDTO;
import com.mygglo.countrylangpopulation.repository.LanguageRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    public List<LanguageDTO> getLangByCountry(String country) {
        log.info("== fetch country {} lang ==",country);
        return this.languageRepository
               .findAllByCountry(country)
                .stream()
                .map(language -> new LanguageDTO(language.getLanguage()))
                .collect(Collectors.toList());
    }

}
