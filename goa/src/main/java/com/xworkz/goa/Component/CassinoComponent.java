package com.xworkz.goa.Component;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.goa.dto.CassinoDTO;

@Component
@RequestMapping("/goa")
public class CassinoComponent {

	public CassinoComponent() {
		System.out.println("Creating :"+this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String toSend(CassinoDTO dto ,Model model) {
		System.out.println("Creating To send");
	     System.out.println(dto);
		model.addAttribute("name", dto.getName());
		model.addAttribute("prize",dto.getPrize());
		return "cassinoSucess.jsp";
		
	}
}
