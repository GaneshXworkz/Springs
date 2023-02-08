package com.xworkz.hotel.Configration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.hotel")
public class SpringConfgration {

	public SpringConfgration() {
		System.out.println("Created :"+this.getClass().getSimpleName());
	}
	
}
