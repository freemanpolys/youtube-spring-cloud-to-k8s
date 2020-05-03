package com.mygglo.countrylangpopulation.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by James Kokou GAGLO on 30/04/2020.
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
public class ApiResponse<T> {
    private T result;
}
