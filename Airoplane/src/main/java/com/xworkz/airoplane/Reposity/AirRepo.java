package com.xworkz.airoplane.Reposity;

import com.xworkz.airoplane.EntityDto.AiroplaneEntityDto;

public interface AirRepo {

	public boolean save(AiroplaneEntityDto entity);
	
	default AiroplaneEntityDto findById(int id) {
		return null;
	}
}
