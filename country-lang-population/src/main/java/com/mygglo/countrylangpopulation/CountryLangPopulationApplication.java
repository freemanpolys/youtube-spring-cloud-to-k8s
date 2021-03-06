package com.mygglo.countrylangpopulation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CountryLangPopulationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CountryLangPopulationApplication.class, args);
	}

}
