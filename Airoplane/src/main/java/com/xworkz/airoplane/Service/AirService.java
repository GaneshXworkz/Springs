package com.xworkz.airoplane.Service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.airoplane.dto.AiroplaneDto;

public interface AirService {
	
	public Set<ConstraintViolation<AiroplaneDto>> validateAndSave(AiroplaneDto dto);
	
	default AiroplaneDto findBy(int id) {
		
		return null;
	}
	
	

}
