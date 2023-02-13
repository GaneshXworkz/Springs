package com.xworkz.Egg.EggService;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.Egg.EggmenuRepo.EggMenuRepo;
import com.xworkz.Egg.dto.EggMenuDto;

@Service
public class EggServiceImpl implements EggService{

	@Autowired
	EggMenuRepo eggmenuRepo;
	
	@Override
	public boolean validteAndSave(EggMenuDto dto) {
		System.out.println("validte And Save");
		boolean saved=this.eggmenuRepo.save(dto);
		System.out.println("saved..."+saved);
		return false;
	}
	
	
	

}
