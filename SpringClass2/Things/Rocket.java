package com.xworkz.Maven.SpringClass2.Things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Rocket {

	@Value("India")
	private String country;
	@Value("pslv")
	private String name;
	@Value("130")
	private double budget;

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
