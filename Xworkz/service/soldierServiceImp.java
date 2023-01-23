package com.Xworkz.service;



import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.Xworkz.dto.SoldierDTO;

public class soldierServiceImp implements SoldierService{

	
	
	@Override
	public boolean ValidateAndSave(SoldierDTO dto) { 
		
	ValidatorFactory factory =Validation.buildDefaultValidatorFactory();
	 Validator validator = factory.getValidator();
	 Set<ConstraintViolation<Object>> violations = validator.validate(dto);
	 
	 if(!violations.isEmpty()) 
	 {
		 System.err.println("there are validation erros...");
		 
		 violations.forEach(v->System.out.println("violating massage"+v.getMessage()));
		 
			 
		 
		 return false;
		 }
	 else 
	 {
			 System.out.println("Data is valid...");
			 return true;
		 }
	 }

	
	

	 
	 
	 
	
	
}
