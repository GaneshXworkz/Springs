package com.xworkz.bekery.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.bekery.Repositary.BekeryRepoImp;
import com.xworkz.bekery.dto.BekaryDTO;

@Service
public class BekeryServiceImp implements BekeryService{

	@Autowired
	BekeryRepoImp bekeryRepoimp;
	
	
	@Override
	public boolean validteAndSave(BekaryDTO dto) {
		System.out.println("validte And Save");
		boolean saved=this.bekeryRepoimp.save(dto);
		System.out.println("saved..."+saved);
		return false;
	}

	
}
