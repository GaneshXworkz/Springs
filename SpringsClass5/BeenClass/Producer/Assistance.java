package com.xworkz.Maven.SpringsClass5.BeenClass.Producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Assistance {

	@Autowired
	private Company company;
	
	public Assistance() {
		System.out.println("Creating Assistance Constructor......");
	}

}
