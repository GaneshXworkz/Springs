package com.Xworkz.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;


@Data
@AllArgsConstructor
public class FirstAidDTO extends AbstractAuditDTO{

	

	@Min(value=0,message="id must be grater then Zero")
	@Max(100)
	private int id;
	
	@NonNull
	@NotBlank
	@Size(min=2,max=200)
	private String CountryName;
	
	@NonNull
	@NotBlank
	@Size(min=2,max=200)
	private String companyName;
	
	
	
	
	
	
	
}
