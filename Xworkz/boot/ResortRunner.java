package com.Xworkz.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Xworkz.configration.SoldierConfigration;
import com.Xworkz.dto.ResortDTO;
import com.Xworkz.service.ResortService;

public class ResortRunner {
	
	public static void main(String[] args) {
		
		
		ApplicationContext container=new AnnotationConfigApplicationContext(SoldierConfigration.class);
		
		ResortService ref=container.getBean(ResortService.class);
		
		ResortDTO resort=new ResortDTO();
		
		ref.validateAndSave(resort);
		
		
		System.out.println("-----------------------------------");
		
		
		
		
		
		
		
		
		
		
		
	}

}
