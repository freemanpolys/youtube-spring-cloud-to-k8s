package com.mygglo.countrylangpopulation.repository;

import com.mygglo.countrylangpopulation.domain.Population;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by James Kokou GAGLO on 03/05/2020.
 */
@Repository
public interface PopulationRepository  extends MongoRepository<Population, String> {
    Optional<Population> findFirstByCountry(String country);
}
