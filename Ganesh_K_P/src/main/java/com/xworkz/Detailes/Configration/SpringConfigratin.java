package com.xworkz.Detailes.Configration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.Detailes")
public class SpringConfigratin {

	public SpringConfigratin() {
		System.out.println("created :"+this.getClass().getSimpleName());
	}
}
