package com.Xworkz.boot;

import com.Xworkz.dto.SoldierDTO;
import com.Xworkz.repository.SoldierRepo;
import com.Xworkz.repository.SoldierRepoImpl;
import com.Xworkz.service.soldierServiceImp;

public class SoldierRunner {

	public static void main(String[] args) {
		
		SoldierDTO dto=new SoldierDTO("ramu", "J&K", 1, "5th", "Xworkz", "india");
		SoldierDTO dto2=new SoldierDTO("raju", "Panjab", 2, "6th", "Xworkz2", "india");
		soldierServiceImp service=new soldierServiceImp();
		SoldierRepo repo=new SoldierRepoImpl();
		repo.save(dto);
		service.ValidateAndSave(dto);
		
		SoldierRepo repo2=new SoldierRepoImpl();
		repo.save(dto2);
		service.ValidateAndSave(dto2);
		
	}
}
