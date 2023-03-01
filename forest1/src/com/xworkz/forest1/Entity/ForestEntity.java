package com.xworkz.forest1.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="forest_entity")
public class ForestEntity {

	@Id
	@Column(name="f_id")
	private int id;
	
	@Column(name="f_name")
	private String name;
	
	@Column(name="f_type")
	private String type;
	
	@Column(name="f_type")
	private String state;
	
	@Column(name="f_district")
	private String district;

	
	
	
	
}
