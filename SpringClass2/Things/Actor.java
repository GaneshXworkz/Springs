package com.xworkz.Maven.SpringClass2.Things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor {

	private String name;
	private String language;
	private int age;

	public Actor() {
		super();
	}
	
	public Actor(@Value("Sudeep") String name, @Value("Kannada") String language, @Value("49") int age) {
		super();
		this.name = name;
		this.language = language;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
}
