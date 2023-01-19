package com.xworkz.Maven.SpringsClass4.BeenClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Snake {

	private String name;

	@Autowired
	@Qualifier("SneakLength")
	private int length;

	@Autowired
	@Qualifier("SneakColour")
	private String colour;

	private String type;
	private boolean poisionous;

	@Autowired
	public Snake(@Qualifier("SneakName") String name, @Qualifier("SneakType") String type,
			@Qualifier("SneakPoisonies") boolean poisionous) {
		super();
		this.name = name;

		this.type = type;
		this.poisionous = poisionous;
	}

	@Override
	public String toString() {
		return "Snake [name=" + name + ", length=" + length + ", colour=" + colour + ", type=" + type + ", poisionous="
				+ poisionous + "]";
	}

	public String getName() {
		return name;
	}

	public int getLength() {
		return length;
	}

	public String getColour() {
		return colour;
	}

	public String getType() {
		return type;
	}

	public boolean isPoisionous() {
		return poisionous;
	}

}
