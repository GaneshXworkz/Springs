package com.Xworkz.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class SoldierDTO extends AbstractAuditDTO{
	
	@NonNull
	@NotBlank
	@Size(min=2,max=300)
	private String name;
	
	@NonNull
	@NotBlank
	@Size(min=2,max=200)
	private String location;
	
	@Min(value=0,message="id must be grater then Zero")
	@Max(100)
	private int id;
	
	@NonNull
	@NotBlank
	@Size(min=2,max=200)
	private String rank;
	
	@NonNull
	@NotBlank
	@Size(min=2,max=200)
	private String batallion;
	
	@NonNull
	@NotBlank
	@Size(min=2,max=200)
	private String country;
	
	

}
