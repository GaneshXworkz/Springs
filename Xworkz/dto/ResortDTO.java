package com.Xworkz.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class ResortDTO extends AbstractAuditDTO {

	public ResortDTO() {
		System.out.println("Creating Resort DTO");
	}
	
	@Min(value=0,message="id must be grater then Zero")
	@Max(100)
	private int id;
	
	@NonNull
	@NotBlank
	@Size(min=2,max=200)
	private String ResortName;
	
	@NonNull
	@NotBlank
	@Size(min=2,max=200)
	private String Address;
}
