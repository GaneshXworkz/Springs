package com.xworkz.BigBasket.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.BigBasket.dto.BigBasketDTO;

public interface BigBasketService {

	Set<ConstraintViolation<BigBasketDTO>> validateAndSave(BigBasketDTO dto);
}
