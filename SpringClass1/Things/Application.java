package com.xworkz.Maven.SpringClass1.Things;

import org.springframework.stereotype.Component;

@Component

public class Application {
	
	public Application() {
		System.out.println("Creating application by spring");
	}

	@Override
	public String toString() {
		return "Application [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	

}
