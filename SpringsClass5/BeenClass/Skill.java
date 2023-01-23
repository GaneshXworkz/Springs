package com.xworkz.Maven.SpringsClass5.BeenClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Skill {
	
	@Autowired
	private CameraMan cameraman;

	public Skill() {
	System.out.println("Creating Skill Consrctor.....");
	}
	
	

}
