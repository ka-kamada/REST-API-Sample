package com.example.bean;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class User {

	private String id;
	private String name;
	private LocalDate birthdate;
	private boolean deleted;
	private LocalDateTime createdAt;
	private String createdBy;
	private LocalDateTime updatedAt;
	private String updatedBy;
	private LocalDateTime deletedAt;
	private String deletedBy;

}
