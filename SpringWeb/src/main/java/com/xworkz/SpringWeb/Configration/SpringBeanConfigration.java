package com.xworkz.SpringWeb.Configration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.SpringWeb")
public class SpringBeanConfigration {

	public SpringBeanConfigration() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
}
