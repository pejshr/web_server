package com.pejshr.server.shr;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// 레벨
@Entity
public class Level{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private Integer value;
	
	@Column
	private Integer exp;
	
	@Column(columnDefinition="TEXT")
	private String type;
}
