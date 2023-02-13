package com.xworkz.Egg.Component;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.Egg.EggService.CmService;
import com.xworkz.Egg.dto.CmDto;

@Component
@RequestMapping("/cm")
public class CmController {
	
	@Autowired
	CmService cmservice;

	public CmController() {
		System.out.println("created :"+this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String onCm(CmDto cmdto,Model model) {
		System.out.println("running oncm"+cmdto);
		
	Set<ConstraintViolation<CmDto>> contraintviolation=	this.cmservice.validteAndSave(cmdto);
	if(!contraintviolation.isEmpty()) {
		System.out.println("validation failed ,display erroe message");
		contraintviolation.forEach((cv)->System.err.println(cv.getMessage()));
	}else {
		System.out.println("validation success ,display sucess message");
	}
	
	return "cm.jsp";
	}
}
