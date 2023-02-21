package com.xworkz.valintain.dto.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@NoArgsConstructor
@Entity
@Table(name="valintaine_table")
public class ValintineEntityDto {
	
	
   
	@Column(name="c_id")
	@Id
	private int id;
	
	@Column(name="c_name")
	private String name;
	
	@Column(name="c_valentineName")
	private String valentineName;
	
	@Column(name="c_places")
	private String places;
	
	@Column(name="c_gifts")
	private String gifts;
	
}
