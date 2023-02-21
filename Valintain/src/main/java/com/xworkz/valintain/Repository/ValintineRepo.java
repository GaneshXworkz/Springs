package com.xworkz.valintain.Repository;

import com.xworkz.valintain.dto.Entity.ValintineEntityDto;

public interface ValintineRepo {

	
	
	
	public boolean save(ValintineEntityDto dto);

	default ValintineEntityDto findById(int id) {
		
		return null;
	}
	
	
}
