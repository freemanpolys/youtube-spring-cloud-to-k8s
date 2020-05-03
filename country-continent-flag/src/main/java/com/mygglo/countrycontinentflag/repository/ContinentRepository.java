package com.mygglo.countrycontinentflag.repository;

import com.mygglo.countrycontinentflag.domain.Continent;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by James Kokou GAGLO on 30/04/2020.
 */
@Repository
public interface ContinentRepository extends MongoRepository<Continent, String> {
    Optional<Continent> findFirstByCountry(String country);
}
