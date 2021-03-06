package com.mygglo.countrycontinentflag.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

/**
 * Created by James Kokou GAGLO on 30/04/2020.
 */
@Getter
@Setter
@ToString
public class Continent {
    @Id
    private String id;
    private String country;
    private String continent;

}
