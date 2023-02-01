package com.xworkz.SpringWeb.Component;

import org.springframework.stereotype.Component;

@Component
public class FiftyRupees {
	public FiftyRupees() {
		System.out.println("Create: "+this.getClass().getSimpleName());
	}
}
