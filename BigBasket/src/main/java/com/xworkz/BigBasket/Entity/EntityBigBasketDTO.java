package com.xworkz.BigBasket.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name="bigBasket_table")
public class EntityBigBasketDTO {

	
	@Column(name="c_id")
	@Id
    private int id;
	
	//1
	@Column(name="c_name")
	private String name;
	
	//2
	@Column(name="c_phoneNo")
	private Long phoneNo;
	
	//3
	@Column(name="c_emailId")
	private String emailId;
	
	//4
	@Column(name="c_password")
	private String password;
	
	//5
	@Column(name="c_area")
	private String area;
	
	//6
	@Column(name="c_landmark")
	private String landmark;
	
	//7
	@Column(name="c_item")
	private String item;
	
	//8
	@Column(name="c_colour")
	private String colour;
	
	//9
	@Column(name="c_quantity")
	private Integer quantity;
}
