package com.Xworkz.service;



import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.Xworkz.dto.SoldierDTO;
import com.Xworkz.repository.SoldierRepo;

import io.quarkus.hibernate.validator.runtime.jaxrs.QuarkusRestViolationExceptionMapper.ViolationReport.Violation;

public class soldierServiceImp implements SoldierService{

	@Override
	public boolean ValidateAndSave(SoldierDTO dto) { 
		
	ValidatorFactory factory =Validation.buildDefaultValidatorFactory();
	 Validator validator = factory.getValidator();
	 Set<ConstraintViolation<Object>> violations = validator.validate(dto);
	 
	 if(!Validation.isEmpty()) 
	 {
		 System.err.println("there are validation erros...");
		 
		 violation.forEach(v->
		 {
			 System.err.println("violating massage"+v.getmessage());
		 });
		 return false;
		 }
	 else 
	 {
			 System.out.println("Date is valid...");
			 boolean saved=soldierRepo.save(dto);
			 System.out.println(" dto saved using repo"+saved);
			 return saved;
		 }
	 }}
	

	 
	 
	 
	
	
}
