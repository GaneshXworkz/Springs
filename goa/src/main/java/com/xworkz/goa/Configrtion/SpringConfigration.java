package com.xworkz.goa.Configrtion;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfigration {
	
	public SpringConfigration() {
	System.out.println("Creating :"+this.getClass().getSimpleName());
	}

}
