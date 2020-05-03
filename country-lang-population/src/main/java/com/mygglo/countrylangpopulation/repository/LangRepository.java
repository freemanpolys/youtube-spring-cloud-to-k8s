package com.mygglo.countrylangpopulation.repository;

import com.mygglo.countrylangpopulation.domain.Lang;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by James Kokou GAGLO on 03/05/2020.
 */
@Repository
public interface LangRepository extends MongoRepository<Lang, String> {
    Optional<Lang> findFirstByCountry(String country);
}
