package com.xworkz.Maven.SpringsClass3.Been;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Rubber {
	
	@Autowired
	@Qualifier("RubberlName")
	private String name;
	
	@Autowired
	@Qualifier("RubberType")
	private String type;
	
	@Autowired
	@Qualifier("RubberPrize")
	private int  prize;
	
	@Autowired
	@Qualifier("RubberShape")
	private String Shape;
	
	@Autowired
	@Qualifier("RubberStolen")
	private boolean Stolen;
	
	@Autowired
	@Qualifier("RubberSize")
	private String size;
	
	public Rubber() {
		System.out.println("=====Creating Constructor of Rubber====== ");
		
	}

	public Rubber(String name, String type, int prize, String shape, boolean stolen, String size) {
		super();
		this.name = name;
		this.type = type;
		this.prize = prize;
		Shape = shape;
		Stolen = stolen;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public int getPrize() {
		return prize;
	}

	public String getShape() {
		return Shape;
	}

	public boolean isStolen() {
		return Stolen;
	}

	public String getSize() {
		return size;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setPrize(int prize) {
		this.prize = prize;
	}

	public void setShape(String shape) {
		Shape = shape;
	}

	public void setStolen(boolean stolen) {
		Stolen = stolen;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Rubber [name=" + name + ", type=" + type + ", prize=" + prize + ", Shape=" + Shape + ", Stolen="
				+ Stolen + ", size=" + size + "]";
	}
}
