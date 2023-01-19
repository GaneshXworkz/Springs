package com.Xworkz.configration;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.Xworkz")
public class SoldierConfigration {

	public SoldierConfigration() {
		System.out.println("creating SpringsConfgration...");
	}
	
	@Bean
	public Validator vali() {
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		
		Validator valid=factory.getValidator();
		
		return valid;
		
	}
	
	
}
