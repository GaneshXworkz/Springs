package com.xworkz.Maven.SpringsClass5.BeenClass.Producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Producer {

	@Autowired
	private Assistance assistant;
	
	public Producer() {
		System.out.println("Creating Producer Constructor......");
	}
	
	

}
