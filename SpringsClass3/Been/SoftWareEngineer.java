package com.xworkz.Maven.SpringsClass3.Been;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoftWareEngineer {
	@Autowired
	@Qualifier("SoftWareEngineerName")
	private String name;
	@Autowired
	@Qualifier("SoftWareEngineerSalaray")
	private double salaray;
	@Autowired
	@Qualifier("SoftWareEngineerDeveloper")
	private String developer;
	@Autowired
	@Qualifier("SoftWareEngineerData")
	private String data;
	@Autowired
	@Qualifier("SoftWareEngineerFree")
	
	private boolean free;
	
	public SoftWareEngineer() {
		System.out.println("====Software Constructor is Created===");
	}

	public SoftWareEngineer(String name, double salaray, String developer, String data, boolean free) {
		super();
		this.name = name;
		this.salaray = salaray;
		this.developer = developer;
		this.data = data;
		this.free = free;
	}

	

	@Override
	public String toString() {
		return "SoftWareEngineer [name=" + name + ", salaray=" + salaray + ", developer=" + developer + ", data=" + data
				+ ", free=" + free + "]";
	}
	
}
