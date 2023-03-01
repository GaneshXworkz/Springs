package com.xworkz.BigBasket.Controller;

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

import com.xworkz.BigBasket.dto.BigBasketDTO;
import com.xworkz.BigBasket.service.BigBasketService;

@Controller
@RequestMapping("/display")
public class BigBasketController {

	@Autowired
	private BigBasketService basketService;

	public BigBasketController() {
		System.out.println("Created..." + this.getClass().getSimpleName());
	}

	private List<String> item = Arrays.asList("I-PHONE", "TAB", "FURFUME", "FACEWASH", "HANDWASH");
	private List<String> area = Arrays.asList("RAJAJINAGRA", "J.P NAGARA", "MEJASTIC", "DASARAHALLI");

	@GetMapping
	public String onBigBasket(Model model) {
		System.out.println("creating Model....");
		model.addAttribute("area", area);
		model.addAttribute("item", item);
		return "bigbasket";
	}

	@PostMapping
	public String onBigBasket(BigBasketDTO dto, Model model) {
		System.out.println("Running on Valintine post method" + dto);

		Set<ConstraintViolation<BigBasketDTO>> violation = basketService.validateAndSave(dto);

		if (violation.isEmpty()) {
			System.out.println("no avilolation in controller go to success page");
			return "success";
		} else {
			model.addAttribute("area", area);
			model.addAttribute("item", item);
			model.addAttribute("error", violation);
			model.addAttribute("BigBasketDTO", dto);
			System.err.println("violation is Controller");
			return "bigbasket";

		}
	}

}
