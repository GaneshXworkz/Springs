package com.xworkz.Maven.SpringsClass5.BeenClass.Producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {

	@Autowired
	private Location location;
	
	public Company() {
		System.out.println("Creating Company Constructor......");
	}
}
