package com.xworkz.Maven.SpringsClass3.Been;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pencil {
	
	@Autowired
	@Qualifier("PencilName")
	private String name;
	
	@Autowired
	@Qualifier("PencilType")
	private String type;
	
	@Autowired
	@Qualifier("PencilPrize")
	private int prize;
	
	@Autowired
	@Qualifier("Pencilcolour")
	private String colour;
	
	@Autowired
	@Qualifier("PencilShape")
	private String shape;
	
	@Autowired
	@Qualifier("PencilStolen")
	private boolean stolen;
	
	public Pencil() {
	System.out.println("======Creating Pencila Constructor In Pencil====");
	}

	public Pencil(String name, String type, int prize, String colour, String shape, boolean stolen) {
		super();
		this.name = name;
		this.type = type;
		this.prize = prize;
		this.colour = colour;
		this.shape = shape;
		this.stolen = stolen;
	}

	

	@Override
	public String toString() {
		return "Pencil [name=" + name + ", type=" + type + ", prize=" + prize + ", colour=" + colour + ", shape="
				+ shape + ", stolen=" + stolen + "]";
	}
	

}
