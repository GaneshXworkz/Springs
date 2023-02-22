package com.xworkz.airoplane.EntityDto;

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
@NoArgsConstructor
@ToString
@Entity
@Table(name="Airoplane_table")
public class AiroplaneEntityDto {

	@Column(name="c_id")
	@Id
    private int id;
	
	@Column(name="c_name")
	private String name;
	
	@Column(name="c_company")
	private String company;
	
	
	@Column(name="c_cost")
	private Long cost;
	
	
	@Column(name="c_type")
	private String type;
	
	
	@Column(name="c_country")
	private String country;
}
