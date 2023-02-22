package com.xworkz.airoplane.Service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.airoplane.EntityDto.AiroplaneEntityDto;
import com.xworkz.airoplane.Reposity.AirRepo;
import com.xworkz.airoplane.dto.AiroplaneDto;

@Service
public class AirServiceImpl implements AirService{

	@Autowired
	private AirRepo airRepo;
	
	public AirServiceImpl() {
		System.out.println("Created :"+this.getClass().getSimpleName());
	}
	
	
	@Override
	public Set<ConstraintViolation<AiroplaneDto>> validateAndSave(AiroplaneDto dto) {
	
		System.out.println("Runnnning >>> validateAndSave.....");
		
		ValidatorFactory validatorFactory=Validation.buildDefaultValidatorFactory();
		
		Validator validator=validatorFactory.getValidator();
		
		Set<ConstraintViolation<AiroplaneDto>> constraintViolations=validator.validate(dto);
		
		if(constraintViolations!=null && !constraintViolations.isEmpty()) {
			
			System.err.println("vaiolation Existes ,return violation"+dto);
			
			return constraintViolations;
		}
		else {
			System.out.println("violation does not existes ,data is success...");
			
			AiroplaneEntityDto airoplaneEntityDto=new AiroplaneEntityDto();
			airoplaneEntityDto.setCompany(dto.getCompany());
			airoplaneEntityDto.setCost(dto.getCost());
			airoplaneEntityDto.setCountry(dto.getCountry());
			airoplaneEntityDto.setName(dto.getName());
			airoplaneEntityDto.setType(dto.getType());
			
			boolean saved=airRepo.save(airoplaneEntityDto);
			
			System.out.println("created :"+saved);
			
			return Collections.emptySet();
		
		}
		
		
	}
	
	
	
	@Override
          public AiroplaneDto findBy(int id) {
		
		if(id>0) {
			AiroplaneEntityDto airoplaneEntityDto=this.airRepo.findById(id);
			if(airoplaneEntityDto!=null) {
				System.out.println("entity is found in service for id"+id);
				
				AiroplaneDto airoplaneDto=new AiroplaneDto();
				
				airoplaneDto.setCompany(airoplaneEntityDto.getCompany());
				airoplaneDto.setCost(airoplaneEntityDto.getCost());
				airoplaneDto.setCountry(airoplaneEntityDto.getCountry());
				airoplaneDto.setName(airoplaneEntityDto.getName());
				airoplaneDto.setType(airoplaneEntityDto.getType());
				return airoplaneDto;
			}
		}
		
		return AirService.super.findBy(id);
	}

}
