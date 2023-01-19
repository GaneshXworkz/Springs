package com.Xworkz.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MissileDTO extends AbstractAuditDTO {

	public MissileDTO() {
		System.out.println("Creating Missile With no arg Constructor");
	}
	
}
