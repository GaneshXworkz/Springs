package com.xworkz.valintain.Service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.valintain.dto.valintineDTO;


public interface valintainService {

	public Set<ConstraintViolation<valintineDTO>> validateAndSave(valintineDTO dto);
	
	default valintineDTO findById(int id) {
		return null;
	}
		
		
	
		
		
	}

