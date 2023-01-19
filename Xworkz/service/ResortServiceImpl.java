package com.Xworkz.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Xworkz.dto.ResortDTO;
import com.Xworkz.repository.ResortRepo;

@Component
public class ResortServiceImpl implements ResortService {

	@Autowired
	private Validator validator;
	private ResortRepo resortRepo;
	
	@Autowired
	public ResortServiceImpl(ResortRepo resortRepo) 
	{
		this.resortRepo=resortRepo;
	}

	@Override
	public boolean validateAndSave(ResortDTO resDto)
	{
		System.out.println("Creating validateAndsave in ResortServiceImpl");
		
		System.out.println("Dto"+resDto);
		
		Set<ConstraintViolation<ResortDTO>> violation=validator.validate(resDto);
		
		if(!violation.isEmpty())
		{
			System.err.println("date is valid can save");
			
			violation.forEach(e->System.out.println(e.getMessage()));
			
			return false;
			
		}else 
		{
			
			System.out.println("Date is valid can save");
			
			boolean saved=this.resortRepo.save(resDto);
			
			System.out.println("saved resort"+saved);
			
			return saved;
			
		}
		
		
		
		
		
		
		
		
	}
	
	
	
}
