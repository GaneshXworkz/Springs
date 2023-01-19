package com.Xworkz.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Xworkz.configration.SoldierConfigration;
import com.Xworkz.dto.FirstAidDTO;
import com.Xworkz.service.FirstAidService;

public class FirastAidRunner {

	public static void main(String[] args) {
		 
		ApplicationContext container= new AnnotationConfigApplicationContext(SoldierConfigration.class);
		
		FirstAidService ref=container.getBean(FirstAidService.class);
		
		FirstAidDTO aidDto=new FirstAidDTO();
		
		ref.validateAndSave(aidDto);
		
		System.out.println("------------------------");
	}
}
