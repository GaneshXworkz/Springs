package com.xworkz.Maven.SpringsClass5.BeenClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {

	@Autowired
	public Director director;

	public Movie() {
		System.out.println("Creating Movie Constrctor.........");
	}
	
	
	
}
