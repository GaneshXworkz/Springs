package com.xworkz.Maven.SpringClass2.Things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Season {
	
	private String name;
	private int duration;
	private String startingMonth;
	
	
	
	public Season(@Value("Summer")String name, @Value("4")int duration, @Value("April")String startingMonth) {
		super();
		this.name = name;
		this.duration = duration;
		this.startingMonth = startingMonth;
	}
	public Season() {
		System.out.println("Creating Season by spring");
	}
	public String getName() {
		return name;
	}

	public int getDuration() {
		return duration;
	}

	public String getStartingMonth() {
		return startingMonth;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public void setStartingMonth(String startingMonth) {
		this.startingMonth = startingMonth;
	}

	
}
