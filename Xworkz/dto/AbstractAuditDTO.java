package com.Xworkz.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class AbstractAuditDTO implements Serializable{

	private String createdBy;
	private LocalDateTime createdDate;
	private String updateBy;
	private LocalDateTime updateDate; 
	
}
