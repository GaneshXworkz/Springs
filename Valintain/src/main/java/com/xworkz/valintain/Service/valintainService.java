package com.xworkz.valintain.Service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.stereotype.Service;

import com.xworkz.valintain.dto.valintineDTO;


public interface valintainService {

	Set<ConstraintViolation<valintineDTO>> validateAndSave(valintineDTO dto);
	
	
	}

