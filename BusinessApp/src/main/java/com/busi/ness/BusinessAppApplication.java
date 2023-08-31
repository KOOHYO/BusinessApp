package com.busi.ness;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class BusinessAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusinessAppApplication.class, args);
	}

}
