package com.xworkz.hotel.Component;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.hotel.dto.MenuDto;

@Component
@RequestMapping("/")
public class Hotel {
	
	public Hotel() {
		System.out.println("Created :"+this.getClass().getSimpleName());
	}

	@PostMapping("/hotel")
	public String onHotel(Model model) {
		System.out.println("Creting Hotel name");
		model.addAttribute("hotel","Mahaveer Hotel");
		return "index.jsp";
	}
	
	@PostMapping("/menu")
	public String onMenu(Model model) {
		System.out.println("running on menu");
	MenuDto menu=new MenuDto();
	menu.setFoodname("Veg pullva");
	menu.setPrice(250.0);
	model.addAttribute("menu",menu);
	return "index.jsp";	
	}
	
}
