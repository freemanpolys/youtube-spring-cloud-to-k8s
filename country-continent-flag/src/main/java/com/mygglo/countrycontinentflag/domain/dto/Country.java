package com.mygglo.countrycontinentflag.domain.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by James Kokou GAGLO on 30/04/2020.
 */
@Getter
@Setter
@ToString
@Builder
public class Country {
    private String country;
    private String continent;
    private String flag;
}
