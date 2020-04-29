package com.mygglo.countrycontinentflag;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CountryContinentFlagApplication {

	public static void main(String[] args) {
		SpringApplication.run(CountryContinentFlagApplication.class, args);
	}

}
