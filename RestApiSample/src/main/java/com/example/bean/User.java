package com.example.bean;

import java.time.LocalDate;
import java.time.LocalDateTime;

import de.huxhorn.sulky.ulid.ULID;
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


	public User userNew(String name, LocalDate birthdate, String createdBy) {

		ULID ulid = new ULID();

		this.id = ulid.nextULID();

		this.name = name;
		this.birthdate = birthdate;
		this.createdBy = createdBy;
		this.updatedBy = createdBy;

		LocalDateTime now = LocalDateTime.now();
		this.createdAt = now;
		this.updatedAt = now;


		return new User();


	}

}


