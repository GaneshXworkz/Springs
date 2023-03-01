package com.xworkz.BigBasket.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.BigBasket.Repository.BigBasketRepo;
import com.xworkz.BigBasket.dto.BigBasketDTO;
import com.xworkz.BigBasket.Entity.EntityBigBasketDTO;

@Service
public class BigBasketServiceIMPL implements BigBasketService {

	@Autowired
	private BigBasketRepo basketRepo;

	public BigBasketServiceIMPL() {
		System.out.println("Creatd BigBasketServiceIMPL");
	}

	@Override
	public Set<ConstraintViolation<BigBasketDTO>> validateAndSave(BigBasketDTO dto) {
		System.out.println("Running ValidteAnd Save Method....");

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

		Validator validator = factory.getValidator();

		Set<ConstraintViolation<BigBasketDTO>> constraintViolations = validator.validate(dto);

		if (constraintViolations != null && !constraintViolations.isEmpty()) {

			System.out.println("Violation Excist, return vailotion" + dto);

			return constraintViolations;
		} else {
			System.out.println("violation does not exites,data is success...");

			EntityBigBasketDTO entityBigBasketDTO = new EntityBigBasketDTO();

			entityBigBasketDTO.setArea(dto.getArea());
			entityBigBasketDTO.setColour(dto.getColour());
			entityBigBasketDTO.setEmailId(dto.getItem());
			entityBigBasketDTO.setItem(dto.getItem());
			entityBigBasketDTO.setLandmark(dto.getLandmark());
			
			entityBigBasketDTO.setName(dto.getName());
			entityBigBasketDTO.setPassword(dto.getPassword());
			entityBigBasketDTO.setPhoneNo(dto.getPhoneNo());
			entityBigBasketDTO.setQuantity(dto.getQuantity());

			boolean saved = basketRepo.save(entityBigBasketDTO);
			System.out.println("Created save:" + saved);
			return Collections.emptySet();
		}

	}

}
