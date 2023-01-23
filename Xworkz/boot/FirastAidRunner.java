package com.Xworkz.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Xworkz.Eception.ArraySizeException;
import com.Xworkz.configration.SoldierConfigration;
import com.Xworkz.dto.FirstAidDTO;
import com.Xworkz.service.FirstAidService;

public class FirastAidRunner {

	public static void main(String[] args) {
		 
		ApplicationContext container= new AnnotationConfigApplicationContext(SoldierConfigration.class);
		
		FirstAidService ref=container.getBean(FirstAidService.class);
		
		FirstAidDTO aidDto=new FirstAidDTO(1,"India","Apollo");
		FirstAidDTO aidDto1=new FirstAidDTO(2,"India","Apollo");
		FirstAidDTO aidDto2=new FirstAidDTO(3,"India","Apollo");
		FirstAidDTO aidDto3=new FirstAidDTO(4,"India","Apollo");
		try {
			ref.validateAndSave(aidDto);
			ref.validateAndSave(aidDto1);
			ref.validateAndSave(aidDto2);
			ref.validateAndSave(aidDto3);
		} catch (ArraySizeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("--------------------------");
	}
}
