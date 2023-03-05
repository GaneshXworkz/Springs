package com.xworkz.bankReg.Controaller;

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

import com.xworkz.bankReg.dto.BankDto;
import com.xworkz.bankReg.service.BankService;

@Controller
@RequestMapping("/")
public class BankController {
    
	@Autowired
	private BankService bankService;

	private List<String> palce = Arrays.asList("BANGLORE", "DAVANAGERE", "MYSORE", "HAVERI", "CHAMARAJANAGARA","GADGA");
	private List<String> gender = Arrays.asList("MALE", "FEMALE", "OTHERS");

	public BankController() {
		System.out.println("Running Bank Controller......!");
	}

	@GetMapping("/bankAction")
	public String onBank(Model model) {

		System.out.println("Running on BankOn get method..");
		model.addAttribute("palce", palce);
		model.addAttribute("gender", gender);
		return "BankRegistration";
	}

	@PostMapping("/bankAction")
	public String onBank(BankDto dto, Model model) {

		System.out.println("Running Bank Post methos " + dto);

		Set<ConstraintViolation<BankDto>> violations = bankService.validateAndSave(dto);

		if (violations.isEmpty()) {
			System.out.println("No violation in controller go to success page...");

			return "success";
		} else {
			model.addAttribute("palce", palce);
			model.addAttribute("gender", gender);
			model.addAttribute("error", violations);// dought
			model.addAttribute("BankDto", dto);// dought
			System.err.println("violation is controller");

			return "BankRegistration";

		}

	}

	@GetMapping("/search")
	public String getSearch(@RequestParam int id, Model model) {
		System.out.println("Running in get Search");
		BankDto bankDto = this.bankService.findById(id);
		if (bankDto != null) {
			model.addAttribute("bankto", bankDto);

		} else {
			model.addAttribute("message", "Id not found");
		}
		return "findById";

	}

	@GetMapping("/serchByName")
	public String onSearchByName(@RequestParam String name, Model model) {

		System.out.println("Running Search By name");
		List<BankDto> list = this.bankService.findByName(name);

		if (list.size() > 0) {

			model.addAttribute("list", list);
		} else {
			System.out.println("creating");
			model.addAttribute("message", "Name not Found");

		}

		return "findSerchByName";

	}

	@GetMapping("/updated")
	public String onUpdate(@RequestParam int id, Model model) {
		BankDto dto = this.bankService.findById(id);
		System.out.println("running on update" + id);
		model.addAttribute("dto", dto);
		model.addAttribute("palce", palce);
		model.addAttribute("gender", gender);

		return "update";
	}

	@PostMapping("/updated")
	public String onUpdate(BankDto dto, Model model) {
		System.out.println("running on update" + dto);
		Set<ConstraintViolation<BankDto>> constraintViolations = this.bankService.validateAndUpdate(dto);

		if (constraintViolations.size() > 0) {
			model.addAttribute("errors", constraintViolations);

		} else {
			model.addAttribute("message", "bank Update success..");
			System.out.println("update sucessfully");
		}
		return "update";
	}
	
	
	
	@GetMapping("/delete")
	public String delete(@RequestParam int id,Model model) {
		
		System.out.println("On Delete Running");
		System.out.println("DELETED" +id);
		boolean dto=bankService.onDelete(id);
		model.addAttribute("delete",dto);
		model.addAttribute("messages","Data Deleted Successfully");
		 
		return "findSerchByName";
						
	}

}
