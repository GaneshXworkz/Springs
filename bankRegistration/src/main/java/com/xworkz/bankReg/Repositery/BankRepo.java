package com.xworkz.bankReg.Repositery;

import java.util.Collections;
import java.util.List;

import com.mysql.cj.xdevapi.Collection;
import com.xworkz.bankReg.EntityDto.EntityDto;

public interface BankRepo {

	 boolean save(EntityDto entity);
	
	
	default EntityDto findById(int id) { 
		return null; 
		}
	
	  default List<EntityDto> findByName(String name) {
		 return Collections.emptyList();
	 }
	  
     boolean update(EntityDto entity);
	
     default boolean onDelete(int id) {
		
		return false;
		
	}


	default List<EntityDto> findtableAllDetailes() {
		return Collections.emptyList();
	}
     
   
    	 
	/*
	 * default List<EntityDto> findtableAllDetailes(){
	 * 
	 * return Collections.emptyList();
	 * 
	 * }
	 */
     
	
}
