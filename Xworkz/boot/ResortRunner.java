package com.Xworkz.boot;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Xworkz.Eception.NameNotFountExcpection;
import com.Xworkz.configration.SoldierConfigration;
import com.Xworkz.dto.ResortDTO;
import com.Xworkz.repository.ResortRepo;
import com.Xworkz.repository.ResortRepoImpl;
import com.Xworkz.service.ResortService;


public class ResortRunner {
	
	public static void main(String[] args) {
		
		
		ApplicationContext container=new AnnotationConfigApplicationContext(SoldierConfigration.class);
		
		ResortService ref=container.getBean(ResortService.class);
		
		ResortDTO resort=new ResortDTO(1,"Resort","Banglore");
		ResortDTO resort1=new ResortDTO(2,"MysoreResort","Mysore");

		ResortRepo repo =new ResortRepoImpl();
		repo.save(resort1);
		repo.save(resort);
		
		try {
			repo.getNameById(9);
		} catch (NameNotFountExcpection e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ref.validateAndSave(resort);
		ref.validateAndSave(resort1);
		
		
		System.out.println("-----------------------------------");
		
		
		
		
		
		
		
		
		
		
		
	}

}
