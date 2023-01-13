package com.xworkz.Maven.SpringsClass5.BeenClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Battery {

	@Autowired
	private Capacity capacity;
	
	public Battery() {
		System.out.println("Creating Battery using no-aug const....");
	}
	
	public void checkPropertyRef() {
		System.out.println(this.capacity.hashCode()+"-------hash Code Of Reffference------");
	}
	
	
}
