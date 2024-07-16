package com.pejshr.server.shr;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// 편의성
@Entity
public class Upgrade {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(columnDefinition="TEXT")
	private String descText;
	
	@Column
	private Integer unlockLevel;
	
	@Column
	private Integer type;
}
