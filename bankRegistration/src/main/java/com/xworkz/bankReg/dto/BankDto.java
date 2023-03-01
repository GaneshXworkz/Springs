package com.xworkz.bankReg.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import io.smallrye.common.constraint.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class BankDto {

	private int id;
	
	@Size(min=4, max=20,message="Charcater must be min=4 max=20 ")
	private String name;
	
	@NotNull
	private Long contectNo;
	
	@NotBlank(message = "please select place")
	private String palce;
	
	@NotBlank(message = "please select gender")
	private String gender;
	
	@NotBlank(message = "please select address")
	private String address;
	
	@NotBlank(message = "Please select PanNo")
	private String panNo;
	
	
}
