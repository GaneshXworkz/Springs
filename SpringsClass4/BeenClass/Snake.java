package com.xworkz.Maven.SpringsClass4.BeenClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Snake {

	@Autowired
	@Qualifier("SneakName")
	private String name;
	
	@Autowired
	@Qualifier("SneakLength")
	private int length;
	
	@Autowired
	@Qualifier("SneakColour")
	private String colour;
	@Autowired
	@Qualifier("SneakType")
	private String type;
	
	@Autowired
	@Qualifier("SneakPoisonies")
	private boolean poisionous;
	
	
	
	


	public Snake(@Qualifier("SneakName")String name, int length, String colour, @Qualifier("SneakType")String type,@Qualifier("SneakPoisonies") boolean poisionous) {
		super();
		this.name = name;
		this.length = length;
		this.colour = colour;
		this.type = type;
		this.poisionous = poisionous;
	}






	@Override
	public String toString() {
		return "Snake [name=" + name + ", length=" + length + ", colour=" + colour + ", type=" + type + ", poisionous="
				+ poisionous + "]";
	}
}
