package com.chant.dechanter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = { "com.chant.dechanter.entity" })
@EnableJpaRepositories(basePackages = { "com.chant.dechanter.repo"})
public class DechanterApplication {

	public static void main(String[] args) {
		SpringApplication.run(DechanterApplication.class, args);
	}
}
