package com.Xworkz.boot;

import com.Xworkz.dto.SoldierDTO;
import com.Xworkz.repository.SoldierRepo;
import com.Xworkz.repository.SoldierRepoImpl;
import com.Xworkz.service.soldierServiceImp;

public class SoldierRunner {

	public static void main(String[] args) {
		
		SoldierDTO dto=new SoldierDTO("ramu", "J&K", 0, "5th", "Xworkz", "india");
		
		soldierServiceImp service=new soldierServiceImp();
		SoldierRepo repo=new SoldierRepoImpl();
		service.setSoldierRepo(repo);
		service.ValidateAndSave(dto);
		
	}
}
