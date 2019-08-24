package com.cts.springhibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@ComponentScan("com.cts.springhibernate")
@EnableJpaRepositories("com.cts.springhibernate.employees")
@SpringBootApplication
public class SpringhibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringhibernateApplication.class, args);
	}

}
