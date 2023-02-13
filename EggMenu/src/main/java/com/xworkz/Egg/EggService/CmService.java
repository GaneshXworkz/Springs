package com.xworkz.Egg.EggService;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.Egg.dto.CmDto;

public interface CmService {

	Set<ConstraintViolation<CmDto>> validteAndSave(CmDto dto); 
}
