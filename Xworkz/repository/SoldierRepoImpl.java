package com.Xworkz.repository;

import com.Xworkz.dto.SoldierDTO;

public class SoldierRepoImpl implements SoldierRepo {

	private SoldierRepo soldierRepo;
	
	public SoldierRepoImpl() {
		System.out.println("Creating SoldierRepoImpl Using No-arg Cons.....");
	}
	
	
	public void setSoldierRepo(SoldierRepo soldierRepo) {
		this.soldierRepo=soldierRepo;
		
	}
	 @Override
	 public boolean save(SoldierDTO dto) {
		 System.out.println("Running save");
		 System.out.println("Dto"+dto);
		 return false;
	 }
	
}
