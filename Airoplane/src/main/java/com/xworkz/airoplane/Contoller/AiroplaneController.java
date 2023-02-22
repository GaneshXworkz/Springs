package com.xworkz.airoplane.Contoller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.airoplane.Service.AirService;
import com.xworkz.airoplane.dto.AiroplaneDto;

@Component
@RequestMapping("/")
public class AiroplaneController {

	@Autowired
	private AirService airService;
	
	public AiroplaneController() {
	System.out.println("Created :"+this.getClass().getSimpleName());
	}
	
	private List<String> type=Arrays.asList("JET","CargoAiroplane","MailtryPlan","DronePlane","SignalJamerPlan");
	private List<String> country=Arrays.asList("USA","RUSSIA","FINLAND","SRILANKA","GERMANY","CANADA");
	
	@GetMapping("/airAction")
	public String onAiroplane(Model model) {
		System.out.println("Running on valintine get method..");
		model.addAttribute("type",type);
		model.addAttribute("country",country);
		
		return "airoplane";
		
	}
	
	@PostMapping("/airAction")
	public String onAiroplane(AiroplaneDto dto,   Model model) {
	
		System.out.println("running on valintine post method"+dto);
		
		Set<ConstraintViolation<AiroplaneDto>> violations=airService.validateAndSave(dto);
		
		if(violations.isEmpty()) {
			System.out.println("no violation in controller go to success page");
			
			return "success";
			
		}else {
			model.addAttribute("type",type);
			model.addAttribute("country",country);
			model.addAttribute("erros",violations);
			model.addAttribute("AiroplaneDto", dto);
			System.err.println("violation is controller");
			return "airoplane";
		}
		
		
	}
	
	@GetMapping("/searchAction")
	public String getSearch(@RequestParam int id, Model model) {
		System.out.println("Running in get Search");
		AiroplaneDto vDto=this.airService.findBy(id);
		if(vDto!=null) {
			model.addAttribute("dto",vDto);
			
		}else {
			model.addAttribute("message","do not found");
		}
		return "feachById";
	}
	
	}
	
