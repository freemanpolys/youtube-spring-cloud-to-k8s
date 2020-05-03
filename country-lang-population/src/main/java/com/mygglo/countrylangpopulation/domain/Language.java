package com.mygglo.countrylangpopulation.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

/**
 * Created by James Kokou GAGLO on 03/05/2020.
 */
@Getter
@Setter
@ToString
public class Language {
    @Id
    private String id;
    private String country;
    private String language;
}
