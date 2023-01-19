package com.xworkz.Maven.SpringsClass3.Been;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Civil {

	@Autowired
	@Qualifier("CivilName")
	private String name;
	@Autowired
	@Qualifier("CivilGstNo")
	private String gstNo;
	@Autowired
	@Qualifier("CivilCost")
	private double cost;
	@Autowired
	@Qualifier("CivilSand")
	private String sand;
	@Autowired
	@Qualifier("CivilCement")
	private String cement;
	@Autowired
	@Qualifier("CivilLabours")
	private int labours;
	@Autowired
	@Qualifier("CivilSteel")
	private String steel;
	@Autowired
	@Qualifier("CivilGrade")
	private String grade;
	@Autowired
	@Qualifier("CivilDuration")
	private int duration;
	
	
	public Civil() {
		System.out.println("======Crating Constructor Of Civil====");
	}
	public Civil(String name, String gstNo, double cost, String sand, String cement, int labours, String steel,
			String grade, int duration) {
		super();
		this.name = name;
		this.gstNo = gstNo;
		this.cost = cost;
		this.sand = sand;
		this.cement = cement;
		this.labours = labours;
		this.steel = steel;
		this.grade = grade;
		this.duration = duration;
	}
	
	
	@Override
	public String toString() {
		return "Civil [name=" + name + ", gstNo=" + gstNo + ", cost=" + cost + ", sand=" + sand + ", cement=" + cement
				+ ", labours=" + labours + ", steel=" + steel + ", Grade=" + grade + ", duration=" + duration + "]";
	}
	

}
