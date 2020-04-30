package com.mygglo.countrycontinentflag.domain.mapper;

import com.mygglo.countrycontinentflag.domain.Continent;
import com.mygglo.countrycontinentflag.domain.Flag;
import com.mygglo.countrycontinentflag.domain.dto.Country;
import org.springframework.stereotype.Component;

import java.util.function.BiFunction;

/**
 * Created by James Kokou GAGLO on 30/04/2020.
 */
@Component
public class ContinentFlagToCountry implements BiFunction<Continent, Flag, Country> {
    @Override
    public Country apply(Continent continent, Flag flag) {
        Country country = Country.builder()
                .country(continent.getCountry())
                .continent(continent.getContinent())
                .flag(flag.getFlagBase64())
                .build();
        return country;
    }
}
