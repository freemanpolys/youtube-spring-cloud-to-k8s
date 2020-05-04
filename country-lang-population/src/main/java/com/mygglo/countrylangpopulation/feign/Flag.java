package com.mygglo.countrylangpopulation.feign;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by James Kokou GAGLO on 30/04/2020.
 */
@Getter
@Setter
@ToString
public class Flag {
    private String id;
    private String country;
    private String flagBase64;
}
