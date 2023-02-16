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
@Entity
@Table(name="valintaine_table")
public class ValintineEntityDto {
   
	@Column(name="c_id")
	@Id
	private int id;
	
	@Column(name="c_name")
	//@Size(min=3, max=20,message="name cannot be less than 3 or greater than 20 char")
	private String name;
	
	@Column(name="c_valentineName")
	//@Size(min=3, max=20,message="valentineName cannot be less than 3 or greater than 20 char")
	private String valentineName;
	
	@Column(name="c_places")
	//@NotBlank(message="place should be slected")
	private String places;
	
	@Column(name="c_gifts")
	//@NotBlank(message="gift should be slected")
	private String gifts;
	
}
