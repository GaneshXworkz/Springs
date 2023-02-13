package com.xworkz.bekery.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bekery.Service.BekeryServiceImp;
import com.xworkz.bekery.dto.BekaryDTO;

@Controller
@RequestMapping("/bekery")
public class BekaryComponent {

	@Autowired
	BekeryServiceImp bekeryImpl;
	
	public BekaryComponent() {
		System.out.println("Created :"+this.getClass().getSimpleName());
 	}
	
	@PostMapping
	public String onMark(BekaryDTO dto,Model model) {
		System.out.println("Running.... OnMake");
		System.out.println(dto);
		model.addAttribute("bakery",dto);
		System.out.println(dto.getName());
		System.out.println(this.bekeryImpl.validteAndSave(dto));
		return "success.jsp";
	}	
}
