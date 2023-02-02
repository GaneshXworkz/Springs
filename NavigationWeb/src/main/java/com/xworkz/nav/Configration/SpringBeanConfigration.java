package com.xworkz.nav.Configration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.nav")
public class SpringBeanConfigration {
	
	public SpringBeanConfigration() {
		System.out.println("Crating :"+this.getClass().getSimpleName());
	}

}
