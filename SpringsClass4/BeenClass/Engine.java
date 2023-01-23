package com.xworkz.Maven.SpringsClass4.BeenClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Engine {

	private String name;
	private String type;

	@Autowired
	@Qualifier("enginnumber")
	private int number;

	@Autowired
	@Qualifier("enginVersion")
	private String version;
	private String company;
	private String strokes;

	@Autowired
	public Engine(@Qualifier("engineName") String name, @Qualifier("enginType") String type,
			@Qualifier("enginCompany") String company) {
		super();
		this.name = name;
		this.type = type;
		this.company = company;
	}

	public String getStrokes() {
		return strokes;
	}

	@Autowired
	@Qualifier("enginStorks")
	public void setStrokes(String strokes) {
		this.strokes = strokes;
	}

	@Override
	public String toString() {
		return "Engine [name=" + name + ", type=" + type + ", number=" + number + ", version=" + version + ", company="
				+ company + ", strokes=" + strokes + "]";
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public int getNumber() {
		return number;
	}

	public String getVersion() {
		return version;
	}

	public String getCompany() {
		return company;
	}

}
