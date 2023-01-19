package com.Xworkz.repository;

import org.springframework.stereotype.Component;

import com.Xworkz.dto.ResortDTO;

@Component
public class ResortRepoImpl implements ResortRepo{

	@Override
	public boolean save(ResortDTO resDto) {
		System.out.println("Creating Save ResortRepoImpl...");
		System.out.println(resDto);
		return true;
	}

	
	
}
