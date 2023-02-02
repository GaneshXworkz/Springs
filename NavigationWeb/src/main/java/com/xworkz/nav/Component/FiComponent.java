package com.xworkz.nav.Component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/send")
public class FiComponent {

	public FiComponent() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	
	@PostMapping
	public String onSend(@RequestParam String name,@RequestParam String type,
			@RequestParam int qantity,@RequestParam double prize) {
		System.out.println("running On send post");
		System.out.println("name :"+name);
		System.out.println("type :"+type);
		System.out.println("Quantity "+qantity);
		System.out.println("prize :"+prize);
		return "Fooditem.jsp";
		
	}
}
