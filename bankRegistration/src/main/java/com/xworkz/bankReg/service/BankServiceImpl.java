package com.xworkz.bankReg.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.bankReg.EntityDto.EntityDto;
import com.xworkz.bankReg.Repositery.BankRepo;
import com.xworkz.bankReg.dto.BankDto;

@Service
public class BankServiceImpl implements BankService{

	@Autowired
	private BankRepo bankRepo;
	
	public BankServiceImpl() {
		System.out.println("Created :"+this.getClass().getSimpleName());
		}
	
	
	@Override
	public Set<ConstraintViolation<BankDto>> validateAndSave(BankDto dto) {
		
		System.out.println("Creating Validate And save......!");
		
	ValidatorFactory validatorFactory=Validation.buildDefaultValidatorFactory();
	
	Validator validator=validatorFactory.getValidator();
	
	Set<ConstraintViolation<BankDto>> constraintViolations=validator.validate(dto);
	
	if(constraintViolations!=null &&!constraintViolations.isEmpty()) {
		
		System.err.println("vaiolation Exites ,return violation"+dto);
		
		return constraintViolations;
	}
	else
	{
		System.out.println("violation does not existes,data is success... ");
		
		EntityDto entityDto=new EntityDto();
		
		BeanUtils.copyProperties(dto, entityDto);
		/*
		 * entityDto.setId(dto.getId()); entityDto.setName(dto.getName());
		 * entityDto.setPalce(dto.getPalce());
		 * entityDto.setContectNo(dto.getContectNo());
		 * entityDto.setGender(dto.getGender()); entityDto.setAddress(dto.getAddress());
		 * entityDto.setPanNo(dto.getPanNo());
		 */
		
		boolean saved=bankRepo.save(entityDto);
		
		System.out.println("Created :"+saved);
		
		return Collections.emptySet();
	}
		
		
  }
	
	@Override
	public BankDto findById(int id) {
		
		if(id>0) {
			
		   EntityDto entityDto=this.bankRepo.findById(id);
		   
		   if(entityDto!=null) {
			   
			   System.out.println("entity is found in service for id"+id);
			  
			   BankDto bankDto=new BankDto();
			   BeanUtils.copyProperties(entityDto, bankDto);
				/*
				 * bankDto.setId(entityDto.getId()); bankDto.setAddress(entityDto.getAddress());
				 * bankDto.setContectNo(entityDto.getContectNo());
				 * bankDto.setGender(entityDto.getGender());
				 * bankDto.setName(entityDto.getName()); bankDto.setPalce(entityDto.getPalce());
				 * bankDto.setPanNo(entityDto.getPanNo());
				 */
			   return bankDto;
		   }
		}
		
		return BankService.super.findById(id);
	}
	
	
	
	@Override
	public List<BankDto> findByName(String name) {
		System.out.println("Running find by Name......service  "+name);
		if(name!=null && !name.isEmpty()) {
			
			System.out.println("name is valid calling repo.....");
			
			List<EntityDto> listEntity= this.bankRepo.findByName(name);
			
		     List<BankDto> dto=new ArrayList<BankDto>();
		     
		   for (EntityDto entity : listEntity) {
			   
			   BankDto bankDto=new BankDto();
			   
			   BeanUtils.copyProperties(entity, bankDto);
				/*
				 * bankDto.setId(entity.getId()); bankDto.setName(entity.getName());
				 * bankDto.setAddress(entity.getAddress());
				 * bankDto.setContectNo(entity.getContectNo());
				 * bankDto.setGender(entity.getGender()); bankDto.setPalce(entity.getPalce());
				 * bankDto.setPanNo(entity.getPanNo());
				 */
			   dto.add(bankDto);
			
		}
		System.out.println("Size of bankDto"+dto.size());	
		System.out.println("Size of bankDto"+listEntity.size());
		
		return dto;
	
		}else {
			System.out.println("name is invalid.....");
		}
		
		return Collections.emptyList();
		
		
		
	}


	@Override
	public Set<ConstraintViolation<BankDto>> validateAndUpdate(BankDto dto) {
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
		Set<ConstraintViolation<BankDto>> violations=validator.validate(dto);
		
		if(violations!=null && !violations.isEmpty()) {
			System.err.println("Violation In DTO"+dto);
			return violations;
		}else {
			System.out.println("violation are not there in dto andcan save date");
			EntityDto entityDto=new EntityDto();
			
			BeanUtils.copyProperties(dto, entityDto);
			/*
			 * entityDto.setId(dto.getId()); entityDto.setAddress(dto.getAddress());
			 * entityDto.setContectNo(dto.getContectNo());
			 * entityDto.setGender(dto.getGender()); entityDto.setName(dto.getName());
			 * entityDto.setPalce(dto.getPalce()); entityDto.setPanNo(dto.getPanNo());
			 */
			boolean saved=this.bankRepo.update(entityDto);
			System.out.println("entity data is saved"+saved);
			return Collections.emptySet();
		}
		
	}
	
	
	@Override
	public boolean onDelete(int id) {
		 
		boolean deleted=bankRepo.onDelete(id);
		return deleted;
	}

}
