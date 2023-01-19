package com.Xworkz.repository;

import org.springframework.stereotype.Component;

import com.Xworkz.dto.MissileDTO;

@Component
public class MissileRepoImpl implements MissileRepo {

	@Override
	public boolean save(MissileDTO misDto) {
		System.out.println("Creating save in missileRepoImpl");
		System.out.println(misDto);
		return true;
	}

}
