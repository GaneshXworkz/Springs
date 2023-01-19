package com.xworkz.Maven.SpringsClass5.BeenClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Experience {
	
	@Autowired
	private Skill skill;

	public Experience() {
		System.out.println("Creating constrctor Exprience...");
	}

	
}
