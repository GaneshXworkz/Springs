package com.xworkz.valintain.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class valintineDTO {

	
	private int id;
	
	
	@Size(min=3, max=20,message="name cannot be less than 3 or greater than 20 char")
	private String name;
	
	
	@Size(min=3, max=20,message="valentineName cannot be less than 3 or greater than 20 char")
	private String valentineName;
	
	
	@NotBlank(message="place should be slected")
	private String places;
	
	
	@NotBlank(message="gift should be slected")
	private String gifts;
}
