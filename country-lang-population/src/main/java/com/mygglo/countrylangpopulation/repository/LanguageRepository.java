package com.mygglo.countrylangpopulation.repository;

import com.mygglo.countrylangpopulation.domain.Language;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by James Kokou GAGLO on 03/05/2020.
 */
@Repository
public interface LanguageRepository extends MongoRepository<Language, String> {
    List<Language> findAllByCountry(String country);
}
