package com.xworkz.bankReg.EntityDto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import io.smallrye.common.constraint.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name="bank_table")
@NamedQuery(name="findByName", query="select entity from EntityDto entity where entity.name=:nam")
@NamedQuery(name="findall",query = "select ent from EntityDto ent")
@NamedQuery(name="searchByNameAndPlace", 
query = "select ent from EntityDto ent where ent.name=:nam or ent.palce=:plc")
public class EntityDto {

	
	@Id
	@Column(name="c_id")
	private int id;
	
	@Column(name="c_name")
	private String name;
	
	@Column(name="C_contectNo")
	private Long contectNo;
	
	@Column(name="C_place")
	private String palce;
	
	@Column(name="C_gender")
	private String gender;
	
	@Column(name="C_address")
	private String address;
	
	@Column(name="C_panNO")
	private String panNo;
	
}
