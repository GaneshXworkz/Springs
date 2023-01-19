package com.Xworkz.repository;

import org.springframework.stereotype.Component;

import com.Xworkz.dto.FirstAidDTO;

@Component
public class FirstAidRepoImpl implements FirstAidRepo {

	@Override
	public boolean save(FirstAidDTO Aiddto) {
	System.out.println("Creating Save In First Aid Repo");	
	System.out.println(Aiddto);
		return true;
	}

	
	
}
