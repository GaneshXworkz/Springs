package com.xworkz.Maven.SpringsClass3.Been;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoftWare {

	@Autowired
	@Qualifier("SoftWareName")

	private String name;
	
	@Autowired
	@Qualifier("SoftWareVersion")

	private String varsion;
	
	@Autowired
	@Qualifier("SoftWareDeveloper")

	private String developer;
	
	@Autowired
	@Qualifier("SoftWareData")

	private String date;
	
	@Autowired
	@Qualifier("SoftWarefree")

	private boolean free;
	
	public SoftWare() {
		System.out.println("===Creating Constructor softWare=== ");
	}

	public SoftWare(String name, String varsion, String developer, String date, boolean free) {
		super();
		this.name = name;
		this.varsion = varsion;
		this.developer = developer;
		this.date = date;
		this.free = free;
	}

	

	@Override
	public String toString() {
		return "SoftWare [name=" + name + ", varsion=" + varsion + ", developer=" + developer + ", date=" + date
				+ ", free=" + free + "]";
	}
	
	
	
}
