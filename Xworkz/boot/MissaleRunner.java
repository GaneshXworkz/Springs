package com.Xworkz.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Xworkz.configration.SoldierConfigration;
import com.Xworkz.dto.MissileDTO;
import com.Xworkz.service.MissileService;

public class MissaleRunner {
	
	public static void main(String[] args) {
		
	ApplicationContext container= new AnnotationConfigApplicationContext(SoldierConfigration.class);	
	
	MissileService ref=container.getBean(MissileService.class);
	
	MissileDTO mdDto=new MissileDTO();
	
	ref.validateAndSave(mdDto);
	
	System.out.println("----------------------------");
	
	
	}

}
