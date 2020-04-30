package com.mygglo.countrycontinentflag.domain;

import org.springframework.data.annotation.Id;

/**
 * Created by James Kokou GAGLO on 30/04/2020.
 */
public class Continent {
    @Id
    private String id;
    private String country;
    private String continent;

}
