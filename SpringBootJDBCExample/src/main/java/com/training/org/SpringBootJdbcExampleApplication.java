package com.training.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class SpringBootJdbcExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcExampleApplication.class, args);
	}

}
