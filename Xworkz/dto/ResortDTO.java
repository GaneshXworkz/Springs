package com.Xworkz.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResortDTO extends AbstractAuditDTO {

	public ResortDTO() {
		System.out.println("Creating Resort DTO");
	}
}
