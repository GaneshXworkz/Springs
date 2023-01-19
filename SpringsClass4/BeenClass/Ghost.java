package com.xworkz.Maven.SpringsClass4.BeenClass;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Ghost {

		private String name;
	
	
	private String gender;
	
	
	private LocalDate dethDate;
	
	
	private LocalTime dethtime;
	
	
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
	
	
	

	@Autowired
	public Ghost(@Qualifier("gostName")
     String name,@Qualifier("gostGender") String gender, @Qualifier("gostDeathDate")LocalDate dethDate,@Qualifier("gostDeathTime") LocalTime dethtime, 
     @Qualifier("gostDeathReason")String reason) {
		super();
		this.name = name;
		this.gender = gender;
		this.dethDate = dethDate;
		this.dethtime = dethtime;
		this.reason = reason;
		
	}





	@Override
	public String toString() {
		return "Ghost [name=" + name + ", gender=" + gender + ", dethDate=" + dethDate + ", dethtime=" + dethtime
				+ ", reason=" + reason + ", nailsLength=" + nailsLength + ", colour=" + colour + ", dethPlace="
				+ dethPlace + ", creamationPlace=" + creamationPlace + ", age=" + age + "]";
	}





	public String getName() {
		return name;
	}





	public String getGender() {
		return gender;
	}





	public LocalDate getDethDate() {
		return dethDate;
	}





	public LocalTime getDethtime() {
		return dethtime;
	}





	public String getReason() {
		return reason;
	}





	public int getNailsLength() {
		return nailsLength;
	}





	public String getColour() {
		return colour;
	}





	public String getDethPlace() {
		return dethPlace;
	}





	public String getCreamationPlace() {
		return creamationPlace;
	}





	public int getAge() {
		return age;
	}





	
	
}
