package com.mashitatechnologies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan()
public class MashitaTechnologiesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MashitaTechnologiesApiApplication.class, args);
	}
}
