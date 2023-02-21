package com.xworkz.valintain.Service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.valintain.Repository.ValintineRepo;
import com.xworkz.valintain.dto.valintineDTO;
import com.xworkz.valintain.dto.Entity.ValintineEntityDto;
@Service
public class valintaineServiceImpl implements valintainService {
	
	@Autowired
	public	ValintineRepo valintineRepo;
	
	public valintaineServiceImpl() {
		
		System.out.println("craeted...5 " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<valintineDTO>> validateAndSave(valintineDTO dto) {
		
		System.out.println("running validate and save");
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		
		Validator validator = factory.getValidator();
		
		Set<ConstraintViolation<valintineDTO>> constraintViolations = validator.validate(dto);
		
		if (constraintViolations != null && !constraintViolations.isEmpty())
		{
			System.err.println("Vaiolataion Excist, return Vaiolation" + dto);
			
			return constraintViolations;
			
		}
		else
		{
			System.out.println("Vaiolation does not excist , Data is Successs...");
			
			ValintineEntityDto valintineEntityDto =new ValintineEntityDto();
			valintineEntityDto.setName(dto.getName());;
			valintineEntityDto.setValentineName(dto.getValentineName());;
			valintineEntityDto.setGifts(dto.getGifts());;
			valintineEntityDto.setPlaces(dto.getPlaces());;
			
			boolean saved=valintineRepo.save(valintineEntityDto);
			System.out.println("Created save:"+saved);
			
			return Collections.emptySet();
		}

	}
	
	
	
	@Override
	public valintineDTO findById(int id) {
		if(id>0) {
			ValintineEntityDto valintineEntityDto=this.valintineRepo.findById(id);
			if(valintineEntityDto!=null) {
				System.out.println("entity is found in service for id"+id);
			   valintineDTO vDto=new valintineDTO();
			   vDto.setGifts(valintineEntityDto.getGifts());
			   vDto.setName(valintineEntityDto.getName());
			   vDto.setPlaces(valintineEntityDto.getPlaces());
			   vDto.setValentineName(valintineEntityDto.getValentineName());
			   vDto.setId(valintineEntityDto.getId());
			   return vDto;
			}
		}
		
		return valintainService.super.findById(id);
	}

	

}