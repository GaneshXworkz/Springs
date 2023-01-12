package com.xworkz.Maven.SpringsClass4.Configration;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.Maven.SpringsClass4")
public class ConfigrationClass4 {

	public ConfigrationClass4() {
		System.out.println("Created NewsPaperConfigration.....");
	}

	@Bean
	public String newsPaperId() {
		System.out.println("Registering newsPaperId ....");
		//NewsPaper news=new NewsPaper();
		return "1234";
	}
	
	@Bean
	public String newsPaperName() {
		System.out.println("Registering newsPaperId ....");
		//NewsPaper news=new NewsPaper();
		return "INDIAN EXPRESS";
	}
	
	
	@Bean
	public String newsPaperOwner() {
		System.out.println("Registering newsPaperId ....");
		//NewsPaper news=new NewsPaper();
		return "Ramu";
	}
	
	@Bean
	public String newsPaperLanguage() {
		System.out.println("Registering newsPaperId ....");
		//NewsPaper news=new NewsPaper();
		return "English";
	}
	
	@Bean
	public int newsPaperPrize() {
		System.out.println("Registering newsPaperId ....");
		//NewsPaper news=new NewsPaper();
		return 5;
	}

	
	//*************************************************************************
	
	@Bean
	public String enginName() {
		System.out.println("Registering enginName ....");		
		return "UXE";
	}
	
	@Bean
	public String enginType() {
		System.out.println("Registering enginType ....");		
		return "two strok engin";
	}

	@Bean
	public int enginnumber() {
		System.out.println("Registering enginnumber ....");		
		return 4568;
	}
	
	@Bean
	public String enginVersion() {
		System.out.println("Registering enginVersion ....");		
		return "8th";
	}
	
	@Bean
	public String enginCompany() {
		System.out.println("Registering enginCompany ....");		
		return "Mahendra";
	}

	@Bean
	public String enginStorks() {
		System.out.println("Registering enginStorks ....");		
		return "4 Strokes";
	}

//*************************************************************************	
	@Bean
	public String SneakName() {
		System.out.println("Registering SneakName ....");		
		return "Resual Swaiper";
	}
	
	@Bean
	public int SneakLength() {
		System.out.println("Registering SneakLength ....");		
		return 10;
	}

	@Bean
	public String SneakColour() {
		System.out.println("Registering SneakColour ....");		
		return "Green";
	}
	
	@Bean
	public String SneakType() {
		System.out.println("Registering SneakType ....");		
		return "forest Type";
	}
	
	@Bean
	public boolean SneakPoisonies() {
		System.out.println("Registering SneakPoisonies ....");		
		return true;
	}
//*********************************************************************

	
	@Bean
	public String gostName() {
		System.out.println("Registering gostName ....");		
		return "raju ";
	}
	
	@Bean
	public String gostGender() {
		System.out.println("Registering gostGender ....");		
		return "male";
	}

	@Bean
	public LocalDate gostDeathDate() {
		System.out.println("Registering gostDeathDate ....");		
		return LocalDate.of(2000, 12, 17);
	}
	
	@Bean
	public LocalTime gostDeathTime() {
		System.out.println("Registering gostDeathTime ....");		
		return LocalTime.of(12, 30) ;
	}
	
	@Bean
	public String gostDeathReason() {
		System.out.println("Registering gostDeathReason ....");		
		return "Harth Attak";
	}
	
	
	@Bean
	public int gostnailsLength() {
		System.out.println("Registering SneakName ....");		
		return 5;
	}
	
	@Bean
	public String gostColour() {
		System.out.println("Registering gostColour ....");		
		return "red";
	}

	@Bean
	public String gostDethPlace() {
		System.out.println("Registering gostDethPlace ....");		
		return " home";
	}
	
	@Bean
	public String gostCremation() {
		System.out.println("Registering gostCremation ....");		
		return "Harichandra Gaught";
	}
	
	@Bean
	public int gostAge() {
		System.out.println("Registering gostAge ....");		
		return 70;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
