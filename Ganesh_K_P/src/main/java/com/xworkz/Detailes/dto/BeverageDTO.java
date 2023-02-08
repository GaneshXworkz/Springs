package com.xworkz.Detailes.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class BeverageDTO {

	private String name;
	private int price;
	private LocalDate manfacturedate;
	private LocalDate expireDate;
	private String madeBy;
 
}
