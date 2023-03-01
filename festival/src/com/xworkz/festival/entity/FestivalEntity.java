package com.xworkz.festival.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="festival_table")
@NoArgsConstructor

public class FestivalEntity {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="reagion")
	private String reagion;
	
	@Column(name="toatalDays")
	private int toatalDays;
	
	@Column(name="sweet")
	private String sweet;
	
	@Column(name="mainGod")
	private String mainGod;
	
	public FestivalEntity(String name, String reagion, int toatalDays, String sweet, String mainGod) {
		super();
		this.name = name;
		this.reagion = reagion;
		this.toatalDays = toatalDays;
		this.sweet = sweet;
		this.mainGod = mainGod;
	}

}
