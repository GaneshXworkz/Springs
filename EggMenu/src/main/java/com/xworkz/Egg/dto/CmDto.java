package com.xworkz.Egg.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name="cm_table")
public class CmDto {

	
	@Column(name="cm_id")
	@Id
	private int id;
	
	
	@Column(name="cm_name")
	@Size(min=2, max=20, message ="Charcter must be more then 2 less then 20")
	@NotBlank
	private String name;
	
	@Column(name="cm_party")
	@NotBlank (message ="Please Select party")
	private String party;
	
	@Column(name="cm_state")
	@NotBlank (message ="Please Select state")
	private String state;
	
	@Column(name="cm_tenuer")
	@NotBlank ( message ="Please Select tenuer")
	private String tenuer;
	
}
