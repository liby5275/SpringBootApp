package com.example.demo.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class H2TestDto {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String passportNumber;

}
