package com.xworkz.Maven.SpringsClass4.BeenClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Engine {


	@Autowired
	@Qualifier("enginName")
	private String name;
	
	@Autowired
	@Qualifier("enginType")

	private String type;
	
	@Autowired
	@Qualifier("enginnumber")

	private int number;
	
	@Autowired
	@Qualifier("enginVersion")

	private String version;
	
	@Autowired
	@Qualifier("enginCompany")

	private String company;
	
	@Autowired
	@Qualifier("enginStorks")

	private String strokes;
	
	
	
	
	public Engine(@Qualifier("enginName")String name,@Qualifier("enginType") String type, int number, String version,@Qualifier("enginCompany") String company, String strokes) {
		super();
		this.name = name;
		this.type = type;
		this.number = number;
		this.version = version;
		this.company = company;
		this.strokes = strokes;
	}



	


	@Override
	public String toString() {
		return "Engine [name=" + name + ", type=" + type + ", number=" + number + ", version=" + version + ", company="
				+ company + ", strokes=" + strokes + "]";
	}
}
