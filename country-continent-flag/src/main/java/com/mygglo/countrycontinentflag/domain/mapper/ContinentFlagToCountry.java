package com.mygglo.countrycontinentflag.domain.mapper;

import com.mygglo.countrycontinentflag.domain.Continent;
import com.mygglo.countrycontinentflag.domain.Flag;
import com.mygglo.countrycontinentflag.domain.dto.CountryDTO;
import org.springframework.stereotype.Component;

import java.util.function.BiFunction;

/**
 * Created by James Kokou GAGLO on 30/04/2020.
 */
@Component
public class ContinentFlagToCountry implements BiFunction<Continent, Flag, CountryDTO> {
    @Override
    public CountryDTO apply(Continent continent, Flag flag) {
        CountryDTO countryDTO = CountryDTO.builder()
                .country(continent.getCountry())
                .continent(continent.getContinent())
                .flagBase64(flag.getFlagBase64())
                .build();
        return countryDTO;
    }
}
