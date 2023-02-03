package com.xworkz.ganesha.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.ganesha.DTO.InterviewDTO;

@Component
@RequestMapping("/interview")
public class Interview {

	public Interview() {
	System.out.println("created.."+this.getClass().getName());
}

	@PostMapping
	public String onSend(InterviewDTO dto) {
		System.out.println("Interview Deatailes");
		System.out.println("Details "+dto);	
		return "";
	} 

}
