package com.example.myproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class Application {

/*	@Bean
	public WebSecurityConfigurerAdapter webSecurityConfigurerAdapter() {
		return new ApplicationSecurity();
	}*/
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

