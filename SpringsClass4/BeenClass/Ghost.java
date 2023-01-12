package com.xworkz.Maven.SpringsClass4.BeenClass;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Ghost {

	@Autowired
	@Qualifier("gostName")
	private String name;
	
	@Autowired
	@Qualifier("gostGender")
	private String gender;
	
	@Autowired
	@Qualifier("gostDeathDate")
	private LocalDate dethDate;
	
	@Autowired
	@Qualifier("gostDeathTime")
	private LocalTime dethtime;
	
	@Autowired
	@Qualifier("gostDeathReason")
	private String reason;
	
	@Autowired
	@Qualifier("gostnailsLength")
	private int nailsLength;
	
	@Autowired
	@Qualifier("gostColour")
	private String colour;
	
	@Autowired
	@Qualifier("gostDethPlace")
	private String dethPlace;
	
	@Autowired
	@Qualifier("gostCremation")
	private String creamationPlace;
	
	@Autowired
	@Qualifier("gostAge")
	private int age;
	
	
	


	public Ghost(@Qualifier("gostName")
     String name,@Qualifier("gostGender") String gender, @Qualifier("gostDeathDate")LocalDate dethDate,@Qualifier("gostDeathTime") LocalTime dethtime, @Qualifier("gostDeathReason")String reason, int nailsLength,
			String colour, String dethPlace, String creamationPlace, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.dethDate = dethDate;
		this.dethtime = dethtime;
		this.reason = reason;
		this.nailsLength = nailsLength;
		this.colour = colour;
		this.dethPlace = dethPlace;
		this.creamationPlace = creamationPlace;
		this.age = age;
	}





	@Override
	public String toString() {
		return "Ghost [name=" + name + ", gender=" + gender + ", dethDate=" + dethDate + ", dethtime=" + dethtime
				+ ", reason=" + reason + ", nailsLength=" + nailsLength + ", colour=" + colour + ", dethPlace="
				+ dethPlace + ", creamationPlace=" + creamationPlace + ", age=" + age + "]";
	}
	
}
