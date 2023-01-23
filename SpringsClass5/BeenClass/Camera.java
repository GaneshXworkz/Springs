package com.xworkz.Maven.SpringsClass5.BeenClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Camera {

	@Autowired
	private Battery battery;
	
	@Autowired
	private Lens lens;

	public Camera() {
		System.out.println("Creating Cemara Consructor.........");
	}
	
	
	
	
}
