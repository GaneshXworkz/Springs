package com.xworkz.Maven.SpringClass2.Configration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.Maven.SpringClass2.Things.Actor;
import com.xworkz.Maven.SpringClass2.Things.Rocket;

@Configuration
@ComponentScan("com.xworkz.Maven.SpringClass2")
public class Configration {

	

		public Configration() {
			System.out.println("Created TConfiguration by spring");
		}

		@Bean
		public Rocket jetRocket() {
			System.out.println("Creating jet rocket by bean");
			Rocket rock = new Rocket();
			return rock;
		}
	    @Bean
		public Actor Puneet() {
			System.out.println("Creating puneet by bean");
			Actor act=new Actor("Shivanna","Kannada",60);
			return act;
			
		}

	    
}
