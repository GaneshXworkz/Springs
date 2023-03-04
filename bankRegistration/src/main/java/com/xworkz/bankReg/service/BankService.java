package com.xworkz.bankReg.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.bankReg.dto.BankDto;

public interface BankService {

	public Set<ConstraintViolation<BankDto>> validateAndSave(BankDto dto);
	
	
	default BankDto findById(int id) {
		
		
		return null;
	}
	
	default List<BankDto> findByName(String name){
		
		return Collections.emptyList();
		
	}
	
	Set<ConstraintViolation<BankDto>> validateAndUpdate(BankDto dto);
	
	  default boolean onDelete(int id) {
			
			return false;
			
		}
	
}
