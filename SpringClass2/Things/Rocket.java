package com.xworkz.Maven.SpringClass2.Things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Rocket {

	private String country;
	private String name;	
	private double budget;
	

	public Rocket( @Value("NASA")String country, @Value("VSLV")String name,@Value("200") double budget)
	{
		super();
		this.country = country;
		this.name = name;
		this.budget = budget;
	}

	public Rocket() {
		System.out.println("Creating Rocket by spring");
	}

	public String getCountry() {
		return country;
	}

	public String getName() {
		return name;
	}

	public double getBudget() {
		return budget;
	}

	public void setCountry(String country) {
		this.country= country;
	}

	public void setName(String name) {
		this.name= name;
	}

	public void sevoidtBudget(double budget) {
		this.budget= budget;
	}

}
