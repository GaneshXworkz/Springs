package com.xworkz.Egg.EggService;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.stereotype.Service;

import com.xworkz.Egg.dto.CmDto;
@Service
public class CmserviceImpl implements CmService {

	
	
	@Override
	public Set<ConstraintViolation<CmDto>> validteAndSave(CmDto dto)
	{
		System.out.println("Running ");
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
		Set<ConstraintViolation<CmDto>> constrainviolation=validator.validate(dto);
		
		if(constrainviolation!=null&&!constrainviolation.isEmpty()) 
		{
			
			System.err.println("constrainvoilation exites,return constrainViolation");
			constrainviolation.forEach((cv)->System.err.println(cv.getMessage()));
			return constrainviolation;
		} 
		else
		{
		System.out.println("constrainvoilation dosent exites,data is good");
			return Collections.emptySet();
		}
		
	}

}
