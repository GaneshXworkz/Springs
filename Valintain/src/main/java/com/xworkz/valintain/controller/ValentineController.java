package com.xworkz.valintain.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.valintain.Service.valintainService;
import com.xworkz.valintain.dto.valintineDTO;

@Controller
@RequestMapping("/")
public class ValentineController {
	
	
	
	@Autowired
	private valintainService valentineService;

	private List<String> places = Arrays.asList("cubbonPark", "bakery", "btm", "raj", "rr", "basavngudi");
	private List<String> gifts = Arrays.asList("Teddy", "Chocolate", "watch", "dress");

	public ValentineController() {
		
		System.out.println("created ....3" + this.getClass().getSimpleName());
	}

	@GetMapping("/valintine")
	public String onValentine(Model model) {
		System.out.println("running onValentine get method");
		model.addAttribute("places", places);
		model.addAttribute("gifts", gifts);
	
		return "valintine";
	}

	@PostMapping("/valintine")
	public String onValentine(valintineDTO dto,Model model )
	{
		
		System.out.println("running onValentine post method" + dto);
		
		Set<ConstraintViolation<valintineDTO>> violations = valentineService.validateAndSave(dto);
	
		if (violations.isEmpty()) {
			
			System.out.println("no violation in controller go to success page");
			
			return "success";
		}else {
		
		model.addAttribute("places", places);
		model.addAttribute("gifts", gifts);
		model.addAttribute("error", violations);
		model.addAttribute("valintineDTO", dto);
		System.err.println("violation is controller");
		return "valintine";
		}
	}
	
	@GetMapping("/searchbyId")
	public String getSearch(@RequestParam int id, Model model) {
		System.out.println("Running in get Search");
		valintineDTO vDto=this.valentineService.findById(id);
		if(vDto!=null) {
			model.addAttribute("dto",vDto);
			
		}else {
			model.addAttribute("message","do not found");
		}
		return "search";
		
	}
	

}