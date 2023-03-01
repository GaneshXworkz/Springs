package com.xworkz.BigBasket.dto;

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
public class BigBasketDTO {

	
	private int id;
	
	@NotBlank
	@Size(min=3,max=20,message = "charcter must be min 3 and max 20")
	private String name;
	
	@NotBlank(message = "Please Enter The PhoneNumber")
	private Long phoneNo;
	
	@NotBlank(message = "Please Enter The emailId")
	private String emailId;
	
	@NotBlank
	@Size(min=0,max=8, message ="Please Select Password")
	private String password;
	
	@NotBlank(message = "Please Enter The area")
	private String area;
	
	
	@NotBlank(message = "Please Enter The item")
	private String item;
	
	@NotBlank(message = "Please Enter The landmark")
	private String landmark;
	
	@NotBlank(message = "Please Enter The colour")
	private String colour;
	
	@NotBlank(message = "Please Enter The quantity")
	private Integer quantity;
	
	
	
}
