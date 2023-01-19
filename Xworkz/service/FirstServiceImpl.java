package com.Xworkz.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Xworkz.dto.FirstAidDTO;
import com.Xworkz.repository.FirstAidRepo;

@Component
public class FirstServiceImpl implements  FirstAidService{

	@Autowired
	private Validator validator;
	private FirstAidRepo firstAidrepo;
	
	@Autowired
	public FirstServiceImpl(FirstAidRepo firstAidrepo)
	{
		this.firstAidrepo=firstAidrepo;
	}
	
	
	
	@Override
	public boolean validateAndSave(FirstAidDTO dto)
	{
		System.out.println("Running validation and Save");
		
		System.out.println("dto"+dto);
		
	Set<ConstraintViolation<FirstAidDTO>> violations=validator.validate(dto);
	
	if(!violations.isEmpty()) 
	{
		System.err.println("data is contaning validation error");
		
		violations.forEach(e->System.err.println(e.getMessage()));
		
		return false;
		
	}else
	{
		System.out.println("Data is valid can  save");
		
		boolean saved=this.firstAidrepo.save(dto);
		
		System.out.println("savedfirst Aid"+" "+saved);
		
		return saved;
	}
	
	
	}

}
