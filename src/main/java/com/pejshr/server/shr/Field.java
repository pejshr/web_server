package com.pejshr.server.shr;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// 밭
@Entity
public class Field {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private Integer userId;
	
	@Column
	private Integer spaceNumber;
	
	@Column 
	private Integer itemId;
	
	@Column
	private LocalDateTime startTime;
}
