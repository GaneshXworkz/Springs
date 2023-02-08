package com.xworkz.Detailes.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.Detailes.dto.BeverageDTO;
import com.xworkz.Detailes.dto.Education;
import com.xworkz.Detailes.dto.FamilyDto;
import com.xworkz.Detailes.dto.MobilDto;

@Component
@RequestMapping("/")
public class DetailesComponent {

	public DetailesComponent() {
		System.out.println("created :"+this.getClass().getSimpleName());
	}
	
	@PostMapping("/email")
	public String onEmail(Model model) {
		
		System.out.println("Running eamil");
		model.addAttribute("emails","ganeshkp1998@gmail.com");
		return "index.jsp";
	}
	
	@PostMapping("/mNumber")
	public String onMobileNumber(Model model) {
		System.out.println("Running onMobilNumber...");
		model.addAttribute("mobileNumber",8569712353L);
		return "index.jsp";
	}
	
	@PostMapping("/addhar")
	public String onAddhar(Model model) {
		System.out.println("Running onAddhar...");
		model.addAttribute("addhar",168561236579L);
		return "index.jsp";
	}
	
	@PostMapping("/age")
	public String onAge(Model model) {
		System.out.println("running onAge....");
		model.addAttribute("age",25);
		return "index.jsp";
		
	}
	
	@PostMapping("/dateOfBirth")
	public String onDateBirth(Model model) {
		System.out.println("Running onDateBirth...");
		model.addAttribute("dateofbirth",LocalDate.of(1998, 1, 15));
		return "index.jsp";
	}
	
	@PostMapping("/desiredSalary")
	public String onSalary(Model model) {
		System.out.println("running on Frindes....");
	model.addAttribute("salary","1 cr")	;
	return "index.jsp";
	}
	
	@PostMapping("/bestFriend")
	public String onBestFriend(Model model) {
		System.out.println("Running onBestFriend....");
		ArrayList<String> fri=new ArrayList<String>();
		fri.add("Mani");
		fri.add("vishak");
		fri.add("raju");
		fri.add("vinay");
		fri.add("gavi");
		fri.add("Shashi");
		fri.add("prashant");
		fri.add("Sandesh");
		fri.add("varun");
		fri.add("sumanth");
		model.addAttribute("Frinds",fri);
		return "index.jsp";
	}
	
	@PostMapping("/vistedPlace")
	public String onVistedPlace(Model model) {
		System.out.println("Creating Visted palce");
		List<String> list= new ArrayList<String>();
		list.add("Mysore");
		list.add("najangudu");
		list.add("MM hills");
		list.add("Br hills");
		list.add("X-workz");
		list.add("rajajinagara");
		list.add("Iskon temple");
		list.add("mejastic");
		list.add("Kuvempu metro station");
		list.add("davanagere");
		model.addAttribute("MostVistedPlace",list);
		return "index.jsp";
		
	}
	
	@PostMapping("/skillSet")
	public String onSkillSet(Model model) {
		System.out.println("creating Skill set..");
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("sql");
		list.add("web");
		list.add("java script");
		list.add("springs");
		list.add("html");
		list.add("css");
		list.add("bootstrap");
		list.add("Spring web Mvc");
		list.add("Auto cad");
		 model.addAttribute("Skillset",list);
		 return "index.jsp";
	}
	
	
	
	@PostMapping("/eduction")
	public String onEducation(Model model) {
		System.out.println("creating running education....");
		
		Education dto=new Education();
		dto.setAges(25);
		dto.setBranch("branch");
		dto.setCollegeName("GEC chamarajanagra");
		dto.setFee(15000);
		dto.setName("gansesh");
		dto.setNoSubject(45);
		dto.setUsnNo("4GE19cv408");
		dto.setYearOfPassing(2022);
		model.addAttribute("edu", dto);
		
		return "index.jsp";
		
	}
	
	@PostMapping("/family")	
	public String onFamily(Model model) {
		System.out.println("Creating Running family");
		
		FamilyDto fam=new FamilyDto();
		fam.setAddress("Davanagere");
		fam.setFathename("Parvathappa");
		fam.setMobilNo(814772043L);
		fam.setMothername("Manjaula");
		fam.setSiblingname1("Akasha");
		fam.setSiblingname2("Adarsh");
		fam.setSiblingname3("mohan");
		fam.setSistername("Triveni");	
		model.addAttribute("fam", fam);

		
		return "index.jsp";
		
		
	}
	
	@PostMapping("/mobile")
	public String onMobile(Model model) {
		System.out.println("creating unning mobilDto");
		
		MobilDto mob=new MobilDto();
		mob.setBrandName("Vivo");
		mob.setCemarapxile("10px");
		mob.setPrize(5000);
		mob.setRam("8GB");
		mob.setRom("145GB");
		model.addAttribute("mob", mob);	
		return  "index.jsp";
	}
	
	@PostMapping("/bevarege")
	public String onBevarege(Model model) {
		System.out.println("creating running on bevarage");
		
		BeverageDTO bev=new BeverageDTO();
		bev.setExpireDate(LocalDate.of(2023, 12, 5));
		bev.setMadeBy("Curde");
		bev.setManfacturedate(LocalDate.of(2022, 1, 15));
		bev.setName("Lussy");
		bev.setPrice(25);
		model.addAttribute("bev", bev);	
		return "index.jsp";

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
