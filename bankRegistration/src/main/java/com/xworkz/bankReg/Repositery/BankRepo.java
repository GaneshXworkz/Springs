package com.xworkz.bankReg.Repositery;

import java.util.Collections;
import java.util.List;

import com.xworkz.bankReg.EntityDto.EntityDto;

public interface BankRepo {

	public boolean save(EntityDto entity);
	
	
	default EntityDto findById(int id) { 
		return null; 
		}
	  default List<EntityDto> findByName(String name) {
		 return Collections.emptyList();
	 }
	
}
