package com.aspiresys.bankingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class BankingApplication  extends WebMvcConfigurerAdapter{

	public static void main(String[] args) {
		SpringApplication.run(BankingApplication.class, args);		
	}
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedMethods("GET", "HEAD", "POST", "DELETE", "OPTIONS", "PUT");
	}

}
