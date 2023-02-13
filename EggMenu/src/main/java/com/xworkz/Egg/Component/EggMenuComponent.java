package com.xworkz.Egg.Component;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.Egg.EggService.EggService;
import com.xworkz.Egg.dto.EggMenuDto;

@Component
@RequestMapping("/egg")
public class EggMenuComponent {

	@Autowired
	EggService eggService;
	
	
	
	public EggMenuComponent() {
		System.out.println("Creating :"+this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String onMark( EggMenuDto dto,Model model) {
		System.out.println("Running.... OnMake");
		System.out.println(dto);
		model.addAttribute("egg",dto);
		System.out.println(dto.getPrice());
		System.out.println(this.eggService.validteAndSave(dto));
		return "success.jsp";
	}	
	
	
	
	
	
	
	
	
	
	
	}

