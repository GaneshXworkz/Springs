package com.xworkz.Maven.SpringsClass5.BeenClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.Maven.SpringsClass5.BeenClass.Producer.Producer;

@Component
public class Director {

	@Autowired
	private Experience experience;
	
	@Autowired
	private Producer producer;

	public Director() {
		System.out.println("Creating Constructor Director.........");
	}
	
	
	
}
