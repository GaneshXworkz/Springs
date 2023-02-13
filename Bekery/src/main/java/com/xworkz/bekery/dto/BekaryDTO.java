package com.xworkz.bekery.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="bekary_table")
public class BekaryDTO {
	
	@Column(name ="c_id")
	@Id
	private int id;
	@Column(name="c_name")
	private String name;
	@Column(name="c_ownerName")
	private String ownerName;
	@Column(name="c_ownerMarried")
	private boolean ownerMarried;
	@Column(name="c_famousFor")
	private String famousFor;
	@Column(name="c_since")
	private String since;
	
}
