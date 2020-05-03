package com.mygglo.countrycontinentflag.repository;

import com.mygglo.countrycontinentflag.domain.Flag;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by James Kokou GAGLO on 30/04/2020.
 */
@Repository
public interface FlagRepository extends MongoRepository<Flag, String> {
    Optional<Flag> findFirstByCountry(String country);
}
