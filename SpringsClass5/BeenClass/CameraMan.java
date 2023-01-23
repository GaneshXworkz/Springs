package com.xworkz.Maven.SpringsClass5.BeenClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CameraMan {
	
	@Autowired
	private Camera camera;

	
	public CameraMan() {
		System.out.println("Creating CameraMen Lens.....");
		}

}
