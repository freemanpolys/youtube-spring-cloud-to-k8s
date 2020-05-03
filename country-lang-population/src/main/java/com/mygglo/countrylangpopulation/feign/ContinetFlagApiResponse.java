package com.mygglo.countrylangpopulation.feign;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by James Kokou GAGLO on 03/05/2020.
 */
@Getter
@Setter
@ToString
public class ContinetFlagApiResponse<T> {
    private T result;
}
