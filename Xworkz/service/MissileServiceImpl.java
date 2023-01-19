package com.Xworkz.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Xworkz.dto.MissileDTO;
import com.Xworkz.repository.MissileRepo;

@Component
public class MissileServiceImpl implements MissileService{

	@Autowired
	private Validator validator;
	private MissileRepo missilerepo;
	
	@Autowired
	public MissileServiceImpl(MissileRepo missileRepo) {
		this.missilerepo=missileRepo;
	}

	@Override
	public boolean validateAndSave(MissileDTO misDto) {
		System.out.println("running validateAnd save in MissileServiceImpl");
		
		System.out.println("dto" +misDto);
		
		Set<ConstraintViolation<MissileDTO>> violations=validator.validate(misDto);
		
		if(!violations.isEmpty())
		{
			System.out.println("Data iscontaning validation error");
			
			violations.forEach(a->System.out.println(a.getMessage()));
			
			return false;
		}
		else 
		{
			System.out.println("Data is valid can save");
			
			boolean saved=this.missilerepo.save(misDto);
			
			System.out.println("saved"+saved);
			
			return true;
		}
		
	}
	
	
}
